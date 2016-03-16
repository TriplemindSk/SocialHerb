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

public class ArticlecommonActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    EditText edt;
    Button btns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.articlecommon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        btns = (Button)findViewById(R.id.btns);
        btn = (Button)findViewById(R.id.button7);
        btn.setOnClickListener(this);
        edt = (EditText)findViewById(R.id.editText);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(getApplicationContext(),DetailArticleCommonActivity.class);
        intent.putExtra("text", edt.getText().toString());
        startActivity(intent);
    }

    public void atClick(View vv){
        Intent intent = new Intent(getApplicationContext(),ShowArticleCommon2Activity.class);
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
