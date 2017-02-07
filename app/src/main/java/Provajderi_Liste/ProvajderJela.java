package provajderi_liste;

import java.util.ArrayList;
import java.util.List;

import model.Jelo;
import model.KategrorijaJela;

/**
 * Created by Ivan Crnogorac on 2/5/2017.
 */

public class ProvajderJela {

    public static List<Jelo> getJela() {

        KategrorijaJela kuvanaJela = new KategrorijaJela(0, "Kuvana jela");
        KategrorijaJela jelaOdMesa = new KategrorijaJela(1, "Jela od mesa");


        ArrayList<Jelo> jela = new ArrayList<>();
        jela.add(new Jelo(0, "pasulj.jpg","zrnasto jelo", "Pasulj", kuvanaJela, "pasulj isamo pasulj", 200, 50.0));
        jela.add(new Jelo(0, "sarma.jpg","fino jelo", "Sarma", jelaOdMesa, "sarma zakon", 100, 80.0));
        return jela;
    }

    public static List<String> getImenaJela() {

        List<String> imena = new ArrayList<>();
        imena.add("Pasulj");
        imena.add("Sarma");
        return imena;
    }

    public static Jelo getJeloById(int id) {

        KategrorijaJela kuvanaJela = new KategrorijaJela(0, "Kuvana jela");
        KategrorijaJela jelaOdMesa = new KategrorijaJela(1, "Jela od mesa");

        switch (id) {
            case 0:
                return new Jelo(0, "pasulj.jpg","zrnasto jelo", "Pasulj", kuvanaJela, "pasulj isamo pasulj", 200, 50.0);
            case 1:
                return new Jelo(0, "sarma.jpg","fino jelo", "Sarma", jelaOdMesa, "sarma zakon", 100, 80.0);

            default:
                return null;
        }
    }


}
