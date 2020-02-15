package metoda;

import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 05.01.20.
 */
public class CPU_SJ extends AbstractCPU {
    List<W> warunki = of(W.SAMOTNOSC, W.BRAK_ZWIAZKU, W.BRAK_SRODOWISKA,
            W.BRAK_CZASU_CODZIENNE, W.BRAK_CZASU_ROCZNE,
            W.PRACA, W.ZERO_ZYSKU_ZYCIOWO, W.PIENIADZE
    );

    List<W> cechy = of(W.NIEPRZEKUPNY
    );
}
