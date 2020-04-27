package android.lab.implement_more_functionality;

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

    private class Countries {

        private ArrayList<String> countries = new ArrayList();

        private ArrayList<String> getCountries() {
            return this.countries;
        }
        public void addCountry(String country){
            this.countries.add(country);
        }
    }

    private final Countries countries = new Countries();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        countries.addCountry("Afghanistan");
        countries.addCountry("Albania");
        countries.addCountry("Algeria");
        countries.addCountry("American Samoa");
        countries.addCountry("Andorra");
        countries.addCountry("Angola");
        countries.addCountry("Anguilla");
        countries.addCountry("Antarctica");
        countries.addCountry("Antigua and Barbuda");
        countries.addCountry("Argentina");
        countries.addCountry("Armenia");
        countries.addCountry("Aruba");
        countries.addCountry("Australia");
        countries.addCountry("Austria");
        countries.addCountry("Azerbaijan");

        ArrayList<String> listAllCountries = countries.getCountries();

        LinearLayout verticalLayout = new LinearLayout(this);
        LinearLayout btnLayout = new LinearLayout(this);

        verticalLayout.setOrientation(LinearLayout.VERTICAL);
        btnLayout.setOrientation(LinearLayout.HORIZONTAL);

        Button addBtn = new Button(this);
        Button removeBtn = new Button(this);
        Button editBtn = new Button(this);
        final EditText searchText = new EditText(this);

        addBtn.setText("Add");
        editBtn.setText("Edit");
        removeBtn.setText("Remove");

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String editText = searchText.getText().toString();
                countries.addCountry(editText);
                searchText.setText("");
            }
        });

        // I couldn't figure out how to get the remove to work.


        ListView myListView = new ListView(this);
        final ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listAllCountries);
        myListView.setAdapter(arrayAdapter);

        verticalLayout.addView(btnLayout);
        btnLayout.addView(addBtn);
        btnLayout.addView(editBtn);
        btnLayout.addView(removeBtn);
        verticalLayout.addView(searchText);
        verticalLayout.addView(myListView);

        setContentView(verticalLayout);



    }

}
