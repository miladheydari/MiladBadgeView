package com.widget.milad.miladproject;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.widget.milad.miladbadgeview.MiladBadgeView;

import java.util.List;
import java.util.Random;

/**
 * Created by milad on 9/22/2016.
 */
public class CustomAdapter extends BaseAdapter {
    private Context context;
    private List<String> strings;
    int[] gravities = new int[]{Gravity.CENTER, Gravity.LEFT, Gravity.TOP, Gravity.RIGHT, Gravity.BOTTOM,
            Gravity.CENTER_HORIZONTAL
            , Gravity.CENTER_VERTICAL
            , Gravity.CLIP_HORIZONTAL, Gravity.CLIP_VERTICAL
            , Gravity.END, Gravity.START, Gravity.FILL, Gravity.FILL_HORIZONTAL, Gravity.FILL_VERTICAL
    };
    Random rand = new Random(System.currentTimeMillis());

    public CustomAdapter(Context context, List<String> strings) {
        this.context = context;
        this.strings = strings;
    }

    @Override
    public int getCount() {
        return strings.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Holder holder;
        if (view == null) {

            view = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)).inflate(R.layout.row, viewGroup, false);
            holder = new Holder();
            holder.textView = (TextView) view.findViewById(R.id.row_lbl);
            view.setTag(holder);
        } else holder = (Holder) view.getTag();
        holder.textView.setText(strings.get(i));
        MiladBadgeView l = new MiladBadgeView(context);
//        l.setBadgeMargin(rand.nextInt(100));
        l.setBackground(rand.nextInt(100), Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));
        l.setTargetView(holder.textView);
        l.setBadgeGravity(gravities[i % 14] | gravities[i % 14]);
        l.setText(random());
        return view;
    }

    private String random() {
        Random generator = new Random();
        StringBuilder randomStringBuilder = new StringBuilder();
        int randomLength = generator.nextInt(20);
        char tempChar;
        for (int i = 0; i < randomLength; i++) {
            tempChar = (char) (generator.nextInt(96) + 32);
            randomStringBuilder.append(tempChar);
        }
        return randomStringBuilder.toString();
    }

    class Holder {
        TextView textView;
    }

}
