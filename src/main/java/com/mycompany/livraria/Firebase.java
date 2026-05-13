package com.mycompany.livraria;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

import java.io.InputStream;

public class Firebase {

    public static void iniciarFirebase() {

        try {

            InputStream serviceAccount =
                    Firebase.class.getClassLoader()
                    .getResourceAsStream("firebase-key.json");

            if (serviceAccount == null) {
                System.out.println("JSON NÃO ENCONTRADO!");
                return;
            }

            FirebaseOptions options = FirebaseOptions.builder()
                    .setCredentials(
                            GoogleCredentials.fromStream(serviceAccount))
                    .build();

            FirebaseApp.initializeApp(options);

            System.out.println("Firebase conectado!");

        } catch (Exception e) {

            System.out.println("ERRO AO INICIAR FIREBASE:");
            e.printStackTrace();

        }

    }

}