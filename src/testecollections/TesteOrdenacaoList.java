/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Klaus Boeing
 */
public class TesteOrdenacaoList {

    public static void main(String[] args) {
        List<String> alunos = new ArrayList<>();
        alunos.add("Marcos");
        alunos.add("Antonio");
        alunos.add("Bruno");

        System.out.println(alunos);

        Collections.sort(alunos);
        
        System.out.println(alunos);
        
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(4);
        numeros.add(3);
        numeros.add(1);
        numeros.add(2);
                
        Collections.sort(numeros);
        System.out.println(numeros);
        
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Klaus", 4));
        pessoas.add(new Pessoa("Pedro", 3));
        pessoas.add(new Pessoa("Carlos", 1));
        pessoas.add(new Pessoa("Klaus", 2));
        
        Collections.sort(pessoas, new OrdenacaoPessoaPorDescricao());
        System.out.println(pessoas);
        
        Collections.sort(pessoas, new OrdenacaoPessoaPorDescricaoCodigo());
        System.out.println(pessoas);
        
    }

}
