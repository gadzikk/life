package watek;

import metoda.M;
import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 24.08.20.
 */
public class Watek_SUMMARY extends AbstractWatek {
    // U
    public void ulica() {
        List<W> ulicaConditions = of(W.PUSTKA, W.PRZEWAGA, W.AGRESJA_W_DZIALANIU, W.OBECNOSC);

        M.W(of(M.PROSTO(W.ZLO)), "--->", of(W.AKTYWNA_KONTRA));
    }
    // K
    public void kobiety() {
        M.WW(M.MOCNO(W.OKAZJA), "->" , M.EFEKTYWNA_GADKA(W.ZAGADANIE), "->" , M.PILNOWANIE_BLISKOSC(W.PRZEGADANIE));

        M schemaSytuacji00 = new M().sytuacja().Is().podbitka()
                .lub().sytuacja().Is().przeminelo();

        M schemaSytuacji2 = o(W.OPCJA_PRZEJSCIE, "-", W.BLISKOSC, "-", W.MOWA)
                .w_przeciwnym_przypadku(W.CONTINUE_NUDA)
                .konsekwencje(W.POWIE_DO_KOLEZANKI);

        M schemaSytuacji3 = new M().zamkniecie(W.ZASOB).zamkniecie(W.INFORMACJA);

        W chcianyWarunek = W.WZGL_IZOLACJA;
        List<W> tematy = of(W.KOMBINACJA_TEMATOW, W.TOPICS);
    }


}