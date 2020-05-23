package com.example.onlineorder;

import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    static float ratioX;
    static float ratioY;

    public LinearLayout fastfood,Sallata,Embelsira,Pije,mish,pica,pasta,antiPasta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;

        ratioX = 1080 / width;
        ratioY = 2220 / height;

        Pije = (LinearLayout) findViewById(R.id.arrow_1);
        Embelsira = (LinearLayout) findViewById(R.id.arrow_2);
        Sallata = (LinearLayout) findViewById(R.id.arrow_3);
        mish = (LinearLayout) findViewById(R.id.arrow_4);
        fastfood = (LinearLayout) findViewById(R.id.arrow_5);
        pica = (LinearLayout) findViewById(R.id.arrow_6);
        pasta = (LinearLayout) findViewById(R.id.arrow_7);
        antiPasta = (LinearLayout) findViewById(R.id.arrow_8);







        Pije.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), EmbelsiraActivity.class));
                overridePendingTransition(0,0);
            }
        });
        Embelsira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), EmbelsiraActivity.class));
            }
        });
        Sallata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), EmbelsiraActivity.class));
            }
        });
        mish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), EmbelsiraActivity.class));
            }
        });
        fastfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), EmbelsiraActivity.class));
            }
        });
        pica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), EmbelsiraActivity.class));
            }
        });
        pasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), EmbelsiraActivity.class));
            }
        });
        antiPasta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(view.getContext(), EmbelsiraActivity.class));
            }
        });







        //toolbar gradient
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );





       /* fastfood = (LinearLayout) findViewById(R.id.linearLayout1);
        Sallata = (LinearLayout) findViewById(R.id.linearLayout3);
        Embelsira = (LinearLayout) findViewById(R.id.linearLayout4);
        Pije = (LinearLayout) findViewById(R.id.linearLayout5);
        //setMargins(fastfood,0,(int)60/(int)ratioY,0,0);
        ViewGroup.LayoutParams params = fastfood.getLayoutParams();

        fastfood.setLayoutParams(params);

        params.height = 320/(int)(ratioY);
        params.width = 150/(int)ratioX;
       // setMargins(Sallata,500/(int)ratioX,(int)60/(int)ratioY,0,0);
        ViewGroup.LayoutParams params1 = Sallata.getLayoutParams();

        params1.height = 320/(int)(ratioY);
        params1.width = 150/(int)ratioX;
        Sallata.setLayoutParams(params1);
       // setMargins(Embelsira,0,(int)580/(int)ratioY,0,0);

        ViewGroup.LayoutParams params2 = Embelsira.getLayoutParams();

        params2.height = 320/(int)(ratioY);
        params2.width = 150/(int)ratioX;
        Embelsira.setLayoutParams(params2);
        //setMargins(Pije,100/(int)ratioX,(int)580/(int)ratioY,50,0);

        ViewGroup.LayoutParams params3 = Pije.getLayoutParams();

        params3.height = 320/(int)(ratioY);
        params3.width = 150/(int)ratioX;
        Pije.setLayoutParams(params3);



    }

    private void setMargins (View view, int left, int top, int right, int bottom) {
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams p = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            p.setMargins(left, top, right, bottom);
            view.requestLayout();
        }
    }*/

    }
}
