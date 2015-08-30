package ua.org.lotrik.dz_10;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int[] pressed = {0,0,0,0,0,0,0,0,0};
    public ImageView imageView;
    public ImageView imageView2;
    public ImageView imageView3;
    public ImageView imageView4;
    public ImageView imageView5;
    public ImageView imageView6;
    public ImageView imageView7;
    public ImageView imageView8;
    public ImageView imageView9;
    public TextView textView;
    Random random = new Random();
    int i;
    int empty=9;
    public Button newGame;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.imageView);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView5 = (ImageView)findViewById(R.id.imageView5);
        imageView6 = (ImageView)findViewById(R.id.imageView6);
        imageView7 = (ImageView)findViewById(R.id.imageView7);
        imageView8 = (ImageView)findViewById(R.id.imageView8);
        imageView9 = (ImageView)findViewById(R.id.imageView9);
        textView = (TextView)findViewById(R.id.textView);
        newGame = (Button)findViewById(R.id.newGame);
        imageView.setBackgroundColor(Color.WHITE);
        imageView2.setBackgroundColor(Color.WHITE);
        imageView3.setBackgroundColor(Color.WHITE);
        imageView4.setBackgroundColor(Color.WHITE);
        imageView5.setBackgroundColor(Color.WHITE);
        imageView6.setBackgroundColor(Color.WHITE);
        imageView7.setBackgroundColor(Color.WHITE);
        imageView8.setBackgroundColor(Color.WHITE);
        imageView9.setBackgroundColor(Color.WHITE);


        final View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.imageView:
                        if (pressed[0] == 0) {
                            imageView.setBackgroundResource(R.drawable.x);
                            pressed[0]=1;
                            empty--;
                            textView.setText(new Result().result(pressed));
                            ai();
                        }
                        break;
                    case R.id.imageView2:
                        if (pressed[1] == 0) {
                            imageView2.setBackgroundResource(R.drawable.x);
                            pressed[1]=1;
                            empty--;
                            textView.setText(new Result().result(pressed));
                            ai();
                        }
                        break;
                    case R.id.imageView3:
                        if (pressed[2] == 0) {
                            imageView3.setBackgroundResource(R.drawable.x);
                            pressed[2]=1;
                            empty--;
                            textView.setText(new Result().result(pressed));
                            ai();
                        }
                        break;
                    case R.id.imageView4:
                        if (pressed[3] == 0) {
                            imageView4.setBackgroundResource(R.drawable.x);
                            pressed[3]=1;
                            empty--;
                            textView.setText(new Result().result(pressed));
                            ai();
                        }
                        break;
                    case R.id.imageView5:
                        if (pressed[4] == 0) {
                            imageView5.setBackgroundResource(R.drawable.x);
                            pressed[4]=1;
                            empty--;
                            textView.setText(new Result().result(pressed));
                            ai();
                        }
                        break;
                    case R.id.imageView6:
                        if (pressed[5] == 0) {
                            imageView6.setBackgroundResource(R.drawable.x);
                            pressed[5]=1;
                            empty--;
                            textView.setText(new Result().result(pressed));
                            ai();
                        }
                        break;
                    case R.id.imageView7:
                        if (pressed[6] == 0) {
                            imageView7.setBackgroundResource(R.drawable.x);
                            pressed[6]=1;
                            empty--;
                            textView.setText(new Result().result(pressed));
                            ai();
                        }
                        break;
                    case R.id.imageView8:
                        if (pressed[7] == 0) {
                            imageView8.setBackgroundResource(R.drawable.x);
                            pressed[7]=1;
                            empty--;
                            textView.setText(new Result().result(pressed));
                            ai();
                        }
                        break;
                    case R.id.imageView9:
                        if (pressed[8] == 0) {
                            imageView9.setBackgroundResource(R.drawable.x);
                            pressed[8]=1;
                            empty--;
                            textView.setText(new Result().result(pressed));
                            ai();
                        }
                        break;
                    case R.id.newGame:
                        imageView.setBackgroundColor(Color.WHITE);
                        imageView2.setBackgroundColor(Color.WHITE);
                        imageView3.setBackgroundColor(Color.WHITE);
                        imageView4.setBackgroundColor(Color.WHITE);
                        imageView5.setBackgroundColor(Color.WHITE);
                        imageView6.setBackgroundColor(Color.WHITE);
                        imageView7.setBackgroundColor(Color.WHITE);
                        imageView8.setBackgroundColor(Color.WHITE);
                        imageView9.setBackgroundColor(Color.WHITE);
                        textView.setText("");
                        for (int i=0; i<pressed.length;i++)
                        {
                            pressed[i] = 0;
                        }
                        break;
                }
            }
        };

        imageView.setOnClickListener(click);
        imageView2.setOnClickListener(click);
        imageView3.setOnClickListener(click);
        imageView4.setOnClickListener(click);
        imageView5.setOnClickListener(click);
        imageView6.setOnClickListener(click);
        imageView7.setOnClickListener(click);
        imageView8.setOnClickListener(click);
        imageView9.setOnClickListener(click);
        newGame.setOnClickListener(click);
    }

    public void ai() {
        i = random.nextInt(8);
        if (pressed[i] == 0) {
            switch (i) {
                case 0:
                    imageView.setBackgroundResource(R.drawable.o);
                    pressed[0] = 2;
                    empty--;
                    textView.setText(new Result().result(pressed));
                    break;
                case 1:
                    imageView2.setBackgroundResource(R.drawable.o);
                    pressed[1] = 2;
                    empty--;
                    textView.setText(new Result().result(pressed));
                    break;
                case 2:
                    imageView3.setBackgroundResource(R.drawable.o);
                    pressed[2] = 2;
                    empty--;
                    textView.setText(new Result().result(pressed));
                    break;
                case 3:
                    imageView4.setBackgroundResource(R.drawable.o);
                    pressed[3] = 2;
                    empty--;
                    textView.setText(new Result().result(pressed));
                    break;
                case 4:
                    imageView5.setBackgroundResource(R.drawable.o);
                    pressed[4] = 2;
                    empty--;
                    textView.setText(new Result().result(pressed));
                    break;
                case 5:
                    imageView6.setBackgroundResource(R.drawable.o);
                    pressed[5] = 2;
                    empty--;
                    textView.setText(new Result().result(pressed));
                    break;
                case 6:
                    imageView7.setBackgroundResource(R.drawable.o);
                    pressed[6] = 2;
                    empty--;
                    textView.setText(new Result().result(pressed));
                    break;
                case 7:
                    imageView8.setBackgroundResource(R.drawable.o);
                    pressed[7] = 2;
                    empty--;
                    textView.setText(new Result().result(pressed));
                    break;
                case 8:
                    imageView9.setBackgroundResource(R.drawable.o);
                    pressed[8] = 2;
                    empty--;
                    textView.setText(new Result().result(pressed));
                    break;
            }
        } else if (empty != 0){
            ai();
        }
    }

}