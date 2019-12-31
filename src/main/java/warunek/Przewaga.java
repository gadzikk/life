package warunek;

import metoda.M;
import typy_bazowe.TypSila;
import typy_bazowe.TypTrudnosc;

import java.util.List;

/**
 * Created by gadzik on 20.12.19.
 */
public class Przewaga {
    Warunek przewaga;
    TypSila sila;
    TypTrudnosc trudnosc;
    List<M> metodyOsiagniecia;
    List<Warunek> potrzebnePrzewagi;
    boolean ktosPomagal;

    List<Warunek> uzyskal;

    Integer iloscGodzin;
    Integer iloscDniTygodnia;
    Integer iloscMiesiecy;

}
