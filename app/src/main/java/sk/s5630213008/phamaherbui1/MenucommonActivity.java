package sk.s5630213008.phamaherbui1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MenucommonActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menucommon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button btn1 = (Button) findViewById(R.id.btDISEASE);
        Button btn2 = (Button) findViewById(R.id.btHERB);
        Button btn3 = (Button) findViewById(R.id.btARTICAL);
        Button btn4 = (Button) findViewById(R.id.btINFO);

        btn1.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(), DiseasecommonActivity.class);
        startActivity(intent);
    }

    public void btnClick(View v) {
        Intent intent = new Intent(getApplicationContext(), HerbcommonActivity.class);
        startActivity(intent);

    }

    public void articleClick(View v) {
        Intent intent = new Intent(getApplicationContext(), ArticlecommonActivity.class);
        startActivity(intent);

    }

    public void infoClick(View v) {
        Intent intent = new Intent(getApplicationContext(), InfocommonActivity.class);
        startActivity(intent);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
