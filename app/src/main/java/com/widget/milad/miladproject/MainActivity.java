package com.widget.milad.miladproject;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TextView;

import com.widget.milad.miladbadgeview.MiladBadgeView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView lbl;
    TabHost host;
    ListView lv;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lbl = (TextView) findViewById(R.id.lbl);
        host = (TabHost) findViewById(R.id.tab);
        lv = (ListView) findViewById(R.id.list);
        ArrayList w = new ArrayList();
        for (int t = 0; t < 100; t++) {
            w.add(t + "");

        }


        CustomAdapter adapter=new CustomAdapter(this,w);
        lv.setAdapter(adapter);
//        for (int t = 0; t < adapter.getCount(); t++) {
//            View e = adapter.getView(t,null,null);
//            MiladBadgeView l = new MiladBadgeView(this);
//            l.setTargetView(e);
//            l.setText("aa");
////            l.setBadgeGravity(gravities[rand.nextInt(14)]|gravities[rand.nextInt(14)]);
//        }

        getSupportActionBar().setTitle("");
        host.setup();
        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tab One");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Tab One");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Tab Two");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Tab Two");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Tab Three");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Tab Three");
        host.addTab(spec);
        com.widget.milad.miladbadgeview.MiladBadgeView miladBadgeView;
        miladBadgeView = new MiladBadgeView(this);
        miladBadgeView.setTargetView(lbl);
        miladBadgeView.setBadgeGravity(Gravity.RIGHT | Gravity.CENTER);
        miladBadgeView.setText("miladdd");
        MiladBadgeView tabBadge = new MiladBadgeView(this);
        tabBadge.setTargetView(host.getTabWidget(), 2);
        tabBadge.setText("third");
        MiladBadgeView tabBadge2=new MiladBadgeView(this);
        tabBadge2.setTargetView(host.getTabWidget(), 1);
        tabBadge2.setBadgeGravity(Gravity.CENTER|Gravity.BOTTOM);
        tabBadge2.setText("second");
        MiladBadgeView tabBadge3=new MiladBadgeView(this);
        tabBadge3.setTargetView(host.getTabWidget(), 0);
        tabBadge3.setBadgeGravity(Gravity.LEFT|Gravity.CENTER);

        tabBadge3.setText("first");

    }
}
