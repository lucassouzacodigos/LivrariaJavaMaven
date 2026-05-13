package com.mycompany.livraria;

import com.google.cloud.firestore.Firestore;
import com.google.firebase.cloud.FirestoreClient;


public class Livraria {

    public static void main(String[] args) {
        
        Firebase.iniciarFirebase();
        Firestore db = FirestoreClient.getFirestore();
        
        Livro livro = new Livro("Harry Potter", "J.K. Rolling", true);
        Usuario pessoa = new Usuario("Lucas", 26);
        
        pessoa.apresentar();
        livro.emprestar();
        livro.emprestar();
        livro.devolver();
        livro.devolver();
        
        Funcionario func = new Bibliotecario("Leo", 500);
        Funcionario fodae = new Gerente("tste", 500.6);
        func.mostrarDados();
        fodae.mostrarDados();
        
        
        new GUI_BIBLIOTECA().setVisible(true);
        
        
    }
    
}
