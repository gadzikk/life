import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 22.12.19.
 */
public class Consts {

    KategoriaWarunki WYMAGANIA_WSTEPNE_SWIAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE,TypKategoria.SWIAT),
            Arrays.asList(
                    Warunek.ZWIAZEK_2_OSOB,
                    Warunek.URODZENIE_SIE,
                    Warunek.ZDROWIE,
                    Warunek.BYT_MATERIALNY)
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_INFORMACJA = new KategoriaWarunki(
            new Kategoria(
                    TypKategoria.WYMAGANIA_WSTEPNE,TypKategoria.INFORMACJA),
            Arrays.asList(
                    Warunek.CZAS,
                    Warunek.DOSTEP_DO_PLANSZY,
                    Warunek.LUDZIE,
                    Warunek.MATERIALNE_ZNALEZIENIE_SIE,
                    Warunek.SONDA,
                    Warunek.SZCZEGOLY
                    )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_WIEDZA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE,TypKategoria.WIEDZA),
            Arrays.asList(
                    Warunek.INFORMACJA,
                    Warunek.PRZYCZYNA,
                    Warunek.SKUTEK,
                    Warunek.WNIOSKI
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_BRAKWSTYDU = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE,TypKategoria.BRAKWSTYDU),
            Arrays.asList(
                    Warunek.INFORMACJA,
                    Warunek.WIEDZA,
                    Warunek.DZIALANIE
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_REZULTAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE,TypKategoria.REZULTAT),
            Arrays.asList(
                    Warunek.DZIALANIE,
                    Warunek.KONSEKWENCJE,
                    Warunek.WNIOSKI,
                    Warunek.REZULTAT
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_PRACA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE,TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.NIEKARALNOSC,
                    Warunek.WYKSZTALCENIE,
                    Warunek.DOSWIADCZENIE,
                    Warunek.UMIEJETNOSCI,
                    Warunek.ZNAJOMOSCI
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_PRACA_RESTRYKCYJNA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE,TypKategoria.PRACA_RESTRYKCYJNA),
            Arrays.asList(
                    Warunek.NIEKARALNOSC,
                    Warunek.STUDIA,
                    Warunek.KILKA_LAT_DOSWIADCZENIA,
                    Warunek.WIELE_UMIEJETNOSCI,
                    Warunek.Z_POLECENIA
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_ZARABIANIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE,TypKategoria.ZARABIANIE),
            Arrays.asList(
                    Warunek.UMOWA_PRACA,
                    Warunek.WYKONYWANIE_PRACY
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_SPORT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE,TypKategoria.SPORT),
            Arrays.asList(
                    Warunek.CZAS,
                    Warunek.SPRAWNOSC,
                    Warunek.ZDOLNOSC_DO_WYSILKU,
                    Warunek.EKWIPUNEK,
                    Warunek.ZGODA_OTOCZENIA
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_OSIEDLE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE,TypKategoria.OSIEDLE),
            Arrays.asList(
                    Warunek.TO_SAMO_MIASTO,
                    Warunek.DOBRZE_WYGLADA,
                    Warunek.ZNAJOMY_W_SRODOWISKU,
                    Warunek.NIE_PRZECIWNY,
                    Warunek.NIE_KONFI
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_DOPUSZCZENIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE,TypKategoria.DOPUSZCZENIE),
            Arrays.asList(
                    Warunek.PATRZY,
                    Warunek.REAGUJE,
                    Warunek.USMIECHA,
                    Warunek.DOBRO,

                    Warunek.KOJARZY,
                    Warunek.KTORYS_RAZ,
                    Warunek.WSPOLNI_ZNAJOMI,

                    Warunek.BEZPIECZENSTWO,
                    Warunek.NUDA,
                    Warunek.PODOBA_SIE,

                    Warunek.MUSI_DOPUSCIC
            )
    );

    KategoriaWarunki WYMAGANIA_WSTEPNE_KOBIETA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE,TypKategoria.KOBIETA),
            Arrays.asList(
                    Warunek.STWORZENIE_POINTCUTA,
                    Warunek.ZLAPANIE_POINTCUTA,
                    Warunek.POZNANIE,
                    Warunek.DOPUSZCZENIE,

                    Warunek.PARZONKO_XKILKA,
                    Warunek.SPODOBANIE_SIE,

                    Warunek.PLUS_GT_MINUS,
                    Warunek.WOLNA
            )
    );


    List<KategoriaWarunki> WYMAGANIA_WSTEPNE = Arrays.asList(
            WYMAGANIA_WSTEPNE_SWIAT,
            WYMAGANIA_WSTEPNE_INFORMACJA,
            WYMAGANIA_WSTEPNE_WIEDZA,
            WYMAGANIA_WSTEPNE_BRAKWSTYDU,
            WYMAGANIA_WSTEPNE_REZULTAT,
            WYMAGANIA_WSTEPNE_PRACA,
            WYMAGANIA_WSTEPNE_PRACA_RESTRYKCYJNA,
            WYMAGANIA_WSTEPNE_ZARABIANIE,
            WYMAGANIA_WSTEPNE_SPORT,
            WYMAGANIA_WSTEPNE_OSIEDLE,
            WYMAGANIA_WSTEPNE_DOPUSZCZENIE,
            WYMAGANIA_WSTEPNE_KOBIETA
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_SWIAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA,TypKategoria.SWIAT),
            Arrays.asList(
                    Warunek.ZNAJOMI,
                    Warunek.SWOJ_ZWIAZEK,
                    Warunek.UNIKANIE_ZAGROZEN,
                    Warunek.DBANIE_ZDROWIE,
                    Warunek.ZARABIANIE)
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_INFORMACJA = new KategoriaWarunki(
            new Kategoria(
                    TypKategoria.WYMAGANIA_UTRZYMANIA,TypKategoria.INFORMACJA),
            Arrays.asList(
                    Warunek.SLEDZENIE_INFORMACJI,
                    Warunek.REZULTAT_INFORMACJI,
                    Warunek.POTWIERDZENIE_Z_KIMS,
                    Warunek.SPRAWDZENIE_SAMEMU
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_WIEDZA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA,TypKategoria.WIEDZA),
            Arrays.asList(
                    Warunek.ODSWIEZANIE,
                    Warunek.PAMIEC,
                    Warunek.ULEPSZANIE,
                    Warunek.DZIELENIE_SIE_WIEDZA
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_BRAKWSTYDU = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA,TypKategoria.BRAKWSTYDU),
            Arrays.asList(
                    Warunek.LEPSZE_WYKORZYSTANIE_INFORMACJI,
                    Warunek.LEPSZE_DZIALANIE,
                    Warunek.WNIOSKI
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_REZULTAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA,TypKategoria.REZULTAT),
            Arrays.asList(
                    Warunek.LEPSZE_DZIALANIE,
                    Warunek.UNIKNIECIE_KONSEKWENCJI,
                    Warunek.PRZEWIDYWANIE,
                    Warunek.REZULTAT,
                    Warunek.UTRZYMANIE
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_PRACA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA,TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.WYSILEK,
                    Warunek.UZYTECZNOSC,
                    Warunek.OPLACA,
                    Warunek.PLUS_GT_MINUS
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_PRACA_RESTRYKCYJNA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA,TypKategoria.PRACA_RESTRYKCYJNA),
            Arrays.asList(
                    Warunek.PRZESTRZEGANIE_ZASAD,
                    Warunek.ATMOSFERA,
                    Warunek.WYSILEK,
                    Warunek.UZYTECZNOSC,
                    Warunek.REZULTATY,
                    Warunek.OPLACA,
                    Warunek.STOSUNEK1VS1,
                    Warunek.ULEPSZANIE_UMIEJETNOSCI,
                    Warunek.PLUS_GT_MINUS
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_ZARABIANIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA,TypKategoria.ZARABIANIE),
            Arrays.asList(
                    Warunek.BOGATY_SEKTOR,
                    Warunek.WIEDZA,
                    Warunek.NISZA,
                    Warunek.REGION
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_SPORT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA,TypKategoria.SPORT),
            Arrays.asList(
                    Warunek.ULEPSZANIE_UMIEJETNOSCI,
                    Warunek.CZAS,
                    Warunek.SPRAWNOSC,
                    Warunek.ZDOLNOSC_DO_WYSILKU,
                    Warunek.EKWIPUNEK,
                    Warunek.ZGODA_OTOCZENIA
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_OSIEDLE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA,TypKategoria.OSIEDLE),
            Arrays.asList(
                    Warunek.CZESTO_Z_CELEM,
                    Warunek.DZIALANIE,
                    Warunek.ZACIESNIENIE_GRONA_ZNAJOMYCH,
                    Warunek.STO_PRO_LOJALNY,
                    Warunek.PRZESTRZEGANIE_ZASAD
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_DOPUSZCZENIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA,TypKategoria.DOPUSZCZENIE),
            Arrays.asList(
                    Warunek.DOBRZE_ZNA,
                    Warunek.WSPOLNI_ZNAJOMI,
                    Warunek.BEZPIECZENSTWO,
                    Warunek.EMOCJE,
                    Warunek.PODOBA_SIE,
                    Warunek.PLUS_GT_MINUS
            )
    );

    KategoriaWarunki WYMAGANIA_UTRZYMANIA_KOBIETA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA,TypKategoria.KOBIETA),
            Arrays.asList(
                    Warunek.SPELNIENIE_OCZEKIWAN,
                    Warunek.WSPIERANIE_PREFERENCJI,
                    Warunek.ODKRYWANIE_SWIATA,
                    Warunek.SPEDZANIE_CZASU,
                    Warunek.WIERNOSC,
                    Warunek.ZGODA_OTOCZENIA,

                    Warunek.PILNOWANIE,
                    Warunek.KONTROLA
            )
    );

    List<KategoriaWarunki> WYMAGANIA_UTRZYMANIA = Arrays.asList(
            WYMAGANIA_UTRZYMANIA_SWIAT,
            WYMAGANIA_UTRZYMANIA_INFORMACJA,
            WYMAGANIA_UTRZYMANIA_WIEDZA,
            WYMAGANIA_UTRZYMANIA_BRAKWSTYDU,
            WYMAGANIA_UTRZYMANIA_REZULTAT,
            WYMAGANIA_UTRZYMANIA_PRACA,
            WYMAGANIA_UTRZYMANIA_PRACA_RESTRYKCYJNA,
            WYMAGANIA_UTRZYMANIA_ZARABIANIE,
            WYMAGANIA_UTRZYMANIA_SPORT,
            WYMAGANIA_UTRZYMANIA_OSIEDLE,
            WYMAGANIA_UTRZYMANIA_DOPUSZCZENIE,
            WYMAGANIA_UTRZYMANIA_KOBIETA
    );

    KategoriaWarunki WARUNKI_KONCOWE_SWIAT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE,TypKategoria.SWIAT),
            Arrays.asList(
                    Warunek.SZCZESCIE,
                    Warunek.DOSWIADCZENIA,
                    Warunek.WSPOMNIENIA
            )
    );

    KategoriaWarunki WARUNKI_KONCOWE_PRACA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE,TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.PIENIADZE,
                    Warunek.STABILIZACJA,
                    Warunek.POZOSTANIE_W_KRAJU,
                    Warunek.UMIEJETNOSCI,
                    Warunek.WIEDZA
            )
    );

    KategoriaWarunki WARUNKI_KONCOWE_ZARABIANIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE,TypKategoria.ZARABIANIE),
            Arrays.asList(
                    Warunek.MOZLIWOSC_WYBORU
            )
    );

    KategoriaWarunki WARUNKI_KONCOWE_SPORT = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE,TypKategoria.SPORT),
            Arrays.asList(
                    Warunek.SPRAWNOSC,
                    Warunek.UMIEJETNOSCI,
                    Warunek.WIEDZA
            )
    );

    KategoriaWarunki WARUNKI_KONCOWE_OSIEDLE = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE,TypKategoria.OSIEDLE),
            Arrays.asList(
                    Warunek.ZNAJOMI,
                    Warunek.SRODOWISKO,
                    Warunek.KOBIETA,
                    Warunek.SILNE_JEDNOSTKI,
                    Warunek.THREAD_WHILE_LOOP_BLISKOSC_U,
                    Warunek.OSZCZEDNOSC_CZASU,
                    Warunek.AKCEPTACJA,
                    Warunek.LATWY_DOSTEP_PRZEWAGI
            )
    );

    KategoriaWarunki WARUNKI_KONCOWE_KOBIETA = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE,TypKategoria.KOBIETA),
            Arrays.asList(
                    Warunek.CODZIENNA_BLISKOSC,
                    Warunek.ZYCIE_RAZEM,
                    Warunek.DZIECI
            )
    );

    List<KategoriaWarunki> WARUNKI_KONCOWE = Arrays.asList(
            WARUNKI_KONCOWE_SWIAT,
            WARUNKI_KONCOWE_PRACA,
            WARUNKI_KONCOWE_ZARABIANIE,
            WARUNKI_KONCOWE_SPORT,
            WARUNKI_KONCOWE_OSIEDLE,
            WARUNKI_KONCOWE_KOBIETA
    );

    KategoriaWarunki PRZYCZYNY_ZLA = new KategoriaWarunki(
            new Kategoria(TypKategoria.PRZYCZYNY_ZLA),
            Arrays.asList(
                    Warunek.ZLE_GENY,
                    Warunek.GLUPOTA,
                    Warunek.NIESWIADOMOSC,
                    Warunek.DZIALANIE_ZA_NAMOWA
            )
    );

    KategoriaWarunki WARTOSC = new KategoriaWarunki(
            new Kategoria(TypKategoria.WARTOSC),
            Arrays.asList(
                    Warunek.WYGODY,
                    Warunek.ROZRYWKI,
                    Warunek.PIENIADZE,
                    Warunek.SRODOWISKO,
                    Warunek.ZASADY,
                    Warunek.UMIEJETNOSCI
            )
    );

    KategoriaWarunki GLOBAL_PLANSZA_LUDZIE = new KategoriaWarunki(
            new Kategoria(TypKategoria.GLOBAL_PLANSZA,TypKategoria.LUDZIE),
            Arrays.asList(
                    Warunek.DZIETNOSC,
                    Warunek.WYCHOWANIE,
                    Warunek.MIESZKANIE
            )
    );

    KategoriaWarunki GLOBAL_PLANSZA_PRACA = new KategoriaWarunki(
            new Kategoria(TypKategoria.GLOBAL_PLANSZA,TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.FIRMY_NIEWYMAGAJACE_DOSWIADCZENIE,
                    Warunek.FIRMY_WYMAGAJACE_DOSWIADCZENIE,
                    Warunek.RYNEK_PLAC,
                    Warunek.ZASOBY_LUDZKIE
            )
    );

    KategoriaWarunki OCENIA_WEDLUG = new KategoriaWarunki(
            new Kategoria(TypKategoria.OCENIA_WEDLUG),
            Arrays.asList(
                    Warunek.ZLO,
                    Warunek.DOBRO,
                    Warunek.PODOBIENSTWO,
                    Warunek.ZYSK,
                    Warunek.EKIPA,
                    Warunek.PRZEWAGA,
                    Warunek.UMIEJETNOSC
            )
    );

    KategoriaWarunki THREAD_WHILE_LOOP = new KategoriaWarunki(
            new Kategoria(TypKategoria.THREAD_WHILE_LOOP),
            Arrays.asList(
                    Warunek.ZLO,
                    Warunek.DOBRO,
                    Warunek.PODOBIENSTWO,
                    Warunek.ZYSK,
                    Warunek.EKIPA,
                    Warunek.PRZEWAGA,
                    Warunek.UMIEJETNOSC
            )
    );

    KategoriaWarunki PRZEWAGI = new KategoriaWarunki(
            new Kategoria(TypKategoria.PRZEWAGI),
            Arrays.asList(
                    Warunek.ZNAJOMI, Warunek.OSIEDLOWE_SRD, Warunek.KOBIETA,
                    Warunek.SZANSA_ZNAJOMI, Warunek.SZANSA_OSIEDLOWE_SRD, Warunek.SZANSA_KOBIETA,
                    Warunek.INFORMACJA, Warunek.CZAS, Warunek.WIEDZA, Warunek.BRAKWSTYDU,
                    Warunek.LUDZIE_ZA_TOBA, Warunek.WALKA, Warunek.SPRZET,
                    Warunek.UMIEJETNOSC,
                    Warunek.PRACA, Warunek.PIENIADZE,
                    Warunek.WYSOKA_POZYCJA
            )
    );


    public enum HotSpot {
        KOLEJKA, UJSCIE, SCHODY,
        PARKING, SKLEP, PRZYSTANEK, TRAUTO, OSIEDLE_MSC_SRODOWISKOWE
    }

    public enum HotTopic {
        POWIAZANE_Z_WYGLADEM_UBIOREM, WYWOLUJACE_EMOCJE, POWIAZANE_Z_HOBBY, INTERESUJACE, POWIAZANE_Z_OSOBAMI,

        GLEBOKIE, SENTYMENTALNE, HISTORIE,
    }


    public enum  Warunek {
 // *** *** *** *** *** *** *** *** *** WSTEPNE *** *** *** *** *** *** *** ***

 // SWIAT
        ZWIAZEK_2_OSOB, URODZENIE_SIE, ZDROWIE, BYT_MATERIALNY,

 // INFORMACJA
        CZAS, DOSTEP_DO_PLANSZY, LUDZIE, MATERIALNE_ZNALEZIENIE_SIE, SONDA, SZCZEGOLY,

 // WIEDZA
        INFORMACJA, PRZYCZYNA, SKUTEK, WNIOSKI,

 // BRAKWSTYDU
        /* INFORMACJA,*/  WIEDZA, DZIALANIE,

 // REZULTAT
        /* DZIALANIE,*/ KONSEKWENCJE, /*WNIOSKI,*/ REZULTAT,

 // PRACA
        NIEKARALNOSC, WYKSZTALCENIE, DOSWIADCZENIE, UMIEJETNOSCI, ZNAJOMOSCI,

 // PRACA RESTRYKCYJNA
        /*NIEKARALNOSC,*/ STUDIA, KILKA_LAT_DOSWIADCZENIA, WIELE_UMIEJETNOSCI, Z_POLECENIA,

 // ZARABIANIE
        UMOWA_PRACA, WYKONYWANIE_PRACY,

 // SPORT
        /*CZAS,*/ SPRAWNOSC, ZDOLNOSC_DO_WYSILKU, EKWIPUNEK, ZGODA_OTOCZENIA,

 // OSIEDLE
        TO_SAMO_MIASTO, DOBRZE_WYGLADA, ZNAJOMY_W_SRODOWISKU,
        NIE_PRZECIWNY, NIE_KONFI,

 // DOPUSZCZENIE
        PATRZY, REAGUJE, USMIECHA, DOBRO,
        KOJARZY, KTORYS_RAZ, WSPOLNI_ZNAJOMI,
        BEZPIECZENSTWO, NUDA, PODOBA_SIE,
        MUSI_DOPUSCIC,

 // KOBIETA
        STWORZENIE_POINTCUTA,
        ZLAPANIE_POINTCUTA,
        POZNANIE,
        DOPUSZCZENIE,
        PARZONKO_XKILKA, SPODOBANIE_SIE,
        PLUS_GT_MINUS, WOLNA,

 // *** *** *** *** *** *** *** *** *** WSTEPNE *** *** *** *** *** *** *** ***

 // *** *** *** *** *** *** *** *** *** UTRZYMANIA *** *** *** *** *** *** *** ***

 // SWIAT
        ZNAJOMI, SWOJ_ZWIAZEK, UNIKANIE_ZAGROZEN, DBANIE_ZDROWIE, ZARABIANIE,

 // INFORMACJA
        SLEDZENIE_INFORMACJI, REZULTAT_INFORMACJI, POTWIERDZENIE_Z_KIMS, SPRAWDZENIE_SAMEMU,

 // WIEDZA
        ODSWIEZANIE, PAMIEC, ULEPSZANIE, DZIELENIE_SIE_WIEDZA,

 // BRAKWSTYDU
        LEPSZE_WYKORZYSTANIE_INFORMACJI, LEPSZE_DZIALANIE, /*WNIOSKI,*/

 // REZULTAT
        /* LEPSZE_DZIALANIE,*/ UNIKNIECIE_KONSEKWENCJI, PRZEWIDYWANIE, /*REZULTAT,*/ UTRZYMANIE,


 // PRACA
        /*WYSILEK, UZYTECZNOSC, OPLACA, PLUS_GT_MINUS,*/

 // ZARABIANIE
        BOGATY_SEKTOR, /*WIEDZA,*/ NISZA, REGION,

 // PRACA RESTRYKCYJNA
        PRZESTRZEGANIE_ZASAD, ATMOSFERA, WYSILEK, UZYTECZNOSC, REZULTATY, OPLACA, STOSUNEK1VS1, ULEPSZANIE_UMIEJETNOSCI, /*PLUS_GT_MINUS,*/

 // SPORT
        /*CZAS, SPRAWNOSC, ZDOLNOSC_DO_WYSILKU, EKWIPUNEK, ZGODA_OTOCZENIA,*/

 // OSIEDLE
        CZESTO_Z_CELEM, /*DZIALANIE,*/ ZACIESNIENIE_GRONA_ZNAJOMYCH,
        STO_PRO_LOJALNY, /*PRZESTRZEGANIE_ZASAD,*/

 // DOPUSZCZENIE
        DOBRZE_ZNA, /*WSPOLNI_ZNAJOMI,*/
        /*BEZPIECZENSTWO,*/ EMOCJE, /*PODOBA_SIE,*/
        /*PLUS_GT_MINUS,*/

 // KOBIETA
        /*PLUS_GT_MINUS, ZGODA_OTOCZENIA,*/
        SPELNIENIE_OCZEKIWAN,
        WSPIERANIE_PREFERENCJI,
        ODKRYWANIE_SWIATA,
        SPEDZANIE_CZASU,
        WIERNOSC,

        PILNOWANIE, KONTROLA,

 // *** *** *** *** *** *** *** *** *** UTRZYMANIA *** *** *** *** *** *** *** ***

 // KONCOWE
        SZCZESCIE, DOSWIADCZENIA, WSPOMNIENIA,
        /*ZNAJOMI,*/
        KOBIETA, DZIECI,
        /*PIENIADZE,*/ STABILIZACJA, POZOSTANIE_W_KRAJU, /*ULEPSZANIE_UMIEJETNOSCI,*/
        MOZLIWOSC_WYBORU,
        /*SPRAWNOSC,*/ SILA,
        SILNE_JEDNOSTKI, OSZCZEDNOSC_CZASU, AKCEPTACJA, LATWY_DOSTEP_PRZEWAGI,
        CODZIENNA_BLISKOSC, ZYCIE_RAZEM,

 // PRZYCZYNY ZLA
        ZLE_GENY, GLUPOTA, NARKOTYKI, NIESWIADOMOSC, DZIALANIE_ZA_NAMOWA,

 // WARTOSC
        WYGODY, ROZRYWKI, PIENIADZE, SRODOWISKO, ZASADY, /*UMIEJETNOSCI,*/

 // GLOBAL PLANSZA
        /*LUDZIE,*/
        DZIETNOSC, WYCHOWANIE, MIESZKANIE,

        PRACA,
        FIRMY_NIEWYMAGAJACE_DOSWIADCZENIE, FIRMY_WYMAGAJACE_DOSWIADCZENIE, RYNEK_PLAC, ZASOBY_LUDZKIE,

        MIEJSCA,

 // OCENIA WG
        ZLO, /*DOBRO,*/ ZYSK, EKIPA, PRZEWAGA, UMIEJETNOSC, PODOBIENSTWO,

 // THREAD WHILE LOOPS
        THREAD_WHILE_LOOP_BLISKOSC_K, THREAD_WHILE_LOOP_ZASIEG_WZROKU,
        THREAD_WHILE_LOOP_EFEKTYWNA_GADKA,

        THREAD_WHILE_LOOP_BLISKOSC_U,

 // PRZEWAGI
        /*ZNAJOMI,*/ OSIEDLOWE_SRD, /*KOBIETA,*/
        SZANSA_ZNAJOMI, SZANSA_OSIEDLOWE_SRD, SZANSA_KOBIETA,
        /*INFORMACJA, CZAS, WIEDZA,*/ BRAKWSTYDU,
        LUDZIE_ZA_TOBA, WALKA, SPRZET,
        /*UMIEJETNOSC,*/
        /*PRACA, PIENIADZE,*/
        WYSOKA_POZYCJA,

// ZAGROZENIA

// ZASADY

// POTRZEBA
        KONTAKTU, AKCEPTACJI, ZWIAZKU, ZROZUMIENIA, HIGIENY, UBRANIA, RELIGII, /*ROZRYWKI,*/ RUCHU,
// PRZYMUS
        JEDZENIE, PICIE, /*PRACA,*/ EDUKACJA, PRZEMIESZCZANIE_SIE, TRANSPORT, KUPNO_PRODUKTOW,
// NIESPRAWIEDLIWOSC
        PRACA_XCZASU_BRAKREZULATU, NADUZYWANIE_WYSOKIEJ_POZYCJI, GORZEJ_NA_STARCIE, PRZEWAGA_NA_STARCIE,
        STRONNICZOSC, WYKLUCZENIE

// KONSEKWENCJA



    }
}
