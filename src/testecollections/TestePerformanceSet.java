/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testecollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Klaus Boeing
 */
public class TestePerformanceSet {
    public static void main(String[] args) {
//        List<Integer> numeros = new ArrayList<>();
        Collection<Integer> numeros = new ArrayList<>();
        
        for (int i = 0; i < 100000; i++) {
            numeros.add(i);
        }
        
        long inicio = System.currentTimeMillis();
        
        for (int i = 0; i < 100000; i++) {
            numeros.contains(i);
        }
        
        long fim = System.currentTimeMillis() - inicio;
        
        System.out.println(fim);

    }
 
}
