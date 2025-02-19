package com.adrar.livrecda.exception;

import com.adrar.livrecda.model.Livre;

public class LivreFoundException extends RuntimeException {
    public LivreFoundException(Livre livre) {
        super("Le livre : " + livre.getTitre() + " existe déja");
    }
}
