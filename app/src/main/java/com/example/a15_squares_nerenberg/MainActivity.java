package com.example.a15_squares_nerenberg;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //create the button variables
        Button bReset = findViewById(R.id.bReset);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button b10 = findViewById(R.id.b10);
        Button b11 = findViewById(R.id.b11);
        Button b12 = findViewById(R.id.b12);
        Button b13 = findViewById(R.id.b13);
        Button b14 = findViewById(R.id.b14);
        Button b15 = findViewById(R.id.b15);
        Button b16 = findViewById(R.id.b16);

        //create array of buttons
        Button[] buttons = new Button[]{b1, b2, b3, b4, b5, b6, b7, b8,
                                        b9, b10, b11, b12, b13, b14, b15, b16};

        //initialize all buttons to be blue
        for(Button b : buttons){
                b.setBackgroundColor(Color.BLUE);
        }

        //make sController
        SController sController = new SController(b1, b2, b3, b4, b5, b6, b7, b8,
                                                    b9, b10, b11, b12, b13, b14, b15, b16, buttons);

        //set the listeners
        b1.setOnClickListener(sController);
        b2.setOnClickListener(sController);
        b3.setOnClickListener(sController);
        b4.setOnClickListener(sController);
        b5.setOnClickListener(sController);
        b6.setOnClickListener(sController);
        b7.setOnClickListener(sController);
        b8.setOnClickListener(sController);
        b9.setOnClickListener(sController);
        b10.setOnClickListener(sController);
        b11.setOnClickListener(sController);
        b12.setOnClickListener(sController);
        b13.setOnClickListener(sController);
        b14.setOnClickListener(sController);
        b15.setOnClickListener(sController);
        b16.setOnClickListener(sController);

        bReset.setOnClickListener(sController);





    }




}