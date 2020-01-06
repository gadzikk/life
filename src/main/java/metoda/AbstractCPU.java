package metoda;

import db.DB_Tematy;
import db.DB_Warunki;
import osoba.Osoba;
import sytuacja.Sytuacja;
import temat.TT;
import typy_bazowe.TypT;
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

    public <T> List<T> of(T... elements){
        return Arrays.asList(elements);
    }

    public static <T> List<T> sof(T... elements){
        return Arrays.asList(elements);
    }
}
