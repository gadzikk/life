package metoda;

import db.DBT;
import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 14.02.20.
 */
public class Watek_KOMBINACJA_TEMAT extends AbstractWatek {
    List<W> tematy = DBT.ZBIOR_TEMATY();

    public void run(){
        M.W(W.BUTY,
                of(
                        M.DEEP(of(W.KOLOR, W.WYGODA, W.OSTATNIO_WIDZIANE, W.ZAKUPY)),
                        M.WNIOSKI(of(W.DOBRY_GUST, W.DOBRE_OKO)),
                        M.KONTRA(),
                        M.ZMIANA(of(W.WYGLAD, W.MAKIJAZ, W.TOREBKA, W.WLOSY, W.UBRANIE, W.CEL))
                )
        );
        M.W(W.ZAKUPY,
                of(
                        M.DEEP(of(W.MIEJSCE, W.BLISKO_DALEKO, W.PRZESTRZEN, W.WYSTROJ, W.OKOLICA, W.OSTATNIO_KUPIONE,
                                W.OSTATNIO_PRZEZYTE, W.TLOK, W.POPULARNOSC, W.DOJAZD,
                                W.PROMOCJE, W.PORA_ROKU_SPRZYJAJACA, W.RESTAURACJE_WOKOL)),
                        M.WNIOSKI(),
                        M.KONTRA(),
                        M.ZMIANA(of(W.ZAJECIA_WOLNEGO_CZASU))
                )
        );
        M.W(W.CEL,
                of(
                        M.DEEP(of(W.PRACA, W.DAILY_WORRIES, W.CYKL_DNIA)),
                        M.WNIOSKI(),
                        M.KONTRA(),
                        M.ZMIANA(of(W.ZAJECIA_WOLNEGO_CZASU))
                )
        );
        M.W(W.ZAJECIA_WOLNEGO_CZASU,
                of(
                        M.DEEP(of(W.KLUBY, W.ZAKUPY, W.SPORT)),
                        M.WNIOSKI(),
                        M.KONTRA(),
                        M.ZMIANA(of(W.ZAJECIA_WOLNEGO_CZASU))
                )
        );
        M.W(W.KLUBY,
                of(
                        M.DEEP(of(W.MIEJSCE, W.BLISKO_DALEKO, W.PRZESTRZEN, W.WYSTROJ, W.OKOLICA,
                                W.OSTATNIO_PRZEZYTE, W.TLOK, W.POPULARNOSC, W.DOJAZD
                        )),
                        M.WNIOSKI(),
                        M.KONTRA(),
                        M.ZMIANA(of(W.ZAJECIA_WOLNEGO_CZASU))
                )
        );
        M.W(W.SPORT,
                of(
                        M.DEEP(of(W.MIEJSCE, W.BLISKO_DALEKO, W.PRZESTRZEN, W.WYSTROJ, W.OKOLICA,
                                W.OSTATNIO_PRZEZYTE, W.TLOK, W.POPULARNOSC, W.DOJAZD
                        )),
                        M.WNIOSKI(),
                        M.KONTRA(),
                        M.ZMIANA(of(W.ZAJECIA_WOLNEGO_CZASU))
                )
        );
    }

}
