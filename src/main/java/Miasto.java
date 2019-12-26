import java.util.List;
import java.util.Map;

/**
 * Created by gadzik on 25.12.19.
 */
public class Miasto {
    List<Consts.Warunek> wymaganiaWstepne;
    List<Miejsce> dzielnice;

    List<Consts.HotSpot> hotSpots;
    Map<Rasa, TypIlosc> rasaIlosc;

    TypIlosc iloscCierpienia;
    TypIlosc iloscBurzuazji;
    TypIlosc iloscPatologii;

    List<Consts.Warunek> warunkiSprzyjajace;
    List<Consts.Warunek> warunkiNiesprzyjajace;
}
