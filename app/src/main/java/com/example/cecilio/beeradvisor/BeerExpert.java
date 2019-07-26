package com.example.cecilio.beeradvisor;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<String>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
            brands.add("Es un comentario adicional");

        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
            brands.add("FH se agrego para probar la version");
            brands.add("CH se agrego para probar la version");
            brands.add("HA se agrego para probar la version");
            brands.add("TH se agrego para probar la version");
        }
        return brands;
    }
}
