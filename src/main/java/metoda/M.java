package metoda;

import osoba.Osoba;
import sytuacja.TypSytuacja;
import temat.TT;
import typy_bazowe.TypOsoby;
import typy_bazowe.TypT;
import warunek.W;
import warunek.WarunkiKategoria;
import z_inne.OsobaMetod;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gadzik on 21.12.19.
 */
public class M {

    public static String wejsciePlansza(List<W> plansza){
        return "wejsciePlansza("+ plansza +")";
    }
    public static String namierzenie(){
        return "namierzenie()";
    }
    public static String sondaOsoby(List<W> osobaCechy){
        return "sondaOsoby("+osobaCechy+")";
    }
    public static String sondaSytuacji(List<TypSytuacja> typySytuacji, List<W> essentials){
        return "sondaSytuacji("+ typySytuacji +" "+ essentials +")";
    }
    public static String odrazuPochwycenie(W w){
        return "odrazuPochwycenie("+ w +")";
    }
    public static String dzialanie(List<W> mojeCechy){
        return "dzialanie("+ mojeCechy +")";
    }
    public static String dzialanie(W warunek){return "dzialanie("+ warunek +")";}
    public static String GRANT(TypOsoby osoba, W w){
        return "GRANT("+ osoba +" "+ w +")";
    }
    public static String GRANT(TypOsoby osoba, List<W> w){ return "GRANT("+ osoba +" "+ w +")"; }
    public static String REMIND(TypOsoby osoba, W w){
        return "REMIND("+ osoba +" "+ w +")";
    }
    public static String REMIND(TypOsoby osoba, List<W> w){
        return "REMIND("+ osoba +" "+ w +")";
    }
    public static String REMOVE(TypOsoby osoba, W w){
        return "REMOVE("+ osoba +" "+ w +")";
    }
    public static String wstanie(){
        return "wstanie()";
    }
    public static String przejscie(){
        return "przejscie()";
    }
    public static String prefix(List<TypT> prefixes, List<TypT> pdstw){
        return "prefix("+ prefixes + " "+ pdstw +")";
    }
    public static String pprefix(List<TypT> prefixes, List<TT> kombo){
        return "prefix("+ prefixes + " "+ kombo +")";
    }
    public static String prefixMimoWszystko(List<TypT> prefixes, List<TypT> pdstw){
        return "prefix("+ prefixes + " "+ pdstw +")";
    }
    public static String gadka(List<TT> tematy, List<TT> kombo){
        return "gadka("+ tematy +" "+ kombo +")";
    }
    public static String wziecieKontaktu(){
        return "wziecieKontaktu()";
    }
    public static String temat(){
        return "temat()";
    }
    public static String ponowienie(){
        return "ponowienie()";
    }
    public static String cipa(){
        return "cipa()";
    }
    public static String pokazZainteresowanie(){
        return "pokazZainteresowanie()";
    }
    public static String II(){
        return "II()";
    }
    public static String izoluj(){return "izoluj()";}
    public static String pomysl(List<W> warunki){
        return "pomysl("+ warunki +")";
    }
    public static String nieOddalaszWzroku(){ return "nieOddalaszWzroku()";}
    public static String zwazNaSzczegoly(){ return "zwazNaSzczegoly()";}
    public static String pokazSie(){ return "pokazSie()";}
    public static String wypracujDobraSytuacje(W ogranicznieCzasowe){ return "wypracujDobraSytuacje("+ ogranicznieCzasowe +")";}
    public static String oczekujNaSpojrzenie(W ogranicznieCzasowe){ return "oczekujNaSpojrzenie("+ ogranicznieCzasowe +")";}
    public static String wlozDoKubelka(){ return "wlozDoKubelka()";}
    public static String przechodziszTylkoRaz(){return "przechodziszTylkoRaz()";}
    public static String omijaszPartyzantke(){return "omijaszPartyzantke()";}
    public static String podbicieZJednejProby(){return "podbicieZJednejProby()";}
    public static String popierdalaszObecna() {return "popierdalaszObecna()";}
    public static String jazdaZLepsza() {return "jazdaZLepsza()";}
    public static String niesiadasz() {return "niesiadasz()";}
    public static String szukanieDobrejPlanszy() {return "szukanieDobrejPlanszy()";}
    public static String pobierzInformacjeStrefy() {return "pobierzInformacjeStrefy()";}
    public static String wybierzStrefe() {return "wybierzStrefe()";}
    public static String sondaPrzystanekKoncowy() {return "sondaPrzystanekKoncowy()";}
    public static String skupiaszNaPrzystankach() {return "szukanieDobrejPlanszy()";}
    public static String rozgladniecie() {return "rozgladniecie()";}
    public static String odrazuPoWejsciu() {return "odrazuPoWejsciu()";}
    public static String poJakimsCzasie() {return "poJakimsCzasie()";}
    public static String odrazuPoWyjsciu() {return "odrazuPoWyjsciu()";}
    public static String lecZaNia() {return "lecZaNia()";}
    public static String dogon() {return "dogon()";}
    public static String sciagajGadke() {return "sciagajGadke()";}
    public static String docen() {return "sciagajGadke()";}
    public static String sondujWarunekDodatni() {return "sondujWarunekDodatni()";}
    public static String zwrocUwage() {return "zwrocUwage()";}
    public static String abyInniMysleliZeZnasz() {return "abyInniMysleliZeZnasz()";}
    public static String wchodziszWychodzisz(W miejsce){ return "oczekujNaSpojrzenie("+ miejsce +")";}
    public static String niePrzestraszenie() {return "niePrzestraszenie()";}
    public static String dzialajJakbyNieBylo() {return "dzialajJakbyNieBylo()";}
    public static String stajesz2s() {return "stajesz2s()";}
    public static String kontekst() {return "kontekst()";}
    public static String sondaGdzie() {return "sondaGdzie()";}
    public static String bijesz() {return "bijesz()";}
    public static String temat_x3(List<TT> tematy) {return "temat_x3("+ tematy +")";}
    public static String przewidywanie_x3() {return "przewidywanie_x3()";}
    public static String CEL(W cel) {return "CEL("+ cel +")";}
    public static String odrazuJakObsluguje() {return "odrazuJakObsluguje()";}
    public static String jednoWejscieJednoPodbicie() {return "jednoWejscieJednoPodbicie()";}
    public static String komplement_x2() {return "jednoWejscieJednoPodbicie()";}
    public static String ogladneLadnaBuzie() {return "ogladneLadnaBuzie()";}
    public static String powiemDobrego() {return "powiemDobrego()";}
    public static String zblizPrzezLudzi() {return "zblizPrzezLudzi()";}
    public static String partyzantka_on() {return "partyzantka_on()";}
    public static String zatrzymaj() {return "zatrzymaj()";}
    public static String obroc() {return "obroc()";}
    public static String podejdz() {return "podejdz()";}
    public static String wejdzPrzed(String coTakPatrzysz) {return "wejdzPrzed("+ coTakPatrzysz +")";}
    public static String ekstremalneRzeczy() {return "ekstremalneRzeczy()";}
    public static String podbieganieZawracanie() {return "podbieganieZawracanie()";}
    public static String podbijaszGdyRobiaSwojego() {return "podbijaszGdyRobiaSwojego()";}
    public static String baczek() {return "baczek()";}
    public static String namierzZareagowana() {return "namierzZareagowana()";}
    public static String oswajaj() {return "oswajaj()";}
    public static String czas_start() {return "czas_start()";}
    public static String ida(W czas) {return "ida("+ czas +")";}
    public static String idzieSzybko(W czas) {return "ida("+ czas +")";}
    public static String idzieTwojaStrone(W czas, W wymaganie) {return "idzieTwojaStrone("+ czas + " "+ wymaganie +")";}
    public static String idzieDobreMiejscePrzech(W czas) {return "ida("+ czas +")";}
    public static String dluzejTylko(W warunek) {return "ida("+ warunek +")";}
    public static String spojrzenie_1(W warunek) {return "ida("+ warunek +")";}
    public static String spojrzenie_2(W warunek) {return "ida("+ warunek +")";}
    public static String podbijasz() {return "podbijasz()";}
    public static String DEFAULT(String ...zachowanie) {return "DEFAULT("+ zachowanie +")";}
    public static String DEFAULT(W warunek) {return "DEFAULT("+ warunek +")";}
    public static String DEFAULT(List<W> warunki) {return "DEFAULT("+ warunki +")";}
    public static String DEFAULT_WARUNKI(List<W> warunki) {return "DEFAULT("+ warunki +")";}
    public static String piszesz() {return "piszesz()";}
    public static String probujeszSieUstawic() {return "probujeszSieUstawic()";}
    public static String finalizujeszZaproszeniemLubKontakt(List<String> metodyFinalizacji) {return "finalizujeszZaproszeniemLubKontakt("+ metodyFinalizacji +")";}
    public static String podkreslJejZlaSytuacje(List<W> warunki) {return "podkreslJejZlaSytuacje("+ warunki +")";}
    public static String podkreslSwojeStrania() {return "podkreslSwojeStrania()";}
    public static String znamySie() {return "znamySie()";}
    public static String obrazSieJakNieOdpowie() {return "obrazSieJakNieOdpowie()";}
    public static String ultimatum(W kara) {return "znamySie()";}
    public static String ponow() {return "obrazSieJakNieOdpowie()";}
    public static String zalagodzNeturalTematem() {return "obrazSieJakNieOdpowie()";}
    public static String tyrajZNiejBeke() {return "obrazSieJakNieOdpowie()";}
    public static String rozgladnijSieZaSytuacja() {return "rozgladnijSieZaSytuacja()";}
    public static String zobowiazanie(W warunek) {return "zobowiazanie("+ warunek +")";}
    public static String _3xWchodziszDopieroZnowSytuacja() {return "_3xWchodziszDopieroZnowSytuacja()";}
    public static String osiagniecie() {return "osiagniecie()";}
    public static String utrzymanie() {return "utrzymanie()";}
    public static String NEEDED(List<W> warunki) {return "NEEDED("+ warunki +")";}
    public static String najszybszaEgzekucja() {return "najszybszaEgzekucja()";}
    public static String ominPartyzantke() {return "ominPartyzantke()";}
    public static String wedleCoGorzej() {return "wedleCoGorzej()";}
    public static String przechodziDoKolejnegoPokojuCzasu(W warunek) {return "przechodziDoKolejnegoPokojuCzasu("+ warunek +")";}
    public static String pochwycenie() {return "pochwycenie()";}
    public static String wszystkoAbyOtrzymacRezultat() {return "wszystkoAbyOtrzymacRezultat()";}
    public static String doSedna() {return "doSedna()";}
    public static String doKonca() {return "doKonca()";}
    public static String sondujJakDaleki(W warunek) {return "sondaPrzyczyn("+ warunek +")";}
    public static String sondujJakSilny(W warunek) {return "sondujJakSilny("+ warunek +")";}
    public static String sondaPrzyczyn(List<W> przyczyny) {return "sondaPrzyczyn("+ przyczyny +")";}
    public static String widziszTylkoPlusy() {return "widziszTylkoPlusy()";}
    public static String namierzPotencjalnyZysk() {return "namierzPotencjalnyZysk()";}
    public static String namierzZagrozenia() {return "namierzZagrozenia()";}
    public static String praca() {return "praca()";}
    public static String niedopuscDoZlejSytuacji(W srodek) {return "niedopuscDoZlejSytuacji("+ srodek +")";}
    public static String zbijaj(W srodek) {return "zbijaj("+ srodek +")";}
    public static String pokazujSie(List<W> warunki) {return "pokazujSie("+ warunki +")";}
    public static String zagaduj() {return "zagaduj()";}
    public static String estymacja(List<W> warunki) {return "estymacja("+ warunki +")";}
    public static String notify(W znajomi) {return "notify("+ znajomi +")";}
    public static String getPriorities(List<W> priorities) {return "getPriorities("+ priorities +")";}
    public static String dzialanieNad(W b) {return "notify("+ b +")";}
    public static String poznaj() {return "poznaj()";}
    public static String podkop_u(W ukogo) {return "podkop_u("+ ukogo +")";}
    public static String sprobojWziacWartosc(List<String> metody) {return "sprobojWziacWartosc("+ metody +")";}
    public static String klamstwo() {return "klamstwo()";}
    public static String obelgi_ponizanie() {return "obelgi_ponizanie()";}
    public static String przekonywanie() {return "przekonywanie()";}
    public static String bojka() {return "bojka()";}
    public static String walkaSila(List<W> typy) {return "walkaSila("+ typy +")";}
    public static String walkaWiedza(List<W> typy) {return "walkaWiedza("+ typy +")";}
    public static String wszystkoNaChlodno() {return "wszystkoNaChlodno()";}
    public static String tyDobrze() {return "tyDobrze()";}
    public static String karzeszZaWadyZachowania() {return "karzeszZaWadyZachowania()";}
    public static String dostepDoInformacjiPrzezManiury() {return "dostepDoInformacjiPrzezManiury()";}
    public static String wstrzymajSieZWiezeciemKobiety() {return "wstrzymajSieZWiezeciemKobiety()";}
    public static String szukajHakow() {return "szukajHakow()";}
    public static String walkaPiesci() {return "walkaPiesci()";}
    public static String walkaSprzet() {return "walkaSprzet()";}
    public static String oparcieSie(List<W> warunki) {return "oparcieSie("+ warunki +")";}
    public static String sondaPrzypalu(List<W> kryteriaPrzypalu) {return "sondaPrzypalu("+ kryteriaPrzypalu +")";}
    public static String sondaDostepu() {return "sondaDostepu()";}
    public static String sondaZagrozenia() {return "sondaZagrozenia()";}
    public static String skasowanieDostepu() {return "skasowanieDostepu()";}
    public static String postawienieNajwiekszejPrzewagiWKrotkimCzasie() {return "postawienieNajwiekszejPrzewagiWKrotkimCzasie()";}
    public static String nieDajSzansObrony() {return "nieDajSzansObrony()";}
    public static String przestrzeganie(List<W> warunki) {return "przestrzeganie("+ warunki +")";}
    public static String poCichu() {return "poCichu()";}
    public static String glosno() {return "glosno()";}
    public static String otwarteStacieF2F() {return "otwarteStacieF2F()";}
    public static String obrazanie(List<TT> obelgi) {return "obrazanie("+ obelgi +")";}
    public static String ukazanieZlychCech() {return "ukazanieZlychCech()";}
    public static String wspominanieZlychWydarzen() {return "wspominanieZlychWydarzen()";}
    public static String zartowanie(List<TT> zarty) {return "zartowanie("+ zarty +")";}
    public static String terror(List<W> sposoby) {return "obrazanie("+ sposoby +")";}
    public static String ktoZNimTenKurwa() {return "ktoZNimTenKurwa()";}
    public static String shanbienie() {return "shanbienie()";}
    public static String widziszTylkoZlaStrone() {return "widziszTylkoZlaStrone()";}
    public static String odnowa() {return "odnowa()";}
    public static String odnowaMocniej() {return "odnowaMocniej()";}
    public static String wjezdzanieNaCalyCyklDnia() {return "wjezdzanieNaCalyCyklDnia()";}
    public static String dlugRosnie() {return "dlugRosnie()";}
    public static String ultimatum(List<W> warunki) {return "ultimatum("+ warunki +")";}
    public static String dokrecanieSruby() {return "dokrecanieSruby()";}
    public static String zamkniecieSytuacjiBezpowrotnie() {return "zamkniecieSytuacjiBezpowrotnie()";}
    public static String zUkrycia() {return "zUkrycia()";}
    public static String zZaskoczenia() {return "zZaskoczenia()";}
    public static String reaguj() {return "reaguj()";}
    public static String spedzCzas() {return "spedzCzas()";}
    public static String utrzymajPozycje() {return "utrzymajPozycje()";}
    public static String atak() {return "utrzymajPozycje()";}
    public static String zamykajDostep() {return "utrzymajPozycje()";}
    public static String wspieraj() {return "utrzymajPozycje()";}
    public static String udostepniaj() {return "utrzymajPozycje()";}
    public static String skreslaj(OsobaMetod osoba) {return "utrzymajPozycje()";}
    public static String wstrzymajSie() {return "utrzymajPozycje()";}
    public static String wychodzisz() {return "wychodzisz()";}
    public static String odslaniasz() {return "odslaniasz()";}
    public static String wydluzajCzas() {return "wydluzajCzas()";}
    public static String estymuj() {return "estymuj()";}
    public static String maloLazBezCelu() {return "maloLazBezCelu()";}
    public static String duzoGetAndCompare() {return "duzoGetAndCompare()";}
    public static String od_8_do_22() {return "od_8_do_22()";}
    public static String proba() {return "proba()";}
    public static String wnioski() {return "wnioski()";}
    public static String wiedza() {return "wiedza()";}
    public static String thread_while_loop(W typ) {return "thread_while_loop("+ typ +")";}
    public static String thread_while_loop(List<W> typy) {return "thread_while_loop("+ typy +")";}

    public static String neutral() {return "neutral()";}
    public static String wyjebane() {return "wyjebane()";}
    public static String pokazPrzewagi() {return "pokazPrzewagi()";}
    public static String pokazSieZNajlepszejStronyZachowania() {return "pokazSieZNajlepszejStronyZachowania()";}
    public static String wzrokiemPowstrzymaj() {return "wzrokiemPowstrzymaj()";}
    public static String nadajZobowiazanieTonem() {return "nadajZobowiazanieTonem()";}
    public static String izolujObszar() {return "izolujObszar()";}
    public static String ocenWedlugWad(Osoba osoba) {return "ocenWedlugWad("+ osoba +")";}
    public static String oszacujOgraniczenia(Osoba osoba) {return "oszacujOgraniczenia("+ osoba +")";}
    public static String oszacujDzienCodzienny(Osoba osoba) {return "oszacujDzienCodzienny("+ osoba +")";}
    public static String oszacujWartosci(Osoba osoba) {return "oszacujWartosci("+ osoba +")";}
    public static String oszcaujZagrozenia(Osoba osoba) {return "oszcaujZagrozenia("+ osoba +")";}
    public static String skinaj() {return "skinaj()";}
    public static String _3pktTwarzy() {return "_3pktTwarzy()";}
    public static String initGadki() {return "initGadki()";}

    public static String kontrubutujesz() {return "kontrubutujesz()";}
    public static String wyborOsob() {return "wyborOsob()";}
    public static String glos() {return "glos()";}
    public static String odMalegoDoDuzego() {return "odMalegoDoDuzego()";}
    public static String akcentujCoWazne() {return "akcentujCoWazne()";}

    public static String docenDostep() {return "docenDostep()";}
    public static String inputDodatni() {return "inputDodatni()";}
    public static String efektywnaInterakcja() {return "efektywnaInterakcja()";}
    public static String izolujJednostki() {return "izolujJednostki()";}
    public static String angazujJednostki() {return "angazujJednostki()";}
    public static String stworzWartosc() {return "stworzWartosc()";}
    public static String kontruj() {return "kontruj()";}
    public static String dzialaj() {return "dzialaj()";}
    public static String przestroga() {return "przestroga()";}
    public static String upierasz() {return "upierasz()";}
    public static String udowadniaszPrzytaczasz() {return "udowadniaszPrzytaczasz()";}
    public static String odpusc() {return "akcentujCoWazne()";}
    public static String wygrales() {return "wygrales()";}
    public static String prowokujStarcie() {return "prowokujStarcie()";}
    public static String udowadniaj() {return "udowadniaj()";}
    public static String serceZkamienia() {return "serceZkamienia()";}
    public static String powtarzajGlosnoSensowneArgs() {return "powtarzajGlosnoSensowneArgs()";}
    public static String mowSzybko() {return "mowSzybko()";}
    public static String uwagaNaSobie() {return "uwagaNaSobie()";}
    public static String przywolajPorzadek() {return "udowadniaj()";}
    public static String starcie() {return "starcie()";}
    public static String starcie(List<WarunkiKategoria> rany) {return "starcie("+ rany +")";}
    public static String postawCiezkiWarunek(List<WM> srodki) {return "postawCiezkiWarunek("+ srodki +")";}
    public static String zapamietaj() {return "zapamietaj()";}
    public static String zapamietaj(List<W> warunki) {return "zapamietaj("+ warunki +")";}
    public static String nieCzekaj() {return "nieCzekaj()";}
    public static String wyprzedz() {return "wyprzedz()";}
    public static String szybkoDzialaj() {return "szybkoDzialaj()";}
    public static String punktujWady() {return "punktujWady()";}
    public static String wprowadzCosLepszego() {return "wprowadzCosLepszego()";}
    public static String rozdupcSila() {return "rozdupcSila()";}
    public static String wysmianie() {return "wysmianie()";}
    public static String zleEmocje() {return "zleEmocje()";}
    public static String obracaniePrzeciw() {return "zleEmocje()";}
    public static String odpowiedz() {return "odpowiedz()";}
    public static String ukazWadyWStarciuSlownym() {return "ukazWadyWStarciuSlownym()";}
    public static String starcieBezZasad() {return "starcieBezZasad()";}
    public static String ucinaj() {return "ucinaj()";}
    public static String patrzCzyZnam() {return "patrzCzyZnam()";}
    public static String probaZdobyciaInformacji() {return "probaZdobyciaInformacji()";}
    public static String szykowanieStarcia() {return "szykowanieStarcia()";}
    public static String cisnie() {return "cisnie()";}
    public static String tworzKonsekwencje() {return "tworzKonsekwencje()";}

    public static String pamiecOBolach() {return "pamiecOBolach()";}
    public static String widzisz() {return "widzisz()";}
    public static String liczysz() {return "liczysz()";}
    public static String kontrolaSiebieKrokZaKrokiem() {return "kontrolaSiebieKrokZaKrokiem()";}
    public static String leciszZZaskoczenia() {return "leciszZZaskoczenia()";}
    public static String zobligowanyDoDzialania() {return "zobligowanyDoDzialania()";}
    public static String sondujWady() {return "sondujWady()";}
    public static String sondujWartoscioweRzeczy() {return "sondujWartoscioweRzeczy()";}
    public static String sondujWarunkiSprzyjajace() {return "sondujWarunkiSprzyjajace()";}
    public static String sondujWarunkiNiesprzyjajace() {return "sondujWarunkiNiesprzyjajace()";}
    public static String sondujLudziWokol() {return "sondujLudziWokol()";}
    public static String wypracujLepszaPozycje() {return "wypracujLepszaPozycje()";}
    public static String ukryjDobra() {return "ukryjDobra()";}
    public static String wdupcWNajgorszeWarunki() {return "wdupcWNajgorszeWarunki()";}
    public static String zajmijPozycjeIWarunki() {return "zajmijPozycjeIWarunki()";}
    public static String czekajNaBlad(W wiedza) {return "czekajNaBlad("+ wiedza +")";}
    public static String odlaczDostep(W blad) {return "odlaczDostep("+ blad +")";}
    public static String srodowiskoWaliBuca() {return "srodowiskoWaliBuca()";}
    public static String srodowiskoRobiCierpienie() {return "srodowiskoRobiCierpienie()";}
    public static String dzialajSzybkoZZaskoczenia() {return "dzialajSzybkoZZaskoczenia()";}
    public static String przejmij() {return "przejmij()";}
    public static String utrzymaj() {return "utrzymaj()";}
    public static String utrzymaj(List<W> warunki) {return "utrzymaj("+ warunki +")";}
    public static String bierzPrzewage() {return "bierzPrzewage()";}
    public static String kasujMuPrzewage() {return "kasujMuPrzewage()";}
    public static String dziurkaDoJakNajwiekszejLiczbyOsob() {return "dziurkaDoJakNajwiekszejLiczbyOsob()";}
    public static String wspieramPrzewage() {return "wspieramPrzewage()";}
    public static String praca(List<W> warunki) {return "praca("+ warunki +")";}
    public static String sondaKtoZyskuje() {return "sondaKtoZyskuje()";}
    public static W nalezyDo(List<W> typy) {return W.WARUNEK;}
    public static String sondaBledu(List<W> bledy) {return "sondaBledu("+ bledy +")";}
    public static String sondaKogo(List<W> typy) {return "sondaKogo("+ typy +")";}
    public static String pracaNadZasobem(W wiedza) {return "sondaKogo("+ wiedza +")";}
    public static String bierzZasobNaSwaStrone(List<String> sposoby) {return "sondaKogo("+ sposoby +")";}
    public static String jebac() {return "jebac()";}
    public static String raczkaDoGory() {return "raczkaDoGory()";}
    public static String niszczWieczor() {return "niszczWieczor()";}
    public static String hajs_t() {return "hajs_t()";}
    public static String szanuj_t() {return "szanuj_t()";}
    public static String swoi_t() {return "swoi_t()";}
    public static String walkaKlas_on() {return "walkaKlas_on()";}
    public static String rasizm_on() {return "rasizm_on()";}
    public static String poprawnoscPolityczna_on() {return "poprawnoscPolityczna_on()";}
    public static W isNiedajeRady(OsobaMetod zasob) {return W.WARUNEK;}
    public static W isNieOplacalny(OsobaMetod zasob) {return W.WARUNEK;}

    public static String zapisz(W task) {return "zapisz("+ task +")";}
    public static String przymiezenieDoDzialania() {return "przymiezenieDoDzialania()";}
    public static String check(W zegar, W data) {return "check("+ zegar +" "+ data +")";}
    public static String estymacja() {return "estymacja()";}
    public static String idea() {return "idea()";}
    public static String kartkaSteps() {return "kartkaSteps()";}
    public static String kodFunkcjonalny() {return "kodFunkcjonalny()";}
    public static String test() {return "test()";}
    public static String refactor() {return "refactor()";}
    public static W interakcja(OsobaMetod manago) {return W.WARUNEK;}
    public static String glaskaszPoGlowie(OsobaMetod manago) {return "glaskaszPoGlowie("+ manago +")";}
    public static String pracuj(List<W> warunki) {return "pracuj("+ warunki +")";}
    public static String pracuj(W warunek) {return "pracuj("+ warunek +")";}
    public static String lapKontakt(W ludzie) {return "lapKontakt("+ ludzie +")";}
    public static String usmiechajSie() {return "usmiechajSie()";}
    public static String ORIENT(List<W> warunki) {return "DEFAULT("+ warunki +")";}
    public static String robWrazenie(List<W> warunki) {return "robWrazenie("+ warunki +")";}
    public static String zalagodz(W warunek) {return "zalagodz("+ warunek +")";}
    public static String ponizanie() {return "ponizanie()";}
    public static String podwazanieArgumentow() {return "podwazanieArgumentow()";}
    public static String plotkuj() {return "plotkuj()";}
    public static String wysmiewaj() {return "wysmiewaj()";}
    public static String sondujWarunekMocniejszy() {return "sondujWarunekMocniejszy()";}
    public static String ktoMialTrudno() {return "ktoMialTrudno()";}
    public static String ktoSieUpaja() {return "ktoSieUpaja()";}
    public static String ktoFest() {return "ktoFest()";}
    public static String kogoTrzymaStrone() {return "kogoTrzymaStrone()";}
    public static String jakDuze(W warunek) {return "zalagodz("+ warunek +")";}
    public static String jakie(W warunek) {return "zalagodz("+ warunek +")";}
    public static String ile(W warunek) {return "zalagodz("+ warunek +")";}
    public static String sondaPosiadania() {return "sondaPosiadania()";}
    public static String sondaPrzewag() {return "sondaPrzewag()";}
    public static String podzielSie(W warunek) {return "podzielSie("+ warunek +")";}
    public static String konsekwencje(OsobaMetod opponent) {return "konsekwencje("+ opponent +")";}
    public static String zdominuj(List<W> warunki) {return "zdominuj("+ warunki +")";}
    public static String mocnaRestrykcja(List<W> warunki) {return "mocnaRestrykcja("+ warunki +")";}
    public static String sredniaRestrykcja(List<W> warunki) {return "sredniaRestrykcja("+ warunki +")";}
    public static String zeSrodowiska(W warunek) {return "zeSrodowiska("+ warunek +")";}
    public static String fest(W warunek) {return "podzielSie("+ warunek +")";}
    public static String drugaStrona(W warunek) {return "podzielSie("+ warunek +")";}
    public static String drugaStronaDzialajacy(W warunek) {return "podzielSie("+ warunek +")";}
    public static String kolkoWokol(W warunek) {return "podzielSie("+ warunek +")";}
    public static String dodajDoHotTopics(W warunek) {return "podzielSie("+ warunek +")";}
    public static String powiazZ(OsobaMetod osoba) {return "podzielSie("+ osoba +")";}
    public static String wezOstatnieHotTopics() {return "wezOstatnieHotTopics()";}
    public static String rozpowiedz(OsobaMetod kojarzacy, W warunek2, OsobaMetod osoba) {return "rozpowiedz("+ kojarzacy +" "+ warunek2 +" "+ osoba +")";}
    public static List<OsobaMetod> wezOsobyKojarzace(OsobaMetod osoba) {return new ArrayList<>();}
    public static String sonda(W warunek) {return "sonda("+ warunek +")";}
    public static String sonda(List<W> warunki) {return "sonda("+ warunki +")";}
    public static String sonda(List<W> warunki, List<W> warunki2) {return "sonda("+ warunki+" "+ warunki2+")";}
    public static String widzisz(W warunek) {return "widzisz("+ warunek +")";}
    public static String odrazuNozki() {return "odrazuNozki()";}
    public static String odrazuMowa() {return "odrazuMowa()";}
    public static String idzieszWczesniejWJejStrone() {return "idzieszWczesniejWJejStrone()";}
    public static String zrownanie() {return "zrownanie()";}
    public static String bucikiDeep() {return "bucikiDeep()";}
    public static String bucikiCel() {return "bucikiCel()";}
    public static String wyklucz(List<W> warunki) {return "wyklucz("+ warunki +")";}
    public static String utrudniaj(List<W> warunki) {return "utrudniaj("+ warunki +")";}
    public static String pobierzNieswiadomosc() {return "pobierzNieswiadomosc()";}
    public static String stworzKolkoAdoracji() {return "stworzKolkoAdoracji()";}
    public static String pobierzLukiOsobowosci() {return "pobierzLukiOsobowosci()";}
    public static String pobierzPatologie() {return "pobierzPatologie()";}
    public static String wezPrzewage() {return "wezPrzewage()";}
    public static String przemoc(W warunek) {return "przemoc("+ warunek +")";}
    public static String pobierzHierarchie() {return "pobierzHierarchie()";}
    public static String dzialajDlaZla() {return "dzialajDlaZla()";}
    public static String tworzPatologie() {return "tworzPatologie()";}
    public static String wal(W warunek) {return "wal("+ warunek +")";}
    public static String wal(OsobaMetod osoba, W warunek) {return "wal("+ osoba +" "+ warunek +")";}
    public static String rozpowiedz(W warunek) {return "rozpowiedz("+ warunek +")";}
    public static String zaczep(OsobaMetod osoba) {return "zaczep("+ osoba +")";}
    public static String wrocZPrzewaga() {return "wrocZPrzewaga()";}
    public static String DEEP(List<TypT> tematy) {return "DEEP("+ tematy +")";}
    public static String WNIOSKI(List<TypT> tematy) {return "WNIOSKI("+ tematy +")";}
    public static String WNIOSKI() {return "WNIOSKI()";}
    public static String KONTRA() {return "KONTRA()";}
    public static String ZMIANA(List<TypT> tematy) {return "ZMIANA("+ tematy +")";}
    public static String robCosExtra() {return "robCosExtra()";}
    public static String robRany(W warunek) {return "robRany("+ warunek +")";}
    public static String ochronaPrzed(W warunek) {return "robRany("+ warunek +")";}
    public static String opcje(List<W> warunki) {return "opcje("+ warunki +")";}
    public static String stale() {return "stale()";}
    public static String ujscie() {return "ujscie()";}
    public static String zKims() {return "zKims()";}
    public static String szukajUjscia() {return "szukajUjscia()";}
    public static String szukajHotspot() {return "szukajHotspot()";}
    public static String odbicieNaNozkach() {return "odbicieNaNozkach()";}
    public static M trudno(W warunek) {return new M();}
    public static M latwo(W warunek) {return new M();}
    public M warunek(W warunek) {return new M();}
    public M otherwise(W warunek) {return new M();}
    public M konsekwencje(W warunek) {return new M();}
    public M zamkniecie(W warunek) {return new M();}
    public M sytuacja() {return new M();}
    public M Is() {return new M();}
    public M podbitka() {return new M();}
    public M lub() {return new M();}
    public M przeminelo() {return new M();}
    public static String celownik(OsobaMetod osoba) {return "celownik("+ osoba +")";}
    public static String sondaPrzewagPodZrobienieZla() {return "sondaPrzewagPodZrobienieZla()";}
    public static String zniszczJakNajwiecej(List<WarunkiKategoria> rany) {return "zniszczJakNajwiecej("+ rany +")";}
    public static String brakReakcji(W warunek) {return "brakReakcji("+ warunek +")";}
    public static String reakcjaMocniej(List<WarunkiKategoria> rany) {return "zniszczJakNajwiecej("+ rany +")";}
    public static String pierwszaReakcja(List<W> warunki) {return "pierwszaReakcja("+ warunki +")";}
    public static String zabierzJakNajwiecej() {return "zabierzJakNajwiecej()";}
    public static String zczytajStrefy() {return "zczytajStrefy()";}
    public static String wyborStrefy() {return "wyborStrefy()";}
    public static String mowa() {return "mowa()";}
    public static String nieznajomy(W warunek) {return "nieznajomy("+ warunek +")";}
    public static String znajomy(W warunek) {return "znajomy("+ warunek +")";}
    public static String otherwise(W warunek, Integer i) {return "otherwise("+ warunek +")";}
    public static String reakcjaMocniejNizszemuWHierarchii(List<WarunkiKategoria> rany) {return "zniszczJakNajwiecej("+ rany +")";}
    public static String przewidzenieDrogi() {return "przewidzenieDrogi()";}
    public static String odmowa() {return "odmowa()";}
    public static String oglup(List<W> warunki) {return "oglup("+ warunki +")";}
    public static String przestrzel(OsobaMetod osoba) {return "przestrzel("+ osoba +")";}
    public static String wezDoSrodowiska(OsobaMetod osoba) {return "wezDoSrodowiska("+ osoba +")";}
    public static String odkryjWady(OsobaMetod osoba) {return "odkryjWady("+ osoba +")";}
    public static String wdupcDoHierarchiiPodToba(OsobaMetod osoba) {return "wdupcDoHierarchiiPodToba("+ osoba +")";}
    public static W kontrola(List<W> warunki) {return W.WARUNEK;}
    public static M konsekwencje(List<W> warunki) {return new M();}
    public static String BFS_terytorium(W w) {return "BFS_terytorium("+ w +")";}

}
