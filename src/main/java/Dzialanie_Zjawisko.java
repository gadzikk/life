import java.util.List;

/**
 * Created by gadzik on 20.12.19.
 */
public class Dzialanie_Zjawisko {
    List<Warunek> potrzeby;
    List<Warunek> przymusy;
    List<Warunek> powody;
    TypIlosc popyt;
    TypIlosc podaz;
    TypIlosc szanse;
    List<Warunek> warunkiSprzyjajace;
    List<Warunek> warunkiNiesprzyjajace;
    List<Metoda> wymaganeKroki;
    List<Warunek> wymaganeRzeczy;
    List<Metoda> metody; // TODO: lub typ method
}
