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
public class PBO210118058Latihan53Rabbit {

    /**
     * @param args the command line arguments
     *  Nama:Satyaning Andaru bawalaksana
     * Nim: 10118058
     * kelas : If-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit r = new Rabbit("peter",false,"grass",4,"grey");
        System.out.println("Hello , his name is " +r.getName());
        System.out.println("Peter is Vegetarian ? "+r.isVegetarian());
        System.out.println("Peter has "+r.getNoOfLegs()+" legs");
        System.out.println("Peter color is "+r.getColor());
    }
    
}
