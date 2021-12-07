/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decorateur;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author 33676
 */
public class Main2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\33676\\Documents\\NetBeansProjects\\DesignPattern\\src\\adaptateur\\AdaptateurSamSaoule.java");
        BufferedReader br = new BufferedReaderMaj(fr);
        while(br.ready()){
            System.out.println((br.readLine()));
        }
        br.close();
    }
}
