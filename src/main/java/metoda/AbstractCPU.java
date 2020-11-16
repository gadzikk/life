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
    List<W> all = new ArrayList<>();
    Sytuacja sytuacja = new Sytuacja();
    List<TypT> prefixes = DB_Tematy.PREFIXES;
    List<TypT> pdstw = DB_Tematy.PDSTW;
    List<TT> tematy = DB_Tematy.TEMATY;
    List<TT> kombo = DB_Tematy.KOMBO;
    List<TT> codzienne = DB_Tematy.CODZIENNE;
    W coTakPatrzysz;
    OsobaMetod ona = new OsobaMetod();
    OsobaMetod manago = new OsobaMetod();
    List<W> KRYTERIA_PRZYPALU_WARUNKI = DB_Warunki.KRYTERIA_PRZYPALU.getWarunki();
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
    List<W> RANY_WARUNKI = DB_Warunki.RANY.get(0).getWarunki();
    OsobaMetod znajomy = new OsobaMetod();
    List<W> PATOLOGIE_WSTEPNE_KOBIET = DB_Patologia.PATOLOGIE_WSTEPNE_KOBIETA.getWarunki();
    List<W> PATOLOGIE_UTRZYMANIA_KOBIET = DB_Patologia.PATOLOGIE_UTRZYMANIA_KOBIETA.getWarunki();
    List<W> PATOLOGIE = DB_Patologia.PATOLOGIE.get(0).getWarunki();
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
    List<W> KTO_KOGO_WARUNKI = DB_Warunki.KTO_KOGO.getWarunki();
    OsobaMetod karyna = new OsobaMetod();
    OsobaMetod cvia = new OsobaMetod();
    OsobaMetod srodowisko = new OsobaMetod();
    List<W> OSLONY_WARUNKI = DB_Warunki.OSLONY.getWarunki();
    List<W> KURESTWO_WARUNKI = DB_Warunki.KURESTWO.getWarunki();
    OsobaMetod grubasPrzewaga = new OsobaMetod();
    OsobaMetod fest = new OsobaMetod();
    OsobaMetod twoiWrogowie = new OsobaMetod();
    OsobaMetod zagraniczni = new OsobaMetod();
    OsobaMetod drugaStrona = new OsobaMetod();
    OsobaMetod zazdrosni = new OsobaMetod();
    OsobaMetod dzialaczMocny = new OsobaMetod();
    List<W> DEFAULT_WARUNKI = DB_Warunki.DEFAULT_WARUNKI.getWarunki();
    List<W> WYMAGA_KARY_WARUNKI = DB_Warunki.WYMAGA_KARY.getWarunki();
    List<W> KOGO_WARUNKI = DB_Warunki.KOGO.getWarunki();
    OsobaMetod zli = new OsobaMetod();
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

    List<W> PRZYCZYNY_SLUZENIA_ZLU_WARUNKI = DB_Warunki.PRZYCZYNY_SLUZENIA_ZLU.getWarunki();
    List<W> PRZYCZYNY_SLUZENIA_DOBRU_WARUNKI = DB_Warunki.PRZYCZYNY_SLUZENIA_DOBRU.getWarunki();
    List<W> ZACHETA_DO_ZLA_WARUNKI = DB_Warunki.ZACHETA_DO_ZLA.getWarunki();
    List<W> OBRONA_STARCIE_WARUNKI = DB_Warunki.OBRONA_STARCIE.getWarunki();
    List<W> METODA_STARCIE_REAKCJA_WARUNKI = DB_Warunki.METODA_STARCIE_REAKCJA.getWarunki();
    List<W> STRATY_MORALNE_WARUNKI = DB_Warunki.STRATY_MORALNE.getWarunki();
    List<W> STRATY_MATERIALNE_WARUNKI = DB_Warunki.STRATY_MATERIALNE.getWarunki();
    List<W> PATOLOGIE_OSIEDLE_WARUNKI = DB_Patologia.PATOLOGIE_OSIEDLE.getWarunki();
    List<W> TEMATY_NORMALNYCH_LUDZI_WARUNKI = DB_Warunki.TEMATY_NORMALNYCH_LUDZI.getWarunki();
    List<W> TEMATY_RDZENNYCH_WARUNKI = DB_Warunki.TEMATY_RDZENNYCH.getWarunki();
    List<W> CECHY_RDZENNY_WARUNKI = DB_Warunki.CECHY_RDZENNY.getWarunki();
    List<W> METODY_POLICYJNE_WARUNKI = DB_Warunki.METODY_POLICYJNE.getWarunki();
    List<W> ULICA_PRZEWAGA_REAKCJA_WARUNKI = DB_Warunki.ULICA_PRZEWAGA_REAKCJA.getWarunki();
    List<W> NASTAWIENIA_WARUNKI = DB_Warunki.NASTAWIENIA.getWarunki();
    List<W> WZGL_IZOLACJA_WARUNKI = DB_Warunki.WZGLEDNA_IZOLACJA.getWarunki();
    List<W> SPRZYJAJACE_WARUNKI = DB_Warunki.SPRZYJAJACE.getWarunki();
    List<W> NIE_SPRZYJAJACE_WARUNKI = DB_Warunki.NIE_SPRZYJAJACE.getWarunki();
    List<W> ESSENTIALS_WARUNKI = DB_Warunki.ESSENTIALS.getWarunki();
    List<W> PLANSZA_WARUNKI = DB_Warunki.PLANSZA.getWarunki();
    List<W> EXTREMALNE_WARUNKI = DB_Warunki.EXTREMALNE.getWarunki();
    List<W> SLABY_TCHORZ_WARUNKI = DB_Warunki.SLABY_TCHORZ.getWarunki();
    List<W> WADY_ZLYCH_WARUNKI = DB_Warunki.WADY_ZLYCH.getWarunki();
    List<W> WSPOMNIENIA_WARUNKI = DB_Warunki.WSPOMNIENIA.getWarunki();
    List<W> KONFRONTACJA_WARUNKI = DB_Warunki.KONFRONTACJA.getWarunki();
    List<W> OKAZJE_ZROBIENIE_ZLO_WARUNKI = DB_Warunki.OKAZJE_ZROBIENIE_ZLO.getWarunki();
    List<W> OKAZJE_ZROBIENIE_DOBRO_WARUNKI = DB_Warunki.OKAZJE_ZROBIENIE_DOBRO.getWarunki();
    List<W> ZLY_ZNAKI_ROZPOZNAWCZE_WARUNKI = DB_Warunki.ZLY_ZNAKI_ROZPOZNAWCZE.getWarunki();
    List<W> SONDA_DZIALACZ_WARUNKI = DB_Warunki.SONDA_DZIALACZA.getWarunki();
    List<W> SONDA_SHRTS_WARUNKI = DB_Warunki.SONDA_SHRTS.getWarunki();
    List<W> PRZEWAGI_WARUNKI = DB_Warunki.PRZEWAGI.getWarunki();



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

    public W potrzeba(List<W> warunki){return null;}

    public TypZadania dudki(TypZadania zadanie) {return null;}
    public TypZadania dudki(List<TypZadania> zadania) {return null;}
    public TypZadania stanKondycja(TypZadania zadanie) {return null;}
    public TypZadania stanKondycja(List<TypZadania> zadania) {return null;}
    public TypZadania antySamotnosc(TypZadania zadanie) {return null;}
}
