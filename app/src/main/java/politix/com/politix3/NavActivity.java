package politix.com.politix3;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class NavActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Button test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

//        test = (Button) findViewById(R.id.test);



//        test.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v){
//                //collecting the data in the username field
////                EditText username_input = (EditText) findViewById(R.id.username);
////                String username = username_input.getText().toString().trim();
//
//                //
//                Intent intent = new Intent(NavActivity.this, ItemsList.class);
////                EditText editText = (EditText) findViewById(R.id.edit_message);
////                String message = editText.getText().toString();
//                //.putExtra is to pass messages between activities
////                intent.putExtra(EXTRA_MESSAGE, message);
//
//                startActivity(intent);
//                Toast.makeText(getApplicationContext(), "Going to Items List",
//                        Toast.LENGTH_SHORT).show();
//            }
//        });
//        Bundle bundle = getIntent().getExtras();
//        String username = bundle.getString("username");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.nav, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        FragmentManager fragmentManager = getFragmentManager();

        if (id == R.id.nav_first_layout) {
            Intent intent = new Intent(NavActivity.this, Home.class);
            startActivity(intent);
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new Home()).commit();

        } else if (id == R.id.nav_second_layout) {
            Intent intent = new Intent(NavActivity.this, StarredBills.class);
            startActivity(intent);
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new StarredBills()).commit();

        } else if (id == R.id.nav_third_layout) {
            Intent intent = new Intent(NavActivity.this, Agriculture.class);
            startActivity(intent);
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new Agriculture()).commit();

        } else if (id == R.id.nav_fourth_layout) {
            Intent intent = new Intent(NavActivity.this, Commerce.class);
            startActivity(intent);
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new Commerce()).commit();

        } else if (id == R.id.nav_fifth_layout) {
            Intent intent = new Intent(NavActivity.this, Defense.class);
            startActivity(intent);
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new Defense()).commit();

        } else if (id == R.id.nav_sixth_layout) {
            Intent intent = new Intent(NavActivity.this, Education.class);
            startActivity(intent);
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new Education()).commit();

        } else if (id == R.id.nav_seventh_layout) {
            Intent intent = new Intent(NavActivity.this, Energy.class);
            startActivity(intent);
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new Energy()).commit();

        } else if (id == R.id.nav_eighth_layout) {
            Intent intent = new Intent(NavActivity.this, Health.class);
            startActivity(intent);
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new Health()).commit();

        } else if (id == R.id.nav_ninth_layout) {
            Intent intent = new Intent(NavActivity.this, Housing.class);
            startActivity(intent);
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new Housing()).commit();

        } else if (id == R.id.nav_tenth_layout) {
            Intent intent = new Intent(NavActivity.this, Homeland.class);
            startActivity(intent);
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new Homeland()).commit();

        } else if (id == R.id.nav_eleventh_layout) {
            Intent intent = new Intent(NavActivity.this, Labor.class);
            startActivity(intent);
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new Labor()).commit();

        } else if (id == R.id.nav_twelvth_layout) {
            Intent intent = new Intent(NavActivity.this, Transportation.class);
            startActivity(intent);
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new Transportation()).commit();

        } else if (id == R.id.nav_thirteenth_layout) {
            Intent intent = new Intent(NavActivity.this, Veterans.class);
            startActivity(intent);
//            fragmentManager.beginTransaction().replace(R.id.content_frame, new Veterans()).commit();

        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
