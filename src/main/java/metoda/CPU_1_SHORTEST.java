package metoda;

import warunek.W;

import java.util.List;


/**
 * Created by gadzik on 31.12.19.
 */
public class CPU_1_SHORTEST extends AbstractCPU {
    List<W> rzeczywistosc = of(W._1_OSOBA__DUZO, W.POPRUSZONE_NA_MIEJSCACH, W.X, W.KONTEKST);

    List<W> plansza = PLANSZA_WARUNKI;
    List<W> essentials = ESSENTIALS_SYTUACJE;

    List<W> allSprzyjajace = SPRZYJAJACE_WARUNKI;
    List<W> allNiesprzyjajace = NIE_SPRZYJAJACE_WARUNKI;

    List<W> extremalne = EXTREMALNE_SYTUACJE;
    List<W> reakcjeKobiet = REAKCJA_KOBIET_WARUNKI;
    List<W> chcianeSytuacje = CHCIANA_SYTUACJE;

    List<W> dopuszczenie = KATEGORIA_DOPUSZCZENIE_WARUNKI;

    List<W> mojeCechy = of(W.SPRYT, W.SZYBKOSC, W.SILA, W.ANTY_POSLUSZNOSC, W.ZMUSZASZ, W.WYJEBKA_NA_WLASNE_ZMECZENIE);
    List<W> osobaChcianeCechy = of(W.REAGUJE, W.STWARZA_POINTCUT, W.SWIADOMOSC);

    List<W> typySytuacji = TYPY_SYTUACJI;

    List<W> spojrzenia = of(M.spojrzenie_1(W.BEST_CASE), M.spojrzenie_2(W.NORMAL_CASE));
    List<W> zaproszenieRandka = of(M.podkreslJejZlaSytuacje(of(W.NUDA, W.MONOTONIA)), M.podkreslSwojeStrania(), M.znamySie(),
            M.obrazSieJakNieOdpowie(), M.ultimatum(W.KARA));

    List<W> jakoscSytuacji = of(W.INTERAKCJA, W.KOJARZENIE_Z_DOBREGO, W.ZNAJOMI, W.POTRZEBA, W.WARTOSC, W.UNIKALNOSC_W_OTOCZENIU);

    List<Object> sytuacja = of(W.LUDZIE, essentials, W.OPCJA_PRZEJSCIE, allSprzyjajace, spojrzenia, jakoscSytuacji);

    W cel = W.ZMIANA_SYTUACJI_DEFAULTOWEJ;

    List<W> malyDuzy = of(M.MALY_WARUNEK(of(W.WYCHODZENIE, W.OBECNOSC)), M.DUZY_WARUNEK(W.ZAGADANIE));

    List<W> schemaDzialania = of(W.DOBRA_PLANSZA, W.LADNA, W.CHETNOSC,
            W.MOWA, W.KOMPLEMENT, W.WNIOSKI, W.EMOCJE, W.BECZKA,
            W.DRUGI_RAZ, W.KONTAKT
    );

    M schemaSytuacji00 = new M().sytuacja().Is().podbitka()
            .lub().sytuacja().Is().przeminelo();

    M schemaSytuacji1 = o(essentials, W._II_, allSprzyjajace, "-", W.PRZEJSCIE, "-", W.MOWA)
            .w_przeciwnym_przypadku(W.CONTINUE_NUDA)
            .konsekwencje(W.NIKT_NIE_REAGUJE);

    M schemaSytuacji2 = o(W.OPCJA_PRZEJSCIE, "-", W.PRZEJSCIE, "-", W.MOWA)
                        .w_przeciwnym_przypadku(W.CONTINUE_NUDA)
                        .konsekwencje(W.NIKT_NIE_REAGUJE);

    M schemaSytuacji3 = new M().zamkniecie(W.ZASOB).zamkniecie(W.INFORMACJA);

    W schemaRelacji = o(W.KOBIETA, "-", jakoscSytuacji, W._II_, W.CHETNOSC, "-", W.RELACJA);

    public void run(){
        W nastawienie = M.ODRAZU(W.BLISKOSC);

        nastawienie = M.WYBOR(of(W.BIERZESZ_CO_JEST, W.WG_OCZEKIWANIA,
                W.BEZ_POPATRZENIA, W.NA_POPATRZENIE, W.NA_CHETNOSC, W.NA_ZNAJOMOSC));

        M.thread_while_loop(M.SZUKANIE(of(W.KOBIETA, W.OKAZJA)));

        M.W(
                of(M.wejsciePlansza(plansza)),
                of(W.MESKA_PROSYSTUTKA, W.SMIETNIIK_NA_BUZI_JUZ_DAWNO, W.ENK_1_2, W.INFORMACJA)
        );
        M.W(
                of(M.namierzenie()),
                of(M.thread_while_loop(W.ZASIEG_WZROKU))
        );
        M.W(
                of(M.sondaOsoby(osobaChcianeCechy), M.sondaSytuacji(typySytuacji, essentials), M.przewidzenieDrogi()),
                of(W.SYTUACJA)
        );
        M.W(
                of(M.odrazuPochwycenie(W.SYTUACJA), M.dzialanie(mojeCechy)),
                of(W.BEDZIE_CIEKAWIE, W.ANTY_PARTYZANTKA, W.ANTY_POSLUSZNOSC, W.NIENAWISC_FESTOW, W.JA_DOSTAJE)
        );
        M.W(
                of(M.wstanie(), M.przejscie()),
                of(W.FOCUS, W.THREAD_WHILE_LOOP_BLISKOSC_K)
        );
        M.W(
                of(M.prefix(prefixes, pdstw)),
                of(W.WIDZENIE_NA_ROZMOWA, W.REAKCJA, W.INFO_O_POINTCUT)
        );
        M.W(
                of(M.gadka(tematy, kombo)),
                of(W.NIEUSTANNA_GADKA, W.THREAD_WHILE_LOOP_EFEKTYWNA_GADKA, W.NASTAWIENIE_WZIECIE_KONTAKTU)
        );
        M.W(
                of(M.wziecieKontaktu(), M.temat(), M.ponowienie(), M.temat(), M.ponowienie()),
                of(W.NUMER)
        );
    }

}
