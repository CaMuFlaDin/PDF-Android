package com.relatorio.relatorio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PDFViewer(View v){
        Intent irTela = new Intent(MainActivity.this, PDFViewer.class);
        startActivity(irTela);
    }
    public void WebView(View v){
        Intent irTela = new Intent(MainActivity.this, WebViewPDF.class);
        startActivity(irTela);
    }

}
