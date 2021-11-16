/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cours.collection;

import java.util.Comparator;
import javac3.Personne;

/**
 *
 * @author 33676
 */
public class MonComparator implements Comparator<Personne>{

    @Override
    public int compare(Personne o1, Personne o2) {
        return o1.getPrenom().compareTo(o2.getPrenom());
    }
    
}
