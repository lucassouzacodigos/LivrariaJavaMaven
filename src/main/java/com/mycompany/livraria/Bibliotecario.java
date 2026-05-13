/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livraria;;

/**
 *
 * @author aluno
 */
public class Bibliotecario extends Funcionario{
    
    public Bibliotecario(String nome, double salario){
        super(nome, salario);
    }
    
    @Override
    public double calcularBonus(){
        return this.getSalario() * 0.05;
    }
    
}
