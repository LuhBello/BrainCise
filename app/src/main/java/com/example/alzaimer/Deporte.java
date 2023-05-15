package com.example.alzaimer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Deporte extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deporte);
        
        // Obtén la referencia al WebView desde el layout
        WebView webView = (android.webkit.WebView) findViewById(R.id.gif_deporte);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                // Una vez que la página se ha cargado, el archivo GIF se mostrará en el WebView
                super.onPageFinished(view, url);
            }
        });
    webView.getSettings().setJavaScriptEnabled(true);
        // Carga el archivo GIF desde la carpeta "assets" en el WebView
        webView.setInitialScale(80);
        webView.loadUrl(Elegir());

    }

    public static String Elegir(){
        String url;
        int randomInt = (int) (Math.random() * 6);
        if(randomInt==0) url="https://todofitness21.com/wp-content/uploads/2020/05/GIF-17.gif";
        else if (randomInt==1) url="https://th.bing.com/th/id/R.24a3d6538801d37190f1739584372fba?rik=wneEc%2fqKVsDgGw&riu=http%3a%2f%2fejerciciosencasa.es%2fwp-content%2fuploads%2f2017%2f03%2f71f5a310-eb85-4ea5-aea6-7a6e0fe9b9e3.gif&ehk=zABQr%2b8%2f06oAJs3Ghid1ZcklJmqMHEKgdGC34OBqMy0%3d&risl=&pid=ImgRaw&r=0";
        else if (randomInt==2) url="https://th.bing.com/th/id/R.15fc6929fe9efa9c3275fae09f321945?rik=beCGwm9kPntEaQ&riu=http%3a%2f%2fromontina.r.o.pic.centerblog.net%2f997ef4ed.gif&ehk=B2nvNXRHemgeDXAJ9Q4qTm0sLjKevatCKPUCtYqxMts%3d&risl=&pid=ImgRaw&r=0";
        else if (randomInt==3) url="https://www.euroresidentes.com/hogar/consejos-trucos-remedios/wp-content/uploads/sites/2/2020/03/ejercicios-hacer-en-casa-principiantes.gif";
        else if (randomInt==4) url="https://1.bp.blogspot.com/-Th8v5CQoUPU/XbBpnYislDI/AAAAAAAD5YU/4vMcT1GD00Qu87APOx1Zr0J_nUWhHJBTgCLcBGAsYHQ/s640/ezgif-com-video-to-gif-1540922545.gif";
        else url="https://th.bing.com/th/id/R.74f622a35c343439bf05700afc2291cf?rik=ytDgrR63t%2bfOAA&riu=http%3a%2f%2fwww.entrenar.me%2fblog%2fwp-content%2fuploads%2f2014%2f05%2festiramiento-piernas.gif&ehk=MgW8G%2bTESL3YRnUHHd7V66zHWzWqrktbxLIG4L4J1Pc%3d&risl=&pid=ImgRaw&r=0";

        return url;
    }

    public void IrMenu(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}