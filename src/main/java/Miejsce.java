import java.util.List;
import java.util.Map;

/**
 * Created by gadzik on 18.12.19.
 */
public class Miejsce {

    List<Consts.Warunek> wymaganiaWstepne;
    boolean przechodnie;
    boolean stale;
    boolean srodowiskowe;
    boolean restrykcyjne;
    boolean kibicowanie;

    boolean wzglednaIzolacja;
    boolean cisza;
    boolean nuda;

    List<Consts.HotSpot> hotSpots;

    Map<TypOsoby, TypIlosc> typLudziIlosc;
    List<Consts.Warunek> warunkiSprzyjajace;
    List<Consts.Warunek> warunkiNiesprzyjajace;
    List<Consts.Warunek> wartosciMiejsca;

    TypIlosc iloscLudzi;
    TypIlosc iloscSilnychJednostek;

    List<Consts.Warunek> zagrozenia;
    List<Consts.Warunek> zasady;

}
