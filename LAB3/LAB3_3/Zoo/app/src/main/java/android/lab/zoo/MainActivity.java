package android.lab.zoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.media.MediaPlayer;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.view.Menu;
import android.view.MenuInflater;


public class MainActivity extends AppCompatActivity {

    ImageView interactiveIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected( MenuItem item ) {
        switch (item.getItemId()) {

            case R.id.mammals:
                ((ImageView)findViewById(R.id.image1)).setImageResource(R.drawable.bear);
                interactiveIMG = (ImageView)findViewById(R.id.image1);
                final MediaPlayer mediaBear = MediaPlayer.create(
                        this,
                        R.raw.bear);
                interactiveIMG.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaBear.start();
                    }
                });

                ((ImageView)findViewById(R.id.image2)).setImageResource(R.drawable.wolf);
                interactiveIMG = (ImageView)findViewById(R.id.image2);
                final MediaPlayer mediaWolf = MediaPlayer.create(
                        this,
                        R.raw.wolf);
                interactiveIMG.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaWolf.start();
                    }
                });

                ((ImageView)findViewById(R.id.image3)).setImageResource(R.drawable.elephant);
                interactiveIMG = (ImageView)findViewById(R.id.image3);
                final MediaPlayer mediaElephant = MediaPlayer.create(
                        this,
                        R.raw.elephant);
                interactiveIMG.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaElephant.start();
                    }
                });

                ((ImageView)findViewById(R.id.image4)).setImageResource(R.drawable.lamb);
                interactiveIMG = (ImageView)findViewById(R.id.image4);
                final MediaPlayer mediaLamb = MediaPlayer.create(
                        this,
                        R.raw.lamb);
                interactiveIMG.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaLamb.start();
                    }
                });
                return true;

            case R.id.birds:
                ((ImageView)findViewById(R.id.image1)).setImageResource(R.drawable.huuhkaja);
                interactiveIMG = (ImageView)findViewById(R.id.image1);
                final MediaPlayer mediaHuuhkaja = MediaPlayer.create(
                        this,
                        R.raw.huuhkaja_norther_eagle_owl);
                interactiveIMG.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaHuuhkaja.start();
                    }
                });

                ((ImageView)findViewById(R.id.image2)).setImageResource(R.drawable.peippo);
                interactiveIMG = (ImageView)findViewById(R.id.image2);
                final MediaPlayer mediaPeippo = MediaPlayer.create(
                        this,
                        R.raw.peippo_chaffinch);
                interactiveIMG.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaPeippo.start();
                    }
                });

                ((ImageView)findViewById(R.id.image3)).setImageResource(R.drawable.peukaloinen);
                interactiveIMG = (ImageView)findViewById(R.id.image3);
                final MediaPlayer mediaPeukaloinen = MediaPlayer.create(
                        this,
                        R.raw.peukaloinen_wren);
                interactiveIMG.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaPeukaloinen.start();
                    }
                });

                ((ImageView)findViewById(R.id.image4)).setImageResource(R.drawable.punatulkku);
                interactiveIMG = (ImageView)findViewById(R.id.image4);
                final MediaPlayer mediaPunatulkku = MediaPlayer.create(
                        this,
                        R.raw.punatulkku_northern_bullfinch);
                interactiveIMG.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mediaPunatulkku.start();
                    }
                });
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

}

