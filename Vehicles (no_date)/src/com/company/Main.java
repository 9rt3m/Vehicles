package com.company;

import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver("Петрович", 68);

        Engine engine = new Engine(1000, "Opel");

        Lorry lorry = new Lorry("UAZ", "Грузовой", 6000, driver, engine, 100000);

        System.out.println(lorry.toString());

        System.out.println("Производитель двигателя: " + lorry.getEngine().getManufacturer());

        lorry.getEngine().setManufacturer("Mercedes");

        System.out.println("Производитель двигателя после изменений: " + lorry.getEngine().getManufacturer());
    }
}
