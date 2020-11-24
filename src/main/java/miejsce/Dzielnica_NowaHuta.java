package miejsce;

import db.DB_Warunki;
import typy_bazowe.TypDzielnicy;
import typy_bazowe.TypIlosc;
import typy_bazowe.TypOsoby;
import z_inne.PO;

/**
 * Created by gadzik on 15.01.20.
 */
public class Dzielnica_NowaHuta extends Dzielnica {
    public Dzielnica_NowaHuta() {
        wymaganiaWstepne = DB_Warunki.WYMAGANIA_WSTEPNE_SWIAT;
        dzielnica = TypDzielnicy.PO_70;
        iloscMieszkan = TypIlosc.DUZA;

        stale = true;
        srodowiskowe = true;
//        restrykcyjne;
        kibicowanie = true;

//        hotSpots;
        procentOsob = of(
                new PO(50, TypOsoby.STARY),
                new PO(30, TypOsoby.SREDNI_WIEK),
                new PO(20, TypOsoby.MLODY),

                new PO(50, TypOsoby.RDZENNY),
                new PO(40, TypOsoby.MIESZANIEC),
                new PO(10, TypOsoby.TURYSTA_ZAGRANICZNY),

                new PO(5, TypOsoby.PERELKA),
                new PO(2, TypOsoby.ZLODZIEJ),
                new PO(7, TypOsoby.CZOLO),
                new PO(7, TypOsoby.BIEGACZ),
                new PO(5, TypOsoby.PATOLOG),

                new PO(50, TypOsoby.OSIEDLOWY),
                new PO(10, TypOsoby.OSIEDLOWY_OGARNIETY),
                new PO(12, TypOsoby.OSIEDLOWY_NORMAL),
                new PO(17, TypOsoby.OSIEDLOWY_CASUAL),
                new PO(35, TypOsoby.OSIEDLOWY_WYKRECONY),
                new PO(35, TypOsoby.OSIEDLOWY_BURZUJ),
                new PO(10, TypOsoby.SPORTOWY_FEST)
        );

        iloscCierpienia = TypIlosc.SREDNIA;
        iloscBurzuazji = TypIlosc.SREDNIA;
        iloscPatologii = TypIlosc.SREDNIA;

//        warunkiSprzyjajace;
//        warunkiNiesprzyjajace;
    }
}
