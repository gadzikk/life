package metoda;

import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 19.11.20.
 */
public class CPU_ROZWOJU_CZLOWIEKA extends AbstractCPU {
    List<W> ksztaltowanieCzlowieka = KSZTALTOWANIE_CZLOWIEKA_WARUNKI;

    public void run() {
        przedzialyCzasowe();
    }

    public void przedzialyCzasowe() {
        M.W(OD(1), "--->", W.ROZUMIENIE);
        M.W(OD(3), "--->", W.MOWA);
        M.W(OD(3), "--->", W.BOZIA);

        M.W(OD(4).TO(18), "--->", W.PILKA_NOZNA);
        M.W(T0(5), "--->", M.DAM(M.BRAK(W.PRACA)));
        M.W(OD(5), "--->", M.DAM(M.WYMAGANIE(W.PRACA)));
        M.W(T0(5), "--->", M.TOLERANCJA(W.PLACZ));
        M.W(OD(5), "--->", M.WYMAGANIE(M.BRAK(W.PLACZ)));

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
