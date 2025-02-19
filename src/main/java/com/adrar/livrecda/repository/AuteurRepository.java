package com.adrar.livrecda.repository;

import com.adrar.livrecda.model.Auteur;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepository extends CrudRepository<Auteur, Long> {
}
