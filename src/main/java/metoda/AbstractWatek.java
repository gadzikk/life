package metoda;

import db.DB_Patologia;
import db.DB_Sytuacje;
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
    List<W> ZBIOR_RANY = WARUNKI(DBW.ZBIOR_RANY);
    OsobaMetod znajomy = new OsobaMetod();
    List<W> PATOLOGIE_WSTEPNE_KOBIETA = DB_Patologia.PATOLOGIE_WSTEPNE_KOBIETA;
    List<W> PATOLOGIE_UTRZYMANIA_KOBIETA = DB_Patologia.PATOLOGIE_UTRZYMANIA_KOBIETA;
    List<W> KATEGORIA_PATOLOGIE = WARUNKI(DB_Patologia.KATEGORIA_PATOLOGIE);
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
    List<W> KRZYWDY_WARUNKI = DBW.KRZYWDY;
    OsobaMetod karyna = new OsobaMetod();
    OsobaMetod cvia = new OsobaMetod();
    OsobaMetod srodowisko = new OsobaMetod();
    List<W> OSLONY_WARUNKI = DBW.OSLONY;
    List<W> BRAK_ZASAD_WARUNKI = DBW.BRAK_ZASAD;
    OsobaMetod grubasPrzewaga = new OsobaMetod();
    OsobaMetod fest = new OsobaMetod();
    OsobaMetod twoiWrogowie = new OsobaMetod();
    OsobaMetod zagraniczni = new OsobaMetod();
    OsobaMetod drugaStrona = new OsobaMetod();
    OsobaMetod zazdrosni = new OsobaMetod();
    OsobaMetod dzialaczMocny = new OsobaMetod();
    List<W> DEFAULT_WARUNKI = DBW.DEFAULT_WARUNKI;
    List<W> WYMAGA_KARY_WARUNKI = DBW.WYMAGA_KARY;
    List<W> SONDA_KOGO_WARUNKI = DBW.SONDA_KOGO;
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

    List<W> PRZYCZYNY_ZLA_WARUNKI = DBW.PRZYCZYNY_ZLA;
    List<W> PRZYCZYNY_DOBRA_WARUNKI = DBW.PRZYCZYNY_DOBRA;
    List<W> ZACHETA_DO_ZLA_WARUNKI = DBW.ZACHETA_DO_ZLA;
    List<W> OBRONA_STARCIE_WARUNKI = DBW.OBRONA_STARCIE;
    List<W> METODA_STARCIE_REAKCJA_WARUNKI = DBW.METODA_STARCIE_REAKCJA;
    List<W> STRATY_MORALNE_WARUNKI = DBW.STRATY_MORALNE;
    List<W> STRATY_MATERIALNE_WARUNKI = DBW.STRATY_MATERIALNE;
    List<W> PATOLOGIE_OSIEDLE_WARUNKI = DB_Patologia.PATOLOGIE_OSIEDLE;
    List<W> TEMATY_NORMALNYCH_LUDZI_WARUNKI = DBW.TEMATY_NORMALNYCH_LUDZI;
    List<W> TEMATY_RDZENNYCH_WARUNKI = DBW.TEMATY_RDZENNYCH;
    List<W> CECHY_RDZENNY_WARUNKI = DBW.CECHY_RDZENNY;
    List<W> METODY_POLICYJNE_WARUNKI = DBW.METODY_POLICYJNE;
    List<W> ULICA_PRZEWAGA_SPOSOB_WARUNKI = DBW.ULICA_PRZEWAGA_SPOSOB;
    List<W> NASTAWIENIA_WARUNKI = DBW.NASTAWIENIA;
    List<W> WZGL_IZOLACJA_WARUNKI = DBW.WZGLEDNA_IZOLACJA;
    List<W> SPRZYJAJACE_WARUNKI = DBW.SPRZYJAJACE;
    List<W> NIE_SPRZYJAJACE_WARUNKI = DBW.NIE_SPRZYJAJACE;
    List<W> ESSENTIALS_SYTUACJE = DBW.ESSENTIALS_SYTUACJE;
    List<W> PLANSZA_WARUNKI = DBW.PLANSZA;
    List<W> EXTREMALNE_SYTUACJE = DBW.EXTREMALNE_SYTUACJE;
    List<W> SLABY_TCHORZ_WARUNKI = DBW.SLABY_TCHORZ;
    List<W> WADY_ZLYCH_WARUNKI = DBW.WADY_ZLYCH;
    List<W> WSPOMNIENIA_WARUNKI = DBW.WSPOMNIENIA;
    List<W> KONFRONTACJA_WARUNKI = DBW.KONFRONTACJA;
    List<W> OKAZJE_ZROBIENIE_ZLO_WARUNKI = DBW.OKAZJE_ZROBIENIE_ZLO;
    List<W> OKAZJE_ZROBIENIE_DOBRO_WARUNKI = DBW.OKAZJE_ZROBIENIE_DOBRO;
    List<W> ZLY_ZNAKI_ROZPOZNAWCZE_WARUNKI = DBW.ZLY_ZNAKI_ROZPOZNAWCZE;
    List<W> PRZEWAGI_WARUNKI = DBW.PRZEWAGI;

    List<W> SONDA_GDY_WARUNKI = DBW.SONDA_GDY;
    List<W> SONDA_PO_WARUNKI = DBW.SONDA_PO;
    List<W> SONDA_DZIALACZA_WARUNKI = DBW.SONDA_DZIALACZA;
    List<W> SONDA_SHRTS_WARUNKI = DBW.SONDA_SHRTS;

    List<W> TYPY_LUDZI_SHRT_WARUNKI = DBW.TYPY_LUDZI_SHRT;
    List<W> TYPY_LUDZI_DOBRE_WARUNKI = DBW.TYPY_LUDZI_DOBRE;
    List<W> TYPY_LUDZI_ZLE_WARUNKI = DBW.TYPY_LUDZI_ZLE;

    List<W> CISNIE_WARUNKI = DBW.CISNIE;

    List<W> ZACHOWANIE_REZULTAT_ULICA_WARUNKI = DBW.ZACHOWANIE_REZULTAT_ULICA;
    List<W> SYTUACJE_STARCIE_WARUNKI = DBW.SYTUACJE_STARCIE;

    List<W> ZBIOR_CZAS = WARUNKI(DBW.ZBIOR_CZAS);

    List<W> DUZO_IF_WARUNKI = DBW.DUZO_IF;
    List<W> WYMAGANIA_UTRZYMANIA_KOBIETA = DBW.WYMAGANIA_UTRZYMANIA_KOBIETA;
    List<W> KSZTALTOWANIE_CZLOWIEKA_WARUNKI = DBW.KSZTALTOWANIE_CZLOWIEKA;
    List<W> KSZTALTOWANIE_DZIELNICY_WARUNKI = DBW.KSZTALTOWANIE_DZIELNICY;

    List<W> HIERARCHIA_PRACA_WARUNKI = DBW.HIERARCHIA_PRACA;
    List<W> ZAROBEK_NIELEGALNY_WARUNKI = DBW.ZAROBEK_NIELEGALNY;
    List<W> ZBIOR_EMOCJE_UCZUCIA = WARUNKI(DBW.ZBIOR_EMOCJE_UCZUCIA);
    List<W> ZBIOR_ROZRYWKI_ZART = WARUNKI(DBW.ZBIOR_ROZRYWKI_ZART);
    List<W> KRYTERIA_WROGA_WARUNKI = DBW.KRYTERIA_WROGA;
    List<W> NIESPRAWIEDLIWOSC_WARUNKI = DBW.NIESPRAWIEDLIWOSC;
    List<W> PRZYMUS_WARUNKI = DBW.PRZYMUS;
    List<W> POTRZEBY_WARUNKI = DBW.POTRZEBY;
    List<W> ZASADY_WARUNKI = DBW.ZASADY;
    List<W> ZAGROZENIA_WARUNKI = DBW.ZAGROZENIA;
    List<W> CIERPIENIA_WARUNKI = DBW.CIERPIENIA;
    List<W> SLABOSCI_WARUNKI = DBW.SLABOSCI;
    List<W> THREAD_WHILE_LOOP_WARUNKI = DBW.THREAD_WHILE_LOOP;
    List<W> OCENIA_WEDLUG_WARUNKI = DBW.OCENIA_WEDLUG;
    List<W> GLOBAL_PLANSZA_PRACA_WARUNKI = DBW.GLOBAL_PLANSZA_PRACA;
    List<W> GLOBAL_PLANSZA_LUDZIE_WARUNKI = DBW.GLOBAL_PLANSZA_LUDZIE;

    List<W> KATEGORIA_WYMAGANIA_WSTEPNE = WARUNKI(DBW.KATEGORIA_WYMAGANIA_WSTEPNE);
    List<W> KATEGORIA_WYMAGANIA_UTRZYMANIA = WARUNKI(DBW.KATEGORIA_WYMAGANIA_UTRZYMANIA);
    List<W> KATEGORIA_WARUNKI_KONCOWE = WARUNKI(DBW.KATEGORIA_WARUNKI_KONCOWE);

    List<W> TYPY_SYTUACJI = DBW.TYPY_SYTUACJI;
    List<W> ZBIOR_TYPY_LUDZI = WARUNKI(DBW.ZBIOR_TYPY_LUDZI);
    List<W> ZBIOR_TEMATY = WARUNKI(DBW.ZBIOR_TEMATY);
    List<W> WYMUSZENIE_REAKCJI_WARUNKI = DBW.WYMUSZENIE_REAKCJI;
    List<W> RODZAJE_WIEDZA_WARUNKI = DBW.RODZAJE_WIEDZA;
    List<W> REAKCJA_KOBIET_WARUNKI = DBW.REAKCJA_KOBIET;

    List<W> ZBIOR_WIEDZA = WARUNKI(DBW.ZBIOR_WIEDZA);
    List<W> CHCIANA_SYTUACJE = DB_Sytuacje.CHCIANA_SYTUACJA;
    List<W> ZBIOR_DOPUSZCZENIE_WARUNKI = WARUNKI(DBW.ZBIOR_DOPUSZCZENIE);
    List<W> ZBIOR_PRZEWAGI = WARUNKI(DBW.ZBIOR_PRZEWAGI);
    List<W> PRZEWAGI_Z_ULICY_WARUNKI = DBW.PRZEWAGI_Z_ULICY;
    List<W> EMOCJE_NEGATYWNE_WARUNKI = DBW.EMOCJE_NEGATYWNE;
    List<W> UCZUCIA_NEGATYWNE_WARUNKI = DBW.UCZUCIA_NEGATYWNE;

    List<W> PATOLOGIE_ZWIAZKU = DB_Patologia.PATOLOGIE_ZWIAZKU;
    List<W> PATOLOGIE_KONCOWE_KOBIETA = DB_Patologia.PATOLOGIE_KONCOWE_KOBIETA;
    List<W> SILNE_WIEZY_CZLOWIEKA_WARUNKI = DBW.SILNE_WIEZY_CZLOWIEKA;
    List<W> RELACJE_WARUNKI = DBW.RELACJE;
    List<W> WALKA_WARUNKI = DBW.WALKA;
    List<W> ZASIEG_PRZEWAGI_ULICA_WARUNKI = DBW.ZASIEG_PRZEWAGI_ULICA;
    List<W> KRZYWDY_BEZPOSREDNIE_WARUNKI = DBW.KRZYWDY_BEZPOSREDNIE;
    List<W> KRZYWDY_POSREDNIE_WARUNKI = DBW.KRZYWDY_POSREDNIE;
    List<W> PRZEWAGI_MATERIALNE_WARUNKI = DBW.PRZEWAGI_MATERIALNE;
    List<W> BLEDY_WARUNKI = DBW.BLEDY;
    List<W> REAKCJE_WARUNKI = DBW.REAKCJE;
    List<W> SPORT_WARUNKI = DBW.SPORT;
    List<W> TYPY_MIEJSC_WARUNKI = DBW.TYPY_MIEJSC;
    List<W> KONTROLA_WARUNKI = DBW.KONTROLA;
    List<W> ANTY_DZIALACZ_ZLA_WARUNKI = DBW.ANTY_DZIALACZ_ZLA;
    List<W> PRZEWAGI_DANEJ_CHWILI_WARUNKI = DBW.PRZEWAGI_DANEJ_CHWILI;
    List<W> SONDA_PRZYCZYN_WARUNKI = DBW.SONDA_PRZYCZYN;


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
