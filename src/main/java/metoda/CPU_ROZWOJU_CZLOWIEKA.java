package metoda;

import warunek.W;

import java.util.List;

import static typy_bazowe.TypOsoby.ME;

/**
 * Created by gadzik on 19.11.20.
 */
public class CPU_ROZWOJU_CZLOWIEKA extends AbstractCPU {
    List<W> ksztaltowanieCzlowieka = KSZTALTOWANIE_CZLOWIEKA_WARUNKI;

    public void run() {
        M.W(M.DUZE_ILOSC(of(W.MIESO, W.NABIAL, W.WODA)), "--->", of(W.SILA, W.PRAWIDLOWY_ROZWOJ));

        M.W(W.MOCNY_WZROK, "--->", M.POTRZEBA(of(W.WYSILEK_FIZYCZNY, W.WYSILEK_UMYSLOWY)));

        M.W(of(M.DLUGO(SPORT_WARUNKI), W.WYSILEK_UMYSLOWY), "--->", of(W.KREGOSLUP_MORALNY, W.ZDOLNOSC_DO_WYSILKU,
                                                                                  W.ZDOLNY_DO_WALKI, W.WNIOSKI, W.PODSWIADOMOSC, W.WIEDZA_SPORT));


        przedzialyCzasowe();
    }

    public void przedzialyCzasowe() {
        M.W(OD(1), "--->", W.ROZUMIENIE);
        M.W(OD(1).TO(6), "--->", M.NAUKA(W.MOWA));
        M.W(OD(3), "--->", W.MOWA);
        M.W(OD(3), "--->", W.BOZIA);

        M.W(OD(4).TO(18), "--->", W.PILKA_NOZNA);
        M.W(T0(5), "--->", M.DAM(M.BRAK(W.PRACA)));
        M.W(OD(5), "--->", M.DAM(M.WYMAGANIE(W.PRACA)));
        M.W(T0(5), "--->", M.TOLERANCJA(W.PLACZ));
        M.W(OD(5), "--->", M.WYMAGANIE(M.BRAK(W.PLACZ)));

        M.W(OD(5).TO(7), "--->", M.NAUKA(of(W.CZYTANIE, W.LICZENIE)));

        M.W(OD(6), "--->", M.POZNANIE(W.NAUKA));
        M.W(OD(7), "--->", W.BOKS);
        M.W(OD(15), "--->", M.PRAWDZIWA(W.NAUKA));
        M.W(OD(15), "--->", M.PRAWDZIWY(W.BOKS));

        M.W(OD(20), "--->", W.DOJRZALOSC);
        M.W(OD(25), "--->", W.NA_SWOIM);

        M.W(T0(30), "--->", W.MLODY);
        M.W(OD(30).TO(68), "--->", W.SREDNI_WIEK);
        M.W(OD(60), "--->", W.STARY);
    }
}
