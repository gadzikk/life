package metoda;

import db.DB_Warunki;
import warunek.W;

import java.util.List;

import static typy_bazowe.TypOsoby.*;

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
    List<W> kontrola = of(W.PATRZENIE_MONITOR, W.DAILY, W.WEEKLY, W.COMMITY, W.PYTANIA, W.PRZEPLYW_WIADOMOSCI, W.FEEDBACK_INNI, W.PROGRESS_ILOSCIOWY, W.PROGRESS_JAKOSCIOWY);

    public void run(){
        W nastawienie = W.NIENAWISC_FESTOW;

        M.WWW(of(W.WIEDZA, W.NISZA, W.BOGATY_SEKTOR),
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
        M.W(of(W.MULTICULTI),
                of(
                        M.rasizm_on()
                )
        );
        M.WWW(of(W.KORPO),
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
        M.W(of(W.SZUKASZ_PRACY),
                of(
                        M.NEEDED(of(W.DWA_MIESIACE))
                )
        );
        M.W((WYMAGANIA_WSTEPNE_ZARABIANIE),
                of(
                        M.GRANT(ME,W.PRACA)
                )
        );
        praca();
        zachowanie();
        szponcenie();
        hardcoreZlyFxTeam();
        szukaniePracy();
    }
    public void praca(){
        M.GRANT(ME, of(W.BEZPIECZENSTWO, W.PIENIADZE, W.SZANSA_KOBIETA));
        osoba.peleryna_on();
        osoba.tylkoHajs_on();
        M.W(of(W.WESZLES_DO_FIRMY),
                of(
                        M.pracuj(of(W.LUDZIE_WOKOL, W.ATMOSFERA, W.MANAGER)),
                        M.lapKontakt(W.LUDZIE_WOKOL),
                        M.usmiechajSie(),
                        M.ORIENT(of(W.TEMPO_PRACA, W.MANAGO_TECHNICZNY, W.GODZINY_PRZYJSCIA, W.DLUGOSC_PRZERWY, W.SCINANIE))
                )
        );

        M.W(on(W.WYSILEK, W.REZULTATY, W.OPLACA_SIE, W.UZYTECZNOSC, W.MANAGO_DOBRA_OPINIA),
                of(
                        M.thread_while_loop(W.UTRZYMANIE_PRACY)
                )
        );
        manago.setStatus(W.POSLUSZNY);
        manago.setStatus(W.STRAZNIK_PRAWA);
        manago.setStatus(W.CZARNA_TOGA_SEDZIOWSKA);
        manago.wyjebane(of(W.ZASOB_ZYCIE_PRYWATNE, W.ZASOB_CZAS));
        manago.thread_while_loop(M.kontrola(kontrola));
        manago.set(W.ZDOLNOSC_ATAKU);
        M.REMOVE(ME, W.ZDOLNOSC_ATAKU);

        M.W(of(M.isNiedajeRady(zasob)),
                of(
                        manago.teoriaPrzesuwania(zasob)
                )
        );
        M.W(of(W._NOT_, M.WYMAGANIA(of(W.WARTOSC_DODATNIA, W.FINE, W.LADNY, W.KULTURA, W.ULEGLOSC_WZGL_MANAGERA, W.PRZYCHYLNOSC_MANAGERA,
                W.DOBRY_FEEDBACK_LUDZIE, W.ATMOSFERA))),
                of(
                        manago.wymaganaAkcja(ME)
                )
        );

        M.W(of(W.TWORZYSZ_PROBLEMY, W._II_, W.PSUJESZ_ATMOSFERE, W._II_, W._NOT_, W.FINE),
                of(
                        manago.ostry(ME)
                )
        );

        M.W(of(M.isNieOplacalny(zasob)),
                of(
                        manago.zwolnij(zasob)
                )
        );

        M.W(W.MANAGO_TECHNICZNY,
                of(
                        W.CZYTAJ_DOKUMENTACJE_MYSL, W._II_, W.PRAKTYKA
                )
        );
    }
    public void zachowanie(){
        M.thread_while_loop(W.WALKA_Z_FESTAMI);
        M.thread_while_loop(W.UKRYCIE_PRAWDY_PRZED_FESTAMI);
        M.W(of(W.TASK),
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
        M.W(of(M.interakcja(manago)),
                of(
                        M.glaskaszPoGlowie(manago)
                )
        );
        M.W(of(W.BURZUAZJA),
                of(
                        M.REMIND(ME, of(W.POPRAWNOSC_POLITYCZNA, W.ATMOSFERA, W.ZYSK, W.STRATA)),
                        M.ucinaj()
                )
        );
    }

    public void szponcenie(){
        M.WW(of(W.TASK),
                of(
                        opponent.zlecNieszczegolowo(W.TASK),
                        opponent.zjeb(W.NIEWYKONANIE, W.TASK)
                ),
                of(W.ZALEZNY_TASK),
                of(
                        opponent.zjeb(W.ZALEZNY_TASK, W.TASK)
                )
        );

        M.W(of(W.NIEPOKOJACE),
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
    public void hardcoreZlyFxTeam() {
        me.thread_while_loop(W.OGROMNY_WYSILEK);

        manago.setNaTobie(W.ULTRA_OCZEKWIANIA_Z_KAPELUSZA);
        manago.thread_while_loop(W.SZUKAJ_ZASTEPSTWA);
        manago.thread_while_loop(W.ZWRACAJ_WSZYSTKO_NA_REVIEW);
        manago.thread_while_loop(M.uniz(W.DOBRE));
        manago.thread_while_loop(M.zapomnij(W.DOBRE));
        manago.thread_while_loop(M.wyolbrzym(W.ZLE));
        manago.thread_while_loop(M.pamietaj(W.ZLE));

        manago.setNaTobie(W.OCZEKIWANIA_ULTRASZCZEGOLOWA_WIEDZA_NT_SYSTEMU_Z_KTORYM_NIEMIALES_DO_CZYNIENIA_WCZESNIEJ_NIEMOGLES_MIEC_POJECIA_JAK_DZIALA);
        manago.thread_while_loop(of(W.DAJ_ULTRA_SUPPORTOWE_NAJGORSZE_TASKI, W.IFLYRES2, W.PELNY_SUPPORT));
        manago.thread_while_loop(of(W.UNIZ_WYKONANIE_ZADANIA, W.TO_BYLO_LATWE));
        manago.thread_while_loop(W.CIAGLE_PODWYZSZANA_POPRZECZKA_JEDNOCZESNIE_INNE_PROBLEMY_KAZDEGO_TASKU);
        manago.thread_while_loop(W.KAZDY_BLAD_KARA);
        manago.thread_while_loop(W.KAZDE_PYTANIE_EWALUOWANE);
        manago.thread_while_loop(of(W.ZLY_FEEDBACK_GDY_PYTASZ, W.NIE_PYTASZ_NIE_WIESZ));
        team.thread_while_loop(W.INFORMACJE_ODRAZU_KRAZA);

        manago.thread_while_loop(of(W.OCENA_TYLKO_WEDLE_ZLEGO, W.OCENA_CZEGO_NIE_ZROBILES));
        team.thread_while_loop(W.FARMAZON24_7);
        manago.set(of(W.PIASKOWNICA, W.MALY_RUDY_FEST_GITARA_DLUGIE_WLOSY, W.IGNORANT_MALE_DZIECKO));
        manago.rozpowiedzDoWszystkich(W.WADA);

        manago.thread_while_loop(M.W(W.WADA, "--->", of(W.ZAMKNIECIE_DOZYWOTNIE, W.BRAK_MOZLIWOSCI_POPRAWY, W.ZARTY)));
        manago.thread_while_loop(M.W(W.DOBRE_WYKONANIE, "--->", of(W._0)));
        manago.thread_while_loop(M.W(W.ZLE_WYKONANIE, "--->", of(W.ZLY_FEEDBACK, W.ZLY_MIDYEAR, W.IMPROVEMENT_PLAN)));

        manago.thread_while_loop(M.W(W.MANAGER_LUBIE, "--->", of(W.ZLEC_SZCZEGOLOWO, W.DAJ_MALO_ROBOTY)));
        manago.thread_while_loop(M.W(W.MANAGER_NIELUBIE, "--->", of(W.ZLEC_NIESZCZEGOLOWO, W.DAJ_MALO_ROBOTY,
                                                                                     W.UKRYCIE, W.PRETENSJE)));

        manago.thread_while_loop(W.MOWIENIE_MYSL_ROB_PROBOJ);
        manago.thread_while_loop(of(W.NIE_MOWILEM_ABYS_TAK_ZROBIL, W._100PROCENT_UZALEZNIENIE));
        manago.thread_while_loop(W.WCHODZ_ZYCIE_PRYWATNE);
        manago.thread_while_loop(of(W.ZLAMANIE_WSZELKICH_ZASAD_MANAGERSKICH, W.ROBOTA_LEZY, W.NASTEPNIE_POWOLYWANIE_SIE_NA_SZCZEGOLIKI));
        manago.thread_while_loop(of(W.WSPIERAJ_UCZ_ZAGRANICZNYCH, W.DAJ_DEVELOPMENT_ZAGRANICZNYM));
        manago.thread_while_loop(of(W.KARC_POLAKOW, W.DAJ_SUPPORT_POLAKOM));
        manago.thread_while_loop(W.RZUCENIE_NA_TASKI_BEZ_PRZYGOTOWANIA_PRACOWNIKA);
                M.konsekwencje(of(W.BRAK_MOZLIWOSCI_ESTYMOWANIA, W.ZABIERANIE_CZASU_OSOBOM_ZESPOLU, W.KAZDY_TASK_NOWY_BRAK_NOWY_PROBLEM, W.DELAY, W.ZLA_OCENA_Z_JIRY));

        M.GRANT(ME, W.NIEDZIALAJCY_KOMPUTER);
    }

    public void szukaniePracy() {
        W miejsce = on(W.BUDZET, W.POTRZEBA_AUTOMTAYZACJI);
        W silneCV = M.DLUGO(M.CIEZKO(of(W.DOBRZE_NAPISANE_CV, W.KILKA_LAT_DOSWIADCZENIA)));
        W szansa = M.CIEZKO(of(miejsce, W.SZANSA, silneCV));
        W wiedza = M.CIEZKO(M.DLUGO(of(W.CZAS, W.ARTYKULY, W.KSIAZKI, W.PYTANIA_INTERVIEW, W.STUDIA)));

        M.wyslijCVBroadcastem();
        M.czasOczekiwania(W.DWA_TYGODNIE);
        M.pierwszyOdzew();

        M.czasOczekiwania(W.TYDZIEN);
        M.zaproszenieNaRozmowe();
        M.dowiedzSieCzegosORozmowieRekrutacyjnej();
        M.czasOczekiwania(W.TYDZIEN);
        M.CIEZKO(interview(of(szansa, wiedza)));
        M.pierwszyEtap();

        M.czasOczekiwania(W.TYDZIEN);
        M.feedback();
        M.drugiEtap();

        M.czasOczekiwania(W.TYDZIEN);
        M.feedback();
        M.wyrazenieCheciWspolpracy();

        M.czasOczekiwania(W.TYDZIEN);
        M.wyslanieUmowy();
        M.podpisanieUmowy();
        M.czasOczekiwania(W.TYDZIEN);
        M.screening(); // suma 8 tygodni, 2 miesiace
    }

    public W interview(List<W> warunki) {
        List<W> target = of(W.ZADEMONSTROWANIE_WIEDZY, W.FINE);
        List<W> ocenianieWedlug = of(W.TO_CO_UMIESZ, W._II_, W.TO_CZEGO_NIEUMIESZ, W._II_, W.OCENA_ZE_STUDIOW);

                M.W(W.MNIEJ_NIZ_2_LATA_DOSWIADCZENIA, "--->",      pytajacy.oczekiwanie(W.DOBRZE_JEZELI_UMIE));
                M.W(W.WIECEJ_NIZ_2_LATA_DOSWIADCZENIA, "--->", pytajacy.oczekiwanie(W.MUSI_UMIEC_WSZYSTK0));

        pytajacy.set(DB_Warunki.FEST.getWarunki());
        pytajacy.thread_while_loop(W.SZUKA_GLEBOKO_ZAGADNIEN);
        pytajacy.thread_while_loop(W.LICZY_KAZDY_BLAD);

        o(W.PROBA, "--->", W.ZDOBYCIE_PRACY)
                    .otherwise(of(W.STRACONA_SZANSA, W.NOTA, W.BRAK_REZULTATOW, W.WYSILEK_NA_DARMO, W.STRES_NA_DARMO));

        return W.WARUNEK;
    }

    public void algorytmUczeniaSie() {
        // todo
    }

}
