package com.adrar.livrecda.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="livre")
public class Livre {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    @Column(name="date_publication")
    private Date datePublication;

    @ManyToOne
    @JoinColumn(name = "auteur_id")
    private Auteur auteur;

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public Livre() {}

    public Livre(String titre, String description, Date datePublication) {
        this.titre = titre;
        this.description = description;
        this.datePublication = datePublication;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(Date datePublication) {
        this.datePublication = datePublication;
    }

    @Override
    public String toString() {
        return "Livre [" +  titre + ", " +  description + " ]";
    }
}
