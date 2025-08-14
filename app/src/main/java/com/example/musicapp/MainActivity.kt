package com.example.musicapp

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        webView = findViewById(R.id.webView)

        // Enable JavaScript if needed
        webView.settings.javaScriptEnabled = true

        // Load website
        webView.loadUrl("https://melodies-app-frontend.vercel.app")

        // To keep navigation inside the WebView
        webView.webViewClient = WebViewClient()
    }
}