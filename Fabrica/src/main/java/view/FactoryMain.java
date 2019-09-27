/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Factory;
import model.Pessoa;



public class FactoryMain {
    public static void main(String args[]){
        Factory factory = new Factory();
        String nome = "Gabriel";
        String sexo = "";
        Pessoa pessoa = factory.getPessoa(nome,sexo);
    }
    
}
