package com.example.onlineorder;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    static float ratioX;
    static float ratioY;
    public LinearLayout fastfood,Sallata,Embelsira,Pije;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;

        ratioX = 1080/width;
        ratioY = 2220/height;



        fastfood = (LinearLayout) findViewById(R.id.linearLayout1);
        Sallata = (LinearLayout) findViewById(R.id.linearLayout3);
        Embelsira = (LinearLayout) findViewById(R.id.linearLayout4);
        Pije = (LinearLayout) findViewById(R.id.linearLayout5);



        fastfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), FastfoodActivity.class));
            }
        });


        Sallata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), SallataActivity.class));
            }
        });



        Embelsira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), EmbelsiraActivity.class));
            }
        });



        Pije.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), PijeActivity.class));
            }
        });





/*


        fastfood = (LinearLayout) findViewById(R.id.linearLayout1);
        Sallata = (LinearLayout) findViewById(R.id.linearLayout2);
        Embelsira = (LinearLayout) findViewById(R.id.linearLayout3);
        Pije = (LinearLayout) findViewById(R.id.linearLayout4);
        setMargins(fastfood,0,(int)60/(int)ratioY,0,0);
        ViewGroup.LayoutParams params = fastfood.getLayoutParams();

        params.height = 480/(int)(ratioY);
        params.width = 440/(int)ratioX;
        fastfood.setLayoutParams(params);

        setMargins(Sallata,500/(int)ratioX,(int)60/(int)ratioY,0,0);
        ViewGroup.LayoutParams params1 = Sallata.getLayoutParams();

        params1.height = 480/(int)(ratioY);
        params1.width = 440/(int)ratioX;
        Sallata.setLayoutParams(params1);
        setMargins(Embelsira,0,(int)580/(int)ratioY,0,0);

        ViewGroup.LayoutParams params2 = Embelsira.getLayoutParams();

        params2.height = 480/(int)(ratioY);
        params2.width = 440/(int)ratioX;
        Embelsira.setLayoutParams(params2);
        setMargins(Pije,100/(int)ratioX,(int)580/(int)ratioY,50,0);

        ViewGroup.LayoutParams params3 = Pije.getLayoutParams();

        params3.height = 480/(int)(ratioY);
        params3.width = 440/(int)ratioX;
        Pije.setLayoutParams(params3);

 */

    }

    private void setMargins (View view, int left, int top, int right, int bottom) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(left, top, right, bottom);
            view.requestLayout();
        }
    }


}
