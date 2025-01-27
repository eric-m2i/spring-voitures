package com.example.demo.dao;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="voitures")
public class Voiture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String marque;
    private String modele;
    private Integer annee;
    private String couleur;
    private LocalDate dateImmatriculation;

    @JsonIgnore
    private String numeroImmatriculation;

    @ManyToOne
    private Proprietaire proprietaire;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public LocalDate getDateImmatriculation() {
        return dateImmatriculation;
    }

    public void setDateImmatriculation(LocalDate dateImmatriculation) {
        this.dateImmatriculation = dateImmatriculation;
    }

    public String getNumeroImmatriculation() {
        return numeroImmatriculation;
    }

    public void setNumeroImmatriculation(String numeroImmatriculation) {
        this.numeroImmatriculation = numeroImmatriculation;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "id=" + id +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", annee=" + annee +
                ", couleur='" + couleur + '\'' +
                ", dateImmatriculation=" + dateImmatriculation +
                ", numeroImmatriculation='" + numeroImmatriculation + '\'' +
                '}';
    }
}
