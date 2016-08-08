package nhantran.ad001basics;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkAPIVersion();
    }

    /** Called when the user clicks the Send button */
    public final static String EXTRA_MESSAGE = "com.nhantran.ad001basics.MESSAGE";
    public void sendMessage(View view) {
        Intent myIntent = new Intent(this, DisplayMessageActivity.class);
        EditText myEditText = (EditText)findViewById(R.id.edit_message);
        String myMessage = myEditText.getText().toString();
        myIntent.putExtra(EXTRA_MESSAGE, myMessage);
        startActivity(myIntent);
    }

    private void checkAPIVersion() {
        TextView myTextView = (TextView)findViewById(R.id.api_version);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            myTextView.setText(R.string.api_success);
        }
        else {
            myTextView.setText(R.string.api_fail);
        }
    }
}
