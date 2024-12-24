package com.example;

import java.util.List;

public class AlexTheLion extends Lion{

    private Feline feline;
    private String placeOfLiving = "Нью-Йоркский зоопарк";
    private List<String> friends = List.of("Марти", "Глория", "Мелман");

    public AlexTheLion(Feline feline) throws Exception {
        super( "Самец");
        this.feline = feline;
    }

    @Override
    public int getKittens() {
        return feline.getKittens(0);
    }

    public List<String> getFriends() {
        return friends;
    }

    public String getPlaceOfLiving() {
        return placeOfLiving;
    }
}
