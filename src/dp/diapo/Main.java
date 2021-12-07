/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.diapo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 33676
 */
public class Main {
    public static void main(String[] args) {
        List<EmissionSonore> emis = new ArrayList<>();
        emis.add(new Appeau());
        emis.add(new Morillon());
        emis.add(new CanardC());
        emis.add(new Appeau());
        emis.add(new Morillon());
        emis.add(new AdaptateurOie(new Oie()));
        for(EmissionSonore e : emis){
            e.emetUnSon();
        }
    }
}
