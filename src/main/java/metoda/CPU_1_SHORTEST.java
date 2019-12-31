package metoda;

import sytuacja.TypSytuacja;
import warunek.Warunek;

import java.util.List;


/**
 * Created by gadzik on 31.12.19.
 */
public class CPU_1_SHORTEST extends AbstractCPU {
    List<Warunek> plansza = of(Warunek.LUDZIE,Warunek.POTRZEBA, Warunek.TRANSPORT, Warunek.SCIEZKI);
    List<Warunek> essentials = of(Warunek.DOSTEPNOSC, Warunek.BLISKOSC, Warunek.SZYBKOSC_CHODZENIA, Warunek.INFORMACJA,
            Warunek.ZASIEG_WZROKU, Warunek.ZASIEG_JEJ_WZROKU,
            Warunek.CZAS_START, Warunek.CZAS_KONIEC,
            Warunek.SRODOWISKOWE, Warunek.STALE, Warunek.RESTRYKCYJNE);

    List<Warunek> mojeCechy = of(Warunek.SPRYT, Warunek.SZYBKOSC, Warunek.SILA);
    List<Warunek> osobaCechy = of(Warunek.REAGUJE, Warunek.STWARZA_POINTCUT);

    List<TypSytuacja> typySytuacji = of(TypSytuacja.UNIKALNA, TypSytuacja.CHCIANA, TypSytuacja.W_HOTMIEJSCU, TypSytuacja.DEFAULTOWA,
            TypSytuacja.RESTRYKCYJNA, TypSytuacja.KRYZYSOWA);


    public void run(){
        new MW(
                of(M.wejsciePlansza(plansza)),
                of(Warunek.SMIETNIIK_NA_BUZI_JUZ_DAWNO, Warunek.ENK_1_2, Warunek.INFORMACJA)
        );
        new MW(
                of(M.namierzenie()),
                of(Warunek.THREAD_WHILE_LOOP_ZASIEG_WZROKU)
        );
        new MW(
                of(M.sondaOsoby(osobaCechy), M.sondaSytuacji(typySytuacji, essentials)),
                of(Warunek.SYTUACJA)
        );
        new MW(
                of(M.odrazuPochwycenie(Warunek.SYTUACJA), M.dzialanie(mojeCechy)),
                of(Warunek.BEDZIE_CIEKAWIE, Warunek.ANTY_PARTYZANTKA)
        );
        new MW(
                of(M.wstanie(), M.przejscie()),
                of(Warunek.FOCUS, Warunek.THREAD_WHILE_LOOP_BLISKOSC_K)
        );
        new MW(
                of(M.prefix(prefixes, pdstw)),
                of(Warunek.WIDZENIE_NA_ROZMOWA, Warunek.REAKCJA, Warunek.INFO_O_POINTCUT)
        );
        new MW(
                of(M.gadka(tematy)),
                of(Warunek.NIEUSTANNA_GADKA, Warunek.EFEKTYWNA_GADKA)
        );
        new MW(
                of(M.wziecieKontaktu(), M.temat(), M.ponowienie(), M.temat(), M.ponowienie()),
                of(Warunek.NUMER)
        );
    }

}
