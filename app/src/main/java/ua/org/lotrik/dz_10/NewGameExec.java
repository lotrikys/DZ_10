package ua.org.lotrik.dz_10;

import android.graphics.Color;

/**
 * Created by lotrik on 29.09.15.
 */
public class NewGameExec {

    MainActivity activity;

    public NewGameExec(MainActivity activity) {
        this.activity = activity;

    }

    public void newGame(){
        activity.imageView.setBackgroundColor(Color.WHITE);
        activity.imageView2.setBackgroundColor(Color.WHITE);
        activity.imageView3.setBackgroundColor(Color.WHITE);
        activity.imageView4.setBackgroundColor(Color.WHITE);
        activity.imageView5.setBackgroundColor(Color.WHITE);
        activity.imageView6.setBackgroundColor(Color.WHITE);
        activity.imageView7.setBackgroundColor(Color.WHITE);
        activity.imageView8.setBackgroundColor(Color.WHITE);
        activity.imageView9.setBackgroundColor(Color.WHITE);
        activity.textView.setText("");
        activity.empty.clear();
        activity.empty.add("0");
        activity.empty.add("1");
        activity.empty.add("2");
        activity.empty.add("3");
        activity.empty.add("4");
        activity.empty.add("5");
        activity.empty.add("6");
        activity.empty.add("7");
        activity.empty.add("8");
        for (int i = 0; i < activity.pressed.length; i++) {
            activity.pressed[i] = 0;
        }
    }
}

