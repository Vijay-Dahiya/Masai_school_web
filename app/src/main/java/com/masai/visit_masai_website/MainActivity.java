package com.masai.visit_masai_website;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private WebView masaiWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masaiWeb =findViewById(R.id.webView);
        masaiWeb.loadUrl("https://www.masaischool.com/");
    }
}