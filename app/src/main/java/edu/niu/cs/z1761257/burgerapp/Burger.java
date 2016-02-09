package edu.niu.cs.z1761257.burgerapp;

/**
 * Created by Pravin on 2/9/16.
 */
public class Burger {

    //constants
    static final int BEEF = 90, TURKEY = 170, VEGGIE = 150,
                    CHEDDAR = 113, MOZZ = 78,
                    BACON = 86;

    //instance variables
    private int pattyCalories, cheeseCalories, baconCalories, sauceCalories;

    public Burger(){

        pattyCalories = VEGGIE;
        cheeseCalories = 0;
        baconCalories = 0;
        sauceCalories = 0;

    }//End of Burger constructor

    public void setPattyCalories(int newCalories){

        pattyCalories = newCalories;

    }//end of setPattyCalories

    public void setCheeseCalories(int newCalories){

        cheeseCalories = newCalories;

    }//end of setCheeseCalories

    public void setSauceCalories(int newCalories){

        sauceCalories = newCalories;

    }//end of setSauceCalories

    public void setBaconCalories(boolean hasBacon){

        if(hasBacon){
            baconCalories = BACON;
        }else{
            baconCalories = 0;
        }

    }//end of setBaconCalories

    public int getTotalCalories(){

        return pattyCalories + cheeseCalories + baconCalories + sauceCalories;

    }//end of getTotalCalories

    

}//end of Burger Class
