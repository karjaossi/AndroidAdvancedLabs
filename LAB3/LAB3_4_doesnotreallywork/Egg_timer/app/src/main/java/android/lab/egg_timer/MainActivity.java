package android.lab.egg_timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.timerBTN).setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        int timeInput = Integer.valueOf(((EditText)findViewById(R.id.timerTXT)).getText().toString());
        Intent timerIntent = new Intent (this, TimerCountdownActivity.class);
        timerIntent.putExtra("NUMBER_OF_SECONDS", String.valueOf(timeInput));
        startActivity(timerIntent);

    }
}
