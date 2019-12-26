import java.util.List;

/**
 * Created by gadzik on 25.12.19.
 */
public class WarunekDesc {
    Consts.Warunek typWarunku;
    TypSila sila;
    List<Consts.Warunek> zaleznyOd;

    List<Consts.Warunek> globalneWarunkiPlanszy;
    List<Consts.Warunek> wymaganiaWstepne;
    List<Metoda> metodyOsiagniecia;

    Boolean osiagniety;
    List<Consts.Warunek> wymaganiaUtrzymania;

    Rezultat rezultat;
    Naruszenie naruszenie;

}
