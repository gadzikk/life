package metoda;

import sytuacja.TypSytuacja;
import warunek.W;

import java.util.List;


/**
 * Created by gadzik on 31.12.19.
 */
public class CPU_1_SHORTEST extends AbstractCPU {
    List<W> rzeczywistosc = of(W._1_OSOBA__DUZO, W.POPRUSZONE_NA_MIEJSCACH, W.X, W.KONTEKST);
    List<W> plansza = of(W.LUDZIE, W.KOBIETA, W.STATYSCI, W.POTRZEBA, W.TRANSPORT, W.SCIEZKI);
    List<W> essentials = of(W.DOSTEPNOSC, W.BLISKOSC, W.SZYBKOSC_CHODZENIA, W.INFORMACJA,
            W.ZASIEG_WZROKU, W.ZASIEG_JEJ_WZROKU,
            W.CZAS_START, W.CZAS_KONIEC,
            W.SRODOWISKOWE, W.STALE, W.RESTRYKCYJNE);

    List<W> mojeCechy = of(W.SPRYT, W.SZYBKOSC, W.SILA, W.ANTY_POSLUSZNOSC, W.ZMUSZASZ, W.WYJEBKA_NA_WLASNE_ZMECZENIE);
    List<W> osobaCechy = of(W.REAGUJE, W.STWARZA_POINTCUT, W.SWIADOMOSC);

    List<TypSytuacja> typySytuacji = of(TypSytuacja.UNIKALNA, TypSytuacja.CHCIANA, TypSytuacja.W_HOTMIEJSCU, TypSytuacja.DEFAULTOWA,
            TypSytuacja.RESTRYKCYJNA, TypSytuacja.KRYZYSOWA);

    List<W> allSprzyjajace = of(W.PRETEKST, W.KONTEKST, W.NUDA,
            W.WZGL_IZOLACJA, W.DLUGA_DOSTEPNOSC, W.BEZRUCH, W.OSZCZEDNOSC_CZASU, W.MALA_TRUDNOSC, W.MALY_WYSILEK, W.MALA_DROGA, W.MALY_PRZYPAL,
            W.SAMA, W.Z_KOLEZANKA, W.Z_RODZINA);
    List<W> allNiesprzyjajace = of(W.TLUM, W.ZMECZENIE, W.CISZA, W.MOZLIWE_SLUCHAWKI);

    List<String> spojrzenia = of(M.spojrzenie_1(W.BEST_CASE), M.spojrzenie_2(W.NORMAL_CASE));
    List<String> zaproszenieRandka = of(M.podkreslJejZlaSytuacje(of(W.NUDA, W.MONOTONIA)), M.podkreslSwojeStrania(), M.znamySie(),
            M.obrazSieJakNieOdpowie(), M.ultimatum(W.KARA));

    List<W> extremalne = of(W.IDZIESZ_ZAWRACASZ, W.PRZECIWNY_PRZYSTANEK, W.SIEDZISZ_PRZEJSCIE, W.ONA_SWOJE_GRONO);

    List<W> jakoscSytuacji = of(W.INTERAKCJA, W.KOJARZENIE_Z_DOBREGO, W.ZNAJOMI, W.POTRZEBA, W.WARTOSC, W.UNIKALNOSC_W_OTOCZENIU);

    List<W> sytuacja = of(W.LUDZIE, essentials, W.OPCJA_PRZEJSCIE, allSprzyjajace, spojrzenia, jakoscSytuacji);

    W cel = W.ZMIANA_SYTUACJI_DEFAULTOWEJ;

    List<W> schemaDzialania = of(W.DOBRA_PLANSZA, W.LADNA, W.CHETNOSC,
            W.MOWA, W.KOMPLEMENT, W.WNIOSKI, W.EMOCJE, W.BECZKA,
            W.DRUGI_RAZ, W.KONTAKT
    );

    M schemaSytuacji00 = new M().sytuacja().Is().podbitka()
            .lub().sytuacja().Is().przeminelo();

    M schemaSytuacji1 = o(essentials, W._II_, allSprzyjajace, "-", W.PRZEJSCIE, "-", W.MOWA)
            .otherwise(W.CONTINUE_NUDA)
            .konsekwencje(W.NIKT_NIE_REAGUJE);

    M schemaSytuacji2 = o(W.OPCJA_PRZEJSCIE, "-", W.PRZEJSCIE, "-", W.MOWA)
                        .otherwise(W.CONTINUE_NUDA)
                        .konsekwencje(W.NIKT_NIE_REAGUJE);

    M schemaSytuacji3 = new M().zamkniecie(W.ZASOB).zamkniecie(W.INFORMACJA);

    W schemaRelacji = o(W.KOBIETA, "-", jakoscSytuacji, W._II_, W.CHETNOSC, "-", W.RELACJA);

    public void run(){
        new MW(
                of(M.wejsciePlansza(plansza)),
                of(W.MESKA_PROSYSTUTKA, W.SMIETNIIK_NA_BUZI_JUZ_DAWNO, W.ENK_1_2, W.INFORMACJA)
        );
        new MW(
                of(M.namierzenie()),
                of(W.THREAD_WHILE_LOOP_ZASIEG_WZROKU)
        );
        new MW(
                of(M.sondaOsoby(osobaCechy), M.sondaSytuacji(typySytuacji, essentials)),
                of(W.SYTUACJA)
        );
        new MW(
                of(M.odrazuPochwycenie(W.SYTUACJA), M.dzialanie(mojeCechy)),
                of(W.BEDZIE_CIEKAWIE, W.ANTY_PARTYZANTKA, W.ANTY_POSLUSZNOSC, W.NIENAWISC_FESTOW, W.JA_DOSTAJE)
        );
        new MW(
                of(M.wstanie(), M.przejscie()),
                of(W.FOCUS, W.THREAD_WHILE_LOOP_BLISKOSC_K)
        );
        new MW(
                of(M.prefix(prefixes, pdstw)),
                of(W.WIDZENIE_NA_ROZMOWA, W.REAKCJA, W.INFO_O_POINTCUT)
        );
        new MW(
                of(M.gadka(tematy, kombo)),
                of(W.NIEUSTANNA_GADKA, W.THREAD_WHILE_LOOP_EFEKTYWNA_GADKA, W.NASTAWIENIE_WZIECIE_KONTAKTU)
        );
        new MW(
                of(M.wziecieKontaktu(), M.temat(), M.ponowienie(), M.temat(), M.ponowienie()),
                of(W.NUMER)
        );
    }

}
