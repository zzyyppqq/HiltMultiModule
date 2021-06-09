package com.zyp.app.demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.zyp.analytics.internal.ui.AnalyticsActivity
import com.zyp.app.demo.databinding.ActivityMainBinding
import com.zyp.login.api.loginApiService
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnUser.setOnClickListener {
//            startActivity(Intent(this, LoginActivity::class.java))
            loginApiService(applicationContext).startLoginActivity(this)
        }
        binding.btnNews.setOnClickListener {
            startActivity(Intent(this, AnalyticsActivity::class.java))
        }


    }
}