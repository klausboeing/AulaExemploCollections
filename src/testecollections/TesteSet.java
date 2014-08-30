/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testecollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author Klaus Boeing
 */
public class TesteSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando e imprimindo um Set simples com um item repetido  - HashSet
        Set<String> nomes = new HashSet<>();
        nomes.add("Klaus");
        nomes.add("Pedro");
        nomes.add("Pedro");
        
        System.out.println(nomes);
        
        //Performance com Set - TestePerformanceSet
        //Interface Collection - TestePerformanceSet
        //Usando um Iterator para percorrer e remover

        Iterator<String> iterator = nomes.iterator();
        
        while(iterator.hasNext()){
            String nome = iterator.next();
            if(nome.equals("Pedro")){
                iterator.remove();
            }
        }
        
        System.out.println(nomes);
    }
    
}
