package miejsce;

import typy_bazowe.TypDzielnicy;
import typy_bazowe.TypRasa;
import typy_bazowe.TypIlosc;
import warunek.W;
import z_inne.PO;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by gadzik on 25.12.19.
 */
public class Dzielnica {
    List<W> wymaganiaWstepne;
    TypDzielnicy dzielnica;
    TypIlosc iloscMieszkan;

    boolean stale;
    boolean srodowiskowe;
    boolean restrykcyjne;
    boolean kibicowanie;

    List<W> hotSpots;
    List<PO> procentOsob;

    TypIlosc iloscCierpienia;
    TypIlosc iloscWygod;
    TypIlosc iloscPatologii;

    List<W> warunkiSprzyjajace;
    List<W> warunkiNiesprzyjajace;

    public <T> List<T> of(T... elements){
        return Arrays.asList(elements);
    }
}
