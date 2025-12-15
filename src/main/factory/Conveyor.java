package main.factory;

import main.exception.CountyFactoryNotEqualException;

public class Conveyor {
    private Factory factory;
    private String country;

    public Conveyor(Factory factory, String country) {
        this.factory = factory;
        this.country = country;
        if(!country.equals(factory.getCountry())) {
            throw new CountyFactoryNotEqualException();
        }
    }
}
