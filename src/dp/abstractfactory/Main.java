/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.abstractfactory;

import dp.abstractfactory.usine.UsineMichelin;
import dp.abstractfactory.usine.UsineFirestone;

/**
 *
 * @author 33676
 */
public class Main {

    public static void main(String[] args) {
        //AbstractProductA : PneuNeige
        //AbstractProductB : PneuSport

        //AbstractFactory : Garage
        //ConcreteFactory1 : UsineMichelin
        //ConcreteFactory2 : UsineFirestone
        Garage monFournisseur = donneMoiUsineAlea();
        for (int i = 0; i < 5; i++) {
            PneuNeige pn = monFournisseur.createPneuNeige();
            System.out.println(pn);
            PneuSport ps = monFournisseur.createPneuSport();
            System.out.println(ps);
            monFournisseur = donneMoiUsineAlea();
        }
    }

    private static Garage donneMoiUsineAlea() {
        int v = (int) (Math.random() * 10);
        Garage valRetour = new UsineFirestone();
        if (v % 2 == 0) {
            valRetour = new UsineMichelin();
        }
        return valRetour;
    }
}
