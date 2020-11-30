package watek;

import db.DBW;
import metoda.M;
import warunek.W;

import java.util.List;

import static typy_bazowe.TypOsoby.*;

/**
 * Created by gadzik on 05.01.20.
 */
public class Watek_PRACA extends AbstractWatek {
    W wazne = M.WAZNE(of(W.WIEDZA, W.DOSWIADCZENIE, W.WYSOKA_POZYCJA));

    W globalPlanszaPraca = DBW.GLOBAL_PLANSZA_PRACA_WARUNKI();
    W hierarchia = DBW.HIERARCHIA_PRACA_WARUNKI();

    List<W> warunki = of(W.PROJEKTY, W.TECHNOLOGIE, W.MANAGEROWIE, W.LUDZIE);
    List<W> ludzieKorporacji = of(W.KONFIDENCI, W.ZAWISTNI, W.ZE_WSI, W.WYGODNY, W.FESTY, W.CZYCHA_NA_BLAD, W.DZIWNA_PASJA, W.POSLUSZNY);
    List<W> managoCechy = of(W.TECHNICZNOSC, W.FEST, W.SYSTEMOWIEC, W.WYGODNY, W.STABILNY, W.POSLUSZNY);
    List<W> tyVSmanago = of(W.STOSUNEK1VS1, W.ATMOSFERA, W.UZYTECZNOSC);
    List<W> satysfakcjaZPracy = of(W.DOBRY_PROJEKT, W.SZCZEGOLOWE_REQUIREMENTY, W.PROJEKT_UZYTECZNY, W.NOWE_NARZEDZIA, W.MANAGO_TECHNICZNY);
    List<W> zyskiZPracy = of(W.WIEDZA, W.CZAS, W.JEDZENIE, W.DOSWIADCZENIE, W.CHOROBOWE, W.CENTRUM, W.PIENIADZE, W.ODPOCZYNEK, W.PLANSZA);
    List<W> stratyZPracy = of(W.STRATA_CZASU, W.ZMECZENIE, W.NERWY, W.STRES, W.INTERAKCJA_Z_FESTAMI);
    List<W> kontrola = of(W.PATRZENIE_MONITOR, W.DAILY, W.WEEKLY, W.COMMITY, W.PYTANIA, W.PRZEPLYW_WIADOMOSCI, W.FEEDBACK_INNI, W.PROGRESS_ILOSCIOWY, W.PROGRESS_JAKOSCIOWY);

    public void run(){
        W nastawienie = W.NIENAWISC_FESTOW;

        M.W(of(W.WIEDZA, W.NISZA, W.BOGATY_SEKTOR), "--->", M.WIECEJ(W.PIENIADZE));

        M.W(W.NISZA, "--->", M.WIECEJ(W.SZANOWANIE_PRACOWNIKA));

        M.W(of(W.INTERVIEW, W._88_, W.KONKURENCJA), "--->", M.ZWROCENIE_UWAGI(of(W.KLASA_SPOLECZNA, W.PODOBIENSTWO, W.NARODOWOSC, W.RASA)));

        M.W(W.MULTICULTI, "--->", M.CALY_CZAS(W.RASIZM));


        M.W((W.KORPO), "--->", of(M.CALY_CZAS(W.POPRAWNOSC_POLITYCZNA), M.MOZLIWOSC(W.MALO_PRACY)));

        M.W(W.OPEN_SPACE, "--->", M._100_OSOB(W.PATRZY));

        M.W(W.STALO_SIE, "--->", M._10_OSOB(W.KONFIDENCI));

        M.W(W.SZUKASZ_PRACY, "--->", M.POTRZEBNE(W.DWA_MIESIACE));

        M.W(DBW.WYMAGANIA_WSTEPNE_PRACA_WARUNKI(), "--->", M.OSIAGNIECIE(W.PRACA));

        praca();
        zachowanie();
        szponcenie();
        hardcoreZlyFxTeam();
        szukaniePracy();
        zadanieRekrutacyjne();
        algorytmUczeniaSie();
        normalnyManago();
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

        M.W(of(W.WYSILEK, W.REZULTATY, W.OPLACA_SIE, W.UZYTECZNOSC, W.MANAGO_DOBRA_OPINIA), "--->", M.CALY_CZAS(W.UTRZYMANIE_PRACY));
        manago.SET(of(W.POSLUSZNY, W.STRAZNIK_PRAWA, W.CZARNA_TOGA_SEDZIOWSKA));
        manago.nieObchodzi(of(W.ZASOB_ZYCIE_PRYWATNE, W.ZASOB_CZAS));
        manago.caly_czas(M.KONTROLA(kontrola));
        manago.SET(W.ZDOLNOSC_ATAKU);
        M.REMOVE(ME, W.ZDOLNOSC_ATAKU);

        M.W(M.NIE_DAJE_RADY(W.ZASOB), "--->", manago.TEORIA_PRZESOWANIA(W.ZASOB));

        M.W(of(W._NIE_, M.WYMAGANIA(of(W.WARTOSC_DODATNIA, W.FINE, W.LADNY,
                W.KULTURA, W.ULEGLOSC_WZGL_MANAGERA,
                W.PRZYCHYLNOSC_MANAGERA, W.DOBRY_FEEDBACK_LUDZIE, W.ATMOSFERA))), "--->", manago.WYMAGANA_AKCJA(W.PRACOWNIK));

        M.W(of(W.TWORZYSZ_PROBLEMY, W._II_, W.PSUJESZ_ATMOSFERE, W._II_, W._NIE_, W.FINE),
                of(
                        manago.OSTRY(W.PRACOWNIK)
                )
        );

        M.W(of(M.NIE_OPLACALNY(W.PRACOWNIK)), "--->",   manago.ZWOLNIJ(W.PRACOWNIK));

        M.W(W.MANAGO_TECHNICZNY,
                of(
                        W.CZYTAJ_DOKUMENTACJE_MYSL, W._II_, W.PRAKTYKA
                )
        );
    }
    public void zachowanie(){
        M.CALY_CZAS(W.WALKA_Z_FESTAMI);
        M.CALY_CZAS(W.UKRYCIE_PRAWDY_PRZED_FESTAMI);
        M.W(W.TASK, "--->",  of(M.zapisz(W.TASK),
                                    M.przymiezenieDoDzialania(),
                                    M.sprawdzenie(W.ZEGAR, W.DATA),
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
        M.W(of(W.WYGODNY),
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
                        opponent.skrytykuj(W.NIEWYKONANIE, W.TASK)
                ),
                of(W.ZALEZNY_TASK),
                of(
                        opponent.skrytykuj(W.ZALEZNY_TASK, W.TASK)
                )
        );

        M.W(of(W.NIEPOKOJACE),
                of(
                        zaniepokojeni.potwierdzajaZInnymi(W.NIEPOKOJACE),
                        M.robWrazenie(of(W.PROGRAMISTA, W.PASJONAT)),
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
        me.caly_czas(W.OGROMNY_WYSILEK);

        manago.setNaTobie(W.ULTRA_OCZEKWIANIA_Z_KAPELUSZA);
        manago.caly_czas(W.SZUKAJ_ZASTEPSTWA);
        manago.caly_czas(W.ZWRACAJ_WSZYSTKO_NA_REVIEW);
        manago.caly_czas(M.uniz(W.DOBRE));
        manago.caly_czas(M.zapomnij(W.DOBRE));
        manago.caly_czas(M.wyolbrzym(W.ZLE));
        manago.caly_czas(M.pamietaj(W.ZLE));

        manago.setNaTobie(W.OCZEKIWANIA_ULTRASZCZEGOLOWA_WIEDZA_NT_SYSTEMU_Z_KTORYM_NIEMIALES_DO_CZYNIENIA_WCZESNIEJ_NIEMOGLES_MIEC_POJECIA_JAK_DZIALA);
        manago.caly_czas(of(W.DAJ_ULTRA_SUPPORTOWE_NAJGORSZE_TASKI, W.IFLYRES2, W.PELNY_SUPPORT));
        manago.caly_czas(of(W.UNIZ_WYKONANIE_ZADANIA, W.TO_BYLO_LATWE));
        manago.caly_czas(W.CIAGLE_PODWYZSZANA_POPRZECZKA_JEDNOCZESNIE_INNE_PROBLEMY_KAZDEGO_TASKU);
        manago.caly_czas(W.KAZDY_BLAD_KARA);
        manago.caly_czas(W.KAZDE_PYTANIE_EWALUOWANE);
        manago.caly_czas(of(W.ZLY_FEEDBACK_GDY_PYTASZ, W.NIE_PYTASZ_NIE_WIESZ));
        team.caly_czas(W.INFORMACJE_ODRAZU_KRAZA);

        manago.caly_czas(of(W.OCENA_TYLKO_WEDLE_ZLEGO, W.OCENA_CZEGO_NIE_ZROBILES));
        team.caly_czas(W.FARMAZON24_7);
        team.caly_czas(M.SZUKANIE(W.DZIURA_W_CALYM));
        team.caly_czas(M.CZYCHA(W.BLAD));

        manago.SET(of(W.PIASKOWNICA, W.MALY_RUDY_FEST_GITARA_DLUGIE_WLOSY, W.IGNORANT_MALE_DZIECKO));
        manago.rozpowiedzDoWszystkich(W.WADA);

        manago.caly_czas(M.W(W.WADA, "--->", of(W.ZAMKNIECIE_DOZYWOTNIE, W.BRAK_MOZLIWOSCI_POPRAWY, W.ZARTY)));
        manago.caly_czas(M.W(W.DOBRE_WYKONANIE, "--->", of(W._0)));
        manago.caly_czas(M.W(W.ZLE_WYKONANIE, "--->", of(W.ZLY_FEEDBACK, W.ZLY_MIDYEAR, W.IMPROVEMENT_PLAN)));

        manago.caly_czas(M.W(W.MANAGER_LUBIE, "--->", of(W.ZLEC_SZCZEGOLOWO, W.DAJ_MALO_ROBOTY)));
        manago.caly_czas(M.W(W.MANAGER_NIELUBIE, "--->", of(W.ZLEC_NIESZCZEGOLOWO, W.DAJ_MALO_ROBOTY,
                                                                                     W.UKRYCIE, W.PRETENSJE)));

        manago.caly_czas(W.MOWIENIE_MYSL_ROB_PROBOJ);
        manago.caly_czas(of(W.NIE_MOWILEM_ABYS_TAK_ZROBIL, W._100PROCENT_UZALEZNIENIE));
        manago.caly_czas(W.WCHODZ_ZYCIE_PRYWATNE);
        manago.caly_czas(of(W.ZLAMANIE_WSZELKICH_ZASAD_MANAGERSKICH, W.ROBOTA_LEZY, W.NASTEPNIE_POWOLYWANIE_SIE_NA_SZCZEGOLIKI));
        manago.caly_czas(of(W.WSPIERAJ_UCZ_ZAGRANICZNYCH, W.DAJ_DEVELOPMENT_ZAGRANICZNYM));
        manago.caly_czas(of(W.KARC_POLAKOW, W.DAJ_SUPPORT_POLAKOM));
        manago.caly_czas(W.RZUCENIE_NA_TASKI_BEZ_PRZYGOTOWANIA_PRACOWNIKA);
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
        M.przypomnijZaklecia();

        M.ZWYKLE(W.NIE_ZATRUDNIONY);
        M.CEL(of(W.ZADEMONSTROWANIE_WIEDZY, W.FINE, W.ZDOBYCIE_PRACY));

        List<W> ocenianieWedlug = of(W.TO_CO_UMIESZ, W._II_, W.TO_CZEGO_NIEUMIESZ, W._II_, W.OCENA_ZE_STUDIOW, W._II_, W.MOZE_CZYMS_BLYSNIE, W._II_,
                                     W._1_BLAD_NIEZATRUDNIONY);

                M.W(W.MNIEJ_NIZ_2_LATA_DOSWIADCZENIA, "--->",      pytajacy.OCZEKIWANIE(W.DOBRZE_JEZELI_UMIE));
                M.W(W.WIECEJ_NIZ_2_LATA_DOSWIADCZENIA, "--->", pytajacy.OCZEKIWANIE(W.MUSI_UMIEC_WSZYSTK0));

        pytajacy.SET(DBW.FEST_WARUNKI());
        pytajacy.caly_czas(W.SZUKA_GLEBOKO_PYTAN);
        pytajacy.caly_czas(W.LICZY_KAZDY_BLAD);

        M.W(W.OGLOSZENIE_O_PRACE, "--->", W.LISTA_ZAGADNIEN);
        M.W(W.ZAGADNIENIE, "--->", M.PYTANIA(M.MAX(3)));
        M.W(W.PYTANIE, "--->", M.ZOBOWIAZANIE(M.ODPOWIEDZ(M.GLEBOKIE_WYCZERPANIE(W.TEMAT))));

        o(W.PROBA, "--->", W.ZDOBYCIE_PRACY)
                    .w_przeciwnym_przypadku(of(W.STRACONA_SZANSA, W.NOTA, W.BRAK_REZULTATOW, W.WYSILEK_NA_DARMO, W.STRES_NA_DARMO));

        return W.WARUNEK;
    }

    public void zadanieRekrutacyjne() {
        M.W(W.DUZE_ZADANIE, "--->", M.PODSTAWA(of(W.MODEL_DANYCH, W.RELACJE_MIEDZY_OBIEKTAMI, W.FUNKCJONALNOSC)));

        M.W(W.MALE_ZADANIE, "--->", of(W.WEJSCIE, W.WYJSCIE, W.FUNKCJONALNOSC, W.OPTYMALIZACJA));
    }

    public void algorytmUczeniaSie() {
        M.ZRODLA(of(M.SZYBKO(W.ARTYKULY), M.WOLNO(W.KSIAZKI), W.PYTANIA_INTERVIEW, W.STUDIA, W.GITHUB));

        M.W(M.WOLNO(W.KSIAZKI), "<", M.SZYBKO(M.ITERACYJNIE(W.ARTYKULY)));

        M.W(W.KSIAZKA, "--->", of(M.POROWNANIE_Z_INNYMI(W.KSIAZKA),
                                    M.PRZEGLADNIECIE(W.SPIS_TRESCI),
                                    M.CALY_CZAS(M.WYPISYWANIE(W.BUZZWORDY)),
                                    M.CZYTANIE_OD_POCZATKU(W.KSIAZKA),
                                    M.CZYTANIE_OD_KONCA(W.KSIAZKA),
                                    M.CZYTANIE_ARTYKULOW(W.BUZZWORDY)));

        M.W(W.ARTYKUL, "--->", of(M.PRZECZYTANIE(W.ARTYKUL),
                                        M.BOOKMARK(W.ARTYKUL),
                                        M.CALY_CZAS(M.WYPISYWANIE(W.BUZZWORDY)),
                                        M.NASTEPNY_DZIEN(M.POWTORZENIE(W.ARTYKUL))));

        M.OPCJA(of(M.IMPLEMENTACJA(), M.SPOTKANIE_SIE_Z_PROBLEMAMI(), M.ROZWIAZANIE_PROBLEMOW()));
    }

    public void normalnyManago() {
        M.STANDARD(M.DUZY_WYSILEK(M.CALY_CZAS(W.CIEZKA_PRACA)));
        M.STANDARD(M.DUZY_WYSILEK(W.SUKCES));

        M.MOCNO(W.OCZEKIWANIA);
        M.MOCNO(W.SUKCES);

        M.W(W.PYTANIE, "--->", M.MOCNO(M.OCZEKIWANIE(M.EFEKTYWNIE(W.ODPOWIEDZ))));
    }

}
