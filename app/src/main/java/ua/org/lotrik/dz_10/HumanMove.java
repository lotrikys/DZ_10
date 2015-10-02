package ua.org.lotrik.dz_10;

import android.view.View;

/**
 * Created by lotrik on 02.10.15.
 */
public class HumanMove {

    View v;
    MainActivity activity;

    public HumanMove(MainActivity activity) {
        this.activity = activity;
    }

    public void move (View v) {
        this.v = v;
        switch (v.getId()) {
                    case R.id.imageView:
                        if (activity.pressed[0] == 0) {
                            activity.imageView.setBackgroundResource(R.drawable.x);
                            activity.pressed[0]=1;
                            activity.empty.remove("0");
                            activity.textView.setText(new Result().result(activity.pressed));
                            new Ai(activity).ai();
                        }
                        break;
                    case R.id.imageView2:
                        if (activity.pressed[1] == 0) {
                            activity.imageView2.setBackgroundResource(R.drawable.x);
                            activity.pressed[1]=1;
                            activity.empty.remove("1");
                            activity.textView.setText(new Result().result(activity.pressed));
                            new Ai(activity).ai();
                        }
                        break;
                    case R.id.imageView3:
                        if (activity.pressed[2] == 0) {
                            activity.imageView3.setBackgroundResource(R.drawable.x);
                            activity.pressed[2]=1;
                            activity.empty.remove("2");
                            activity.textView.setText(new Result().result(activity.pressed));
                            new Ai(activity).ai();
                        }
                        break;
                    case R.id.imageView4:
                        if (activity.pressed[3] == 0) {
                            activity.imageView4.setBackgroundResource(R.drawable.x);
                            activity.pressed[3]=1;
                            activity.empty.remove("3");
                            activity.textView.setText(new Result().result(activity.pressed));
                            new Ai(activity).ai();
                        }
                        break;
                    case R.id.imageView5:
                        if (activity.pressed[4] == 0) {
                            activity.imageView5.setBackgroundResource(R.drawable.x);
                            activity.pressed[4]=1;
                            activity.empty.remove("4");
                            activity.textView.setText(new Result().result(activity.pressed));
                            new Ai(activity).ai();
                        }
                        break;
                    case R.id.imageView6:
                        if (activity.pressed[5] == 0) {
                            activity.imageView6.setBackgroundResource(R.drawable.x);
                            activity.pressed[5]=1;
                            activity.empty.remove("5");
                            activity.textView.setText(new Result().result(activity.pressed));
                            new Ai(activity).ai();
                        }
                        break;
                    case R.id.imageView7:
                        if (activity.pressed[6] == 0) {
                            activity.imageView7.setBackgroundResource(R.drawable.x);
                            activity.pressed[6]=1;
                            activity.empty.remove("6");
                            activity.textView.setText(new Result().result(activity.pressed));
                            new Ai(activity).ai();
                        }
                        break;
                    case R.id.imageView8:
                        if (activity.pressed[7] == 0) {
                            activity.imageView8.setBackgroundResource(R.drawable.x);
                            activity.pressed[7]=1;
                            activity.empty.remove("7");
                            activity.textView.setText(new Result().result(activity.pressed));
                            new Ai(activity).ai();
                        }
                        break;
                    case R.id.imageView9:
                        if (activity.pressed[8] == 0) {
                            activity.imageView9.setBackgroundResource(R.drawable.x);
                            activity.pressed[8]=1;
                            activity.empty.remove("8");
                            activity.textView.setText(new Result().result(activity.pressed));
                            new Ai(activity).ai();
                        }
                        break;
        }
    }
}
