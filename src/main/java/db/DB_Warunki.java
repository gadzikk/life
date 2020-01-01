package db;

import typy_bazowe.TypKategoria;
import warunek.W;
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
                    W.ZWIAZEK_2_OSOB,
                    W.URODZENIE_SIE,
                    W.ZDROWIE,
                    W.BYT_MATERIALNY)
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_INFORMACJA = new WarunkiKategoria(
            new Kategoria(
                    TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.INFORMACJA),
            Arrays.asList(
                    W.CZAS,
                    W.DOSTEP_DO_PLANSZY,
                    W.LUDZIE,
                    W.MATERIALNE_ZNALEZIENIE_SIE,
                    W.SONDA,
                    W.SZCZEGOLY
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_WIEDZA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.WIEDZA),
            Arrays.asList(
                    W.INFORMACJA,
                    W.PRZYCZYNA,
                    W.SKUTEK,
                    W.WNIOSKI
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_BRAKWSTYDU = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.BRAKWSTYDU),
            Arrays.asList(
                    W.INFORMACJA,
                    W.WIEDZA,
                    W.DZIALANIE
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_REZULTAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.REZULTAT),
            Arrays.asList(
                    W.DZIALANIE,
                    W.KONSEKWENCJE,
                    W.WNIOSKI,
                    W.REZULTAT
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.PRACA),
            Arrays.asList(
                    W.NIEKARALNOSC,
                    W.WYKSZTALCENIE,
                    W.DOSWIADCZENIE,
                    W.UMIEJETNOSCI,
                    W.ZNAJOMOSCI
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_PRACA_RESTRYKCYJNA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.PRACA_RESTRYKCYJNA),
            Arrays.asList(
                    W.NIEKARALNOSC,
                    W.STUDIA,
                    W.KILKA_LAT_DOSWIADCZENIA,
                    W.WIELE_UMIEJETNOSCI,
                    W.Z_POLECENIA
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.ZARABIANIE),
            Arrays.asList(
                    W.UMOWA_PRACA,
                    W.WYKONYWANIE_PRACY
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.SPORT),
            Arrays.asList(
                    W.CZAS,
                    W.SPRAWNOSC,
                    W.ZDOLNOSC_DO_WYSILKU,
                    W.EKWIPUNEK,
                    W.ZGODA_OTOCZENIA
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.OSIEDLE),
            Arrays.asList(
                    W.TO_SAMO_MIASTO,
                    W.DOBRZE_WYGLADA,
                    W.ZNAJOMY_W_SRODOWISKU,
                    W.NIE_PRZECIWNY,
                    W.NIE_KONFI
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_DOPUSZCZENIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.DOPUSZCZENIE),
            Arrays.asList(
                    W.PATRZY,
                    W.REAGUJE,
                    W.USMIECHA,
                    W.DOBRO,

                    W.KOJARZY,
                    W.KTORYS_RAZ,
                    W.WSPOLNI_ZNAJOMI,

                    W.BEZPIECZENSTWO,
                    W.NUDA,
                    W.PODOBA_SIE,

                    W.MUSI_DOPUSCIC
            )
    );

    public static WarunkiKategoria WYMAGANIA_WSTEPNE_KOBIETA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.KOBIETA),
            Arrays.asList(
                    W.STWORZENIE_POINTCUTA,
                    W.ZLAPANIE_POINTCUTA,
                    W.POZNANIE,
                    W.DOPUSZCZENIE,

                    W.PARZONKO_XKILKA,
                    W.SPODOBANIE_SIE,

                    W.PLUS_GT_MINUS,
                    W.WOLNA
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
                    W.ZNAJOMI,
                    W.SWOJ_ZWIAZEK,
                    W.UNIKANIE_ZAGROZEN,
                    W.DBANIE_ZDROWIE,
                    W.ZARABIANIE)
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_INFORMACJA = new WarunkiKategoria(
            new Kategoria(
                    TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.INFORMACJA),
            Arrays.asList(
                    W.SLEDZENIE_INFORMACJI,
                    W.REZULTAT_INFORMACJI,
                    W.POTWIERDZENIE_Z_KIMS,
                    W.SPRAWDZENIE_SAMEMU
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_WIEDZA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.WIEDZA),
            Arrays.asList(
                    W.ODSWIEZANIE,
                    W.PAMIEC,
                    W.ULEPSZANIE,
                    W.DZIELENIE_SIE_WIEDZA
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_BRAKWSTYDU = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.BRAKWSTYDU),
            Arrays.asList(
                    W.LEPSZE_WYKORZYSTANIE_INFORMACJI,
                    W.LEPSZE_DZIALANIE,
                    W.WNIOSKI
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_REZULTAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.REZULTAT),
            Arrays.asList(
                    W.LEPSZE_DZIALANIE,
                    W.UNIKNIECIE_KONSEKWENCJI,
                    W.PRZEWIDYWANIE,
                    W.REZULTAT,
                    W.UTRZYMANIE
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.PRACA),
            Arrays.asList(
                    W.WYSILEK,
                    W.UZYTECZNOSC,
                    W.OPLACA,
                    W.PLUS_GT_MINUS
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_PRACA_RESTRYKCYJNA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.PRACA_RESTRYKCYJNA),
            Arrays.asList(
                    W.PRZESTRZEGANIE_ZASAD,
                    W.ATMOSFERA,
                    W.WYSILEK,
                    W.UZYTECZNOSC,
                    W.REZULTATY,
                    W.OPLACA,
                    W.STOSUNEK1VS1,
                    W.ULEPSZANIE_UMIEJETNOSCI,
                    W.PLUS_GT_MINUS
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.ZARABIANIE),
            Arrays.asList(
                    W.BOGATY_SEKTOR,
                    W.WIEDZA,
                    W.NISZA,
                    W.REGION
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.SPORT),
            Arrays.asList(
                    W.ULEPSZANIE_UMIEJETNOSCI,
                    W.CZAS,
                    W.SPRAWNOSC,
                    W.ZDOLNOSC_DO_WYSILKU,
                    W.EKWIPUNEK,
                    W.ZGODA_OTOCZENIA
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.OSIEDLE),
            Arrays.asList(
                    W.CZESTO_Z_CELEM,
                    W.DZIALANIE,
                    W.ZACIESNIENIE_GRONA_ZNAJOMYCH,
                    W.STO_PRO_LOJALNY,
                    W.PRZESTRZEGANIE_ZASAD
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_DOPUSZCZENIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.DOPUSZCZENIE),
            Arrays.asList(
                    W.DOBRZE_ZNA,
                    W.WSPOLNI_ZNAJOMI,
                    W.BEZPIECZENSTWO,
                    W.EMOCJE,
                    W.PODOBA_SIE,
                    W.PLUS_GT_MINUS
            )
    );

    public static WarunkiKategoria WYMAGANIA_UTRZYMANIA_KOBIETA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.KOBIETA),
            Arrays.asList(
                    W.SPELNIENIE_OCZEKIWAN,
                    W.WSPIERANIE_PREFERENCJI,
                    W.ODKRYWANIE_SWIATA,
                    W.SPEDZANIE_CZASU,
                    W.WIERNOSC,
                    W.ZGODA_OTOCZENIA,

                    W.PILNOWANIE,
                    W.KONTROLA
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
                    W.SZCZESCIE,
                    W.DOSWIADCZENIA,
                    W.WSPOMNIENIA
            )
    );

    public static WarunkiKategoria WARUNKI_KONCOWE_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.PRACA),
            Arrays.asList(
                    W.PIENIADZE,
                    W.STABILIZACJA,
                    W.BEZPIECZENSTWO,
                    W.POZOSTANIE_W_KRAJU,
                    W.UMIEJETNOSCI,
                    W.WIEDZA
            )
    );

    public static WarunkiKategoria WARUNKI_KONCOWE_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.ZARABIANIE),
            Arrays.asList(
                    W.MOZLIWOSC_WYBORU
            )
    );

    public static WarunkiKategoria WARUNKI_KONCOWE_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.SPORT),
            Arrays.asList(
                    W.SPRAWNOSC,
                    W.UMIEJETNOSCI,
                    W.WIEDZA
            )
    );

    public static WarunkiKategoria WARUNKI_KONCOWE_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.OSIEDLE),
            Arrays.asList(
                    W.ZNAJOMI,
                    W.SRODOWISKO,
                    W.KOBIETA,
                    W.SILNE_JEDNOSTKI,
                    W.THREAD_WHILE_LOOP_BLISKOSC_U,
                    W.OSZCZEDNOSC_CZASU,
                    W.AKCEPTACJA,
                    W.LATWY_DOSTEP_PRZEWAGI
            )
    );

    public static WarunkiKategoria WARUNKI_KONCOWE_KOBIETA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.KOBIETA),
            Arrays.asList(
                    W.CODZIENNA_BLISKOSC,
                    W.ZYCIE_RAZEM,
                    W.DZIECI
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
                    W.ZLE_GENY,
                    W.GLUPOTA,
                    W.NIESWIADOMOSC,
                    W.DZIALANIE_ZA_NAMOWA
            )
    );

    public static WarunkiKategoria PRZYCZYNY_DOBRA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PRZYCZYNY_DOBRA),
            Arrays.asList(
                    W.MADROSC,
                    W.WYCHOWANIE,
                    W.WYKONYWANIE_PRACY
            )
    );

    public static  WarunkiKategoria WARTOSC_DOBRA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARTOSC),
            Arrays.asList(
                    W.SRODOWISKO,
                    W.ZASADY,
                    W.UMIEJETNOSCI,
                    W.SPORT,
                    W.WSPIERANIE_SWOJEJ_KLASY,
                    W.DZIECI,
                    W.CHLOP,
                    W.RODZINA
            )
    );

    public static  WarunkiKategoria WARTOSC_ZLA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARTOSC),
            Arrays.asList(
                    W.WYGODY,
                    W.ROZRYWKI,
                    W.PIENIADZE,
                    W.IDEA,
                    W.NAUKA,
                    W.MODA,
                    W.BECZKA,
                    W.KOLEZANKI,
                    W.WRAZLIWOSC
            )
    );

    public static WarunkiKategoria GLOBAL_PLANSZA_LUDZIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.GLOBAL_PLANSZA, TypKategoria.LUDZIE),
            Arrays.asList(
                    W.DZIETNOSC,
                    W.WYCHOWANIE,
                    W.MIESZKANIE
            )
    );

    public static WarunkiKategoria GLOBAL_PLANSZA_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.GLOBAL_PLANSZA, TypKategoria.PRACA),
            Arrays.asList(
                    W.FIRMY_NIEWYMAGAJACE_DOSWIADCZENIE,
                    W.FIRMY_WYMAGAJACE_DOSWIADCZENIE,
                    W.RYNEK_PLAC,
                    W.ZASOBY_LUDZKIE
            )
    );

    public static WarunkiKategoria OCENIA_WEDLUG = new WarunkiKategoria(
            new Kategoria(TypKategoria.OCENIA_WEDLUG),
            Arrays.asList(
                    W.ZLO,
                    W.DOBRO,
                    W.PODOBIENSTWO,
                    W.ZYSK,
                    W.EKIPA,
                    W.PRZEWAGA,
                    W.UMIEJETNOSC
            )
    );

    public static WarunkiKategoria THREAD_WHILE_LOOP = new WarunkiKategoria(
            new Kategoria(TypKategoria.THREAD_WHILE_LOOP),
            Arrays.asList(
                    W.THREAD_WHILE_LOOP_ZASIEG_WZROKU,
                    W.THREAD_WHILE_LOOP_BLISKOSC_U,
                    W.THREAD_WHILE_LOOP_BLISKOSC_K,
                    W.THREAD_WHILE_LOOP_EFEKTYWNA_GADKA
            )
    );

    public static WarunkiKategoria PRZEWAGI = new WarunkiKategoria(
            new Kategoria(TypKategoria.PRZEWAGI),
            Arrays.asList(
                    W.ZNAJOMI, W.OSIEDLOWE_SRD, W.KOBIETA,
                    W.SZANSA_ZNAJOMI, W.SZANSA_OSIEDLOWE_SRD, W.SZANSA_KOBIETA,
                    W.INFORMACJA, W.CZAS, W.WIEDZA, W.BRAK_WSTYDU,
                    W.LUDZIE_ZA_TOBA, W.WALKA_PIESCI, W.WALKA_SPRZET,
                    W.UMIEJETNOSC,
                    W.PRACA, W.PIENIADZE,
                    W.WYSOKA_POZYCJA,
                    W.SPRYT, W.SZYBKOSC, W.SILNY, W.POTRAFI_OCENIC,
                    W.PRZEZYCIE_CIERPIENIA
            )
    );

    public static WarunkiKategoria SLABOSCI = new WarunkiKategoria(
            new Kategoria(TypKategoria.SLABOSCI),
            Arrays.asList(
                    W.BRAK_ZNAJOMYCH, W.BRAK_SRODOWISKA, W.BRAK_KOBIETY,
                    W.BRAK_SZANS_ZNAJOMI, W.BRAK_SZANS_SRODOWISKO, W.BRAK_SZANS_KOBIETA,
                    W.BRAK_INFORMACJI, W.BRAK_CZASU, W.BRAK_WIEDZY, W.WSTYD,
                    W.BRAK_LUDZI_ZA_TOBA, W.NIEZDOLNY_WALKA_PIESCI, W.NIEZDOLNY_WALKA_SPRZET,
                    W.BRAK_UMIEJETNOSCI,
                    W.BRAK_PRACY, W.BRAK_PIENIEDZY,
                    W.SLABA_POZYCJA,
                    W.TEMPOTA, W.POWOLNY, W.SLABY, W.NIEUMIE_OCENIC,
                    W.PRZEZYCIE_WYGOD, W.PRZEZYCIE_DOBRA
            )
    );

    public static WarunkiKategoria CIERPIENIA = new WarunkiKategoria(
            new Kategoria(TypKategoria.CIERPIENIE),
            Arrays.asList(
                    W.ZMECZENIE, W.CIERPIENIE_FIZYCZNE, W.CIERPIENIE_PSYCHICZNE,
                    W.CIERPIENIE_PRZEMIJANIA, W.CIERPIENIE_UTRATY, W.CIERPIENIE_SAMOTNOSCI,
                    W.CIERPIENIE_WIDZENIE_BRAK_DOTKNIECIA,

                    W.ZMECZENIE_DLUGOTRWALE, W.CIERPIENIE_FIZYCZNE_DLUGOTRWALE, W.CIERPIENIE_PSYCHICZNE_DLUGOTRWALE,
                    W.CIERPIENIE_PRZEMIJANIA_DLUGOTRWALE, W.CIERPIENIE_UTRATY_DLUGOTRWALE,
                    W.CIERPIENIE_UTRATY_DLUGOTRWALE, W.CIERPIENIE_SAMOTNOSCI_DLUGOTRWALE,
                    W.CIERPIENIE_WIDZENIE_BRAK_DOTKNIECIA_DLUGOTRWALE
                    )
    );

    public static WarunkiKategoria ZAGROZENIA = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZAGROZENIA),
            Arrays.asList(
                    W.STRATA_WOLNOSCI, W.STRATA_CZASU, W.STRATA_INFORMACJI, W.STRATA_WIEDZY,
                    W.STRATA_DOSTEPU_PLANSZA, W.STRATA_DOSTEPU_ZNAJOMI, W.STRATA_MIEJSCA_W_HIERARCHII, W.STRATA_POZYCJI,
                    W.STRATA_ZDROWIA, W.STRATA_HONORU,
                    W.STRATA_PRACY, W.STRATA_PIENIEDZY, W.STRATA_ZARABIANIA, W.STRATA_WYKSZTALCENIA,
                    W.STRATA_KOBIETY, W.ROZWOD, W.ALIMENTY
            )
    );

    public static WarunkiKategoria ZASADY = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZASADY),
            Arrays.asList(
                    W.PRAWO, W.NIE_KONFI, W.NIE_PRZECIWNA,
                    W.NIEZNAJOMY_JEBAC,
                    W.NIEGADAJ_Z_OBCYMI, W.NIEGADAJ_Z_NIESLAZAKAMI, W.NIEGADAJ_Z_POZAOSIEDLA,
                    W.KTO_NIEBIEGA_TUBA,
                    W.JEDNOSC_PRZECIW_ZAZDROSCI,
                    W.R1_HOLD_YOUR_POSITION, W.R2_ONLY_ONE_CHANCE_TO_SCORE,
                    W.R3_LIFE_IN_YOUR_HANDS_NOT_LORDS, W.R4_WATCH_YOUR_ACTIONS
            )
    );

    public static WarunkiKategoria POTRZEBY = new WarunkiKategoria(
            new Kategoria(TypKategoria.POTRZEBA),
            Arrays.asList(
                    W.KONTAKTU, W.AKCEPTACJI, W.DOBRYCH_JEDNOSTKEK, W.ZWIAZKU, W.ZROZUMIENIA,
                    W.HIGIENY, W.UBRANIA, W.RELIGII, W.ROZRYWKI, W.RUCHU
            )
    );

    public static WarunkiKategoria PRZYMUS = new WarunkiKategoria(
            new Kategoria(TypKategoria.PRZYMUS),
            Arrays.asList(
                    W.JEDZENIE, W.PICIE, W.PRACA, W.EDUKACJA, W.PRZEMIESZCZANIE_SIE,
                    W.TRANSPORT, W.KUPNO_PRODUKTOW
            )
    );

    public static WarunkiKategoria NIESPRAWIEDLIWOSC = new WarunkiKategoria(
            new Kategoria(TypKategoria.NIESPRAWIEDLIWOSC),
            Arrays.asList(
                    W.PRACA_XCZASU_BRAK_REZULATU, W.WDUPCANIE_WYSILKU_DO_PIECA,
                    W.NADUZYWANIE_WYSOKIEJ_POZYCJI, W.GORZEJ_NA_STARCIE, W.PRZEWAGA_NA_STARCIE,
                    W.STRONNICZOSC, W.WYKLUCZENIE
            )
    );

    public static WarunkiKategoria DOBRY = new WarunkiKategoria(
            new Kategoria(TypKategoria.DOBRY),
            Arrays.asList(
                    W.ROBIENIE_PROGRESU, W.ZDOBYWANIE_UMIEJETNOSCI, W.ZDOBYWANIE_WIEDZY, W.ZDOBYWANIE_SILY,
                    W.USWIADAMIANIE, W.WYCIAGANIE_ZE_ZLEJ_SYTUACJI, W.ZMNIEJSZANIE_ZLA, W.ROBIENIE_OPCJI,
                    W.PRZEKONYWANIE_ZA, W.POLECENIE,
                    W.PRAWDA, W.CIERPLIWOSC,
                    W.TRZEZWOSC,
                    W.MADROSC,
                    W.NOWY_DEFAULT_DOBRA_OSOBA,
                    W.NIEPOZWALA_NA_ZLO
            )
    );

    public static WarunkiKategoria ZLY = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZLY),
            Arrays.asList(
                    W.MARNOWANIE_CZASU, W.POZBAWIANIE_UMIEJETNOSCI, W.POZBAWIANIE_WIEDZY, W.POZBAWIANIE_SILY,
                    W.OGLUPIANIE, W.WDUPCANIE_W_ZLE_WARUNKI, W.ZAMYKANIE_OPCJI, W.PRZEKONYWANIE_PRZECIW,
                    W.PRZEKONYWANIE_ZA, W.POLECENIE,
                    W.KLAMSTWO, W.AGRESJA_FIZYCZNA, W.AGRESJA_PSYCHICZNA,
                    W.ODUZENIE,
                    W.GLUPOTA,
                    W.NOWY_DEFAULT_RYWAL,
                    W.JEBIE_DOBRO, W.WYMAGA_PRZEWAG_NA_ZLU
            )
    );

    public static WarunkiKategoria WYMUSZENIE_REAKCJI = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMUSZENIE_REAKCJI),
            Arrays.asList(
                    W.KONTEKST, W.OSKARZENIE, W.ULTIMATUM, W.CISNIECIE
            )
    );

    public static WarunkiKategoria REAKCJA = new WarunkiKategoria(
            new Kategoria(TypKategoria.REAKCJA),
            Arrays.asList(
                    W.BRAK_ODPOWIEDZI, W.PRZESTRASZENIE_SIE, W.UCIECIE,
                    W.ODPOWIEDZ_ODCZEP, W.ODPOWIEDZ_NEUTRAL, W.ODPOWIEDZ_ZAINTERESOWANIE,
                    W.EKSCYTACJA, W.PRZEJCIE_INICJATYWY
            )
    );

    public static WarunkiKategoria SONDA_GDY = new WarunkiKategoria(
            new Kategoria(TypKategoria.SONDA, TypKategoria.SONDA_GDY),
            Arrays.asList(
                    W.WIDZISZ, W.MOWI, W.ROBI, W.POSIADA
            )
    );

    public static WarunkiKategoria SONDA_PO = new WarunkiKategoria(
            new Kategoria(TypKategoria.SONDA, TypKategoria.SONDA_PO),
            Arrays.asList(
                    W.OCZY, W.REAGOWANIE, W.CHODZENIE, W.POSTURA, W.ZACHOWANIE,
                    W.MOWA, W.ZNAJOMI
            )
    );

    public static WarunkiKategoria KRYTERIA_WROGA = new WarunkiKategoria(
            new Kategoria(TypKategoria.KRYTERIA_WROGA),
            Arrays.asList(
                    W.PRZECIWNA_RASA, W.PRZECIWNY_NAROD, W.PRZECIWNA_KLASA, W.PRZECIWNY_KLUB,
                    W.PRZECIWNA_STRONA, W.ZASZKODZIL
            )
    );

    public static WarunkiKategoria PLAN = new WarunkiKategoria(
            new Kategoria(TypKategoria.PLAN),
            Arrays.asList(
                    W.CYKL_DNIA, W.DZIEN, W.TYDZIEN, W.MIESIAC, W.TRZY_MIESIACE, W.POL_ROKU,
                    W.ROK
            )
    );

    public static WarunkiKategoria ZART = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZART),
            Arrays.asList(
                    W.UKAZANIE_OSOBY_W_KOMICZNEJ_SYTUACJI, W.WYOLBRZYMIENIE, W.ZAMIANA,
                    W.RZECZYWISTOSC_ODBIEGAJACA_OD_NORMY
            )
    );

    public static WarunkiKategoria ERA = new WarunkiKategoria(
            new Kategoria(TypKategoria.ERA),
            Arrays.asList(
                    W.PONIZEJ_1900, W.OD_1900_DO_1939, W.OD_1939_DO_1945, W.OD_1945_DO_1953,
                    W.OD_1953_DO_1970, W.OD_1970_DO_1990, W.OD_1990_DO_2000, W.OD_2000_DO_2005,
                    W.OD_2005_DO_2011, W.OD_2011_DO_2016, W.OD_2016_DO_TERAZ
            )
    );

    public static WarunkiKategoria ROZRYWKI = new WarunkiKategoria(
            new Kategoria(TypKategoria.ROZRYWKI),
            Arrays.asList(
                    W.MUZYKA, W.TANIEC, W.TELEWIZJA, W.PRZYJEMNA_ROZMOWA, W.GRY,
                    W.ODUZENIE
            )
    );

    public static WarunkiKategoria EMOCJE_NEGATYWNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.EMOCJE, TypKategoria.EMOCJE_NEGATYWNE),
            Arrays.asList(
                    W.STRACH, W.LEK, W.ADRENALINA, W.NIEPOKOJ, W.TESKNOTA, W.SAMOTNOSC,
                    W.GNIEW, W.ZLOSC, W.ROZPACZ, W.SMUTEK, W.ZAZDROSC,
                    W.AGRESJA_FIZYCZNA, W.AGRESJA_PSYCHICZNA
            )
    );

    public static WarunkiKategoria EMOCJE_POZYTYWNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.EMOCJE, TypKategoria.EMOCJE_POZYTYWNE),
            Arrays.asList(
                    W.SZCZESCIE, W.RADOSC, W.KONTEMPLACJA, W.SPELNIENIE,
                    W.SPOKOJ, W.CIEKAWOSC, W.ZASKOCZENIE, W.PODNIECENIE
            )
    );

    public static WarunkiKategoria UCZUCIA_NEGATYWNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.UCZUCIA, TypKategoria.UCZUCIA_NEGATYWNE),
            Arrays.asList(
                    W.ZREZYGNOWANIE, W.POCZUCIE_UTRATY, W.PRZYKROSC, W.POCZUCIE_WYKLUCZENIA,
                    W.ZAGROZENIE
            )
    );

    public static WarunkiKategoria UCZUCIA_POZYTYWNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.UCZUCIA, TypKategoria.UCZUCIA_POZYTYWNE),
            Arrays.asList(
                    W.MILOSC, W.PRZYJAZN, W.BRATERSTWO, W.KOLEZENSTWO, W.POCZUCIE_SZCZESCIA,
                    W.POCZUCIE_ZYSKU, W.POCZUCIE_SUKCESU, W.ZAPAL, W.PRZYJEMNOSC
            )
    );

    public static WarunkiKategoria ZDOBYWANIE_WIEDZY = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZDOBYWANIE_WIEDZY),
            Arrays.asList(
                    W.OCZY, W.PRZYCZYNA, W.REZULTAT, W.WNIOSKI,
                    W.SLOWO_PISANE, W.DOWODY_TEORII_NA_PLANSZACH, W.SLYSZANE_SLOWA
            )
    );

    public static WarunkiKategoria ZAROBEK_NIELEGALNY = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZAROBEK_NIELEGALNY),
            Arrays.asList(
                    W.DILLERKA, W.ZLODZIEJKA, W.PRZEMYT, W.JAZDA_ZE_SPRZETEM
            )
    );

    public static WarunkiKategoria KURESTWO = new WarunkiKategoria(
            new Kategoria(TypKategoria.KURESTWO),
            Arrays.asList(
                    W.POLICJA, W.PUSZCZALSKOSC, W.ZDOLNOSC_KONFIDENTCTWO
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