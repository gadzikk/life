package miejsce;

import db.DBW;

/**
 * Created by gadzik on 15.01.20.
 */
public class Miasto_Krakow extends Miasto {
    String klubyKibicowskie = "WISLA > HUTNIK > CVIA";
    public Miasto_Krakow() {
        dzielnice = of(new Dzielnica_StaraHuta(), new Dzielnica_NowaHuta(), new Dzielnica_Poludnie(), new Dzielnica_Polnoc());
    }


}
