/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javac3;

/**
 *
 * @author 33676
 */
public class Main {

    public static void main(String[] args) {
        Calculette c = new Calculette();
        System.out.println("addition de 10 et 20 " + c.additionner(10, 20));
        try {

            System.out.println("division de 10 et 0 " + c.diviser(10, 0));
        } catch (MonException e) {
            System.out.println(e.getMessage());
        }
    }
}
