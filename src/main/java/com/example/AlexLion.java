package com.example;

import java.awt.print.Printable;
import java.util.List;

public class AlexLion extends Lion {
    //private Feline feline;

    public AlexLion(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends(){
        return List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens(){
        return 0;
    }
}
