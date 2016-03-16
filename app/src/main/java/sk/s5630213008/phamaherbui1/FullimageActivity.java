package sk.s5630213008.phamaherbui1;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

public class FullimageActivity extends AppCompatActivity {

    Integer[] arrImg = {
            R.drawable.aa,
            R.drawable.bb,
            R.drawable.cc,
            R.drawable.dd,
            R.drawable.ee,
            R.drawable.ff,
            R.drawable.gg,
            R.drawable.hh,
            R.drawable.ii,
            R.drawable.jj,
            R.drawable.kk,
            R.drawable.ll,
            R.drawable.oo,
            R.drawable.pp,
            R.drawable.mm,
            R.drawable.nn
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullimage);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intVal = getIntent();
        int imgID = intVal.getExtras().getInt("imgID");


        ImageView imageView = (ImageView) findViewById(R.id.ivINFO);
        imageView.setImageResource(arrImg[imgID]);


    }

}
