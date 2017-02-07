package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ivan Crnogorac on 2/5/2017.
 */

public class KategrorijaJela {

    private int id;
    private String nazivKategorije;
    private List<Jelo> jela;

    public KategrorijaJela() {
    }

    public KategrorijaJela(int id, String nazivKategorije, List<Jelo> jela) {
        this.id = id;
        this.nazivKategorije = nazivKategorije;
        jela = new ArrayList<>();
    }

    public KategrorijaJela(int id, String nazivKategorije) {
        this.id = id;
        this.nazivKategorije = nazivKategorije;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNazivKategorije() {
        return nazivKategorije;
    }

    public void setNazivKategorije(String nazivKategorije) {
        this.nazivKategorije = nazivKategorije;
    }

    public List<Jelo> getJela() {
        return jela;
    }

    public void setJela(List<Jelo> jela) {
        this.jela = jela;
    }
}
