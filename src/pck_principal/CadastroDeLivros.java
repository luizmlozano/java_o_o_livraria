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
public class CadastroDeLivros {
    public static void main(String[] args) {
        
        Autor obj_autor = new Autor();
        obj_autor.nome = "Rodrigo Turini";
        obj_autor.email = "rodrigo.turini@caelum.com.br";
        obj_autor.cpf = "123.456.789.10";
        
        Livro obj_livro = new Livro();
        obj_livro.nome = "Java 8 Prático";
        obj_livro.descricao = "Novos recursos da linguagem";
        obj_livro.valor = 59.99;
        obj_livro.isbn = "978-85-66250-46-6";
        obj_livro.autor = obj_autor;
        
        obj_livro.mostrarDetalhes();
        
        Autor obj_outroautor = new Autor();
        obj_outroautor.nome = "Paulo Silveira";
        obj_outroautor.email = "paulo.silveira@caelum.com.br";
        obj_outroautor.cpf = "123.456.789.10";
        
        Livro obj_outrolivro = new Livro();
        obj_outrolivro.nome = "Lógica de Programação";
        obj_outrolivro.descricao = "Crie seus primeiros programas";
        obj_outrolivro.valor = 59.99;
        obj_outrolivro.isbn = "978-85-66250-22-0";
        obj_outrolivro.autor = obj_outroautor;
        
        obj_outrolivro.mostrarDetalhes();
        
        obj_livro.valor -= obj_livro.valor * 0.1;
        System.out.println("Valor do livro com desconto "+obj_livro.valor);
        
    }
}
