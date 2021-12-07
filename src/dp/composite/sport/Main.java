/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.composite.sport;

/**
 *
 * @author 33676
 */
public class Main {
    public static void main(String[] args) {
        Produit maBarre = new Barre();
        maBarre.setPrix(25f);
        maBarre.setDescriptif("Barre d'haltérophilie");
        maBarre.setCodeBarre("BA0001");
        ((Barre)maBarre).setLongueur(150f);

        Produit leger = new Poids();
        leger.setPrix(15f);
        leger.setDescriptif("Poids d'haltère");
        leger.setCodeBarre("PA0001");
        ((Poids)leger).setPoids(0.5f);

        Produit moyen = new Poids();
        moyen.setPrix(17f);
        moyen.setDescriptif("Poids d'haltère");
        moyen.setCodeBarre("PA0002");
        ((Poids)moyen).setPoids(1f);

        Produit lourd = new Poids();
        lourd.setPrix(19f);
        lourd.setDescriptif("Poids d'haltère");
        lourd.setCodeBarre("PA0003");
        ((Poids)lourd).setPoids(1.5f);

        Produit haltere = new ProduitComposite();
        ((ProduitComposite)haltere).add(maBarre);
        ((ProduitComposite)haltere).add(leger);
        ((ProduitComposite)haltere).add(moyen);
        ((ProduitComposite)haltere).add(lourd);
        System.out.println(haltere.getPrix());
        
    }
}
