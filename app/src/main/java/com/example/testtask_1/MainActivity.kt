package com.example.testtask_1

import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.visibility = View.INVISIBLE

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            webView.visibility = View.VISIBLE
            val url = "https://pin-up.ua/"
            webView.loadUrl(url)
            button.visibility = View.GONE
        }
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
    }
}