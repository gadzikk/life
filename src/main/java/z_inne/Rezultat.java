package z_inne;

import typy_bazowe.TypIlosc;
import typy_bazowe.TypStrony;
import warunek.Warunek;

import java.util.List;

/**
 * Created by gadzik on 25.12.19.
 */
public class Rezultat {
    List<Warunek> skutki;
    TypStrony stronaSkutku;

    List<Warunek> potencjalneWarunki;
    TypIlosc dlugoscDzialania;

    boolean osobyRestrykcyjne;
    TypIlosc liczbaOsob;

}