package metoda;

import warunek.W;

import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by gadzik on 02.01.20.
 */
public class CPU_ALL extends AbstractCPU {
    W wazne = M.WAZNE(of(W.RODZINA, W.KOBIETA, W.PRACA, W.DOM));

    List<W> wymaganiaWstepne = KATEGORIA_WYMAGANIA_WSTEPNE;
    List<W> wymaganiaUtrzymania = KATEGORIA_WYMAGANIA_UTRZYMANIA;
    List<W> koncowe = KATEGORIA_WARUNKI_KONCOWE;

    List<W> globalnaPlanszaSwiata = of(W.SWIAT, W.KONTYNENT, W.KRAJ, W.MIASTO, W.DZIELNICA, W.OSIEDLE,
                                       W.CZAS_W_HISTORII,
                                       W.LUDZIE, on(PRZEWAGI_WARUNKI), on(SLABOSCI_WARUNKI), on(ZBIOR_EMOCJE_UCZUCIA),
                                                 on(RELACJE_WARUNKI), on(WALKA_WARUNKI),
                                        on(GLOBAL_PLANSZA_PRACA_WARUNKI), on(GLOBAL_PLANSZA_LUDZIE_WARUNKI),
                                        on(KSZTALTOWANIE_CZLOWIEKA_WARUNKI), on(KSZTALTOWANIE_DZIELNICY_WARUNKI));


    List<W> warunkiWyjscia = of(W.PORA_ROKU, W.CZAS, W.DOSTEPNOSC, W.ZOBACZENIE, W.BLISKOSC, W.KONTAKT);

    List<W> warunekiWejsciowe = of(W.ZLO_NA_CZUBKU_STOSU, W.DZUNGLA, W._100PROCENT_WYSILKU_10PROCENT_OTRZYMUJESZ, W.CALE_ZYCIE_CIERPIENIE,
            W.STARZEJESZ_SIE, W.MIESZKANIE_300TYS_WYPLATA_3TYS, W.KTOS_CIEBIE_LUB_TY_NIEGO, W.PUSTKA, W._1_OSOBA__DUZO,
            W.PRZEWAGA_ZROBIONA_NA_KRZYWDZIE_LUB_KURESTWIE, W.SLABSZA_PRZEWAGA_ULEGA_MOCNIEJSZEJ_W_MOMENCIE_PRZY_WARUNKACH,
            W.BIJESZ_KTOS_MOZE_ODDAC_MOCNIEJ, W.MALO_OSOB, W.OSOBY_KAZDY_NA_KAZDEGO
    );
    List<W> stan = of(W.WYSILEK_UMYSLOWY, W.WYSILEK_FIZYCZNY, W.DUZO_ZARCIA, W.WZROK, W.SAMOPOCZUCIE);

    List<W> warunki = of(W.OBECNOSC, W.PLANSZA, W.CZAS_START,W.CZAS_KONIEC, W.FOCUS, W.ZMECZENIE, W.BLISKOSC, W.DOSTEPNOSC);
    List<W> jakoscSytuacji = of(W.INTERAKCJA, W.ZNAJOMI, W.POTRZEBA,W.WARTOSC, W.UNIKALNOSC_W_OTOCZENIU);

    List<W> przyczyny = of(W.PRZYMUS, W.POTRZEBA, W.ZLO, W.DOBRO, W.ZYSK, W.MODA, W.PRZEWAGA, W.NUDA, W.UCZUCIE, W.CIEKAWOSC, W.ZAZDROSC);

    List<W> szansaNaWarunek = of(W.OBECNOSC, W.DEFAULT_ZACHOWANIE, W.DEFAULT_WARUNKI, W.DZIALANIE, W.REAKCJA,
            W.MAKSYMALNIE_ULATWIASZ, W.PRZEKONYWANIE, W.ULTIMATUM);
    List<W> warunek = of(W.POCZATEK, W.KONIEC, W.ZYSK, W.WARTOSC, W.ILOSC_OSOB, W.CZESTOTLIWOSC);

    List<W> orient = of(W.END_CASE, W.OBJECIE_POCZATEK_KONIEC, W.PRZEWIDZENIE_KONSEKWENCJI);
    List<W> okazja = of(W.DOBRO, W.POZNANIE, W.WALKA_PIESCI);

    List<W> niesprawiedliwosc = of(W.KOBIETA, W.SAMOCHOD, W.EKIPA, W.ZNAJOMI);
    List<W> patologie = KATEGORIA_PATOLOGIE;

    List<W> zleCzyny = of(W.MAGICZNE_ZAKLECIE, W.POJECHANIE_NA_PRZEWADZE, W.SKAZYWANIE_NA_CIERPIENIE, W.WYKLUCZENIE, W.UKRYCIE, W.ZAZDROSC, W.CHCIWOSC, W.KLAMSTWO, W.WYSMIANIE);
    List<W> dobreCzyny = of(W.PODZIELENIE_SIE_PRZEWAGA, W.WYZWOLENIE_Z_CIERPIENIA, W.PODNIESIENIE, W.UJAWNIENIE, W.PRAWDA, W.WYJEBANIE_ZLA_KONTRA);

    List<W> otaczajacyLudzie = of(W.LUDZIE_RODZINA, W.LUDZIE_PRACA, W.LUDZIE_DZIELNICA, W.ZNAJOMI_DZIELNICA, W.OBSLUGA);

    PriorityQueue<W> wartosciowaRzecz = new PriorityQueue<>(of(W.WYSILEK, W.WALKA, W.UTRZYMANIE_PRZEMOCA, W.UTRZYMANIE_EMOCJAMI));
    PriorityQueue<W> silaSprawcza = new PriorityQueue<>();

    List<W> mainFlows = of(W.GRUPA_PRZESTEPCZA, W.DOBRA_PRACA, W.STUDIA, W.KLUBY_DYSKOTEKA, W.KLUBY_KIBICOWSKIE, W.RESTAURACJA, W.WAKACJE_WODA, W.ZWIAZKI,
                            W.ZNAJOMI, W.SLUZBA_ZROWIA, W.SLUZBY_MUNDUROWE, W.INTERNET, W.TELEWIZJA);

    List<W> urodzenieDefault = DEFAULT_WARUNKI;
    List<W> czas = ZBIOR_CZAS;
    List<W> duzoIf = DUZO_IF_WARUNKI;
    List<W> ksztaltowanieDzielnicy = KSZTALTOWANIE_DZIELNICY_WARUNKI;
    List<W> emocjeUczucia = ZBIOR_EMOCJE_UCZUCIA;
    List<W> rozrywkiZart = ZBIOR_ROZRYWKI_ZART;
    List<W> przymus = PRZYMUS_WARUNKI;
    List<W> potrzeby = POTRZEBY_WARUNKI;
    List<W> zagrozenia = ZAGROZENIA_WARUNKI;
    List<W> cierpienia = CIERPIENIA_WARUNKI;
    List<W> przewagi = PRZEWAGI_WARUNKI;
    List<W> slabosci = SLABOSCI_WARUNKI;
    List<W> twl = THREAD_WHILE_LOOP_WARUNKI;
    List<W> typySytuacji = TYPY_SYTUACJI;
    List<W> typyLudzi = ZBIOR_TYPY_LUDZI;
    List<W> wspomnienia = WSPOMNIENIA_WARUNKI;
    List<W> tematy = ZBIOR_TEMATY;
    List<W> wiedza = ZBIOR_WIEDZA;

    public void run(){
        M.WWW(W.INFORMACJA, "--->", M.SONDA(W.INFORMACJA), "--->", W.NASTAWIENIE, "--->", W.DZIALANIE);
        M.WW(W.DZIALANIE, "--->", M.OSIAGNIECIE(W.WARUNEK), "--->", M.ZASIEG(M.NOWY(of(W.WARUNEK, W.INFORMACJA))));

        M.WW(W.POTRZEBA, "--->", of(M.WYMAGANE(W.WARUNKI), W.PODJECIE_DECZYJI,
                                M.OPCJA(W.WIEDZA), M.OPCJA(M.SONDA(W.SZANSE_NA_SUKCES))), "--->", of(W.DZIALANIE, M.PROBA(M.REALIZACJA(W.POTRZEBA))));

        M.W(W.WARTOSC, "--->", of(M.DLUGO(M.CIEZKO(of(W.CIERPIENIE, W.PRACA))), M.MALO_OSOB(M.POSIADA(W.WARTOSC))));

        M.W(of(on(PRZEWAGI_WARUNKI), W.WARUNEK_SPRZYJAJACY), "--->", M.WIEKSZE_SZANSE(M.OSIAGNIECIE(W.WARUNEK)));
        M.W(of(on(SLABOSCI_WARUNKI), W.WARUNEK_NIESPRZYJAJACY) ,"--->", M.MNIEJSZE_SZANSE(M.OSIAGNIECIE(W.WARUNEK)));

        M.W(M.ZAUWAZYLEM(M.USLYSZALEM(W.INFORMACJA)), "--->", of(W.PRZEWAGA_CZASU, W.PRZEWAGA_INFORMACJI,
                                                                                    M.pochwycenie(),
                                                                                    M.dzialanie(W.WIEDZA),
                                                                                    M.osiagniecie(),
                                                                                    M.utrzymanie()));

        M.W(of(M.ZAUWAZYLEM(M.USLYSZALEM(W.INFORMACJA)),
                              W._88_, W.BRAK_DZIALANIA), "--->", of(W.STRACONA_SZANSA, M.INNA_OSOBA(M.OTRZYMANIE(W.SZANSA))));

        M.W(W.NIESWIADOMOSC, "--->", W.NIESZCZESCIE);

        M.W(M.WYKONYWANIE(W.PRACA), "--->", of(M.wszystkoAbyOtrzymacRezultat(),
                                                         M.doSedna(),
                                                         M.doKonca()));
        M.W(of(on(PRZEWAGI_WARUNKI),
               on(SLABOSCI_WARUNKI),
               on(KRZYWDY_WARUNKI),
               on(BRAK_ZASAD_WARUNKI),
               on(ZBIOR_EMOCJE_UCZUCIA),
               on(RELACJE_WARUNKI),
               on(WALKA_WARUNKI),
               on(CIERPIENIA_WARUNKI),
               W.PUSTKA),  "-------->", M.DOTYCZA(M.UDERZAJA(W.KAZDEGO_CZLOWIEKA)));

        M.W(W.NA_MIEJSCU, "--->", of(M.doSedna(), M.doKonca()));


        M.W(of(W._NIE_, W.WARUNEK_A), "--->", M.dzialanieNad(W.WARUNEK_B));

        M.W(of(W.ZAGROZENIE), "--->", of(M.widziszTylkoPlusy(),
                                              M.namierzPotencjalnyZysk(),
                                              M.namierzZagrozenia(),
                                              M.praca()));

        M.W(M.thread_while_loop(W.NORMALNA_SYTUACJA), "--->", M.niedopuscDoZlejSytuacji(W.WIEDZA));

        M.W(W.ZLA_SYTUACJA, "--->", M.zbijaj(W.WIEDZA));

        M.W(of(W.WYCHODZISZ_Z_PRACY), "---->", of(M.estymacja(of(W.CZAS,W.SILY)),
                                                       M.poinformuj(W.ZNAJOMI),
                                                       M.priorytety(of(W.ULICA, W.KOBIETA, W.PRACA, W.NAUKA))));

        M.W(W.PLAN, "--->", of(M.POTRZEBNE(of(W.CZAS, W.BLISKOSC, W.DLUGOSC_DOSTEPU)),
                                                M.najszybszaWprowadzenieWZycie(),
                                                M.ominOdlozenieNaPozniej(),
                                                M.ocenWedleCoGorzej()));

        M.W(W.BRAK_WYKONANIA_PLANU, "--->", M.przechodziDoKolejnegoPokojuCzasu(W.PLAN));

        M.W(W.CHCESZ_NORMALNA_KOBIETE, of(M.pokazujSie(of(W.NORMALNE_MIEJSCE, W.NORMALNA_PORA)),
                                          M.zagaduj()));

        M.W(M.WZAJEMNE(W.WARTOSC), "--->", W.STATUS_QUO);
        M.W(M.BRAK(W.WARTOSC), "--->", W.STARCIE);

        M.W(W.ILOSC, "--->", W.JAKOSC);

        M.W(W.OSOBA, "--->", of(W.OBECNOSC, W.ENERGIA, W.CHECI, W.DZIALANIE));

        M.W(M.SMIERC(W.BLISKA_OSOBA), "--->", of(M.PERMANENTNA(W.STRATA), on(EMOCJE_NEGATYWNE_WARUNKI), on(UCZUCIA_NEGATYWNE_WARUNKI)));

        M.W(M.OSOBA(W.INNA_RASA), "--->", M.DEFAULT(of(W.RASIZM, M.GORSZE_TRAKTOWANIE(W.OSOBA))));

        M.W(M.POZNANIE(W.OSOBA), "--->", M.NABYCIE(W.RELACJA));

        M.W(W.SILA_RZADZI, "--->", of(M.PRAWDZIWA(W.WARTOSC), W.PRAWDA));
        M.W(M.BRAK(W.SILA_RZADZI), "--->", of(M.BRAK(W.WARTOSC), W.KLAMSTWO, W.FEST_RZADZI));

        M.W(of(W.WIEDZA, W.INFORMACJA, M.WNIOSKI(W.DOSWIADCZENIA),
               W.SONDA, W.WLASCIWA_OCENA, W.ZNAJOMOSC_OTOCZENIA,
                             W.TRZEZWOSC, M.WNIOSKI(W.HISTORIA)),"--->", W.TRAFNE_DECYZJE);

        M.W(W.NIEZNAJOMY, "--->", W.DEFAULT_SYTUACJA);
        M.W(W.ZNAJOMY, "--->", W.SRODOWISKOWA_SYTUACJA);
        M.W(W.WARUNEK_SPRZYJAJACY, "--->", W.CHCIANA_SYTUACJA);

        waznyTrudnyWarunek();
        superpozycja();
        najwiekszaBron();
        zNieswiadomosci();
        rozmowa();
        zasobZjawiskoDefault();
    }
    public void waznyTrudnyWarunek() {
        of(
                M.PERSPEKTYWA(W.ULICA).MALY_WARUNEK(W.PIENIADZE),
                M.WAZNE(W.RODZINA),
                M.WAZNE(of(W.INFORMACJA, W.CZAS)),
                M.WAZNE(of(W.ULICA, W.SILA, W.ZNAJOMI)),
                M.WAZNE(of(W.ROZWOJ_UMYSLOWY, W.ROZWOJ_FIZYCZNY)),
                M.WAZNE(of(W.WYCHODZENIE, W.OBECNOSC)),
                M.WAZNE(W.ZAGADANIE),

                M.TRUDNO(M.MEZCZYZNA(W.ZWIAZEK)),
                M.LATWO(M.KOBIETA(W.ZWIAZEK)),
                M.LATWO(W.EMIGRACJA),
                M.TRUDNO(W.PRACA_KRAJ),
                M.TRUDNO(W.POZNANIE).GDY(W.MALE_SKUPISKO_LUDZI),
                M.TRUDNO(W.TRZEZWOSC),
                M.LATWO(W.UZYWKI)
        );
    }

    public void superpozycja(){
        if (W.MIEJSCE == W.MIEJSCE_PRZESTRZEGANIA_PRAWA) {
            wysokaPozycja.SET(W.SILA_SPRAWCZA);
        } else {
            silaFizyczna.SET(W.SILA_SPRAWCZA);
        }

        M.W(of(W.SUPERPOZYCJA),
                of(
                        M.jebZPerspektywyPozycji(),
                        M.twojeZdanieWazniejsze(),
                        M.tyKogosPodkopujOnCiebieNieMoze(),
                        M.ukryjOklam(),
                        M.wykorzystaj(),
                        M.wonty(),
                        M.brakPochwaly()
                )
        );

        M.WARUNKI_WSTEPNE(of(W.POSLUSZNY, W.UZNAJE_HIERARCHIE));
        pracownicy.thread_while_loop(M.poparcie(W.SUPERPOZYCJA));

        superPozycjaOsoby.thread_while_loop(M.gnojenieZPerspektywyPozycji(pracownicy));
        pracownicy.thread_while_loop(M.gnojenie(pracownicy));

        superPozycjaOsoby.naginaniePrawa();
        W prawo = superPozycjaOsoby.pisaniePrawa();

        wszyscy.thread_while_loop(M.przestrzeganie(prawo)
                                    .w_przeciwnym_przypadku(W.KONSEKWENCJE));

        M.of(prawo).szkodzi(wszyscy);

        superPozycjaOsoby.SET(of(
                W.ODDANIE_SIE_ZA_PIENIADZE, W.BRAK_WSTEPU_RDZENNI, W.LECZY_KOMPLEKSY_W_PRACY,
                W.TWARDOGLOWOSC, W.POCZUCIE_SUKCESU, W.PIENIADZE
        ));

        superPozycjaOsoby.SET(of(
                W.DUZO_OBOWIAZKOW, W.MALO_CZASU, W.NIE_PAMIETA_SWOICH_OFIAR, W.OCZEKIWANIA
        ));

        M.W(of(W.SLEPA_LOJALNOSC, W.UZNAJE_HIERARCHIE, W.DUZO_UMIEJETNOSCI, W.MIEJSCE), "--->", of(W.SUPERPOZYCJA));

        M.W(of(W.BRAK_SUPERPOZYCJI), "--->", of(W.NIEWOLNIK, W.TWOJE_ZDANIE_NIC_NIE_ZNACZY));

        M.W(W.WYSOKA_POZYCJA, "--->", M.DEFAULT(M.BRAK_DOSTEPU(W.SWIAT), M.DOSTEP(W.FIRMA), M.SILA_SPRAWCZA(W.FIRMA)));
    }

    public void najwiekszaBron() {
        M.W(of(W.ULICA), "--->", of(W.SPRZET, W.KONTUZJA));

        M.W(of(W.PRACA), "--->", of(W.ZWOLNIENIE, W.SPRAWA_W_SADZIE));
    }

    public void zNieswiadomosci() {
        M.WW(of(W.NIESWIADOMOSC, W._II_, W.GLUPOTA), "--->", M.SPOTKANY(W.ZLY), "--->", W.ZLO);
        M.WW(of(W.NIESWIADOMOSC, W._II_, W.GLUPOTA), "--->", M.SPOTKANY(W.DOBRY), "--->", W.DOBRO);
        M.WW(of(W.NIESWIADOMOSC, W._II_, W.GLUPOTA), "--->", M.POZNANIE(W.CIEZKA_PRACA), "--->", W.PRACA);
    }

    public void rozmowa() {
        M.thread_while_loop(W.SYTUACJA_SRODOWISKOWA);

        M.WSPOMNIJ(W.SYTUACJA).POWIAZ_Z(W.OSOBA).WSPOMIJ(W.REZULTAT)
                                                .WSPOMIJ(W.SKOJARZONE);
    }

    public void zasobZjawiskoDefault() {
        M.W(W.OSOBA, "--->", M.DEFAULT(of(W.ZLY, W.GLUPI)));

        M.W(W.OSOBA, "--->", M.DEFAULT(W.CIEZKO_W_ZYCIU));

        M.W(W.DZIALANIE, "--->", M.DEFAULT(of(W.ZLE, W.GLUPIE)));

        M.W(W.NOWA_OSOBA, "--->", M.DEFAULT(KRZYWDY_WARUNKI));

        M.W(W.DZIALANIE, "--->", M.DEFAULT(M.DZIALANIE(W.ZA_CIOSEM)));
    }
}
