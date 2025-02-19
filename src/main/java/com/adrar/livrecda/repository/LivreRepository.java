package com.adrar.livrecda.repository;

import com.adrar.livrecda.model.Livre;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivreRepository extends CrudRepository<Livre, Long> {
    Livre findByTitre(String titre);
}
