package z_inne;

import metoda.M;
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

    public String siejZlo() {return "siejZlo()";}
    public String uzaleznijSieOdSrd() {return "uzaleznijSieOdSrd()";}
    public String zdobadzInformacjeZeSrodowiskaNaKurestwie() {return "zdobadzInformacjeZeSrodowiskaNaKurestwie()";}
    public String dzialanieWsrodDzialaczy() {return "dzialanieWsrodDzialaczy()";}
    public String ukryjDostep() {return "ukryjDostep()";}
    public String wbijNaMuke() {return "wbijNaMuke()";}
    public String skazNaIzolacje() {return "skazNaIzolacje()";}
    public String patrzJakCierpi() {return "patrzJakCierpi()";}
    public String cieszSieJegoCierpieniem() {return "cieszSieJegoCierpieniem()";}
    public String baluj() {return "baluj()";}
    public String WHILE(W warunek) {return "WHILE("+ warunek +")";}
    public String WHILE_END() {return "WHILE_END()";}
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
    public String thread_while_loop(W warunek) {return "thread_while_loop("+ warunek +")";}
    public String robKomusKrzywde() {return "robKomusKrzywde()";}
    public String dajZarobicDillowi() {return "dajZarobicDillowi()";}


}
