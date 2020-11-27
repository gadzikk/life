package metoda;

import db.DBP;
import db.DB_Tematy;
import db.DBW;
import osoba.Osoba;
import temat.TT;
import typy_bazowe.TypT;
import typy_bazowe.TypZadania;
import warunek.W;
import z_inne.OsobaMetod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 31.12.19.
 */
public class AbstractWatek {
    DBW dbw = new DBW();
    List<TypT> prefixes = DB_Tematy.PREFIXES;
    List<TypT> pdstw = DB_Tematy.PDSTW;
    List<TT> tematy = DB_Tematy.TEMATY;
    List<TT> kombo = DB_Tematy.KOMBO;
    List<TT> codzienne = DB_Tematy.CODZIENNE;
    W coTakPatrzysz;
    OsobaMetod ona = new OsobaMetod();
    OsobaMetod manago = new OsobaMetod();
    List<TT> obelgi = DB_Tematy.TEMATY;
    List<TT> zarty = DB_Tematy.ZARTY;
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
    OsobaMetod twoiWrogowie = new OsobaMetod();
    OsobaMetod zagraniczni = new OsobaMetod();
    OsobaMetod drugaStrona = new OsobaMetod();
    OsobaMetod zazdrosni = new OsobaMetod();
    OsobaMetod dzialaczMocny = new OsobaMetod();
    OsobaMetod ZLE_OSOBY = new OsobaMetod();
    OsobaMetod dobrzi = new OsobaMetod();
    OsobaMetod najwyzszyHierarchiaWokol = new OsobaMetod();
    OsobaMetod swoi = new OsobaMetod();
    OsobaMetod osobyPozaSrodowisko = new OsobaMetod();
    OsobaMetod goscZHanba = new OsobaMetod();
    OsobaMetod rdzenny = new OsobaMetod();
    OsobaMetod biegacz = new OsobaMetod();
    OsobaMetod wrogowie = new OsobaMetod();
    OsobaMetod obsluga = new OsobaMetod();
    OsobaMetod kierownictwo = new OsobaMetod();
    OsobaMetod osoby = new OsobaMetod();
    OsobaMetod dzialajcyBliskoMiejsca = new OsobaMetod();
    OsobaMetod silniejszy = new OsobaMetod();

    public <T> List<T> of(T... elements){
        return Arrays.asList(elements);
    }

    public <T> T on(T... elements){
        return Arrays.stream(elements).findFirst().get();
    }

    public <T> T on(List<T> elements){
        return elements.stream().findFirst().get();
    }

    public <T> T oraz(List<T> elements){
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
    public TypZadania dudki(List<TypZadania> zadania) {return null;}
    public TypZadania stanKondycja(TypZadania zadanie) {return null;}
    public TypZadania stanKondycja(List<TypZadania> zadania) {return null;}
    public TypZadania antySamotnosc(TypZadania zadanie) {return null;}

    public static W OD(Integer wiek) { return W.WARUNEK;  }
    public static W T0(Integer wiek) { return W.WARUNEK;  }

    public static List<W> WARUNKI(List<List<W>> w){
        return new ArrayList<>();
    }
}
