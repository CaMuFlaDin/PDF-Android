package com.relatorio.relatorio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Toast;

public class WebViewPDF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_pdf);

        carregarPDF();
    }

    public void carregarPDF() {
        try {
            WebView webview = findViewById(R.id.webview);
            webview.getSettings().setJavaScriptEnabled(true);
            String pdf = "https://seocursos.com.br/Ebooks/Livros/5a1cb86ebee8d.pdf";
            webview.loadUrl("http://drive.google.com/viewerng/viewer?embedded=true&url=" + pdf);
        }catch (NullPointerException e){
            Toast.makeText(this, "Erro ao carregar PDF!", Toast.LENGTH_SHORT).show();
        }



















    }
}
