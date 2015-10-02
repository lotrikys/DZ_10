package ua.org.lotrik.dz_10;

import java.util.Random;

/**
 * Created by lotrik on 02.10.15.
 */
public class Ai {

    MainActivity activity;
    Random random = new Random();
    int i;

    public Ai(MainActivity activity) {
        this.activity = activity;
    }

    public void ai() {
        if (activity.empty.size() != 0 && !activity.textView.getText().toString().equals("Выиграл Х")) {
            i = Integer.parseInt(activity.empty.get(random.nextInt(activity.empty.size())));
            switch (i) {
                case 0:
                    activity.imageView.setBackgroundResource(R.drawable.o);
                    activity.pressed[0] = 2;
                    activity.empty.remove("0");
                    activity.textView.setText(new Result().result(activity.pressed));
                    break;
                case 1:
                    activity.imageView2.setBackgroundResource(R.drawable.o);
                    activity.pressed[1] = 2;
                    activity.empty.remove("1");
                    activity.textView.setText(new Result().result(activity.pressed));
                    break;
                case 2:
                    activity.imageView3.setBackgroundResource(R.drawable.o);
                    activity.pressed[2] = 2;
                    activity.empty.remove("2");
                    activity.textView.setText(new Result().result(activity.pressed));
                    break;
                case 3:
                    activity.imageView4.setBackgroundResource(R.drawable.o);
                    activity.pressed[3] = 2;
                    activity.empty.remove("3");
                    activity.textView.setText(new Result().result(activity.pressed));
                    break;
                case 4:
                    activity.imageView5.setBackgroundResource(R.drawable.o);
                    activity.pressed[4] = 2;
                    activity.empty.remove("4");
                    activity.textView.setText(new Result().result(activity.pressed));
                    break;
                case 5:
                    activity.imageView6.setBackgroundResource(R.drawable.o);
                    activity.pressed[5] = 2;
                    activity.empty.remove("5");
                    activity.textView.setText(new Result().result(activity.pressed));
                    break;
                case 6:
                    activity.imageView7.setBackgroundResource(R.drawable.o);
                    activity.pressed[6] = 2;
                    activity.empty.remove("6");
                    activity.textView.setText(new Result().result(activity.pressed));
                    break;
                case 7:
                    activity.imageView8.setBackgroundResource(R.drawable.o);
                    activity.pressed[7] = 2;
                    activity.empty.remove("7");
                    activity.textView.setText(new Result().result(activity.pressed));
                    break;
                case 8:
                    activity.imageView9.setBackgroundResource(R.drawable.o);
                    activity.pressed[8] = 2;
                    activity.empty.remove("8");
                    activity.textView.setText(new Result().result(activity.pressed));
                    break;
            }
        }
    }
}
