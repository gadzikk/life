package warunek;

import metoda.M;
import typy_bazowe.TypSila;
import z_inne.Naruszenie;
import z_inne.Rezultat;

import java.util.List;

/**
 * Created by gadzik on 25.12.19.
 */
public class WarunekDesc {
    W typWarunku;
    TypSila sila;
    List<W> zaleznyOd;

    List<W> globalneWarunkiPlanszy;
    List<W> wymaganiaWstepne;
    List<M> metodyOsiagniecia;

    Boolean osiagniety;
    List<W> wymaganiaUtrzymania;

    Rezultat rezultat;
    Naruszenie naruszenie;

}
