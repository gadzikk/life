package miejsce;

import db.DB_Warunki;

/**
 * Created by gadzik on 15.01.20.
 */
public class Miasto_Krakow extends Miasto {
    public Miasto_Krakow() {
        wymaganiaWstepne = DB_Warunki.WYMAGANIA_WSTEPNE_SWIAT.getWarunki();
        dzielnice = of(new Dzielnica_StaraHuta(), new Dzielnica_NowaHuta(), new Dzielnica_Poludnie(), new Dzielnica_Polnoc());

//        List<HotSpot> hotSpots;
//        rasaIlosc ;
//        warunkiSprzyjajace;
//        warunkiNiesprzyjajace;
    }


}
