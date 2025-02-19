package com.adrar.livrecda.controller;

import com.adrar.livrecda.exception.LivreFoundException;
import com.adrar.livrecda.exception.LivreNotFoundException;
import jakarta.persistence.Entity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LivreExceptionController {

    //Déclencheur exception le livre n'existe pas
    @ExceptionHandler(LivreNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String livreNotFound(LivreNotFoundException e) {
        return e.getMessage();
    }

    //Déclencheur exception le livre existe déja
    @ExceptionHandler(LivreFoundException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String livreExist(LivreFoundException e) {
        return e.getMessage();
    }
}
