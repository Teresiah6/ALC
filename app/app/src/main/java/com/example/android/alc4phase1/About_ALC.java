package com.example.android.alc4phase1;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;




import java.util.Objects;

public class About_ALC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__alc);


            Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
            getSupportActionBar(). setElevation(0);
            getSupportActionBar().setHomeButtonEnabled(true);









        final ProgressBar progressBar= findViewById(R.id.progress_bar);
        WebView webView =  findViewById(R.id.web_view);
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

