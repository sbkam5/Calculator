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
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
        buttonBack, buttonClear, buttonDivide, buttonMult, buttonAdd, buttonSubtract, buttonEqual,
        buttonDecimal, buttonPercent, startP, endP;

    EditText edt1;

    Boolean backSpace = false;
    Boolean starting = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link declared variables to the buttons and text editor
        buttonEqual = (Button) findViewById(R.id.button19);
        edt1 = (EditText) findViewById(R.id.editText);
        button0 = (Button) findViewById(R.id.button17);
        button1 = (Button) findViewById(R.id.button13);
        button2 = (Button) findViewById(R.id.button14);
        button3 = (Button) findViewById(R.id.button15);
        button4 = (Button) findViewById(R.id.button9);
        button5 = (Button) findViewById(R.id.button10);
        button6 = (Button) findViewById(R.id.button11);
        button7 = (Button) findViewById(R.id.button5);
        button8 = (Button) findViewById(R.id.button6);
        button9 = (Button) findViewById(R.id.button7);
        buttonBack = (Button) findViewById(R.id.button2);
        buttonClear = (Button) findViewById(R.id.button);
        buttonDivide = (Button) findViewById(R.id.button4);
        buttonMult = (Button) findViewById(R.id.button8);
        buttonAdd = (Button) findViewById(R.id.button16);
        buttonSubtract = (Button) findViewById(R.id.button12);
        buttonDecimal = (Button) findViewById(R.id.button18);
        buttonPercent = (Button) findViewById(R.id.button3);

        //when user clicks on equal, it will pass the string in text editor to calc method
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eq = edt1.getText().toString();  //calc string from text editor first
                double result = calc(eq);
                eq = Double.toString(result);

                edt1.setText(eq);

                starting = true;      //reset starting conditions of code
                backSpace = false;
            }
        });

        button0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(starting){
                    edt1.setText("0 ");  //if the app is starting out, you can directly input number
                }
                else if(!backSpace) {
                    edt1.setText(edt1.getText() + "0 ");  //if backspace is not true, just add in the number
                }
                else{
                    String temp = edt1.getText().toString();  //if backspace is true, do a backspace before entering in a number
                    int len = temp.length();
                    temp = temp.substring(0,len-1);
                    edt1.setText(temp + "0 ");
                }
                backSpace = true;
                starting = false;
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){  //look at comments for button zero
                if(starting){
                    edt1.setText("1 ");
                }
                else if(!backSpace) {
                    edt1.setText(edt1.getText() + "1 ");
                }
                else{
                    String temp = edt1.getText().toString();
                    int len = temp.length();
                    temp = temp.substring(0,len-1);
                    edt1.setText(temp + "1 ");
                }
                backSpace = true;
                starting = false;
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){  //look at comments for button zero
                if(starting){
                    edt1.setText("2 ");
                }
                else if(!backSpace) {
                    edt1.setText(edt1.getText() + "2 ");
                }
                else{
                    String temp = edt1.getText().toString();
                    int len = temp.length();
                    temp = temp.substring(0,len-1);
                    edt1.setText(temp + "2 ");
                }
                backSpace = true;
                starting = false;
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){  //look at comments for button zero
                if(starting){
                    edt1.setText("3 ");
                }
                else if(!backSpace) {
                    edt1.setText(edt1.getText() + "3 ");
                }
                else{
                    String temp = edt1.getText().toString();
                    int len = temp.length();
                    temp = temp.substring(0,len-1);
                    edt1.setText(temp + "3 ");
                }
                backSpace = true;
                starting = false;
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){  //look at comments for button zero.
                if(starting){
                    edt1.setText("4 ");
                }
                else if(!backSpace) {
                    edt1.setText(edt1.getText() + "4 ");
                }
                else{
                    String temp = edt1.getText().toString();
                    int len = temp.length();
                    temp = temp.substring(0,len-1);
                    edt1.setText(temp + "4 ");
                }
                backSpace = true;
                starting = false;
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){  //look at comments for button zero.
                if(starting){
                    edt1.setText("5 ");
                }
                else if(!backSpace) {
                    edt1.setText(edt1.getText() + "5 ");
                }
                else{
                    String temp = edt1.getText().toString();
                    int len = temp.length();
                    temp = temp.substring(0,len-1);
                    edt1.setText(temp + "5 ");
                }
                backSpace = true;
                starting = false;
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){  //look at comments for button zero.
                if(starting){
                    edt1.setText("6 ");
                }
                else if(!backSpace) {
                    edt1.setText(edt1.getText() + "6 ");
                }
                else{
                    String temp = edt1.getText().toString();
                    int len = temp.length();
                    temp = temp.substring(0,len-1);
                    edt1.setText(temp + "6 ");
                }
                backSpace = true;
                starting = false;
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){  //look at comments for button zero.
                if(starting){
                    edt1.setText("7 ");
                }
                else if(!backSpace) {
                    edt1.setText(edt1.getText() + "7 ");
                }
                else{
                    String temp = edt1.getText().toString();
                    int len = temp.length();
                    temp = temp.substring(0,len-1);
                    edt1.setText(temp + "7 ");
                }
                backSpace = true;
                starting = false;
            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){  //look at comments for button zero.
                if(starting){
                    edt1.setText("8 ");
                }
                else if(!backSpace) {
                    edt1.setText(edt1.getText() + "8 ");
                }
                else{
                    String temp = edt1.getText().toString();
                    int len = temp.length();
                    temp = temp.substring(0,len-1);
                    edt1.setText(temp + "8 ");
                }
                backSpace = true;
                starting = false;
            }
        });

        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){  //look at comments for button zero
                if(starting){
                    edt1.setText("9 ");
                }
                else if(!backSpace) {
                    edt1.setText(edt1.getText() + "9 ");
                }
                else{
                    String temp = edt1.getText().toString();
                    int len = temp.length();
                    temp = temp.substring(0,len-1);
                    edt1.setText(temp + "9 ");
                }
                backSpace = true;
                starting = false;
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edt1.setText(edt1.getText() + "+ ");
                backSpace = false;  //never backspace after an operator. Also program is no longer starting
                starting = false;
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edt1.setText(edt1.getText() + "- ");
                backSpace = false;  //look at comment for Add button
                starting = false;
            }
        });

        buttonMult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edt1.setText(edt1.getText() + "* ");
                backSpace = false;  //look at comments for add button
                starting = false;
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edt1.setText(edt1.getText() + "/ ");
                backSpace = false;  //look at comments for add button
                starting = false;
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String temp = edt1.getText().toString();
                int strlen = temp.length();
                temp = temp.substring(0,strlen-1);  //decimal should always be input after a number, so a backspace is mandatory.
                edt1.setText(temp +  ". ");
                backSpace = true;
                starting = false;
            }
        });

        //when user clicks on percent sign, a percent will be added
        buttonPercent.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String temp = edt1.getText().toString();
                temp = percent(temp);  //call percent function on string to convert the string
                edt1.setText(temp);
                backSpace = true;
                starting = false;
            }
        });

        //when user clicks on "back" button, a backspace will be simulated.
        buttonBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String temp = edt1.getText().toString();
                int strlen = temp.length();
                temp = temp.substring(0,strlen-1);
                edt1.setText(temp);
                backSpace = false;
                starting = false;
            }
        });

        //when user clicks on "AC", the entire line will be cleared.
        buttonClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                edt1.setText("0");
                starting = true;
                backSpace = false;
            }
        });


    }

    //this method splits a string into an arraylist of strings to calculate and returns the calcualted result
    public static double calc(String s){
        String[] e = s.split(" ");
        ArrayList<String> a = new ArrayList<String>(Arrays.asList(e));

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

    //converts a number to its percent equivalent
    public static String percent(String s){

        String[] e = s.split(" ");
        ArrayList<String> a = new ArrayList<String>(Arrays.asList(e));
        int len = a.size(); //find size of arraylist.  The number to replace will be at the end

            double temp = Double.parseDouble(a.get(len-1));  //number always goes before percent
            temp /= 100;
            String tempString = Double.toString(temp);  //find double equivalent of percent string

            a.remove(len-1);  // replace last num with its percent equivalent
            a.add(tempString);

        String r = a.get(0) + " ";
        for(int i = 1; i < len; i++){
            r = r.concat(a.get(i) + " ");
        }

        return r;
    }
}
