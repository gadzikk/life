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

    List<TypOsoby> typyLudzi;
    List<String> plusy;
    List<String> minusy;
    List<String> wartosciMiejsca;

    List<String> warunkiKoncowe;
    Map<String, Metoda> metodyOsiagnieciaKoncowego;
//    List<String> srodkiOsiagnieciaKoncowego;

    Integer iloscLudzi;
    List<String> ludzie;
    Integer iloscSilnychJednostek;
    List<String> silneJednostki;

    LocalDateTime czasStart;
    LocalDateTime czasKoniec;
    Integer iloscGodzin;
    Integer iloscDniTygodnia;

    List<String> zagrozenia;
    List<String> zasady;

}
