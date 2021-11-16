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
public class TestPerfChaine {
    public static void main1(String[] args) {
        long debut = System.currentTimeMillis();
        System.out.println(debut);
        String resultat="";
        String nom = "MARTIN";
        for(int i = 0; i<1000000;i++){
            resultat = resultat+nom;
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin);
    }
    
    public static void main(String[] args) {
        long debut = System.currentTimeMillis();
        System.out.println(debut);
        StringBuffer resultat= new StringBuffer();
        String nom = "MARTIN";
        for(int i = 0; i<10000000;i++){
            resultat = resultat.append(nom);
        }
        String r = resultat.toString();
        long fin = System.currentTimeMillis();
        System.out.println(fin);
    }
}
