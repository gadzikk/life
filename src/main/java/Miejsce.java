import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by gadzik on 18.12.19.
 */
public class Miejsce {
    String warunekWstepny;
    boolean kibicowanie;

    List<String> plusy;
    List<String> minusy;
    List<String> typyLudzi;

    String warunekKoncowy;
    List<String> metodyOsiagnieciaKoncowego;
    List<String> srodkiOsiagnieciaKoncowego;

    List<String> wartosciMiejsca;

    List<String> ludzie;
    Integer iloscLudzi;
    List<String> silneJednostki;
    Integer iloscSilnychJednostek;

    LocalDateTime czasStart;
    LocalDateTime czasKoniec;
    Integer iloscGodzin;
    Integer iloscDniTygodnia;

    List<String> zagrozenia;

}
