/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chris
 */
public class PessoaReal implements Pessoa {
      private String nome;
      private String id;

      public PessoaReal(String id,String nome) {
            this.id       = id;
            this.nome = nome;
            // apenas para simular algo...
            System.out.println("Retornou a pessoa do banco de dados ->  " + nome);
      }

      public String getNome() {
            return nome;
      }
      public String getId() {
            return this.id;
      }
}