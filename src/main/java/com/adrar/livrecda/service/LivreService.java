package com.adrar.livrecda.service;

import com.adrar.livrecda.dto.LivreDto;
import com.adrar.livrecda.exception.LivreFoundException;
import com.adrar.livrecda.exception.LivreNotFoundException;
import com.adrar.livrecda.model.Livre;
import com.adrar.livrecda.repository.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class LivreService {

    @Autowired
    private LivreRepository livreRepository;

    //Méthode qui retourne la liste des Livres de la BDD
    public List<Livre> getAllLivres() {
        return (List<Livre>) livreRepository.findAll();
    }

    //Méthode qui retourne un livre par son id
    public Livre getLivreById(Long id) {
        return livreRepository.findById(id)
                .orElseThrow(()-> new LivreNotFoundException(id));
    }

    //Méthode qui ajoute un livre dans la BDD
    public Livre saveLivre(Livre livre) {
       Optional<Livre> verifLivre = Optional.ofNullable(livreRepository.findByTitre(livre.getTitre()));
        if(verifLivre.isPresent()) {
            throw new LivreFoundException(livre);
        }
        return livreRepository.save(livre);
    }

    //Méthode qui supprime un livre de la bdd par son id
    public void deleteLivreById(Long id) {
        livreRepository.deleteById(id);
    }

    //Méthode qui modifie un livre par son id
    public Optional<Livre> updateLivreById(Long id, Livre livre) {
        Optional<Livre> livreToUpdate = livreRepository.findById(id);
        //test si le livre existe en BDD
        if(livreToUpdate.isPresent()) {
            livreToUpdate.get().setTitre(livre.getTitre());
            livreToUpdate.get().setDescription(livre.getDescription());
            livreToUpdate.get().setDatePublication(livre.getDatePublication());
            return Optional.of(livreRepository.save(livreToUpdate.get()));
        }
        return Optional.empty();
    }


    public Stream<LivreDto> getLivreToDto(Long id) {
        return livreRepository.findById(id).stream()
                .map(LivreDtoWrapper::toDto);
    }
}
