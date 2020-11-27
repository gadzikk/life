package miejsce;

import db.DBW;
import typy_bazowe.TypDzielnicy;
import typy_bazowe.TypIlosc;
import typy_bazowe.TypOsoby;
import z_inne.PO;

/**
 * Created by gadzik on 15.01.20.
 */
public class Dzielnica_StaraHuta extends Dzielnica {
    public Dzielnica_StaraHuta() {
        wymaganiaWstepne = DBW.WYMAGANIA_WSTEPNE_SWIAT;
        dzielnica = TypDzielnicy.POHUTNICZE;
        iloscMieszkan = TypIlosc.DUZA;

        stale = true;
        srodowiskowe = true;
//        restrykcyjne;
        kibicowanie = true;

//        hotSpots;
        procentOsob = of(
                new PO(60, TypOsoby.STARY),
                new PO(30, TypOsoby.SREDNI_WIEK),
                new PO(10, TypOsoby.MLODY),

                new PO(70, TypOsoby.RDZENNY),
                new PO(20, TypOsoby.MIESZANIEC),
                new PO(10, TypOsoby.TURYSTA_ZAGRANICZNY),

                new PO(3, TypOsoby.PERELKA),
                new PO(1, TypOsoby.ZLODZIEJ),
                new PO(5, TypOsoby.CZOLO),
                new PO(5, TypOsoby.BIEGACZ),
                new PO(3, TypOsoby.PATOLOG),

                new PO(40, TypOsoby.OSIEDLOWY),
                new PO(8, TypOsoby.OSIEDLOWY_OGARNIETY),
                new PO(10, TypOsoby.OSIEDLOWY_NORMAL),
                new PO(15, TypOsoby.OSIEDLOWY_CASUAL),
                new PO(30, TypOsoby.OSIEDLOWY_WYKRECONY),
                new PO(30, TypOsoby.OSIEDLOWY_BURZUJ),
                new PO(7, TypOsoby.SPORTOWY_FEST)
        );

        iloscCierpienia = TypIlosc.DUZA;
        iloscBurzuazji = TypIlosc.SREDNIA;
        iloscPatologii = TypIlosc.DUZA;

//        warunkiSprzyjajace;
//        warunkiNiesprzyjajace;
    }
}
