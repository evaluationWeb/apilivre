package com.adrar.livrecda.dto;

public record LivreDto(
        Long id,
        String titre,
        String description,
        String nomAuteur,
        String prenomAuteur
) {
}
