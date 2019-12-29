package miejsce;

import typy_bazowe.TypMiejsce;
import typy_bazowe.TypIlosc;
import warunek.Warunek;
import z_inne.ProcentOsob;

import java.util.List;

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

    List<ProcentOsob> procentOsob;
    List<Warunek> warunkiSprzyjajace;
    List<Warunek> warunkiNiesprzyjajace;
    List<Warunek> wartosciMiejsca;

    TypIlosc iloscLudzi;
    TypIlosc iloscSilnychJednostek;

    List<Warunek> zagrozenia;
    List<Warunek> zasady;

    boolean wymagajacePrawa;
    boolean wymagajaceZasad;

}
