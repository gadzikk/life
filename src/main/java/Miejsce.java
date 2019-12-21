import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by gadzik on 18.12.19.
 */
public class Miejsce {

    String warunekWstepny;
    boolean przechodnie;
    boolean stale;
    boolean srodowiskowe;
    boolean restrykcyjne;
    boolean kibicowanie;

    boolean wzglednaIzolacja;

    List<Typ> typyLudzi;
    List<String> plusy;
    List<String> minusy;


    String warunekKoncowy;
    List<String> metodyOsiagnieciaKoncowego;
    List<String> srodkiOsiagnieciaKoncowego;

    List<String> wartosciMiejsca;

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
