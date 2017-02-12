package politix.com.politix3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

public class Commerce extends AppCompatActivity{

    private OkHttpClient client = new OkHttpClient();
    String res;
    TextView test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_list);

        test = (TextView)findViewById(R.id.request_test);


        try{
            doGetRequest("http://localhost:3000/api/bills");
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    void doGetRequest(String url) throws IOException {
        Request request = new Request.Builder()
                .url(url)
                .build();
        client.newCall(request)
                .enqueue(new Callback()
                {

                    @Override
                    public void onFailure(final Call call, IOException e) {
                        //error

                        Commerce.this.runOnUiThread(new Runnable() {

                            @Override
                            public void run() {


                                //show an error dialog or toast on main ui thread
                            }
                        });

                    }

                    @Override
                    public void onResponse(Call call, final Response response) throws IOException {

                        Commerce.this.runOnUiThread(new Runnable(){

                            @Override
                            public void run() {
                                try {
                                    res = response.body().string();
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                test.setText(res);
                            }
                        });


                    }

                });

    }




}

