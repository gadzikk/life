package metoda;

import sytuacja.TypSytuacja;
import temat.TT;
import typy_bazowe.TypOsoby;
import typy_bazowe.TypT;
import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 21.12.19.
 */
public enum M {


    REMIND /*TODO */, ANTY_PARTYZANTKA,

    SPOJRZENIE, PRZEJSCIE, ZAGADANIE, ZWROCENIE_UWAGI,

 // SHRTSTCPU1:



    NAMIERZENIE,
    SONDA_OSOBY, SONDA_SYTUACJI,

    PONOWIENIE, WZIECIE_NUMERU,
    PRZEWIDYWANIE, DUZO_OD_SIEBIE, EMOCJA,
 // SONDA OSOBY
    STWARZA_POINTCUT, REAGUJE,










 // GADKA

 // POZNANIE

 // NIUNI


// DZIALANIE SPRZET

 // OSIEDLOWEGO

 // CZORTA

 // MANAGERA

 // WYCHOWYWANIE

   // NEGOCJACJE TODO: NEGOCJACJE JAKO WARUNEK, WARUNKI UTRZYMANIA, przenies do metod
   PROSBA,
   PRZEKONYWANIE_SENTYMENTEM, PRZEKONYWANIE_ARGUMENTAMI , PRZEKONYWANIE_WARTOSCIA, PRZEKONYWANIE_OTOCZENIA,
   SZANTAZ, STARCIE


   ;
    public static String wejsciePlansza(List<W> plansza){
        return "wejsciePlansza("+ plansza +")";
    }
    public static String namierzenie(){
        return "namierzenie()";
    }

    public static String sondaOsoby(List<W> osobaCechy){
        return "sondaOsoby("+osobaCechy+")";
    }

    public static String sondaSytuacji(List<TypSytuacja> typySytuacji, List<W> essentials){
        return "sondaSytuacji("+ typySytuacji +" "+ essentials +")";
    }

    public static String odrazuPochwycenie(W w){
        return "odrazuPochwycenie("+ w +")";
    }
    public static String dzialanie(List<W> mojeCechy){
        return "odrazuPochwycenie("+ mojeCechy +")";
    }

    public static String GRANT(TypOsoby osoba, W w){
        return "GRANT("+ osoba +" "+ w +")";
    }
    public static String REMIND(TypOsoby osoba, W w){
        return "REMIND("+ osoba +" "+ w +")";
    }
    public static String REMIND(TypOsoby osoba, List<W> w){
        return "REMIND("+ osoba +" "+ w +")";
    }
    public static String REMOVE(TypOsoby osoba, W w){
        return "REMOVE("+ osoba +" "+ w +")";
    }

    public static String wstanie(){
        return "wstanie()";
    }

    public static String przejscie(){
        return "przejscie()";
    }

    public static String prefix(List<TypT> prefixes, List<TypT> pdstw){
        return "prefix("+ prefixes + " "+ pdstw +")";
    }

    public static String prefixMimoWszystko(List<TypT> prefixes, List<TypT> pdstw){
        return "prefix("+ prefixes + " "+ pdstw +")";
    }

    public static String gadka(List<TT> tematy, List<TT> kombo){
        return "gadka("+ tematy +" "+ kombo +")";
    }

    public static String wziecieKontaktu(){
        return "wziecieKontaktu()";
    }

    public static String temat(){
        return "temat()";
    }

    public static String ponowienie(){
        return "ponowienie()";
    }

    public static String cipa(){
        return "cipa()";
    }

    public static String pokazZainteresowanie(){
        return "pokazZainteresowanie()";
    }

    public static String II(){
        return "II()";
    }
    public static String izoluj(){return "izoluj()";}
    public static String pomysl(List<W> warunki){
        return "pomysl("+ warunki +")";

    }
    public static String nieOddalaszWzroku(){ return "nieOddalaszWzroku()";}

    public static String zwazNaSzczegoly(){ return "zwazNaSzczegoly()";}
    public static String pokazSie(){ return "pokazSie()";}

    public static String wypracujDobraSytuacje(W ogranicznieCzasowe){ return "wypracujDobraSytuacje("+ ogranicznieCzasowe +")";}
    public static String oczekujNaSpojrzenie(W ogranicznieCzasowe){ return "oczekujNaSpojrzenie("+ ogranicznieCzasowe +")";}
    public static String wlozDoKubelka(){ return "wlozDoKubelka()";}

    public static String przechodziszTylkoRaz(){return "przechodziszTylkoRaz()";}
    public static String omijaszPartyzantke(){return "omijaszPartyzantke()";}
    public static String podbicieZJednejProby(){return "podbicieZJednejProby()";}

    public static String popierdalaszObecna() {return "popierdalaszObecna()";}
    public static String jazdaZLepsza() {return "jazdaZLepsza()";}
    public static String niesiadasz() {return "niesiadasz()";}
    public static String szukanieDobrejPlanszy() {return "szukanieDobrejPlanszy()";}
    public static String pobierzInformacjeStrefy() {return "pobierzInformacjeStrefy()";}
    public static String wybierzStrefe() {return "wybierzStrefe()";}
    public static String sondaPrzystanekKoncowy() {return "sondaPrzystanekKoncowy()";}
    public static String skupiaszNaPrzystankach() {return "szukanieDobrejPlanszy()";}
    public static String rozgladniecie() {return "rozgladniecie()";}
    public static String odrazuPoWejsciu() {return "odrazuPoWejsciu()";}
    public static String poJakimsCzasie() {return "poJakimsCzasie()";}
    public static String odrazuPoWyjsciu() {return "odrazuPoWyjsciu()";}
    public static String lecZaNia() {return "lecZaNia()";}
    public static String dogon() {return "dogon()";}
    public static String sciagajGadke() {return "sciagajGadke()";}
    public static String docen() {return "sciagajGadke()";}
    public static String sondujWarunekDodatni() {return "sondujWarunekDodatni()";}
    public static String zwrocUwage() {return "zwrocUwage()";}
    public static String abyInniMysleliZeZnasz() {return "abyInniMysleliZeZnasz()";}
    public static String wchodziszWychodzisz(W miejsce){ return "oczekujNaSpojrzenie("+ miejsce +")";}
    public static String niePrzestraszenie() {return "niePrzestraszenie()";}
    public static String dzialajJakbyNieBylo() {return "dzialajJakbyNieBylo()";}
    public static String stajesz2s() {return "stajesz2s()";}
    public static String kontekst() {return "kontekst()";}
    public static String sondaGdzie() {return "sondaGdzie()";}
    public static String bijesz() {return "bijesz()";}
    public static String temat_x3(List<TT> tematy) {return "temat_x3("+ tematy +")";}
    public static String przewidywanie_x3() {return "przewidywanie_x3()";}


}
