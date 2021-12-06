/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adaptateur;

/**
 *
 * @author M34LMAR
 */
public class Main {

    public static void main(String[] args) {

        //on crée le chargeur
        Chargeur chargeur = new Chargeur();
        IChargeable monCadeauCarrouf = new TelCarouf();
        chargeur.brancherPortable(monCadeauCarrouf);
        
        /**
         * ****************** Portable SonneEricSonne**********************
         */
        //on crée le portable et son adaptateur
        PortableSamSaoule sam = new PortableSamSaoule();
        
        IChargeable adapteurSam = new AdaptateurSamSaoule(sam);
        
        //on donne le portable à charger mais en utilisant son adaptateur
        chargeur.brancherPortable(adapteurSam);

        System.out.println("SamSaoule en charge ");

        /**
         * ******************* Portable SamSaoule**************************
         */
        //on crée le portable et son adaptateur
        PortableSonneEricSonne erick = new PortableSonneEricSonne();
        IChargeable adapteurErick = new AdaptateurSonneEricSonne(erick);
        //on donne le portable à charger mais en utilisant son adaptateur
        
        chargeur.brancherPortable(adapteurErick);
        System.out.println("SonneErickSonne en charge");

    }

}
