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
public class Calculette {
    public int additionner(int a, int b){
        return a+b;
    }
    
    public int soustraire(int a, int b){
        return a-b;
    }
    
    public int multiplier(int a, int b){
        return a * b;
    }
    
    public int diviser(int a, int b) throws MonException{
        if(b == 0 ){
            throw new MonException("Erreur de dividende");
        }
        int resultat = a / b;
        return resultat;
    }
}
