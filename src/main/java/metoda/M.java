package metoda;

import sytuacja.Sytuacja;
import sytuacja.TypSytuacja;
import temat.TT;
import typy_bazowe.TypOsoby;
import typy_bazowe.TypT;
import warunek.Warunek;

import java.util.Arrays;
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
    public static String wejsciePlansza(List<Warunek> plansza){
        return "wejsciePlansza("+ plansza +")";
    }
    public static String namierzenie(){
        return "namierzenie()";
    }

    public static String sondaOsoby(List<Warunek> osobaCechy){
        return "sondaOsoby("+osobaCechy+")";
    }

    public static String sondaSytuacji(List<TypSytuacja> typySytuacji, List<Warunek> essentials){
        return "sondaSytuacji("+ typySytuacji +" "+ essentials +")";
    }

    public static String odrazuPochwycenie(Warunek warunek){
        return "odrazuPochwycenie("+ warunek +")";
    }
    public static String dzialanie(List<Warunek> mojeCechy){
        return "odrazuPochwycenie("+ mojeCechy +")";
    }

    public static String GRANT(TypOsoby osoba, Warunek warunek){
        return "odrazuPochwycenie("+ osoba +" "+ warunek +")";
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

    public static String gadka(List<TT> tematy){
        return "gadka("+ tematy +")";
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


}
