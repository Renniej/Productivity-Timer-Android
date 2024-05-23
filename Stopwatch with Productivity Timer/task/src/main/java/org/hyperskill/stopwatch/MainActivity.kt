package org.hyperskill.stopwatch

import android.graphics.BlendModeColorFilter
import android.graphics.Color
import android.graphics.ColorFilter
import android.graphics.PorterDuff
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import org.hyperskill.stopwatch.databinding.ActivityMainBinding
import java.util.Random
import kotlin.concurrent.thread
import kotlin.time.DurationUnit
import kotlin.time.toDuration

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private val handler = Handler();
    private var timerActive = false;
    private var timerCount = 0;

    private val timer : Runnable = object : Runnable {
        override fun run() {

            timerActive = true;
            ++timerCount;

            val duration = timerCount.toDuration(DurationUnit.SECONDS)
            val minutes = duration.inWholeMinutes
            val seconds = duration.inWholeSeconds - (minutes * 60)
            val strDisplay = duration.toString()

            handler.post {
                binding.textView.text = String.format("%02d:%02d", minutes, seconds)
            }

            handler.postDelayed(this,1000)
        }
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)



        setContentView(binding.root)

        binding.progressBar.visibility = View.GONE;

        binding.startButton.setOnClickListener{
            if (!timerActive) {
                handler.postDelayed(timer,1000)
                binding.progressBar.visibility = View.VISIBLE

            }

        }

        binding.resetButton.setOnClickListener{
            resetTimer()
            binding.progressBar.visibility = View.GONE
        }


        thread(start = true) {
            val rnd: Random = Random()
            while (true) {
                binding.progressBar?.indeterminateDrawable?.setColorFilter(Color.RED,  PorterDuff.Mode.MULTIPLY)
                Thread.sleep(500)
                binding.progressBar?.indeterminateDrawable?.setColorFilter(Color.BLUE,  PorterDuff.Mode.MULTIPLY)

            }

        }

    }

    private fun resetTimer() {
        handler.removeCallbacks(timer)
        binding.textView.text="00:00"
        timerCount = 0;
        timerActive = false;

    }

    override fun onStop() {
        super.onStop()
        resetTimer()
    }
}