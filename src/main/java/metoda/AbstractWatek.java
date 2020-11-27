package metoda;

import db.DBW;
import osoba.Osoba;
import typy_bazowe.TypZadania;
import warunek.W;
import z_inne.OH;
import z_inne.OsobaMetod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 31.12.19.
 */
public class AbstractWatek {
    DBW dbw = new DBW();
    List<W> prefixes = null;
    List<W> pdstw = null;
    List<W> tematy = null;
    List<W> kombo = null;
    List<W> codzienne = null;
    W coTakPatrzysz;
    OsobaMetod ona = new OsobaMetod();
    OsobaMetod manago = new OsobaMetod();
    List<W> obelgi = null
    List<W> zarty = null;
    OsobaMetod wszyscy = new OsobaMetod();
    OsobaMetod osoba = new OsobaMetod();
    Osoba izolowanaOsoba = new Osoba();
    OsobaMetod dzialacz = new OsobaMetod();
    OsobaMetod zly = new OsobaMetod();
    OsobaMetod _100osob = new OsobaMetod();
    OsobaMetod zasob = new OsobaMetod();
    OsobaMetod opponent = new OsobaMetod();
    OsobaMetod zaniepokojeni = new OsobaMetod();
    OsobaMetod znajomy = new OsobaMetod();
    OsobaMetod me = new OsobaMetod();
    OsobaMetod team = new OsobaMetod();
    OsobaMetod wiesniak = new OsobaMetod();
    OsobaMetod czoloWisly = new OsobaMetod();
    OsobaMetod cracoviaSlabi = new OsobaMetod();
    OsobaMetod wysokaPozycja = new OsobaMetod();
    OsobaMetod silaFizyczna = new OsobaMetod();
    OsobaMetod diabel = new OsobaMetod();
    OsobaMetod usa = new OsobaMetod();
    OsobaMetod polskiRzad = new OsobaMetod();
    Integer i = 0;
    List<W> warunki;
    OsobaMetod pytajacy = new OsobaMetod();
    OsobaMetod pracownicy = new OsobaMetod();
    OsobaMetod superPozycjaOsoby = new OsobaMetod();
    OsobaMetod karyna = new OsobaMetod();
    OsobaMetod cvia = new OsobaMetod();
    OsobaMetod srodowisko = new OsobaMetod();
    OsobaMetod grubasPrzewaga = new OsobaMetod();
    OsobaMetod fest = new OsobaMetod();
    OsobaMetod zazdrosni = new OsobaMetod();
    OsobaMetod dzialaczMocny = new OsobaMetod();
    OsobaMetod ZLE_OSOBY = new OsobaMetod();
    OsobaMetod dobrzi = new OsobaMetod();
    OsobaMetod osobyPozaSrodowisko = new OsobaMetod();
    OsobaMetod wrogowie = new OsobaMetod();
    OsobaMetod osoby = new OsobaMetod();
    OsobaMetod dzialajcyBliskoMiejsca = new OsobaMetod();
    OsobaMetod silniejszy = new OsobaMetod();

    OH slabyDzialacz = new OH();
    OH slabyDzialacz2 = new OH();
    OH slabyDzialacz3 = new OH();
    OH slabyDzialacz4 = new OH();
    OH slabyDzialacz5 = new OH();
    OH slabyDzialacz6 = new OH();
    OH slabyDzialacz7 = new OH();
    OH slabyDzialacz8 = new OH();
    OH slabyDzialacz9 = new OH();

    public <T> List<T> of(T... elements){
        return Arrays.asList(elements);
    }

    public <T> T on(T... elements){
        return Arrays.stream(elements).findFirst().get();
    }

    public <T> T on(List<T> elements){
        return elements.stream().findFirst().get();
    }

    public <T> List<T> of(T e1, List<T> elems, T e2, List<T> elems2, List<String> elems3, List<W> elems4){
        return elems;
    }

    public M o(W w1){
        return new M();
    }

    public M o(W w1, String del ,W w2){
        return new M();
    }
    public W o(W w1, W w2, W w3){
        return W.WARUNEK;
    }

    public W o(W w1, String del1, List<W> elems, W w2, W w3, String del2, W w4){
        return W.WARUNEK;
    }

    public M o(List<W> elems, W w1, List<W> elems2, String del1, W w2, String del2, W w3){
        return new M();
    }
    public M o(W w1,String del1, W w2, String del2, W w3){
        return new M();
    }

    public Integer c(W w1,String del1, W w2, String del2, W w3) { return 0;}
    public Integer c(W w1,String del1, W w2, String del2, W w3, String del3, W w4) { return 0;}
    public Integer c(W w1,String del1, W w2, String del2, W w3, String del3, W w4, String del4, W w5) { return 0;}

    public W potrzeba(List<W> warunki){return null;}

    public TypZadania dudki(TypZadania zadanie) {return null;}
    public TypZadania stanKondycja(List<TypZadania> zadania) {return null;}
    public TypZadania antySamotnosc(TypZadania zadanie) {return null;}

    public static W OD(Integer wiek) { return W.WARUNEK;  }
    public static W T0(Integer wiek) { return W.WARUNEK;  }

    public static List<W> WARUNKI(List<List<W>> w){
        return new ArrayList<>();
    }
}
