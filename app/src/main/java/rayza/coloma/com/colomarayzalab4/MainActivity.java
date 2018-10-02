package rayza.coloma.com.colomarayzalab4;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button backbtn = (Button) findViewById(R.id.backbtn);
        Button nextbtn = (Button) findViewById(R.id.nextbtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String message = "Go back!";
                int duration = Toast.LENGTH_SHORT;
                Toast.makeText(getApplicationContext(), message, duration).show();
            }
        });


        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = findViewById(R.id.main_layout_id);
                String message = "Next!";
                int duration = Snackbar.LENGTH_SHORT;

                showSnackbar(view, message, duration);
            }

        });
    }

    public void showSnackbar(View view, String message, int duration)
    {
        Snackbar.make(view, message,duration).show();
    }

}
