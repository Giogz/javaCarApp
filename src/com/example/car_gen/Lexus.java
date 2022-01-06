package com.example.car_gen;

public class Lexus extends Car{
    private boolean hasLeatherSeats;

    public Lexus(String color, int year, int maxSpeed, boolean hasLeatherSeats){
        //super() passes  these values back to the parent
        super(color,year, maxSpeed);
        this.hasLeatherSeats = hasLeatherSeats;

    }

    @Override
    public String toString() {
        return "Lexus{" +
                "hasLeatherSeats=" + hasLeatherSeats +
                '}';
    }
}
