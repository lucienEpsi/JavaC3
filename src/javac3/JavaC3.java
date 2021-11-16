/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javac3;

/**
 *
 * @author Lucien
 */
public class JavaC3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bienvenue");
        Personne p = new Personne();
        p.setNom("Martos");
        p.setPrenom("Lucien");
        System.out.println("Nom + Prenom "+p.getNom()+" "+p.getPrenom());
        System.out.println(p);
        Personne p1;
        p1 = new Personne("Martos","Lucien");
        
        System.out.println(p1.getNom()+" "+p1.getPrenom());
        System.out.println(p.getNom().substring(0,1));
        
        System.out.println(p == p1);
        System.out.println(p.equals(p1));
    }
    
}
