package sk.s5630213008.phamaherbui1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class InfocommonActivity extends AppCompatActivity {

    String[] Cmd = {"View Full","Send Photo","Shared Photo","Delete Photo"};

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
        setContentView(R.layout.infocommon);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final GridView gView1 = (GridView)findViewById(R.id.gvINFO);
        gView1.setAdapter(new ImageAdapter(this));

        // OnClick
        gView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                // View Full Image
                Intent newActivity = new Intent(InfocommonActivity.this, FullimageActivity.class);
                newActivity.putExtra("imgID", position);
                startActivity(newActivity);

            }
        });

        // ContontMenu
        registerForContextMenu(gView1);



    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)menuInfo;
        menu.setHeaderIcon(android.R.drawable.btn_star_big_on);
        menu.setHeaderTitle("ภาพที่ : " + info.position);
        String[] menuItems = Cmd;
        for (int i = 0; i<menuItems.length; i++) {
            menu.add(Menu.NONE, i, i, menuItems[i]);
        }
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
        int menuItemIndex = item.getItemId();
        String[] menuItems = Cmd;
        String CmdName = menuItems[menuItemIndex];


        // Check Event Command
        if ("View Full".equals(CmdName)) {
            // View Full Image
            Intent newActivity = new Intent(InfocommonActivity.this,FullimageActivity.class);
            newActivity.putExtra("imgID", info.position);
            startActivity(newActivity);

        }

        return true;
    }



    public class ImageAdapter extends BaseAdapter
    {
        private Context context;

        public ImageAdapter(Context c)
        {
            // TODO Auto-generated method stub
            context = c;
        }

        public int getCount() {
            // TODO Auto-generated method stub
            return arrImg.length;
        }

        public Object getItem(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        public long getItemId(int position) {
            // TODO Auto-generated method stub
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            // TODO Auto-generated method stub
            ImageView imageView;
            //imageView
            if (convertView == null) {
                imageView = new ImageView(context);
                imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                imageView.setPadding(2, 2, 2, 2);
            } else {
                imageView = (ImageView) convertView;
            }
            imageView.setImageResource(arrImg[position]);
            return imageView;
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
