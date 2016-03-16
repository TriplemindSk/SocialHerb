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
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    EditText edNAME,edLASTNAME,edCODE,edEMAIL,edUSERNAME,edPASS,edCONFIRM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edNAME = (EditText)findViewById(R.id.edNAME);
        edLASTNAME = (EditText)findViewById(R.id.edLASTNAME);
        edCODE = (EditText)findViewById(R.id.edCODE);
        edEMAIL = (EditText)findViewById(R.id.edEMAIL);
        edUSERNAME = (EditText)findViewById(R.id.edUSERNAME);
        edPASS = (EditText)findViewById(R.id.edPASS);
        edCONFIRM = (EditText)findViewById(R.id.edCONFIRM);

        button = (Button)findViewById(R.id.btnOKA);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(!edPASS.getText().toString().equals(edCONFIRM.getText().toString())){

            Toast.makeText(getApplicationContext(), "Password and Confirm Password Not Match!", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(getApplicationContext(), "Register Successfully!!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
            startActivity(intent);
        }
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


