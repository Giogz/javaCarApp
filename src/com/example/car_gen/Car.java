package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int maxSpeed){
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    public void accelerateSpeed(){
        if(speed + 5 <= maxSpeed){
        this.speed += 5;
        System.out.println(speed);
        } else {
            System.out.println("too fast");
        }
    }

    public void decelerateSpeed(){
        if(speed >= 0){
            this.speed -= 5;
            System.out.println(speed);
        } else {
            System.out.println("too slow");
        }
    }

    public void convertToElectric(){
        if(isElectric){
            System.out.println("yes it his electric already");
        } else {
            this.isElectric =true;
        }

    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", isElectric=" + isElectric +
                '}';
    }


}
