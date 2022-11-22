package com.cyopn.conectates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView wb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        wb = (WebView) findViewById(R.id.activity_main_webview);
        WebSettings ws=wb.getSettings();
        ws.setJavaScriptEnabled(true);

        if (!WebStatus.checkStatus(this)) {
            wb.loadUrl("file:///android_asset/error.html");
        } else {
            wb.setWebViewClient(new WebViewClient());
            wb.clearCache(true);
            wb.loadUrl("https://cyopn.github.io/ConectaTES-Test1/");
        }
    }

    @Override
    public void onBackPressed(){
        if (wb.canGoBack()){
            wb.goBack();
        }else{
            super.onBackPressed();
        }
    }
}