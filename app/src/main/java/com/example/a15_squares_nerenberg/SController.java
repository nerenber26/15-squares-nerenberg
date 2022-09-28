package com.example.a15_squares_nerenberg;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SController implements View.OnClickListener{

    //button variables
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;
    private Button b9;
    private Button b10;
    private Button b11;
    private Button b12;
    private Button b13;
    private Button b14;
    private Button b15;
    private Button b16;
    private Button[] buttons;



    //controller constructor
    public SController(Button _b1, Button _b2, Button _b3, Button _b4,
                       Button _b5, Button _b6, Button _b7, Button _b8,
                       Button _b9, Button _b10, Button _b11, Button _b12,
                       Button _b13, Button _b14, Button _b15, Button _b16, Button[] _buttons){
        //initialize variables
        b1 = _b1;
        b2 = _b2;
        b3 = _b3;
        b4 = _b4;
        b5 = _b5;
        b6 = _b6;
        b7 = _b7;
        b8 = _b8;
        b9 = _b9;
        b10 = _b10;
        b11 = _b11;
        b12 = _b12;
        b13 = _b13;
        b14 = _b14;
        b15 = _b15;
        b16 = _b16;
        buttons = _buttons;

    }

    @Override
    public void onClick(View view) {
        //figure out which button was clicked, then do behavior

        //randomize button numbers
        if (view.getId() == R.id.bReset) {

            //possible numbers
            String[] numList = new String[]{"1", "2", "3", "4", "5", "6", "7", "8",
                                                "9", "10", "11", "12", "13", "14", "15"};

            //change it to a list in order to use shuffle
            List<String> stringList = Arrays.asList(numList);

            //shuffle values randomly
            Collections.shuffle(stringList);

            //turn list back into array
            stringList.toArray(numList);

            //set the text on the buttons
            b1.setText(numList[0]);
            b2.setText(numList[1]);
            b3.setText(numList[2]);
            b4.setText(numList[3]);
            b5.setText(numList[4]);
            b6.setText(numList[5]);
            b7.setText(numList[6]);
            b8.setText(numList[7]);
            b9.setText(numList[8]);
            b10.setText(numList[9]);
            b11.setText(numList[10]);
            b12.setText(numList[11]);
            b13.setText(numList[12]);
            b14.setText(numList[13]);
            b15.setText(numList[14]);
            b16.setText("");
        }

        //checks if nearby buttons are blank, if one is, switch text values with it

        if (view.getId() == R.id.b1) {
            if(b2.getText().toString().equals("")){
                b2.setText(b1.getText().toString());
                b1.setText("");
            }
            else if(b5.getText().toString().equals("")){
                b5.setText(b1.getText().toString());
                b1.setText("");
            }
        }
        if (view.getId() == R.id.b2) {
            if(b1.getText().toString().equals("")){
                b1.setText(b2.getText().toString());
                b2.setText("");
            }
            else if(b3.getText().toString().equals("")){
                b3.setText(b2.getText().toString());
                b2.setText("");
            }
            else if(b6.getText().toString().equals("")){
                b6.setText(b2.getText().toString());
                b2.setText("");
            }
        }
        if (view.getId() == R.id.b3) {
            if(b2.getText().toString().equals("")){
                b2.setText(b3.getText().toString());
                b3.setText("");
            }
            else if(b4.getText().toString().equals("")){
                b4.setText(b3.getText().toString());
                b3.setText("");
            }
            else if(b7.getText().toString().equals("")){
                b7.setText(b3.getText().toString());
                b3.setText("");
            }
        }
        if (view.getId() == R.id.b4) {
            b4.setText("4");
        }
        if (view.getId() == R.id.b15) {
            if(b16.getText().toString().equals("")){
                b16.setText(b15.getText().toString());
                b15.setText("");
            }
        }
        if (view.getId() == R.id.b16) {
            if(b15.getText().toString().equals("")){
                b15.setText(b16.getText().toString());
                b16.setText("");
            }
        }


        for(Button b : buttons){
            if( ("b" + b.getText().toString()).equals( b.getResources().
                    getResourceEntryName(b.getId()) )){
                b.setBackgroundColor(Color.GREEN);

            }
            else{
                b.setBackgroundColor(Color.BLUE);

            }
        }


    }
}
