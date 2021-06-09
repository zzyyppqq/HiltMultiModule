package com.zyp.analytics.internal.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zyp.analytics.internal.databinding.AnalyticsActivityBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AnalyticsActivity : AppCompatActivity() {

    lateinit var binding: AnalyticsActivityBinding

    @Inject
    lateinit var set: Set<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = AnalyticsActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvContent.text = set.toString()
    }

}