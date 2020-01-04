package metoda;

import warunek.W;

import java.util.List;

import static typy_bazowe.TypOsoby.ME;

/**
 * Created by gadzik on 02.01.20.
 */
public class CPU_ALL extends AbstractCPU {
    W warunekWejsciowy = W.ZLO_NA_CZUBKU_STOSU;
    List<W> stan = of(W.WYSILEK_UMYSLOWY, W.WYSILEK_FIZYCZNY, W.DUZO_ZARCIA, W.WZROK, W.SAMOPOCZUCIE);

    List<W> warunki = of(W.OBECNOSC, W.PLANSZA, W.CZAS_START,W.CZAS_KONIEC, W.FOCUS, W.ZMECZENIE, W.BLISKOSC, W.DOSTEPNOSC);
    List<W> jakoscSytuacji = of(W.INTERAKCJA, W.ZNAJOMI, W.POTRZEBA,W.WARTOSC, W.UNIKALNOSC_W_OTOCZENIU);

    List<W> przyczyny = of(W.MODA, W.PRZEWAGA, W.NUDA, W.UCZUCIE, W.CIEKAWOSC, W.ZAZDROSC, W.PRZYMUS);
    List<String> metodySzponcnia = of(M.klamstwo(), M.obelgi_ponizanie(), M.przekonywanie(), M.bojka());

    public void run(){
        new WM(
                of(W.ZAUWAZYLEM, W._II_, W.USLYSZALEM),
                of(
                        M.GRANT(ME,W.PRZEWAGA_CZASU),
                        M.GRANT(ME,W.PRZEWAGA_INFORMACJI),
                        M.pochwycenie(),
                        M.dzialanie(W.WIEDZA),
                        M.osiagniecie(),
                        M.utrzymanie()
                )
        );
        new WMWM(
                of(W.PRACA),
                of(
                        M.wszystkoAbyOtrzymacRezultat(),
                        M.doSedna(),
                        M.doKonca()
                ),
                of(W.NA_PLANSZY),
                of(
                        M.doSedna(),
                        M.doKonca()
                )
        );
        new WMWM(
                of(W.WARUNEK),
                of(
                        M.sondujJakDaleki(W.WARUNEK),
                        M.sondujJakSilny(W.WARUNEK)
                ),
                of(W.WIDZISZ_DZIALANIE),
                of(
                        M.sondaPrzyczyn(przyczyny)
                )
        );
        new WM(of(W._NOT_, W.WARUNEK_A),
                of(
                        M.dzialanieNad(W.WARUNEK_B)
                )
        );
        new WM(of(W.ZAGROZENIE),
                of(
                        M.widziszTylkoPlusy(),
                        M.namierzPotencjalnyZysk(),
                        M.namierzZagrozenia(),
                        M.praca()
                )
        );
        new WMWM(of(W.NORMALNA_SYTUACJA),
                of(
                        M.niedopuscDoZlejSytuacji(W.WIEDZA)
                ),
                of(W.ZLA_SYTUACJA),
                of(
                        M.zbijaj(W.WIEDZA)
                )

        );
        new WM(of(W.WYCHODZISZ_Z_PRACY),
                of(
                        M.estymacja(of(W.CZAS,W.SILY)),
                        M.notify(W.ZNAJOMI),
                        M.getPriorities(of(W.ULICA, W.KOBIETA, W.PRACA))
                )
        );
        new WMWM(
                of(W.PLAN),
                of(
                        M.NEEDED(of(W.CZAS, W.BLISKOSC, W.DLUGOSC_DOSTEPU)),
                        M.najszybszaEgzekucja(),
                        M.ominPartyzantke(),
                        M.wedleCoGorzej()

                ),
                of(W.BRAK_WYKONANIA_PLANU),
                of(
                        M.przechodziDoKolejnegoPokojuCzasu(W.PLAN)
                )
        );
        new WM(of(W.CHCESZ_NORMALNA_KOBIETE),
                of(
                        M.pokazujSie(of(W.NORMALNE_MIEJSCE, W.NORMALNA_PORA)),
                        M.zagaduj()
                )
        );
        new WM(of(W.IZOLACJA_CZLOWIEKA),
                of(
                        M.poznaj()
                )
        );
        new WM(of(W.ZLY, W._88_, W.LUDZIE),
                of(
                        M.podkop_u(W.WSZYSCY),
                        M.sprobojWziacWartosc(metodySzponcnia)
                )
        );
    }
}
