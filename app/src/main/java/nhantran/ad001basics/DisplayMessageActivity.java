package nhantran.ad001basics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent myIntent = getIntent();
        String myMessage = myIntent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView myTextView = (TextView) findViewById(R.id.message_to_display);
        myTextView.setText(myMessage);
    }
}
