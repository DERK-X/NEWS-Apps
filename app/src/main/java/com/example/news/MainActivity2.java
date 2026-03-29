package com.example.news;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    TextView TITLE,DES,TV_ONER,TV_NAME;
    ImageView IMAGE,TV_LOGO;

    public static String title = "";
    public static String des = "";
    public static String NAME = "";
    public static String ONER = "";
    public static Bitmap MyBitmap = null ;
    public static Bitmap MyBitmaplogo = null ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TITLE = findViewById(R.id.texttitle);
        DES = findViewById(R.id.textdes);
        IMAGE = findViewById(R.id.imageView);
        TV_ONER = findViewById(R.id.TV_ONER);
        TV_NAME = findViewById(R.id.TV_NAME);
        TV_LOGO=findViewById(R.id.TV_logo);



        TITLE.setText(title);
        DES.setText(des);
        TV_ONER.setText(ONER);
        TV_NAME.setText(NAME);




        if (MyBitmap!=null) IMAGE.setImageBitmap(MyBitmap);
        if (MyBitmaplogo!=null) TV_LOGO.setImageBitmap(MyBitmaplogo);




    }
}