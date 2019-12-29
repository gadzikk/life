package db;

import typy_bazowe.TypKategoria;
import warunek.Warunek;
import warunek.WarunkiKategoria;
import z_inne.Kategoria;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 28.12.19.
 */
public class DB_Warunki {

    WarunkiKategoria WYMAGANIA_WSTEPNE_SWIAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.SWIAT),
            Arrays.asList(
                    Warunek.ZWIAZEK_2_OSOB,
                    Warunek.URODZENIE_SIE,
                    Warunek.ZDROWIE,
                    Warunek.BYT_MATERIALNY)
    );

    WarunkiKategoria WYMAGANIA_WSTEPNE_INFORMACJA = new WarunkiKategoria(
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

    WarunkiKategoria WYMAGANIA_WSTEPNE_WIEDZA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.WIEDZA),
            Arrays.asList(
                    Warunek.INFORMACJA,
                    Warunek.PRZYCZYNA,
                    Warunek.SKUTEK,
                    Warunek.WNIOSKI
            )
    );

    WarunkiKategoria WYMAGANIA_WSTEPNE_BRAKWSTYDU = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.BRAKWSTYDU),
            Arrays.asList(
                    Warunek.INFORMACJA,
                    Warunek.WIEDZA,
                    Warunek.DZIALANIE
            )
    );

    WarunkiKategoria WYMAGANIA_WSTEPNE_REZULTAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.REZULTAT),
            Arrays.asList(
                    Warunek.DZIALANIE,
                    Warunek.KONSEKWENCJE,
                    Warunek.WNIOSKI,
                    Warunek.REZULTAT
            )
    );

    WarunkiKategoria WYMAGANIA_WSTEPNE_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.NIEKARALNOSC,
                    Warunek.WYKSZTALCENIE,
                    Warunek.DOSWIADCZENIE,
                    Warunek.UMIEJETNOSCI,
                    Warunek.ZNAJOMOSCI
            )
    );

    WarunkiKategoria WYMAGANIA_WSTEPNE_PRACA_RESTRYKCYJNA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.PRACA_RESTRYKCYJNA),
            Arrays.asList(
                    Warunek.NIEKARALNOSC,
                    Warunek.STUDIA,
                    Warunek.KILKA_LAT_DOSWIADCZENIA,
                    Warunek.WIELE_UMIEJETNOSCI,
                    Warunek.Z_POLECENIA
            )
    );

    WarunkiKategoria WYMAGANIA_WSTEPNE_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.ZARABIANIE),
            Arrays.asList(
                    Warunek.UMOWA_PRACA,
                    Warunek.WYKONYWANIE_PRACY
            )
    );

    WarunkiKategoria WYMAGANIA_WSTEPNE_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.SPORT),
            Arrays.asList(
                    Warunek.CZAS,
                    Warunek.SPRAWNOSC,
                    Warunek.ZDOLNOSC_DO_WYSILKU,
                    Warunek.EKWIPUNEK,
                    Warunek.ZGODA_OTOCZENIA
            )
    );

    WarunkiKategoria WYMAGANIA_WSTEPNE_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_WSTEPNE, TypKategoria.OSIEDLE),
            Arrays.asList(
                    Warunek.TO_SAMO_MIASTO,
                    Warunek.DOBRZE_WYGLADA,
                    Warunek.ZNAJOMY_W_SRODOWISKU,
                    Warunek.NIE_PRZECIWNY,
                    Warunek.NIE_KONFI
            )
    );

    WarunkiKategoria WYMAGANIA_WSTEPNE_DOPUSZCZENIE = new WarunkiKategoria(
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

    WarunkiKategoria WYMAGANIA_WSTEPNE_KOBIETA = new WarunkiKategoria(
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

    WarunkiKategoria WYMAGANIA_UTRZYMANIA_SWIAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.SWIAT),
            Arrays.asList(
                    Warunek.ZNAJOMI,
                    Warunek.SWOJ_ZWIAZEK,
                    Warunek.UNIKANIE_ZAGROZEN,
                    Warunek.DBANIE_ZDROWIE,
                    Warunek.ZARABIANIE)
    );

    WarunkiKategoria WYMAGANIA_UTRZYMANIA_INFORMACJA = new WarunkiKategoria(
            new Kategoria(
                    TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.INFORMACJA),
            Arrays.asList(
                    Warunek.SLEDZENIE_INFORMACJI,
                    Warunek.REZULTAT_INFORMACJI,
                    Warunek.POTWIERDZENIE_Z_KIMS,
                    Warunek.SPRAWDZENIE_SAMEMU
            )
    );

    WarunkiKategoria WYMAGANIA_UTRZYMANIA_WIEDZA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.WIEDZA),
            Arrays.asList(
                    Warunek.ODSWIEZANIE,
                    Warunek.PAMIEC,
                    Warunek.ULEPSZANIE,
                    Warunek.DZIELENIE_SIE_WIEDZA
            )
    );

    WarunkiKategoria WYMAGANIA_UTRZYMANIA_BRAKWSTYDU = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.BRAKWSTYDU),
            Arrays.asList(
                    Warunek.LEPSZE_WYKORZYSTANIE_INFORMACJI,
                    Warunek.LEPSZE_DZIALANIE,
                    Warunek.WNIOSKI
            )
    );

    WarunkiKategoria WYMAGANIA_UTRZYMANIA_REZULTAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.REZULTAT),
            Arrays.asList(
                    Warunek.LEPSZE_DZIALANIE,
                    Warunek.UNIKNIECIE_KONSEKWENCJI,
                    Warunek.PRZEWIDYWANIE,
                    Warunek.REZULTAT,
                    Warunek.UTRZYMANIE
            )
    );

    WarunkiKategoria WYMAGANIA_UTRZYMANIA_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.WYSILEK,
                    Warunek.UZYTECZNOSC,
                    Warunek.OPLACA,
                    Warunek.PLUS_GT_MINUS
            )
    );

    WarunkiKategoria WYMAGANIA_UTRZYMANIA_PRACA_RESTRYKCYJNA = new WarunkiKategoria(
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

    WarunkiKategoria WYMAGANIA_UTRZYMANIA_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.ZARABIANIE),
            Arrays.asList(
                    Warunek.BOGATY_SEKTOR,
                    Warunek.WIEDZA,
                    Warunek.NISZA,
                    Warunek.REGION
            )
    );

    WarunkiKategoria WYMAGANIA_UTRZYMANIA_SPORT = new WarunkiKategoria(
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

    WarunkiKategoria WYMAGANIA_UTRZYMANIA_OSIEDLE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMAGANIA_UTRZYMANIA, TypKategoria.OSIEDLE),
            Arrays.asList(
                    Warunek.CZESTO_Z_CELEM,
                    Warunek.DZIALANIE,
                    Warunek.ZACIESNIENIE_GRONA_ZNAJOMYCH,
                    Warunek.STO_PRO_LOJALNY,
                    Warunek.PRZESTRZEGANIE_ZASAD
            )
    );

    WarunkiKategoria WYMAGANIA_UTRZYMANIA_DOPUSZCZENIE = new WarunkiKategoria(
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

    WarunkiKategoria WYMAGANIA_UTRZYMANIA_KOBIETA = new WarunkiKategoria(
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

    WarunkiKategoria WARUNKI_KONCOWE_SWIAT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.SWIAT),
            Arrays.asList(
                    Warunek.SZCZESCIE,
                    Warunek.DOSWIADCZENIA,
                    Warunek.WSPOMNIENIA
            )
    );

    WarunkiKategoria WARUNKI_KONCOWE_PRACA = new WarunkiKategoria(
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

    WarunkiKategoria WARUNKI_KONCOWE_ZARABIANIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.ZARABIANIE),
            Arrays.asList(
                    Warunek.MOZLIWOSC_WYBORU
            )
    );

    WarunkiKategoria WARUNKI_KONCOWE_SPORT = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.SPORT),
            Arrays.asList(
                    Warunek.SPRAWNOSC,
                    Warunek.UMIEJETNOSCI,
                    Warunek.WIEDZA
            )
    );

    WarunkiKategoria WARUNKI_KONCOWE_OSIEDLE = new WarunkiKategoria(
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

    WarunkiKategoria WARUNKI_KONCOWE_KOBIETA = new WarunkiKategoria(
            new Kategoria(TypKategoria.WARUNKI_KONCOWE, TypKategoria.KOBIETA),
            Arrays.asList(
                    Warunek.CODZIENNA_BLISKOSC,
                    Warunek.ZYCIE_RAZEM,
                    Warunek.DZIECI
            )
    );

    List<WarunkiKategoria> WARUNKI_KONCOWE = Arrays.asList(
            WARUNKI_KONCOWE_SWIAT,
            WARUNKI_KONCOWE_PRACA,
            WARUNKI_KONCOWE_ZARABIANIE,
            WARUNKI_KONCOWE_SPORT,
            WARUNKI_KONCOWE_OSIEDLE,
            WARUNKI_KONCOWE_KOBIETA
    );

    WarunkiKategoria PRZYCZYNY_ZLA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PRZYCZYNY_ZLA),
            Arrays.asList(
                    Warunek.ZLE_GENY,
                    Warunek.GLUPOTA,
                    Warunek.NIESWIADOMOSC,
                    Warunek.DZIALANIE_ZA_NAMOWA
            )
    );

    WarunkiKategoria PRZYCZYNY_DOBRA = new WarunkiKategoria(
            new Kategoria(TypKategoria.PRZYCZYNY_DOBRA),
            Arrays.asList(
                    Warunek.MADROSC,
                    Warunek.WYCHOWANIE,
                    Warunek.WYKONYWANIE_PRACY
            )
    );

    WarunkiKategoria WARTOSC = new WarunkiKategoria(
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

    WarunkiKategoria GLOBAL_PLANSZA_LUDZIE = new WarunkiKategoria(
            new Kategoria(TypKategoria.GLOBAL_PLANSZA, TypKategoria.LUDZIE),
            Arrays.asList(
                    Warunek.DZIETNOSC,
                    Warunek.WYCHOWANIE,
                    Warunek.MIESZKANIE
            )
    );

    WarunkiKategoria GLOBAL_PLANSZA_PRACA = new WarunkiKategoria(
            new Kategoria(TypKategoria.GLOBAL_PLANSZA, TypKategoria.PRACA),
            Arrays.asList(
                    Warunek.FIRMY_NIEWYMAGAJACE_DOSWIADCZENIE,
                    Warunek.FIRMY_WYMAGAJACE_DOSWIADCZENIE,
                    Warunek.RYNEK_PLAC,
                    Warunek.ZASOBY_LUDZKIE
            )
    );

    WarunkiKategoria OCENIA_WEDLUG = new WarunkiKategoria(
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

    WarunkiKategoria THREAD_WHILE_LOOP = new WarunkiKategoria(
            new Kategoria(TypKategoria.THREAD_WHILE_LOOP),
            Arrays.asList(
                    Warunek.THREAD_WHILE_LOOP_ZASIEG_WZROKU,
                    Warunek.THREAD_WHILE_LOOP_BLISKOSC_U,
                    Warunek.THREAD_WHILE_LOOP_BLISKOSC_K,
                    Warunek.THREAD_WHILE_LOOP_EFEKTYWNA_GADKA
            )
    );

    WarunkiKategoria PRZEWAGI = new WarunkiKategoria(
            new Kategoria(TypKategoria.PRZEWAGI),
            Arrays.asList(
                    Warunek.ZNAJOMI, Warunek.OSIEDLOWE_SRD, Warunek.KOBIETA,
                    Warunek.SZANSA_ZNAJOMI, Warunek.SZANSA_OSIEDLOWE_SRD, Warunek.SZANSA_KOBIETA,
                    Warunek.INFORMACJA, Warunek.CZAS, Warunek.WIEDZA, Warunek.BRAK_WSTYDU,
                    Warunek.LUDZIE_ZA_TOBA, Warunek.WALKA_PIESCI, Warunek.WALKA_SPRZET,
                    Warunek.UMIEJETNOSC,
                    Warunek.PRACA, Warunek.PIENIADZE,
                    Warunek.WYSOKA_POZYCJA
            )
    );

    WarunkiKategoria ZAGROZENIA = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZAGROZENIA),
            Arrays.asList(
                    Warunek.STRATA_WOLNOSCI, Warunek.STRATA_CZASU, Warunek.STRATA_INFORMACJI, Warunek.STRATA_WIEDZY,
                    Warunek.STRATA_DOSTEPU_PLANSZA, Warunek.STRATA_DOSTEPU_ZNAJOMI, Warunek.STRATA_MIEJSCA_W_HIERARCHII, Warunek.STRATA_POZYCJI,
                    Warunek.STRATA_ZDROWIA, Warunek.STRATA_HONORU,
                    Warunek.STRATA_PRACY, Warunek.STRATA_PIENIEDZY, Warunek.STRATA_ZARABIANIA, Warunek.STRATA_WYKSZTALCENIA,
                    Warunek.STRATA_KOBIETY
            )
    );

    WarunkiKategoria ZASADY = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZASADY),
            Arrays.asList(
                    Warunek.PRAWO, Warunek.NIE_KONFI, Warunek.NIE_PRZECIWNA
            )
    );

    WarunkiKategoria POTRZEBY = new WarunkiKategoria(
            new Kategoria(TypKategoria.POTRZEBA),
            Arrays.asList(
                    Warunek.KONTAKTU, Warunek.AKCEPTACJI, Warunek.DOBRYCH_JEDNOSTKEK, Warunek.ZWIAZKU, Warunek.ZROZUMIENIA,
                    Warunek.HIGIENY, Warunek.UBRANIA, Warunek.RELIGII, Warunek.ROZRYWKI, Warunek.RUCHU
            )
    );

    WarunkiKategoria PRZYMUS = new WarunkiKategoria(
            new Kategoria(TypKategoria.PRZYMUS),
            Arrays.asList(
                    Warunek.JEDZENIE, Warunek.PICIE, Warunek.PRACA, Warunek.EDUKACJA, Warunek.PRZEMIESZCZANIE_SIE,
                    Warunek.TRANSPORT, Warunek.KUPNO_PRODUKTOW
            )
    );

    WarunkiKategoria NIESPRAWIEDLIWOSC = new WarunkiKategoria(
            new Kategoria(TypKategoria.NIESPRAWIEDLIWOSC),
            Arrays.asList(
                    Warunek.PRACA_XCZASU_BRAK_REZULATU, Warunek.WDUPCANIE_WYSILKU_DO_PIECA,
                    Warunek.NADUZYWANIE_WYSOKIEJ_POZYCJI, Warunek.GORZEJ_NA_STARCIE, Warunek.PRZEWAGA_NA_STARCIE,
                    Warunek.STRONNICZOSC, Warunek.WYKLUCZENIE
            )
    );

    WarunkiKategoria DOBRY = new WarunkiKategoria(
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

    WarunkiKategoria ZLY = new WarunkiKategoria(
            new Kategoria(TypKategoria.ZLY),
            Arrays.asList(
                    Warunek.MARNOWANIE_CZASU, Warunek.POZBAWIANIE_UMIEJETNOSCI, Warunek.POZBAWIANIE_WIEDZY, Warunek.POZBAWIANIE_SILY,
                    Warunek.OGLUPIANIE, Warunek.WDUPCANIE_W_ZLE_WARUNKI, Warunek.ZAMYKANIE_OPCJI, Warunek.PRZEKONYWANIE_PRZECIW,
                    Warunek.PRZEKONYWANIE_ZA, Warunek.POLECENIE,
                    Warunek.KLAMSTWO, Warunek.AGRESJA,
                    Warunek.ODUZENIE,
                    Warunek.GLUPOTA,
                    Warunek.NOWY_DEFAULT_RYWAL,
                    Warunek.JEBIE_DOBRO, Warunek.WYMAGA_PRZEWAG_NA_ZLU
            )
    );

    WarunkiKategoria WYMUSZENIE_REAKCJI = new WarunkiKategoria(
            new Kategoria(TypKategoria.WYMUSZENIE_REAKCJI),
            Arrays.asList(
                    Warunek.KONTEKST, Warunek.OSKARZENIE, Warunek.ULTIMATUM, Warunek.CISNIECIE
            )
    );

    WarunkiKategoria REAKCJA = new WarunkiKategoria(
            new Kategoria(TypKategoria.REAKCJA),
            Arrays.asList(
                    Warunek.BRAK_ODPOWIEDZI, Warunek.PRZESTRASZENIE_SIE, Warunek.UCIECIE,
                    Warunek.ODPOWIEDZ_ODCZEP, Warunek.ODPOWIEDZ_NEUTRAL, Warunek.ODPOWIEDZ_ZAINTERESOWANIE,
                    Warunek.EKSCYTACJA, Warunek.PRZEJCIE_INICJATYWY
            )
    );

    WarunkiKategoria SONDA_GDY = new WarunkiKategoria(
            new Kategoria(TypKategoria.SONDA, TypKategoria.SONDA_GDY),
            Arrays.asList(
                    Warunek.WIDZISZ, Warunek.MOWI, Warunek.ROBI, Warunek.POSIADA
            )
    );

    WarunkiKategoria SONDA_PO = new WarunkiKategoria(
            new Kategoria(TypKategoria.SONDA, TypKategoria.SONDA_PO),
            Arrays.asList(
                    Warunek.OCZY, Warunek.REAGOWANIE, Warunek.CHODZENIE, Warunek.POSTURA, Warunek.ZACHOWANIE,
                    Warunek.MOWA, Warunek.ZNAJOMI
            )
    );

    WarunkiKategoria KRYTERIA_WROGA = new WarunkiKategoria(
            new Kategoria(TypKategoria.KRYTERIA_WROGA),
            Arrays.asList(
                    Warunek.PRZECIWNA_RASA, Warunek.PRZECIWNY_NAROD, Warunek.PRZECIWNA_KLASA, Warunek.PRZECIWNY_KLUB,
                    Warunek.PRZECIWNA_STRONA, Warunek.ZASZKODZIL
            )
    );

    List<WarunkiKategoria> INNE = Arrays.asList(
            PRZYCZYNY_ZLA,
            PRZYCZYNY_DOBRA,
            WARTOSC,
            GLOBAL_PLANSZA_LUDZIE,
            GLOBAL_PLANSZA_PRACA,
            OCENIA_WEDLUG,
            THREAD_WHILE_LOOP,
            PRZEWAGI,
            ZAGROZENIA,
            ZASADY,
            POTRZEBY,
            PRZYMUS,
            NIESPRAWIEDLIWOSC,
            DOBRY,
            ZLY,
            WYMUSZENIE_REAKCJI,
            REAKCJA,
            SONDA_GDY,
            SONDA_PO,
            KRYTERIA_WROGA
    );
}