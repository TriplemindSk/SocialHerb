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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DetailDiseaseActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tv;
    Button btn;
    Button btn1;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_disease);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        actionBar.setDisplayHomeAsUpEnabled(true);

        tv =(TextView) findViewById(R.id.textView7);

        btn1 = (Button) findViewById(R.id.btnm);
        btn = (Button) findViewById(R.id.button10);

        btn.setOnClickListener(this);

        String text = getIntent().getStringExtra("text").toString();
        tv.setText(text);

        button = (Button)findViewById(R.id.btOK);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(DetailDiseaseActivity.this,
                        String.valueOf("Complete!! "), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),Detailherb2Activity.class);
        startActivity(intent);

    }

    public void bbClick(View vv){

        Intent intent = new Intent(getApplicationContext(),Detaildisease2Activity.class);
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
