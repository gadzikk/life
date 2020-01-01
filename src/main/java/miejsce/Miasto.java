package miejsce;

import typy_bazowe.TypRasa;
import typy_bazowe.TypIlosc;
import warunek.W;

import java.util.List;
import java.util.Map;

/**
 * Created by gadzik on 25.12.19.
 */
public class Miasto {
    List<W> wymaganiaWstepne;
    List<Miejsce> dzielnice;

    List<HotSpot> hotSpots;
    Map<TypRasa, TypIlosc> rasaIlosc;

    TypIlosc iloscCierpienia;
    TypIlosc iloscBurzuazji;
    TypIlosc iloscPatologii;

    List<W> warunkiSprzyjajace;
    List<W> warunkiNiesprzyjajace;
}
