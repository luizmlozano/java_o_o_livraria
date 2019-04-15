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
public class Autor {
    String nome;
    String email;
    String cpf;
    
    void mostrarDetalhes(){
        System.out.println("Mostrando detalhes do autor ");
        System.out.println("Nome : "+nome);
        System.out.println("Email : "+email);
        System.out.println("CPF : "+cpf);

    }
    
}
