package metoda;

import db.DBS;
import db.DBW;
import warunek.W;

import java.util.List;


/**
 * Created by gadzik on 31.12.19.
 */
public class Watek_POZANIA_KOBIET_KROTKO extends AbstractWatek {
    W wazne = M.WAZNE(of(W.WYCHODZENIE, W.STWORZENIE_SZANSY, W.ZNAJOMOSC, W.DZIEWICTWO, W.DOBRE_SERCE));

    List<W> rzeczywistosc = of(W._1_OSOBA__DUZO, W.POPRUSZONE_NA_MIEJSCACH, W.X, W.KONTEKST);

    W plansza = DBW.PLANSZA_WARUNKI();
    W najwazniejsze = DBW.NAJWAZNIEJSZE_CECHY_SYTUACJI_POZNANIE_WARUNKI();

    W sprzyjajace = DBW.SPRZYJAJACE_POZNANIE_WARUNKI();
    W niesprzyjajace = DBW.NIE_SPRZYJAJACE_POZNANIE_WARUNKI();

    W extremalne = DBW.EXTREMALNE_SYTUACJE_POZNANIE_WARUNKI();
    W reakcjeKobiet = DBW.REAKCJA_KOBIET_WARUNKI();
    List<W> chcianeSytuacje = DBS.ZBIOR_CHCIANA_SYTUACJA();

    List<W> dopuszczenie = DBW.ZBIOR_DOPUSZCZENIE();

    W potrzebneCechyM = DBW.PRZEWAGI_CHWILI_WARUNKI();
    List<W> osobaChcianeCechy = of(W.REAGUJE, W.STWARZA_SZANSE, W.SWIADOMOSC);

    W miejscaWstepowania = DBW.TYPY_MIEJSC_WARUNKI();
    W typySytuacji = DBW.TYPY_SYTUACJI_WARUNKI();

    List<W> spojrzenia = of(M.spojrzenie_1(W.BEST_CASE), M.spojrzenie_2(W.NORMAL_CASE));

    List<W> zaproszenieRandka = of(M.podkreslJejZlaSytuacje(of(W.NUDA, W.MONOTONIA)), M.podkreslSwojeStrania(), M.znamySie(),
            M.obrazSieJakNieOdpowie(), M.ultimatum(W.KARA));

    List<W> sekwencjaDzialan = of(W.ZASIEG_WZROKU, M.WSPOLNE(W.SPOJRZENIE), M.NABYCIE(W.BLISKOSC), W.MOWA, M.ZAPROSZENIE(W.RANDKA));

    List<W> jakoscSytuacji = of(W.INTERAKCJA, W.KOJARZENIE_Z_DOBREGO, W.ZNAJOMI, W.POTRZEBA, W.WARTOSC, W.UNIKALNOSC_W_OTOCZENIU);

    List<Object> sytuacja = of(W.LUDZIE, najwazniejsze, W.OPCJA_PRZEJSCIE, sprzyjajace, spojrzenia, jakoscSytuacji);

    W cel = W.ZMIANA_SYTUACJI_STANDARDOWEJ;

    List<W> malyDuzy = of(M.MALY_WARUNEK(of(W.WYCHODZENIE, W.OBECNOSC)), M.DUZY_WARUNEK(W.POZNANIE));

    List<W> schemaDzialania = of(W.DOBRA_PLANSZA, W.LADNA, W.CHETNOSC,
            W.MOWA, W.KOMPLEMENT, W.WNIOSKI, W.EMOCJE, W.BECZKA,
            W.DRUGI_RAZ, W.KONTAKT
    );

    M schemaSytuacji00 = new M().sytuacja().Is().podbitka()
            .lub().sytuacja().Is().przeminelo();

    W schemaSytuacji1 = M.WW(of(DBW.NAJWAZNIEJSZE_CECHY_SYTUACJI_POZNANIE_WARUNKI(), DBW.SPRZYJAJACE_POZNANIE_WARUNKI()), "--->",  W.PRZEJSCIE, "--->", W.MOWA)
                        .W_PRZECIWNYM_PRZYPADKU(W.CONTINUE_NUDA)
                        .KONSEKWENCJE(W.NIKT_NIE_REAGUJE);

    M schemaSytuacji2 = o(W.OPCJA_PRZEJSCIE, "-", W.PRZEJSCIE, "-", W.MOWA)
                        .w_przeciwnym_przypadku(W.CONTINUE_NUDA)
                        .konsekwencje(W.NIKT_NIE_REAGUJE);

    M schemaSytuacji3 = new M().zamkniecie(W.ZASOB).zamkniecie(W.INFORMACJA);

    W schemaRelacji = o(W.KOBIETA, "-", jakoscSytuacji, W._II_, W.CHETNOSC, "-", W.RELACJA);

    public void run(){
        W nastawienie = M.ODRAZU(W.BLISKOSC);

        nastawienie = M.WYBOR(of(W.BIERZESZ_CO_JEST, W.WG_OCZEKIWANIA,
                W.BEZ_POPATRZENIA, W.NA_POPATRZENIE, W.NA_CHETNOSC, W.NA_ZNAJOMOSC));

        M.CALY_CZAS(M.SZUKANIE(of(W.KOBIETA, W.OKAZJA)));

        M.W(
                M.wejsciePlansza(DBW.PLANSZA_WARUNKI()),
                of(W.MESKA_PROSYSTUTKA, W.SMIETNIIK_NA_BUZI_JUZ_DAWNO, W.ENK_1_2, W.INFORMACJA)
        );
        M.W(
                of(M.namierzenie()),
                of(M.CALY_CZAS(W.ZASIEG_WZROKU))
        );
        M.W(
                of(M.sondaOsoby(osobaChcianeCechy), M.sondaSytuacji(of(DBW.TYPY_SYTUACJI_WARUNKI(), DBW.NAJWAZNIEJSZE_CECHY_SYTUACJI_POZNANIE_WARUNKI())), M.przewidzenieDrogi()),
                of(W.SYTUACJA)
        );
        M.W(
                of(M.odrazuPochwycenie(W.SYTUACJA), M.dzialanie(DBW.PRZEWAGI_CHWILI_WARUNKI())),
                of(W.BEDZIE_CIEKAWIE, W.ANTY_PARTYZANTKA, W.ANTY_POSLUSZNOSC, W.NIENAWISC_FESTOW, W.JA_DOSTAJE)
        );
        M.W(
                of(M.wstanie(), M.przejscie()),
                of(W.FOCUS, W.CALY_CZAS_BLISKOSC_K)
        );
        M.W(
                of(M.prefix(prefixes, pdstw)),
                of(W.WIDZENIE_NA_ROZMOWA, W.REAKCJA, W.INFO_O_SZANSACH)
        );
        M.W(
                of(M.gadka(tematy, kombo)),
                of(W.NIEUSTANNA_GADKA, W.CALY_CZAS_EFEKTYWNA_GADKA, W.NASTAWIENIE_WZIECIE_KONTAKTU)
        );
        M.W(
                of(M.wziecieKontaktu(), M.temat(), M.ponowienie(), M.temat(), M.ponowienie()),
                of(W.NUMER)
        );
    }

}
