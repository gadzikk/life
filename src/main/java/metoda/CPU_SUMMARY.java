package metoda;

import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 24.08.20.
 */
public class CPU_SUMMARY extends AbstractCPU {
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
                .otherwise(W.CONTINUE_NUDA)
                .konsekwencje(W.POWIE_DO_KOLEZANKI);

        M schemaSytuacji3 = new M().zamkniecie(W.ZASOB).zamkniecie(W.INFORMACJA);

        W chcianyWarunek = W.WZGL_IZOLACJA;
        List<W> tematy = of(W.KOMBINACJA_TEMATOW, W.TOPICS);
    }

    public void ludzie() {
        M.W(W.DOBRY, "--->", of(M.wykorzystujeOkazjeDobro(), M.dobro()));
        M.W(W.ZLY, "--->", of(M.stwarzaOkazjeZlo(), M.zlo()));

        M.W(W.FEST, "--->", of(M.budzaceEmocjeWow(), M.wdupcanieOstatnichKolegow()));
        M.W(W.WIESNIAK, "--->", of(M.bezpieczneBezSensu(), M.strefaKomfortu(), M.cisnieIleMozna()));
        M.W(W.BURZUA, "--->", of(M.impreza(), M.melanz(), M.zwiazki(), M.znajomi(), M.przyjemnosci()));
        M.W(W.OSIEDLOWY_SLABY, "--->", of(M.nieudolneDzialanie(), M.wszystkoSlabo(), M.strefaKomfortu()));
        M.W(W.BIEGACZ, "--->", of(M.wjazd(), M.cpanie(), M.mecz(), M.siedzenieOsiedle()));
        M.W(W.OSIEDLOWY_MOCNY, "--->", of(M.dobreDzialanie(), M.wszystkoDobrze(), M.pozaStrefaKomfortu()));
        M.W(W.GRUBAS_Z_PRZEWAGA, "--->", of(M.rozkazyNizszym(), M.bawSie()));
        M.W(W.PRACOWNIK_KORPORACJI, "--->", of(M.praca(), M.podroze(), M.dom()));
        M.W(W.FEST_FOLWARCZANY, "--->", of(M.odbierzWartosc(), M.dzialaWedleWidzimisie()));
        M.W(W.MANAGER, "--->", of(M.wykorzystajZasob(), M.ukryjDostep()));
    }
}
