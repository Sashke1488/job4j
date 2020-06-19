package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void driveTransport() {
        System.out.println("bus drive");
    }

    @Override
    public void passengersTransport(int number) {
        System.out.println("passengers in the bus:" + number);
    }

    @Override
    public double fillFuelTransport(double fuel) {
        double priceFuel = 47.93;
        return fuel * priceFuel;
    }
}
