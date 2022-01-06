package com.example.car_gen;


import javax.annotation.processing.SupportedSourceVersion;

public class Main {

    public static void main(String[] args){
        // inside main method is where we will work
        Honda civic = new Honda("black", 2011, 280, false);
        Lexus rx350 = new Lexus("red", 2014, 380, true);
        Toyota supra = new Toyota("blue", 2021, 180, false);



       civic.accelerateSpeed();
       civic.accelerateSpeed();
       civic.accelerateSpeed();
       civic.accelerateSpeed();


       civic.decelerateSpeed();
       civic.decelerateSpeed();
       civic.decelerateSpeed();

       civic.convertToElectric();
       civic.convertToElectric();



    }
}
