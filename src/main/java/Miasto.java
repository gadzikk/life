import java.util.List;
import java.util.Map;

/**
 * Created by gadzik on 25.12.19.
 */
public class Miasto {
    List<Warunek> wymaganiaWstepne;
    List<Miejsce> dzielnice;

    List<HotSpot> hotSpots;
    Map<Rasa, TypIlosc> rasaIlosc;

    TypIlosc iloscCierpienia;
    TypIlosc iloscBurzuazji;
    TypIlosc iloscPatologii;

    List<Warunek> warunkiSprzyjajace;
    List<Warunek> warunkiNiesprzyjajace;
}
