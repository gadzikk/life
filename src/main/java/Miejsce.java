import java.util.List;
import java.util.Map;

/**
 * Created by gadzik on 18.12.19.
 */
public class Miejsce {
    TypMiejsce typMiejsce;
    List<Warunek> wymaganiaWstepne;

    boolean przechodnie;
    boolean stale;
    boolean srodowiskowe;
    boolean restrykcyjne;
    boolean kibicowanie;

    boolean wzglednaIzolacja;
    boolean cisza;
    boolean nuda;

    List<HotSpot> hotSpots;

    Map<TypOsoby, TypIlosc> typLudziIlosc;
    List<Warunek> warunkiSprzyjajace;
    List<Warunek> warunkiNiesprzyjajace;
    List<Warunek> wartosciMiejsca;

    TypIlosc iloscLudzi;
    TypIlosc iloscSilnychJednostek;

    List<Warunek> zagrozenia;
    List<Warunek> zasady;

}
