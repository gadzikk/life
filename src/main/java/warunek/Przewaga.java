package warunek;

import metoda.Metoda;
import typy_bazowe.TypSila;
import typy_bazowe.TypTrudnosc;
import warunek.Warunek;

import java.util.List;

/**
 * Created by gadzik on 20.12.19.
 */
public class Przewaga {
    Warunek przewaga;
    TypSila sila;
    TypTrudnosc trudnosc;
    List<Metoda> metodyOsiagniecia;
    List<Warunek> potrzebnePrzewagi;
    boolean ktosPomagal;

    List<Warunek> uzyskal;

    Integer iloscGodzin;
    Integer iloscDniTygodnia;
    Integer iloscMiesiecy;

}
