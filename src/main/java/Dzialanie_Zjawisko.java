import java.util.List;

/**
 * Created by gadzik on 20.12.19.
 */
public class Dzialanie_Zjawisko {
    List<Consts.Potrzeba> potrzeby;
    List<Consts.Przymus> przymusy;
    TypIlosc popyt;
    TypIlosc podaz;
    TypIlosc szanse;
    List<Consts.WarunkiS> warunkiSprzyjajace;
    List<Consts.WarunkiNS> warunkiNiesprzyjajace;
    List<String> wymaganeKroki;
    List<String> wymaganeRzeczy;
    List<Metoda> metody; // TODO: lub typ method
}
