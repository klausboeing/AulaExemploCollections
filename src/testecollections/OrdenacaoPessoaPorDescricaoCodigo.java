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
public class OrdenacaoPessoaPorDescricaoCodigo implements Comparator<Pessoa>{

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        String codigoDescricao1 = pessoa1.getNome() + pessoa1.getCodigo();
        String codigoDescricao2 = pessoa2.getNome() + pessoa2.getCodigo();
        
        return codigoDescricao1.compareTo(codigoDescricao2);
    }
    
}
