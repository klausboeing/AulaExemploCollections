/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testecollections;

import java.util.Comparator;

/**
 *
 * @author Klaus Boeing
 */
public class OrdenacaoPessoaPorDescricao implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return pessoa1.getNome().compareTo(pessoa2.getNome());
    }
    
}
