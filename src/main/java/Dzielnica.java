import java.util.List;
import java.util.Map;

/**
 * Created by gadzik on 25.12.19.
 */
public class Dzielnica {
    List<Warunek> wymaganiaWstepne;
    TypDzielnicy dzielnica;
    TypIlosc iloscMieszkan;

    boolean stale;
    boolean srodowiskowe;
    boolean restrykcyjne;
    boolean kibicowanie;

    List<HotSpot> hotSpots;
    Map<Rasa, TypIlosc> rasaIlosc;

    TypIlosc iloscCierpienia;
    TypIlosc iloscBurzuazji;
    TypIlosc iloscPatologii;

    List<Warunek> warunkiSprzyjajace;
    List<Warunek> warunkiNiesprzyjajace;
}
