package metoda;

import db.DB_Patologia;
import db.DB_Tematy;
import db.DB_Warunki;
import osoba.Osoba;
import sytuacja.Sytuacja;
import temat.TT;
import typy_bazowe.TypT;
import typy_bazowe.TypZadania;
import warunek.W;
import warunek.WarunkiKategoria;
import z_inne.OsobaMetod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 31.12.19.
 */
public class AbstractCPU {
    List<MW> all = new ArrayList<>();
    Sytuacja sytuacja = new Sytuacja();
    List<TypT> prefixes = DB_Tematy.PREFIXES;
    List<TypT> pdstw = DB_Tematy.PDSTW;
    List<TT> tematy = DB_Tematy.TEMATY;
    List<TT> kombo = DB_Tematy.KOMBO;
    List<TT> codzienne = DB_Tematy.CODZIENNE;
    String coTakPatrzysz;
    OsobaMetod ona = new OsobaMetod();
    OsobaMetod manago = new OsobaMetod();
    List<W> kryteriaPrzypalu = DB_Warunki.KRYTERIA_PRZYPALU.getWarunki();
    List<TT> obelgi = DB_Tematy.TEMATY;
    List<W> terror = DB_Warunki.TERROR.getWarunki();
    List<TT> zarty = DB_Tematy.ZARTY;
    OsobaMetod wszyscy = new OsobaMetod();
    OsobaMetod osoba = new OsobaMetod();
    Osoba izolowanaOsoba = new Osoba();
    OsobaMetod dzialacz = new OsobaMetod();
    OsobaMetod zly = new OsobaMetod();
    OsobaMetod _100osob = new OsobaMetod();
    List<W> WYMAGANIA_WSTEPNE_ZARABIANIE =  DB_Warunki.WYMAGANIA_WSTEPNE_ZARABIANIE.getWarunki();
    OsobaMetod zasob = new OsobaMetod();
    OsobaMetod opponent = new OsobaMetod();
    OsobaMetod zaniepokojeni = new OsobaMetod();
    List<WarunkiKategoria> rany = DB_Warunki.RANY;
    OsobaMetod znajomy = new OsobaMetod();
    List<W> PATOLOGIE_WSTEPNE_KOBIET = DB_Patologia.PATOLOGIE_WSTEPNE_KOBIETA.getWarunki();
    List<W> PATOLOGIE_UTRZYMANIA_KOBIET = DB_Patologia.PATOLOGIE_UTRZYMANIA_KOBIETA.getWarunki();
    List<W> PATOLOGIE = DB_Patologia.PATOLOGIE.get(0).getWarunki();

    public <T> List<T> of(T... elements){
        return Arrays.asList(elements);
    }

    public <T> List<T> of(T e1, List<T> elems, T e2, List<T> elems2, List<String> elems3, List<W> elems4){
        return elems;
    }

    public W o(W w1, W w2, W w3){
        return W.WARUNEK;
    }

    public W potrzeba(List<W> warunki){return null;}

    public W temporal(W warunek) {return W.WARUNEK;}
    public W czas(W warunek) {return W.WARUNEK;}
    public W czasUlotnosc(W warunek) {return W.WARUNEK;}
    public TypZadania dudki(TypZadania zadanie) {return null;}
    public TypZadania dudki(List<TypZadania> zadania) {return null;}
    public TypZadania stanKondycja(TypZadania zadanie) {return null;}
    public TypZadania stanKondycja(List<TypZadania> zadania) {return null;}
    public TypZadania antySamotnosc(TypZadania zadanie) {return null;}
}
