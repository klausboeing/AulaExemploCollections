/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testecollections;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Klaus Boeing
 */
public class TestePerformanceList {

    public static void main(String[] args) {
        
//        LinkedList nomes = new LinkedList();
        ArrayList nomes = new ArrayList();
        
        for (int i = 0; i < 100000; i++) {
            nomes.add(i);
        }
        
        long inicio = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
            nomes.get(i);
        }
        
        long fim = System.currentTimeMillis() - inicio;
        
        System.out.println(fim);
    }
    
}
