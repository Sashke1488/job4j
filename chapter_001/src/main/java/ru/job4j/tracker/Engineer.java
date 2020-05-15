package ru.job4j.tracker;

public class Engineer extends Profession {

    private EngineerType engineerType;

    public Model create(TechnicalRequirement technicalRequirement) {
        return new Model();
    }
}
