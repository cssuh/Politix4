package politix.com.politix3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button login;

//    public final static String EXTRA_MESSAGE = "com.politix.com.politix3.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login = (Button) findViewById(R.id.login);



        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                //collecting the data in the username field
                EditText username_input = (EditText) findViewById(R.id.username);
                String username = username_input.getText().toString().trim();

                //
                Intent intent = new Intent(LoginActivity.this, NavActivity.class);
                intent.putExtra("username", username);
//                EditText editText = (EditText) findViewById(R.id.edit_message);
//                String message = editText.getText().toString();
                //.putExtra is to pass messages between activities
//                intent.putExtra(EXTRA_MESSAGE, message);

                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Logging in " + username,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }


    public void login(View view){


    }



}
