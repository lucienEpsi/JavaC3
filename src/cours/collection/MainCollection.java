/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javac3.Personne;

/**
 *
 * @author 33676
 */
public class MainCollection {
    public static void main(String[] args) {
        List<String> chaines = new ArrayList<>();
        for(int i = 0; i< 100; i++){
            chaines.add("ch"+i);
        }
        List<String> chaines2 = new ArrayList<>();
        for(int i = 50; i< 100; i++){
            chaines2.add("ch"+i);
        }
        System.out.println("Affichage brut");
        for(String s : chaines){
            System.out.println(s);
        }
        System.out.println("Tri des chaines");
        Collections.sort(chaines);
        for(String s : chaines){
            System.out.println(s);
        }
        
        List<Personne> ps = new ArrayList<>();
        for(int i = 0; i< 100; i++){
            ps.add(new Personne("ch"+i, "pr"+(100-i)));
        }
        System.out.println("Affichage des personnes brutes");
        for(Personne p : ps){
            System.out.println(p);
        }
        Collections.sort(ps);
        System.out.println("Affichage des personnes trie par nom");
        for(Personne p : ps){
            System.out.println(p);
        }
        
        Collections.sort(ps, new MonComparator());
        System.out.println("Affichage des personnes trie par prenom");
        for(Personne p : ps){
            System.out.println(p);
        }
        
        Collections.sort(ps, new Comparator<Personne>() {
            @Override
            public int compare(Personne o1, Personne o2) {
                return o1.getPrenom().compareTo(o2.getPrenom()); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        System.out.println("Union de chaines");
        Collection<String> union = new ArrayList<>(chaines);
        union.addAll(chaines2);
        
        for(String s : union){
            System.out.println(s);
        }
        System.out.println("Suppresion de doublons");
        Set<String> noDoublons = new TreeSet<>(union);
        for(String s : noDoublons){
            System.out.println(s);
        }
    }
}
