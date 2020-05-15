package ru.job4j.tracker;

public class Doctor extends Profession {

    private TherapistType therapistType;

    public Diagnose health(Patient patient) {
        return new Diagnose();
    }
}
