/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testecollections;

import java.util.Objects;

/**
 *
 * @author Klaus Boeing
 */
public class Pessoa implements Comparable<Pessoa>{
  
    private String nome;
    
    private int codigo;

    public Pessoa(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", codigo=" + codigo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    @Override
    public int compareTo(Pessoa obj) {
        return codigo - obj.getCodigo();
    }
}
