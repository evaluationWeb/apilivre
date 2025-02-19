package com.adrar.livrecda.service;

import com.adrar.livrecda.dto.LivreDto;
import com.adrar.livrecda.model.Livre;
import org.springframework.stereotype.Service;

@Service
public class LivreDtoWrapper {

    public static LivreDto toDto(Livre livre) {
        return new LivreDto(
                livre.getId(),
                livre.getTitre(),
                livre.getDescription(),
                livre.getAuteur().getFirstname(),
                livre.getAuteur().getLastname()
        );
    }
}
