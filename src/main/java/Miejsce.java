import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * Created by gadzik on 18.12.19.
 */
public class Miejsce {

    List<String> wymaganiaWstepne;
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
    List<Consts.WarunkiS> warunkiSprzyjajace;
    List<Consts.WarunkiNS> warunkiNiesprzyjajace;
    List<Consts.Wartosc> wartosciMiejsca;

    List<Consts.WKoncowe> warunkiKoncowe;
    Map<Consts.WKoncowe, Metoda> metodyOsiagnieciaKoncowego;

    TypIlosc iloscLudzi;
    TypIlosc iloscSilnychJednostek;

    List<Consts.Zagrozenia> zagrozenia;
    List<Consts.Zasady> zasady;

}
