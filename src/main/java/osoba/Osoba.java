package osoba;

import db.DB_Warunki;
import metoda.M;
import miejsce.Miejsce;
import typy_bazowe.*;
import warunek.W;
import z_inne.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gadzik on 18.12.19.
 */
public class Osoba {
    TypKolorSkory kolorSkory;
    TypRasa rasa;
    TypNarodowsc narodowosc;
    TypPlec plec;
// todo dodac gadka tworzy zrodelko, angazuje albo tylko na wywolanie, czy podtrzymuje czy nie
    // TODO DODAC ZOBOWIAZANIE OCZEKIWANIE (AFTERTOP)
    Wychowanie wychowanie;
    W priorytet;
    List<TypOsoby> typyOsoby;
    List<W> oceniaWg;

    TypIlosc iloscPrzewag;
    List<W> przewagi;
    List<W> slabosci;

    TypIlosc iloscPrzezyc;
    List<Miejsce> planszeOdwiedzone;
    List<M> metody;

    TypIlosc iloscCierpienia;
    TypIlosc iloscBurzuazji;
    TypJakosc pamiec;

    TypPriorytetoweSrodowisko priorytetoweSrodowisko;
    List<TypUmiejetnosc> umiejetnosci;

    boolean arcyZlo;
    boolean dlaDiabla;

    boolean zlo;
    boolean reagujeNaZlo;
    boolean dobro;
    boolean reagujeNaDobro;

    boolean wiocha;
    boolean miasto;

    boolean wysilekFizyczny;
    boolean wysilekUmyslowy;
    boolean mocnyWzrok;
    boolean dobryGen;
    boolean swiadomosc;
    boolean swiadomoscZagrozen;
    boolean swiadomoscUlicy;
    boolean swiadomoscPrzewag;
    boolean swiadomoscRynkuPracy;
    boolean swiadomoscPatologiiZwiazkow;
    boolean madrosc;
    boolean wiedza;
    boolean sila;
    boolean spryt;
    boolean szybkosc;
    boolean cel;

    boolean zKims;
    boolean zWaznym;

    boolean czynny;
    boolean bierny;
    boolean stwarzaPointCut;
    boolean stwarzaPointCutWzokiem;
    boolean stwarzaPointCutMowa;
    boolean stwarzaPointCutKontaktem;
    boolean stwarzaPointCutRandka;

    boolean chceLepszegoZycia;
    boolean chceWygod;

    boolean wkurwionyZyciem;
    boolean nuda;
    boolean kurestwo;
    boolean tepiKurestwo;
    BrakZasad brakZasad;
    boolean zasady;
    boolean kregoslupMoralny;
    boolean sprzet;

    boolean wiecznyImigrant;
    boolean mocnaJednostka;
    boolean osiedloweSrd;
    boolean bliskosc;
    boolean dostepDobreJednostki;
    boolean dostepBiegacze;
    boolean magiczneZaklecia;
    boolean odkogoJestes;

    boolean poCichu;
    boolean zdolnyWalka;
    boolean zdolnyRyzyko;
    boolean stwarzaZagrozenie;
    boolean bezposredniosc;
    boolean odwaga;
    boolean umieKlucic;
    boolean umieCisnac;

    boolean chetnyDoBojki;
    boolean agresjaCzynna; // todo dodac te 2 byty do wyliczania charakteru

    boolean broniHierarchii;
    boolean broniGlobalu;

    boolean wyklucza;
    boolean ukrywaDobra;
    boolean skreslaNaZawsze;
    boolean staleDokrecaSrube;
    boolean zdolnyDoOdpuszczenia;
    boolean resetAble;

    boolean posluszny;
    boolean przekonywalny;
    boolean niezaleznosc;

    boolean glupi;
    boolean traktowanieZGory;
    boolean ignorowanieInformacji;

    boolean lukiOsobowosci;
    boolean egoista;
    boolean wstyd;
    boolean zazdrosc;
    boolean agresja;
    boolean klamstwo;
    boolean niestabilnoscUmyslowa;
    boolean brakOkresleniaSkali;
    boolean brakCheci;

    boolean hajsWDomu;
    boolean bogaty;
    boolean jedynak;
    boolean systemowiec;
    boolean studia;

    boolean bezpieczenstwo;
    boolean bagatelizujeZagrozenie;
    boolean nieznaCierpienia;
    boolean zuchwaly;
    boolean sztuczny;

    boolean biedny;
    boolean brakPerspektyw;
    boolean zycieZDniaNaDzien;
    boolean wyjebane;

    boolean wrazliwy;
    boolean wolnoscLekkosc;
    boolean europejski;
    boolean rasista;

    boolean czas;
    boolean brakCzasu;
    boolean dostepnosc;
    boolean praca;
    boolean pasja;

    boolean nalog;
    boolean narkotyki;
    boolean palenie;
    boolean picie;
    boolean trzezwosc;

    boolean brzydki;
    boolean ladny;
    List<TypSex> sexZ;
    boolean szlauf;
    boolean worekNaSpermeZagranicznych;
    TypWyjezdzenie wyjezdzenie;
    boolean dziewictwo;

    boolean mily;
    boolean otwartyNaZwiazek;
    boolean restrykcjaZnajomych;
    boolean dopuszczaNieznajomych;

    boolean usmiechaSie;
    boolean smiejeSie;

    boolean odwracaWzrok;
    boolean neutralWzrok;
    boolean patrzy;
    boolean reagujeNaBodzce;

    boolean samotny;
    boolean zajety;
    TypIlosc iloscPartnerow;
    boolean dzieci;
    Integer iloscDzieci;

    boolean przestrzegaPrawa;
    boolean standardZachowania;

    boolean wyrok;
    Przerwa przerwa;

    boolean konfi;

    DzienCodzienny dzienCodzienny;
    TypIlosc iloscZnajomych;
    TypIlosc iloscDobrziZnajomi;
    Srodki srodki;
    Majatek majatek;
    Miejsce miejsceZamieszkania;
    OsobyOrazWarunki wyjebaneNa;
    OsobyOrazWarunki dbaO;
    Oczekiwania oczekiwania;
    TypPunktZerowy punktZerowy;

    public void insertCharakter(){
        List<W> przewagiCharakteru = new ArrayList<>();
        List<W> slabosciCharakteru = new ArrayList<>();

        if(kolorSkory == TypKolorSkory.BIALY){
            przewagiCharakteru.add(W.TEN_SAM_KOLOR_SKORY);
        }
        else {
            slabosciCharakteru.add(W.INNY_KOLOR_SKORY);
        }

        if(rasa == TypRasa.SLOWIANIN){
            przewagiCharakteru.add(W.TA_SAMA_RASA);
        }
        else {
            slabosciCharakteru.add(W.INNA_RASA);
        }

        if(kolorSkory == TypKolorSkory.BIALY && rasa == TypRasa.SLOWIANIN){
            przewagiCharakteru.add(W.SZANSA_NA_MADROSC);
        }

        if(narodowosc == TypNarodowsc.POLSKA){
            przewagiCharakteru.add(W.TA_SAMA_NARODOWOSC);
            przewagiCharakteru.add(W.SZANSA_NA_RELIGIE);
        }
        else {
            slabosciCharakteru.add(W.INNA_NARODOWOSC);
        }

        if(plec == TypPlec.M){
            przewagiCharakteru.add(W.PLEC_MEZCZYZNA);
        }
        else {
            slabosciCharakteru.add(W.PLEC_KOBIETA);
        }
        if(wychowanie.isByloCierpienie() && wychowanie.isBylaWalka()){
            przewagiCharakteru.add(W.CIEZKIE_WYCHOWANIE);
        }
        if(wychowanie.isPodkloszem() && wychowanie.isByliRodzice()){
            slabosciCharakteru.add(W.BURZUAZYJNE_WYCHOWANIE);
        }
        if(iloscCierpienia.equals(TypIlosc.BARDZO_DUZA) || iloscCierpienia.equals(TypIlosc.DUZA) || iloscCierpienia.equals(TypIlosc.SREDNIA)){
            przewagiCharakteru.add(W.POZNANIE_CIERPIENIA);
        }
        else {
            slabosciCharakteru.add(W.NIEZAZNANIE_CIERPIENIA);
        }

        if(DB_Warunki.WARTOSC_DOBRA.getWarunki().stream().anyMatch(warunek -> warunek.equals(priorytet))){
            przewagiCharakteru.add(W.DOBRY_PRIORYTET);
        }
        else {
            slabosciCharakteru.add(W.BLEDNY_PRIORYTET);
        }
        if(oceniaWg.stream().anyMatch(W.DOBRO::equals)){
            przewagiCharakteru.add(W.OCENIAWG_DOBRO);
        }
        if(oceniaWg.stream().anyMatch(W.PODOBIENSTWO::equals)){
            przewagiCharakteru.add(W.OCENIAWG_PODOBIENSTW);
        }
        if(oceniaWg.stream().anyMatch(W.UMIEJETNOSC::equals)){
            przewagiCharakteru.add(W.OCENIAWG_UMIEJETNOSC);
        }

        if(oceniaWg.stream().anyMatch(W.ZLO::equals)){
            slabosciCharakteru.add(W.OCENIAWG_ZLO);
        }
        if(oceniaWg.stream().anyMatch(W.ZYSK::equals)){
            slabosciCharakteru.add(W.OCENIAWG_ZYSK);
        }
        if(oceniaWg.stream().anyMatch(W.EKIPA::equals)){
            slabosciCharakteru.add(W.OCENIAWG_EKIPA);
        }
        if(oceniaWg.stream().anyMatch(W.PRZEWAGA::equals)){
            slabosciCharakteru.add(W.OCENIAWG_PRZEWAG);
        }
        if(iloscPrzewag.equals(TypIlosc.DUZA) || iloscPrzewag.equals(TypIlosc.BARDZO_DUZA)){
            przewagiCharakteru.add(W.DUZO_PRZEWAG);
        }
        if(iloscPrzewag.equals(TypIlosc.BARDZO_MALA) || iloscPrzewag.equals(TypIlosc.MALA)){
            slabosciCharakteru.add(W.MALO_PRZEWAG);
        }
        if(iloscPrzezyc.equals(TypIlosc.DUZA) || iloscPrzezyc.equals(TypIlosc.BARDZO_DUZA)){
            przewagiCharakteru.add(W.DUZO_PRZEZYC);
        }
        if(iloscPrzezyc.equals(TypIlosc.BARDZO_MALA) || iloscPrzezyc.equals(TypIlosc.MALA)){
            slabosciCharakteru.add(W.MALO_PRZEZYC);
        }
        if(planszeOdwiedzone.size() > 10){
            przewagiCharakteru.add(W.DUZO_ODWIEDZONYCH_PLANSZ);
        }
        if(planszeOdwiedzone.size() < 5){
            slabosciCharakteru.add(W.MALO_ODWIEDZONYCH_PLANSZ);
        }
        if(metody.size() > 10){
            przewagiCharakteru.add(W.DUZO_METOD);
        }
        if(metody.size() < 5){
            slabosciCharakteru.add(W.MALO_METOD);
        }
        if(iloscBurzuazji.equals(TypIlosc.BARDZO_MALA) || iloscBurzuazji.equals(TypIlosc.MALA)){
            przewagiCharakteru.add(W.BRAK_BURZUAZJI);
        }
        if(iloscBurzuazji.equals(TypIlosc.DUZA) || iloscBurzuazji.equals(TypIlosc.BARDZO_DUZA)){
            slabosciCharakteru.add(W.DUZO_BURZUAZJI);
        }
        if(pamiec.equals(TypJakosc.DOBRA) || pamiec.equals(TypJakosc.BARDZO_DOBRA)){
            przewagiCharakteru.add(W.DOBRA_PAMIEC);
        }
        if(pamiec.equals(TypJakosc.BARDZO_SLABA) || pamiec.equals(TypJakosc.SLABA)){
            slabosciCharakteru.add(W.SLABA_PAMIEC);
        }
        if(priorytetoweSrodowisko.equals(TypPriorytetoweSrodowisko.DZIELNICA)){
            przewagiCharakteru.add(W.PRIORYTETOWE_SRODOWISKO_DZIELNICA);
        }
        if(priorytetoweSrodowisko.equals(TypPriorytetoweSrodowisko.RODZINA)){
            slabosciCharakteru.add(W.PRIORYTETOWE_SRODOWISKO_RODZINA);
        }
        if(umiejetnosci.size() > 10){
            przewagiCharakteru.add(W.DUZO_UMIEJETNOSCI);
        }
        if(umiejetnosci.size() < 5){
            slabosciCharakteru.add(W.MALO_UMIEJETNOSCI);
        }
        if(arcyZlo){
            slabosciCharakteru.add(W.ARCY_ZLO);
        }
        if(dlaDiabla){
            slabosciCharakteru.add(W.DZIALA_DLA_DIABLA);
        }
        if(zlo){
            slabosciCharakteru.add(W.ZLO);
        }
        if(reagujeNaZlo){
            slabosciCharakteru.add(W.REAGUJE_NA_ZLO);
        }
        if(dobro){
            przewagiCharakteru.add(W.DOBRO);
        }
        if(reagujeNaDobro){
            przewagiCharakteru.add(W.REAGUJE_NA_DOBRO);
        }
        if(miasto){
            przewagiCharakteru.add(W.Z_MIASTA);
        }
        if(wiocha){
            slabosciCharakteru.add(W.ZE_WSI);
        }
        if(wysilekFizyczny){
            przewagiCharakteru.add(W.WYSILEK_FIZYCZNY);
        }
        else {
            slabosciCharakteru.add(W.BRAK_WYSILKU_FIZYCZNEGO);
        }
        if(wysilekUmyslowy){
            przewagiCharakteru.add(W.WYSILEK_UMYSLOWY);
        }
        else {
            slabosciCharakteru.add(W.BRAK_WYSILKU_UMYSLOWEGO);
        }

        if(mocnyWzrok){
            przewagiCharakteru.add(W.MOCNY_WZROK);
        }
        else {
            slabosciCharakteru.add(W.SLABY_WZROK);
        }
        if(dobryGen){
            przewagiCharakteru.add(W.DOBRY_GEN);
        }
        if(swiadomosc){
            przewagiCharakteru.add(W.SWIADOMOSC);
        }
        else {
            slabosciCharakteru.add(W.NIESWIADOMOSC);
        }
        if(swiadomoscUlicy){
            przewagiCharakteru.add(W.SWIADOMOSC_ULICY);
        }
        else {
            slabosciCharakteru.add(W.NIESWIADOMOSC_ULICY);
        }
        if(swiadomoscZagrozen){
            przewagiCharakteru.add(W.SWIADOMOSC_ZAGROZEN);
        }
        else {
            slabosciCharakteru.add(W.NIESWIADOMOSC_ZAGROZEN);
        }
        if(swiadomoscPrzewag){
            przewagiCharakteru.add(W.SWIADOMOSC_PRZEWAG);
        }
        else {
            slabosciCharakteru.add(W.NIESWIADOMOSC_PRZEWAG);
        }
        if(swiadomoscRynkuPracy){
            przewagiCharakteru.add(W.SWIADOMOSC_RYNKU_PRACY);
        }
        else {
            slabosciCharakteru.add(W.NIESWIADOMOSC_RYNKU_PRACY);
        }
        if(swiadomoscPatologiiZwiazkow){
            przewagiCharakteru.add(W.SWIADOMOSC_PATOLOGII_ZWIAZKOW);
        }
        else {
            slabosciCharakteru.add(W.NIESWIADOMOSC_PATOLOGII_ZWIAZKOW);
        }
        if(madrosc){
            przewagiCharakteru.add(W.MADROSC);
        }
        if(wiedza){
            przewagiCharakteru.add(W.WIEDZA);
        }
        else {
            slabosciCharakteru.add(W.BRAK_WIEDZY);
        }
        if(sila){
            przewagiCharakteru.add(W.SILA);
        }
        else {
            slabosciCharakteru.add(W.SLABY);
        }
        if(cel){
            przewagiCharakteru.add(W.POSIADA_CELE);
        }
        else {
            slabosciCharakteru.add(W.BRAK_CELU);
        }
        if(zKims){
            przewagiCharakteru.add(W.Z_KIMS);
        }
        else {
            slabosciCharakteru.add(W.SAM);
        }
        if(zWaznym){
            przewagiCharakteru.add(W.Z_MOCNYM);
        }
        else {
            slabosciCharakteru.add(W.Z_NIEWAZNYM);
        }
        if(czynny){
            przewagiCharakteru.add(W.CZYNNY);
        }
        if(bierny){
            slabosciCharakteru.add(W.BIERNY);
        }
        if(stwarzaPointCut){
            przewagiCharakteru.add(W.STWARZA_POINTCUTY);
        }
        else {
            slabosciCharakteru.add(W.NIESTWARZA_POINTCUTOW);
        }
        if(chceLepszegoZycia){
            przewagiCharakteru.add(W.CHCE_LEPSZEGO_ZYCIA);
        }
        if(chceWygod){
            slabosciCharakteru.add(W.CHCE_WYGOD);
        }
        if(kurestwo){
            slabosciCharakteru.add(W.KURESTWO);
            slabosciCharakteru.add(W.PIERDOLI_GO_MIEJSCE);
            slabosciCharakteru.add(W.PIERDOLI_GO_OKOLICZNOSC);
            slabosciCharakteru.add(W.PIERDOLA_GO_OSOBY);
            slabosciCharakteru.add(W.PIERDOLI_GO_TWOJ_WYSILEK);
            slabosciCharakteru.add(W.PIERDOLI_GO_ILE_PRACOWALES);
            slabosciCharakteru.add(W.WYKORZYSTUJE_BRAK_PRZEWAG);
        }
        else {
            przewagiCharakteru.add(W.ZWAZA_NA_MIEJSCE);
            przewagiCharakteru.add(W.ZWAZA_NA_OKOLICZNOSC);
            przewagiCharakteru.add(W.ZWAZA_NA_OSOBY);
            przewagiCharakteru.add(W.ZWAZA_NA_WYSILEK);
            przewagiCharakteru.add(W.ZWAZA_ILE_KTO_PRACOWAL);
            przewagiCharakteru.add(W.OLEWA_PRZEWAGI_PRZY_OCENIE);
        }
        if(tepiKurestwo){
            przewagiCharakteru.add(W.TEPI_KURESTWO);
        }
        if(zasady){
            przewagiCharakteru.add(W.ZASADY);
        }
        else {
            slabosciCharakteru.add(W.BRAK_ZASAD);
        }
        if(kregoslupMoralny){
            przewagiCharakteru.add(W.KREGOSLUP_MORALNY);
        }
        else {
            slabosciCharakteru.add(W.BRAK_KREGOSLUPA_MORALNEGO);
        }
        if(sprzet){
            przewagiCharakteru.add(W.ZDOLNY_WALKA_SPRZET);
        }
        else {
            slabosciCharakteru.add(W.NIEZDOLNY_WALKA_SPRZET);
        }
        if(wiecznyImigrant){
            slabosciCharakteru.add(W.BRAK_THREAD_WHILE_LOOP_BLISKOSC_U);
            slabosciCharakteru.add(W.BRAK_SRODOWISKA);
            slabosciCharakteru.add(W.BRAK_SZANS_SRODOWISKO);
            slabosciCharakteru.add(W.BRAK_DOSTEPU_DOBRE_JEDNOSTKI);
            slabosciCharakteru.add(W.BRAK_DOSTEPU_DOBRE_JEDNOSTKI);
            slabosciCharakteru.add(W.BRAK_DOSTEPU_BIEGACZE);
            slabosciCharakteru.add(W.BRAK_MAGICZNYCH_ZAKLEC);
            slabosciCharakteru.add(W.BRAK_OD_KOGO_JESTES);
        }
        if(osiedloweSrd){
            przewagiCharakteru.add(W.THREAD_WHILE_LOOP_BLISKOSC_U);
            przewagiCharakteru.add(W.SRODOWISKO);
            przewagiCharakteru.add(W.SZANSA_OSIEDLOWE_SRD);
            przewagiCharakteru.add(W.SZANSA_ZNAJOMI);
            przewagiCharakteru.add(W.SZANSA_KOBIETA);
            przewagiCharakteru.add(W.BRAK_DOSTEPU_DOBRE_JEDNOSTKI);
            przewagiCharakteru.add(W.BRAK_DOSTEPU_BIEGACZE);
            przewagiCharakteru.add(W.BRAK_MAGICZNYCH_ZAKLEC);
            przewagiCharakteru.add(W.BRAK_OD_KOGO_JESTES);
        }
        if(osiedloweSrd && mocnaJednostka){
            przewagiCharakteru.add(W.THREAD_WHILE_LOOP_BLISKOSC_U);
            przewagiCharakteru.add(W.SRODOWISKO);
            przewagiCharakteru.add(W.SZANSA_OSIEDLOWE_SRD);
            przewagiCharakteru.add(W.SZANSA_ZNAJOMI);
            przewagiCharakteru.add(W.SZANSA_KOBIETA);
            przewagiCharakteru.add(W.DOSTEP_DOBRE_JEDNOSTKI);
            przewagiCharakteru.add(W.DOSTEP_BIEGACZE);
            przewagiCharakteru.add(W.MAGICZNE_ZAKLECIA);
            przewagiCharakteru.add(W.WIE_OD_KOGO_JEST);
        }
        if(poCichu){
            slabosciCharakteru.add(W.PO_CICHU);
        }
        else {
            przewagiCharakteru.add(W.KONFRONTACJA_F2F);
        }
        if(zdolnyWalka){
            przewagiCharakteru.add(W.ZDOLNY_DO_WALKI);
        }
        else {
            slabosciCharakteru.add(W.NIEZDOLNY_WALKA);
        }
        if(zdolnyRyzyko){
            przewagiCharakteru.add(W.ZDOLNY_DO_RYZYKA);
        }
        else {
            slabosciCharakteru.add(W.NIEZDOLNY_RYZYKO);
        }
        if(stwarzaZagrozenie){
            przewagiCharakteru.add(W.STWARZA_ZAGROZENIE);
        }
        else {
            slabosciCharakteru.add(W.NIESTWARZA_ZAGROZENIA);
        }
        if(bezposredniosc){
            przewagiCharakteru.add(W.BEZPOSREDNI);
            przewagiCharakteru.add(W.SMIALY);
        }
        else {
            slabosciCharakteru.add(W.WSTYD);
        }
        if(umieKlucic){
            przewagiCharakteru.add(W.UMIE_KLUCIC);
        }
        else {
            slabosciCharakteru.add(W.NIEUMIE_KLUCIC);
        }
        if(umieCisnac){
            przewagiCharakteru.add(W.UMIE_CISNAC);
        }
        else {
            slabosciCharakteru.add(W.NIEUMIE_CISNAC);
        }
        if(broniGlobalu){
            przewagiCharakteru.add(W.BRONI_GLOBALU);
        }
        if(broniHierarchii){
            slabosciCharakteru.add(W.BRONI_HIERARCHII);
        }
        if(wyklucza){
            slabosciCharakteru.add(W.WYKLUCZA);
        }
        else {
            przewagiCharakteru.add(W.UDZIELA_DOSTEPU);
        }
        if(ukrywaDobra){
            slabosciCharakteru.add(W.UKRYWA_DOBRA);
        }
        else {
            przewagiCharakteru.add(W.DZIELI_SIE_DOBRAMI);
        }
        if(skreslaNaZawsze){
            slabosciCharakteru.add(W.SKRESLA_NA_ZAWSZE);
        }
        if(staleDokrecaSrube){
            slabosciCharakteru.add(W.STALE_DOKRECA_SRUBE);
        }
        if(zdolnyDoOdpuszczenia){
            przewagiCharakteru.add(W.ZDOLNY_DO_WYBACZENIA);
        }
        if(resetAble){
            slabosciCharakteru.add(W.RESETABLE);
        }
        else {
            przewagiCharakteru.add(W.STALE_POGLADY);
        }
        if(posluszny){
            slabosciCharakteru.add(W.POSLUSZNY);
        }
        if(przekonywalny){
            slabosciCharakteru.add(W.PRZEKONYWALNY);
        }
        if(niezaleznosc){
            przewagiCharakteru.add(W.NIEZALEZNY);
        }
        else {
            slabosciCharakteru.add(W.ZALEZNY);
        }
        if(glupi){
            slabosciCharakteru.add(W.GLUPI);
        }
        if(traktowanieZGory){
            slabosciCharakteru.add(W.TRAKTOWANIE_Z_GORY);
        }
        else {
            przewagiCharakteru.add(W.OSTROZNIE_OCENIA);
        }
        if(ignorowanieInformacji){
            slabosciCharakteru.add(W.IGNOROWANIE_INFORMACJI);
        }
        else {
            przewagiCharakteru.add(W.ZWAZA_NA_KAZDA_INFORMACJE);
        }
        if(lukiOsobowosci){
            slabosciCharakteru.add(W.LUKI_OSOBOWOSCI);
        }
        if(egoista){
            slabosciCharakteru.add(W.EGOISTA);
        }

        if(zazdrosc){
            slabosciCharakteru.add(W.ZAZDROSC);
        }
        else {
            przewagiCharakteru.add(W.WSPIERA_W_OSIAGNIECIU_PRZEWAGI);
        }
        if(agresja){
            slabosciCharakteru.add(W.AGRESJA_FIZYCZNA);
            slabosciCharakteru.add(W.AGRESJA_PSYCHICZNA);
        }
        else {
            przewagiCharakteru.add(W.CIERPLIWOSC);
        }
        if(klamstwo){
            slabosciCharakteru.add(W.KLAMSTWO);
        }
        else {
            przewagiCharakteru.add(W.PRAWDA);
        }
        if(niestabilnoscUmyslowa){
            slabosciCharakteru.add(W.NIESTABILNOSC_UMYSLOWA);
        }
        if(brakOkresleniaSkali){
            slabosciCharakteru.add(W.BRAK_OKRESLENIA_SKALI);
        }
        else {
            przewagiCharakteru.add(W.DOBRA_SONDA);
        }
        if(brakCheci){
            slabosciCharakteru.add(W.BRAK_CHECI_DZIALNIA);
        }
        else {
            przewagiCharakteru.add(W.CHETNY_DZIALANIA);
        }
        if(hajsWDomu){
            slabosciCharakteru.add(W.HAJS_W_DOMU);
            slabosciCharakteru.add(W.BOGATY);
        }
        if(bogaty){
            slabosciCharakteru.add(W.BOGATY);
        }
        if(biedny){
            przewagiCharakteru.add(W.BIEDNY);
        }
        if(jedynak){
            slabosciCharakteru.add(W.JEDYNAK);
        }
        else {
            przewagiCharakteru.add(W.MA_RODZENSTWO);
        }
        if(systemowiec){
            slabosciCharakteru.add(W.SYSTEMOWIEC);
        }
        else {
            przewagiCharakteru.add(W.ANTY_SYSTEM);
        }
        if(studia){
            slabosciCharakteru.add(W.STUDIA);
            slabosciCharakteru.add(W.POSLUSZNY);
            slabosciCharakteru.add(W.SYSTEMOWIEC);
            slabosciCharakteru.add(W.BEZPIECZENSTWO);
            slabosciCharakteru.add(W.WOLNOSC_LEKKOSC);
            slabosciCharakteru.add(W.EUROPEJSKI);
            slabosciCharakteru.add(W.WRAZLIWY);
            slabosciCharakteru.add(W.NIEZDOLNY_RYZYKO);
        }
        else {
            przewagiCharakteru.add(W.BRAK_STUDIOW);
        }
        if(bezpieczenstwo){
            slabosciCharakteru.add(W.BEZPIECZENSTWO);
        }
        else {
            przewagiCharakteru.add(W.NIEBEZPIECZENSTWO);
        }
        if(bagatelizujeZagrozenie){
            slabosciCharakteru.add(W.BAGATELIZUJE_ZAGROZENIE);
        }
        else {
            przewagiCharakteru.add(W.ZWAZA_NA_ZAGROZENIE);
        }
        if(nieznaCierpienia){
            slabosciCharakteru.add(W.NIEZNA_CIERPIENIA);
        }
        else {
            przewagiCharakteru.add(W.ZNA_CIERPIENIE);
        }
        if(zuchwaly){
            slabosciCharakteru.add(W.ZUCHWALY);
        }
        else {
            przewagiCharakteru.add(W.OSTROZNY);
        }
        if(sztuczny){
            slabosciCharakteru.add(W.SZTUCZNY);
        }
        else {
            przewagiCharakteru.add(W.PRAWDZIWY);
        }
        if(zycieZDniaNaDzien){
            slabosciCharakteru.add(W.ZYJE_Z_DNIA_NA_DZIEN);
        }
        else {
            przewagiCharakteru.add(W.ZYJE_DLUGOTERMINOWO);
        }
        if(wyjebane){
            slabosciCharakteru.add(W.WYJEBANE);
        }
        else {
            przewagiCharakteru.add(W.TRAKTUJE_POWAZNIE);
        }
        if(wrazliwy){
            slabosciCharakteru.add(W.WRAZLIWY);
        }
        else {
            przewagiCharakteru.add(W.TWARDY);
        }
        if(wolnoscLekkosc){
            slabosciCharakteru.add(W.WOLNOSC_LEKKOSC);
        }
        if(europejski){
            slabosciCharakteru.add(W.EUROPEJSKI);
        }
        else {
            przewagiCharakteru.add(W.NARODOWY);
        }
        if(rasista){
            przewagiCharakteru.add(W.RASISTA);
        }
        if(czas){
            przewagiCharakteru.add(W.CZAS);
        }
        else {
            slabosciCharakteru.add(W.BRAK_CZASU);
        }
        if(dostepnosc){
            przewagiCharakteru.add(W.DOSTEPNY);
        }
        else {
            slabosciCharakteru.add(W.NIEDOSTEPNY);
        }
        if(praca && pasja){
            slabosciCharakteru.add(W.BRAK_CZASU);
            slabosciCharakteru.add(W.NIEDOSTEPNY);
        }
        if(!(narkotyki || picie || palenie)){
            przewagiCharakteru.add(W.TRZEZWOSC);
        }
        if(nalog){
            slabosciCharakteru.add(W.NALOG);
        }
        if(narkotyki){
            slabosciCharakteru.add(W.NARKOTYKI);
        }
        if(picie){
            slabosciCharakteru.add(W.PICIE);
        }
        if(palenie){
            slabosciCharakteru.add(W.PALENIE);
        }
        if(brzydki){
            slabosciCharakteru.add(W.BRZYDKI);
        }
        if(ladny){
            przewagiCharakteru.add(W.LADNY);
        }
        if(sexZ.size() > 2){
            szlauf = true;
            slabosciCharakteru.add(W.WYJEZDZENIE);
            slabosciCharakteru.add(W.SZLAUF);
        }
        if(sexZ.stream().anyMatch(TypSex.BRAK::equals)){
            przewagiCharakteru.add(W.BRAK_SEXU);
            przewagiCharakteru.add(W.DZIEWICA);
        }
        if(sexZ.stream().anyMatch(TypSex.Z_PARTNEREM::equals)){
            przewagiCharakteru.add(W.SEX_Z_PARTNEREM);
        }
        if(sexZ.stream().anyMatch(TypSex.ZE_ZNAJOMYMI::equals)){
            slabosciCharakteru.add(W.SEX_ZE_ZNAJOMIMI);
        }
        if(sexZ.stream().anyMatch(TypSex.Z_NIEZNAJOMYMI::equals)){
            slabosciCharakteru.add(W.SEX_Z_NIEZNAJOMYMI);
        }
        if(sexZ.stream().anyMatch(TypSex.Z_ZAGRANICZNYMI::equals)){
            slabosciCharakteru.add(W.SEX_Z_ZAGRANICZNYMI);
        }
        if(sexZ.stream().anyMatch(TypSex.MIEDZYRASOWY::equals)){
            slabosciCharakteru.add(W.SEX_MIEDZY_RASOWY);
        }

        if(sexZ.stream().anyMatch(TypSex.Z_ZAGRANICZNYMI::equals) || sexZ.stream().anyMatch(TypSex.MIEDZYRASOWY::equals)){
            worekNaSpermeZagranicznych = true;
            slabosciCharakteru.add(W.WOREK_NA_SPERME_ZAGRANICZNYCH);
        }
        if(mily){
            przewagiCharakteru.add(W.MILY);
        }
        else {
            slabosciCharakteru.add(W.NIEMILY);
        }
        if(otwartyNaZwiazek){
            przewagiCharakteru.add(W.OTWARTY_NA_ZWIAZEK);
        }
        else {
            slabosciCharakteru.add(W.ZAMKNIETY_NA_ZWIAZEK);
        }
        if(restrykcjaZnajomych){
            slabosciCharakteru.add(W.RESTRYKCJA_ZNAJOMYCH);
        }
        else {
            przewagiCharakteru.add(W.DOPUSZCZA_NIEZNAJOMYCH);
        }
        if(odwracaWzrok){
            slabosciCharakteru.add(W.ODWRACA_WZROK);
            slabosciCharakteru.add(W.NIE_PATRZY);
        }
        else {
            przewagiCharakteru.add(W.PATRZY);
        }
        if(reagujeNaBodzce){
            przewagiCharakteru.add(W.REAGUJE_NA_BODZCE);
            przewagiCharakteru.add(W.USMIECHA_SIE);
            przewagiCharakteru.add(W.SMIEJE_SIE);
        }
        else {
            slabosciCharakteru.add(W.NIEREAGUJE_NA_BODZCE);
        }
        if(zajety){
            slabosciCharakteru.add(W.ZAJETY);
        }
        else {
            przewagiCharakteru.add(W.WOLNA);
        }
        if(przestrzegaPrawa){
            slabosciCharakteru.add(W.PRZESTRZEGA_PRAWA);
        }
        if(wyrok){
            slabosciCharakteru.add(W.WYROK);
        }
        else {
            przewagiCharakteru.add(W.NIEKARALNOSC);
        }
        if(konfi){
            slabosciCharakteru.add(W.KONFI);
            slabosciCharakteru.add(W.PRZEJEBANE);
            slabosciCharakteru.add(W.HANBA);
            slabosciCharakteru.add(W.BRAK_THREAD_WHILE_LOOP_BLISKOSC_U);
            slabosciCharakteru.add(W.BRAK_SRODOWISKA);
            slabosciCharakteru.add(W.BRAK_SZANS_SRODOWISKO);
            slabosciCharakteru.add(W.BRAK_DOSTEPU_DOBRE_JEDNOSTKI);
            slabosciCharakteru.add(W.BRAK_DOSTEPU_DOBRE_JEDNOSTKI);
            slabosciCharakteru.add(W.BRAK_DOSTEPU_BIEGACZE);
            slabosciCharakteru.add(W.BRAK_MAGICZNYCH_ZAKLEC);
            slabosciCharakteru.add(W.BRAK_OD_KOGO_JESTES);
        }
        if(standardZachowania){
            przewagiCharakteru.add(W.MA_STANDARD_ZACHOWANIA);
        }
        if(TypPunktZerowy.BARDZO_WYSOKO.equals(punktZerowy) || TypPunktZerowy.WYSOKO.equals(punktZerowy)){
            slabosciCharakteru.add(W.RESTRYKCJA_ZNAJOMYCH);
        }

        przewagi = przewagiCharakteru;
        slabosci = slabosciCharakteru;
    }
}
