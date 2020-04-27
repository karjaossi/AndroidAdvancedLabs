package android.lab.external_activities;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.net.Uri;
import android.content.Intent;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button button;
    ImageView imgView;
   // EditText urlText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.openMap);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("geo:64.9997517,25.5110145"));
                startActivity(intent);
            }
        });

        button = (Button) findViewById(R.id.createCall);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:+358 40 141 5510"));
                startActivity(intent);
            }
        });

        // I couldn't get the custom URL working.
       // urlText = (EditText) findViewById(R.id.textURL);

        button = (Button) findViewById(R.id.goURL);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.oamk.fi"));
                startActivity(intent);
            }
        });

    }
}
