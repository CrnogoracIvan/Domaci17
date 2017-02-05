package com.example.ivancrnogorac.domacizadatak15.Aktivnosti;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ivancrnogorac.domacizadatak15.R;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import Provajderi_Liste.ProvajderJela;

/**
 * Created by Ivan Crnogorac on 2/5/2017.
 */

public class ThirdActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Each lifecycle method should call the method it overrides
        super.onCreate(savedInstanceState);
        // setContentView method draws UI
        setContentView(R.layout.third_activity);

        // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getBaseContext(), "Activity.onCreate()", Toast.LENGTH_SHORT);
        toast.show();


        final int position = getIntent().getIntExtra("position", 0);

        // Pronalazi sliku i ubacuje "imageDrawable" property
        ImageView ivImage = (ImageView) findViewById(R.id.iv_image);
        InputStream is = null;
        try {
            is = getAssets().open(ProvajderJela.getJeloById(position).getSlika());
            Drawable drawable = Drawable.createFromStream(is, null);
            ivImage.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Finds "tvName" TextView and sets "text" property
        TextView tvNaziv = (TextView) findViewById(R.id.naziv);
        tvNaziv.setText(ProvajderJela.getJeloById(position).getNaziv());

        // Finds "tvDescription" TextView and sets "text" property
        TextView tvOpis = (TextView) findViewById(R.id.opis);
        tvOpis.setText(ProvajderJela.getJeloById(position).getOpis());


        // Finds "spCategory" Spiner and sets "selection" property
        Spinner category = (Spinner) findViewById(R.id.kategorija);
        List<String> categories = ProvajderJela.getImenaJela();
        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, categories);
        category.setAdapter(adapter);
        category.setSelection((int)ProvajderJela.getJeloById(position).getKategorija().getId());


        // Finds "rbRating" RatingBar and sets "rating" property
        RatingBar rbRating = (RatingBar) findViewById(R.id.rb_rating);
        rbRating.setRating(ProvajderJela.getJeloById(position).getOcena());

        // Finds "btnBuy" Button and sets "onClickListener" listener
        Button btnBuy = (Button) findViewById(R.id.btn_kupi);
        btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(), "Kupio si " + ProvajderJela.getJeloById(position).getNaziv() + "!", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

}
