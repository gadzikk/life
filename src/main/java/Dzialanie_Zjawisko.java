import java.util.List;

/**
 * Created by gadzik on 20.12.19.
 */
public class Dzialanie_Zjawisko {
    List<Consts.Warunek> potrzeby;
    List<Consts.Warunek> przymusy;
    List<String> powody;
    TypIlosc popyt;
    TypIlosc podaz;
    TypIlosc szanse;
    List<Consts.Warunek> warunkiSprzyjajace;
    List<Consts.Warunek> warunkiNiesprzyjajace;
    List<Metoda> wymaganeKroki;
    List<Consts.Warunek> wymaganeRzeczy;
    List<Metoda> metody; // TODO: lub typ method
}
