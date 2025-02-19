package com.adrar.livrecda.exception;

public class LivreNotFoundException extends RuntimeException {
    public LivreNotFoundException(Long id) {
        super("Le livre qui à l'id : " + id + " n'existe pas !");
    }
}
