package db;

import metoda.M;
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
public class DB_Warunki extends DB {
    public void init() {
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
        ALL.addAll(KSZTALTOWANIE);
        ALL.addAll(RANY);
        ALL.addAll(TYPY_PRAC);


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
                PRZYCZYNY_SLUZENIA_ZLU,
                PRZYCZYNY_SLUZENIA_DOBRU,
                ZACHETA_DO_ZLA,
                NIESPRAWIEDLIWOSC,
                DOBRE_CZYNY,
                ZLE_CZYNY,
                ANTY_DZIALACZ,
                WADY_ZLYCH,
                OKAZJE_ZROBIENIE_ZLO,
                OKAZJE_ZROBIENIE_DOBRO,
                ZLY_ZNAKI_ROZPOZNAWCZE
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
                OSLONY,
                KURESTWO,
                METODY_POLICYJNE
        );

        List<WarunkiKategoria> TWL_PRZEWAGI_SLABOSCI_CIERPIENIA_POTRZEBY = Arrays.asList(
                THREAD_WHILE_LOOP,
                PRZEWAGI,
                SLABOSCI,
                CIERPIENIA,
                POTRZEBY,
                OSLONY,
                DEFAULT_WARUNKI,
                CECHY_RDZENNY,
                SLABY_TCHORZ
        );

        List<WarunkiKategoria> REAKCJE = Arrays.asList(
                WYMUSZENIE_REAKCJI,
                REAKCJA
        );

        List<WarunkiKategoria> SONDA = Arrays.asList(
                SONDA_GDY,
                SONDA_PO,
                KOGO,
                WYMAGA_KARY,
                SONDA_DZIALACZA,
                SONDA_SHRTS
        );

        List<WarunkiKategoria> CZAS = Arrays.asList(
                CYKL_DNIA,
                PLAN,
                ERA,
                SPEDZANIE_CZASU
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

        List<WarunkiKategoria> KSZTALTOWANIE = Arrays.asList(
                KSZTALTOWANIE_DZIELNICY,
                KSZTALTOWANIE_CZLOWIEKA

        );

        List<WarunkiKategoria> RANY = Arrays.asList(
                RANY_PSYCHICZNE,
                RANY_FIZYCZNE,
                RANY_ZNECANIE_SIE,
                RANY_SPRZET,
                RANY_DOSTEPOWE,
                KTO_KOGO,
                KURESTWO,
                OBRONA_STARCIE,
                METODA_STARCIE_REAKCJA,
                ULICA_PRZEWAGA_REAKCJA,
                KONFRONTACJA
        );

        List<WarunkiKategoria> TYPY_PRAC = Arrays.asList(
                PRACA_FIZYCZNA,
                PRACA_HANDEL,
                PRACA_WYMAGAJACA_UMIEJETNOSCI,
                PRACA_USLUGI,
                PRACA_OSWIATA,
                PRACA_TRANSPORT,
                PRACA_TECHNICZNA_UMYSLOWA
        );

        List<WarunkiKategoria> TEMATY = Arrays.asList(
                TEMATY_NORMALNYCH_LUDZI,
                TEMATY_RDZENNYCH
        );

        List<WarunkiKategoria> KOBIETA_PRAKTYKA = Arrays.asList(
                WZGLEDNA_IZOLACJA,
                SPRZYJAJACE,
                NIE_SPRZYJAJACE,
                ESSENTIALS,
                PLANSZA,
                EXTREMALNE
        );

        List<WarunkiKategoria> UNIWERSALNE_SWIAT = Arrays.asList(
                WSPOMNIENIA
        );

        List<WarunkiKategoria> LUDZIE = Arrays.asList(
                TYPY_LUDZI_SHRT,
                TYPY_LUDZI_DOBRE,
                TYPY_LUDZI_ZLE
        );

        List<WarunkiKategoria> SYTUACJE = Arrays.asList(
                TYPY_SYTUACJI,
                SYTUACJE_STARCIE
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
                    W.SPELNIENIE_WYMAGAN,
                    W.POPYT,
                    W.ODZEW_HR,
                    W.POZYTYWNY_FEEDBACK_INTERVIEW,
                    W.WYGRANIE_Z_KONKURENTAMI,
                    W.SCREENING_POZYTYWNY,

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

    public static WarunkiKategoria PRZYCZYNY_SLUZENIA_ZLU = new WarunkiKategoria(
            new Kategoria(TypKategoria.PRZYCZYNY_ZLA),
            Arrays.asList(
                    W.ZLE_GENY, W.GLUPOTA, W.NIESWIADOMOSC, W.DZIALANIE_ZA_NAMOWA,
                    W.ROZKAZ, W.ULTIMATUM_OD_SILNIEJSZYCH,

                    W.ZLE_W_ZYCIU, M.NIE_DOSTRZEGA(M.SILA_SPRAWCZA(W.DOBRO)),
                    W.NASTAWIENIE_JA_GNOJONY_GNOJE_NIZSZYCH, W.NASTAWIENIE_MAM_ZLE_ON_TEZ_MUSI, W.NASTAWIENIE_NIE_MAM_NIC_ON_TEZ_MA_NIE_MIEC,
                    M.MOCNO(W.ZAZDROSC), M.MOCNO(W.CHCIWOSC), M.MOCNO(W.DOMINACJA),
                    W.PIENIADZE, W.POTRZEBA_PARTNERA,
                    W.KOMFORT, W.PRZYJEMNOSC, W.WARTOSC_MATERIALNA, W.MONOPOL_ZLA,
                    W.BRAK_OPCJI, W.NUDA, W.ZNAJOMOSCI, W.PRZEWAGA_SILY,
                    W.POTRZEBA_WSPARCIA, W.POTRZEBA_AKCEPTACJI, W.POTRZEBA_EMOCJI,
                    W.UZALEZNIENIE, W.NIENAWISC
            )
    );

    public static WarunkiKategoria PRZYCZYNY_SLUZENIA_DOBRU = new WarunkiKategoria(
            new Kategoria(TypKategoria.PRZYCZYNY_DOBRA),
            Arrays.asList(
                    W.MADROSC, W.WYCHOWANIE, W.WYKONYWANIE_PRACY,
                    W.DOBRO_W_SERCU, W.SUMIENIE, W.CIERPIENIE_OD_ZLYCH
            )
    );

    public static WarunkiKategoria WARTOSC_DOBRA = new WarunkiKategoria(
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

    public static WarunkiKategoria WARTOSC_ZLA = new WarunkiKategoria(
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
                    W.ZNAJOMI, W.OSIEDLOWE_SRD, W.KOBIETA, W.SAMOCHOD,
                    W.SZANSA_ZNAJOMI, W.SZANSA_OSIEDLOWE_SRD, W.SZANSA_KOBIETA,
                    W.INFORMACJA, W.CZAS, W.WIEDZA, W.BRAK_WSTYDU,
                    W.ROZMIAR, W.PODNOSZENIE_CIEZAROW, W.SILNE_UDERZENIE, W.ZAPASY, W.OBRONA, W.SILNI_KUMPLE_ZDOLNI_DO_WALKI,
                    W.LUDZIE_ZA_TOBA, W.WALKA_PIESCI, W.WALKA_SPRZET, M.SPRZET(M.EKIPA(W.SAMOCHOD_NA_CHODZIE)), M.SPRZET(M.EKIPA(W.MIEJSCE)),
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

    public static WarunkiKategoria OSLONY = new WarunkiKategoria(
            new Kategoria(TypKategoria.OSLONA),
            Arrays.asList(
                    W.NIESWIADOMOSC_OPPONENTA, W.DYSTANS, M.WOKOL_TYLKO(W.SWOI), W.NIE_KIBICUJE,

                    W.MIEJSCE_STALE, W.PRACA, W.LAMUS, W.DUZO_OSOB, W.KOBIETA, W.Z_KOBIETA, W.Z_RODZINA,
                    W.SAMOCHOD, W.CHLOPAK, W.DOSTEP_RESTRYKTOWANY, W.EKIPA,

                    W.PRZEWAGA_SILY, W.SPRZET
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

    public static WarunkiKategoria DOBRE_CZYNY = new WarunkiKategoria(
            new Kategoria(TypKategoria.DOBRY),
            Arrays.asList(
                    M.CIEZKO(W.DANIE_ZYCIA), M.CIEZKO(W.DOBRE_WYCHOWANIE), M.CIEZKO(of(W.ZMNIEJSZANIE_ZLA, W.AKTYWNA_WALKA_ZE_ZLEM)),
                    M.CIEZKO(W.USWIADAMIANIE), M.CIEZKO(W.CZYNIENIE_SWIATA_LEPSZYM),

                    W.ROBIENIE_PROGRESU, W.ZDOBYWANIE_UMIEJETNOSCI, W.ZDOBYWANIE_WIEDZY, W.ZDOBYWANIE_SILY,
                    W.WYCIAGANIE_ZE_ZLEJ_SYTUACJI, W.ROBIENIE_OPCJI,
                    W.PRZEKONYWANIE_ZA, W.POLECENIE,
                    W.PRAWDA, W.CIERPLIWOSC,
                    W.TRZEZWOSC,
                    W.MADROSC,
                    W.NOWY_DEFAULT_DOBRA_OSOBA,
                    W.NIEPOZWALA_NA_ZLO,
                    W.TWORZENIE_KONTAKTU, W.TWORZENIE_ISTNIENIA
            )
    );

    public static WarunkiKategoria ZLE_CZYNY = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZLY),
            Arrays.asList(
                    M.LATWO(W.ZLE_WYCHOWANIE), M.LATWO(M.WSPARCIE(W.ZLO)),
                    M.LATWO(W.OGLUPIANIE), M.LATWO(W.CZYNIENIE_SWIATA_GORSZYM),

                    W.MARNOWANIE_CZASU, W.POZBAWIANIE_UMIEJETNOSCI, W.POZBAWIANIE_WIEDZY, W.POZBAWIANIE_SILY,
                    W.WDUPCANIE_W_ZLE_WARUNKI, W.ZAMYKANIE_OPCJI, W.PRZEKONYWANIE_PRZECIW,
                    W.PRZEKONYWANIE_ZA, W.POLECENIE,
                    W.KLAMSTWO, W.AGRESJA_FIZYCZNA, W.AGRESJA_PSYCHICZNA,
                    W.ODUZENIE,
                    W.GLUPOTA,
                    W.NOWY_DEFAULT_RYWAL,
                    W.JEBIE_DOBRO, W.WYMAGA_PRZEWAG_NA_ZLU,
                    W.SKAZYWANIE_SAMOTNOSC, W.SKAZYWANIE_PUSTKA
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
                    W.MOWA, W.ZNAJOMI, W.CZYNY
            )
    );

    public static WarunkiKategoria KRYTERIA_WROGA = new WarunkiKategoria(
            new Kategoria(TypKategoria.KRYTERIA, TypKategoria.KRYTERIA_WROGA),
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

    public static WarunkiKategoria KRYTERIA_PRZYPALU = new WarunkiKategoria(
            new Kategoria(TypKategoria.KRYTERIA, TypKategoria.KRYTERIA_PRZYPALU),
            Arrays.asList(
                    M.DZIELNICA(W.NAJLEPSZY_WARUNEK),
                    W.KONKRETNA_INFORMACJA, W.DOWOD, W.ILE_OSOB_WIDZI_SLYSZY, W.GODZINA, W.MIEJSCE,
                    W.SCIEZKA_CZESTOSC_UCZESCZANIA, W.ZNANY_NA_MIEJSCU, W.LATWOSC_SZYBKOSC_ODDALENIA, W.ACCESS_MIEJSCE_ULTRADOSTEPOWE,
                    W.MOZLIWOSC_ZMIANY_GLOBALNEGO_POKOJU
            )
    );

    public static WarunkiKategoria TERROR = new WarunkiKategoria(
            new Kategoria(TypKategoria.TERROR),
            Arrays.asList(
                    W.OCZY, W.USZY, W.CIERPIENIE, W.CIERPIENIE_DLUGOTERMINOWE, W.POZBAWIENIE_PRZEWAGI, W.KOSZTA,
                    W.POZBAWIENIE_BEZPIECZENSTWA, W.POZBAWIENIE_DOSTEPOW, W.POZBAWIANIE_AUTORYTETU, W.PRZEJEBANE
            )

    );

    public static WarunkiKategoria FEST = new WarunkiKategoria(
            new Kategoria(TypKategoria.FEST),
            Arrays.asList(
                    W.CHRONI_FESTA, W.TWORZY_KOLECZKO_ADORACJI, W.WYLACZY_DOSTEP, W.WYKLUCZY_CIE, W.ZAZDROSC,
                    W.EMOCJE_FIRST, W.HIERARCHIA_FIRST, W.ZMIENNOSC, W.WRAZLIWOSC, W.WOLNOSC, W.RESET, W.SAMOPOCZUCIE,
                    W.JA_NAJWAZNIEJSZY,

                    W.NIESWIADOMOSC, W.DZIECKO, W.BRAK_INFORMACJI_OTOCZENIE,
                    W.NIE_WIDZI_ZAGROZEN, W.NIE_ROZUMIE_PRZYCZYN_SKUTKOW, W.NIE_WYCIAGA_WNIOSKOW, W.NIE_KOJARZY_FAKTOW,
                    W.NIE_DOSTRZEGA_SZCZEGOLOW, W.NIE_WIDZI_KONTEKSTU, W.BAGATELIZUJE_INFORMACJE, W.IGNORUJE_INFORMACJE,
                    W.NIE_WIDZI_OKAZJI, W.NIE_STWARZA_OKAZJI, W.NIE_WYKORZYSTUJE_OKAZJI,

                    W.TWORZY_SOBIE_PROBLEMY_ZAMIAST_ROZWIAZYWAC, W.NIE_WIDZI_SWYCH_BLEDOW, W.POWTARZA_BLEDY,
                    W.NIE_PAMIETA_BLEDOW, W.LEKCEWAZY_BLEDY,

                    W.JEDNO_MOWI_DRUGIE_ROBI, W.ODERWANY_OD_RZECZYWISTOSCI, W.ZMAGA_SIE_WRAZLIWE_EMOCJE_NERWY_PARALIZ,
                    W.BRAK_KONSEKWENCJI, W.BRAK_SZACUNKU_DO_LUDZI, W.BRAK_SZACUNKU_DO_ZASAD, W.BRAK_SZACUNKU_DO_CZYNOW,

                    W.BLEDNY_SYSTEM_WARTOSCI, W.MALO_WAZNE_MOCNO, W.WAZNE_SLABO,

                    W.PIERWSZA_TRUDNOSC_PODDANIE, W.NIE_UMIE_PRACOWAC, W.PRACUJE_GDY_WYGODA_ZAPEWNIONA,
                    W.NIEZDOLNY_DO_WYSILKU, W.NIEZDOLNY_DO_CIERPIENIA, W.ZEROWA_SILA, W.NIEZDOLNY_DO_WALKI,
                    W.BOI_SIE_PRAWA, W.BRAK_SILY_SPRAWCZEJ,

                    W.POSLUSZNY, W.POSLUSZNY_SILE, W.BRAK_DOSTEPU_RDZENNI,

                    W.BRZYDKI, W.EMOCJE_ZE_ZLA, W.DZIWNE_HOBBY, W.DZIWNY_SYSTEM_WARTOSCI, W.KOMPLEKS_WZGLEDEM_LEPSZYCH, W.PRZECIW_LEPSZYM,
                    W.KOLECZKO_WZAJEMNEJ_ADORACJI, W.PODLIZYWANIE_SIE,

                    W.BRAK_ZOBOWIAZAN, W.BRAK_WYMAGAN, W.BRAK_OCZEKIWAN,
                    W.BRAK_WSTYDU_WEW, W.MULTIKULTI_OK, W.MIECZAK, W.NIE_DOTRZYMUJE_TERMINOW, W.FALSZYWY, W.NIE_UMIE_KLAMAC,

                    W.BRAK_SENSU_INTERAKCJI, W.FESCIARSKIE_BEZBARWNE_TEMATY, W.BEZSENSOWNE_KLUTNIE,
                    W.NUDNE_ZYCIE_PRZEWIDYWALNE_BEZ_EMOCJI, W.IMITACJA_ZYCIA, W.BYLE_CO, W.BYLE_GDZIE, W.BYLE_Z_KIM,

                    W.CIEKAWSKI, W.LUBI_WYGODY, W.LUBI_PRZYJEMNOSCI, W.MIESZANIEC, W.KONSTRUKTYWNA_KRYTYKA_JAKO_WYZWISKO,
                    W.GNIEW, W.BRAK_OBIEKTYWNEJ_OCENY, W.BRAK_OKRESLENIA_SKALI, W.BIZNES_PRYWATNY_FOLWARK_SUPERPOZYCJA,

                    W.TWARDOGLOWY_LUB_MIEKKOGLOWY, W.SPOKOJ, W.DYKTATURA_SZCZESCIA_ZERO_WYSILKU_KONFLIKTOW
            )
    );

    public static WarunkiKategoria DZIALAJACY = new WarunkiKategoria(
            new Kategoria(TypKategoria.DZIALAJACY),
            Arrays.asList(
                    // TODO
            )
    );

    public static WarunkiKategoria ZLY_ZNAKI_ROZPOZNAWCZE = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZLY_ZNAKI_ROZPOZNAWCZE),
            Arrays.asList(
                    W.CZARNE_WLOSY, W.TATUAZE, W.RUDY, W.RUMUN, W.CZERWONE_OCZY,
                    W.DRESY_SZARE_MATERIALOWE, W.GAZ, W.TORBA,
                    W.PATRZY_ZLE, W.PATRZY_Z_EXSTAZA, W.PATRZY_JAKBY_CHCIAL_OKLAMAC, W.SLABA_POSTURA, W.PRZEWIDUJE_ZLE,
                    W.NIE_PATRZY_ALE_KONSULTUJE,
                    W.KASZLE, W.MACHA, W.GWIZDZE, W.ZADAJE_GLUPIE_PYTANIA, W.TELEFON_ZDJECIA, W.SLABO_REAGUJE_NA_BODZCE,
                    W.LEKKI_GLOS, W.DZIWNY_GLOS
            )
    );

    public static WarunkiKategoria BLAD = new WarunkiKategoria(
            new Kategoria(TypKategoria.BLAD),
            Arrays.asList(
                    W.BLAD_POJEDYNCZY, W.BLAD_NIESWIADOMY_PRZYPADKOWY,
                    W.BLAD_SPECJALNY, W.BLAD_LENISTWA,
                    W.BLAD_ZLAMANIA_ZASAD
            )
    );

    public static WarunkiKategoria KOGO = new WarunkiKategoria(
            new Kategoria(TypKategoria.SONDA, TypKategoria.KOGO),
            Arrays.asList(
                    W.ZAGRANICZNI_CIEMNI, W.ZAGRANICZNI_JASNI,
                    W.BURZUA_DZIALAJACA, W.BURZUA_NIESWIADOMA,
                    W.DZIALACZE_PRZECIWNI, W.DUZI_TEMPI, W.TEGO_CO_RUCHA
            )
    );

    public static WarunkiKategoria HIERARCHIA_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.HIERARCHIA, TypKategoria.HIERARCHIA_PRACA),
            Arrays.asList(
                    W.BRAK_PRACY, W.PRACA_NA_ETACIE, W.MANAGER, W.OKRESLAJACY_BUDZET, W.ZARZAD_FIRMY, W.OWNER_FIRMY,
                    W.OWNER_KORPORACJI
            )
    );

    public static WarunkiKategoria HIERARCHIA_ULICA = new WarunkiKategoria(
            new Kategoria(TypKategoria.HIERARCHIA, TypKategoria.HIERARCHIA_ULICA),
            Arrays.asList(
                    W.RDZENNY_DOBRY,
                    W.ZLODZIEJ, W.DIL, W.PATOLOG, W.BIEGACZ, W.OSIEDLOWY_OGARNIETY, W.OSIEDLOWY_NORMAL,
                    W.SPORTOWY_FEST, W.OSIEDLOWY_CASUAL,
                    W.OSIEDLOWY_WYKRECONY, W.OSIEDLOWY_BURZUJ
            )
    );

    public static WarunkiKategoria CYKL_DNIA = new WarunkiKategoria(
            new Kategoria(TypKategoria.CYKL_DNIA),
            Arrays.asList(
                    W.OD_00_DO_6, W.OD_6_DO_7, W.OD_7_DO_9, W.OD_9_DO_11_, W.OD_11_DO_14,
                    W.OD_14_DO_17, W.OD_17_DO_19, W.OD_19_DO_21, W.OD_21_DO_24
            )
    );

    public static WarunkiKategoria KSZTALTOWANIE_DZIELNICY = new WarunkiKategoria(
            new Kategoria(TypKategoria.KSZTALTOWANIE, TypKategoria.KSZTALTOWANIE_DZIELNICY),
            Arrays.asList(
                    W.WARUNEK_UTWORZENIA_SIE_MIASTA,
                    W.PRACA, W.RDZENNI, W.LUDZIE
            )
    );

    public static WarunkiKategoria KSZTALTOWANIE_CZLOWIEKA = new WarunkiKategoria(
            new Kategoria(TypKategoria.KSZTALTOWANIE, TypKategoria.KSZTALTOWANIE_CZLOWIEKA),
            Arrays.asList(
                    W.OSOBOWOSC, W.WIDZISZ, W.SLYSZYSZ, W.CZUJESZ, W.Z_KIM_PRZYSTAJESZ, W.PRAKTYKA, W.ZNAJOMI,
                    W.CHARAKTER, W.CIERPIENIE, W.CIEZKA_PRACA, W.TRUDNOSCI,
                    W.UMYSL, W.PRACA_UMYSLOWA, W.CZYTANIE,
                    W.FIZYCZNE, W.MAX_WZROKU, W.BIEGANIE, W.ROWER, W.BOKS, W.CIEZARY, W.PLYWANIE
            )
    );

    public static WarunkiKategoria SPEDZANIE_CZASU = new WarunkiKategoria(
            new Kategoria(TypKategoria.SPEDZANIE_CZASU),
            Arrays.asList(
                    W.CEL, W.ZARABIANIE, W.WYCHOWYWANIE,
                    W.RDZENNA_LUDNOSC, W.PATOLOGIA, W.MLODE_KOBIETY_CHCACE_RODZINY
            )
    );

    public static WarunkiKategoria RANY_PSYCHICZNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.RANY, TypKategoria.RANY_PSYCHICZNE),
            Arrays.asList(
                    W.PATRZENIE_W_OCZY, W.OBELGI_WYSOKA_CZESTOTLIWOSC, W.OBELGI_W_PETLI, W.UKAZANIE_WAD, W.WYSMIANIE, W.WYSMIANIE_NAJBLIZSZYCH, W.UKAZANIE_WAD_NAJBLIZSZYCH,
                    W.POBICIE_PRZY_ZNAJOMYCH, W.POBICIE_PRZY_RODZINIE,
                    W.POBICIE_ZNAJOMYCH, W.POBICIE_RODZINY, W.USZCZERBEK_ZDROWIE, W.STRATA_HONORU
            )
    );

    public static WarunkiKategoria RANY_FIZYCZNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.RANY, TypKategoria.RANY_FIZYCZNE),
            Arrays.asList(
                    W.POPCHNIECIE, W.LEPIEC, W.STRZAL, W.KILKA_STRZALOW, W.BICIE_DO_UPADKU, W.BICIE_DO_UTRATY_PRZYTOMNOSCI
            )
    );

    public static WarunkiKategoria RANY_ZNECANIE_SIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.RANY, TypKategoria.RANY_ZNECANIE_SIE),
            Arrays.asList(
                    W.KOPANIE_KONCZYNY, W.KOPANIE_BRZUCH, W.KLEPANIE_KARK, W.GLOWA_O_POWIERZCHNIE
            )
    );

    public static WarunkiKategoria RANY_SPRZET = new WarunkiKategoria(
            new Kategoria(TypKategoria.RANY, TypKategoria.RANY_SPRZET),
            Arrays.asList(
                    W.CIECIE_MIEJSCA_NIEZAGRAZJACE, W.CICIE_MIEJSCA_WIDOCZNE, W.CIECIE_MIEJSCA_ZAGRAZAJACE
            )
    );

    public static WarunkiKategoria RANY_DOSTEPOWE = new WarunkiKategoria(
            new Kategoria(TypKategoria.RANY, TypKategoria.RANY_DOSTEPOWE),
            Arrays.asList(
                    W.WYLACZENIE_SRODOWISKA, W.WYLACZENIE_KOBIETY, W.WYLACZENIE_ZAROBKU, W.KAZDY_SPOTYKA_BIJE, W.KAZDY_KTO_SIEDZI_POJECHANE
            )
    );

    public static WarunkiKategoria PRACA_FIZYCZNA = new WarunkiKategoria(
            new Kategoria(TypKategoria.TYP_PRACY, TypKategoria.PRACA_FIZYCZNA),
            Arrays.asList(
                    W.PRZEMYSL, W.HUTNICTWO, W.SPAWALNICTWO,
                    W.WYDOBYCIE_SUROWCE, W.PRZETWORSTWO_SUROWCE, W.BUDOWNICTWO, W.ENERGETYKA
            )
    );


    public static WarunkiKategoria PRACA_HANDEL = new WarunkiKategoria(
            new Kategoria(TypKategoria.TYP_PRACY, TypKategoria.PRACA_HANDEL),
            Arrays.asList(
                    W.KASJERKA, W.MAGAZYN
            )
    );

    public static WarunkiKategoria PRACA_WYMAGAJACA_UMIEJETNOSCI = new WarunkiKategoria(
            new Kategoria(TypKategoria.TYP_PRACY, TypKategoria.PRACA_WYMAGAJACA_UMIEJETNOSCI),
            Arrays.asList(
                    W.FRYZJERKA, W.KOSMETYCZKA, W.MAKIJARZYSTKA
            )
    );

    public static WarunkiKategoria PRACA_USLUGI = new WarunkiKategoria(
            new Kategoria(TypKategoria.TYP_PRACY, TypKategoria.PRACA_USLUGI),
            Arrays.asList(
                    W.HOTEL, W.GASTRONOMIA, W.OCHRONA
            )
    );

    public static WarunkiKategoria PRACA_OSWIATA = new WarunkiKategoria(
            new Kategoria(TypKategoria.TYP_PRACY, TypKategoria.PRACA_OSWIATA),
            Arrays.asList(
                    W.NAUCZYCIEL
            )
    );

    public static WarunkiKategoria PRACA_TRANSPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.TYP_PRACY, TypKategoria.PRACA_TRANSPORT),
            Arrays.asList(
                    W.KIEROWCA, W.MOTORNICZY
            )
    );

    public static WarunkiKategoria PRACA_TECHNICZNA_UMYSLOWA = new WarunkiKategoria(
            new Kategoria(TypKategoria.TYP_PRACY, TypKategoria.PRACA_TECHNICZNA_UMYSLOWA),
            Arrays.asList(
                    W.KSIEGOWA, W.HR, W.MECHANIK, W.ELEKTRONIK, W.INFORMATYK
            )
    );

    public static WarunkiKategoria NASTAWIENIA = new WarunkiKategoria(
            new Kategoria(TypKategoria.LUDZIE, TypKategoria.NASTAWIENIE),
            Arrays.asList(
                    W.NASTAWIENIE_AGRESJA_W_DZIALANIU, W.NASTAWIENIE_KONTEMPLACJA, W.NASTAWIENIE_RELAKS, W.NASTAWIENIE_PRACA,
                    W.NASTAWIENIE_OSZUKANIE_WDUPCENIE, W.NASTAWIENIE_NA_ZLO, W.NASTAWIENIE_DOBRO, W.NASTAWIENIE_POZNANIE,
                    W.NASTAWIENIE_KONTRA, W.NASTAWIENIE_PRZYJEMNOSCI, W.NASTAWIENIE_WSPARCIE, W.NASTAWIENIE_PRZECIW,
                    W.NASTAWIENIE_HIERACHI_PRZYWILEJE, W.NASTAWIENIE_BIERZESZ_CO_TWOJE,

                    W.NASTAWIENIE_MAM_ZLE_ON_TEZ_MUSI, W.NASTAWIENIE_NIE_MAM_NIC_ON_TEZ_MA_NIE_MIEC, W.NASTAWIENIE_JA_GNOJONY_GNOJE_NIZSZYCH,
                    W.NASTAWIENIE_DOMINACJA, W.NASTAWIENIE_STARCIE
            )
    );

    public static WarunkiKategoria KTO_KOGO = new WarunkiKategoria(
            new Kategoria(TypKategoria.RANY, TypKategoria.KTO_KOGO),
            Arrays.asList(
                    M.START(W.ZLE_ZAMIARY),
                    M.STANDARD(M.MALY_WYSILEK(M.MOCNO(M.thread_while_loop(W.SZUKA_KANDYDATOW_ZROBIENIE_ZLA)))),
                    M.STANDARD((M.MALY_WYSILEK(M.MOCNO(M.thread_while_loop(W.STWARZA_OKAZJE_ZROBIENIE_ZLA))))),
                    M.DEFAULT(M.WYWYZSZAJ(M.UMACNIAJ(W.SIEBIE)), M.UNIZAJ(M.OSLABIAJ(W.INNI)), W.POBIJ_JAK_NAJWIECEJ_OSOB, W.ZDOBADZ_JAK_NAJWIECEJ_PRZEWAG),

                    M.MALY_WYSILEK(M.MOCNO(M.PODSTAWA(of(W.UKRYCIE, W.KLAMSTWO, W.PO_CICHU)))),
                    M.MALY_WYSILEK(M.MOCNO(of(W.WDUPC_ZAKLECIEM, W.ZAMKNIJ_ZASOB, W.OSZUKANIE_WDUPCENIE, W.WYKLUCZENIE))),
                    M.MALY_WYSILEK(M.MOCNO(of(W.NOTYFIKACJA_EKIPA, W.FOTY, W.NAKLEJ_NALEPKE, W.OBGADAC,
                            W.NOTYFIKACJA_ALL_O_HANBIE, W.PRZEKONYWANIE_OTOCZENIA_PRZECIW,
                            W.UNIZA, W.LEKCEWAZY_INNYCH))),
                    M.MALY_WYSILEK(W.CISNIE),
                    M.DUZY_WYSILEK(W.WALKA_PIESCI), M.DUZY_WYSILEK(W.ZNISZCZENIE_WARTOSCI_MATERIALNEJ),
                    M.MALY_WYSILEK(W.SPRZET),
                    M.MALY_WYSILEK(M.MOCNO(W.STARCIE_WIELU_NA_JEDNEGO)), M.MALY_WYSILEK(M.MOCNO(W.PRZEWAGA_NA_BRAK_PRZEWAGI)),
                    M.MOCNO(of(W.WYKORZYSTANIE, W.OKRASC_PIENIADZE)),
                    M.DUZY_WYSILEK(W.ZAMYKANIE_OPCJI), M.MALY_WYSILEK(W.OGLUPIANIE), M.NEUTRALNY_RZUT(W.NIESWIADOMOSC),
                    M.DUZY_WYSILEK(W.ULTIMATUM), M.DUZY_WYSILEK(W.SWIADOMOSC), M.NEUTRALNY_RZUT(W.DOSTEP),
                    M.DUZY_WYSILEK(W.ZNISZCZENIE_PRZEWAGI),
                    M.MALY_WYSILEK(M.MOCNO(of(W.WSPARCIE_OSLONY, W.FALSZYWE_WRAZENIE, W.WYSOKIE_OCZEKIWANIE))),
                    M.MALY_WYSILEK(M.MOCNO(M.MIEJSCE_STALE(W.ODCIECIE_DOSTEPU_WARTOSC))),
                    W.AGRESJA_W_DZIALANIU, W.ZLO,
                    M.CEL(of(W.ZNISZCZENIE, W.POSTAWIENIE_CIEZKICH_WARUNKOW))
            )
    );

    public static WarunkiKategoria KURESTWO = new WarunkiKategoria(
            new Kategoria(TypKategoria.RANY, TypKategoria.KURESTWO),
            Arrays.asList(
                    M.MALY_WYSILEK(M.MOCNO(of(W.FOTY_MIEJSCE_STALE, W.NIE_MILA_OBSLUGA, W.ZLE_WYKONANIE_USLUGI))),
                    M.DUZY_WYSILEK(of(W.OGRANICZENIE_WOLNOSCI, W.KONTUZJA)),
                    W.ZABRAC_COS,
                    M.MALY_WYSILEK(of(W.INTERAKCJA_POLICJA, W.INTERAKCJA_ZAGRANICZNI, W.PUSZCZALSKOSC, W.ZDOLNOSC_KONFIDENTCTWO)),
                    M.DUZY_WYSILEK(of(W.KLUCENIE_RODZINY, W.ATAK_NA_CZLONKOW_RODZINY, W.ZAMACH_NA_ZYCIE)),
                    M.MALY_WYSILEK(M.MOCNO(of(W.LEKCEWAZY_MIEJSCE, W.LEKCEWAZY_OKOLICZNOSCI, W.LEKCEWAZY_OSOBY, W.LEKCEWAZY_WYSILEK))),
                    M.MALY_WYSILEK(M.MOCNO(W.WYKORZYSTUJE_BRAK_PRZEWAG)),
                    M.MALY_WYSILEK(M.MOCNO(W.DUZA_KRZYWDA_NA_PRZEWADZE)),
                    M.MALY_WYSILEK(of(W.GRZEBANIE_PRYWATNE, W.TRUCIZNA_DO_JEDZENIA)),
                    M.ODRAZU(W.ZLO), M.DOSWIADCZENIE(W.ZLO),
                    M.DEFAULT(M.ZLE_TRAKTOWANIE(W.OSOBA)), M.BRAK(W.WSTYD),
                    M.MOCNO(of(W.DAZENIE_DO_ZLA, W.SZUKANIE_GLEBOKO_ZLA, W.KAZDE_DZIALANIE_ZMIENIA_W_ZLO))
            )
    );

    public static WarunkiKategoria WYMAGA_KARY = new WarunkiKategoria(
            new Kategoria(TypKategoria.SONDA, TypKategoria.WYMAGA_KARY),
            Arrays.asList(
                    W.DZIALANIE_DLA_ZLA,
                    W.BRAK_WYSILKU, W.BRAK_STRESU, W.BRAK_TRUDNOSCI,
                    W.PRZEWAGI_OD_KOLYSKI, W.PRZYJEMNOSCI_OD_KOLYSKI,
                    W.KOMFORT, W.BEZPIECZENSTWO, W.MONOSRODOWISKO, W.WCZESNIE_ZWIAZEK,
                    W.NIEZDOLNY_WALKA_SPRZET, W.GLUPOTA, W.UZYWKI,
                    W.ZAJECIE_SIE_LOKALNYMI_SRPAWAMI, W.WSTYD
            )
    );

    public static WarunkiKategoria SONDA_DZIALACZA = new WarunkiKategoria(
            new Kategoria(TypKategoria.SONDA, TypKategoria.SONDA_DZIALACZA), of(
            W.ROZMIAR, W.PRZEWAGA_SILY, W.ZNAJOMOSCI,
            W.DZIALA, M.W_JAKI_SPOSOB(W.DZIALA),
            W.BIEGA, M.JAK_DLUGO(W.BIEGA),
            M.KOGO_ZNA(W.EKIPA),
            W.WYROK, M.JAK_DLUGO(W.WYROK),
            M.DOSWIADCZENIE(W.SPRZET)
    ));

    public static WarunkiKategoria SONDA_SHRTS = new WarunkiKategoria(
            new Kategoria(TypKategoria.SONDA, TypKategoria.SONDA_SHRTS), of(
            M.W(of(W.MEZCZYZNA),
                    of(
                            M.sonda(W.Z_KIM),
                            M.sonda(W.SWIADOMOSC), // 1: FEST
                            M.sonda(W.SILA_SPRAWCZA), // WPLYW: 0
                            M.sonda(W.ROZMIAR),
                            M.sonda(W.ZLO_DOBRO), // UZASADNIENIE: 0
                            M.sonda(W.WIEK),
                            M.sonda(W.CZY_CWEL), // NICNIEMOZE : 0
                            M.POROWNANIE(W.INNI),
                            M.sonda(W.SRODOWISKO),
//                            M.sonda(W.CZYNY_DZIALANIA)
                            M.sonda(W.GDZIE)
                    )
            )
    ));


    public static WarunkiKategoria ZACHETA_DO_ZLA = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZACHETA_DO_ZLA),
            Arrays.asList(
                    W.BEZKARNOSC, W.LEKCEWAZENIE, W.PYCHA, W.ZUCHWALOSC, W.POCZUCIE_WYZSZOSCI, W.HIERARCHIA,
                    W.PRZEWAGA, W.EMOCJE_ZE_ZLA, W.NARKOTYKI
            )
    );


    public static WarunkiKategoria METODA_STARCIE_REAKCJA = new WarunkiKategoria(
            new Kategoria(TypKategoria.RANY, TypKategoria.METODA_STARCIE_REAKCJA), of(

            M.W(M.MALY_WYSILEK(W.SPRZET), "--->", of(M.DUZA_KRZYWDA(W._1_RUCH), W.NAJWIEKSZ_STRACH,
                    M.DEFAULT(W.UCIECZKA),
                    M.DEFAULT_DZIALAJCY(of(W.SPRZET, W.NOTYFIKACJA_EKIPA)))),
            M.W(M.DUZY_WYSILEK(W.WALKA_PIESCI), "--->", of(M.DEFAULT(W.PODJECIE_WALKI),
                    M.DEFAULT_DZIALAJCY(of(W.PODJECIE_WALKI, W.SPRZET, W.NOTYFIKACJA_EKIPA)))),

            M.W(M.MALY_WYSILEK(W.CISNIE), "--->", of(M.DEFAULT(W.ODPOWIADA),
                    M.DEFAULT_DZIALAJCY(of(W.ODPOWIADA, W.WALKA_PIESCI, W.SPRZET, W.NOTYFIKACJA_EKIPA)))),

            M.W(M.MALY_WYSILEK(W.BLISKOSC), "--->", of(W.SONDA, M.DEFAULT(W.PATRZY),
                    M.DEFAULT_DZIALAJCY(of(W.PATRZY, W.ROZKMINIA, W.FOTY, W.NOTYFIKACJA_EKIPA,
                            M.OPCJA(W.CISNIE)))))
    ));

    public static WarunkiKategoria OBRONA_STARCIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.RANY, TypKategoria.OBRONA_STARCIE),
            Arrays.asList(
                    W.UCIECZKA,
                    W.PODJECIE_WALKI,
                    W.GAZ, W.OSTRY_SPRZET,
                    W.NOTYFIKACJA_EKIPA,
                    W.ROBIENIE_PRZYPALU
            )
    );

    public static WarunkiKategoria DEFAULT_WARUNKI = new WarunkiKategoria(
            new Kategoria(TypKategoria.DEFAULT_WARUNKI, TypKategoria.DEFAULT_WARUNKI),
            Arrays.asList(
                    W.RODZINA, W.MIEJSCE_ZAMIESZKANIA,
                    W.BRAK_ZNAJOMYCH, W.BRAK_ZWIAZKU, W.BRAK_PRACY,
                    W.BRAK_UKLADOW, W.BRAK_ZAKLECIA, W.BRAK_PRZEWAG,
                    W.POPED_SEXUALNY, W.MARZENIA, W.OCZEKIWANIA_WOBEC_ZYCIA,
                    W.CHARAKTER, W.CECHY_WRODZONE,
                    W.CZYSTE_SUMIENIE
            )
    );

    public static WarunkiKategoria STRATY_MORALNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.RANY, TypKategoria.STRATY_MORALNE),
            Arrays.asList(
                    W.OBRAZENIA_FIZYCZNE, W.ZLE_SAMOPOCZUCIE, W.HANBA, W.WYKLUCZENIE, W.STRATA_ZNAJOMYCH,
                    M.STRATA(W.ZNAJOMI), M.STRATA(W.KOBIETA)
            )
    );

    public static WarunkiKategoria STRATY_MATERIALNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.RANY, TypKategoria.STRATY_MATERIALNE),
            Arrays.asList(
                    M.STRATA(of(
                            W.PRACA, W.PIENIADZE, W.WYSOKA_POZYCJA,
                            W.CZAS, W.SZANSA, W.LUDZIE_ZA_TOBA, W.EKIPA,
                            W.SPRYT, W.SZYBKOSC, W.SILA
                    ))
            )
    );

    public static WarunkiKategoria TEMATY_NORMALNYCH_LUDZI = new WarunkiKategoria(
            new Kategoria(TypKategoria.TEMATY, TypKategoria.TEMATY_NORMALNYCH_LUDZI),
            Arrays.asList(
                    M.thread_while_loop(W.BRAK_EMOCJI), W.PRACA, W.SPORT, W.POGODA, W.SLUZBA_ZROWIA,
                    W.ZDROWIE, W.SAMOPOCZUCIE, W.NAUKA, M.OPCJA(W.DZIECI), W.RODZINA, W.DOM, W.NOWE_TECHNOLOGIE,
                    W.UBRANIA, W.USLUGI, W.EVENTY, W.AKTUALNE_WYDARZENIA_SWIATA, W.PODROZE, W.KULTURY_SWIATA,
                    W.GOTOWANIE, W.JEDZENIE, W.WOLNOSC
            )
    );

    public static WarunkiKategoria TEMATY_RDZENNYCH = new WarunkiKategoria(
            new Kategoria(TypKategoria.TEMATY, TypKategoria.TEMATY_RDZENNYCH),
            Arrays.asList(
                    M.thread_while_loop(W.EMOCJE),
                    M.MOCNO(of(
                            W.NIENAWISC, W.KIBICOWANIE, M.HIERARCHIA(W.ZNAJOMI), W.KLUB, W.MELANZ, W.UZYWKI,
                            W.STANDARD_ZACHOWANIA, M.OPCJA(W.DZIECI), W.PRZEWAGA, M.TOLERANCJA(M.REAKCJA_SMIECHEM(W.EMOCJE_ZE_ZLA))
                    )
            ))
    );

    public static WarunkiKategoria ANTY_DZIALACZ = new WarunkiKategoria(
            new Kategoria(TypKategoria.ANTY_DZIALACZ),
            Arrays.asList(
                    W._1_VS_1_STARCIE_BEZ_PRZEWAG
            )
    );

    public static WarunkiKategoria CECHY_RDZENNY = new WarunkiKategoria(
            new Kategoria(TypKategoria.ANTY_DZIALACZ),
            Arrays.asList(
                    W.WKURWIENIE_ZYCIEM, W.RYWALIZACJA, W.ZAZDROSC, W.CHRONIENIE_SWOJEGO,
                    W.NORMALNE_EMOCJE, W.REAKCJA, W.ZDOLNY_DO_WALKI, W.UMIE_CISNAC, W.UMIE_KLUCIC,
                    W.DAZENIE_DO_CELU,
                    W.WIEDZA_PRZEWAGI, W.WIEDZA_OSIAGANIE_PRZEWAG,
                    M.OPCJA(W.AGRESJA)
            )
    );

    public static WarunkiKategoria ULICA_PRZEWAGA_REAKCJA = new WarunkiKategoria(
            new Kategoria(TypKategoria.ULICA_PRZEWAGA_REAKCJA), of(
            M.W(W.SAMOCHOD, "--->", of(M.ZNISZCZENIE(W.OPONY), M.ZNISZCZENIE(W.KAROSERIA), M.OPCJA(M.PODPALENIE(W.SAMOCHOD)))),

            M.W(W.DYSTANS, "--->", W.SZYBKIE_NOGI),

            M.W(W.MIEJSCE_STALE, "--->", of(M.ZAGAZOWANIE(W.MIEJSCE_STALE), M.ZNISZCZENIE(W.WARTOSC))),

            M.W(of(W.ZNAJOMI, W.OSIEDLOWE_SRD), "--->", M.NOTIFY_ALL(W.HANBA)),

            M.W(of(W.INFORMACJA, W.CZAS, W.WIEDZA, W.BRAK_WSTYDU), "--->", of(W.KLAMSTWO, W.UKRYCIE, W.MAGICZNE_ZAKLECIE,
                    M.BRAK_DOSTEPU(W.ZLO), W.SAMOTNOSC)),

            M.W(W.EKIPA, "--->", of(M.WIEKSZY_DOSTEP(W.EKIPA), W.BRAK_SENSU, W.MALO_OSOB, M.BRAK(W.POSLUCH))),

            M.W(of(W.PIENIADZE, W.WYSOKA_POZYCJA), "--->", of(W.WYROK, M.STRATA(W.PRACA), M.STRATA(W.ZDROWIE))),

            M.W(W.BRAK_CIERPIENIA, "--->", M.PRZEZYCIE(W.CIERPIENIE)),

            M.W(of(M.ROZKMINIONY(W.OSOBA), W._88_,
                    W.NIE_KIBICUJE, W.Z_KOBIETA, W.LAMUS, W.DUZO_OSOB), "--->", M.ORIENT(W.CIERPIENIE).MIMO_TO(M.WALISZ())),

            M.W(of(M.OPPONENT(of(W.PRZEWAGA_SILY, W.SPRZET)), W._88_, M.WYSTEPUJE(W.WARTOSC)), "--->", M.MIMO_TO(M.WALISZ())),

            M.W(of(W.NOTYFIKACJA_EKIPA, W.FOTY), "--->", of(M.STRATA(M.ZNISZCZENIE(W.TELEFON)), W.WALKA_PIESCI)),

            M.W(W.GAZ, "--->", of(W.KOMIN_ANTY_GAZ, W.WALKA_PIESCI)),

            M.W(of(W.SPRYT, W.SZYBKOSC, W.SILNY, W.POTRAFI_OCENIC), "--->", of(W.UZYWKI, M.STRATA(W.ZDROWIE)))
    ));

    public static WarunkiKategoria ZACHOWANIE_REZULTAT_ULICA = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZACHOWANIE_REZULTAT_ULICA), of(

            M.W(of(M.NOTYFIKACJA(W.EKIPA), W.FOTY), "--->", of(M.DEFAULT(M.BRAK(W.REAKCJA)), M.INFORMACJA(W.EKIPA))),

            M.W(W.SPRZET, "--->", M.DEFAULT(of(M.WLASNA(W.OBRONA), M.UZYCIE(M.GDY(W.ZAGROZENIE)), M.NABYCIE(W.WARTOSC)))),

            M.W(M.ZNAJOMY(of(W.CISNIE, W.GADA)), "--->", M.ULTIMATIUM(W.ODPOWIADA)),

            M.W(M.OBCY(of(W.CISNIE, W.GADA)), "--->", of(W.NIC_NIE_ZNACZY, M.SZUKANIE(W.EMOCJE)))
    ));

    public static WarunkiKategoria METODY_POLICYJNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.METODY_POLICYJNE),
            Arrays.asList(
                    W.NOTYFIKACJA_EKIPA, W.OPISYWANIE_UBIORU, W.GAZ, W.FOTY_ROZPOZNANIE, M.thread_while_loop(W.KONTROLA)
            )
    );

    public static WarunkiKategoria WZGLEDNA_IZOLACJA = new WarunkiKategoria(
            new Kategoria(TypKategoria.KOBIETA_PRAKTYKA, TypKategoria.WZGLEDNA_IZOLACJA),
            Arrays.asList(
                    W.PRZYSTANEK, W.TRAUTO, W.SWIATLA, W.KLATKA, W.MIEJSCE_STALE, W.STACJA_BENZYNOWA, W.OSIEDLOWE_SRD
            )
    );

    public static WarunkiKategoria SPRZYJAJACE = new WarunkiKategoria(
            new Kategoria(TypKategoria.KOBIETA_PRAKTYKA, TypKategoria.SPRZYJAJACE),
            Arrays.asList(
                    W.PRETEKST, W.KONTEKST, W.NUDA,
                    W.WZGL_IZOLACJA, W.DLUGA_DOSTEPNOSC, W.BEZRUCH, W.OSZCZEDNOSC_CZASU, W.MALA_TRUDNOSC, W.MALY_WYSILEK, W.MALA_DROGA, W.MALY_PRZYPAL,
                    W.SAMA, W.Z_KOLEZANKA, W.Z_RODZINA
            )
    );

    public static WarunkiKategoria NIE_SPRZYJAJACE = new WarunkiKategoria(
            new Kategoria(TypKategoria.KOBIETA_PRAKTYKA, TypKategoria.NIE_SPRZYJAJACE),
            Arrays.asList(
                    W.PRETEKST, W.KONTEKST, W.NUDA,
                    W.WZGL_IZOLACJA, W.DLUGA_DOSTEPNOSC, W.BEZRUCH, W.OSZCZEDNOSC_CZASU, W.MALA_TRUDNOSC, W.MALY_WYSILEK, W.MALA_DROGA, W.MALY_PRZYPAL,
                    W.SAMA, W.Z_KOLEZANKA, W.Z_RODZINA
            )
    );

    public static WarunkiKategoria ESSENTIALS = new WarunkiKategoria(
            new Kategoria(TypKategoria.KOBIETA_PRAKTYKA, TypKategoria.ESSENTIALS),
            Arrays.asList(
                    W.DOSTEPNOSC, W.BLISKOSC, W.SZYBKOSC_CHODZENIA, W.INFORMACJA,
                    W.ZASIEG_WZROKU, W.ZASIEG_JEJ_WZROKU,
                    W.CZAS_START, W.CZAS_KONIEC,
                    W.SRODOWISKOWE, W.STALE, W.RESTRYKCYJNE
            )
    );

    public static WarunkiKategoria PLANSZA = new WarunkiKategoria(
            new Kategoria(TypKategoria.KOBIETA_PRAKTYKA, TypKategoria.PLANSZA),
            Arrays.asList(
                    W.DOSTEPNOSC, W.BLISKOSC, W.SZYBKOSC_CHODZENIA, W.INFORMACJA,
                    W.ZASIEG_WZROKU, W.ZASIEG_JEJ_WZROKU,
                    W.CZAS_START, W.CZAS_KONIEC,
                    W.SRODOWISKOWE, W.STALE, W.RESTRYKCYJNE
            )
    );

    public static WarunkiKategoria EXTREMALNE = new WarunkiKategoria(
            new Kategoria(TypKategoria.KOBIETA_PRAKTYKA, TypKategoria.EXTREMALNE),
            Arrays.asList(
                    W.UWAGA_NA_TOBIE, W.ROZWALENIE_CISZY,
                    W.IDZIESZ_ZAWRACASZ, W.PRZECIWNY_PRZYSTANEK, W.SIEDZISZ_PRZEJSCIE, W.ONA_SWOJE_GRONO
            )
    );

    public static WarunkiKategoria SLABY_TCHORZ = new WarunkiKategoria(
            new Kategoria(TypKategoria.SLABY_TCHORZ),
            Arrays.asList(
                    M.MALY_WYSILEK(M.MOCNO(M.PODSTAWA(of(W.UKRYCIE, W.KLAMSTWO, W.PO_CICHU)))),
                    M.MALY_WYSILEK(M.MOCNO(of(W.WDUPC_ZAKLECIEM, W.ZAMKNIJ_ZASOB, W.OSZUKANIE_WDUPCENIE, W.WYKLUCZENIE))),
                    M.MALY_WYSILEK(M.MOCNO(of(W.NOTYFIKACJA_EKIPA, W.FOTY, W.NAKLEJ_NALEPKE, W.OBGADAC,
                            W.NOTYFIKACJA_ALL_O_HANBIE, W.PRZEKONYWANIE_OTOCZENIA_PRZECIW,
                            W.UNIZA, W.LEKCEWAZY_INNYCH))),
                    M.MALY_WYSILEK(M.MOCNO(W.STARCIE_WIELU_NA_JEDNEGO)), M.MALY_WYSILEK(M.MOCNO(W.PRZEWAGA_NA_BRAK_PRZEWAGI)),
                    M.MOCNO(of(W.WYKORZYSTANIE, W.OKRASC_PIENIADZE)),
                    M.DUZY_WYSILEK(W.ZAMYKANIE_OPCJI), M.MALY_WYSILEK(W.OGLUPIANIE), M.NEUTRALNY_RZUT(W.NIESWIADOMOSC),
                    M.MALY_WYSILEK(M.MOCNO(of(W.WSPARCIE_OSLONY, W.FALSZYWE_WRAZENIE, W.WYSOKIE_OCZEKIWANIE))),
                    M.MALY_WYSILEK(M.MOCNO(M.MIEJSCE_STALE(W.ODCIECIE_DOSTEPU_WARTOSC)))
            )
    );

    public static WarunkiKategoria WADY_ZLYCH = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZLY, TypKategoria.WADY_ZLYCH),
            Arrays.asList(
                    W.UZYWKI, W.GLUPOTA, W.BRAK_SUMIENIA, W.KROTKOWZROCZNOSC, M.ROZKMINIONY_PRZEZ(W.CZYNY),
                    M.DOSTEP(W.ZLO), M.BRAK_DOSTEPU(W.DOBRO),
                    M.ZALEZNY_OD(W.PRZEWAGA), M.ZALEZNY_OD(W.EKIPA), W.ZYSK.OTHERWISE(W.BRAK_REAKCJI),
                    M.BOI_SIE(W.PRAWDA), M.BRAK_DOSWIADCZENIA(W.STARCIE_1_NA_1),
                    M.W(M.BRAK(W.PRZEWAGA), "--->", M.BRAK(W.DZIALANIE)),
                    M.BRAK(W.PRZYCHYLNOSC_BOGA),
                    M.WZAJEMNE(W.HAKI)
            )
    );

    public static WarunkiKategoria WSPOMNIENIA = new WarunkiKategoria(
            new Kategoria(TypKategoria.UNIWERSALNE_SWIAT, TypKategoria.WSPOMNIENIA),
            Arrays.asList(
                    W.OSOBY, W.SYTUACJE, W.KONTEKST, W.EMOCJE_DANEJ_CHWILI, W.POMIESZCZENIA, W.RZECZY, W.DROGA_DO, W.DROGA_POWROT
            )
    );

    public static WarunkiKategoria KONFRONTACJA = new WarunkiKategoria(
            new Kategoria(TypKategoria.RANY, TypKategoria.KTO_KOGO),
            Arrays.asList(
                    M.thread_while_loop(W.WYSILEK), M.thread_while_loop(W.KLOTNIA),
                    M.thread_while_loop(M.ORIENT(W.LUDZIE)), M.thread_while_loop(M.ORIENT(W.SPRZET)),
                    M.thread_while_loop(W.OBRAZENIA_FIZYCZNE)
            )
    );

    public static WarunkiKategoria OKAZJE_ZROBIENIE_ZLO = new WarunkiKategoria(
            new Kategoria(TypKategoria.OKAZJE_ZROBIENIE_ZLO),
            Arrays.asList(
                    W.OBECNOSC_LUDZI, W.BLISKOSC, W.POTRZEBA, W.USLUGI,
                    M.MOCNO(W.PRZEWAGA), M.MOCNO(M.OPPONENT(W.WARTOSC)), M.MOCNO(M.OPPONENT(W.BRAK_PRZEWAG)), M.MOCNO(W.LUDZIE_ZA_TOBA),
                    M.MOCNO(M.OPPONENT(W.NIESWIADOMOSC)), M.MOCNO(M.OPPONENT(M.BRAK_DOSTEPU(W.ZLO)))
            )
    );

    public static WarunkiKategoria OKAZJE_ZROBIENIE_DOBRO = new WarunkiKategoria(
            new Kategoria(TypKategoria.OKAZJE_ZROBIENIE_DOBRO),
            Arrays.asList(
                    W.BLISKOSC, M.WIDZISZ(W.ZLO), M.PRZEWIDZENIE(W.ZLO),
                    M.PO_SONDA(W.ZLY)
            )
    );

    public static WarunkiKategoria TYPY_LUDZI_SHRT = new WarunkiKategoria(
            new Kategoria(TypKategoria.TYPY_LUDZI_SHRT),
            Arrays.asList(
                    W.WYKOLEJONY, W.FEST, W.WIESNIAK, W.OSIEDLOWY_SLABY, W.NORMALNY, W.OSIEDLOWY_MOCNY, W.CZOLO
            )
    );

    public static WarunkiKategoria TYPY_LUDZI_DOBRE = new WarunkiKategoria(
            new Kategoria(TypKategoria.TYPY_LUDZI_DOBRE), of(
            W.LOKALNY,
            W.MLODY, W.SREDNI_WIEK,

            W.OSIEDLOWY_NORMAL, W.OSIEDLOWY_OGARNIETY,
            W.BIEGACZ, W.PATOLOG, W.DIL, W.ZLODZIEJ,
            W.WIECZNY_IMIGRANT,
            W.RDZENNY_GLUPI, W.RDZENNY_DOBRY,

            W.CZOLO, W.OGARNIECI, W.MOCNI_NIE_LICZACY_SIE,

            W.OSIEDLOWA_AGRESORKA, W.OSIEDLOWA_NORMALNA, W.OSIEDLOWA_DOBRA, W.OSIEDLOWA_SWIATOWA
    ));

    public static WarunkiKategoria TYPY_LUDZI_ZLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.TYPY_LUDZI_ZLE), of(
            W.STATYSTA, W.TURYSTA_ZAGRANICZNY,
            W.STARY,
            W.FEST, W.BANAN, W.WYGODNIS, W.BURZUJ_NIESWIADOMY, W.BURZUJ_DZIALACZ,
            W.OSIEDLOWY_SLABY, W.OSIEDLOWY_WYKRECONY, W.OSIEDLOWY_CASUAL, W.SPORTOWY_FEST,
            M.MLODE(M.CHETNE(W.PIONKI)),

            W.CZORT, W.OSIEDLOWA_KARYNA, W.OSIEDLOWA_KSIEZNICZKA,
            W.BURZUA, W.KUJONKA, W.ZBYT_WRAZLIWA, W.ZWYKLA_FEST, W.WIESNIARA,
            W.SWIATOWA_DOBRY_DOM
    ));

    public static WarunkiKategoria CISNIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.CISNIE), of(
            M.WYBOR(of(W.GLOSNO, W.CICHO)),

            W.CISNIE_WYGLAD, W.CISNIE_ZACHOWANIE,
            W.CISNIE_MOWA, W.CISNIE_WSPOMNIENIA,
            W.CISNIE_POWIAZANE
    ));

    public static WarunkiKategoria TYPY_SYTUACJI = new WarunkiKategoria(
            new Kategoria(TypKategoria.TYPY_SYTUACJI), of(
            W.SYTUACJA_UNIKALNA, W.SYTUACJA_CHCIANA, W.SYTUACJA_W_HOTMIEJSCU, W.SYTUACJA_DEFAULTOWA, W.SYTUACJA_RESTRYKCYJNA, W.SYTUACJA_KRYZYSOWA
    ));

    public static WarunkiKategoria SYTUACJE_STARCIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.SYTUACJE_STARCIE), of(
            M.SYTUACJA(W.PATRZY),
            M.SYTUACJA(of(W.PATRZY, W.CISNIE)),
            M.SYTUACJA(of(W.PATRZY, W.CISNIE, M.IDZIE(W.TWOJA_STRONA))),
            M.SYTUACJA(of(W.PATRZY, M.BIEGNIE(W.TWOJA_STRONA).CEL(W.WALKA_PIESCI))),
            M.SYTUACJA(of(W.PATRZY, M.BIEGNIE(W.TWOJA_STRONA).CEL(W.WALKA_SPRZET))),
            M.SYTUACJA(M.ROBI(W.FOTY)),
            M.SYTUACJA(M.IDZIE(W.ZWIADY)),
            M.SYTUACJA(M.IDZIE(W.ZWIADY).Z(W.OSLONA)),

            M.SYTUACJA(M.WIELU(W.PATRZY)),
            M.SYTUACJA(M.WIELU(of(W.PATRZY, W.CISNIE))),
            M.SYTUACJA(M.WIELU(of(W.PATRZY, W.CISNIE, M.IDZIE(W.TWOJA_STRONA)))),
            M.SYTUACJA(M.WIELU(of(W.PATRZY, M.BIEGNIE(W.TWOJA_STRONA).CEL(W.WALKA_PIESCI)))),
            M.SYTUACJA(M.WIELU(of(W.PATRZY, M.BIEGNIE(W.TWOJA_STRONA).CEL(W.WALKA_SPRZET)))),
            M.SYTUACJA(M.WIELU(M.ROBI(W.FOTY))),
            M.SYTUACJA(M.WIELU(M.IDZIE(W.ZWIADY))),
            M.SYTUACJA(M.WIELU(M.IDZIE(W.ZWIADY).Z(W.OSLONA)))
    ));

    public static List<WarunkiKategoria> ZLY_DOBRY = Arrays.asList(
            PRZYCZYNY_SLUZENIA_ZLU,
            PRZYCZYNY_SLUZENIA_DOBRU,
            ZACHETA_DO_ZLA,
            NIESPRAWIEDLIWOSC,
            DOBRE_CZYNY,
            ZLE_CZYNY,
            ANTY_DZIALACZ,
            WADY_ZLYCH,
            OKAZJE_ZROBIENIE_ZLO,
            OKAZJE_ZROBIENIE_DOBRO,
            ZLY_ZNAKI_ROZPOZNAWCZE
    );

    public static List<WarunkiKategoria> GLOBAL_PLANSZA = Arrays.asList(
            GLOBAL_PLANSZA_LUDZIE,
            GLOBAL_PLANSZA_PRACA
    );

    public static List<WarunkiKategoria> WARTOSCI_OCENA_WROG = Arrays.asList(
            WARTOSC_ZLA,
            WARTOSC_DOBRA,
            OCENIA_WEDLUG,
            KRYTERIA_WROGA,
            NASTAWIENIA
    );

    public static List<WarunkiKategoria> ZASADY_PRZYMUS_ZAGROZENIA = Arrays.asList(
            ZASADY,
            PRZYMUS,
            ZAGROZENIA,
            OSLONY,
            KURESTWO,
            METODY_POLICYJNE
    );

    public static List<WarunkiKategoria> TWL_PRZEWAGI_SLABOSCI_CIERPIENIA_POTRZEBY = Arrays.asList(
            THREAD_WHILE_LOOP,
            PRZEWAGI,
            SLABOSCI,
            CIERPIENIA,
            POTRZEBY,
            OSLONY,
            DEFAULT_WARUNKI,
            CECHY_RDZENNY,
            SLABY_TCHORZ
    );

    public static List<WarunkiKategoria> REAKCJE = Arrays.asList(
            WYMUSZENIE_REAKCJI,
            REAKCJA
    );

    public static List<WarunkiKategoria> SONDA = Arrays.asList(
            SONDA_GDY,
            SONDA_PO,
            KOGO,
            WYMAGA_KARY,
            SONDA_DZIALACZA,
            SONDA_SHRTS
    );

    public static List<WarunkiKategoria> CZAS = Arrays.asList(
            CYKL_DNIA,
            PLAN,
            ERA,
            SPEDZANIE_CZASU
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

    public static List<WarunkiKategoria> KSZTALTOWANIE = Arrays.asList(
            KSZTALTOWANIE_DZIELNICY,
            KSZTALTOWANIE_CZLOWIEKA
    );

    public static List<WarunkiKategoria> RANY = Arrays.asList(
            RANY_PSYCHICZNE,
            RANY_FIZYCZNE,
            RANY_ZNECANIE_SIE,
            RANY_SPRZET,
            RANY_DOSTEPOWE,
            KTO_KOGO,
            KURESTWO,
            OBRONA_STARCIE,
            METODA_STARCIE_REAKCJA,
            ULICA_PRZEWAGA_REAKCJA,
            KONFRONTACJA
    );

    public static List<WarunkiKategoria> TYPY_PRAC = Arrays.asList(
            PRACA_FIZYCZNA,
            PRACA_HANDEL,
            PRACA_WYMAGAJACA_UMIEJETNOSCI,
            PRACA_USLUGI,
            PRACA_OSWIATA,
            PRACA_TRANSPORT,
            PRACA_TECHNICZNA_UMYSLOWA
    );

    public static List<WarunkiKategoria> TEMATY = Arrays.asList(
            TEMATY_NORMALNYCH_LUDZI,
            TEMATY_RDZENNYCH
    );

    public static List<WarunkiKategoria> KOBIETA_PRAKTYKA = Arrays.asList(
            WZGLEDNA_IZOLACJA,
            SPRZYJAJACE,
            NIE_SPRZYJAJACE,
            ESSENTIALS,
            PLANSZA,
            EXTREMALNE
    );

    public static List<WarunkiKategoria> UNIWERSALNE_SWIAT = Arrays.asList(
            WSPOMNIENIA
    );

    public static List<WarunkiKategoria> LUDZIE = Arrays.asList(
            TYPY_LUDZI_SHRT,
            TYPY_LUDZI_DOBRE,
            TYPY_LUDZI_ZLE
    );

    public static List<WarunkiKategoria> SYTUACJE = Arrays.asList(
            TYPY_SYTUACJI,
            SYTUACJE_STARCIE
    );
}