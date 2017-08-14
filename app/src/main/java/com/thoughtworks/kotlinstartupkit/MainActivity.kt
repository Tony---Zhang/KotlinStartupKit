package com.thoughtworks.kotlinstartupkit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife

class MainActivity : AppCompatActivity() {

    @BindView(R.id.main_text) lateinit var mainText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

        mainText.setText(R.string.app_name)
    }
}
