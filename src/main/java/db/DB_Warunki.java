package db;

import typy_bazowe.TypKategoria;
import warunek.Warunek;
import warunek.WarunkiKategoria;
import z_inne.Kategoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 28.12.19.
 */
public class DB_Warunki {
    public void init(){
        List<WarunkiKategoria> ALL = new ArrayList<>();
        ALL.addAll(WYMAGANIA_WSTEPNE);
        ALL.addAll(WYMAGANIA_UTRZYMANIA);
        ALL.addAll(WARUNKI_KONCOWE);

        ALL.addAll(GLOBAL_PLANSZA);
        ALL.addAll(TWL_PRZEWAGI_SLABOSCI_CIERPIENIA_POTRZEBY);
        ALL.addAll(ZASADY_PRZYMUS_ZAGROZENIA);
        ALL.addAll(WARTOSCI_OCENA_WROG);
        ALL.addAll(ZLY_DOBRY);

        ALL.addAll(REAKCJE);
        ALL.addAll(SONDA);

        ALL.addAll(CZAS);
        ALL.addAll(ROZRYWKI_ZART);
        ALL.addAll(EMOCJE_UCZUCIA);
        ALL.addAll(ZDOBYWANIE_WIEDZY_PIENIEDZY);


        List<WarunkiKategoria> WYMAGANIA_WSTEPNE = Arrays.asList(
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

        List<WarunkiKategoria> WYMAGANIA_UTRZYMANIA = Arrays.asList(
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

        List<WarunkiKategoria> WARUNKI_KONCOWE = Arrays.asList(
                WARUNKI_KONCOWE_SWIAT,
                WARUNKI_KONCOWE_PRACA,
                WARUNKI_KONCOWE_ZARABIANIE,
                WARUNKI_KONCOWE_SPORT,
                WARUNKI_KONCOWE_OSIEDLE,
                WARUNKI_KONCOWE_KOBIETA
        );

        List<WarunkiKategoria> ZLY_DOBRY = Arrays.asList(
                PRZYCZYNY_ZLA,
                PRZYCZYNY_DOBRA,
                NIESPRAWIEDLIWOSC,
                DOBRY,
                ZLY
        );

        List<WarunkiKategoria> GLOBAL_PLANSZA = Arrays.asList(
                GLOBAL_PLANSZA_LUDZIE,
                GLOBAL_PLANSZA_PRACA
        );

        List<WarunkiKategoria> WARTOSCI_OCENA_WROG = Arrays.asList(
                WARTOSC_ZLA,
                WARTOSC_DOBRA,
                OCENIA_WEDLUG,
                KRYTERIA_WROGA
        );

        List<WarunkiKategoria> ZASADY_PRZYMUS_ZAGROZENIA = Arrays.asList(
                ZASADY,
                PRZYMUS,
                ZAGROZENIA,
                KURESTWO
        );

        List<WarunkiKategoria> TWL_PRZEWAGI_POTRZEBY = Arrays.asList(
                THREAD_WHILE_LOOP,
                PRZEWAGI,
                POTRZEBY
        );

        List<WarunkiKategoria> REAKCJE = Arrays.asList(
                WYMUSZENIE_REAKCJI,
                REAKCJA
        );

        List<WarunkiKategoria> SONDA = Arrays.asList(
                SONDA_GDY,
                SONDA_PO
        );

        List<WarunkiKategoria> CZAS = Arrays.asList(
                PLAN,
                ERA
        );

        List<WarunkiKategoria> ROZRYWKI_ZART = Arrays.asList(
                ROZRYWKI,
                ZART
        );

        List<WarunkiKategoria> EMOCJE_UCZUCIA = Arrays.asList(
                EMOCJE_NEGATYWNE,
                EMOCJE_POZYTYWNE,
                UCZUCIA_NEGATYWNE,
                UCZUCIA_POZYTYWNE
        );

        List<WarunkiKategoria> ZDOBYWANIE_WIEDZY_PIENIEDZY = Arrays.asList(
                ZDOBYWANIE_WIEDZY,
                ZAROBEK_NIELEGALNY
        );



    }


    public static WarunkiKategoria WYMAGANIA_WSTEPNE_SWIAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.SWIAT),
            Arrays.asList(
                    Warunek.ZWIAZEK_2_OSOB,
                    Warunek.URODZENIE_SIE,
                    Warunek.ZDROWIE,
                    Warunek.BYT_MATERIALNY)
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_INFORMACJA = new WarunkiKategoria(
            new Kategoria(
                    TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.INFORMACJA),
            Arrays.asList(
                    Warunek.CZAS,
                    Warunek.DOSTEP_DO_PLANSZY,
                    Warunek.LUDZIE,
                    Warunek.MATERIALNE_ZNALEZIENIE_SIE,
                    Warunek.SONDA,
                    Warunek.SZCZEGOLY
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_WIEDZA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.WIEDZA),
            Arrays.asList(
                    Warunek.INFORMACJA,
                    Warunek.PRZYCZYNA,
                    Warunek.SKUTEK,
                    Warunek.WNIOSKI
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_BRAKWSTYDU = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.BRAKWSTYDU),
            Arrays.asList(
                    Warunek.INFORMACJA,
                    Warunek.WIEDZA,
                    Warunek.DZIALANIE
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_REZULTAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.REZULTAT),
            Arrays.asList(
                    Warunek.DZIALANIE,
                    Warunek.KONSEKWENCJE,
                    Warunek.WNIOSKI,
                    Warunek.REZULTAT
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.NIEKARALNOSC,
                    Warunek.WYKSZTALCENIE,
                    Warunek.DOSWIADCZENIE,
                    Warunek.UMIEJETNOSCI,
                    Warunek.ZNAJOMOSCI
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_PRACA_RESTRYKCYJNA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.PRACA_RESTRYKCYJNA),
            Arrays.asList(
                    Warunek.NIEKARALNOSC,
                    Warunek.STUDIA,
                    Warunek.KILKA_LAT_DOSWIADCZENIA,
                    Warunek.WIELE_UMIEJETNOSCI,
                    Warunek.Z_POLECENIA
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.ZARABIANIE),
            Arrays.asList(
                    Warunek.UMOWA_PRACA,
                    Warunek.WYKONYWANIE_PRACY
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.SPORT),
            Arrays.asList(
                    Warunek.CZAS,
                    Warunek.SPRAWNOSC,
                    Warunek.ZDOLNOSC_DO_WYSILKU,
                    Warunek.EKWIPUNEK,
                    Warunek.ZGODA_OTOCZENIA
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.OSIEDLE),
            Arrays.asList(
                    Warunek.TO_SAMO_MIASTO,
                    Warunek.DOBRZE_WYGLADA,
                    Warunek.ZNAJOMY_W_SRODOWISKU,
                    Warunek.NIE_PRZECIWNY,
                    Warunek.NIE_KONFI
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_DOPUSZCZENIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.DOPUSZCZENIE),
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

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_KOBIETA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.KOBIETA),
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


    public static List<WarunkiKategoria> WYMAGANIA_WSTEPNE = Arrays.asList(
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

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_SWIAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.SWIAT),
            Arrays.asList(
                    Warunek.ZNAJOMI,
                    Warunek.SWOJ_ZWIAZEK,
                    Warunek.UNIKANIE_ZAGROZEN,
                    Warunek.DBANIE_ZDROWIE,
                    Warunek.ZARABIANIE)
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_INFORMACJA = new WarunkiKategoria(
            new Kategoria(
                    TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.INFORMACJA),
            Arrays.asList(
                    Warunek.SLEDZENIE_INFORMACJI,
                    Warunek.REZULTAT_INFORMACJI,
                    Warunek.POTWIERDZENIE_Z_KIMS,
                    Warunek.SPRAWDZENIE_SAMEMU
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_WIEDZA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.WIEDZA),
            Arrays.asList(
                    Warunek.ODSWIEZANIE,
                    Warunek.PAMIEC,
                    Warunek.ULEPSZANIE,
                    Warunek.DZIELENIE_SIE_WIEDZA
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_BRAKWSTYDU = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.BRAKWSTYDU),
            Arrays.asList(
                    Warunek.LEPSZE_WYKORZYSTANIE_INFORMACJI,
                    Warunek.LEPSZE_DZIALANIE,
                    Warunek.WNIOSKI
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_REZULTAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.REZULTAT),
            Arrays.asList(
                    Warunek.LEPSZE_DZIALANIE,
                    Warunek.UNIKNIECIE_KONSEKWENCJI,
                    Warunek.PRZEWIDYWANIE,
                    Warunek.REZULTAT,
                    Warunek.UTRZYMANIE
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.WYSILEK,
                    Warunek.UZYTECZNOSC,
                    Warunek.OPLACA,
                    Warunek.PLUS_GT_MINUS
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_PRACA_RESTRYKCYJNA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.PRACA_RESTRYKCYJNA),
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

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.ZARABIANIE),
            Arrays.asList(
                    Warunek.BOGATY_SEKTOR,
                    Warunek.WIEDZA,
                    Warunek.NISZA,
                    Warunek.REGION
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.SPORT),
            Arrays.asList(
                    Warunek.ULEPSZANIE_UMIEJETNOSCI,
                    Warunek.CZAS,
                    Warunek.SPRAWNOSC,
                    Warunek.ZDOLNOSC_DO_WYSILKU,
                    Warunek.EKWIPUNEK,
                    Warunek.ZGODA_OTOCZENIA
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.OSIEDLE),
            Arrays.asList(
                    Warunek.CZESTO_Z_CELEM,
                    Warunek.DZIALANIE,
                    Warunek.ZACIESNIENIE_GRONA_ZNAJOMYCH,
                    Warunek.STO_PRO_LOJALNY,
                    Warunek.PRZESTRZEGANIE_ZASAD
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_DOPUSZCZENIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.DOPUSZCZENIE),
            Arrays.asList(
                    Warunek.DOBRZE_ZNA,
                    Warunek.WSPOLNI_ZNAJOMI,
                    Warunek.BEZPIECZENSTWO,
                    Warunek.EMOCJE,
                    Warunek.PODOBA_SIE,
                    Warunek.PLUS_GT_MINUS
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_KOBIETA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.KOBIETA),
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

    public static List<WarunkiKategoria> WYMAGANIA_UTRZYMANIA = Arrays.asList(
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

    public static WarunkiKategoria WARUNKI_KONCOWE_SWIAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.SWIAT),
            Arrays.asList(
                    Warunek.SZCZESCIE,
                    Warunek.DOSWIADCZENIA,
                    Warunek.WSPOMNIENIA
            )
    );

    public static WarunkiKategoria WARUNKI_KONCOWE_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.PIENIADZE,
                    Warunek.STABILIZACJA,
                    Warunek.BEZPIECZENSTWO,
                    Warunek.POZOSTANIE_W_KRAJU,
                    Warunek.UMIEJETNOSCI,
                    Warunek.WIEDZA
            )
    );

    public static WarunkiKategoria WARUNKI_KONCOWE_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.ZARABIANIE),
            Arrays.asList(
                    Warunek.MOZLIWOSC_WYBORU
            )
    );

    public static WarunkiKategoria WARUNKI_KONCOWE_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.SPORT),
            Arrays.asList(
                    Warunek.SPRAWNOSC,
                    Warunek.UMIEJETNOSCI,
                    Warunek.WIEDZA
            )
    );

    public static WarunkiKategoria WARUNKI_KONCOWE_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.OSIEDLE),
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

    public static WarunkiKategoria WARUNKI_KONCOWE_KOBIETA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.KOBIETA),
            Arrays.asList(
                    Warunek.CODZIENNA_BLISKOSC,
                    Warunek.ZYCIE_RAZEM,
                    Warunek.DZIECI
            )
    );

    public static List<WarunkiKategoria> WARUNKI_KONCOWE = Arrays.asList(
            WARUNKI_KONCOWE_SWIAT,
            WARUNKI_KONCOWE_PRACA,
            WARUNKI_KONCOWE_ZARABIANIE,
            WARUNKI_KONCOWE_SPORT,
            WARUNKI_KONCOWE_OSIEDLE,
            WARUNKI_KONCOWE_KOBIETA
    );

    public static WarunkiKategoria PRZYCZYNY_ZLA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PRZYCZYNY_ZLA),
            Arrays.asList(
                    Warunek.ZLE_GENY,
                    Warunek.GLUPOTA,
                    Warunek.NIESWIADOMOSC,
                    Warunek.DZIALANIE_ZA_NAMOWA
            )
    );

    public static WarunkiKategoria PRZYCZYNY_DOBRA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PRZYCZYNY_DOBRA),
            Arrays.asList(
                    Warunek.MADROSC,
                    Warunek.WYCHOWANIE,
                    Warunek.WYKONYWANIE_PRACY
            )
    );

    public static  WarunkiKategoria WARTOSC_DOBRA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARTOSC),
            Arrays.asList(
                    Warunek.SRODOWISKO,
                    Warunek.ZASADY,
                    Warunek.UMIEJETNOSCI,
                    Warunek.SPORT,
                    Warunek.WSPIERANIE_SWOJEJ_KLASY,
                    Warunek.DZIECI,
                    Warunek.CHLOP,
                    Warunek.RODZINA
            )
    );

    public static  WarunkiKategoria WARTOSC_ZLA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARTOSC),
            Arrays.asList(
                    Warunek.WYGODY,
                    Warunek.ROZRYWKI,
                    Warunek.PIENIADZE,
                    Warunek.IDEA,
                    Warunek.NAUKA,
                    Warunek.MODA,
                    Warunek.BECZKA,
                    Warunek.KOLEZANKI,
                    Warunek.WRAZLIWOSC
            )
    );

    public static WarunkiKategoria GLOBAL_PLANSZA_LUDZIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.GLOBAL_PLANSZA, TypKategoria.LUDZIE),
            Arrays.asList(
                    Warunek.DZIETNOSC,
                    Warunek.WYCHOWANIE,
                    Warunek.MIESZKANIE
            )
    );

    public static WarunkiKategoria GLOBAL_PLANSZA_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.GLOBAL_PLANSZA, TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.FIRMY_NIEWYMAGAJACE_DOSWIADCZENIE,
                    Warunek.FIRMY_WYMAGAJACE_DOSWIADCZENIE,
                    Warunek.RYNEK_PLAC,
                    Warunek.ZASOBY_LUDZKIE
            )
    );

    public static WarunkiKategoria OCENIA_WEDLUG = new WarunkiKategoria(
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

    public static WarunkiKategoria THREAD_WHILE_LOOP = new WarunkiKategoria(
            new Kategoria(TypKategoria.THREAD_WHILE_LOOP),
            Arrays.asList(
                    Warunek.THREAD_WHILE_LOOP_ZASIEG_WZROKU,
                    Warunek.THREAD_WHILE_LOOP_BLISKOSC_U,
                    Warunek.THREAD_WHILE_LOOP_BLISKOSC_K,
                    Warunek.THREAD_WHILE_LOOP_EFEKTYWNA_GADKA
            )
    );

    public static WarunkiKategoria PRZEWAGI = new WarunkiKategoria(
            new Kategoria(TypKategoria.PRZEWAGI),
            Arrays.asList(
                    Warunek.ZNAJOMI, Warunek.OSIEDLOWE_SRD, Warunek.KOBIETA,
                    Warunek.SZANSA_ZNAJOMI, Warunek.SZANSA_OSIEDLOWE_SRD, Warunek.SZANSA_KOBIETA,
                    Warunek.INFORMACJA, Warunek.CZAS, Warunek.WIEDZA, Warunek.BRAK_WSTYDU,
                    Warunek.LUDZIE_ZA_TOBA, Warunek.WALKA_PIESCI, Warunek.WALKA_SPRZET,
                    Warunek.UMIEJETNOSC,
                    Warunek.PRACA, Warunek.PIENIADZE,
                    Warunek.WYSOKA_POZYCJA,
                    Warunek.SPRYT, Warunek.SZYBKOSC, Warunek.SILNY, Warunek.POTRAFI_OCENIC,
                    Warunek.PRZEZYCIE_CIERPIENIA
            )
    );

    public static WarunkiKategoria SLABOSCI = new WarunkiKategoria(
            new Kategoria(TypKategoria.SLABOSCI),
            Arrays.asList(
                    Warunek.BRAK_ZNAJOMYCH, Warunek.BRAK_SRODOWISKA, Warunek.BRAK_KOBIETY,
                    Warunek.BRAK_SZANS_ZNAJOMI, Warunek.BRAK_SZANS_SRODOWISKO, Warunek.BRAK_SZANS_KOBIETA,
                    Warunek.BRAK_INFORMACJI, Warunek.BRAK_CZASU, Warunek.BRAK_WIEDZY, Warunek.WSTYD,
                    Warunek.BRAK_LUDZI_ZA_TOBA, Warunek.NIEZDOLNY_WALKA_PIESCI, Warunek.NIEZDOLNY_WALKA_SPRZET,
                    Warunek.BRAK_UMIEJETNOSCI,
                    Warunek.BRAK_PRACY, Warunek.BRAK_PIENIEDZY,
                    Warunek.SLABA_POZYCJA,
                    Warunek.TEMPOTA, Warunek.POWOLNY, Warunek.SLABY, Warunek.NIEUMIE_OCENIC,
                    Warunek.PRZEZYCIE_WYGOD, Warunek.PRZEZYCIE_DOBRA
            )
    );

    public static WarunkiKategoria CIERPIENIA = new WarunkiKategoria(
            new Kategoria(TypKategoria.CIERPIENIE),
            Arrays.asList(
                    Warunek.ZMECZENIE, Warunek.CIERPIENIE_FIZYCZNE, Warunek.CIERPIENIE_PSYCHICZNE,
                    Warunek.CIERPIENIE_PRZEMIJANIA, Warunek.CIERPIENIE_UTRATY, Warunek.CIERPIENIE_SAMOTNOSCI,
                    Warunek.CIERPIENIE_WIDZENIE_BRAK_DOTKNIECIA,

                    Warunek.ZMECZENIE_DLUGOTRWALE, Warunek.CIERPIENIE_FIZYCZNE_DLUGOTRWALE, Warunek.CIERPIENIE_PSYCHICZNE_DLUGOTRWALE,
                    Warunek.CIERPIENIE_PRZEMIJANIA_DLUGOTRWALE, Warunek.CIERPIENIE_UTRATY_DLUGOTRWALE,
                    Warunek.CIERPIENIE_UTRATY_DLUGOTRWALE, Warunek.CIERPIENIE_SAMOTNOSCI_DLUGOTRWALE,
                    Warunek.CIERPIENIE_WIDZENIE_BRAK_DOTKNIECIA_DLUGOTRWALE
                    )
    );

    public static WarunkiKategoria ZAGROZENIA = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZAGROZENIA),
            Arrays.asList(
                    Warunek.STRATA_WOLNOSCI, Warunek.STRATA_CZASU, Warunek.STRATA_INFORMACJI, Warunek.STRATA_WIEDZY,
                    Warunek.STRATA_DOSTEPU_PLANSZA, Warunek.STRATA_DOSTEPU_ZNAJOMI, Warunek.STRATA_MIEJSCA_W_HIERARCHII, Warunek.STRATA_POZYCJI,
                    Warunek.STRATA_ZDROWIA, Warunek.STRATA_HONORU,
                    Warunek.STRATA_PRACY, Warunek.STRATA_PIENIEDZY, Warunek.STRATA_ZARABIANIA, Warunek.STRATA_WYKSZTALCENIA,
                    Warunek.STRATA_KOBIETY, Warunek.ROZWOD, Warunek.ALIMENTY
            )
    );

    public static WarunkiKategoria ZASADY = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZASADY),
            Arrays.asList(
                    Warunek.PRAWO, Warunek.NIE_KONFI, Warunek.NIE_PRZECIWNA,
                    Warunek.NIEZNAJOMY_JEBAC,
                    Warunek.NIEGADAJ_Z_OBCYMI, Warunek.NIEGADAJ_Z_NIESLAZAKAMI, Warunek.NIEGADAJ_Z_POZAOSIEDLA,
                    Warunek.KTO_NIEBIEGA_TUBA,
                    Warunek.JEDNOSC_PRZECIW_ZAZDROSCI,
                    Warunek.R1_HOLD_YOUR_POSITION, Warunek.R2_ONLY_ONE_CHANCE_TO_SCORE,
                    Warunek.R3_LIFE_IN_YOUR_HANDS_NOT_LORDS, Warunek.R4_WATCH_YOUR_ACTIONS
            )
    );

    public static WarunkiKategoria POTRZEBY = new WarunkiKategoria(
            new Kategoria(TypKategoria.POTRZEBA),
            Arrays.asList(
                    Warunek.KONTAKTU, Warunek.AKCEPTACJI, Warunek.DOBRYCH_JEDNOSTKEK, Warunek.ZWIAZKU, Warunek.ZROZUMIENIA,
                    Warunek.HIGIENY, Warunek.UBRANIA, Warunek.RELIGII, Warunek.ROZRYWKI, Warunek.RUCHU
            )
    );

    public static WarunkiKategoria PRZYMUS = new WarunkiKategoria(
            new Kategoria(TypKategoria.PRZYMUS),
            Arrays.asList(
                    Warunek.JEDZENIE, Warunek.PICIE, Warunek.PRACA, Warunek.EDUKACJA, Warunek.PRZEMIESZCZANIE_SIE,
                    Warunek.TRANSPORT, Warunek.KUPNO_PRODUKTOW
            )
    );

    public static WarunkiKategoria NIESPRAWIEDLIWOSC = new WarunkiKategoria(
            new Kategoria(TypKategoria.NIESPRAWIEDLIWOSC),
            Arrays.asList(
                    Warunek.PRACA_XCZASU_BRAK_REZULATU, Warunek.WDUPCANIE_WYSILKU_DO_PIECA,
                    Warunek.NADUZYWANIE_WYSOKIEJ_POZYCJI, Warunek.GORZEJ_NA_STARCIE, Warunek.PRZEWAGA_NA_STARCIE,
                    Warunek.STRONNICZOSC, Warunek.WYKLUCZENIE
            )
    );

    public static WarunkiKategoria DOBRY = new WarunkiKategoria(
            new Kategoria(TypKategoria.DOBRY),
            Arrays.asList(
                    Warunek.ROBIENIE_PROGRESU, Warunek.ZDOBYWANIE_UMIEJETNOSCI, Warunek.ZDOBYWANIE_WIEDZY, Warunek.ZDOBYWANIE_SILY,
                    Warunek.USWIADAMIANIE, Warunek.WYCIAGANIE_ZE_ZLEJ_SYTUACJI, Warunek.ZMNIEJSZANIE_ZLA, Warunek.ROBIENIE_OPCJI,
                    Warunek.PRZEKONYWANIE_ZA, Warunek.POLECENIE,
                    Warunek.PRAWDA, Warunek.CIERPLIWOSC,
                    Warunek.TRZEZWOSC,
                    Warunek.MADROSC,
                    Warunek.NOWY_DEFAULT_DOBRA_OSOBA,
                    Warunek.NIEPOZWALA_NA_ZLO
            )
    );

    public static WarunkiKategoria ZLY = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZLY),
            Arrays.asList(
                    Warunek.MARNOWANIE_CZASU, Warunek.POZBAWIANIE_UMIEJETNOSCI, Warunek.POZBAWIANIE_WIEDZY, Warunek.POZBAWIANIE_SILY,
                    Warunek.OGLUPIANIE, Warunek.WDUPCANIE_W_ZLE_WARUNKI, Warunek.ZAMYKANIE_OPCJI, Warunek.PRZEKONYWANIE_PRZECIW,
                    Warunek.PRZEKONYWANIE_ZA, Warunek.POLECENIE,
                    Warunek.KLAMSTWO, Warunek.AGRESJA_FIZYCZNA, Warunek.AGRESJA_PSYCHICZNA,
                    Warunek.ODUZENIE,
                    Warunek.GLUPOTA,
                    Warunek.NOWY_DEFAULT_RYWAL,
                    Warunek.JEBIE_DOBRO, Warunek.WYMAGA_PRZEWAG_NA_ZLU
            )
    );

    public static WarunkiKategoria WYMUSZENIE_REAKCJI = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMUSZENIE_REAKCJI),
            Arrays.asList(
                    Warunek.KONTEKST, Warunek.OSKARZENIE, Warunek.ULTIMATUM, Warunek.CISNIECIE
            )
    );

    public static WarunkiKategoria REAKCJA = new WarunkiKategoria(
            new Kategoria(TypKategoria.REAKCJA),
            Arrays.asList(
                    Warunek.BRAK_ODPOWIEDZI, Warunek.PRZESTRASZENIE_SIE, Warunek.UCIECIE,
                    Warunek.ODPOWIEDZ_ODCZEP, Warunek.ODPOWIEDZ_NEUTRAL, Warunek.ODPOWIEDZ_ZAINTERESOWANIE,
                    Warunek.EKSCYTACJA, Warunek.PRZEJCIE_INICJATYWY
            )
    );

    public static WarunkiKategoria SONDA_GDY = new WarunkiKategoria(
            new Kategoria(TypKategoria.SONDA, TypKategoria.SONDA_GDY),
            Arrays.asList(
                    Warunek.WIDZISZ, Warunek.MOWI, Warunek.ROBI, Warunek.POSIADA
            )
    );

    public static WarunkiKategoria SONDA_PO = new WarunkiKategoria(
            new Kategoria(TypKategoria.SONDA, TypKategoria.SONDA_PO),
            Arrays.asList(
                    Warunek.OCZY, Warunek.REAGOWANIE, Warunek.CHODZENIE, Warunek.POSTURA, Warunek.ZACHOWANIE,
                    Warunek.MOWA, Warunek.ZNAJOMI
            )
    );

    public static WarunkiKategoria KRYTERIA_WROGA = new WarunkiKategoria(
            new Kategoria(TypKategoria.KRYTERIA_WROGA),
            Arrays.asList(
                    Warunek.PRZECIWNA_RASA, Warunek.PRZECIWNY_NAROD, Warunek.PRZECIWNA_KLASA, Warunek.PRZECIWNY_KLUB,
                    Warunek.PRZECIWNA_STRONA, Warunek.ZASZKODZIL
            )
    );

    public static WarunkiKategoria PLAN = new WarunkiKategoria(
            new Kategoria(TypKategoria.PLAN),
            Arrays.asList(
                    Warunek.CYKL_DNIA, Warunek.DZIEN, Warunek.TYDZIEN, Warunek.MIESIAC, Warunek.TRZY_MIESIACE, Warunek.POL_ROKU,
                    Warunek.ROK
            )
    );

    public static WarunkiKategoria ZART = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZART),
            Arrays.asList(
                    Warunek.UKAZANIE_OSOBY_W_KOMICZNEJ_SYTUACJI, Warunek.WYOLBRZYMIENIE, Warunek.ZAMIANA,
                    Warunek.RZECZYWISTOSC_ODBIEGAJACA_OD_NORMY
            )
    );

    public static WarunkiKategoria ERA = new WarunkiKategoria(
            new Kategoria(TypKategoria.ERA),
            Arrays.asList(
                    Warunek.PONIZEJ_1900, Warunek.OD_1900_DO_1939, Warunek.OD_1939_DO_1945, Warunek.OD_1945_DO_1953,
                    Warunek.OD_1953_DO_1970, Warunek.OD_1970_DO_1990, Warunek.OD_1990_DO_2000, Warunek.OD_2000_DO_2005,
                    Warunek.OD_2005_DO_2011, Warunek.OD_2011_DO_2016, Warunek.OD_2016_DO_TERAZ
            )
    );

    public static WarunkiKategoria ROZRYWKI = new WarunkiKategoria(
            new Kategoria(TypKategoria.ROZRYWKI),
            Arrays.asList(
                    Warunek.MUZYKA, Warunek.TANIEC, Warunek.TELEWIZJA, Warunek.PRZYJEMNA_ROZMOWA, Warunek.GRY,
                    Warunek.ODUZENIE
            )
    );

    public static WarunkiKategoria EMOCJE_NEGATYWNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.EMOCJE, TypKategoria.EMOCJE_NEGATYWNE),
            Arrays.asList(
                    Warunek.STRACH, Warunek.LEK, Warunek.ADRENALINA, Warunek.NIEPOKOJ, Warunek.TESKNOTA, Warunek.SAMOTNOSC,
                    Warunek.GNIEW, Warunek.ZLOSC, Warunek.ROZPACZ, Warunek.SMUTEK, Warunek.ZAZDROSC,
                    Warunek.AGRESJA_FIZYCZNA, Warunek.AGRESJA_PSYCHICZNA
            )
    );

    public static WarunkiKategoria EMOCJE_POZYTYWNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.EMOCJE, TypKategoria.EMOCJE_POZYTYWNE),
            Arrays.asList(
                    Warunek.SZCZESCIE, Warunek.RADOSC, Warunek.KONTEMPLACJA, Warunek.SPELNIENIE,
                    Warunek.SPOKOJ, Warunek.CIEKAWOSC, Warunek.ZASKOCZENIE, Warunek.PODNIECENIE
            )
    );

    public static WarunkiKategoria UCZUCIA_NEGATYWNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.UCZUCIA, TypKategoria.UCZUCIA_NEGATYWNE),
            Arrays.asList(
                    Warunek.ZREZYGNOWANIE, Warunek.POCZUCIE_UTRATY, Warunek.PRZYKROSC, Warunek.POCZUCIE_WYKLUCZENIA,
                    Warunek.ZAGROZENIE
            )
    );

    public static WarunkiKategoria UCZUCIA_POZYTYWNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.UCZUCIA, TypKategoria.UCZUCIA_POZYTYWNE),
            Arrays.asList(
                    Warunek.MILOSC, Warunek.PRZYJAZN, Warunek.BRATERSTWO, Warunek.KOLEZENSTWO, Warunek.POCZUCIE_SZCZESCIA,
                    Warunek.POCZUCIE_ZYSKU, Warunek.POCZUCIE_SUKCESU, Warunek.ZAPAL, Warunek.PRZYJEMNOSC
            )
    );

    public static WarunkiKategoria ZDOBYWANIE_WIEDZY = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZDOBYWANIE_WIEDZY),
            Arrays.asList(
                    Warunek.OCZY, Warunek.PRZYCZYNA, Warunek.REZULTAT, Warunek.WNIOSKI,
                    Warunek.SLOWO_PISANE, Warunek.DOWODY_TEORII_NA_PLANSZACH, Warunek.SLYSZANE_SLOWA
            )
    );

    public static WarunkiKategoria ZAROBEK_NIELEGALNY = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZAROBEK_NIELEGALNY),
            Arrays.asList(
                    Warunek.DILLERKA, Warunek.ZLODZIEJKA, Warunek.PRZEMYT, Warunek.JAZDA_ZE_SPRZETEM
            )
    );

    public static WarunkiKategoria KURESTWO = new WarunkiKategoria(
            new Kategoria(TypKategoria.KURESTWO),
            Arrays.asList(
                    Warunek.POLICJA, Warunek.PUSZCZALSKOSC, Warunek.ZDOLNOSC_KONFIDENTCTWO
            )
    );


    public static List<WarunkiKategoria> ZLY_DOBRY = Arrays.asList(
            PRZYCZYNY_ZLA,
            PRZYCZYNY_DOBRA,
            NIESPRAWIEDLIWOSC,
            DOBRY,
            ZLY
    );

    public static List<WarunkiKategoria> GLOBAL_PLANSZA = Arrays.asList(
            GLOBAL_PLANSZA_LUDZIE,
            GLOBAL_PLANSZA_PRACA
    );

    public static List<WarunkiKategoria> WARTOSCI_OCENA_WROG = Arrays.asList(
            WARTOSC_ZLA,
            WARTOSC_DOBRA,
            OCENIA_WEDLUG,
            KRYTERIA_WROGA
    );

    public static List<WarunkiKategoria> ZASADY_PRZYMUS_ZAGROZENIA = Arrays.asList(
            ZASADY,
            PRZYMUS,
            ZAGROZENIA,
            KURESTWO
    );

    public static List<WarunkiKategoria> TWL_PRZEWAGI_SLABOSCI_CIERPIENIA_POTRZEBY = Arrays.asList(
            THREAD_WHILE_LOOP,
            PRZEWAGI,
            SLABOSCI,
            CIERPIENIA,
            POTRZEBY
    );

    public static List<WarunkiKategoria> REAKCJE = Arrays.asList(
            WYMUSZENIE_REAKCJI,
            REAKCJA
    );

    public static List<WarunkiKategoria> SONDA = Arrays.asList(
            SONDA_GDY,
            SONDA_PO
    );

    public static List<WarunkiKategoria> CZAS = Arrays.asList(
            PLAN,
            ERA
    );

    public static List<WarunkiKategoria> ROZRYWKI_ZART = Arrays.asList(
            ROZRYWKI,
            ZART
    );

    public static List<WarunkiKategoria> EMOCJE_UCZUCIA = Arrays.asList(
            EMOCJE_NEGATYWNE,
            EMOCJE_POZYTYWNE,
            UCZUCIA_NEGATYWNE,
            UCZUCIA_POZYTYWNE
    );

    public static List<WarunkiKategoria> ZDOBYWANIE_WIEDZY_PIENIEDZY = Arrays.asList(
            ZDOBYWANIE_WIEDZY,
            ZAROBEK_NIELEGALNY
    );
}