package com.example.animationshow

import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HeartbeatActivity : AppCompatActivity(), View.OnClickListener {
    private var startAnimationBtn: Button? = null

    private var stopAnimationBtn: Button? = null

    private var heartIv: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heartbeat)
        startAnimationBtn = findViewById(R.id.start_animation_btn)
        startAnimationBtn?.setOnClickListener(this)
        stopAnimationBtn = findViewById(R.id.stop_animation_btn)
        stopAnimationBtn?.setOnClickListener(this)
        heartIv = findViewById(R.id.heart_iv)
    }

    override fun onClick(p0: View?) {
        when (p0) {
            startAnimationBtn -> startHeartBeat()
            stopAnimationBtn -> stopHeartBeat()
        }
    }

    private fun startHeartBeat() {
        val animation = AnimationUtils.loadAnimation(this, R.anim.anim_heart_scale)
        heartIv?.startAnimation(animation)
    }

    private fun stopHeartBeat() {
        heartIv?.clearAnimation()
    }
}