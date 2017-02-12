package politix.com.politix3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        Bundle bundle = getIntent().getExtras();
        String username = bundle.getString("username");
        // **where to display username?

//        String message = intent.getStringExtra(LoginActivity.EXTRA_MESSAGE);
//        TextView textView = new TextView(this);
//        textView.setTextSize(40);
//        textView.setText(message);


//        Toolbar toolbar = (Toolbar) findViewById(toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }
}
