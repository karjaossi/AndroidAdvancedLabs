package android.lab.more_comples_ui_programmatically;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final String[] COUNTRIES = new String[] {
                "Afghanistan", "Albania", "Algeria", "American Samoa", "Andoorra",
                "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina",
                "Armenia", "Aruba", "Australia", "Austria", "Azerbaijan"
        };

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

        ListView myListView = new ListView(this);
        final ArrayAdapter<String> arrayAdapter;
        arrayAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,COUNTRIES);
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
