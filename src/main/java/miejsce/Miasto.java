package miejsce;

import typy_bazowe.TypRasa;
import typy_bazowe.TypIlosc;
import warunek.W;
import z_inne.RI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created by gadzik on 25.12.19.
 */
public class Miasto {
    List<W> wymaganiaWstepne;
    List<Dzielnica> dzielnice;

//    List<HotSpot> hotSpots;
    List<RI> rasaIlosc;

    List<W> warunkiSprzyjajace;
    List<W> warunkiNiesprzyjajace;

    public <T> List<T> of(T... elements){
        return Arrays.asList(elements);
    }
}
