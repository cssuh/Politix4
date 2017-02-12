package politix.com.politix3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by ChrisSuh on 2/11/17.
 */

public class Health extends AppCompatActivity{

    private OkHttpClient client = new OkHttpClient();
    TextView billsString = (TextView)findViewById(R.id.bills_string);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.health_and_human);

        try{
            doGetRequest("https://raw.github.com/square/okhttp/master/README.md");
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    void doGetRequest(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request)
                .enqueue(new Callback() {
                    @Override
                    public void onFailure(final Call call, IOException e) {
                        //error

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                //show an error dialog or toast on main ui thread
                            }
                        });
                    }

                    @Override
                    public void onResponse(Call call, final Response response) throws IOException {
                        String res = response.body().string();
                        billsString.setText(res);
                    }
                });
    }




}

