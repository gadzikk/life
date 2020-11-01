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
        srodki();
        ochrona();
        defaultZleZachowanie();
        endCasyWarunkow();
        opisZachowanTypOsoby();
        teoriaZla();
        fest();
        dzialajacy();
        czlowiekCierpienia();
        postawyLudzkie();
    }

    public void relacjeWarunkowLudzi() {
        // WADY WYCHOWANIE
        M.W(of(W.ZLE_WYCHOWANIE, W._II_, W.WYCHOWANIE_POD_KLOSZEM, W._II_, W.ROZPASANIE_ROZPIESZCZANIE, W._II_, W.SLABI_RODZICE),
                "--->", of(W.BRAK_CIERPIENIA, W.BRAK_PRACY, W.ZAZDROSC, W.BRAK_POZNANIA_NAUKI, W.BRAK_SPORTU, W.CHEC_BEZPIECZENSTWA));

        M.W(of(W.BRAK_PRACY, W.BRAK_CIERPIENIA), "--->", of(W.EMOCJE_FIRST, W.WRAZLIWOSC, W.DZIECKO, W.ZMIENNOSC));

        M.W(of(W.BRAK_PRACY, W.BRAK_CIERPIENIA, W.BRAK_DOBREGO_WYCHOWANIA),
                "--->", of(W.BRAK_REWIRU, W.BRAK_POZNANIA_OTOCZENIA, W.BRAK_NORMALNYCH_EMOCJI, W.BRAK_KONKURENCJI));

        M.W(of(W.BRAK_REWIRU, W.BRAK_POZNANIA_OTOCZENIA, W.BRAK_NORMALNYCH_EMOCJI, W.BRAK_KONKURENCJI),
                "--->", of(W.DZIWNA_PASJA, W.BRAK_SILNYCH_JEDNOSTEK, W.BRAK_UMIEJETNOSCI, W.BRAK_WLASCIWEJ_OCENY));

        M.W(of(W.CHEC_BEZPIECZENSTWA, W.BRAK_SILNYCH_JEDNOSTEK, W.BRAK_UMIEJETNOSCI, W.BRAK_WLASCIWEJ_OCENY),
                "--->", of(W.KOLKO_WZAJEMNEJ_ADORACJI, W.HIERARCHIA_FIRST));

        M.W(of(W.ZAZDROSC, W.WRAZLIWOSC, W.NIEPOSLUSZONSC_B, W.SILNIEJSZY_B), "--->", of(W.WYKLUCZA, W.WYLACZY_DOSTEP));

        // ****

        M.W(of(W.POZNANIE_WARTOSCI_PIENIADZA, W.FAZA_Z_NAUKI, W.FART, W.DZIWNA_PASJA), "--->", of(W.DOBRY_ZAWOD));

        M.W(of(W.ZNAJOMI_PRZESTEPCY, W.CHECI), "--->", of(W.JUMA));

        M.W(of(W.JUMA, W.PRACA), "--->", of(W.POZNANIE_WARTOSCI_PIENIADZA));

        M.W(of(W.POZNANIE_NAUKI), "--->", of(W.FAZA_Z_NAUKI));

        M.W(of(W.SUMIENIE, W.DOBRE_CZYNY), "--->", of(W.PRZYCHYLNOSC_BOGA));

        M.W(of(W.PRZYCHYLNOSC_BOGA), "--->", of(W.FART));

        // ZALETY WYCHOWANIE
        M.W(of(W.DOBRE_WYCHOWANIE, W._88_, W.SILNI_RODZICE),
                "--->", of(W.CIERPIENIE, W.PRACA, W.ZARADNOSC, W.POZNANIE_NAUKI, W.SPORT, W.SZCZESLIWE_DZIECINSTWO));

        M.W(of(W.PRACA, W.CIERPIENIE), "--->", of(W.KALKULACJA_FIRST, W.ZDOLNOSC_DO_WYSILKU, W.KONSEKWENCJA));

        M.W(of(W.PRACA, W.CIERPIENIE, W.DOBRE_WYCHOWANIE),
                "--->", of(W.REWIR, W.ZNAJOMOSC_OTOCZENIA, W.NORMALNE_EMOCJE, W.KONKURENCJA));

        M.W(of(W.REWIR, W.ZNAJOMOSC_OTOCZENIA, W.NORMALNE_EMOCJE, W.KONKURENCJA),
                "--->", of(W.PRAWDZIWA_PASJA, W.SPORT, W.SILNE_JEDNOSTKI, W.UMIEJETNOSCI, W.WLASCIWA_OCENA));

        M.W(of(W.SPORT, W.SILNE_JEDNOSTKI, W.UMIEJETNOSCI, W.WLASCIWA_OCENA),
                "--->", of(W.MOCNA_JEDNOSTKA, W.SILNA_JEDNOSTKA_FIRST));

        M.W(of(W.KALKULACJA_FIRST, W.ZDOLNOSC_DO_WYSILKU, W.KONSEKWENCJA), "--->", of(W.DOBRE_WYBORY, W.OSIAGNIETE_CELE));

        // ****

        // ULICA
        M.W(of(W.SLABI_RODZICE), "--->", of(W.SLABY_GEN, W.PATOLOGIA, W.UZYWKI));

        M.W(of(W.SLABY_GEN, W.PATOLOGIA, W.UZYWKI), "--->", of(W.GLUPOTA, W.SLABY, W.AGRESJA));

        M.W(of(W.GLUPOTA, W.SLABY, W.AGRESJA), "--->", of(W.SPRZET, W.ZALEZNOSC_OD_EKIPY));

        M.W(of(W.SPRZET, W.ZALEZNOSC_OD_EKIPY),"--->", of(W.WYROK, W.ZLA_PRACA, W.BRAK_PIENIEDZY, W.NIESTABILNOSC_MATERIALNA,
                W.SLABA_MANIURA,W.BLISKOSC, W.MONOSRODOWISKO, W.UZALEZNIENIE));

        M.W(of(W.ZLA_PRACA, W.BRAK_PIENIEDZY, W.BRAK_PERSPEKTYW, W.CHECI), "--->", of(W.ZLAMANIE_PRAWA));

        M.W(of(W.ZYSK, W.PRZEWAGA, W.SPODOBANIE_SIE), "--->", of(W.UTRZYMANIE_RELACJI));

        M.W(of(W.NIESPODOBANIE_SIE, W.BLISKOSC),"--->", of(W.WALKA_PIESCI));

        M.W(of(W.NIESPRAWIEDLIWE_PRZEWAGI),"--->", of(W.KOLEJNE_NIESPRAWIEDLIWE_PRZEWAGI, W.KURESTWO, W.ZACHETA_DO_ZLA));

        // ***

        // POSIADANIE

        M.W(of(W.SILA_SPRAWCZA_PRACA, W._II_, W.SILA_SPRAWCZA_ULICA),"--->", of(W.SUPERPOZYCJA));

        M.W(of(W.POSIADACZ, W.WADY),"--->", of(W.PRYWATNY_FOLWARK, W.NADUZYWANIE_WYSOKIEJ_POZYCJI));

        M.W(of(W.POSIADACZ, W._88_,
                W.UNDERDOG, W.OD_ZERA_DO_MILIONERA_PRZEZ_CIERPIENIE),"--->", of(W.ANTY_FOLWARK, W.NAJWIEKSZA_WIEDZA_STOPIEN_PO_STOPNIU,
                W.SWIADOMOSC_PIENIADZ_NIC, W.SWIADOMOSC_SILA_SPRAWCZA_DUZO,
                W.MATERIA_DUZO, W.OKAZJA_DUZO, W.LOKALNOSC_DUZO));

        M.W(of(W.SUPERPOZYCJA), "--->", of(W.REALNY_WPLYW_NA_WYDARZENIA, W.REALNY_WPLYW_NA_LUDZI,
                W.ULGA_DLA_SWOICH, M.Option(W.PODKOPANIE_INNYCH),
                W.SILA_SPRAWCZA_W_MIEJSCU_POD_WARUNKAMI, W.OCHRONA_SWEJ_POZYCJI,
                W.INFORMACJA, W.MIEJSCE_STALE));

        M.W(of(W.SUPERPOZYCJA, W.PRZEWAGA_SILY, W.ATRAKCYJNA_EGOISTKA),"--->", of(W.BEZKARNOSC, W.NIE_PAMIETA_SWOICH_OFIAR,
                M.Option(W.PYSZNY), M.Option(W.NIEOGLADA_SIE_NA_KONKURENCJE)));

        M.W(of(W.ROZMIAR, W.PODNOSZENIE_CIEZAROW, W.SILNE_UDERZENIE,
                W.ZAPASY, W.OBRONA, W.SILNI_KUMPLE_ZDOLNI_DO_WALKI),"--->", of(W.PRZEWAGA_SILY));

        // ***

        // SWIADOMOSC

        M.W(of(W.SIEDZENIE_MIEJSCA_RESTRYKCYJNE, W.SIEDZENIE_OSOBY_RESTRYKCYJNE),"--->", of(W.INFORMACJA));

        M.W(of(W.WNIOSKI_HISTORIA, W.WLASCIWA_OCENA, W.TRZEZWOSC,
                W.ZNAJOMOSC_OTOCZENIA, W.WNIOSKI_DOSWIADCZENIA, W.INFORMACJA),"--->", of(W.TRAFNE_DECYZJE));
    }

    public void srodki() {
        List<W> srodkiFest = of(W.KOLKO_WZAJEMNEJ_ADORACJI, W.WSPARCIE, W.ZNAJOMOSC_FESTOW, W.WYKLUCZENIE,
                W.ZLAMANIE_STANDARDU, W.OSZUKANIE_WDUPCENIE, W.OBGADAC);
        List<W> antyFest = of(W.ROZWALENIE_KOLKA_ADORACJI, W.ZNAJOMOSC_RDZENNYCH, W.SILA);

        List<W> srodkiSlaby = of(W.KOLKO_WZAJEMNEJ_ADORACJI, W.WSPARCIE, W.ZNAJOMOSC_SLABYCH, W.WYKLUCZENIE,
                W.ZLAMANIE_STANDARDU, W.OSZUKANIE_WDUPCENIE, W.PO_CICHU, W.OBGADAC);
        List<W> antySlaby = of(W.OTWARTE_STARCIE, W.SILA, W.ZNAJOMOSC_RDZENNYCH, W.ROZWALENIE_KOLKA_ADORACJI);

        List<W> srodkiRdzenny = of(W.WALKA_PIESCI, W.WALKA_SPRZET, W.ZNAJOMOSC_RDZENNYCH, W.NIEBOI_SIE_WYROKU);
        List<W> antyRdzenny = of(W.CZOLO, W.PSYCHO, W.BRAK_SENSU);

        List<W> srodkiPosiadacz = of(
                M.W(of(W.WARTOSC),"--->", of(W.USTALA_ZASADY)),
                M.W(of(W.NIE_PRZESTRZEGANIE_ZASAD),"--->", of(W.ODCIECIE_DOSTEPU_WARTOSC))
        );
        List<W> antyPosiadacz = of(W.ZNISZCZ_WARTOSC, W.ROB_STARTE, W.ZABURZ_SPOKOJ);
    }

    public void ochrona() {
        M.OCHRONA(M.W(of(W.PRZEJEBANOSC_REGIONU), "--->", of(W.OSZUKANIE_WDUPCENIE, W.WYKLUCZENIE, W.SPRZET, W.AGRESJA_W_DZIALANIU, W.ZLO)));
        M.OCHRONA(M.W(of(W.SEX), "--->", of(W.WALKA_PIESCI, W.SKAZYWANIE_SAMOTNOSC, W.OBGADAC, W.EMOCJE_ZE_ZLA)));
        M.OCHRONA(M.W(of(W.PRACA), "--->", of(W.PRZYDUPASZENIE, W.WYKONYWANIE_PRACY)));
    }

    public void defaultZleZachowanie() {
        M.ukryjZlo();
        M.ukryjWady();
        M.aktywujEmocje();
        M.wezNajwiecejDlaSiebie();
        M.W(of(W.NIEZNAJOMY),
                of(
                        M.naklejka(),
                        M.foty()
                )
        );
        M.W(of(W.NIEZNAJOMY, W._88_, W.PRZEWAGA, M.Option(W.AGRESJA)),
                of(
                        M.zwyzywaj(),
                        M.pobij()
                )
        );
        M.W(of(W.ZNAJOMI),
                of(
                        M.wykorzystaj()
                )
        );
    }

    public void endCasyWarunkow() {
        M.W((W.DEFAULT),
                of(
                        W.TEMPOTA,
                        W.GLUPOTA,
                        W.NIEODPOWIADA,
                        W.NIESWIADOMOSC,
                        W.ZALEZNY
                )
        );
        M.W((W.OSIEDLE),
                of(
                        W.ANTY_NORMALNOSC,
                        W.HIERARCHIA,
                        W.ZAZDROSC,
                        W.ZLO,
                        W.NUDA
                )
        );
        M.W((W.PASJA),
                of(
                        W.TYLKO_TO,
                        W.STYL_ZYCIA,
                        W.ODERWANIE_OD_RZECZYWISTOSCI
                )
        );
        M.W((W.STUDIA),
                of(
                        W.ODERWANIE_OD_RZECZYWISTOSCI,
                        W.BRAK_CHETNOSCI,
                        W.MARZY_OBCOKRAJOWIEC
                )
        );
        M.W((W.RODZINA),
                of(
                        W.KONTROLA
                )
        );
    }

    public void opisZachowanTypOsoby() {
        M.W(on(W.MIESZANIEC, W.FEST),
                of(
                        M.pobierzNieswiadomosc(), M.pobierzLukiOsobowosci(),
                        M.wyklucz(of(W.RDZENNI, W.SILNIEJSI)), M.utrudniaj(of(W.RDZENNI, W.SILNIEJSI)),
                        M.stworzKolkoAdoracji(),
                        M.thread_while_loop(W.POSLUSZNY)
                )
        );
        M.W(W.RDZENNY_DOBRY,
                of(
                        M.pobierzPatologie(),
                        M.wyklucz(of(W.MIESZANIEC, W.FEST)), M.utrudniaj(of(W.MIESZANIEC, W.FEST)),
                        M.wezPrzewage(), M.pracuj(W.PRZEWAGA),
                        M.przemoc(W.OBRONA),
                        M.thread_while_loop(of(W.ANTY_POSLUSZNOSC, W.ANTY_PUSTKA, W.ANTY_NUDA))
                )
        );
        M.W(W.ZLY,
                of(
                        M.pobierzHierarchie(),
                        M.dzialajDlaZla(), M.tworzPatologie(),
                        M.wal(W.NIEDZIALAJACY),
                        M.przemoc(W.DOMINACJA),
                        M.thread_while_loop(W.DOMINACJA)
                )
        );
        M.W(W.AGRESOR,
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
        M.W(of(W.NOWA_OSOBA),
                of(
                        M.pierwszaReakcja(of(W.ROZKMINIA, W.MAGICZNE_ZAKLECIE, W.FOTY, W.NOTYFIKACJA_EKIPA,
                                W.PROWOKUJE, W.CISNIE, W.WYPROWADZA_Z_ROWNOWAGI, W.WALKA_PIESCI))
                )
        );
        M.W(of(W.KTOS_MI_COS_ZROBIL, W._II_, W.ZAZDROSC),
                of(
                        M.reakcjaMocniejNizszemuWHierarchii(RANY_WARUNKI)
                )
        );

        M.sondaPrzewagPodZrobienieZla();
        M.zniszczJakNajwiecej(RANY_WARUNKI);
        M.zabierzJakNajwiecej();

        M.W(of(W.OBRONA),
                of(
                        M.brakReakcji(W.WYZSZE_DOBRO),
                        M.II(),
                        M.reakcjaMocniej(RANY_WARUNKI)
                )
        );
    }

    public void fest() {
        List<W> festWarunki = DB_Warunki.FEST.getWarunki();
        List<W> festEndCase = of(W.PODROZE, W.WYGODY, W.PRZEKAZANIE_ZLEGO_GENU, W.NABICIE_KABZY_KAPITALISCIE);

        M.W(of(W.RODZINA, W.KONTROLA, W.PIENIADZE),
                of(
                        M.ochronaPrzed(W.CIERPIENIE),
                        M.GRANT(SOMEONE, of(W.FEST, W.BURZUA)),
                        M.GRANT(SOMEONE, of(W.NIESWIADOMOSC, W.LUKI_OSOBOWOSCI))
                )
        );
        M.W(of(W.POSIADACZ),
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
        M.W((W.DZIALAJACY),
                of(
                        M.DEFAULT(W.ZEROWY_DOSTEP),
                        M.DEFAULT(dzialacz.thread_while_loop(W.NORMALNOSC)),

                        M.WARUNKI_WSTEPNE(of(
                                dzialacz.akceptacjaBiegania(),
                                dzialacz.akceptacjaCpania(),
                                dzialacz.akceptacjaHierarchii(),
                                dzialacz.SET(of(W.BRAK_PIENIEDZY, W.NUDA, W.ZLY, W.AGRESJA, W.NIESWIADOMOSC, W.DOSTEP_OGRANICZONY))
                        )),

                        M.WARUNKI_UTRZYMANIA(of(
                                dzialacz.thread_while_loop(M.znoszenieGnojenia()),
                                dzialacz.thread_while_loop(M.tworzEmocje()),
                                dzialacz.thread_while_loop(M.robKrzywde(KTO_KOGO_WARUNKI)),
                                dzialacz.thread_while_loop(M.dajZarobekGrubasowi()),
                                dzialacz.thread_while_loop(M.ochronaGrubasa()),
                                dzialacz.thread_while_loop(M.wykonujeRozkazy(W.GORA)),
                                dzialacz.thread_while_loop(M.uznajeHierarchie()),
                                dzialacz.thread_while_loop(M.zdobywanieHierarchii(M.CZESTO(KTO_KOGO_WARUNKI, KURESTWO_WARUNKI, M.OPCJA(OSLONY_WARUNKI))))
                        )),
                        dzialacz.thread_while_loop(M.DOSTEP(of(W.INFORMACJE, W.KONTAKT_TEL, W.OBECNOSC))),
                        dzialacz.SET(W.NIE_ZATRZYMA_SIE),
                        dzialacz.SET(of(W.WYKRECENIE, W.WADY_FIZYCZNE, W.WADY_UMYSLOWE, W.OGRANICZENIE_WOLNOSCI)),
                        dzialacz.SET(KTO_KOGO_WARUNKI),
                        dzialacz.SET(M.OPCJA(KURESTWO_WARUNKI)),
                        dzialacz.SET(CECHY_RDZENNY_WARUNKI),
                        dzialacz.SET(PATOLOGIE_OSIEDLE_WARUNKI),
                        dzialacz.SET(TEMATY_RDZENNYCH_WARUNKI),
                        dzialacz.policja(W.ZERO),

                        dzialacz.thread_while_loop(M.rozkminianie(wszyscy)),
                        M.W(W.INFORMACJA, "--->", dzialacz.notyfikacjaEkipa()),
                        M.W(dzialacz.otrzymujePrzewagiZDzialania(), "--->", dzialacz.lubiDzialanie()),

                        dzialacz.WYBOR(of(M.OPCJA(M.DDM(W.SPRZET)), M.OPCJA(M.MIEJSCE_STALE(W.SPRZET)), M.OPCJA(M.PRACA(W.SPRZET)),
                                M.OPCJA(M.SAMOCHOD(W.SPRZET)), M.OPCJA(M.PRZY_SOBIE(W.SPRZET)))),

                        dzialacz.ULTIMATUM(dzialacz, W.SPRZET),

                        srodowisko.thread_while_loop(M.wsparcie(of(W.DZIALANIE_DLA_ZLA, W.SLEPE_DZIALANIE, W.KROTKOWZROCZNOSC))),
                        srodowisko.thread_while_loop(M.wsparcie(dzialacz)),

                        srodowisko.thread_while_loop(M.wplyw(dzialacz)),
                        dzialacz.thread_while_loop(M.wplyw(srodowisko)),

                        srodowisko.thread_while_loop(M.wzajemneOddzialywanie(srodowisko)),
                        srodowisko.thread_while_loop(M.moda()),
                        srodowisko.thread_while_loop(M.komfort()),
                        srodowisko.thread_while_loop(M.oczekiwania(W.AGRESJA_W_DZIALANIU, dzialacz)),
                        srodowisko.thread_while_loop(M.zagluszaSumienie(dzialacz)),

                        srodowisko.thread_while_loop(M.postawNajgorszeWarunki(drugaStrona,
                                KTO_KOGO_WARUNKI, KURESTWO_WARUNKI, OSLONY_WARUNKI)),

                        srodowisko.ULTIMATUM(dzialacz).OTHERWISE(of(on(STRATY_MORALNE_WARUNKI), on(STRATY_MATERIALNE_WARUNKI))),
                        srodowisko.OCZEKIWANIE_POPRAWY(dzialacz).OTHERWISE(of(
                                srodowisko.ZAMKNIECIE(dzialacz), srodowisko.WYKLUCZ(dzialacz),
                                srodowisko.KTO_KOGO_Z_PRZEWAGA(dzialacz, KTO_KOGO_WARUNKI)
                        )),

                        M.W(srodowisko.CZESTO(M.WZAJEMNE_RANY(RANY_WARUNKI)), "--->", srodowisko.TOLERANCJA(PRZYCZYNY_SLUZENIA_ZLU_WARUNKI)),
                        srodowisko.WHILE(dzialacz.thread_while_loop(of(W.SLUCHAJA, W.OBECNOSC_LUDZI, M.wykonujeRozkazy(W.GORA), M.KTO_KOGO(osobyPozaSrodowisko, KTO_KOGO_WARUNKI)))),

                        dzialacz.siejZlo(), M.otherwise(W.PRZEJEBANE, 0),
                        dzialacz.uzaleznijSieOdSrd(),
                        dzialacz.dzialanieWsrodDzialaczy(),
                        dzialacz.zdobadzInformacjeZeSrodowiskaNaKurestwie(),

                        dzialacz.WHILE(of(W.DOSTEP, W.OSOBA_POZA_SRODOWISKO)),
                        dzialacz.zamknijZasob(),
                        dzialacz.ukryjDostep(),
                        dzialacz.wbijNaMuke(),
                        dzialacz.wyklucz(),
                        dzialacz.skazNaIzolacje(),
                        dzialacz.naklejNalepke(),
                        dzialacz.uniz(),
                        dzialacz.cisnij(),
                        dzialacz.notyfikacjaEkipa(),
                        dzialacz.KTO_KOGO_Z_PRZEWAGA(osobyPozaSrodowisko, KTO_KOGO_WARUNKI),

                        M.W(osobyPozaSrodowisko.nieposlusznosc(), "--->", M.WYBOR(of(dzialacz.walkaPiesci(), dzialacz.sprzet()))),

                        dzialacz.patrzJakCierpi(),
                        dzialacz.cieszSieJegoCierpieniem(),
                        dzialacz.baluj(),
                        dzialacz.siejZlo(),
                        dzialacz.WHILE_END()
                )
        );

        List<W> dzialajcyZycie = of(
                M.WHILE(),
                W.PRZYJEMNOSCI,
                W.PRZEWAGA,
                W.PRZEWAGA_ZE_ZLA_OD_ROBIENIA_ZLA,
                M.WHILE_END()
        );

        List<W> dzialajcyPrzewagi = of(W.KLUB, W.MLODE_KOBIETY, W.SRODOWISKO, W.ZNAJOMI, W.EMOCJE, W.GNOJENIE, W.PRACA_PO_ZNAJOMOSCI);

        List<W> dzialajcySlabosci = of(W.BRAK_ZDROWIA, W.BRAK_SUMIENIA, W.PIEKLO);


        M.W(of(W.DZIALAJACY, W._88_, W.BLISKOSC), "--->", W.NASTAWIENIE_AGRESJA);
    }

    public void czlowiekCierpienia() {
        M.W(M.DLUGO(M.CIEZKO(of(W.CIERPIENIE, W.BOL))), "--->", M.WZIECIE_SPRAWIEDLIWOSCI(of(W.SILA, W.MADROSC, W.DOSWIADCZENIA)));

        M.W(M.KORZYSTA(W.SILA), "--->", M.MUSI(M.NA(W.ULICA)).OTHERWISE(W.PRZYPAL));

        M.W(of(W.WROG, W._88_, W.BLISKOSC), "--->", M.WALI(wrogowie));
    }

    public void sprawiedliwy() {
        List<W> sprawiedliwy = DEFAULT_WARUNKI;
    }

    public void postawyLudzkie() {
        M.DEFAULT(of(M.UKRYCIE(W.WADY), M.POKAZ(W.FALSZYWE_WRAZENIE), M.SKUPIENIE(W.PRZYJEMNOSCI)));

        M.ZLE(of(M.UKRYCIE(W.SLABOSC), M.POKAZ(W.SILA), M.SKUPIENIE(of(W.PRZEWAGA, on(KTO_KOGO_WARUNKI)))));

        M.DOBRE(of(M.PRACA_NAD(W.WADY), M.POKAZ(W.PRAWDA), M.SKUPIENIE(of(W.CEL, W.BYCIE_LEPSZYM))));
    }

    public void walkaKlas() {
        M.W(of(W.FEST, W.BLISKOSC, W.RDZENNY), "--->", of(fest.KTO_KOGO(rdzenny, KTO_KOGO_WARUNKI),
                                                            rdzenny.KTO_KOGO(fest, KTO_KOGO_WARUNKI)));

        M.W(of(W.SUPERPOZYCJA, W.BLISKOSC, W.RDZENNY), "--->", of(superPozycjaOsoby.KTO_KOGO_Z_PRZEWAGA(rdzenny, KTO_KOGO_WARUNKI)));

        M.W(of(W.BIEGACZ, W.BLISKOSC, W.RDZENNY), "--->", of(biegacz.KTO_KOGO_Z_PRZEWAGA(rdzenny, KTO_KOGO_WARUNKI)));

    }
}
