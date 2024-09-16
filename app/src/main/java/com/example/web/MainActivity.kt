package com.example.web

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView : WebView = findViewById(R.id.webView)
        webView.loadUrl("https://www.example.com")
    }

    fun getSearchUrl(query: String): String? {
        return ""
    }
}