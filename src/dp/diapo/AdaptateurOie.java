/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.diapo;

/**
 *
 * @author 33676
 */
public class AdaptateurOie implements EmissionSonore{
    private Oie monOie;
    
    public AdaptateurOie(Oie o){
        monOie = o;
    }
    @Override
    public void emetUnSon() {
        monOie.cancanne();
    }
    
}
