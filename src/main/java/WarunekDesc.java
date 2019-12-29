import java.util.List;

/**
 * Created by gadzik on 25.12.19.
 */
public class WarunekDesc {
    Warunek typWarunku;
    TypSila sila;
    List<Warunek> zaleznyOd;

    List<Warunek> globalneWarunkiPlanszy;
    List<Warunek> wymaganiaWstepne;
    List<Metoda> metodyOsiagniecia;

    Boolean osiagniety;
    List<Warunek> wymaganiaUtrzymania;

    Rezultat rezultat;
    Naruszenie naruszenie;

}
