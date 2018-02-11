package com.fabriciohsilva.caraoucoroa_android;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends Activity {

    private ViewHolder mViewHolder = new ViewHolder();
    private String[] opcao = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.Jogar = (ImageView) findViewById(R.id.botaoJogar);

        this.mViewHolder.Jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gerar numero aleatório
                Random randomico = new Random();

                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtra("opcao", opcao[randomico.nextInt(2)]);
                startActivity(intent);

            }//end public void onClick
        });//end this.mViewHolder.Jogar.setOnClickListener

    }//end protected void onCreate(Bundle savedInstanceState)

    private static class ViewHolder {
        ImageView Jogar;
    }//end private static class mviewHolder

}//end public class MainActivity extends AppCompatActivity
