package metoda;

import db.DB_Warunki;
import warunek.W;

import java.util.List;

import static typy_bazowe.TypOsoby.SOMEONE;

/**
 * Created by gadzik on 23.08.20.
 */
public class CPU_LUDZI extends AbstractCPU {
    public void run() {
        relacjeWarunkowLudzi();
        endCasyWarunkow();
        opisZachowanTypOsoby();
        teoriaZla();
        fest();
        dzialajacy();
    }

    public void relacjeWarunkowLudzi() {
        // WADY
        new WWs(of(W.ZLE_WYCHOWANIE, W._II_, W.WYCHOWANIE_POD_KLOSZEM, W._II_, W.ROZPASANIE_ROZPIESZCZANIE, W._II_, W.SLABI_RODZICE),
                "--->", of(W.BRAK_CIERPIENIA, W.BRAK_PRACY, W.ZAZDROSC, W.BRAK_POZNANIA_NAUKI, W.BRAK_SPORTU, W.CHEC_BEZPIECZENSTWA));

        new WWs(of(W.BRAK_PRACY, W.BRAK_CIERPIENIA), "--->", of(W.EMOCJE_FIRST, W.WRAZLIWOSC, W.DZIECKO, W.ZMIENNOSC));

        new WWs(of(W.BRAK_PRACY, W.BRAK_CIERPIENIA, W.BRAK_DOBREGO_WYCHOWANIA),
                "--->", of(W.BRAK_REWIRU, W.BRAK_POZNANIA_OTOCZENIA, W.BRAK_NORMALNYCH_EMOCJI, W.BRAK_KONKURENCJI));

        new WWs(of(W.BRAK_REWIRU, W.BRAK_POZNANIA_OTOCZENIA, W.BRAK_NORMALNYCH_EMOCJI, W.BRAK_KONKURENCJI),
                "--->", of(W.DZIWNA_PASJA, W.BRAK_SILNYCH_JEDNOSTEK, W.BRAK_UMIEJETNOSCI, W.BRAK_WLASCIWEJ_OCENY));

        new WWs(of(W.CHEC_BEZPIECZENSTWA, W.BRAK_SILNYCH_JEDNOSTEK, W.BRAK_UMIEJETNOSCI, W.BRAK_WLASCIWEJ_OCENY),
                "--->", of(W.KOLKO_WZAJEMNEJ_ADORACJI, W.HIERARCHIA_FIRST));

        new WWs(of(W.ZAZDROSC, W.WRAZLIWOSC, W.NIEPOSLUSZONSC_B, W.SILNIEJSZY_B), "--->", of(W.WYKLUCZA, W.WYLACZY_DOSTEP));

        // ****

        new WWs(of(W.POZNANIE_WARTOSCI_PIENIADZA, W.FAZA_Z_NAUKI, W.FART, W.DZIWNA_PASJA), "--->", of(W.DOBRY_ZAWOD));

        new WWs(of(W.JUMA, W.PRACA), "--->", of(W.POZNANIE_WARTOSCI_PIENIADZA));

        new WWs(of(W.POZNANIE_NAUKI), "--->", of(W.FAZA_Z_NAUKI));

        new WWs(of(W.SUMIENIE, W.DOBRE_CZYNY), "--->", of(W.PRZYCHYLNOSC_BOGA));

        new WWs(of(W.PRZYCHYLNOSC_BOGA), "--->", of(W.FART));

        // ZALETY
        new WWs(of(W.DOBRE_WYCHOWANIE, W._88_, W.SILNI_RODZICE),
                "--->", of(W.CIERPIENIE, W.PRACA, W.ZARADNOSC, W.POZNANIE_NAUKI, W.SPORT, W.SZCZESLIWE_DZIECINSTWO));

        new WWs(of(W.PRACA, W.CIERPIENIE), "--->", of(W.KALKULACJA_FIRST, W.ZDOLNOSC_DO_WYSILKU, W.KONSEKWENCJA));

        new WWs(of(W.PRACA, W.CIERPIENIE, W.DOBRE_WYCHOWANIE),
                "--->", of(W.REWIR, W.ZNAJOMOSC_OTOCZENIA, W.NORMALNE_EMOCJE, W.KONKURENCJA));

        new WWs(of(W.REWIR, W.ZNAJOMOSC_OTOCZENIA, W.NORMALNE_EMOCJE, W.KONKURENCJA),
                "--->", of(W.PRAWDZIWA_PASJA, W.SPORT, W.SILNE_JEDNOSTKI, W.UMIEJETNOSCI, W.WLASCIWA_OCENA));

        new WWs(of(W.SPORT, W.SILNE_JEDNOSTKI, W.UMIEJETNOSCI, W.WLASCIWA_OCENA),
                "--->", of(W.MOCNA_JEDNOSTKA, W.SILNA_JEDNOSTKA_FIRST));

        new WWs(of(W.KALKULACJA_FIRST, W.ZDOLNOSC_DO_WYSILKU, W.KONSEKWENCJA), "--->", of(W.DOBRE_WYBORY, W.OSIAGNIETE_CELE));

        // ****
    }

    public void defaultZleZachowanie() {
        M.ukryjZlo();
        M.ukryjWady();
        M.aktywujEmocje();
        M.wezNajwiecejDlaSiebie();
        new WM(of(W.NIEZNAJOMY),
                of(
                        M.naklejka(),
                        M.foty()
                )
        );
        new WM(of(W.NIEZNAJOMY, W._88_, W.PRZEWAGA),
                of(
                        M.zwyzywaj(),
                        M.pobij()
                )
        );
        new WM(of(W.ZNAJOMI),
                of(
                        M.wykorzystaj()
                )
        );
    }

    public void endCasyWarunkow() {
        new WW((W.DEFAULT),
                of(
                        W.TEMPOTA,
                        W.GLUPOTA,
                        W.NIEODPOWIADA,
                        W.NIESWIADOMOSC,
                        W.ZALEZNY
                )
        );
        new WW((W.OSIEDLE),
                of(
                        W.ANTY_NORMALNOSC,
                        W.HIERARCHIA,
                        W.ZAZDROSC,
                        W.ZLO,
                        W.NUDA
                )
        );
        new WW((W.PASJA),
                of(
                        W.TYLKO_TO,
                        W.STYL_ZYCIA,
                        W.ODERWANIE_OD_RZECZYWISTOSCI
                )
        );
        new WW((W.STUDIA),
                of(
                        W.ODERWANIE_OD_RZECZYWISTOSCI,
                        W.BRAK_CHETNOSCI,
                        W.MARZY_OBCOKRAJOWIEC
                )
        );
        new WW((W.RODZINA),
                of(
                        W.KONTROLA
                )
        );
    }

    public void opisZachowanTypOsoby() {
        new WM(of(W.MIESZANIEC, W.FEST),
                of(
                        M.pobierzNieswiadomosc(), M.pobierzLukiOsobowosci(),
                        M.wyklucz(of(W.RDZENNI, W.SILNIEJSI)), M.utrudniaj(of(W.RDZENNI, W.SILNIEJSI)),
                        M.stworzKolkoAdoracji(),
                        M.thread_while_loop(W.POSLUSZNY)
                )
        );
        new WM(of(W.RDZENNY_DOBRY),
                of(
                        M.pobierzPatologie(),
                        M.wyklucz(of(W.MIESZANIEC, W.FEST)), M.utrudniaj(of(W.MIESZANIEC, W.FEST)),
                        M.wezPrzewage(), M.pracuj(W.PRZEWAGA),
                        M.przemoc(W.OBRONA),
                        M.thread_while_loop(of(W.ANTY_POSLUSZNOSC, W.ANTY_PUSTKA, W.ANTY_NUDA))
                )
        );
        new WM(of(W.ZLY),
                of(
                        M.pobierzHierarchie(),
                        M.dzialajDlaZla(), M.tworzPatologie(),
                        M.wal(W.NIEDZIALAJACY),
                        M.przemoc(W.DOMINACJA),
                        M.thread_while_loop(W.DOMINACJA)
                )
        );
        new WM(of(W.AGRESOR),
                of(
                        M.DEFAULT(W.AGRESJA),
                        M.zaczep(osoba),
                        M.wrocZPrzewaga(),
                        M.wal(osoba, W.PRZEWAGA),
                        M.rozpowiedz(W.WSZYSCY),
                        M.thread_while_loop(W.DOMINACJA)
                )
        );
    }

    public void teoriaZla() {
        List<W> essentials = of(W.KTO_SZYBSZY_TEN_LEPSZY);

        List<W> endCaseZla = of(
                W.ZLE_SAMOPOCZUCIE, W.STRATY_MATERIALNE, W.STRATY_MORALNE, W.STRATA_MIEJSCA_W_HIERARCHII,
                W.PRZERWA_KONTUZJA, W.USUNIECIE_Z_PLANSZY
        );
        new WM(of(W.NOWA_OSOBA),
                of(
                        M.pierwszaReakcja(of(W.PROWOKUJE, W.CISNIE, W.WYPROWADZA_Z_ROWNOWAGI, W.WALKA_PIESCI))
                )
        );
        new WM(of(W.KTOS_MI_COS_ZROBIL, W._II_, W.ZAZDROSC),
                of(
                        M.reakcjaMocniejNizszemuWHierarchii(rany)
                )
        );

        M.sondaPrzewagPodZrobienieZla();
        M.zniszczJakNajwiecej(rany);
        M.zabierzJakNajwiecej();

        new WM(of(W.OBRONA),
                of(
                        M.brakReakcji(W.WYZSZE_DOBRO),
                        M.II(),
                        M.reakcjaMocniej(rany)
                )
        );
    }

    public void fest() {
        List<W> festWarunki = DB_Warunki.FEST.getWarunki();
        List<W> festEndCase = of(W.PODROZE, W.WYGODY, W.PRZEKAZANIE_ZLEGO_GENU, W.NABICIE_KABZY_KAPITALISCIE);

        new WM(of(W.RODZINA, W.KONTROLA, W.PIENIADZE),
                of(
                        M.ochronaPrzed(W.CIERPIENIE),
                        M.GRANT(SOMEONE, of(W.FEST, W.BURZUA)),
                        M.GRANT(SOMEONE, of(W.NIESWIADOMOSC, W.LUKI_OSOBOWOSCI))
                )
        );
        new WM(of(W.POSIADACZ),
                of(
                        M.GRANT(SOMEONE, of(W.PRYWATNY_FOLWARK, W.SUPERPOZYCJA, W.WYDAWANIE_WYROKOW))
                )
        );

        M.sondujWady();
        M.sondujWartoscioweRzeczy();
        M.sondujWarunkiSprzyjajace();
        M.sondujWarunkiNiesprzyjajace();
        M.sondujLudziWokol();

        M.wypracujLepszaPozycje();
        M.ukryjDobra();
        M.wdupcWNajgorszeWarunki();
        M.zajmijPozycjeIWarunki();
    }

    public void dzialajacy() {
        new WM(of(W.DZIALAJACY),
                of(
                        M.DEFAULT(W.ZEROWY_DOSTEP),
                        dzialacz.robKomusKrzywde(), dzialacz.dajZarobicDillowi(),
                        dzialacz.siejZlo(), M.otherwise(W.PRZEJEBANE, 0),
                        dzialacz.uzaleznijSieOdSrd(),
                        dzialacz.dzialanieWsrodDzialaczy(),
                        dzialacz.zdobadzInformacjeZeSrodowiskaNaKurestwie(),

                        dzialacz.WHILE(W.DOSTEP),
                        dzialacz.ukryjDostep(),
                        dzialacz.wbijNaMuke(),
                        dzialacz.skazNaIzolacje(),
                        dzialacz.patrzJakCierpi(),
                        dzialacz.cieszSieJegoCierpieniem(),
                        dzialacz.baluj(),
                        dzialacz.siejZlo(),
                        dzialacz.WHILE_END()
                )
        );
    }
}
