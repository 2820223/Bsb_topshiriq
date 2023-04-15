package uz.itschool.plants

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.itschool.plants.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .add(R.id.main, SecondSplashFragment())
            .addToBackStack("secondSplash")
            .commit()
    }
}