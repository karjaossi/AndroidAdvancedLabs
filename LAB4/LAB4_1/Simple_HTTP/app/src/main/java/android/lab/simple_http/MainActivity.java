package android.lab.simple_http;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    RequestQueue queue = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        queue = Volley.newRequestQueue(this);

        findViewById(R.id.goBTN).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                loadFromNetwork();
            }
        });
    }
    protected void loadFromNetwork() {
        final EditText searchText = findViewById(R.id.textField);
        final TextView netResult = findViewById(R.id.pasteData);
        String url = searchText.getText().toString();

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url, new Response.Listener<String>(){
            @Override
            public void onResponse (String response){
                netResult.setText(response);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error){
                netResult.setText(error.getLocalizedMessage());
            }
        });
        queue.add(stringRequest);
    }
}
