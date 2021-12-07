/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.composite;

/**
 *
 * @author 33676
 */
public class Main {
    //feuille : fichier
    //composite : repertoire
    //composant est soit une feuille soit un repertoire

    //afficher le contenu d'un repertoire :
    //le nom du composant 
    //cas repertoire (on demande l'affichage du repertoire)
    //cas fichier : 
    public static void main(String[] args) {

//Cellulose appelation generique du composant
        //Feuille feuille de l'arbre
        //branche composite 
        //Creer un tronc
        Cellulose monTron = new Branche();
        ((Branche) monTron).add(new Branche());
        ((Branche) monTron).add(new Branche());
        ((Branche) monTron).add(new Branche());
        
        
        Branche b1 = new Branche();
        b1.add(new Feuille());                   // | 0 
        Branche b2 = new Branche();              // |
        b2.add(b1);
        
        ((Branche) monTron).add(b2);
        
        monTron.afficheToi();
        
        //Pizza Pate
        //pizza Pate + tomate
        // Pizza Pate + ....
        
    }
}
