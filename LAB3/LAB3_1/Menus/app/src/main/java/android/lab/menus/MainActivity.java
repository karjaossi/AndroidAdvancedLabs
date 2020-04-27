package android.lab.menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    View view;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item )
    {
        switch (item.getItemId())
        {

            case R.id.red:
                view=this.getWindow().getDecorView();
                view.setBackgroundResource(R.color.redBG);
                TextView redText = (TextView) findViewById(R.id.colorText);
                redText.setText("Red");
                return true;

            case R.id.green:
                view=this.getWindow().getDecorView();
                view.setBackgroundResource(R.color.greenBG);
                TextView greenText = (TextView) findViewById(R.id.colorText);
                greenText.setText("Green");
                return true;

            case R.id.blue:
                view=this.getWindow().getDecorView();
                view.setBackgroundResource(R.color.blueBG);
                TextView blueText = (TextView) findViewById(R.id.colorText);
                blueText.setText("Blue");
                return true;

            case R.id.yellow:
                view=this.getWindow().getDecorView();
                view.setBackgroundResource(R.color.yellowBG);
                TextView yellowText = (TextView) findViewById(R.id.colorText);
                yellowText.setText("Yellow");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
