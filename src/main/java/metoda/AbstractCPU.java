package metoda;

import db.DB_Patologia;
import db.DB_Sytuacje;
import db.DB_Tematy;
import db.DB_Warunki;
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
public class AbstractCPU {
    List<TypT> prefixes = DB_Tematy.PREFIXES;
    List<TypT> pdstw = DB_Tematy.PDSTW;
    List<TT> tematy = DB_Tematy.TEMATY;
    List<TT> kombo = DB_Tematy.KOMBO;
    List<TT> codzienne = DB_Tematy.CODZIENNE;
    W coTakPatrzysz;
    OsobaMetod ona = new OsobaMetod();
    OsobaMetod manago = new OsobaMetod();
    List<W> KRYTERIA_PRZYPALU_WARUNKI = DB_Warunki.KRYTERIA_PRZYPALU;
    List<TT> obelgi = DB_Tematy.TEMATY;
    List<W> terror = DB_Warunki.TERROR;
    List<TT> zarty = DB_Tematy.ZARTY;
    OsobaMetod wszyscy = new OsobaMetod();
    OsobaMetod osoba = new OsobaMetod();
    Osoba izolowanaOsoba = new Osoba();
    OsobaMetod dzialacz = new OsobaMetod();
    OsobaMetod zly = new OsobaMetod();
    OsobaMetod _100osob = new OsobaMetod();
    List<W> WYMAGANIA_WSTEPNE_ZARABIANIE =  DB_Warunki.WYMAGANIA_WSTEPNE_ZARABIANIE;
    OsobaMetod zasob = new OsobaMetod();
    OsobaMetod opponent = new OsobaMetod();
    OsobaMetod zaniepokojeni = new OsobaMetod();
    List<W> ZBIOR_RANY = WARUNKI(DB_Warunki.ZBIOR_RANY);
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
    List<W> KRZYWDY_WARUNKI = DB_Warunki.KRZYWDY;
    OsobaMetod karyna = new OsobaMetod();
    OsobaMetod cvia = new OsobaMetod();
    OsobaMetod srodowisko = new OsobaMetod();
    List<W> OSLONY_WARUNKI = DB_Warunki.OSLONY;
    List<W> BRAK_ZASAD_WARUNKI = DB_Warunki.BRAK_ZASAD;
    OsobaMetod grubasPrzewaga = new OsobaMetod();
    OsobaMetod fest = new OsobaMetod();
    OsobaMetod twoiWrogowie = new OsobaMetod();
    OsobaMetod zagraniczni = new OsobaMetod();
    OsobaMetod drugaStrona = new OsobaMetod();
    OsobaMetod zazdrosni = new OsobaMetod();
    OsobaMetod dzialaczMocny = new OsobaMetod();
    List<W> DEFAULT_WARUNKI = DB_Warunki.DEFAULT_WARUNKI;
    List<W> WYMAGA_KARY_WARUNKI = DB_Warunki.WYMAGA_KARY;
    List<W> SONDA_KOGO = DB_Warunki.SONDA_KOGO;
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

    List<W> PRZYCZYNY_SLUZENIA_ZLU_WARUNKI = DB_Warunki.PRZYCZYNY_SLUZENIA_ZLU;
    List<W> PRZYCZYNY_SLUZENIA_DOBRU_WARUNKI = DB_Warunki.PRZYCZYNY_SLUZENIA_DOBRU;
    List<W> ZACHETA_DO_ZLA_WARUNKI = DB_Warunki.ZACHETA_DO_ZLA;
    List<W> OBRONA_STARCIE_WARUNKI = DB_Warunki.OBRONA_STARCIE;
    List<W> METODA_STARCIE_REAKCJA_WARUNKI = DB_Warunki.METODA_STARCIE_REAKCJA;
    List<W> STRATY_MORALNE_WARUNKI = DB_Warunki.STRATY_MORALNE;
    List<W> STRATY_MATERIALNE_WARUNKI = DB_Warunki.STRATY_MATERIALNE;
    List<W> PATOLOGIE_OSIEDLE_WARUNKI = DB_Patologia.PATOLOGIE_OSIEDLE;
    List<W> TEMATY_NORMALNYCH_LUDZI_WARUNKI = DB_Warunki.TEMATY_NORMALNYCH_LUDZI;
    List<W> TEMATY_RDZENNYCH_WARUNKI = DB_Warunki.TEMATY_RDZENNYCH;
    List<W> CECHY_RDZENNY_WARUNKI = DB_Warunki.CECHY_RDZENNY;
    List<W> METODY_POLICYJNE_WARUNKI = DB_Warunki.METODY_POLICYJNE;
    List<W> ULICA_PRZEWAGA_SPOSOB_WARUNKI = DB_Warunki.ULICA_PRZEWAGA_SPOSOB;
    List<W> NASTAWIENIA_WARUNKI = DB_Warunki.NASTAWIENIA;
    List<W> WZGL_IZOLACJA_WARUNKI = DB_Warunki.WZGLEDNA_IZOLACJA;
    List<W> SPRZYJAJACE_WARUNKI = DB_Warunki.SPRZYJAJACE;
    List<W> NIE_SPRZYJAJACE_WARUNKI = DB_Warunki.NIE_SPRZYJAJACE;
    List<W> ESSENTIALS_SYTUACJE = DB_Warunki.ESSENTIALS_SYTUACJE;
    List<W> PLANSZA_WARUNKI = DB_Warunki.PLANSZA;
    List<W> EXTREMALNE_SYTUACJE = DB_Warunki.EXTREMALNE_SYTUACJE;
    List<W> SLABY_TCHORZ_WARUNKI = DB_Warunki.SLABY_TCHORZ;
    List<W> WADY_ZLYCH_WARUNKI = DB_Warunki.WADY_ZLYCH;
    List<W> WSPOMNIENIA_WARUNKI = DB_Warunki.WSPOMNIENIA;
    List<W> KONFRONTACJA_WARUNKI = DB_Warunki.KONFRONTACJA;
    List<W> OKAZJE_ZROBIENIE_ZLO_WARUNKI = DB_Warunki.OKAZJE_ZROBIENIE_ZLO;
    List<W> OKAZJE_ZROBIENIE_DOBRO_WARUNKI = DB_Warunki.OKAZJE_ZROBIENIE_DOBRO;
    List<W> ZLY_ZNAKI_ROZPOZNAWCZE_WARUNKI = DB_Warunki.ZLY_ZNAKI_ROZPOZNAWCZE;
    List<W> PRZEWAGI_WARUNKI = DB_Warunki.PRZEWAGI;

    List<W> SONDA_GDY_WARUNKI = DB_Warunki.SONDA_GDY;
    List<W> SONDA_PO_WARUNKI = DB_Warunki.SONDA_PO;
    List<W> SONDA_DZIALACZA_WARUNKI = DB_Warunki.SONDA_DZIALACZA;
    List<W> SONDA_SHRTS_WARUNKI = DB_Warunki.SONDA_SHRTS;

    List<W> TYPY_LUDZI_SHRT_WARUNKI = DB_Warunki.TYPY_LUDZI_SHRT;
    List<W> TYPY_LUDZI_DOBRE_WARUNKI = DB_Warunki.TYPY_LUDZI_DOBRE;
    List<W> TYPY_LUDZI_ZLE_WARUNKI = DB_Warunki.TYPY_LUDZI_ZLE;

    List<W> CISNIE_WARUNKI = DB_Warunki.CISNIE;

    List<W> ZACHOWANIE_REZULTAT_ULICA_WARUNKI = DB_Warunki.ZACHOWANIE_REZULTAT_ULICA;
    List<W> SYTUACJE_STARCIE_WARUNKI = DB_Warunki.SYTUACJE_STARCIE;

    List<W> ZBIOR_CZAS = WARUNKI(DB_Warunki.ZBIOR_CZAS);

    List<W> DUZO_IF_WARUNKI = DB_Warunki.DUZO_IF;
    List<W> WYMAGANIA_UTRZYMANIA_KOBIETA = DB_Warunki.WYMAGANIA_UTRZYMANIA_KOBIETA;
    List<W> KSZTALTOWANIE_CZLOWIEKA_WARUNKI = DB_Warunki.KSZTALTOWANIE_CZLOWIEKA;
    List<W> KSZTALTOWANIE_DZIELNICY_WARUNKI = DB_Warunki.KSZTALTOWANIE_DZIELNICY;

    List<W> HIERARCHIA_PRACA_WARUNKI = DB_Warunki.HIERARCHIA_PRACA;
    List<W> ZAROBEK_NIELEGALNY_WARUNKI = DB_Warunki.ZAROBEK_NIELEGALNY;
    List<W> ZBIOR_EMOCJE_UCZUCIA = WARUNKI(DB_Warunki.ZBIOR_EMOCJE_UCZUCIA);
    List<W> ZBIOR_ROZRYWKI_ZART = WARUNKI(DB_Warunki.ZBIOR_ROZRYWKI_ZART);
    List<W> KRYTERIA_WROGA_WARUNKI = DB_Warunki.KRYTERIA_WROGA;
    List<W> NIESPRAWIEDLIWOSC_WARUNKI = DB_Warunki.NIESPRAWIEDLIWOSC;
    List<W> PRZYMUS_WARUNKI = DB_Warunki.PRZYMUS;
    List<W> POTRZEBY_WARUNKI = DB_Warunki.POTRZEBY;
    List<W> ZASADY_WARUNKI = DB_Warunki.ZASADY;
    List<W> ZAGROZENIA_WARUNKI = DB_Warunki.ZAGROZENIA;
    List<W> CIERPIENIA_WARUNKI = DB_Warunki.CIERPIENIA;
    List<W> SLABOSCI_WARUNKI = DB_Warunki.SLABOSCI;
    List<W> THREAD_WHILE_LOOP_WARUNKI = DB_Warunki.THREAD_WHILE_LOOP;
    List<W> OCENIA_WEDLUG_WARUNKI = DB_Warunki.OCENIA_WEDLUG;
    List<W> GLOBAL_PLANSZA_PRACA_WARUNKI = DB_Warunki.GLOBAL_PLANSZA_PRACA;
    List<W> GLOBAL_PLANSZA_LUDZIE_WARUNKI = DB_Warunki.GLOBAL_PLANSZA_LUDZIE;

    List<W> KATEGORIA_WYMAGANIA_WSTEPNE = WARUNKI(DB_Warunki.KATEGORIA_WYMAGANIA_WSTEPNE);
    List<W> KATEGORIA_WYMAGANIA_UTRZYMANIA = WARUNKI(DB_Warunki.KATEGORIA_WYMAGANIA_UTRZYMANIA);
    List<W> KATEGORIA_WARUNKI_KONCOWE = WARUNKI(DB_Warunki.KATEGORIA_WARUNKI_KONCOWE);

    List<W> TYPY_SYTUACJI = DB_Warunki.TYPY_SYTUACJI;
    List<W> ZBIOR_TYPY_LUDZI = WARUNKI(DB_Warunki.ZBIOR_TYPY_LUDZI);
    List<W> ZBIOR_TEMATY = WARUNKI(DB_Warunki.ZBIOR_TEMATY);
    List<W> WYMUSZENIE_REAKCJI_WARUNKI = DB_Warunki.WYMUSZENIE_REAKCJI;
    List<W> RODZAJE_WIEDZA_WARUNKI = DB_Warunki.RODZAJE_WIEDZA;
    List<W> REAKCJA_KOBIET_WARUNKI = DB_Warunki.REAKCJA_KOBIET;

    List<W> ZBIOR_WIEDZA = WARUNKI(DB_Warunki.ZBIOR_WIEDZA);
    List<W> CHCIANA_SYTUACJE = DB_Sytuacje.CHCIANA_SYTUACJA;
    List<W> ZBIOR_DOPUSZCZENIE_WARUNKI = WARUNKI(DB_Warunki.ZBIOR_DOPUSZCZENIE);
    List<W> ZBIOR_PRZEWAGI = WARUNKI(DB_Warunki.ZBIOR_PRZEWAGI);
    List<W> PRZEWAGI_Z_ULICY_WARUNKI = DB_Warunki.PRZEWAGI_Z_ULICY;
    List<W> EMOCJE_NEGATYWNE_WARUNKI = DB_Warunki.EMOCJE_NEGATYWNE;
    List<W> UCZUCIA_NEGATYWNE_WARUNKI = DB_Warunki.UCZUCIA_NEGATYWNE;

    List<W> PATOLOGIE_ZWIAZKU = DB_Patologia.PATOLOGIE_ZWIAZKU;
    List<W> PATOLOGIE_KONCOWE_KOBIETA = DB_Patologia.PATOLOGIE_KONCOWE_KOBIETA;
    List<W> SILNE_WIEZY_CZLOWIEKA_WARUNKI = DB_Warunki.SILNE_WIEZY_CZLOWIEKA;
    List<W> RELACJE_WARUNKI = DB_Warunki.RELACJE;
    List<W> WALKA_WARUNKI = DB_Warunki.WALKA;
    List<W> ZASIEG_PRZEWAGI_ULICA_WARUNKI = DB_Warunki.ZASIEG_PRZEWAGI_ULICA;
    List<W> KRZYWDY_BEZPOSREDNIE_WARUNKI = DB_Warunki.KRZYWDY_BEZPOSREDNIE;
    List<W> KRZYWDY_POSREDNIE_WARUNKI = DB_Warunki.KRZYWDY_POSREDNIE;
    List<W> PRZEWAGI_MATERIALNE_WARUNKI = DB_Warunki.PRZEWAGI_MATERIALNE;
    List<W> BLEDY_WARUNKI = DB_Warunki.BLEDY;
    List<W> REAKCJE_WARUNKI = DB_Warunki.REAKCJE;
    List<W> SPORT_WARUNKI = DB_Warunki.SPORT;
    List<W> TYPY_MIEJSC_WARUNKI = DB_Warunki.TYPY_MIEJSC;
    List<W> KONTROLA_WARUNKI = DB_Warunki.KONTROLA;
    List<W> ANTY_DZIALACZ_ZLA_WARUNKI = DB_Warunki.ANTY_DZIALACZ_ZLA;


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
