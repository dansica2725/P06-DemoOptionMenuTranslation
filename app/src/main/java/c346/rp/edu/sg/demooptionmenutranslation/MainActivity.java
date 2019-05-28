package c346.rp.edu.sg.demooptionmenutranslation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView translatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        translatedText = findViewById(R.id.translatedText);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if (id == R.id.EnglishSelection) {
            translatedText.setText("Hello ");
            return true;
        }
        else if (id == R.id.italianSelection) {
            translatedText.setText("Ciao");
            return true;
        }
        else  {
            translatedText.setText("Error translation");
        }

        return super.onOptionsItemSelected(item);
    }

}
