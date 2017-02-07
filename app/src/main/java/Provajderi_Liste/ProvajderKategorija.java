package provajderi_liste;

import java.util.ArrayList;
import java.util.List;

import model.KategrorijaJela;

/**
 * Created by Ivan Crnogorac on 2/5/2017.
 */

public class ProvajderKategorija {

    public static List<KategrorijaJela> getKategorija() {

        List<KategrorijaJela> kategorije = new ArrayList<>();
        kategorije.add(new KategrorijaJela(0, "Kuvana jela"));
        kategorije.add(new KategrorijaJela(1, "Jela od mesa"));
        return kategorije;
    }

    public static List <String> getImenaKategorija (){
        List<String> imena = new ArrayList<>();
        imena.add("Kuvana jela");
        imena.add("Jela od mesa");
        return imena;
    }

    public static KategrorijaJela getKategorijaById (int id){
        switch (id) {
            case 0:
                return new KategrorijaJela (0, "Kuvana jela");
            case 1:
                return new KategrorijaJela(1, "Jela od mesa");
            default:
                return null;
        }
    }
}
