package metoda;

import warunek.W;

import java.util.List;

import static typy_bazowe.TypOsoby.ME;
import static typy_bazowe.TypOsoby.SOMEONE;

/**
 * Created by gadzik on 05.01.20.
 */
public class CPU_PRACA extends AbstractCPU {
//    List<W> globalneWarunki =
    List<W> warunki = of(W.PROJEKTY, W.TECHNOLOGIE, W.MANAGEROWIE, W.LUDZIE);
    List<W> ludzieWarunki = of(W.KONFIDENCI, W.ZAWISTNI, W.ZE_WSI, W.BURZUAZJA, W.FESTY, W.CZYCHA_NA_BLAD, W.DZIWNA_PASJA, W.POSLUSZNY);
    List<W> managoWarunki = of(W.TECHNICZNOSC, W.FEST, W.SYSTEMOWIEC, W.BURZUAZJA, W.STABILNY, W.POSLUSZNY);
    List<W> tyVSmanago = of(W.STOSUNEK1VS1, W.ATMOSFERA, W.UZYTECZNOSC);
    List<W> satysfakcjaZPracy = of(W.DOBRY_PROJEKT, W.SZCZEGOLOWE_REQUIREMENTY, W.PROJEKT_UZYTECZNY, W.NOWE_NARZEDZIA, W.MANAGO_TECHNICZNY);
    List<W> zyskiZPracy = of(W.WIEDZA, W.CZAS, W.JEDZENIE, W.DOSWIADCZENIE, W.CHOROBOWE, W.CENTRUM, W.PIENIADZE, W.ODPOCZYNEK, W.PLANSZA);
    List<W> stratyZPracy = of(W.STRATA_CZASU, W.ZMECZENIE, W.WKURWIENIE, W.STRES, W.INTERAKCJA_Z_FESTAMI);
    List<W> kontrola = of(W.PATRZENIE_MONITOR, W.DAILY, W.WEEKLY, W.COMMITY);

    public void run(){

        new WMWMWM(of(W.WIEDZA, W.NISZA, W.BOGATY_SEKTOR),
                of(
                        M.hajs_t()
                ),
                of(W.NISZA),
                of(
                        M.szanuj_t()
                ),
                of(W.INTERVIEW, W._88_, W.KONKURENCJA),
                of(
                        M.swoi_t(),
                        M.walkaKlas_on()
                )
        );
        new WM(of(W.MULTICULTI),
                of(
                        M.rasizm_on()
                )
        );
        new WMWMWM(of(W.KORPO),
                of(
                        M.poprawnoscPolityczna_on(),
                        M.GRANT(SOMEONE, W.MOZLIWOSC_MALO_PRACY)
                ),
                of(W.OPEN_SPACE),
                of(
                        _100osob.patrzy(ME)
                ),
                of(W.STALO_SIE),
                of(
                        _100osob.kabluje(ME)
                )
        );
        new WM(of(W.SZUKASZ_PRACY),
                of(
                        M.NEEDED(of(W.DWA_MIESIACE))
                )
        );
        new WM((WYMAGANIA_WSTEPNE_ZARABIANIE),
                of(
                        M.GRANT(ME,W.PRACA)
                )
        );
        praca();
        zachowanie();
        szponcenie();
    }
    public void praca(){
        M.GRANT(ME, of(W.BEZPIECZENSTWO, W.PIENIADZE, W.SZANSA_KOBIETA));
        osoba.peleryna_on();
        osoba.tylkoHajs_on();
        new WM(of(W.WESZLES_DO_FIRMY),
                of(
                        M.pracuj(of(W.LUDZIE_WOKOL, W.ATMOSFERA, W.MANAGER)),
                        M.lapKontakt(W.LUDZIE_WOKOL),
                        M.usmiechajSie(),
                        M.ORIENT(of(W.TEMPO_PRACA, W.MANAGO_TECHNICZNY, W.GODZINY_PRZYJSCIA, W.DLUGOSC_PRZERWY, W.SCINANIE))
                )
        );

        new WM(of(W.WYSILEK, W.REZULTATY, W.OPLACA_SIE, W.UZYTECZNOSC, W.MANAGO_DOBRA_OPINIA),
                of(
                        M.thread_while_loop(W.UTRZYMANIE_PRACY)
                )
        );
        manago.setStatus(W.POSLUSZNY);
        manago.setStatus(W.STRAZNIK_PRAWA);
        manago.wyjebane(of(W.ZASOB_ZYCIE_PRYWATNE, W.ZASOB_CZAS));
        manago.thread_while_loop(W.KONTROLA);
        manago.set(W.ZDOLNOSC_ATAKU);
        M.REMOVE(ME, W.ZDOLNOSC_ATAKU);

        new WM(of(M.isNiedajeRady(zasob)),
                of(
                        manago.teoriaPrzesuwania(zasob)
                )
        );
        new WM(of(W.TWORZYSZ_PROBLEMY, W._II_, W.PSUJESZ_ATMOSFERE, W._II_, W._NOT_, W.FINE),
                of(
                        manago.ostry(ME)
                )
        );

        new WM(of(M.isNieOplacalny(zasob)),
                of(
                        manago.zwolnij(zasob)
                )
        );
    }
    public void zachowanie(){
        new WM(of(W.TASK),
                of(
                        M.zapisz(W.TASK),
                        M.przymiezenieDoDzialania(),
                        M.check(W.ZEGAR, W.DATA),
                        M.estymacja(),

                        M.idea(),
                        M.kartkaSteps(),
                        M.kodFunkcjonalny(),
                        M.test(),
                        M.refactor()
                )
        );
        new WM(of(M.interakcja(manago)),
                of(
                        M.glaskaszPoGlowie(manago)
                )
        );
        new WM(of(W.BURZUAZJA),
                of(
                        M.REMIND(ME, of(W.POPRAWNOSC_POLITYCZNA, W.ATMOSFERA, W.ZYSK, W.STRATA)),
                        M.ucinaj()
                )
        );
    }

    public void szponcenie(){
        new WMWM(of(W.TASK),
                of(
                        opponent.zlecNieszczegolowo(W.TASK),
                        opponent.zjeb(W.NIEWYKONANIE, W.TASK)
                ),
                of(W.ZALEZNY_TASK),
                of(
                        opponent.zjeb(W.ZALEZNY_TASK, W.TASK)
                )
        );

        new WM(of(W.NIEPOKOJACE),
                of(
                        zaniepokojeni.potwierdzajaZInnymi(W.NIEPOKOJACE),
                        M.robWrazenie(of(W.PROGRAMISTA, W.PASJONAT, W.NIUNIUS)),
                        M.zalagodz(W.GADKA)
                )
        );
        opponent.rozpoznanieGdzieUderzyc(W.GADKA);
        opponent.prowokuj(of(
                M.podwazanieArgumentow(), M.wysmianie(), M.ponizanie())
        );
        opponent.stawiajWZlymSwietle(ME, _100osob, of(
                M.plotkuj(), M.wysmiewaj()
        ));
        opponent.kabluj(ME, manago);
    }

}
