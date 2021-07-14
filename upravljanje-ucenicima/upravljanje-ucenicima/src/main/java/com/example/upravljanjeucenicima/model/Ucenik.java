package com.example.upravljanjeucenicima.model;


import javax.persistence.*;

@Entity
@Table (name = "ucenici")
public class Ucenik {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @Column(name = "ime")
    String ime;

    @Column(name = "prezime")
    String prezime;

    @Column(name = "prosek")
    double prosek;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public double getProsek() {
        return prosek;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }


}
