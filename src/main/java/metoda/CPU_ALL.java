package metoda;

import warunek.W;

import java.util.List;
import java.util.PriorityQueue;

import static typy_bazowe.TypOsoby.ME;

/**
 * Created by gadzik on 02.01.20.
 */
public class CPU_ALL extends AbstractCPU {
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
    List<W> metodySzponcnia = of(M.klamstwo(), M.obelgi_ponizanie(), M.przekonywanie(), M.bojka());
    List<W> pointcut = of(W.MATERIALNE_ZNALEZIENIE_SIE, W.DEFAULT_ZACHOWANIE, W.DEFAULT_WARUNKI, W.DZIALANIE, W.REAKCJA,
            W.MAKSYMALNIE_ULATWIASZ, W.PRZEKONYWANIE, W.ULTIMATUM);
    List<W> warunek = of(W.ULTIMATUM, W.POCZATEK, W.KONIEC, W.ZYSK, W.WARTOSC, W.ILOSC_OSOB, W.CZESTOTLIWOSC);

    List<W> orient = of(W.END_CASE, W.OBJECIE_POCZATEK_KONIEC, W.PRZEWIDZENIE_KONSEKWENCJI);
    List<W> okazja = of(W.DOBRO, W.POZNANIE, W.WALKA_PIESCI);

    List<W> niesprawiedliwosc = of(W.KOBIETA, W.SAMOCHOD, W.EKIPA, W.ZNAJOMI);
    List<W> patologie = PATOLOGIE;

    List<W> sytuacje = of(M.nieznajomy(W.DEFAULT_SYTUACJE), M.znajomy(W.SRODOWISKO_SYTUACJE));

    List<W> zleCzyny = of(W.MAGICZNE_ZAKLECIE, W.POJECHANIE_NA_PRZEWADZE, W.SKAZYWANIE_NA_CIERPIENIE, W.WYKLUCZENIE, W.UKRYCIE, W.ZAZDROSC, W.CHCIWOSC, W.KLAMSTWO, W.WYSMIANIE);
    List<W> dobreCzyny = of(W.PODZIELENIE_SIE_PRZEWAGA, W.WYZWOLENIE_Z_CIERPIENIA, W.PODNIESIENIE, W.UJAWNIENIE, W.PRAWDA, W.WYJEBANIE_ZLA_KONTRA);

    List<W> otaczajacyLudzie = of(W.LUDZIE_RODZINA, W.LUDZIE_PRACA, W.LUDZIE_DZIELNICA, W.ZNAJOMI_DZIELNICA, W.OBSLUGA);

    PriorityQueue<W> wartosciowaRzecz = new PriorityQueue<>(of(W.WYSILEK, W.WALKA, W.UTRZYMANIE_PRZEMOCA, W.UTRZYMANIE_EMOCJAMI));
    PriorityQueue<W> silaSprawcza = new PriorityQueue<>();

    List<W> mainFlows = of(W.GRUPA_PRZESTEPCZA, W.DOBRA_PRACA, W.STUDIA, W.KLUB, W.RESTAURACJA, W.WAKACJE_WODA, W.ZWIAZEK, W.ZNAJOMI);

    List<W> urodzenieDefault = DEFAULT_WARUNKI;

    public void run(){
        M.WW(
                of(W.ZAUWAZYLEM, W._II_, W.USLYSZALEM),
                of(
                        M.GRANT(ME,W.PRZEWAGA_CZASU),
                        M.GRANT(ME,W.PRZEWAGA_INFORMACJI),
                        M.pochwycenie(),
                        M.dzialanie(W.WIEDZA),
                        M.osiagniecie(),
                        M.utrzymanie()
                ),
                of(W.BRAK_DZIALANIA),
                of(
                        M.GRANT(ME, W.PATOLOGIA),
                        M.REMOVE(ME, W.ANTY_POSLUSZNOSC)
                )
        );


        M.WW(
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
        M.WW(
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
        M.W(of(W._NOT_, W.WARUNEK_A),
                of(
                        M.dzialanieNad(W.WARUNEK_B)
                )
        );
        M.W(of(W.ZAGROZENIE),
                of(
                        M.widziszTylkoPlusy(),
                        M.namierzPotencjalnyZysk(),
                        M.namierzZagrozenia(),
                        M.praca()
                )
        );
        M.WW(of(W.NORMALNA_SYTUACJA),
                of(
                        M.niedopuscDoZlejSytuacji(W.WIEDZA)
                ),
                of(W.ZLA_SYTUACJA),
                of(
                        M.zbijaj(W.WIEDZA)
                )

        );
        M.W(of(W.WYCHODZISZ_Z_PRACY),
                of(
                        M.estymacja(of(W.CZAS,W.SILY)),
                        M.notify(W.ZNAJOMI),
                        M.getPriorities(of(W.ULICA, W.KOBIETA, W.PRACA, W.NAUKA))
                )
        );
        M.WW(
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
        M.W(of(W.CHCESZ_NORMALNA_KOBIETE),
                of(
                        M.pokazujSie(of(W.NORMALNE_MIEJSCE, W.NORMALNA_PORA)),
                        M.zagaduj()
                )
        );
        M.W(of(W.IZOLACJA_CZLOWIEKA),
                of(
                        M.poznaj()
                )
        );
        M.W(of(W.ZLY, W._88_, W.LUDZIE),
                of(
                        M.podkop_u(W.WSZYSCY),
                        M.sprobojWziacWartosc(metodySzponcnia)
                )
        );

        M.W(M.WZAJEMNE(W.WARTOSC), "--->", W.STATUS_QUO);
        M.W(M.BRAK(W.WARTOSC), "--->", W.STARCIE);

        M.W(W.ILOSC, "--->", W.JAKOSC);

        trudnoLatwo();
        superpozycja();
        najwiekszaBron();
        zNieswiadomosci();
        rozmowa();
    }
    public void trudnoLatwo(){
        o(M.TRUDNO(W.ZWIAZEK)).WARUNEK(W.MEZCZYZNA);
        o(M.LATWO(W.ZWIAZEK)).WARUNEK(W.KOBIETA);
        M.LATWO(W.EMIGRACJA);
        M.TRUDNO(W.PRACA_KRAJ);
        o(M.TRUDNO(W.POZNANIE)).WARUNEK(W.MALE_SKUPISKO_LUDZI);
        M.TRUDNO(W.TRZEZWOSC);
        M.LATWO(W.UZYWKI);
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
                                    .otherwise(W.KONSEKWENCJE));

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
}
