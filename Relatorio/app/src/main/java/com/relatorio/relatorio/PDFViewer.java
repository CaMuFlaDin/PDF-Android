package com.relatorio.relatorio;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFViewer extends AppCompatActivity {

    PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer);

        pdfView = findViewById(R.id.pdf);   //Buscando no arquivo XML pela ID

        pdfView.fromAsset("ebook.pdf")  //Buscando o PDF da pasta "Assetx"
                .defaultPage(0) //Definir qual página vai iniciar
                .enableSwipe(true)  //Liberar o deslize no PDF
                .load();    //Carregar PDF
    }

    public void Download(View v){
        String URL = "https://seocursos.com.br/Ebooks/Livros/5a1cb86ebee8d.pdf";    //Definir URL do PDF para Download
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));  //Abre o navegador na URL definida para efetuar o Download
        startActivity(i);
    }
}
