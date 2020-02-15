package metoda;

import temat.TT;
import typy_bazowe.TypT;

/**
 * Created by gadzik on 14.02.20.
 */
public class CPU_KOMBINACJA extends AbstractCPU {
    public void run(){
        new TM(TypT.BUTY,
                of(
                        M.DEEP(of(TypT.KOLOR, TypT.WYGODA, TypT.OSTATNIO_WIDZIANE, TypT.ZAKUPY)),
                        M.WNIOSKI(of(TypT.DOBRY_GUST, TypT.DOBRE_OKO)),
                        M.KONTRA(),
                        M.ZMIANA(of(TypT.WYGLAD, TypT.MAKIJAZ, TypT.TOREBKA, TypT.WLOSY, TypT.UBRANIE,
                                TypT.CEL))
                )
        );
        new TM(TypT.ZAKUPY,
                of(
                        M.DEEP(of(TypT.MIEJSCE, TypT.BLISKO_DALEKO, TypT.PRZESTRZEN, TypT.WYSTROJ, TypT.OKOLICA, TypT.OSTATNIO_KUPIONE,
                                TypT.OSTATNIO_PRZEZYTE, TypT.TLOK, TypT.POPULARNOSC, TypT.DOJAZD,
                                TypT.PROMOCJE, TypT.PORA_ROKU_SPRZYJAJACA, TypT.RESTAURACJE_WOKOL)),
                        M.WNIOSKI(),
                        M.KONTRA(),
                        M.ZMIANA(of(TypT.ZAJECIA_WOLNEGO_CZASU))
                )
        );
        new TM(TypT.CEL,
                of(
                        M.DEEP(of(TypT.PRACA, TypT.DAILY_WORRIES, TypT.CYKL_DNIA)),
                        M.WNIOSKI(),
                        M.KONTRA(),
                        M.ZMIANA(of(TypT.ZAJECIA_WOLNEGO_CZASU))
                )
        );
        new TM(TypT.ZAJECIA_WOLNEGO_CZASU,
                of(
                        M.DEEP(of(TypT.KLUBY, TypT.ZAKUPY, TypT.SPORT)),
                        M.WNIOSKI(),
                        M.KONTRA(),
                        M.ZMIANA(of(TypT.ZAJECIA_WOLNEGO_CZASU))
                )
        );
        new TM(TypT.KLUBY,
                of(
                        M.DEEP(of(TypT.MIEJSCE, TypT.BLISKO_DALEKO, TypT.PRZESTRZEN, TypT.WYSTROJ, TypT.OKOLICA,
                                TypT.OSTATNIO_PRZEZYTE, TypT.TLOK, TypT.POPULARNOSC, TypT.DOJAZD
                        )),
                        M.WNIOSKI(),
                        M.KONTRA(),
                        M.ZMIANA(of(TypT.ZAJECIA_WOLNEGO_CZASU))
                )
        );
        new TM(TypT.SPORT,
                of(
                        M.DEEP(of(TypT.MIEJSCE, TypT.BLISKO_DALEKO, TypT.PRZESTRZEN, TypT.WYSTROJ, TypT.OKOLICA,
                                TypT.OSTATNIO_PRZEZYTE, TypT.TLOK, TypT.POPULARNOSC, TypT.DOJAZD
                        )),
                        M.WNIOSKI(),
                        M.KONTRA(),
                        M.ZMIANA(of(TypT.ZAJECIA_WOLNEGO_CZASU))
                )
        );
    }

}
