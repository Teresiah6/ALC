package com.example.android.alc4phase1;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;



import org.w3c.dom.Text;

public class About_ALC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__alc);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        final ProgressBar progressBar= (ProgressBar) findViewById(R.id.progress_bar);
        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.getSettings();




        webView.setWebViewClient(new WebViewClient() {




            @Override
            public boolean shouldOverrideUrlLoading (WebView view,String url){
                view.loadUrl(url);
                return true;
            }
            @Override
            public void onReceivedSslError (WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();
            }
        });

        webView.setWebChromeClient(new WebChromeClient(){

            @Override
                    public void onProgressChanged(WebView view, int progress){
            progressBar.setProgress(progress);
            if(progress == 100){
                progressBar.setVisibility(View.INVISIBLE);
            }
            else {

                progressBar.setVisibility(View.VISIBLE);

            }
            }
            });



        webView.loadUrl("https://andela.com/alc/");
    }
}

