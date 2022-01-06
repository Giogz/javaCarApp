package com.example.car_gen;

public class Toyota extends Car {
    private boolean greatGasMileage;

    public Toyota(String color, int year, int maxSpeed, boolean greatGasMileage) {
        super(color, year, maxSpeed);
        this.greatGasMileage = greatGasMileage;
    }

    @Override
    public String toString() {
        return "Toyota{" +
                "greatGasMileage=" + greatGasMileage +
                '}';
    }
}
