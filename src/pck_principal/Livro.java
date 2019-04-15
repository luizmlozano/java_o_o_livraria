/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pck_principal;

/**
 *
 * @author lcmlozano
 */
public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor; //uma classe recebendo a outra como atributo; (processo conhecido como composição)
    
    public Livro(){
        System.out.println("novo livro criado");
    }
    
    void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do livro ");
        System.out.println("Nome : "+nome);
        System.out.println("Descrição : "+descricao);
        System.out.println("Valor : "+valor);
        System.out.println("Valor : "+isbn);
        
        if (this.temAutor()){
            autor.mostrarDetalhes();
        }
        
        System.out.println("--");
    }
    
    public void aplicaDesconto(double porcentagem){
        this.valor -= this.valor * porcentagem;
    }
    
    boolean temAutor(){
        //boolean naoEhnull = this.autor != null;
        return this.autor != null;
    }
}
