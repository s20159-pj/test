package net.radek;

import net.radek.Sklep;

import java.sql.SQLOutput;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sklep sklep = new Sklep();
        sklep.addTowar(666, "Smartfon", 655.99, 5);
        sklep.addTowar(555, "PC", 144.55,6);
        sklep.addTowar(777, "gówno", 9999999.85,6);

        sklep.zamówienie(List.of(666,555,777),"Radek");

        System.out.println(sklep.findAll());

    }
}
