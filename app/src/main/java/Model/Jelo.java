package model;

/**
 * Created by Ivan Crnogorac on 2/5/2017.
 */

public class Jelo {

    private int id;
    private String slika;
    private String opis;
    private String naziv;
    private KategrorijaJela kategorija;
    private String sastojci;
    private int karorijskaVrednost;
    private Double cena;
    private float ocena;

    public Jelo() {

    }

    public Jelo(int id, String slika, String opis, String naziv, KategrorijaJela kategorija, String sastojci, int karorijskaVrednost, Double cena) {
        this.id = id;
        this.slika = slika;
        this.opis = opis;
        this.naziv = naziv;
        this.kategorija = kategorija;
        this.sastojci = sastojci;
        this.karorijskaVrednost = karorijskaVrednost;
        this.cena = cena;
    }

    public int getId() {
        return id;
    }

    public String getSlika() {
        return slika;
    }

    public String getOpis() {
        return opis;
    }

    public String getNaziv() {
        return naziv;
    }

    public KategrorijaJela getKategorija() {
        return kategorija;
    }

    public String getSastojci() {
        return sastojci;
    }

    public int getKarorijskaVrednost() {
        return karorijskaVrednost;
    }

    public Double getCena() {
        return cena;
    }

    public float getOcena() {
        return ocena;
    }

    public void setSlika(String slika) {
        this.slika = slika;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setKategorija(KategrorijaJela kategorija) {
        this.kategorija = kategorija;
    }

    public void setSastojci(String sastojci) {
        this.sastojci = sastojci;
    }

    public void setKarorijskaVrednost(int karorijskaVrednost) {
        this.karorijskaVrednost = karorijskaVrednost;
    }

    public void setOcena(float ocena) {
        this.ocena = ocena;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Jelo{" +
                "naziv='" + naziv + '\'' +
                ", kategorija='" + kategorija + '\'' +
                '}';
    }
}
