package miejsce;

import typy_bazowe.TypMiejsce;
import typy_bazowe.TypIlosc;
import warunek.W;
import z_inne.PO;

import java.util.List;

/**
 * Created by gadzik on 18.12.19.
 */
public class Miejsce {
    TypMiejsce typMiejsce;
    List<W> wymaganiaWstepne;

    boolean przechodnie;
    boolean stale;
    boolean srodowiskowe;
    boolean restrykcyjne;
    boolean kibicowanie;

    boolean wzglednaIzolacja;
    boolean cisza;
    boolean nuda;

    List<HotSpot> hotSpots;

    List<PO> procentOsob;
    List<W> warunkiSprzyjajace;
    List<W> warunkiNiesprzyjajace;
    List<W> wartosciMiejsca;

    TypIlosc iloscLudzi;
    TypIlosc iloscSilnychJednostek;

    List<W> zagrozenia;
    List<W> zasady;

    boolean wymagajacePrawa;
    boolean wymagajaceZasad;

}
