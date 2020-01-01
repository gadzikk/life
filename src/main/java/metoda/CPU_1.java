package metoda;


import sytuacja.TypSytuacja;
import warunek.W;

import java.util.List;

import static typy_bazowe.TypOsoby.*;

/**
 * Created by gadzik on 31.12.19.
 */
public class CPU_1 extends AbstractCPU {

    List<W> plansza = of(W.LUDZIE, W.KOBIETA, W.STATYSCI, W.POTRZEBA, W.TRANSPORT, W.SCIEZKI);
    List<W> essentials = of(W.DOSTEPNOSC, W.BLISKOSC, W.SZYBKOSC_CHODZENIA, W.INFORMACJA,
            W.ZASIEG_WZROKU, W.ZASIEG_JEJ_WZROKU,
            W.CZAS_START, W.CZAS_KONIEC,
            W.SRODOWISKOWE, W.STALE, W.RESTRYKCYJNE);

    List<W> mojeCechy = of(W.SPRYT, W.SZYBKOSC, W.SILA, W.ZMUSZASZ);
    List<W> osobaCechy = of(W.REAGUJE, W.STWARZA_POINTCUT, W.SWIADOMOSC);

    List<TypSytuacja> typySytuacji = of(TypSytuacja.UNIKALNA, TypSytuacja.CHCIANA, TypSytuacja.W_HOTMIEJSCU, TypSytuacja.DEFAULTOWA,
            TypSytuacja.RESTRYKCYJNA, TypSytuacja.KRYZYSOWA);

    List<W> allSprzyjajace = of(W.PRETEKST, W.KONTEKST,
            W.WZGL_IZOLACJA, W.DLUGA_DOSTEPNOSC, W.BEZRUCH, W.OSZCZEDNOSC_CZASU, W.MALA_TRUDNOSC, W.MALY_WYSILEK, W.MALA_DROGA, W.MALY_PRZYPAL);
    List<W> allNiesprzyjajace = of(W.TLUM, W.ZMECZENIE, W.CISZA, W.MOZLIWE_SLUCHAWKI);

    public void run(){
//        new MW(
//                of(M.wejsciePlansza(plansza)),
//                of(W.SMIETNIIK_NA_BUZI_JUZ_DAWNO, W.ENK_1_2, W.INFORMACJA)
//        );
        new MW(
                of(M.namierzenie(), M.nieOddalaszWzroku()),
                of(W.THREAD_WHILE_LOOP_ZASIEG_WZROKU)
        );

//        new MW(
//                of(M.sondaOsoby(osobaCechy), M.sondaSytuacji(typySytuacji, essentials)),
//                of(W.SYTUACJA)
//        );
        new WM(
                of(W.WSTYD, W._II_, W.NIEDOSTEPNA,W._II_, W.NIECHCE_SIE),
                of(M.REMIND(ME,of(W.STATYSCI,W.SZANSA,W.SAVE_TIME,W.PROC_30_DOBRYCH)))
        );
        new WM(
                of(W.TLUM),
                of(
                        M.REMIND(ME,of(W.STATYSCI,W.SZANSA,W.SAVE_TIME,W.PROC_30_DOBRYCH)),
                        M.II(),
                        M.izoluj()
                )
        );
        new WM(
                of(W.ZLE_WYGLADA, W._II_, W.SWOJE_RZECZY),
                of(M.cipa())
        );
        new MW(
                of(M.odrazuPochwycenie(W.SYTUACJA), M.pomysl(of(W.PRZESKOCZENIE)), M.dzialanie(mojeCechy)),
                of(W.BEDZIE_CIEKAWIE, W.ANTY_PARTYZANTKA)
        );
//        new MW(
//                of(M.wstanie(), M.przejscie()),
//                of(W.FOCUS, W.THREAD_WHILE_LOOP_BLISKOSC_K)
//        );
//        new MW(
//                of(M.prefix(prefixes, pdstw)),
//                of(W.WIDZENIE_NA_ROZMOWA, W.REAKCJA, W.INFO_O_POINTCUT)
//        );
//        new MW(
//                of(M.gadka(tematy, kombo)),
//                of(W.NIEUSTANNA_GADKA, W.EFEKTYWNA_GADKA)
//        );
//        new MW(
//                of(M.wziecieKontaktu(), M.temat(), M.ponowienie(), M.temat(), M.ponowienie()),
//                of(W.NUMER)
//        );
//        new WM(
//                of(W.NIEPODBIJASZ),
//                of(
//                        M.REMOVE(ME, W.SYTUACJA),
//                        M.REMOVE(ME, W.POTENCJALNA_PRZEWAGA),
//                        M.GRANT(SRODOWISKO, W.POTENCJALNA_PRZEWAGA),
//                        M.GRANT(ALL, W.PODZIW_SZACUNEK))
//        );
        wzglIzolacja();
        trauto();
    }

    public void wzglIzolacja(){
        List<W> sprzyjajace = of(W.DLUGA_DOSTEPNOSC,  W.BEZRUCH, W.SZANSA_NA_SPOTKANIE_WZROKIEM, W.KONTEKST);


        new WM(
                of(W.WZGL_IZOLACJA),
                of(
                        M.GRANT(ME, W.X_100),
                        M.zwazNaSzczegoly(),
                        M.pokazSie()
                )
        );
        new WM(
                of(W._1SPOJRZENIE),
                of(
                        M.GRANT(ME, W.ENOUGH),
                        M.pokazZainteresowanie(),
                        M.prefix(prefixes, pdstw),
                        M.gadka(tematy, kombo)
                )
        );
        new WMWM(
                of(W.PATRZYSZ),
                of(
                        M.wypracujDobraSytuacje(W.OGRANICZENIE_CZASOWE),
                        M.II(),
                        M.oczekujNaSpojrzenie(W.OGRANICZENIE_CZASOWE),
                        M.II(),
                        M.wlozDoKubelka()),
                of(W.PASS,W._88_, W.BLISKOSC),
                of(M.GRANT(ME, W.X_1000))
        );
        new WM(
                of(W.GADAJA_ZE_SOBA),
                of(M.GRANT(ME, W.WIECEJ_NIZ_POPATRZENIE))
        );

        new WM(
                of(W.SIEDZA),
                of(
                        M.GRANT(YOU, W.KOMFORT),
                        M.GRANT(ME, W.PRZYSZLY_SIE_POKAZAC),
                        M.przechodziszTylkoRaz(),
                        M.omijaszPartyzantke(),
                        M.podbicieZJednejProby())
        );
        new WM(
                of(W.MIEJSCE_STALE),
                of(
                        M.kontekst(),
                        M.stajesz2s(),
                        M.sondaGdzie(),
                        M.bijesz()
                )
        );
        new WM(
                of(W.SLUCHAWKI),
                of(M.niePrzestraszenie(), M.dzialajJakbyNieBylo())
        );
        new WM(
                of(W.CZORCIK),
                of(M.GRANT(ME, W.SZANSA_BECZKA_ZNAJOMOSC))
        );
    }
    public void trauto(){
        List<W> sprzjajace = of(W.DLUGA_DOSTEPNOSC, W.BEZRUCH, W.SZANSA_NA_SPOTKANIE_WZROKIEM, W.STREFY_PRZEGUBOWE_3, W.KONTEKST);
        List<W> normalne = of(W.CISZA, W.TLUM, W.CHODZAC_ROZMOWA_UWAGA_NA_TOBIE, W.BIEDACY);
        List<W> niesprzyjajace = of(W.ULOTNOSC, W.ZARAZ_WYSIADZIE, W.ZARAZ_WYCIAGNIE_SLUCHAWKI);

        // THREAD WHILE LOOP.START()
        new WMWM(
                of(W.TRAUTO),
                of(
                        M.szukanieDobrejPlanszy()
                ),
                of(W.LEPSZA_OPCJA),
                of(
                        M.popierdalaszObecna(),
                        M.odrazuPochwycenie(W.SYTUACJA)
                )
        );
        new WMWMWM(
                of(W.BAHNA),
                of(
                        M.pobierzInformacjeStrefy(),
                        M.wybierzStrefe(),
                        M.sondaPrzystanekKoncowy()
                ),
                of(W.WEJSCIE, W.PRZYSTANEK),
                of(
                        M.rozgladniecie()
                ),
                of(W.SZCZYT),
                of(
                        M.skupiaszNaPrzystankach()
                )
        );
        // THREAD WHILE LOOP.END()

        // NAMIERZONA
                        // KIEDY
        new MWMWMW(
                of(M.odrazuPoWejsciu()),
                of(
                        W.OSZCZEDNOSC_CZASU, W.MNIEJSZE_SZANSE,
                        W.NIETRZEBA_TRZYMAC_ORIENT, W.BRAK_GLUPICH_UCZUC, W.WIEKSZA_SZANSA_LINCZ
                ),
                of(M.poJakimsCzasie()),
                of(
                        W.MNIEJ_CZASU, W.WIEKSZE_SZANSE,
                        W.TRZYMASZ_ORIENT, W.GLUPIE_UCZUCIA
                ),
                of(M.odrazuPoWyjsciu()),
                of(
                        W.MNIEJ_CZASU, W.MNIEJSZE_SZANSE,
                        W.BRAK_CISZY, W.BRAK_STATYSTOW_WOKOL,
                        W.TRZYMASZ_ORIENT, W.IDZIE, W.MUSISZ_DOGONIC, W.BRAK_KOMFORTU
                )
        );
        // todo przenies do wzgl izolacja
        new WMWM(
                of(W.Z_KIMS, W._88_, W.PATRZY),
                of(
                        M.GRANT(ME, W.X_100),
                        M.sciagajGadke()

                ),
                of(W.WIDZIALA, W._88_, W.WYCHODZI),
                of(
                        M.lecZaNia(),
                        M.dogon()
                )
        );
        new WM(
                of(W.BRAK_SLUCHAWEK),
                of(
                        M.docen()
                )
        );
        new WMWM(
                of(W.SIEDZISZ),
                of(
                        M.wstanie(),
                        M.przejscie(),
                        M.pokazSie()

                ),
                of(W.SIEDZIMY),
                of(
                        M.sondujWarunekDodatni(),
                        M.zwrocUwage(),
                        M.podbicieZJednejProby()
                )
        );
        new WMWM(
                of(W.PATRZY, W._88_, W.WRAZLIWA),
                of(
                        M.GRANT(ME, W.PATRZY_ULAMEK_SEKUNDY)
                ),
                of(W.CISZA),
                of(
                        M.abyInniMysleliZeZnasz()
                )
        );
        new WM(
                of(W.POZNALES_KOGOS),
                of(
                        M.wchodziszWychodzisz(W.MIEJSCE)
                )
        );

        // END NAMIERZONA
    }
    public void utrudnienia2strony(){
        new WMWM(
                of(W.ODWRACA_WZROK, W._II_, W.SPECJALNE_NIEWIDZENIE),
                of(
                        M.prefixMimoWszystko(prefixes, pdstw)
                ),
                of(W.OLEWKA_PODBICIA, W._II_, W.ODPOWIEDZ_ODCZEP),
                of(
                        M.temat_x3(tematy),
                        M.przewidywanie_x3()
                )
        );
    }
}
