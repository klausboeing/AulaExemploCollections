/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testecollections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Klaus Boeing
 */
public class TesteMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, Pessoa> mapa = new HashMap();
        mapa.put(1, new Pessoa("Klaus", 1));
        mapa.put(2, new Pessoa("Pedro", 2));
        
        Pessoa pessoa = mapa.get(1);
        
        System.out.println(pessoa.getNome());
    }
    
}
