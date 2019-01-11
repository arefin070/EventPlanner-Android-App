package bd.ac.uiu.eventplanner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Home_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);


        TextView confirmation = (TextView) findViewById(R.id.confmsg);


        confirmation.setText( "Your are successfully signed up!");


    }
}
