package com.example.dcbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DcBackendApplication {

    public static void main(String[] args) {

        SpringApplication.run(DcBackendApplication.class, args);
        System.Logger logger = System.getLogger("Informations LOG: ");
        logger.log(System.Logger.Level.INFO, "Lancement de l'application");
    }

}
