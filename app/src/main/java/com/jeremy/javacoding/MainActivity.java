package com.jeremy.javacoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    //public Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void firstLevel(View view){
        //intent.setlassName(MainActivity.this,"MainActivity");
        //intent.s
        //Intent intent;
        Intent intent = new Intent(MainActivity.this, LevelOne.class);
        //EditText editText = (EditText) findViewById(R.id.imageButton);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        //String message = imageButton.getText().toString();
        System.out.println("firstLevel");
        try {
        intent.putExtra(EXTRA_MESSAGE, "From_home_page_to_first_level");
        System.out.println("firstLevel starting intent");
        startActivity(intent);
    }
        catch (Exception e) {
        System.out.println(e);
    }

    }
    public void secondLevel(View view){
        Intent intent1 = new Intent(MainActivity.this, LevelTwo.class);
        //EditText editText = (EditText) findViewById(R.id.imageButton);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton2);
        //String message = imageButton.getText().toString();
        System.out.println("secondLevel");
        try {
            intent1.putExtra(EXTRA_MESSAGE, "From_home_page_to_second_level");
            System.out.println("secondLevel starting intent");
            startActivity(intent1);
        }
        catch (Exception e) {
            System.out.println(e);
        }
}
    public void thirdLevel(View view){
        Intent intent2 = new Intent(MainActivity.this, LevelThree.class);
        //EditText editText = (EditText) findViewById(R.id.imageButton);
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton3);
        //String message = imageButton.getText().toString();
        try {
        System.out.println("thirdLevel");
        intent2.putExtra(EXTRA_MESSAGE, "From_home_page_to_third_level");
        System.out.println("thirdLevel starting intent");
        startActivity(intent2);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
