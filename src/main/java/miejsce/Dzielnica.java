package miejsce;

import typy_bazowe.TypDzielnicy;
import typy_bazowe.TypRasa;
import typy_bazowe.TypIlosc;
import warunek.W;

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

    List<HotSpot> hotSpots;
    Map<TypRasa, TypIlosc> rasaIlosc;

    TypIlosc iloscCierpienia;
    TypIlosc iloscBurzuazji;
    TypIlosc iloscPatologii;

    List<W> warunkiSprzyjajace;
    List<W> warunkiNiesprzyjajace;
}
