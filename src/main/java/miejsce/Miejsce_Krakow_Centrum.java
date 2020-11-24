package miejsce;

import db.DB_Warunki;
import typy_bazowe.TypIlosc;
import typy_bazowe.TypMiejsce;
import typy_bazowe.TypOsoby;
import warunek.W;
import z_inne.PO;

import static db.DB.on;

/**
 * Created by gadzik on 15.01.20.
 */
public class Miejsce_Krakow_Centrum extends Miejsce {
    public Miejsce_Krakow_Centrum() {
        typMiejsce = TypMiejsce.CENTRUM_MIASTA;
        wymaganiaWstepne = of(on(DB_Warunki.POTRZEBY),  on(DB_Warunki.PRZYMUS));

        przechodnie = true;
//        stale;
//        srodowiskowe;
//        restrykcyjne;
//        kibicowanie;

//        wzglednaIzolacja;
//        cisza;
//        nuda;

//        hotSpots;

        procentOsob = of(
                new PO(10, TypOsoby.STARY),
                new PO(60, TypOsoby.SREDNI_WIEK),
                new PO(30, TypOsoby.MLODY),

                new PO(10, TypOsoby.RDZENNY),
                new PO(60, TypOsoby.MIESZANIEC),
                new PO(30, TypOsoby.TURYSTA_ZAGRANICZNY),

                new PO(0, TypOsoby.PERELKA),
                new PO(0, TypOsoby.ZLODZIEJ),
                new PO(0, TypOsoby.CZOLO),
                new PO(0, TypOsoby.BIEGACZ),
                new PO(0, TypOsoby.PATOLOG),

                new PO(5, TypOsoby.OSIEDLOWY),

                new PO(80, TypOsoby.BURZUA),
                new PO(20, TypOsoby.RESZTA)
        );
        warunkiSprzyjajace = of(W.LUDZIE ,W.SKLEP);
        warunkiNiesprzyjajace = of(W.MOZAIKA);
//        wartosciMiejsca;

        iloscLudzi = TypIlosc.DUZA;
//        iloscSilnychJednostek;

//        zagrozenia;
//        zasady;

        wymagajacePrawa = true;
//        wymagajaceZasad;



    }


}
