package com.fabriciohsilva.caraoucoroa_android;

import android.app.Activity;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends Activity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        this.mViewHolder.Resultado = (ImageView) findViewById(R.id.Resultado);
        this.mViewHolder.Voltar    = (ImageView) findViewById(R.id.Voltar);

        Bundle extra = getIntent().getExtras();

        if (extra != null) {

            String opcao = extra.getString("opcao");

            if (opcao.equals("cara")) {
                this.mViewHolder.Resultado.setImageDrawable(
                        ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            } else {
                this.mViewHolder.Resultado.setImageDrawable(
                        ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }//end if (opcao.equals("cara"))

        }//end if (extra != null)

        this.mViewHolder.Voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }//end public void onClick(View v)
        });//end this.mViewHolder.Voltar.setOnClickListener

    }//end protected void onCreate(Bundle savedInstanceState)

    private static class ViewHolder {
        ImageView Resultado;
        ImageView Voltar;
    }//end private static class mviewHolder

}//end public class DetalheActivity extends Activity
