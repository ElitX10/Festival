package com.festival.msfestival.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "festivals")
public class Festival {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String nom;

    private String periodicite;

    @NotNull
    private int mois;

    private String site;

    @NotNull
    @Column(unique = true)
    private String numeroId;

    @NotNull
    private int edition;

    @NotNull
    private Date dateDebut;

    @NotNull
    private Date dateFin;

    @NotNull
    private Date dateCreation;

    // TODO lien avec la commune, les autres communes, le domaine et les domaines complémentaires


    public Festival() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(String periodicite) {
        this.periodicite = periodicite;
    }

    public int getMois() {
        return mois;
    }

    public void setMois(int mois) {
        this.mois = mois;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(String numeroId) {
        this.numeroId = numeroId;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    @Override
    public String toString() {
        return "Festival{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", periodicite='" + periodicite + '\'' +
                ", mois=" + mois +
                ", site='" + site + '\'' +
                ", numeroId='" + numeroId + '\'' +
                ", edition=" + edition +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", dateCreation=" + dateCreation +
                '}';
    }
}
