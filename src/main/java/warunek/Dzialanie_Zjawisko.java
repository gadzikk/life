package warunek;

import metoda.M;
import typy_bazowe.TypIlosc;

import java.util.List;

/**
 * Created by gadzik on 20.12.19.
 */
public class Dzialanie_Zjawisko {
    Warunek dzialanieZjawisko;
    List<Warunek> potrzeby;
    List<Warunek> przymusy;
    List<Warunek> powody;
    TypIlosc popyt;
    TypIlosc podaz;
    TypIlosc szanse;
    List<Warunek> warunkiSprzyjajace;
    List<Warunek> warunkiNiesprzyjajace;
    List<M> wymaganeKroki;
    List<Warunek> wymaganeRzeczy;
    List<M> metody; // TODO: lub typ method
}
