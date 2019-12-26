import java.util.List;
import java.util.Map;

/**
 * Created by gadzik on 25.12.19.
 */
public class Dzielnica {
    List<Consts.Warunek> wymaganiaWstepne;
    TypDzielnicy dzielnica;
    TypIlosc iloscMieszkan;

    boolean stale;
    boolean srodowiskowe;
    boolean restrykcyjne;
    boolean kibicowanie;

    List<Consts.HotSpot> hotSpots;
    Map<Rasa, TypIlosc> rasaIlosc;

    TypIlosc iloscCierpienia;
    TypIlosc iloscBurzuazji;
    TypIlosc iloscPatologii;

    List<Consts.Warunek> warunkiSprzyjajace;
    List<Consts.Warunek> warunkiNiesprzyjajace;
}
