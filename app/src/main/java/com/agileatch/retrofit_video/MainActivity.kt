package com.agileatch.retrofit_video

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.agileatch.retrofit_video.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { MainActivityBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initView()
    }

    private fun initView(){
        TODO("Not yet implemented")
    }
}