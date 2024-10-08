package com.example.proyecto.ui.web

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.proyecto.R
import android.webkit.WebView
import android.webkit.WebViewClient

class WebFragment : Fragment() {

    private lateinit var urlInput: EditText
    private lateinit var searchButton: Button
    private lateinit var webView: WebView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_web, container, false)

        urlInput = view.findViewById(R.id.url_input)
        searchButton = view.findViewById(R.id.search_button)
        webView = view.findViewById(R.id.webview)

        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        searchButton.setOnClickListener {
            var urlText = urlInput.text.toString().trim()

            if (urlText.isNotEmpty()) {
                if (!urlText.startsWith("http://") && !urlText.startsWith("https://")) {
                    if (urlText.startsWith("www.")) {
                        urlText = "https://$urlText"
                    } else {
                        urlText = "http://$urlText"
                    }
                }

                webView.loadUrl(urlText)
            } else {
                Toast.makeText(requireContext(), "Por favor, ingresa un enlace válido", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}