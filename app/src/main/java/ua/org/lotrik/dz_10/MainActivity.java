package ua.org.lotrik.dz_10;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class MainActivity extends Activity {

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
    public ArrayList<String> empty = new ArrayList<>();
    public Button newGame;
    NewGameExec newGameExec = new NewGameExec(this);
    HumanMove humanMove = new HumanMove(this);

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

        empty.add("0");
        empty.add("1");
        empty.add("2");
        empty.add("3");
        empty.add("4");
        empty.add("5");
        empty.add("6");
        empty.add("7");
        empty.add("8");


        final View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.newGame:
                        new NewGameExec(newGameExec.activity).newGame();
                        break;
                    default:
                        new HumanMove(humanMove.activity).move(v);
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
}