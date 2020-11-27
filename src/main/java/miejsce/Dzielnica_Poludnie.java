package miejsce;

import db.DBW;
import typy_bazowe.TypDzielnicy;
import typy_bazowe.TypIlosc;
import typy_bazowe.TypOsoby;
import z_inne.PO;

/**
 * Created by gadzik on 15.01.20.
 */
public class Dzielnica_Poludnie extends Dzielnica {
    public Dzielnica_Poludnie() {
        dzielnica = TypDzielnicy.PO_70;
        iloscMieszkan = TypIlosc.BARDZO_DUZA;

        stale = true;
        srodowiskowe = true;
//        restrykcyjne;
        kibicowanie = true;

//        hotSpots;
        procentOsob = of(
                new PO(30, TypOsoby.STARY),
                new PO(40, TypOsoby.SREDNI_WIEK),
                new PO(30, TypOsoby.MLODY),

                new PO(30, TypOsoby.RDZENNY),
                new PO(60, TypOsoby.MIESZANIEC),
                new PO(10, TypOsoby.TURYSTA_ZAGRANICZNY),

                new PO(5, TypOsoby.ZLODZIEJ),
                new PO(10, TypOsoby.CZOLO),
                new PO(10, TypOsoby.BIEGACZ),
                new PO(6, TypOsoby.PATOLOG),

                new PO(60, TypOsoby.OSIEDLOWY),
                new PO(16, TypOsoby.OSIEDLOWY_OGARNIETY),
                new PO(20, TypOsoby.OSIEDLOWY_NORMAL),
                new PO(30, TypOsoby.OSIEDLOWY_CASUAL),
                new PO(60, TypOsoby.OSIEDLOWY_WYKRECONY),
                new PO(60, TypOsoby.OSIEDLOWY_BURZUJ),
                new PO(14, TypOsoby.SPORTOWY_FEST)
        );

        iloscCierpienia = TypIlosc.MALA;
        iloscWygod = TypIlosc.DUZA;
        iloscPatologii = TypIlosc.MALA;

//        warunkiSprzyjajace;
//        warunkiNiesprzyjajace;
    }
}
