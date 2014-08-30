/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Klaus Boeing
 */
public class TesteList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Criando uma lista simples com ArrayList
        ArrayList nomes = new ArrayList();
        nomes.add("klaus");
        nomes.add("mario");
        nomes.add("joana");

        //Percorrendo uma lista com for simples
        
        for (int i = 0; i < nomes.size(); i++) {
            String nome = (String)nomes.get(i);
            System.out.println(nomes.get(i));
        }
            
        //Percorrendo uma lista com for each, e atribuindo o valor em uma variável
        for (Object nome : nomes) {
            System.out.println(nome);
        }
        
        //Performcance - Acesso via get (ArrayList|LinkedList)
        //Múltiplos tipos e genérics
        ArrayList<String> animais = new ArrayList<>();
        
        animais.add("cao");
        animais.add("gato");
        
        for (int i = 0; i < animais.size(); i++) {
            String animal = animais.get(i);
        }
        
        //Percorrendo sem casting        
        for (String animal : animais) {
            System.out.println(animal);
        }
        
        //Usando as interfaces
        List list = transform(new String[]{"klaus","joao"});
        
        //Ordenando uma Lista de String
        List<String> alunos = new ArrayList<>();
        alunos.add("Marcos");
        alunos.add("Antonio");
        alunos.add("Bruno");
        
        System.out.println(alunos);
        
        //Collections.reverse, max, min
        Collections.reverse(alunos);
        Collections.max(alunos);
        Collections.min(alunos);
        
        //Consultando o valor de uma lista e obtendo o valor - contains, indexOf
        nomes.contains("Pedro");
        int idx = nomes.indexOf("Pedro");
    }

    
    public static List transform(String[] valores){
        return new LinkedList();
    }
    
}
