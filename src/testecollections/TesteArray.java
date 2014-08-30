/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testecollections;

/**
 *
 * @author Klaus Boeing
 */
public class TesteArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Arrays não são redimencionaveis.
    String[] nomes = new String[]{"klaus","Mario"};
        
    //Não conseguimos saber quantas posições estão ocupadas, sem algum código auxiliar.
        int itensPopulados = 0;
        for (String nome : nomes) {
            if(nome != null){
                System.out.println(nome.toLowerCase());
                itensPopulados++;
            }
        }
        int itens = nomes.length;
        
    //Precisamos manter informações externas ao array, caso queiramos adicionar itens na última posição disponível.
        int pos = 0;
        
        String[] valores = new String[10];
        valores[pos++] = "123";
        valores[pos++] = "456";
        
        
    //Ao remover um item, precisamos setar a posição com o valor para nulo, 
    //adicionando complexidade para percorrermos um array, pois precisaremos 
    //tratar posiveis valores nulos durante a iteração
        
        nomes[0] = null;
        
    }
}
