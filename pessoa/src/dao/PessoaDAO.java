/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Pessoa;
import model.PessoaReal;

/**
 *
 * @author chris
 */
public class PessoaDAO {
    public static Pessoa getPessoaByID(String id){
            System.out.println("select * from PESSOA where id="+id);
            return new PessoaReal(id,"Pessoa " + id);
      }
    
}
