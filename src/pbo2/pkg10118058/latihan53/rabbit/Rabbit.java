/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan53.rabbit;

/**
 *
 * @author user
 */
public class Rabbit extends Animal {
private String color,name;

    public Rabbit(String name,boolean vegetarian, String eats, int noOfLegs,String color) {
        super(vegetarian, eats, noOfLegs);
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
}
