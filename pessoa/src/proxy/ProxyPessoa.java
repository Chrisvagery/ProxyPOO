/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proxy;

import dao.PessoaDAO;
import model.Pessoa;

/**
 *
 * @author chris
 */
public class ProxyPessoa  implements Pessoa {
      private String id;

      private Pessoa pessoa;//mesma interface

      public ProxyPessoa(String nome) {
            this.id = nome;
      }

      /**
       * Método comum da interface
       *
       * @see Pessoa#getNome()
       */
      public String getNome() {
            if (pessoa == null) {
                  //Apenas cria o objeto real quando chamar este método
                  pessoa = PessoaDAO.getPessoaByID(this.id);
            }
            /** Delega para o objeto real **/
            return pessoa.getNome();
      }

      public String getId() {
            return this.id;
      }
}
