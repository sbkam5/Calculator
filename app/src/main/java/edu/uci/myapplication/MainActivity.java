package edu.uci.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    //declare variable buttons and text editor
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9,
        buttonBack, buttonClear, buttonDivide, buttonMult, buttonAdd, buttonSubtract, buttonEqual;

    EditText edt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link declred variables to the buttons and text editor
        buttonEqual = (Button) findViewById(R.id.button19);
        edt1 = (EditText) findViewById(R.id.editText);

        //when user clicks on equal, it will pass the string in text editor to calc method
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eq = edt1.getText().toString();  //calc string from text editor first
                double result = calc(eq);
                eq = Double.toString(result);

                edt1.setText(eq);
            }
        });
    }

    //this method splits a string into an arraylist of strings to calculate and returns the calcualted result
    public static double calc(String s){
        String[] e = s.split(" ");
        ArrayList<String> a = new ArrayList<String>(Arrays.asList(e));

        int perc = a.indexOf("%"); //search for any percent symbols to replace
        while(perc > -1){
            //find substring to replace
            double temp = Double.parseDouble(a.get(perc-1));  //number always goes before percent
            temp /= 100;
            String tempString = Double.toString(temp);  //find double equivalent of percent string

            a.remove(perc-1);  // replace percent with double
            a.remove(perc-1);
            a.add(perc-1, tempString);
            perc = a.indexOf("%");
        }

        int length = a.size();
        int firstIndex = -1;
        int secondIndex = -1;

        //find any parenthesis.
        for(int i = 0; i < length; i++){
            if((a.get(i)).equals("(")){
                firstIndex = i;
            }
            else if(a.get(i).equals(")")){
                secondIndex = i;
            }
        }

        //if a pair of parenthesis are found, calculate the string inside them first
        if(firstIndex > -1 && secondIndex > -1){
            ArrayList<String> temp = new ArrayList<String>(a.subList(firstIndex+1, secondIndex));
            double tempDouble = actualCalc(temp);

            for(int i = 1; i <= 5; i++) {
                a.remove(firstIndex);
            }

            a.add(firstIndex, Double.toString(tempDouble));

        }

        double r = actualCalc(a);

        return r;
    }

    //this method carries out the actual calculations of the program
    public static double actualCalc(ArrayList<String> e){
        double r = Double.parseDouble(e.get(0));
        int length = e.size();

        for(int i = 0; i < length; i++){
            switch (e.get(i)){
                case "+": r += Double.parseDouble(e.get(i+1));
                    break;
                case "-": r -= Double.parseDouble(e.get(i+1));
                    break;
                case "/": r /= Double.parseDouble(e.get(i+1));
                    break;
                case "*": r *= Double.parseDouble(e.get(i+1));
                    break;
                default: //do nothing on numbers
                    break;
            }
        }

        return r;
    }
}
