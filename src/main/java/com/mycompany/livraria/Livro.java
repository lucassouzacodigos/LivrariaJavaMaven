/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.livraria;;

/**
 *
 * @author aluno
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private boolean disponivel;
    
    public Livro(String titulo, String autor ){
        this.titulo = titulo;
        this.autor =  autor;
        this.disponivel = true;
    }
    
    public void emprestar(){
        if (this.disponivel == true){
            this.disponivel = false;
        }
        else{
            System.out.println("Esse livro nao esta disponivel");
        }
    }
    
    public void devolver(){
        if (this.disponivel == false){
            this.disponivel = true;
        }
        else {
            System.out.println("Este livro ja esta na biblioteca");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    
    
}
