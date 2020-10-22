package z_inne;

import metoda.M;
import metoda.WWs;
import metoda.WsWs;
import typy_bazowe.TypOsoby;
import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 02.01.20.
 */
public class OsobaMetod {
    public String on(W warunek){ return "on("+ warunek +")";}
    public String max(W warunek){ return "max("+ warunek +")";}
    public String opieraSie(){ return "opieraSie()";}
    public String odpowiadaOdNiechcenia(){ return "odpowiadaOdNiechcenia()";}
    public String nieufna(){ return "nieufna()";}
    public String znikaZPlanszy(){ return "znikaZPlanszy()";}
    public String FOR_EACH() {return "forEach()";}
    public String FOR_EACH_END() {return "forEachEnd()";}
    public String pobierz(W warunek){ return "znikaZPlanszy("+ warunek +")";}
    public String stworz(W warunek){ return "znikaZPlanszy("+ warunek +")";}
    public String set(W warunek){ return "set("+ warunek +")";}
    public String set(List<W> warunki){ return "set("+ warunki +")";}

    public W siejZlo() {return W.WARUNEK;}
    public W uzaleznijSieOdSrd() {return W.WARUNEK;}
    public W zdobadzInformacjeZeSrodowiskaNaKurestwie() {return W.WARUNEK;}
    public W dzialanieWsrodDzialaczy() {return W.WARUNEK;}
    public W ukryjDostep() {return W.WARUNEK;}
    public W wbijNaMuke() {return W.WARUNEK;}
    public W skazNaIzolacje() {return W.WARUNEK;}
    public W patrzJakCierpi() {return W.WARUNEK;}
    public W cieszSieJegoCierpieniem() {return W.WARUNEK;}
    public W baluj() {return W.WARUNEK;}
    public W WHILE(W warunek) {return W.WARUNEK;}
    public W WHILE_END() {return W.WARUNEK;}
    public String zabij() {return "zabij()";}
    public String patrzy(TypOsoby osoba) {return "patrzy("+ osoba +")";}
    public String kabluje(TypOsoby osoba) {return "kabluje("+ osoba +")";}

    public String peleryna_on() {return "peleryna_on()";}
    public String tylkoHajs_on() {return "tylkoHajs_on()";}

    public String setStatus(W status) {return "setStatus("+ status +")";}
    public String dbaj(List<W> warunki) {return "dbaj("+ warunki +")";}
    public String wyjebane(List<W> warunki) {return "wyjebane("+ warunki +")";}
    public String teoriaPrzesuwania(OsobaMetod zasob) {return "teoriaPrzesuwania("+ zasob +")";}
    public String ostry(TypOsoby osoba) {return "ostry("+ osoba +")";}
    public String zwolnij(OsobaMetod zasob) {return "zwolnij("+ zasob +")";}

    public String zlecNieszczegolowo(W task) {return "zlecNieszczegolowo("+ task +")";}
    public String zjeb(W warunek ,W task) {return "zjeb("+ warunek +" "+ task +")";}
    public String potwierdzajaZInnymi(W niepokojace) {return "potwierdzajaZInnymi("+ niepokojace +")";}
    public String rozpoznanieGdzieUderzyc(W gadka) {return "rozpoznanieGdzieUderzyc("+ gadka +")";}
    public String prowokuj(List<String> sposoby) {return "prowokuj("+ sposoby +")";}
    public String stawiajWZlymSwietle(TypOsoby me, OsobaMetod wieleOsob, List<String> sposoby) {
        return "stawiajWZlymSwietle("+ me +" "+ wieleOsob +" "+ sposoby +")";
    }
    public String kabluj(TypOsoby me, OsobaMetod manago) {return "kabluj("+ me +" "+ manago +")";}
    public String wyklucz(W warunek) {return "wyklucz("+ warunek +")";}
    public OsobaMetod threadWhileLoop(W warunek) {return new OsobaMetod();}
    public String thread_while_loop(W warunek) {return "thread_while_loop("+ warunek +")";}
    public W thread_while_loop(M m) {return W.WARUNEK;}
    public String thread_while_loop(List<W> warunki) {return "thread_while_loop("+ warunki +")";}
    public String thread_while_loop(WWs ws) {return "thread_while_loop("+ ws +")";}
    public String robKomusKrzywde() {return "robKomusKrzywde()";}
    public String dajZarobicDillowi() {return "dajZarobicDillowi()";}
    public String otoczKorzysc(W warunek) {return "otoczKorzysc("+ warunek +")";}
    public String setNaTobie(W w) {return "setNaTobie("+ w +")";}
    public String nastawienie(W w) {return "nastawienie("+ w +")";}
    public String niktNiePyta() {return "niktNiePyta()";}
    public String informacjeZGory() {return "informacjeZGory()";}
    public String przerwanie(W w) {return "przerwanie("+w+")";}
    public OsobaMetod wali() {return new OsobaMetod();}
    public OsobaMetod waliWedlePreferencji() {return new OsobaMetod();}
    public OsobaMetod wali(OsobaMetod osobaMetod) {return new OsobaMetod();}
    public OsobaMetod cisnie() {return new OsobaMetod();}
    public String skazujeNaSamotnosc() {return "skazujeNaSamotnosc()";}
    public String rozpowiedzDoWszystkich(W w) {return "rozpowiedzDoWszystkich("+w+")";}
    public String wymaganaAkcja(TypOsoby osoba) {return "wymaganaAkcja("+ osoba +")";}
    public W akceptacjaBiegania() {return W.WARUNEK;}
    public W akceptacjaCpania() {return W.WARUNEK;}
    public W pisaniePrawa() {return W.WARUNEK;}
    public W naginaniePrawa() {return W.WARUNEK;}
    public W przestrzeganie(W warunek) {return W.WARUNEK;}
    public W oczekiwanie(W warunek) {return W.WARUNEK;}
    public W praca() {return W.WARUNEK;}
    public W uzaleznijOdSiebie() {return W.WARUNEK;}
    public W wychodzenieNaUlice() {return W.WARUNEK;}
    public W tworzyWarunki(List<W> warunki) {return W.WARUNEK;}
}
