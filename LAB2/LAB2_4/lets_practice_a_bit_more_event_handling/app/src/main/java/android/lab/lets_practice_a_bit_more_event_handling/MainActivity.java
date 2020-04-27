package android.lab.lets_practice_a_bit_more_event_handling;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout verticalLayout = new LinearLayout(this);
        LinearLayout btnLayout = new LinearLayout(this);

        verticalLayout.setOrientation(LinearLayout.VERTICAL);
        btnLayout.setOrientation(LinearLayout.HORIZONTAL);

        Button englishBtn = new Button(this);
        Button sverigeBtn = new Button(this);
        Button suomeksiBtn = new Button(this);
        Button surpriseBtn = new Button(this);
        final EditText editText = new EditText(this);
        final TextView textView = new TextView (this);

        englishBtn.setText("ENGLISH");
        sverigeBtn.setText("SVERIGE");
        suomeksiBtn.setText("SUOMEKSI");
        surpriseBtn.setText("SURPRISE");

        englishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hi "+ editText.getText().toString());
            }
        });

        sverigeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hejjsan "+ editText.getText().toString());
            }
        });

        suomeksiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Terve "+ editText.getText().toString());
            }
        });

        surpriseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hola "+ editText.getText().toString());
            }
        });


        verticalLayout.addView(editText);
        verticalLayout.addView(btnLayout);
        btnLayout.addView(englishBtn);
        btnLayout.addView(sverigeBtn);
        btnLayout.addView(suomeksiBtn);
        btnLayout.addView(surpriseBtn);
        verticalLayout.addView(textView);


        setContentView(verticalLayout);

    }

}