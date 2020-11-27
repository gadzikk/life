package db;

import metoda.M;
import warunek.W;

import java.util.Arrays;
import java.util.List;

/**
 * Created by gadzik on 28.12.19.
 */
public class DBW extends DB {
    public static List<W> ZBIOR_ZLY_DOBRY = Arrays.asList(
            PRZYCZYNY_ZLA(),
            PRZYCZYNY_DOBRA(),
            ZACHETA_DO_ZLA(),
            NIESPRAWIEDLIWOSC(),
            DOBRE_CZYNY(),
            ZLE_CZYNY(),
            ANTY_DZIALACZ_ZLA(),
            WADY_ZLYCH(),
            OKAZJE_ZROBIENIE_ZLO(),
            OKAZJE_ZROBIENIE_DOBRO(),
            ZLY_ZNAKI_ROZPOZNAWCZE()
    );

    public static List<W> ZBIOR_GLOBAL_PLANSZA = Arrays.asList(
            GLOBAL_PLANSZA_LUDZIE(),
            GLOBAL_PLANSZA_PRACA()
    );

    public static List<W> ZBIOR_WARTOSCI_OCENA_WROG = Arrays.asList(
            WARTOSC_ZLA(),
            WARTOSC_DOBRA(),
            OCENIA_WEDLUG(),
            KRYTERIA_WROGA(),
            NASTAWIENIA(),
            KONTROLA()
    );

    public static List<W> ZBIOR_ZASADY_PRZYMUS_ZAGROZENIA = Arrays.asList(
            ZASADY(),
            PRZYMUS(),
            ZAGROZENIA(),
            OSLONY(),
            METODY_POLICYJNE(),
            BLEDY()
    );

    public static List<W> ZBIOR_TWL_PRZEWAGI_SLABOSCI_CIERPIENIA_POTRZEBY = Arrays.asList(
            THREAD_WHILE_LOOP(),
            PRZEWAGI(),
            SLABOSCI(),
            CIERPIENIA(),
            POTRZEBY(),
            OSLONY(),
            DEFAULT_WARUNKI(),
            CECHY_RDZENNY(),
            SLABY_TCHORZ()
    );

    public static List<W> ZBIOR_REAKCJE = Arrays.asList(
            REAKCJE(),
            WYMUSZENIE_REAKCJI(),
            REAKCJA_KOBIET()
    );

    public static List<W> ZBIOR_SONDA = Arrays.asList(
            SONDA_GDY(),
            SONDA_PO(),
            SONDA_KOGO(),
            WYMAGA_KARY(),
            SONDA_DZIALACZA(),
            SONDA_SHRTS(),
            SONDA_PRZYCZYN()
    );

    public static List<W> ZBIOR_CZAS = Arrays.asList(
            CYKL_DNIA(),
            PLAN_TERMIN(),
            ERA(),
            POZYTECZNE_SPEDZANIE_CZASU()
    );

    public static List<W> ZBIOR_ROZRYWKI_ZART = Arrays.asList(
            ROZRYWKI(),
            ZART(),
            SPORT()
    );

    public static List<W> ZBIOR_EMOCJE_UCZUCIA = Arrays.asList(
            EMOCJE_NEGATYWNE(),
            EMOCJE_POZYTYWNE(),
            UCZUCIA_NEGATYWNE(),
            UCZUCIA_POZYTYWNE()
    );

    public static List<W> ZBIOR_ZDOBYWANIE_WIEDZY_PIENIEDZY = Arrays.asList(
            ZAROBEK_NIELEGALNY()
    );

    public static List<W> ZBIOR_KSZTALTOWANIE = Arrays.asList(
            KSZTALTOWANIE_DZIELNICY(),
            KSZTALTOWANIE_CZLOWIEKA(),
            SILNE_WIEZY_CZLOWIEKA()
    );

    public static List<W> ZBIOR_RANY = Arrays.asList(
            RANY_PSYCHICZNE(),
            RANY_FIZYCZNE(),
            RANY_ZNECANIE_SIE(),
            RANY_SPRZET(),
            RANY_DOSTEPOWE(),
            KRZYWDY(),
            KRZYWDY_BEZPOSREDNIE(),
            KRZYWDY_POSREDNIE(),
            BRAK_ZASAD(),
            OBRONA_STARCIE(),
            METODA_STARCIE_REAKCJA(),
            ULICA_PRZEWAGA_SPOSOB(),
            KONFRONTACJA(),
            WALKA(),
            ZASIEG_PRZEWAGI_ULICA()
    );

    public static List<W> ZBIOR_TYPY_PRAC = Arrays.asList(
            PRACA_FIZYCZNA(),
            PRACA_HANDEL(),
            PRACA_WYMAGAJACA_UMIEJETNOSCI(),
            PRACA_USLUGI(),
            PRACA_OSWIATA(),
            PRACA_TRANSPORT(),
            PRACA_TECHNICZNA_UMYSLOWA()
    );

    public static List<W> ZBIOR_TEMATY = Arrays.asList(
            TEMATY_NORMALNYCH_LUDZI(),
            TEMATY_RDZENNYCH()
    );

    public static List<W> ZBIOR_KOBIETA_PRAKTYKA = Arrays.asList(
            WZGLEDNA_IZOLACJA(),
            SPRZYJAJACE(),
            NIE_SPRZYJAJACE(),
            ESSENTIALS_SYTUACJE(),
            PLANSZA(),
            EXTREMALNE_SYTUACJE()
    );

    public static List<W> ZBIOR_UNIWERSALNE_SWIAT = Arrays.asList(
            WSPOMNIENIA(),
            RELACJE()
    );

    public static List<W> ZBIOR_TYPY_LUDZI = Arrays.asList(
            TYPY_LUDZI_SHRT(),
            TYPY_LUDZI_DOBRE(),
            TYPY_LUDZI_ZLE()
    );

    public static List<W> ZBIOR_SYTUACJE = Arrays.asList(
            TYPY_SYTUACJI(),
            SYTUACJE_STARCIE()
    );

    public static List<W> ZBIOR_WIEDZA = Arrays.asList(
            RODZAJE_WIEDZA(),
            WYMAGANIA_WSTEPNE_WIEDZA(),
            WYMAGANIA_UTRZYMANIA_WIEDZA()
    );

    public static List<W> ZBIOR_DOPUSZCZENIE = Arrays.asList(
            WYMAGANIA_WSTEPNE_DOPUSZCZENIE_KOBIETA(),
            WYMAGANIA_UTRZYMANIA_DOPUSZCZENIE_KOBIETA(),
            WARUNKI_KONCOWE_DOPUSZCZENIE_KOBIETA()
    );

    public static List<W> ZBIOR_PRZEWAGI = Arrays.asList(
            PRZEWAGI(),
            PRZEWAGI_LUDZKIE(),
            PRZEWAGI_Z_ULICY(),
            PRZEWAGI_MATERIALNE(),
            PRZEWAGI_DANEJ_CHWILI()
    );

    public static List<W> ZBIOR_MIEJSCE = Arrays.asList(
            TYPY_MIEJSC()
    );


    public static W WYMAGANIA_WSTEPNE_SWIAT() {
        return on(
                    W.ZWIAZEK_2_OSOB,
                    W.URODZENIE_SIE,
                    W.ZDROWIE,
                    W.BYT_MATERIALNY
        );
    }

    public static W WYMAGANIA_WSTEPNE_INFORMACJA(){
        return on(
                    W.CZAS,
                    W.DOSTEP_DO_PLANSZY,
                    W.OBECNOSC,
                    W.LUDZIE,
                    W.SONDA,
                    W.SZCZEGOLY
         );
    }

    public static W WYMAGANIA_WSTEPNE_WIEDZA() {
        return on(
                M.CALY_CZAS(M.OBSERWACJA(of(W.ULICA, W.MIEJSCA_RESTRYKCYJNE))),
                M.OCZY(W.INFORMACJA), M.USZY(W.INFORMACJA), M.PRAKTYKA(W.DOSWIADCZENIA),
                W.PRZYCZYNA, W.DZIALANIE, W.REZULTAT, W.WNIOSKI, W.ZAPAMIETANIE,
                M.OTRZYMANIE(W.WIEDZA).OD(of(W.SRODOWISKO, W.RODZINA))
        );
    }

    public static W WYMAGANIA_WSTEPNE_BRAKWSTYDU() {
        return on(
                    W.INFORMACJA,
                    W.WIEDZA,
                    W.DZIALANIE
            );
    }

    public static W WYMAGANIA_WSTEPNE_REZULTAT() {
        return on(
                    W.DZIALANIE,
                    W.KONSEKWENCJE,
                    W.WNIOSKI,
                    W.REZULTAT
        );
    }

    public static W WYMAGANIA_WSTEPNE_PRACA() {
            return on(
                    W.NIEKARALNOSC,
                    W.WYKSZTALCENIE,
                    W.DOSWIADCZENIE,
                    W.UMIEJETNOSCI,
                    W.ZNAJOMOSCI
            );
    }

    public static W WYMAGANIA_WSTEPNE_PRACA_RESTRYKCYJNA() {
        return on(
                W.NIEKARALNOSC,
                W.STUDIA,
                W.KILKA_LAT_DOSWIADCZENIA,
                W.WIELE_UMIEJETNOSCI,
                W.Z_POLECENIA
        );
    }


    public static W WYMAGANIA_WSTEPNE_ZARABIANIE() {
        return on(
                W.SPELNIENIE_WYMAGAN,
                W.ODZEW_HR,
                W.POZYTYWNY_FEEDBACK_INTERVIEW,
                W.WYGRANIE_Z_KONKURENTAMI,
                W.SCREENING_POZYTYWNY,

                W.UMOWA_PRACA,
                W.WYKONYWANIE_PRACY
        );
    }

    public static W WYMAGANIA_WSTEPNE_SPORT() {
        return on(
                W.CZAS,
                W.SPRAWNOSC,
                W.ZDOLNOSC_DO_WYSILKU,
                W.EKWIPUNEK,
                W.ZGODA_OTOCZENIA
        );
    }

    public static W WYMAGANIA_WSTEPNE_OSIEDLE() {
        return on(
                W.TO_SAMO_MIASTO,
                W.DOBRZE_WYGLADA,
                W.ZNAJOMY_W_SRODOWISKU,
                W.NIE_PRZECIWNY,
                W.NIE_KONFI
        );
    }

    public static W WYMAGANIA_WSTEPNE_DOPUSZCZENIE_KOBIETA() {
        return on(
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
        );
    }

    public static W WYMAGANIA_WSTEPNE_KOBIETA() {
        return on(
                W.STWORZENIE_SZANSY,
                W.ZLAPANIE_SZANSY,
                W.POZNANIE,
                W.DOPUSZCZENIE,

                W.PARZONKO_XKILKA,
                W.SPODOBANIE_SIE,

                W.PLUS_GT_MINUS,
                W.WOLNA
        );
    }

    public static List<W> KATEGORIA_WYMAGANIA_WSTEPNE = Arrays.asList(
            WYMAGANIA_WSTEPNE_SWIAT(),
            WYMAGANIA_WSTEPNE_INFORMACJA(),
            WYMAGANIA_WSTEPNE_WIEDZA(),
            WYMAGANIA_WSTEPNE_BRAKWSTYDU(),
            WYMAGANIA_WSTEPNE_REZULTAT(),
            WYMAGANIA_WSTEPNE_PRACA(),
            WYMAGANIA_WSTEPNE_PRACA_RESTRYKCYJNA(),
            WYMAGANIA_WSTEPNE_ZARABIANIE(),
            WYMAGANIA_WSTEPNE_SPORT(),
            WYMAGANIA_WSTEPNE_OSIEDLE(),
            WYMAGANIA_WSTEPNE_DOPUSZCZENIE_KOBIETA(),
            WYMAGANIA_WSTEPNE_KOBIETA()
    );

    public static W WYMAGANIA_UTRZYMANIA_SWIAT() {
        return on(
                W.ZNAJOMI,
                W.SWOJ_ZWIAZEK,
                W.UNIKANIE_ZAGROZEN,
                W.DBANIE_ZDROWIE,
                W.ZARABIANIE
        );
    }

    public static W WYMAGANIA_UTRZYMANIA_INFORMACJA() {
        return on(
                W.SLEDZENIE_INFORMACJI,
                W.REZULTAT_INFORMACJI,
                W.POTWIERDZENIE_Z_KIMS,
                W.SPRAWDZENIE_SAMEMU
        );
    }

    public static W WYMAGANIA_UTRZYMANIA_WIEDZA() {
        return on(
                W.ODSWIEZANIE,
                W.PAMIEC,
                W.ULEPSZANIE,
                M.PRZEKAZYWANIE(M.SLOWO_PISANE(W.WIEDZA)),
                M.PRZEKAZYWANIE(M.SLOWO_MOWIONE(W.WIEDZA)),
                W.DZIELENIE_SIE_WIEDZA
        );
    }

    public static W WYMAGANIA_UTRZYMANIA_BRAKWSTYDU() {
        return on(
                W.LEPSZE_WYKORZYSTANIE_INFORMACJI,
                W.LEPSZE_DZIALANIE,
                W.WNIOSKI
        );
    }

    public static W WYMAGANIA_UTRZYMANIA_REZULTAT() {
        return on(
                W.LEPSZE_DZIALANIE,
                W.UNIKNIECIE_KONSEKWENCJI,
                W.PRZEWIDYWANIE,
                W.REZULTAT,
                W.UTRZYMANIE
        );
    }

    public static W WYMAGANIA_UTRZYMANIA_PRACA() {
        return on(
                W.WYSILEK,
                W.UZYTECZNOSC,
                W.OPLACA,
                W.PLUS_GT_MINUS
        );
    }

    public static W WYMAGANIA_UTRZYMANIA_PRACA_RESTRYKCYJNA() {
        return on(
                W.PRZESTRZEGANIE_ZASAD,
                W.ATMOSFERA,
                W.WYSILEK,
                W.UZYTECZNOSC,
                W.REZULTATY,
                W.OPLACA,
                W.RELACJE_Z_PRZELOZONY,
                W.ULEPSZANIE_UMIEJETNOSCI,
                W.PLUS_GT_MINUS
        );
    }

    public static W WYMAGANIA_UTRZYMANIA_ZARABIANIE() {
        return on(
                W.BOGATY_SEKTOR,
                W.WIEDZA,
                W.NISZA,
                W.REGION
        );
    }

    public static W WYMAGANIA_UTRZYMANIA_SPORT() {
        return on(
                W.ULEPSZANIE_UMIEJETNOSCI,
                W.CZAS,
                W.SPRAWNOSC,
                W.ZDOLNOSC_DO_WYSILKU,
                W.EKWIPUNEK,
                W.ZGODA_OTOCZENIA
        );
    }

    public static W WYMAGANIA_UTRZYMANIA_OSIEDLE() {
        return on(
                W.CZESTO_Z_CELEM,
                W.DZIALANIE,
                W.ZACIESNIENIE_GRONA_ZNAJOMYCH,
                W.STO_PRO_LOJALNY,
                W.PRZESTRZEGANIE_ZASAD
        );
    }

    public static W WYMAGANIA_UTRZYMANIA_DOPUSZCZENIE_KOBIETA() {
        return on(
                W.DOBRZE_ZNA,
                W.WSPOLNI_ZNAJOMI,
                W.BEZPIECZENSTWO,
                W.EMOCJE,
                W.PODOBA_SIE,
                W.PLUS_GT_MINUS
        );
    }

    public static W WYMAGANIA_UTRZYMANIA_KOBIETA() {
        return on(
                W.SPELNIENIE_OCZEKIWAN,
                W.WSPIERANIE_PREFERENCJI,
                W.ODKRYWANIE_SWIATA,
                W.SPEDZANIE_CZASU,
                W.WIERNOSC,
                W.ZGODA_OTOCZENIA,

                W.PILNOWANIE,
                W.KONTROLA
        );
    }

    public static List<W> KATEGORIA_WYMAGANIA_UTRZYMANIA = Arrays.asList(
            WYMAGANIA_UTRZYMANIA_SWIAT(),
            WYMAGANIA_UTRZYMANIA_INFORMACJA(),
            WYMAGANIA_UTRZYMANIA_WIEDZA(),
            WYMAGANIA_UTRZYMANIA_BRAKWSTYDU(),
            WYMAGANIA_UTRZYMANIA_REZULTAT(),
            WYMAGANIA_UTRZYMANIA_PRACA(),
            WYMAGANIA_UTRZYMANIA_PRACA_RESTRYKCYJNA(),
            WYMAGANIA_UTRZYMANIA_ZARABIANIE(),
            WYMAGANIA_UTRZYMANIA_SPORT(),
            WYMAGANIA_UTRZYMANIA_OSIEDLE(),
            WYMAGANIA_UTRZYMANIA_DOPUSZCZENIE_KOBIETA(),
            WYMAGANIA_UTRZYMANIA_KOBIETA()
    );

    public static W WARUNKI_KONCOWE_SWIAT() {
        return on(
                W.SZCZESCIE,
                W.DOSWIADCZENIA,
                W.WSPOMNIENIA
        );
    }

    public static W WARUNKI_KONCOWE_PRACA() {
        return on(
                W.PIENIADZE,
                W.STABILIZACJA,
                W.BEZPIECZENSTWO,
                W.POZOSTANIE_W_KRAJU,
                W.UMIEJETNOSCI,
                W.WIEDZA
        );
    }

    public static W WARUNKI_KONCOWE_ZARABIANIE() {
        return on(
                W.MOZLIWOSC_WYBORU
        );
    }

    public static W WARUNKI_KONCOWE_SPORT() {
        return on(
                W.SPRAWNOSC,
                W.UMIEJETNOSCI,
                W.WIEDZA
        );
    }

    public static W WARUNKI_KONCOWE_OSIEDLE() {
        return on(
                W.ZNAJOMI,
                W.SRODOWISKO,
                W.KOBIETA,
                W.SILNE_JEDNOSTKI,
                W.THREAD_WHILE_LOOP_BLISKOSC_U,
                W.OSZCZEDNOSC_CZASU,
                W.AKCEPTACJA,
                W.LATWY_DOSTEP_PRZEWAGI
        );
    }

    public static W WARUNKI_KONCOWE_KOBIETA() {
        return on(
                W.CODZIENNA_BLISKOSC,
                W.ZYCIE_RAZEM,
                W.DZIECI
        );
    }

    public static W WARUNKI_KONCOWE_WIEDZA() {
        return on(
                W.TRAFNE_DECYZJE,
                W.DOBRZE_WYKORZYSTANY_CZAS
        );
    }

    public static W WARUNKI_KONCOWE_DOPUSZCZENIE_KOBIETA() {
        return on(
                W.ZWIAZEK
        );
    }

    public static List<W> KATEGORIA_WARUNKI_KONCOWE = Arrays.asList(
            WARUNKI_KONCOWE_SWIAT(),
            WARUNKI_KONCOWE_PRACA(),
            WARUNKI_KONCOWE_ZARABIANIE(),
            WARUNKI_KONCOWE_SPORT(),
            WARUNKI_KONCOWE_OSIEDLE(),
            WARUNKI_KONCOWE_KOBIETA(),
            WARUNKI_KONCOWE_WIEDZA(),
            WARUNKI_KONCOWE_DOPUSZCZENIE_KOBIETA()
    );

    public static W PRZYCZYNY_ZLA() {
        return on(
                W.ZLE_GENY, W.GLUPOTA, W.NIESWIADOMOSC, W.DZIALANIE_ZA_NAMOWA,
                W.ROZKAZ, W.ULTIMATUM_OD_SILNIEJSZYCH,

                W.ZLE_W_ZYCIU, M.NIE_DOSTRZEGA(M.SILA_SPRAWCZA(W.DOBRO)),
                W.NASTAWIENIE_JA_GNOJONY_GNOJE_NIZSZYCH, W.NASTAWIENIE_MAM_ZLE_ON_TEZ_MUSI, W.NASTAWIENIE_NIE_MAM_NIC_ON_TEZ_MA_NIE_MIEC,
                M.MOCNO(W.ZAZDROSC), M.MOCNO(W.CHCIWOSC), M.MOCNO(W.DOMINACJA),
                W.PIENIADZE, W.POTRZEBA_PARTNERA,
                W.KOMFORT, W.PRZYJEMNOSC, W.WARTOSC_MATERIALNA, W.MONOPOL_ZLA, W.SRODOWISKO,
                W.BRAK_OPCJI, W.NUDA, W.ZNAJOMOSCI, W.PRZEWAGA_SILY,
                W.POTRZEBA_WSPARCIA, W.POTRZEBA_AKCEPTACJI, W.POTRZEBA_EMOCJI,
                W.MODA, W.IDEA, M.NIEZDOLNOSC(W.DOBRO),
                W.UZALEZNIENIE, W.NIENAWISC
        );
    }

    public static W PRZYCZYNY_DOBRA() {
        return on(
                M.MOCNO(M.WAZNE(of(
                        W.MADROSC, W.WYCHOWANIE, W.WYKONYWANIE_PRACY,
                        W.DOBRO_W_SERCU, W.SUMIENIE, W.CIERPIENIE_OD_ZLYCH
                        ))
                );
    }

    public static W WARTOSC_DOBRA() {
        return on(
                W.SRODOWISKO,
                W.ZASADY,
                W.UMIEJETNOSCI,
                W.SPORT,
                W.WSPIERANIE_SWOJEJ_KLASY,
                W.DZIECI,
                W.CHLOP,
                W.RODZINA
        );
    }

    public static W WARTOSC_ZLA() {
        return on(
                W.WYGODY,
                W.ROZRYWKI,
                W.PIENIADZE,
                W.IDEA,
                W.NAUKA,
                W.MODA,
                W.BECZKA,
                W.KOLEZANKI,
                W.WRAZLIWOSC
        );
    }

    public static W GLOBAL_PLANSZA_LUDZIE() {
        return on(
                W.DZIETNOSC,
                W.WYCHOWANIE,
                W.MIESZKANIE
        );
    }

    public static W GLOBAL_PLANSZA_PRACA() {
        return on(
                W.POPYT, W.POTRZEBA,
                W.FIRMY_NIEWYMAGAJACE_DOSWIADCZENIE,
                W.FIRMY_WYMAGAJACE_DOSWIADCZENIE,
                W.RYNEK_PLAC,
                W.ZASOBY_LUDZKIE
        );
    }

    public static W OCENIA_WEDLUG() {
        return on(
                W.ZLO,
                W.DOBRO,
                W.PODOBIENSTWO,
                W.ZYSK,
                W.EKIPA,
                W.PRZEWAGA,
                W.UMIEJETNOSC
        );
    }

    public static W THREAD_WHILE_LOOP() {
        return on(
                W.THREAD_WHILE_LOOP_ZASIEG_WZROKU,
                W.THREAD_WHILE_LOOP_BLISKOSC_U,
                W.THREAD_WHILE_LOOP_BLISKOSC_K,
                W.THREAD_WHILE_LOOP_EFEKTYWNA_GADKA
        );
    }

    public static W PRZEWAGI() {
        return on(
                W.INFORMACJA, W.CZAS, W.WIEDZA, W.SWIADOMOSC, W.BRAK_WSTYDU, W.OBECNOSC, M.OBECNOSC(W.UJSCIE),
                M.WAZNE(of(W.ODWAGA, W.SILNA_PSYCHIKA)), W.PRACOWITOSC, W.UMIE_OCENIC, W.UMIE_KLAMAC, W.NIE_POKAZUJE_EMOCJI,
                W.CIERPLIWOSC, W.DALEKOWZROCZNOSC_CZYNOW, W.MADROSC, W.WIEDZA, W.PAMIEC, W.PRAWDA, W.DOBRO, W.TRZEZWOSC, W.DOSWIADCZENIA,
                W.PELNIA_SIL, W.NIEZALEZNOSC, W.SILA_SPRAWCZA,
                W.ZNAJOMI, W.WSPARCIE, W.OSIEDLOWE_SRD, W.WZGLEDNA_IZOLACJA_RDZENNI, M.SRODOWISKO(W.WSZYSCY_DANY_OBSZAR_SIE_ZNAJA),
                W.KOBIETY_SRODOWISKO, W.CIAGLOSC_INFORMACJI, W.KOBIETA, W.SAMOCHOD, M.PO_ZNAJOMOSCI(W.PRACA), M.SRODOWISKO(W.EMOCJE),
                M.SRODOWISKO(W.PRZYJEMNOSCI), M.MECZ(W.JEDEN_KLUB_KIBICOWSKI), W.HASLO_RDZENNYCH, M.DOSTEP(W.UZYWKI),
                M.SZANSA_NA(of(W.ZNAJOMI, W.WSPARCIE, W.OSIEDLOWE_SRD, W.WZGLEDNA_IZOLACJA_RDZENNI, M.SRODOWISKO(W.WSZYSCY_DANY_OBSZAR_SIE_ZNAJA),
                        W.KOBIETY_SRODOWISKO, W.CIAGLOSC_INFORMACJI, W.KOBIETA, M.PO_ZNAJOMOSCI(W.PRACA), M.SRODOWISKO(W.EMOCJE),
                        M.SRODOWISKO(W.PRZYJEMNOSCI), M.MECZ(W.JEDEN_KLUB_KIBICOWSKI), W.HASLO_RDZENNYCH, M.DOSTEP(W.UZYWKI))),
                W.ROZMIAR, W.SILA_FIZYCZNA, W.SILNE_UDERZENIE, W.ZAPASY, W.OBRONA, W.ZDOLNI_DO_WALKI_ZNAJOMI,
                W.LUDZIE_ZA_TOBA, W.WALKA_PIESCI, W.WALKA_SPRZET, M.SPRZET(M.EKIPA(W.SAMOCHOD_NA_CHODZIE)), M.SPRZET(M.EKIPA(W.MIEJSCE)),
                W.EKIPA, M.BLISKO(W.EKIPA), W.ROWER, W.ZASLONIETA_TWARZ, W.HASLO_RDZENNYCH, W.PIERWSZENSTWO,
                W.UMIEJETNOSC,
                W.PRACA, W.PIENIADZE,
                W.WYSOKA_POZYCJA,
                W.SPRYT, W.SZYBKOSC, W.SILNY, W.POTRAFI_OCENIC,
                W.PRZEZYCIE_CIERPIENIA
        );
    }

    public static W PRZEWAGI_Z_ULICY() {
        return on(
                W.ZNAJOMI, W.WSPARCIE, W.OSIEDLOWE_SRD, W.WZGLEDNA_IZOLACJA_RDZENNI, M.SRODOWISKO(W.WSZYSCY_DANY_OBSZAR_SIE_ZNAJA),
                W.KOBIETY_SRODOWISKO, W.CIAGLOSC_INFORMACJI, W.WALKA_SPRZET, M.PO_ZNAJOMOSCI(W.PRACA), M.SRODOWISKO(W.EMOCJE),
                M.SRODOWISKO(W.PRZYJEMNOSCI), M.MECZ(W.JEDEN_KLUB_KIBICOWSKI), W.HASLO_RDZENNYCH,
                M.SZANSA_NA(of(W.ZNAJOMI, W.WSPARCIE, W.OSIEDLOWE_SRD, W.WZGLEDNA_IZOLACJA_RDZENNI, M.SRODOWISKO(W.WSZYSCY_DANY_OBSZAR_SIE_ZNAJA),
                        W.KOBIETY_SRODOWISKO, W.CIAGLOSC_INFORMACJI, W.WALKA_SPRZET, M.PO_ZNAJOMOSCI(W.PRACA), M.SRODOWISKO(W.EMOCJE),
                        M.SRODOWISKO(W.PRZYJEMNOSCI), M.MECZ(W.JEDEN_KLUB_KIBICOWSKI), W.HASLO_RDZENNYCH, M.DOSTEP(W.UZYWKI))),
                W.ZDOLNI_DO_WALKI_ZNAJOMI,
                W.LUDZIE_ZA_TOBA, W.WALKA_PIESCI, M.SPRZET(M.EKIPA(W.SAMOCHOD_NA_CHODZIE)), M.SPRZET(M.EKIPA(W.MIEJSCE)),
                W.EKIPA, M.BLISKO(W.EKIPA), W.HASLO_RDZENNYCH, W.PIERWSZENSTWO
        );
    }

    public static W PRZEWAGI_LUDZKIE() {
        return on(
                W.INFORMACJA, W.CZAS, W.WIEDZA, W.SWIADOMOSC, W.BRAK_WSTYDU, W.OBECNOSC, M.OBECNOSC(W.UJSCIE),
                M.WAZNE(of(W.ODWAGA, W.SILNA_PSYCHIKA)), W.PRACOWITOSC, W.UMIE_OCENIC, W.UMIE_KLAMAC, W.NIE_POKAZUJE_EMOCJI,
                W.CIERPLIWOSC, W.DALEKOWZROCZNOSC_CZYNOW, W.MADROSC, W.WIEDZA, W.PAMIEC, W.PRAWDA, W.DOBRO, W.TRZEZWOSC,
                W.PELNIA_SIL, W.NIEZALEZNOSC, W.SILA_SPRAWCZA,
                W.WALKA_PIESCI, W.WALKA_SPRZET, W.ZASLONIETA_TWARZ,
                W.UMIEJETNOSC,
                W.SPRYT, W.SZYBKOSC, W.SILNY, W.POTRAFI_OCENIC,
                W.PRZEZYCIE_CIERPIENIA
        );
    }

    public static W PRZEWAGI_MATERIALNE() {
        return on(
                W.KOBIETA, W.SAMOCHOD, W.PRACA, W.PIENIADZE, W.WYSOKA_POZYCJA
        );
    }

    public static W PRZEWAGI_DANEJ_CHWILI() {
        return on(
                W.SZYBKOSC, W.SPRYT, W.SILA, W.POTRAFI_OCENIC, W.ILOSC_OSOB
        );
    }

    public static W SLABOSCI() {
        return on(
                M.BRAK(of(W.INFORMACJA, W.CZAS, W.WIEDZA, W.SWIADOMOSC, W.BRAK_WSTYDU, W.OBECNOSC, M.OBECNOSC(W.UJSCIE))),
                W.TCHORZOSTWO, W.SLABA_PSYCHIKA, W.LENISTWO, W.NIEUMIE_OCENIC, W.NIE_UMIE_KLAMAC, W.POKAZUJE_EMOCJE,
                W.AGRESJA, W.KROTKOWZROCZNOSC_CZYNOW, W.GLUPOTA, W.BRAK_WIEDZY, W.SLABA_PAMIEC, W.KLAMSTWO, W.ZLO, W.UZYWKI, M.BRAK(W.DOSWIADCZENIA),
                W.ZMECZENIE, W.PODPORZADKOWANIE, W.SLUZENIE,
                M.BRAK(of(W.ZNAJOMI, W.WSPARCIE, W.OSIEDLOWE_SRD, W.KOBIETY_SRODOWISKO, W.CIAGLOSC_INFORMACJI, W.KOBIETA, W.SAMOCHOD)),
                M.BRAK_SZANS(of(W.ZNAJOMI, W.WSPARCIE, W.OSIEDLOWE_SRD, W.KOBIETY_SRODOWISKO, W.KOBIETA)),

                M.BRAK(of(W.ROZMIAR, W.SILA_FIZYCZNA, W.SILNE_UDERZENIE, W.ZAPASY, W.OBRONA, W.ZDOLNI_DO_WALKI_ZNAJOMI,
                        W.LUDZIE_ZA_TOBA, W.WALKA_PIESCI, W.WALKA_SPRZET, M.SPRZET(M.EKIPA(W.SAMOCHOD_NA_CHODZIE)), M.SPRZET(M.EKIPA(W.MIEJSCE)),
                        W.EKIPA, M.BLISKO(W.EKIPA), W.ROWER, W.ZASLONIETA_TWARZ, W.HASLO_RDZENNYCH, W.PIERWSZENSTWO,
                        W.UMIEJETNOSC,
                        W.PRACA, W.PIENIADZE,
                        W.PRZEZYCIE_CIERPIENIA
                )),
                W.SLABA_POZYCJA,
                W.TEMPOTA, W.POWOLNY, W.SLABY
        );
    }

    public static W CIERPIENIA() {
        return on(
                W.ZMECZENIE, W.CIERPIENIE_FIZYCZNE, W.CIERPIENIE_PSYCHICZNE,
                W.CIERPIENIE_PRZEMIJANIA, W.CIERPIENIE_UTRATY, W.CIERPIENIE_SAMOTNOSCI,
                W.CIERPIENIE_WIDZENIE_BRAK_DOTKNIECIA,
                M.DLUGOTRWALE(of(
                        W.ZMECZENIE, W.CIERPIENIE_FIZYCZNE, W.CIERPIENIE_PSYCHICZNE,
                        W.CIERPIENIE_PRZEMIJANIA, W.CIERPIENIE_UTRATY, W.CIERPIENIE_SAMOTNOSCI,
                        W.CIERPIENIE_WIDZENIE_BRAK_DOTKNIECIA
                ))
        );
    }


    public static W ZAGROZENIA() {
        return on(
                W.STRATA_WOLNOSCI, W.STRATA_CZASU, W.STRATA_INFORMACJI, W.STRATA_WIEDZY,
                W.STRATA_DOSTEPU_PLANSZA, W.STRATA_DOSTEPU_ZNAJOMI, W.STRATA_MIEJSCA_W_HIERARCHII, W.STRATA_POZYCJI,
                W.STRATA_ZDROWIA, W.STRATA_HONORU,
                W.STRATA_PRACY, W.STRATA_PIENIEDZY, W.STRATA_ZARABIANIA, W.STRATA_WYKSZTALCENIA,
                W.STRATA_KOBIETY, W.ROZWOD, W.ALIMENTY
        );
    }

    public static W ZASADY() {
        return on(
                W.NIE_KONFI, W.NIE_PRZECIWNA_STRONA,
                W.OBCY_WALIMY,
                W.NIEGADAJ_Z_OBCYMI, W.NIEGADAJ_SPOZA_TERYTORIUM,
                W.KTO_NIEBIEGA_TUBA,
                W.JEDNOSC_PRZECIW_ZAZDROSCI,
                M.BRAK(M.INTERAKCJA(of(W.POLICJA, W.ZAGRANICZNI))), W.PRAWO,
                W.R1_HOLD_YOUR_POSITION, W.R2_ONLY_ONE_CHANCE_TO_SCORE,
                W.R3_LIFE_IN_YOUR_HANDS_NOT_LORDS, W.R4_WATCH_YOUR_ACTIONS,
                W.SPRAWIEDLIWA_WALKA, W.SPRAWIEDLIWA_RYWALIZACJA
        );
    }

    public static W POTRZEBY() {
        return on(
                W.KONTAKTU, W.AKCEPTACJI, W.DOBRYCH_JEDNOSTKEK, W.ZWIAZKU, W.ZROZUMIENIA,
                W.HIGIENY, W.UBRANIA, W.RELIGII, W.ROZRYWKI, W.RUCHU
        );
    }

    public static W OSLONY() {
        return on(
                W.NIESWIADOMOSC_OPPONENTA, W.DYSTANS, M.WOKOL_TYLKO(W.SWOI), W.NIE_KIBICUJE,

                W.MIEJSCE_STALE, W.PRACA, W.LAMUS, W.DUZO_OSOB, W.KOBIETA, W.Z_KOBIETA, W.Z_RODZINA,
                W.SAMOCHOD, W.CHLOPAK, W.DOSTEP_RESTRYKTOWANY, W.EKIPA,

                W.PRZEWAGA_SILY, W.SPRZET
        );
    }

    public static W PRZYMUS() {
        return on(
                W.JEDZENIE, W.PICIE, W.PRACA, W.EDUKACJA, W.PRZEMIESZCZANIE_SIE,
                W.TRANSPORT, W.KUPNO_PRODUKTOW, W.WALKA
        );
    }

    public static W NIESPRAWIEDLIWOSC() {
        return on(
                W.PRACA_XCZASU_BRAK_REZULATU, W.WDUPCANIE_WYSILKU_DO_PIECA,
                W.NADUZYWANIE_WYSOKIEJ_POZYCJI, W.GORZEJ_NA_STARCIE, W.PRZEWAGA_NA_STARCIE,
                W.STRONNICZOSC, W.WYKLUCZENIE
        );
    }

    public static W DOBRE_CZYNY() {
        return on(
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
        );
    }

    public static W ZLE_CZYNY() {
        return on(
                M.LATWO(W.ZLE_WYCHOWANIE), M.LATWO(M.WSPARCIE(W.ZLO)),
                M.LATWO(W.OGLUPIANIE), M.LATWO(W.CZYNIENIE_SWIATA_GORSZYM),

                W.MARNOWANIE_CZASU, W.POZBAWIANIE_UMIEJETNOSCI, W.POZBAWIANIE_WIEDZY, W.POZBAWIANIE_SILY,
                W.WDUPCANIE_W_ZLE_WARUNKI, W.ZAMYKANIE_OPCJI, W.PRZEKONYWANIE_PRZECIW,
                W.PRZEKONYWANIE_ZA, W.POLECENIE,
                W.KLAMSTWO, W.AGRESJA_FIZYCZNA, W.AGRESJA_PSYCHICZNA,
                W.ODUZENIE,
                W.GLUPOTA,
                W.NOWY_DEFAULT_RYWAL,
                W.NISZCZENIE_DOBRA, W.WYMAGA_PRZEWAG_NA_ZLU,
                W.SKAZYWANIE_SAMOTNOSC, W.SKAZYWANIE_PUSTKA
        );
    }

    public static W WYMUSZENIE_REAKCJI() {
        return on(
                W.KONTEKST, W.OSKARZENIE, W.ULTIMATUM, W.CISNIECIE
        );
    }

    public static W REAKCJA_KOBIET() {
        return on(
                W.BRAK_ODPOWIEDZI, W.PRZESTRASZENIE_SIE, W.UCIECIE,
                W.ODPOWIEDZ_ODCZEP, W.ODPOWIEDZ_NEUTRAL, W.ODPOWIEDZ_ZAINTERESOWANIE,
                W.EKSCYTACJA, W.PRZEJCIE_INICJATYWY
        );
    }

    public static W SONDA_GDY() {
        return on(
                W.WIDZISZ, W.MOWI, W.ROBI, W.POSIADA
        );
    }


    public static W SONDA_PO() {
        return on(
                W.OCZY, W.REAGOWANIE, W.CHODZENIE, W.POSTURA, W.ZACHOWANIE,
                W.MOWA, W.ZNAJOMI, W.CZYNY
        );
    }

    public static W KRYTERIA_WROGA() {
        return on(
                W.PRZECIWNA_RASA, W.PRZECIWNY_NAROD, W.PRZECIWNA_KLASA_SPOLECZNA, W.PRZECIWNY_KLUB,
                W.PRZECIWNA_STRONA, W.ZASZKODZIL
        );
    }

    public static W PLAN_TERMIN() {
        return on(
                W.CYKL_DNIA, W.DZIEN, W.TYDZIEN, W.MIESIAC, W.TRZY_MIESIACE, W.POL_ROKU,
                W.ROK
        );
    }

    public static W ZART() {
        return on(
                W.UKAZANIE_OSOBY_W_KOMICZNEJ_SYTUACJI, W.WYOLBRZYMIENIE, W.ZAMIANA,
                W.RZECZYWISTOSC_ODBIEGAJACA_OD_NORMY
        );
    }

    public static W ERA() {
        return on(
                W.PONIZEJ_1900, W.OD_1900_DO_1939, W.OD_1939_DO_1945, W.OD_1945_DO_1953,
                W.OD_1953_DO_1970, W.OD_1970_DO_1990, W.OD_1990_DO_2000, W.OD_2000_DO_2005,
                W.OD_2005_DO_2011, W.OD_2011_DO_2016, W.OD_2016_DO_TERAZ
        );
    }

    public static W ROZRYWKI() {
        return on(
                W.MUZYKA, W.TANIEC, W.TELEWIZJA, W.PRZYJEMNA_ROZMOWA, W.GRY,
                W.ODUZENIE
        );
    }

    public static W EMOCJE_NEGATYWNE() {
        return on(
                W.STRACH, W.LEK, W.ADRENALINA, W.NIEPOKOJ, W.TESKNOTA, W.SAMOTNOSC,
                W.GNIEW, W.ZLOSC, W.ROZPACZ, W.SMUTEK, W.ZAZDROSC,
                W.AGRESJA_FIZYCZNA, W.AGRESJA_PSYCHICZNA
        );
    }

    public static W EMOCJE_POZYTYWNE() {
        return on(
                W.SZCZESCIE, W.RADOSC, W.KONTEMPLACJA, W.SPELNIENIE,
                W.SPOKOJ, W.CIEKAWOSC, W.ZASKOCZENIE, W.PODNIECENIE
        );
    }

    public static W UCZUCIA_NEGATYWNE() {
        return on(
                W.ZREZYGNOWANIE, W.POCZUCIE_UTRATY, W.PRZYKROSC, W.POCZUCIE_WYKLUCZENIA,
                W.ZAGROZENIE
        );
    }

    public static W UCZUCIA_POZYTYWNE() {
        return on(
                W.MILOSC, W.PRZYJAZN, W.BRATERSTWO, W.KOLEZENSTWO, W.POCZUCIE_SZCZESCIA,
                W.POCZUCIE_ZYSKU, W.POCZUCIE_SUKCESU, W.ZAPAL, W.PRZYJEMNOSC, W.SENTYMENT
        );
    }

    public static W ZAROBEK_NIELEGALNY() {
        return on(
                W.DILLERKA, W.PRZEMYT, W.JAZDA_ZE_SPRZETEM, W.ZLODZIEJKA, W.ZLODZIEJKA_SKLEPY, W.ZLODZIEJKA_DZIESIONA, W.ZLODZIEJKA_SAMOCHODY
        );
    }

    public static W KRYTERIA_PRZYPALU() {
        return on(
                M.DZIELNICA(W.NAJLEPSZY_WARUNEK),
                W.KONKRETNA_INFORMACJA, W.DOWOD, W.ILE_OSOB_WIDZI_SLYSZY, W.GODZINA, W.MIEJSCE,
                W.SCIEZKA_CZESTOSC_UCZESCZANIA, W.ZNANY_NA_MIEJSCU, W.LATWOSC_SZYBKOSC_ODDALENIA, W.ACCESS_MIEJSCE_ULTRADOSTEPOWE,
                W.MOZLIWOSC_ZMIANY_GLOBALNEGO_POKOJU
        );
    }

    public static W TERROR() {
        return on(
                W.OCZY, W.USZY, W.CIERPIENIE, W.CIERPIENIE_DLUGOTERMINOWE, W.POZBAWIENIE_PRZEWAGI, W.KOSZTA,
                W.POZBAWIENIE_BEZPIECZENSTWA, W.POZBAWIENIE_DOSTEPOW, W.POZBAWIANIE_AUTORYTETU, W.POJECHANE
        );
    }

    public static W FEST() {
        return on(
                W.CHRONI_FESTA, W.TWORZY_KOLECZKO_ADORACJI, W.WYLACZY_DOSTEP, M.WYKLUCZA(W.RDZENNY), W.ZAZDROSC,
                W.EMOCJE_FIRST, W.HIERARCHIA_FIRST, W.ZMIENNOSC, W.WRAZLIWOSC, W.WOLNOSC, W.RESET, W.SAMOPOCZUCIE, W.KOMFORT,
                W.EGOISTA,

                W.NIESWIADOMOSC, W.DZIECKO, W.BRAK_INFORMACJI_OTOCZENIE,
                W.NIE_WIDZI_ZAGROZEN, W.NIE_ROZUMIE_PRZYCZYN_SKUTKOW, W.NIE_WYCIAGA_WNIOSKOW, W.NIE_KOJARZY_FAKTOW,
                W.NIE_DOSTRZEGA_SZCZEGOLOW, W.NIE_WIDZI_KONTEKSTU, W.BAGATELIZUJE_INFORMACJE, W.IGNORUJE_INFORMACJE,
                W.NIE_WIDZI_OKAZJI, W.NIE_STWARZA_OKAZJI, W.NIE_WYKORZYSTUJE_OKAZJI,

                W.TWORZY_SOBIE_PROBLEMY_ZAMIAST_ROZWIAZYWAC, W.NIE_WIDZI_SWYCH_BLEDOW, W.POWTARZA_BLEDY,
                W.NIE_PAMIETA_BLEDOW, W.LEKCEWAZY_BLEDY,

                W.JEDNO_MOWI_DRUGIE_ROBI, W.ODERWANY_OD_RZECZYWISTOSCI, W.ZMAGA_SIE_WRAZLIWE_EMOCJE_NERWY_PARALIZ,
                W.BRAK_KONSEKWENCJI, W.BRAK_SZACUNKU_DO_LUDZI, W.BRAK_SZACUNKU_DO_ZASAD, W.BRAK_SZACUNKU_DO_CZYNOW,

                W.BLEDNY_SYSTEM_WARTOSCI, M.MOCNO(W.MALO_WAZNE), M.SLABO(W.WAZNE),

                W.PIERWSZA_TRUDNOSC_PODDANIE, W.NIE_UMIE_PRACOWAC, W.PRACUJE_GDY_WYGODA_ZAPEWNIONA,
                W.NIEZDOLNY_DO_WYSILKU, W.NIEZDOLNY_DO_CIERPIENIA, W.ZEROWA_SILA, W.NIEZDOLNY_DO_WALKI,
                W.BOI_SIE_PRAWA, W.BRAK_SILY_SPRAWCZEJ,

                W.POSLUSZNY, W.POSLUSZNY_SILE, W.BRAK_DOSTEPU_RDZENNI,

                W.BRZYDKI, W.EMOCJE_ZE_ZLA, W.DZIWNE_HOBBY, W.DZIWNY_SYSTEM_WARTOSCI, W.KOMPLEKS_WZGLEDEM_LEPSZYCH, W.PRZECIW_LEPSZYM,
                W.KOLECZKO_WZAJEMNEJ_ADORACJI, W.PODLIZYWANIE_SIE,

                W.BRAK_ZOBOWIAZAN, W.BRAK_WYMAGAN, W.BRAK_OCZEKIWAN,
                W.BRAK_WSTYDU_WEW, W.MULTIKULTI_OK, W.MIECZAK, W.NIE_DOTRZYMUJE_TERMINOW, W.FALSZYWY,
                W.NIE_UMIE_KLAMAC, W.POKAZUJE_EMOCJE, W.WYOLBRZYMIA, M.MOCNO(W.NASTAWIENIE_HIERACHI_PRZYWILEJE),

                W.BRAK_SENSU_INTERAKCJI, W.FESCIARSKIE_BEZBARWNE_TEMATY, W.BEZSENSOWNE_KLUTNIE,
                W.NUDNE_ZYCIE_PRZEWIDYWALNE_BEZ_EMOCJI, W.IMITACJA_ZYCIA, W.BYLE_CO, W.BYLE_GDZIE, W.BYLE_Z_KIM,

                W.CIEKAWSKI, W.LUBI_WYGODY, W.LUBI_PRZYJEMNOSCI, W.MIESZANIEC, W.KONSTRUKTYWNA_KRYTYKA_JAKO_WYZWISKO,
                W.GNIEW, W.BRAK_OBIEKTYWNEJ_OCENY, W.BRAK_OKRESLENIA_SKALI, W.BIZNES_PRYWATNY_FOLWARK_SUPERPOZYCJA,

                W.TWARDOGLOWY_LUB_MIEKKOGLOWY, W.SPOKOJ, W.DYKTATURA_SZCZESCIA_ZERO_WYSILKU_KONFLIKTOW
        );
    }

    public static W DZIALAJACY() {
        return on(
                // TODO
        );
    }

    public static W ZLY_ZNAKI_ROZPOZNAWCZE() {
        return on(
                W.CZARNE_WLOSY, W.TATUAZE, W.RUDY, W.RUMUN, W.CZERWONE_OCZY,
                W.PATRZY_ZLE, W.PATRZY_Z_EXSTAZA, W.PATRZY_JAKBY_CHCIAL_OKLAMAC, W.PATRZY_Z_LEKCEWAZENIEM,
                W.NIE_PATRZY_ALE_KONSULTUJE, M.BEZ_POWODU(W.CISNIE),
                W.SLABA_POSTURA, W.PRZEWIDUJE_ZLE,
                M.NAGLE(of(W.PISZE_NA_TELEFONIE, W.DZWONI)), M.ZRYWA_SIE(M.GDY(M.ZOBACZYL(W.OSOBA))), M.DZIALA(M.GDY(M.ZOBACZYL(W.OSOBA))),
                W.DRESY_SZARE_MATERIALOWE, W.GAZ, W.TORBA, W.UZYWKI,
                M.DZIWNE(W.ZACHOWANIE), W.ZADAJE_GLUPIE_PYTANIA, W.SLABO_REAGUJE_NA_BODZCE,
                W.LEKKI_GLOS, W.DZIWNY_GLOS
        );
    }

    public static W BLAD() {
        return on(
                W.BLAD_POJEDYNCZY, W.BLAD_NIESWIADOMY_PRZYPADKOWY,
                W.BLAD_SPECJALNY, W.BLAD_LENISTWA,
                W.BLAD_ZLAMANIA_ZASAD
        );
    }

    public static W SONDA_KOGO() {
        return on(
                W.ZAGRANICZNI_CIEMNI, W.ZAGRANICZNI_JASNI,
                W.BURZUA_DZIALAJACA, W.BURZUA_NIESWIADOMA,
                W.DZIALACZE_PRZECIWNI, W.DUZI_TEMPI, W.TEGO_CO_RUCHA
        );
    }

    public static W HIERARCHIA_PRACA() {
        return on(
                M.BRAK(W.PRACA), W.PRACA_NA_ETACIE, W.MANAGER, W.OKRESLAJACY_BUDZET, W.ZARZAD_FIRMY, W.OWNER_FIRMY,
                W.WLASCICIEL_KORPORACJI
        );
    }

    public static W HIERARCHIA_ULICA() {
        return on(
                W.RDZENNY_DOBRY,
                W.ZLODZIEJ, W.PATOLOG, W.BIEGACZ, W.OSIEDLOWY_OGARNIETY, W.OSIEDLOWY_NORMAL, W.DIL,
                W.SPORTOWY_FEST, W.OSIEDLOWY_CASUAL,
                W.OSIEDLOWY_WYKRECONY, W.OSIEDLOWY_BURZUJ
        );
    }

    public static W CYKL_DNIA() {
        return on(
                W.OD_00_DO_6, W.OD_6_DO_7, W.OD_7_DO_9, W.OD_9_DO_11_, W.OD_11_DO_14,
                W.OD_14_DO_17, W.OD_17_DO_19, W.OD_19_DO_21, W.OD_21_DO_24
        );
    }

    public static W KSZTALTOWANIE_DZIELNICY() {
        return on(
                W.WARUNEK_UTWORZENIA_SIE_MIASTA,
                W.PRACA, W.RDZENNI, W.LUDZIE
        );
    }

    public static W KSZTALTOWANIE_CZLOWIEKA() {
        return on(
                W.OSOBOWOSC, W.WIDZISZ, W.SLYSZYSZ, W.CZUJESZ, W.Z_KIM_PRZYSTAJESZ, W.PRAKTYKA, W.ZNAJOMI,
                W.CHARAKTER, W.CIERPIENIE, W.CIEZKA_PRACA, W.TRUDNOSCI,
                W.UMYSL, W.WYSILEK_UMYSLOWY,
                W.FIZYCZNE, W.WYSILEK_FIZYCZNY, W.SPORT, W.MAX_WZROKU
        );
    }

    public static W POZYTECZNE_SPEDZANIE_CZASU() {
        return on(
                M.REALIZACJA(W.CEL), M.ZDOBYWANIE(of(W.PIENIADZE, W.UMIEJETNOSCI, W.WIEDZA)),
                W.WYCHOWYWANIE,
                M.KONTAKT(of(W.RDZENNA_LUDNOSC, W.DOBRE_KOBIETY_CHCACE_RODZINY))
        );
    }

    public static W RANY_PSYCHICZNE() {
        return on(
                W.PATRZENIE_W_OCZY, W.OBELGI_WYSOKA_CZESTOTLIWOSC, W.OBELGI_W_PETLI, W.UKAZANIE_WAD, W.WYSMIANIE, W.WYSMIANIE_POWIAZANE, W.UKAZANIE_WAD_POWIAZANE,
                W.POBICIE_PRZY_ZNAJOMYCH, W.POBICIE_PRZY_RODZINIE,
                W.POBICIE_ZNAJOMYCH, W.POBICIE_RODZINY, W.USZCZERBEK_ZDROWIE, W.STRATA_HONORU
        );
    }

    public static W RANY_FIZYCZNE() {
        return on(
                W.POPCHNIECIE, W.LEPIEC, W.STRZAL, W.KILKA_STRZALOW, W.BICIE_DO_UPADKU, W.BICIE_DO_UTRATY_PRZYTOMNOSCI
        );
    }

    public static W RANY_ZNECANIE_SIE() {
        return on(
                W.KOPANIE_KONCZYNY, W.KOPANIE_BRZUCH, W.KLEPANIE_KARK, W.GLOWA_O_POWIERZCHNIE
        );
    }

    public static W RANY_SPRZET() {
        return on(
                W.CIECIE_MIEJSCA_NIEZAGRAZJACE, W.CICIE_MIEJSCA_WIDOCZNE, W.CIECIE_MIEJSCA_ZAGRAZAJACE
        );
    }

    public static W RANY_DOSTEPOWE() {
        return on(
                W.WYLACZENIE_SRODOWISKA, W.WYLACZENIE_KOBIETY, W.WYLACZENIE_ZAROBKU, W.KAZDY_SPOTYKA_BIJE, W.KAZDY_KTO_SIEDZI_POJECHANE
        );
    }

    public static W PRACA_FIZYCZNA() {
        return on(
                W.PRZEMYSL, W.HUTNICTWO, W.SPAWALNICTWO,
                W.WYDOBYCIE_SUROWCE, W.PRZETWORSTWO_SUROWCE, W.BUDOWNICTWO, W.ENERGETYKA
        );
    }


    public static W PRACA_HANDEL() {
        return on(
                W.KASJERKA, W.MAGAZYN
        );
    }

    public static W PRACA_WYMAGAJACA_UMIEJETNOSCI() {
        return on(
                W.FRYZJERKA, W.KOSMETYCZKA, W.MAKIJARZYSTKA
        );
    }

    public static W PRACA_USLUGI() {
        return on(
                W.HOTEL, W.GASTRONOMIA, W.OCHRONA
        );
    }

    public static W PRACA_OSWIATA() {
        return on(
                W.NAUCZYCIEL
        );
    }

    public static W PRACA_TRANSPORT() {
        return on(
                W.KIEROWCA, W.MOTORNICZY
        );
    }

    public static W PRACA_TECHNICZNA_UMYSLOWA() {
        return on(
                W.KSIEGOWA, W.HR, W.MECHANIK, W.ELEKTRONIK, W.INFORMATYK
        );
    }

    public static W NASTAWIENIA() {
        return on(
                W.NASTAWIENIE_WSPARCIE, W.NASTAWIENIE_NEUTRALNOSC, W.NASTAWIENIE_PRZECIW,
                W.NASTAWIENIE_AGRESJA_W_DZIALANIU, W.NASTAWIENIE_KONTEMPLACJA, W.NASTAWIENIE_RELAKS, W.NASTAWIENIE_PRACA,
                W.NASTAWIENIE_OSZUKANIE_WYKORZYSTANIE, W.NASTAWIENIE_NA_ZLO, W.NASTAWIENIE_DOBRO, W.NASTAWIENIE_POZNANIE,
                W.NASTAWIENIE_KONTRA, W.NASTAWIENIE_PRZYJEMNOSCI,
                W.NASTAWIENIE_HIERACHI_PRZYWILEJE, W.NASTAWIENIE_BIERZESZ_CO_TWOJE,

                W.NASTAWIENIE_MAM_ZLE_ON_TEZ_MUSI, W.NASTAWIENIE_NIE_MAM_NIC_ON_TEZ_MA_NIE_MIEC, W.NASTAWIENIE_JA_GNOJONY_GNOJE_NIZSZYCH,
                W.NASTAWIENIE_DOMINACJA, W.NASTAWIENIE_STARCIE
        );
    }

    public static W KRZYWDY() {
        return on(
                M.START(W.ZLE_ZAMIARY),
                M.STANDARD(M.MALY_WYSILEK(M.MOCNO(M.CALY_CZAS(W.SZUKA_KANDYDATOW_ZROBIENIE_ZLA)))),
                M.STANDARD((M.MALY_WYSILEK(M.MOCNO(M.CALY_CZAS(W.STWARZA_OKAZJE_ZROBIENIE_ZLA))))),
                M.ZWYKLE(M.WYWYZSZAJ(M.UMACNIAJ(W.SIEBIE)), M.UNIZAJ(M.OSLABIAJ(W.INNI)), W.POBIJ_JAK_NAJWIECEJ_OSOB, W.ZDOBADZ_JAK_NAJWIECEJ_PRZEWAG),
                M.MALY_WYSILEK(of(M.DLUGO(W.PATRZENIE_W_OCZY), M.ROZMOWA(W.PRZERYWANIE_MOWY))),

                M.MALY_WYSILEK(M.MOCNO(M.PODSTAWA(of(W.UKRYCIE, W.KLAMSTWO, W.PO_CICHU)))),
                M.MALY_WYSILEK(M.MOCNO(of(W.HASLO_RDZENNYCH, W.ZAMKNIJ_ZASOB, W.OSZUKANIE_WYKORZYSTANIE, W.WYKLUCZENIE))),
                M.MALY_WYSILEK(M.MOCNO(of(W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI, W.NAKLEJ_NALEPKE, W.OBGADAC,
                        W.NOTYFIKACJA_ALL_O_HANBIE, W.PRZEKONYWANIE_OTOCZENIA_PRZECIW, W.NARZEKANIE_NA_OSOBE,
                        W.UNIZA, W.LEKCEWAZY_INNYCH))),
                M.MALY_WYSILEK(W.CISNIE),
                M.DUZY_WYSILEK(W.WALKA_PIESCI), M.DUZY_WYSILEK(W.ZNISZCZENIE_WARTOSCI_MATERIALNEJ),
                M.MALY_WYSILEK(W.SPRZET),
                M.MALY_WYSILEK(M.MOCNO(W.STARCIE_WIELU_NA_JEDNEGO)), M.MALY_WYSILEK(M.MOCNO(W.PRZEWAGA_NA_BRAK_PRZEWAGI)),
                M.MOCNO(of(W.WYKORZYSTANIE, W.OKRASC_PIENIADZE)),
                M.DUZY_WYSILEK(W.ZAMYKANIE_OPCJI), M.MALY_WYSILEK(of(W.OGLUPIANIE_KLAMSTWEM, W.OGLUPIANIE_UZYWKAMI)), M.NEUTRALNY_RZUT(W.NIESWIADOMOSC),
                M.DUZY_WYSILEK(W.ULTIMATUM), M.DUZY_WYSILEK(W.SWIADOMOSC), M.NEUTRALNY_RZUT(W.DOSTEP),
                M.DUZY_WYSILEK(W.ZNISZCZENIE_PRZEWAGI),
                M.MALY_WYSILEK(M.MOCNO(of(W.WSPARCIE_OSLONY, W.FALSZYWE_WRAZENIE, W.WYSOKIE_OCZEKIWANIE))),
                M.MALY_WYSILEK(M.MOCNO(M.MIEJSCE_STALE(W.ODCIECIE_DOSTEPU_WARTOSC))),
                W.AGRESJA_W_DZIALANIU, W.ZLO,
                M.CEL(of(W.ZNISZCZENIE, W.POSTAWIENIE_CIEZKICH_WARUNKOW))
        );
    }

    public static W BRAK_ZASAD() {
        return on(
                M.MALY_WYSILEK(M.MOCNO(of(W.FOTY_MIEJSCE_STALE, W.NIE_MILA_OBSLUGA, W.ZLE_WYKONANIE_USLUGI))),
                M.DUZY_WYSILEK(of(W.OGRANICZENIE_WOLNOSCI_ULICA, W.KONTUZJA)),
                W.ZABRAC_COS,
                M.MALY_WYSILEK(of(W.INTERAKCJA_POLICJA, W.INTERAKCJA_ZAGRANICZNI, W.PUSZCZALSKOSC, W.ZDOLNOSC_KONFIDENTCTWO)),
                M.DUZY_WYSILEK(of(W.KLUCENIE_RODZINY, W.ATAK_NA_CZLONKOW_RODZINY, W.ZAMACH_NA_ZYCIE)),
                M.MALY_WYSILEK(M.MOCNO(of(W.LEKCEWAZY_MIEJSCE, W.LEKCEWAZY_OKOLICZNOSCI, W.LEKCEWAZY_OSOBY, W.LEKCEWAZY_WYSILEK))),
                M.MALY_WYSILEK(M.MOCNO(W.WYKORZYSTUJE_BRAK_PRZEWAG)),
                M.MALY_WYSILEK(M.MOCNO(W.DUZA_KRZYWDA_NA_PRZEWADZE)),
                M.MALY_WYSILEK(of(W.GRZEBANIE_PRYWATNE, W.TRUCIZNA_DO_JEDZENIA)),
                M.ODRAZU(W.ZLO), M.DOSWIADCZENIE(W.ZLO),
                M.ZWYKLE(M.ZLE_TRAKTOWANIE(W.OSOBA)), M.ZWYKLE(M.LEPSZE_TRAKTOWANIE(W.SWOI)),
                M.BRAK(W.WSTYD_PRZED_LUDZMI), M.BRAK(W.SZACUNEK_ZYCIE_LUDZKIE),
                M.MOCNO(M.WYKORZYSTUJE(W.OSLONA)),
                M.MOCNO(of(W.DAZENIE_DO_ZLA, W.SZUKANIE_GLEBOKO_ZLA, W.KAZDE_DZIALANIE_ZMIENIA_W_ZLO))
        );
    }

    public static W KRZYWDY_BEZPOSREDNIE() {
        return on(
                M.NABYCIE(of(W.ZASIEG_WZROKU, W.BLISKOSC)),
                M.MALY_WYSILEK(W.CISNIE),
                M.DUZY_WYSILEK(W.WALKA_PIESCI), M.DUZY_WYSILEK(W.ZNISZCZENIE_WARTOSCI_MATERIALNEJ),
                M.MALY_WYSILEK(W.SPRZET),
                M.MALY_WYSILEK(M.MOCNO(W.STARCIE_WIELU_NA_JEDNEGO)), M.MALY_WYSILEK(M.MOCNO(W.PRZEWAGA_NA_BRAK_PRZEWAGI)),
                M.DUZY_WYSILEK(W.ZNISZCZENIE_PRZEWAGI)
        );
    }

    public static W KRZYWDY_POSREDNIE() {
        return on(
                M.START(W.ZLE_ZAMIARY),
                M.STANDARD(M.MALY_WYSILEK(M.MOCNO(M.CALY_CZAS(W.SZUKA_KANDYDATOW_ZROBIENIE_ZLA)))),
                M.STANDARD((M.MALY_WYSILEK(M.MOCNO(M.CALY_CZAS(W.STWARZA_OKAZJE_ZROBIENIE_ZLA))))),
                M.ZWYKLE(M.WYWYZSZAJ(M.UMACNIAJ(W.SIEBIE)), M.UNIZAJ(M.OSLABIAJ(W.INNI)), W.ZDOBADZ_JAK_NAJWIECEJ_PRZEWAG),

                M.MALY_WYSILEK(M.MOCNO(M.PODSTAWA(of(W.UKRYCIE, W.KLAMSTWO, W.PO_CICHU)))),
                M.MALY_WYSILEK(M.MOCNO(of(W.HASLO_RDZENNYCH, W.ZAMKNIJ_ZASOB, W.OSZUKANIE_WYKORZYSTANIE, W.WYKLUCZENIE))),
                M.MALY_WYSILEK(M.MOCNO(of(W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI, W.NAKLEJ_NALEPKE, W.OBGADAC,
                        W.NOTYFIKACJA_ALL_O_HANBIE, W.PRZEKONYWANIE_OTOCZENIA_PRZECIW, W.NARZEKANIE_NA_OSOBE,
                        W.UNIZA, W.LEKCEWAZY_INNYCH))),
                M.MOCNO(of(W.WYKORZYSTANIE, W.OKRASC_PIENIADZE)),
                M.DUZY_WYSILEK(W.ZAMYKANIE_OPCJI), M.MALY_WYSILEK(W.OGLUPIANIE), M.NEUTRALNY_RZUT(W.NIESWIADOMOSC),
                M.DUZY_WYSILEK(W.ULTIMATUM), M.DUZY_WYSILEK(W.SWIADOMOSC), M.NEUTRALNY_RZUT(W.DOSTEP),
                M.MALY_WYSILEK(M.MOCNO(of(W.WSPARCIE_OSLONY, W.FALSZYWE_WRAZENIE, W.WYSOKIE_OCZEKIWANIE))),
                M.MALY_WYSILEK(M.MOCNO(M.MIEJSCE_STALE(W.ODCIECIE_DOSTEPU_WARTOSC)))
        );
    }

    public static W WYMAGA_KARY() {
        return on(
                W.DZIALANIE_DLA_ZLA,
                W.BRAK_WYSILKU, W.BRAK_STRESU, W.BRAK_TRUDNOSCI,
                W.PRZEWAGI_OD_KOLYSKI, W.PRZYJEMNOSCI_OD_KOLYSKI,
                W.KOMFORT, W.BEZPIECZENSTWO, W.MONOSRODOWISKO, W.WCZESNIE_ZWIAZEK,
                W.NIEZDOLNY_WALKA_SPRZET, W.GLUPOTA, W.UZYWKI,
                W.ZAJECIE_SIE_LOKALNYMI_SRPAWAMI, W.WSTYD
        );
    }

    public static W SONDA_DZIALACZA() {
        of(
                W.ROZMIAR, W.PRZEWAGA_SILY, W.SRODOWISKO,
                W.DZIALA, M.W_JAKI_SPOSOB(W.DZIALA),
                W.BIEGA, M.JAK_DLUGO(W.BIEGA),
                M.KOGO_ZNA(W.EKIPA),
                W.WYROK, M.JAK_DLUGO(W.WYROK),
                M.DOSWIADCZENIE(W.SPRZET)
        );
    }

    public static W SONDA_SHRTS() {
        return on(
                M.W(of(W.MEZCZYZNA),
                        of(
                                M.MOCNO(M.sonda(W.OCZY)),
                                M.MOCNO(M.sonda(W.HASLO_RDZENNYCH)),
                                M.sonda(W.Z_KIM),
                                M.sonda(W.SWIADOMOSC), // 1: FEST
                                M.sonda(W.SILA_SPRAWCZA), // WPLYW: 0
                                M.sonda(W.ROZMIAR),
                                M.sonda(W.ZLO_DOBRO), // UZASADNIENIE: 0
                                M.sonda(W.WIEK),
                                M.sonda(W.CZY_CWEL), // NICNIEMOZE : 0
                                M.POROWNANIE(W.INNI),
                                M.sonda(W.SRODOWISKO),
                                M.sonda(W.CZYNY_DZIALANIA),
                                M.sonda(W.HIERARCHIA),
                                M.sonda(W.GDZIE)
                        )
                ),
                M.W(of(W.KOBIETA),
                        of(
                                M.sonda(W.ROZMIAR),
                                M.sonda(W.LADNA),
                                M.sonda(W.STWARZA_SZANSE)
                                //-------------------------
//                            M.sonda(PATOLOGIE_WSTEPNE_KOBIET, PATOLOGIE_UTRZYMANIA_KOBIET)
                        )
                ));
    }


    public static W ZACHETA_DO_ZLA() {
        return on(
                W.BEZKARNOSC, W.LEKCEWAZENIE, W.PYCHA, W.ZUCHWALOSC, W.POCZUCIE_WYZSZOSCI, W.HIERARCHIA,
                W.PRZEWAGA, W.EMOCJE_ZE_ZLA, W.NARKOTYKI
        );
    }


    public static W METODA_STARCIE_REAKCJA() {
        of(

                M.W(M.MALY_WYSILEK(W.SPRZET), "--->", of(M.DUZA_KRZYWDA(W._1_RUCH), W.NAJWIEKSZ_STRACH,
                        M.ZWYKLE(W.UCIECZKA),
                        M.DZIALAJACY_ZWYKLE(of(W.SPRZET, W.NOTYFIKACJA_EKIPA)))),

                M.W(M.DUZY_WYSILEK(W.WALKA_PIESCI), "--->", of(M.ZWYKLE(W.PODJECIE_WALKI),
                        M.DZIALAJACY_ZWYKLE(of(W.PODJECIE_WALKI, W.SPRZET, W.NOTYFIKACJA_EKIPA)))),

                M.W(M.MALY_WYSILEK(W.CISNIE), "--->", of(M.ZWYKLE(W.ODPOWIADA),
                        M.DZIALAJACY_ZWYKLE(of(W.ODPOWIADA, W.WALKA_PIESCI, W.SPRZET, W.NOTYFIKACJA_EKIPA)))),

                M.W(M.MALY_WYSILEK(W.BLISKOSC), "--->", of(W.SONDA, M.ZWYKLE(W.PATRZY),
                        M.DZIALAJACY_ZWYKLE(of(W.PATRZY, W.ROZKMINIA, W.ZDJECIA_TWARZOWKI, W.NOTYFIKACJA_EKIPA, M.OPCJA(W.CISNIE)))))
        );
    }

    public static W OBRONA_STARCIE() {
        return on(
                W.UCIECZKA,
                W.PODJECIE_WALKI,
                W.GAZ, W.OSTRY_SPRZET,
                W.NOTYFIKACJA_EKIPA,
                W.ROBIENIE_PRZYPALU
        );
    }

    public static W DEFAULT_WARUNKI() {
        return on(
                W.RODZINA, W.MIEJSCE_ZAMIESZKANIA,
                M.BRAK(of(W.ZNAJOMI, W.ZWIAZEK, W.PRACA, W.UKLADY, W.HASLO_RDZENNYCH, W.PRZEWAGA)),
                W.POPED_SEXUALNY, W.MARZENIA, W.OCZEKIWANIA_WOBEC_ZYCIA,
                W.CHARAKTER, W.CECHY_WRODZONE,
                W.CZYSTE_SUMIENIE
        );
    }

    public static W STRATY_MORALNE() {
        return on(
                W.OBRAZENIA_FIZYCZNE, W.KONTUZJA, W.ZLE_SAMOPOCZUCIE, W.HANBA, W.WYKLUCZENIE,
                M.STRATA(W.ZNAJOMI), M.STRATA(W.KOBIETA)
        );
    }

    public static W STRATY_MATERIALNE() {
        return on(
                M.STRATA(of(
                        W.PRACA, W.PIENIADZE, W.WYSOKA_POZYCJA,
                        W.CZAS, W.SZANSA, W.LUDZIE_ZA_TOBA, W.EKIPA,
                        W.SPRYT, W.SZYBKOSC, W.SILA
                ))
        );
    }

    public static W TEMATY_NORMALNYCH_LUDZI() {
        return on(
                M.CALY_CZAS(W.BRAK_EMOCJI), W.PRACA, W.SPORT, W.POGODA, W.SLUZBA_ZROWIA,
                W.ZDROWIE, W.SAMOPOCZUCIE, W.NAUKA, M.OPCJA(W.DZIECI), W.RODZINA, W.DOM, W.NOWE_TECHNOLOGIE,
                W.UBRANIA, W.USLUGI, W.EVENTY, W.AKTUALNE_WYDARZENIA_SWIATA, W.PODROZE, W.KULTURY_SWIATA,
                W.GOTOWANIE, W.JEDZENIE, W.WOLNOSC
        );
    }

    public static W TEMATY_RDZENNYCH() {
        return on(
                M.CALY_CZAS(W.EMOCJE),
                M.MOCNO(of(
                        W.NIENAWISC, W.KIBICOWANIE, M.HIERARCHIA(W.ZNAJOMI), W.KLUB, W.MELANZ, W.UZYWKI,
                        W.STANDARD_ZACHOWANIA, W.ZWIAZKI, M.OPCJA(W.DZIECI), W.PRZEWAGA, M.TOLERANCJA(M.REAKCJA_SMIECHEM(W.EMOCJE_ZE_ZLA))
                        )
                ));
    }

    public static W ANTY_DZIALACZ_ZLA() {
        return on(
                W._1_VS_1_STARCIE_BEZ_PRZEWAG, W.UKAZANIE_W_PRAWDZIE, W.POZBAWIENIE_PRZEWAGI
        );
    }

    public static W CECHY_RDZENNY() {
        return on(
                W.ZDENERWOWANY_ZYCIEM, W.RYWALIZACJA, W.ZAZDROSC, W.CHRONIENIE_SWOJEGO,
                W.NORMALNE_EMOCJE, W.REAKCJA, W.ZDOLNY_DO_WALKI, W.UMIE_CISNAC, W.UMIE_KLUCIC,
                W.DAZENIE_DO_CELU,
                W.WIEDZA_PRZEWAGI, W.WIEDZA_OSIAGANIE_PRZEWAG,
                M.OPCJA(W.AGRESJA)
        );
    }

    public static W ULICA_PRZEWAGA_SPOSOB() {
        return on(

                M.W(W.DYSTANS, "--->", of(W.SZYBKIE_NOGI, W.ROWER, W.SAMOCHOD)),

                M.W(W.SAMOCHOD, "--->", of(M.ZNISZCZENIE(W.OPONY), M.ZNISZCZENIE(W.KAROSERIA), M.OPCJA(M.PODPALENIE(W.SAMOCHOD)))),

                M.W(W.ZWIADY, "--->", of(M.STAJESZ(W.ULICA), M.PRZEPYTYWANIE(W.WSZYSCY), M.W(M.OSOBA(W.NIEZNAJOMY), "--->", W.WALKA_PIESCI))),

                M.W(of(W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI), "--->", of(M.STRATA(M.ZNISZCZENIE(W.TELEFON)), W.WALKA_PIESCI)),

                M.W(W.MIEJSCE_STALE, "--->", of(M.ZAGAZOWANIE(W.MIEJSCE_STALE), M.ZNISZCZENIE(W.WARTOSC))),

                M.W(W.CISNIE, "---->", W.WALKA_PIESCI),

                M.W(W.WALKA_PIESCI, "--->", of(M.SILNIEJSZA(W.WALKA_PIESCI), W.SPRZET)),

                M.W(W.GAZ, "--->", of(W.KOMIN_ANTY_GAZ, W._88_, W.WALKA_PIESCI)),

                M.W(W.OSTRY_SPRZET, "--->", of(M.SILNIEJSZA(M.EKIPA(M.ODWAGA(M.WIECEJ_OSOB(W.OSTRY_SPRZET)))), M.WJAZD_NA_MIESZKANIE(W.BIEGAJACY_SPRZET))),

                M.W(W.EKIPA, "--->", of(M.WALKA(M.SILNIEJSZA((W.EKIPA))), M.SKOMPROMITOWANIE(W.EKIPA),
                        W.BRAK_SENSU_DZIALANIA, M.BRAK(W.OSOB), M.BRAK(W.POSLUCH), M.BRAK(M.WYKONYWANIE(W.ROZKAZ)))),

                M.W(M.WJAZD_NA_MIESZKANIE(W.BIEGAJACY_SPRZET), "--->", M.MIESZKANIE(W.BRON_PALNA)),

                M.W(W.OSLONA, "--->", M.MIMO_TO(M.BIJESZ())),

                M.W(of(M.ROZKMINIONY(W.OSOBA), W._88_,
                        W.NIE_KIBICUJE, W.Z_KOBIETA, W.LAMUS, W.DUZO_OSOB), "--->", M.ORIENT(W.PRZYPAL).MIMO_TO(M.BIJESZ())),

                M.W(of(M.OPPONENT(of(W.PRZEWAGA_SILY, W.SPRZET)), W._88_, M.WYSTEPUJE(W.WARTOSC)), "--->", M.MIMO_TO(M.BIJESZ())),

                M.W(of(W.INFORMACJA, W.CZAS, W.WIEDZA, W.BRAK_WSTYDU), "--->", of(W.KLAMSTWO, W.UKRYCIE, W.HASLO_RDZENNYCH,
                        M.BRAK_DOSTEPU(W.ZLO), W.SAMOTNOSC)),

                M.W(of(W.ZNAJOMI, W.OSIEDLOWE_SRD), "--->", M.POINFORMUJ_WSZYSTKICH(W.HANBA)),

                M.W(of(W.PIENIADZE, W.WYSOKA_POZYCJA), "--->", of(W.WYROK, M.STRATA(W.PRACA), M.STRATA(W.ZDROWIE))),

                M.W(W.BRAK_CIERPIENIA, "--->", M.PRZEZYCIE(W.CIERPIENIE)),

                M.W(M.BRAK_ZASAD(M.INTERAKCJA(of(W.POLICJA, W.ZAGRANICZNI))), "--->", of(M.UKAZANIE(M.BRAK_ZASAD(W.HANBA)),
                        M.SKOMPROMITOWANIE(W.EKIPA))),

                M.W(of(W.SPRYT, W.SZYBKOSC, W.SILNY, W.POTRAFI_OCENIC), "--->", of(M.STRATA(W.ZDROWIE), W.UZYWKI, W.UZALEZNIENIE))
        );
    }

    public static W ZACHOWANIE_REZULTAT_ULICA() {
        of(

                M.W(of(M.NOTYFIKACJA(W.EKIPA), W.ZDJECIA_TWARZOWKI), "--->", of(M.ZWYKLE(M.BRAK(W.REAKCJA)), M.INFORMACJA(W.EKIPA))),

                M.W(W.SPRZET, "--->", M.ZWYKLE(of(M.WLASNA(W.OBRONA), M.UZYCIE(M.GDY(W.ZAGROZENIE)), M.NABYCIE(W.WARTOSC)))),

                M.W(M.ZNAJOMY(of(W.CISNIE, W.GADA)), "--->", M.ULTIMATIUM(W.ODPOWIADA)),

                M.W(M.OBCY(of(W.CISNIE, W.GADA)), "--->", of(W.NIC_NIE_ZNACZY, M.OBCY(M.SZUKANIE(W.EMOCJE))))
        );
    }

    public static W METODY_POLICYJNE() {
        return on(
                W.NOTYFIKACJA_EKIPA, W.OPISYWANIE_UBIORU, W.GAZ, W.FOTY_ROZPOZNANIE, M.CALY_CZAS(W.KONTROLA)
        );
    }

    public static W WZGLEDNA_IZOLACJA() {
        return on(
                W.PRZYSTANEK, W.TRAUTO, W.SWIATLA, W.KLATKA, W.MIEJSCE_STALE, W.STACJA_BENZYNOWA, W.OSIEDLOWE_SRD
        );
    }

    public static W SPRZYJAJACE() {
        return on(
                W.PRETEKST, W.KONTEKST, W.NUDA,
                W.WZGL_IZOLACJA, W.DLUGA_DOSTEPNOSC, W.BEZRUCH, W.OSZCZEDNOSC_CZASU, W.MALA_TRUDNOSC, W.MALY_WYSILEK, W.MALA_DROGA, W.MALY_PRZYPAL,
                W.SAMA, W.Z_KOLEZANKA, W.Z_RODZINA
        );
    }

    public static W NIE_SPRZYJAJACE() {
        return on(
                W.TLUM, W.ZMECZENIE, W.CISZA, W.MOZLIWE_SLUCHAWKI
        );
    }

    public static W ESSENTIALS_SYTUACJE() {
        return on(
                W.DOSTEPNOSC, W.BLISKOSC, W.SZYBKOSC_CHODZENIA, W.INFORMACJA,
                W.ZASIEG_WZROKU, W.ZASIEG_JEJ_WZROKU,
                W.CZAS_START, W.CZAS_KONIEC,
                W.SRODOWISKOWE, W.STALE, W.RESTRYKCYJNE
        );
    }

    public static W PLANSZA() {
        return on(
                W.LUDZIE, W.KOBIETA, W.STATYSCI, W.POTRZEBA, W.TRANSPORT, W.SCIEZKI
        );
    }

    public static W EXTREMALNE_SYTUACJE() {
        return on(
                W.UWAGA_NA_TOBIE, W.ROZWALENIE_CISZY,
                W.IDZIESZ_ZAWRACASZ, W.PRZECIWNY_PRZYSTANEK, W.SIEDZISZ_PRZEJSCIE, W.ONA_SWOJE_GRONO
        );
    }

    public static W SLABY_TCHORZ() {
        return on(
                M.MALY_WYSILEK(M.MOCNO(M.PODSTAWA(of(W.UKRYCIE, W.KLAMSTWO, W.PO_CICHU)))),
                M.MALY_WYSILEK(M.MOCNO(of(W.HASLO_RDZENNYCH, W.ZAMKNIJ_ZASOB, W.OSZUKANIE_WYKORZYSTANIE, W.WYKLUCZENIE))),
                M.MALY_WYSILEK(M.MOCNO(of(W.NOTYFIKACJA_EKIPA, W.ZDJECIA_TWARZOWKI, W.NAKLEJ_NALEPKE, W.OBGADAC,
                        W.NOTYFIKACJA_ALL_O_HANBIE, W.PRZEKONYWANIE_OTOCZENIA_PRZECIW,
                        W.UNIZA, W.LEKCEWAZY_INNYCH))),
                M.MALY_WYSILEK(M.MOCNO(W.STARCIE_WIELU_NA_JEDNEGO)), M.MALY_WYSILEK(M.MOCNO(W.PRZEWAGA_NA_BRAK_PRZEWAGI)),
                M.MOCNO(of(W.WYKORZYSTANIE, W.OKRASC_PIENIADZE)),
                M.DUZY_WYSILEK(W.ZAMYKANIE_OPCJI), M.MALY_WYSILEK(W.OGLUPIANIE), M.NEUTRALNY_RZUT(W.NIESWIADOMOSC),
                M.MALY_WYSILEK(M.MOCNO(of(W.WSPARCIE_OSLONY, W.FALSZYWE_WRAZENIE, W.WYSOKIE_OCZEKIWANIE))),
                M.MALY_WYSILEK(M.MOCNO(M.MIEJSCE_STALE(W.ODCIECIE_DOSTEPU_WARTOSC)))
        );
    }

    public static W WADY_ZLYCH() {
        return on(
                W.UZYWKI, W.GLUPOTA, W.BRAK_SUMIENIA, W.KROTKOWZROCZNOSC_CZYNOW, M.ROZKMINIONY_PRZEZ(W.CZYNY),
                M.DOSTEP(W.ZLO), M.BRAK_DOSTEPU(W.DOBRO),
                M.ZALEZNY_OD(W.PRZEWAGA), M.ZALEZNY_OD(W.EKIPA), W.ZYSK.W_PRZECIWNYM_PRZYPADKU(W.BRAK_REAKCJI),
                M.BOI_SIE(W.PRAWDA), M.BRAK_DOSWIADCZENIA(W.STARCIE_1_NA_1),
                M.W(M.BRAK(W.PRZEWAGA), "--->", M.BRAK(W.DZIALANIE)),
                M.BRAK(W.PRZYCHYLNOSC_BOGA),
                M.WZAJEMNE(W.HAKI)
        );
    }

    public static W WSPOMNIENIA() {
        return on(
                W.OSOBY, W.SYTUACJE, W.KONTEKST, W.EMOCJE_DANEJ_CHWILI, W.POMIESZCZENIA, W.RZECZY, W.DROGA_DO, W.DROGA_POWROT
        );
    }

    public static W KONFRONTACJA() {
        return on(
                M.CALY_CZAS(W.DZIALANIE_POD_PRESJA),
                M.CALY_CZAS(W.WYSILEK), M.CALY_CZAS(W.KLOTNIA),
                M.CALY_CZAS(M.ORIENT(W.LUDZIE)), M.CALY_CZAS(M.ORIENT(W.SPRZET)),
                M.CALY_CZAS(W.OBRAZENIA_FIZYCZNE),
                M.REZULTAT(of(W.RANY_ODNIESIONE, W.REGENERACJA, W.WROG, W.JEGO_ZNAJOMI_TWOI_WROGOWIE))
        );
    }

    public static W OKAZJE_ZROBIENIE_ZLO() {
        return on(
                W.OBECNOSC_LUDZI, W.BLISKOSC, W.POTRZEBA, W.USLUGI,
                M.MOCNO(W.PRZEWAGA), M.MOCNO(M.OPPONENT(W.WARTOSC)), M.MOCNO(M.OPPONENT(W.BRAK_PRZEWAG)), M.MOCNO(W.LUDZIE_ZA_TOBA),
                M.MOCNO(M.OPPONENT(W.NIESWIADOMOSC)), M.MOCNO(M.OPPONENT(M.BRAK_DOSTEPU(W.ZLO)))
        );
    }


    public static W OKAZJE_ZROBIENIE_DOBRO() {
        return on(
                W.BLISKOSC, M.WIDZISZ(W.ZLO), M.PRZEWIDZENIE(W.ZLO),
                M.PO_SONDA(W.ZLY)
        );
    }

    public static W TYPY_LUDZI_SHRT() {
        return on(
                W.WYKOLEJONY, W.FEST, W.WIESNIAK, W.OSIEDLOWY_SLABY, W.NORMALNY, W.OSIEDLOWY_MOCNY, W.CZOLO
        );
    }

    public static W TYPY_LUDZI_DOBRE() {
        return on(
                W.LOKALNY,
                W.MLODY, W.SREDNI_WIEK,

                W.OSIEDLOWY_NORMAL, W.OSIEDLOWY_OGARNIETY,
                W.BIEGACZ, W.PATOLOG, W.DIL, W.ZLODZIEJ,
                W.WIECZNY_IMIGRANT,
                W.RDZENNY_GLUPI, W.RDZENNY_DOBRY,

                W.CZOLO, W.OGARNIECI, W.MOCNI_NIE_LICZACY_SIE,
                // KOBIETA
                W.OSIEDLOWA_AGRESORKA, W.OSIEDLOWA_NORMALNA, W.OSIEDLOWA_DOBRA, W.OSIEDLOWA_SWIATOWA
        );
    }

    public static W TYPY_LUDZI_ZLE() {
        return on(
                W.STATYSTA, W.TURYSTA_ZAGRANICZNY,
                W.STARY,
                W.FEST, W.BANAN, W.WYGODNIS, W.BURZUJ_NIESWIADOMY, W.BURZUJ_DZIALACZ,
                W.OSIEDLOWY_SLABY, W.OSIEDLOWY_WYKRECONY, W.OSIEDLOWY_CASUAL, W.SPORTOWY_FEST,
                M.MLODE(M.CHETNE(W.PIONKI)),
                // KOBIETA
                W.CZORT, W.OSIEDLOWA_KARYNA, W.OSIEDLOWA_KSIEZNICZKA,
                W.BURZUA, W.KUJONKA, W.ZBYT_WRAZLIWA, W.ZWYKLA_FEST, W.WIESNIARA,
                W.SWIATOWA_DOBRY_DOM
        );
    }

    public static W CISNIE() {
        return on(
                M.WYBOR(of(W.GLOSNO, W.CICHO)),

                W.CISNIE_WYGLAD, W.CISNIE_ZACHOWANIE,
                W.CISNIE_MOWA, W.CISNIE_WSPOMNIENIA,
                W.CISNIE_POWIAZANE
        );
    }

    public static W TYPY_SYTUACJI() {
        return on(
                W.UNIKALNA_SYTUACJA, W.CHCIANA_SYTUACJA, W.MIEJSCA_SYTUACJA, W.DEFAULT_SYTUACJA, W.RESTRYKCYJNA_SYTUACJA, W.KRYZYSOWA_SYTUACJA
        );
    }

    public static W SYTUACJE_STARCIE() {
        return on(
            M.SYTUACJA(W.PATRZY),
            M.SYTUACJA(of(W.PATRZY, W.CISNIE)),
            M.SYTUACJA(of(W.PATRZY, W.CISNIE, M.IDZIE(W.TWOJA_STRONA))),
            M.SYTUACJA(of(W.PATRZY, M.BIEGNIE(W.TWOJA_STRONA).CEL(W.WALKA_PIESCI))),
            M.SYTUACJA(of(W.PATRZY, M.BIEGNIE(W.TWOJA_STRONA).CEL(W.WALKA_SPRZET))),
            M.SYTUACJA(M.ROBI(W.ZDJECIA_TWARZOWKI)),
            M.SYTUACJA(M.IDZIE(W.ZWIADY)),
            M.SYTUACJA(M.IDZIE(W.ZWIADY).Z(W.OSLONA)),

            M.SYTUACJA(M.WIELU(W.PATRZY)),
            M.SYTUACJA(M.WIELU(of(W.PATRZY, W.CISNIE))),
            M.SYTUACJA(M.WIELU(of(W.PATRZY, W.CISNIE, M.IDZIE(W.TWOJA_STRONA)))),
            M.SYTUACJA(M.WIELU(of(W.PATRZY, M.BIEGNIE(W.TWOJA_STRONA).CEL(W.WALKA_PIESCI)))),
            M.SYTUACJA(M.WIELU(of(W.PATRZY, M.BIEGNIE(W.TWOJA_STRONA).CEL(W.WALKA_SPRZET)))),
            M.SYTUACJA(M.WIELU(M.ROBI(W.ZDJECIA_TWARZOWKI))),
            M.SYTUACJA(M.WIELU(M.IDZIE(W.ZWIADY))),
            M.SYTUACJA(M.WIELU(M.IDZIE(W.ZWIADY).Z(W.OSLONA)))
    );

    public static W DUZO_IF() {
        return on(
                W.DUZE_BLOKI, W.DUZO_OSOB, W.SRODOWISKO, W.RDZENNI, W.MOCNE_JEDNOSTKI, W.NORMALNE_EMOCJE
        );
    }

    public static W RODZAJE_WIEDZA() {
        return on(
                W.WIEDZA_ULICA, W.WIEDZA_KOBIETY_PODRYW, W.WIEDZA_KOBIETY_ZWIAZEK, W.WIEDZA_WYCHOWANIE,
                W.WIEDZA_SPORT, W.WIEDZA_NAUKA,
                W.WIEDZA_LUDZIE_GENY, W.WIEDZA_LUDZIE_CHARAKTER,
                W.WIEDZA_RYNEKPRACY, W.WIEDZA_ZAWOD, W.WIEDZA_PRAWO
        );
    }

    public static W SILNE_WIEZY_CZLOWIEKA() {
        return M.MOCNO(of(
                W.RASA, W.NARODOWOSC, W.GENY, W.RODZINA, W.MIEJSCE_POCHODZENIA, W.RELIGIA
        ));
    }

    public static W RELACJE() {
        return on(
                M.BRAK(W.RELACJA), W.ZNAJOMOSC, W.KOLEZENSTWO, W.PRZYJAZN, W.MILOSC,
                W.WROGOSC, W.NIECHEC, W.NIEZROZUMIENIE, W.LEKCEWAZENIE, W.WYKORZYSTANIE, W.WALKA
        );
    }

    public static W WALKA() {
        return  on(
            W.WALKA_KLAS_SPOLECZNYCH, W.WALKA_NARODOW, W.WALKA_RASOWA, W.WALKA_KLUBY_KIBICOWSKIE, W.WALKA_O_PRZEWAGI
        );
    }

    public static W ZASIEG_PRZEWAGI_ULICA() {
        return on(
            W.OBECNOSC, W.ZASIEG_WZROKU, W.ZASIEG_BIEGU, W.ZASIEG_SAMOCHODU, W.ZASIEG_BRONI
        );
    }

    public static W BLEDY() {
        return on(
                W.BLAD_POJEDYNCZY, W.BLAD_NIESWIADOMY_PRZYPADKOWY,
                W.BLAD_SPECJALNY, W.BLAD_LENISTWA, W.BLAD_ZLAMANIA_ZASAD
        );
    }


    public static W REAKCJE() {
        return  on((
            M.BRAK(W.REAKCJA), W.PIERWSZA_REAKCJA, W.REAKCJA_PO_NARADZIE, W.REAKCJA_PO_SONDZIE
        );
    }

    public static W SPORT() {
        return  on((
                W.PILKA_NOZNA, W.BOKS, W.SILOWNIA, W.PLYWANIE, W.ZIMOWE, W.IGRZYSKA_OLIMPIJSKIE,
                W.HOKEJ, W.PILKA_RECZNA, W.SIATKOWKA
        );
    }

    public static W TYPY_MIEJSC() {
        return on(
                W.MIEJSCE_STALE, W.MIEJSCE_RESTRYKCYJNE, W.MIEJSCE_RESTRYKCYJNE_OSIEDLE, W.MIEJSCE_TRANZYTOWE,
                W.GLOWNA_DROGA, W.OSIEDLOWA_DROGA
        );
    }

    public static W KONTROLA() {
        return on(
                M.OSOBA(M.BLISKO(of(W.KONTROLA_CZYNY, W.KONTROLA_MOWA, W.KONTROLA_RZECZY_POSIADANE, W.KONTROLA_PRZWAG, W.KONTROLA_SLABOSCI, W.KONTROLA_RELACJI, W.KONTROLA_DZIALANIE))),
                M.SRODOWISKO(of(M.CALY_CZAS(W.INFORMACJE_ODRAZU_KRAZA), W.ZDJECIA_TWARZOWKI))
        );
    }

    public static W SONDA_PRZYCZYN() {
        return  on(
                W.PRZYMUS, W.POTRZEBA, W.ZLO, W.DOBRO, W.ZYSK, W.MODA, W.PRZEWAGA, W.NUDA, W.UCZUCIE, W.CIEKAWOSC, W.ZAZDROSC
        );
    }


}