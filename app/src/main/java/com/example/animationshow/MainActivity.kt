package com.example.animationshow

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.heartbeat_btn).setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.heartbeat_btn ->
                startHeartbeatActivity()
        }
    }

    private fun startHeartbeatActivity() {
        val intent = Intent(this, HeartbeatActivity::class.java)
        startActivity(intent)
    }
}