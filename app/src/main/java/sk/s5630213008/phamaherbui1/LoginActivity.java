package sk.s5630213008.phamaherbui1;

import android.content.Intent;
import android.graphics.Color;
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
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    Button loginbtn;
    Button regisbtn;
    EditText password;
    EditText username;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        loginbtn = (Button)findViewById(R.id.loginbtn);
        regisbtn = (Button)findViewById(R.id.regisbtn);
        loginbtn.setOnClickListener(this);

        password = (EditText)findViewById(R.id.edPASSWORD);
        username = (EditText)findViewById(R.id.edUSERNAME);


    }

    @Override
    public void onClick(View v) {

        if(username.getText().toString().equals("triplemind") &&
        password.getText().toString().equals("mamind")) {
            Toast.makeText(getApplicationContext(), "Complete!!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
            startActivity(intent);

        }
        else{
            Toast.makeText(getApplicationContext(), "Wrong Username or Password",Toast.LENGTH_SHORT).show();

            //tx1.setVisibility(View.VISIBLE);
            //tx1.setBackgroundColor(Color.RED);
            //counter--;
            //tx1.setText(Integer.toString(counter));

            //if (counter == 0) {
                //b1.setEnabled(false);
            //}
        }
    }
//});


    public void reClick(View vv){
        Intent intent = new Intent(getApplicationContext(),RegisterActivity.class);
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
