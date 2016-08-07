package nhantran.ad001basics;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public final static String EXTRA_MESSAGE = "com.example.training_001_basics.MESSAGE";
    public void sendMessage(View view) {
        Intent myIntent = new Intent(this, DisplayMessageActivity.class);
        EditText myEditText = (EditText)findViewById(R.id.edit_message);
        String myMessage = myEditText.getText().toString();
        myIntent.putExtra(EXTRA_MESSAGE, myMessage);
        startActivity(myIntent);
    }
}
