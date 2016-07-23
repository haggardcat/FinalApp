package kr.co.ipdisk.cattree.finalapp.contact;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import kr.co.ipdisk.cattree.finalapp.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<People> list = People_List.getList();
        final ListView contactList = (ListView) findViewById(R.id.listView);
        contactList.setAdapter(new Adapter(this,list));
    }
}
