package edu.niu.cs.z1761257.burgerapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends Activity {

    //instance variables
    private RadioGroup pattyRG;
    private CheckBox baconCB;
    private RadioGroup cheeseRG;
    private SeekBar sauceSB;
    private TextView caloriesTV;

    private Burger burger;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //create the burger object
        burger = new Burger();

        //connect variable and screen items
        pattyRG = (RadioGroup)findViewById(R.id.pattyRadioGroup);
        baconCB = (CheckBox)findViewById(R.id.baconCheckBox);
        cheeseRG = (RadioGroup)findViewById(R.id.cheeseRadioGroup);
        sauceSB = (SeekBar)findViewById(R.id.sauseSeekBar);
        caloriesTV = (TextView)findViewById(R.id.caloriesTextBox);

        //display the initial calorie count
        displayCalories();

        //setup the listeners
        pattyRG.setOnCheckedChangeListener( burgerListener );

        cheeseRG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.noCheeseRadioButton: burger.setCheeseCalories(0);
                        break;
                    case R.id.cheddarRadioButton: burger.setCheeseCalories(Burger.CHEDDAR);
                        break;
                    case R.id.mozzarellaRadioButton3: burger.setCheeseCalories(Burger.MOZZ);
                        break;
                }//end of switch
                displayCalories();
            }
        });//end of setOnCheckedChangeListener for Cheese

        baconCB.setOnClickListener(baconListener);
        sauceSB.setOnSeekBarChangeListener(sauceListener);

    }//end of OnCreate

    private RadioGroup.OnCheckedChangeListener burgerListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch(checkedId){
                case R.id.beefRadioButton:  burger.setPattyCalories(Burger.BEEF);
                    break;
                case R.id.turkeyRadioButton: burger.setPattyCalories(Burger.TURKEY);
                    break;
                case R.id.veggieRadioButton: burger.setPattyCalories(Burger.VEGGIE);
                    break;

            }//end of Switch
            displayCalories();
        }
    };//end of OnCheckedChangeListener for burger patty



}//end of MainActivity
