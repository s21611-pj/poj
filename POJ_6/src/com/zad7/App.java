package com.zad7;
/**
 * Exercise 7
 * Author: Wojtek Turek
 */

import java.util.ArrayList;

import java.util.Collections;

public class App {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzaList = new ArrayList<>();

        pizzaList.add(new PizzaDeluxe(1500,"Capriciosa", 21.99, 30,true,false));
        pizzaList.add(new PizzaDeluxe(1500,"Diavolo", 23.99, 30,false,false));
        pizzaList.add(new PizzaDeluxe(1500,"Carbonara", 22.99, 30,false,false));
        pizzaList.add(new PizzaDeluxe(1500,"Wiejska", 25.99, 30,false,false));
        pizzaList.add(new PizzaDeluxe(1500,"Szynka", 24.99, 30,false,false));
        pizzaList.add(new PizzaDeluxe(1500,"Hawajska", 20.99, 30,false,false));
        pizzaList.add(new PizzaDeluxe(1500,"Margherita", 26.99, 30,false,false));
        pizzaList.add(new PizzaDeluxe(1500,"Pepperoni", 27.99, 30,false,false));
        pizzaList.add(new PizzaDeluxe(1500,"Tunczyk", 28.99, 30,false,false));
        pizzaList.add(new PizzaDeluxe(1500,"FruttiDiMare", 29.99, 30,false,false));
        pizzaList.add(new PizzaDeluxe(1500,"Rustica", 32.99, 30,false,false));
        pizzaList.add(new PizzaDeluxe(1500,"CzterySery", 31.99, 30,false,false));
        pizzaList.add(new PizzaDeluxe(1500,"Góralska", 30.99, 30,false,false));

        pizzaList.add(new PizzaSpecial(1900,"Capriciosa", 26.99, 40,true,false));
        pizzaList.add(new PizzaSpecial(1900,"Diavolo", 28.99, 40,true,false));
        pizzaList.add(new PizzaSpecial(1900,"Carbonara", 27.99, 40,true,false));
        pizzaList.add(new PizzaSpecial(1900,"Wiejska", 30.99, 40,true,false));
        pizzaList.add(new PizzaSpecial(1900,"Szynka", 29.99, 40,true,false));
        pizzaList.add(new PizzaSpecial(1900,"Hawajska", 25.99, 40,true,false));
        pizzaList.add(new PizzaSpecial(1900,"Margherita", 31.99, 40,true,false));
        pizzaList.add(new PizzaSpecial(1900,"Pepperoni", 32.99, 40,true,false));
        pizzaList.add(new PizzaSpecial(1900,"FruttiDiMare", 34.99, 40,true,false));
        pizzaList.add(new PizzaSpecial(1900,"CzterySery", 36.99, 40,true,false));
        pizzaList.add(new PizzaSpecial(1900,"Góralska", 35.99, 40,true,false));
        pizzaList.add(new PizzaSpecial(1900,"Kebab", 38.99, 40,true,false));

        pizzaList.add(new PizzaWoogy(2500,"Capriciosa", 31.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"Diavolo", 33.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"Carbonara", 32.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"Wiejska", 35.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"Szynka", 34.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"Hawajska", 30.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"Margherita", 36.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"Pepperoni", 37.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"FruttiDiMare", 39.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"CzterySery", 41.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"Góralska", 40.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"Kebab", 43.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"Rustica", 42.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"Oliwki", 31.99, 60,true,true));
        pizzaList.add(new PizzaWoogy(2500,"Vege", 34.99, 60,true,true));

        Collections.sort(pizzaList);

        changeCheese(2, pizzaList);
        changeCrust(39, pizzaList);
        biggerSize(38, pizzaList);

        for(Pizza i : pizzaList){
            System.out.println(i);
        }
    }

    static void changeCheese(int index, ArrayList pizzaList) {
        if(pizzaList.get(index) instanceof PizzaDeluxe){
            ((PizzaDeluxe) pizzaList.get(index)).changeCheese();
        }
        if(pizzaList.get(index) instanceof PizzaSpecial){
            ((PizzaSpecial) pizzaList.get(index)).changeCheese();
        }
        if(pizzaList.get(index) instanceof PizzaWoogy){
            ((PizzaWoogy) pizzaList.get(index)).changeCheese();
        }
    }

    static void biggerSize(int index, ArrayList pizzaList) {
        if(pizzaList.get(index) instanceof PizzaDeluxe){
            ((PizzaDeluxe) pizzaList.get(index)).doubleSize();
        }
        if(pizzaList.get(index) instanceof PizzaSpecial){
            ((PizzaSpecial) pizzaList.get(index)).doubleSize();
        }
        if(pizzaList.get(index) instanceof PizzaWoogy){
            ((PizzaWoogy) pizzaList.get(index)).doubleSize();
        }
    }

    static void changeCrust(int index, ArrayList pizzaList) {
        if(pizzaList.get(index) instanceof PizzaDeluxe){
            ((PizzaDeluxe) pizzaList.get(index)).changeCrust();
        }
        if(pizzaList.get(index) instanceof PizzaSpecial){
            ((PizzaSpecial) pizzaList.get(index)).changeCrust();
        }
        if(pizzaList.get(index) instanceof PizzaWoogy){
            ((PizzaWoogy) pizzaList.get(index)).changeCrust();
        }
    }

}
