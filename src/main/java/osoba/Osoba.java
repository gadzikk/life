package osoba;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import db.DB_Warunki;
import metoda.Metoda;
import miejsce.Miejsce;
import typy_bazowe.*;
import warunek.Przewaga;
import warunek.Warunek;
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

    Wychowanie wychowanie;
    Warunek priorytet;
    List<TypOsoby> typyOsoby;
    List<Warunek> oceniaWg;

    TypIlosc iloscPrzewag;
    List<Warunek> przewagi;
    List<Warunek> slabosci;

    TypIlosc iloscPrzezyc;
    List<Miejsce> planszeOdwiedzone;
    List<Metoda> metody;

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
        List<Warunek> przewagiCharakteru = new ArrayList<>();
        List<Warunek> slabosciCharakteru = new ArrayList<>();

        if(kolorSkory == TypKolorSkory.BIALY){
            przewagiCharakteru.add(Warunek.TEN_SAM_KOLOR_SKORY);
        }
        else {
            slabosciCharakteru.add(Warunek.INNY_KOLOR_SKORY);
        }

        if(rasa == TypRasa.SLOWIANIN){
            przewagiCharakteru.add(Warunek.TA_SAMA_RASA);
        }
        else {
            slabosciCharakteru.add(Warunek.INNA_RASA);
        }

        if(kolorSkory == TypKolorSkory.BIALY && rasa == TypRasa.SLOWIANIN){
            przewagiCharakteru.add(Warunek.SZANSA_NA_MADROSC);
        }

        if(narodowosc == TypNarodowsc.POLSKA){
            przewagiCharakteru.add(Warunek.TA_SAMA_NARODOWOSC);
            przewagiCharakteru.add(Warunek.SZANSA_NA_RELIGIE);
        }
        else {
            slabosciCharakteru.add(Warunek.INNA_NARODOWOSC);
        }

        if(plec == TypPlec.M){
            przewagiCharakteru.add(Warunek.PLEC_MEZCZYZNA);
        }
        else {
            slabosciCharakteru.add(Warunek.PLEC_KOBIETA);
        }
        if(wychowanie.isByloCierpienie() && wychowanie.isBylaWalka()){
            przewagiCharakteru.add(Warunek.CIEZKIE_WYCHOWANIE);
        }
        if(wychowanie.isPodkloszem() && wychowanie.isByliRodzice()){
            slabosciCharakteru.add(Warunek.BURZUAZYJNE_WYCHOWANIE);
        }
        if(iloscCierpienia.equals(TypIlosc.BARDZO_DUZA) || iloscCierpienia.equals(TypIlosc.DUZA) || iloscCierpienia.equals(TypIlosc.SREDNIA)){
            przewagiCharakteru.add(Warunek.POZNANIE_CIERPIENIA);
        }
        else {
            slabosciCharakteru.add(Warunek.NIEZAZNANIE_CIERPIENIA);
        }

        if(DB_Warunki.WARTOSC_DOBRA.getWarunki().stream().anyMatch(warunek -> warunek.equals(priorytet))){
            przewagiCharakteru.add(Warunek.DOBRY_PRIORYTET);
        }
        else {
            slabosciCharakteru.add(Warunek.BLEDNY_PRIORYTET);
        }
        if(oceniaWg.stream().anyMatch(Warunek.DOBRO::equals)){
            przewagiCharakteru.add(Warunek.OCENIAWG_DOBRO);
        }
        if(oceniaWg.stream().anyMatch(Warunek.PODOBIENSTWO::equals)){
            przewagiCharakteru.add(Warunek.OCENIAWG_PODOBIENSTW);
        }
        if(oceniaWg.stream().anyMatch(Warunek.UMIEJETNOSC::equals)){
            przewagiCharakteru.add(Warunek.OCENIAWG_UMIEJETNOSC);
        }

        if(oceniaWg.stream().anyMatch(Warunek.ZLO::equals)){
            slabosciCharakteru.add(Warunek.OCENIAWG_ZLO);
        }
        if(oceniaWg.stream().anyMatch(Warunek.ZYSK::equals)){
            slabosciCharakteru.add(Warunek.OCENIAWG_ZYSK);
        }
        if(oceniaWg.stream().anyMatch(Warunek.EKIPA::equals)){
            slabosciCharakteru.add(Warunek.OCENIAWG_EKIPA);
        }
        if(oceniaWg.stream().anyMatch(Warunek.PRZEWAGA::equals)){
            slabosciCharakteru.add(Warunek.OCENIAWG_PRZEWAG);
        }
        if(iloscPrzewag.equals(TypIlosc.DUZA) || iloscPrzewag.equals(TypIlosc.BARDZO_DUZA)){
            przewagiCharakteru.add(Warunek.DUZO_PRZEWAG);
        }
        if(iloscPrzewag.equals(TypIlosc.BARDZO_MALA) || iloscPrzewag.equals(TypIlosc.MALA)){
            slabosciCharakteru.add(Warunek.MALO_PRZEWAG);
        }
        if(iloscPrzezyc.equals(TypIlosc.DUZA) || iloscPrzezyc.equals(TypIlosc.BARDZO_DUZA)){
            przewagiCharakteru.add(Warunek.DUZO_PRZEZYC);
        }
        if(iloscPrzezyc.equals(TypIlosc.BARDZO_MALA) || iloscPrzezyc.equals(TypIlosc.MALA)){
            slabosciCharakteru.add(Warunek.MALO_PRZEZYC);
        }
        if(planszeOdwiedzone.size() > 10){
            przewagiCharakteru.add(Warunek.DUZO_ODWIEDZONYCH_PLANSZ);
        }
        if(planszeOdwiedzone.size() < 5){
            slabosciCharakteru.add(Warunek.MALO_ODWIEDZONYCH_PLANSZ);
        }
        if(metody.size() > 10){
            przewagiCharakteru.add(Warunek.DUZO_METOD);
        }
        if(metody.size() < 5){
            slabosciCharakteru.add(Warunek.MALO_METOD);
        }
        if(iloscBurzuazji.equals(TypIlosc.BARDZO_MALA) || iloscBurzuazji.equals(TypIlosc.MALA)){
            przewagiCharakteru.add(Warunek.BRAK_BURZUAZJI);
        }
        if(iloscBurzuazji.equals(TypIlosc.DUZA) || iloscBurzuazji.equals(TypIlosc.BARDZO_DUZA)){
            slabosciCharakteru.add(Warunek.DUZO_BURZUAZJI);
        }
        if(pamiec.equals(TypJakosc.DOBRA) || pamiec.equals(TypJakosc.BARDZO_DOBRA)){
            przewagiCharakteru.add(Warunek.DOBRA_PAMIEC);
        }
        if(pamiec.equals(TypJakosc.BARDZO_SLABA) || pamiec.equals(TypJakosc.SLABA)){
            slabosciCharakteru.add(Warunek.SLABA_PAMIEC);
        }
        if(priorytetoweSrodowisko.equals(TypPriorytetoweSrodowisko.DZIELNICA)){
            przewagiCharakteru.add(Warunek.PRIORYTETOWE_SRODOWISKO_DZIELNICA);
        }
        if(priorytetoweSrodowisko.equals(TypPriorytetoweSrodowisko.RODZINA)){
            slabosciCharakteru.add(Warunek.PRIORYTETOWE_SRODOWISKO_RODZINA);
        }
        if(umiejetnosci.size() > 10){
            przewagiCharakteru.add(Warunek.DUZO_UMIEJETNOSCI);
        }
        if(umiejetnosci.size() < 5){
            slabosciCharakteru.add(Warunek.MALO_UMIEJETNOSCI);
        }
        if(arcyZlo){
            slabosciCharakteru.add(Warunek.ARCY_ZLO);
        }
        if(dlaDiabla){
            slabosciCharakteru.add(Warunek.DZIALA_DLA_DIABLA);
        }
        if(zlo){
            slabosciCharakteru.add(Warunek.ZLO);
        }
        if(reagujeNaZlo){
            slabosciCharakteru.add(Warunek.REAGUJE_NA_ZLO);
        }
        if(dobro){
            przewagiCharakteru.add(Warunek.DOBRO);
        }
        if(reagujeNaDobro){
            przewagiCharakteru.add(Warunek.REAGUJE_NA_DOBRO);
        }
        if(miasto){
            przewagiCharakteru.add(Warunek.Z_MIASTA);
        }
        if(wiocha){
            slabosciCharakteru.add(Warunek.ZE_WSI);
        }
        if(wysilekFizyczny){
            przewagiCharakteru.add(Warunek.WYSILEK_FIZYCZNY);
        }
        else {
            slabosciCharakteru.add(Warunek.BRAK_WYSILKU_FIZYCZNEGO);
        }
        if(wysilekUmyslowy){
            przewagiCharakteru.add(Warunek.WYSILEK_UMYSLOWY);
        }
        else {
            slabosciCharakteru.add(Warunek.BRAK_WYSILKU_UMYSLOWEGO);
        }

        if(mocnyWzrok){
            przewagiCharakteru.add(Warunek.MOCNY_WZROK);
        }
        else {
            slabosciCharakteru.add(Warunek.SLABY_WZROK);
        }
        if(dobryGen){
            przewagiCharakteru.add(Warunek.DOBRY_GEN);
        }
        if(swiadomosc){
            przewagiCharakteru.add(Warunek.SWIADOMOSC);
        }
        else {
            slabosciCharakteru.add(Warunek.NIESWIADOMOSC);
        }
        if(swiadomoscUlicy){
            przewagiCharakteru.add(Warunek.SWIADOMOSC_ULICY);
        }
        else {
            slabosciCharakteru.add(Warunek.NIESWIADOMOSC_ULICY);
        }
        if(swiadomoscZagrozen){
            przewagiCharakteru.add(Warunek.SWIADOMOSC_ZAGROZEN);
        }
        else {
            slabosciCharakteru.add(Warunek.NIESWIADOMOSC_ZAGROZEN);
        }
        if(swiadomoscPrzewag){
            przewagiCharakteru.add(Warunek.SWIADOMOSC_PRZEWAG);
        }
        else {
            slabosciCharakteru.add(Warunek.NIESWIADOMOSC_PRZEWAG);
        }
        if(swiadomoscRynkuPracy){
            przewagiCharakteru.add(Warunek.SWIADOMOSC_RYNKU_PRACY);
        }
        else {
            slabosciCharakteru.add(Warunek.NIESWIADOMOSC_RYNKU_PRACY);
        }
        if(swiadomoscPatologiiZwiazkow){
            przewagiCharakteru.add(Warunek.SWIADOMOSC_PATOLOGII_ZWIAZKOW);
        }
        else {
            slabosciCharakteru.add(Warunek.NIESWIADOMOSC_PATOLOGII_ZWIAZKOW);
        }
        if(madrosc){
            przewagiCharakteru.add(Warunek.MADROSC);
        }
        if(wiedza){
            przewagiCharakteru.add(Warunek.WIEDZA);
        }
        else {
            slabosciCharakteru.add(Warunek.BRAK_WIEDZY);
        }
        if(sila){
            przewagiCharakteru.add(Warunek.SILA);
        }
        else {
            slabosciCharakteru.add(Warunek.SLABY);
        }
        if(cel){
            przewagiCharakteru.add(Warunek.POSIADA_CELE);
        }
        else {
            slabosciCharakteru.add(Warunek.BRAK_CELU);
        }
        if(zKims){
            przewagiCharakteru.add(Warunek.Z_KIMS);
        }
        else {
            slabosciCharakteru.add(Warunek.SAM);
        }
        if(zWaznym){
            przewagiCharakteru.add(Warunek.Z_MOCNYM);
        }
        else {
            slabosciCharakteru.add(Warunek.Z_NIEWAZNYM);
        }
        if(czynny){
            przewagiCharakteru.add(Warunek.CZYNNY);
        }
        if(bierny){
            slabosciCharakteru.add(Warunek.BIERNY);
        }
        if(stwarzaPointCut){
            przewagiCharakteru.add(Warunek.STWARZA_POINTCUTY);
        }
        else {
            slabosciCharakteru.add(Warunek.NIESTWARZA_POINTCUTOW);
        }
        if(chceLepszegoZycia){
            przewagiCharakteru.add(Warunek.CHCE_LEPSZEGO_ZYCIA);
        }
        if(chceWygod){
            slabosciCharakteru.add(Warunek.CHCE_WYGOD);
        }
        if(kurestwo){
            slabosciCharakteru.add(Warunek.KURESTWO);
            slabosciCharakteru.add(Warunek.PIERDOLI_GO_MIEJSCE);
            slabosciCharakteru.add(Warunek.PIERDOLI_GO_OKOLICZNOSC);
            slabosciCharakteru.add(Warunek.PIERDOLA_GO_OSOBY);
            slabosciCharakteru.add(Warunek.PIERDOLI_GO_TWOJ_WYSILEK);
            slabosciCharakteru.add(Warunek.PIERDOLI_GO_ILE_PRACOWALES);
            slabosciCharakteru.add(Warunek.WYKORZYSTUJE_BRAK_PRZEWAG);
        }
        else {
            przewagiCharakteru.add(Warunek.ZWAZA_NA_MIEJSCE);
            przewagiCharakteru.add(Warunek.ZWAZA_NA_OKOLICZNOSC);
            przewagiCharakteru.add(Warunek.ZWAZA_NA_OSOBY);
            przewagiCharakteru.add(Warunek.ZWAZA_NA_WYSILEK);
            przewagiCharakteru.add(Warunek.ZWAZA_ILE_KTO_PRACOWAL);
            przewagiCharakteru.add(Warunek.OLEWA_PRZEWAGI_PRZY_OCENIE);
        }
        if(tepiKurestwo){
            przewagiCharakteru.add(Warunek.TEPI_KURESTWO);
        }
        if(zasady){
            przewagiCharakteru.add(Warunek.ZASADY);
        }
        else {
            slabosciCharakteru.add(Warunek.BRAK_ZASAD);
        }
        if(kregoslupMoralny){
            przewagiCharakteru.add(Warunek.KREGOSLUP_MORALNY);
        }
        else {
            slabosciCharakteru.add(Warunek.BRAK_KREGOSLUPA_MORALNEGO);
        }
        if(sprzet){
            przewagiCharakteru.add(Warunek.ZDOLNY_WALKA_SPRZET);
        }
        else {
            slabosciCharakteru.add(Warunek.NIEZDOLNY_WALKA_SPRZET);
        }
        if(wiecznyImigrant){
            slabosciCharakteru.add(Warunek.BRAK_THREAD_WHILE_LOOP_BLISKOSC_U);
            slabosciCharakteru.add(Warunek.BRAK_SRODOWISKA);
            slabosciCharakteru.add(Warunek.BRAK_SZANS_SRODOWISKO);
            slabosciCharakteru.add(Warunek.BRAK_DOSTEPU_DOBRE_JEDNOSTKI);
            slabosciCharakteru.add(Warunek.BRAK_DOSTEPU_DOBRE_JEDNOSTKI);
            slabosciCharakteru.add(Warunek.BRAK_DOSTEPU_BIEGACZE);
            slabosciCharakteru.add(Warunek.BRAK_MAGICZNYCH_ZAKLEC);
            slabosciCharakteru.add(Warunek.BRAK_OD_KOGO_JESTES);
        }
        if(osiedloweSrd){
            przewagiCharakteru.add(Warunek.THREAD_WHILE_LOOP_BLISKOSC_U);
            przewagiCharakteru.add(Warunek.SRODOWISKO);
            przewagiCharakteru.add(Warunek.SZANSA_OSIEDLOWE_SRD);
            przewagiCharakteru.add(Warunek.SZANSA_ZNAJOMI);
            przewagiCharakteru.add(Warunek.SZANSA_KOBIETA);
            przewagiCharakteru.add(Warunek.BRAK_DOSTEPU_DOBRE_JEDNOSTKI);
            przewagiCharakteru.add(Warunek.BRAK_DOSTEPU_BIEGACZE);
            przewagiCharakteru.add(Warunek.BRAK_MAGICZNYCH_ZAKLEC);
            przewagiCharakteru.add(Warunek.BRAK_OD_KOGO_JESTES);
        }
        if(osiedloweSrd && mocnaJednostka){
            przewagiCharakteru.add(Warunek.THREAD_WHILE_LOOP_BLISKOSC_U);
            przewagiCharakteru.add(Warunek.SRODOWISKO);
            przewagiCharakteru.add(Warunek.SZANSA_OSIEDLOWE_SRD);
            przewagiCharakteru.add(Warunek.SZANSA_ZNAJOMI);
            przewagiCharakteru.add(Warunek.SZANSA_KOBIETA);
            przewagiCharakteru.add(Warunek.DOSTEP_DOBRE_JEDNOSTKI);
            przewagiCharakteru.add(Warunek.DOSTEP_BIEGACZE);
            przewagiCharakteru.add(Warunek.MAGICZNE_ZAKLECIA);
            przewagiCharakteru.add(Warunek.WIE_OD_KOGO_JEST);
        }
        if(poCichu){
            slabosciCharakteru.add(Warunek.PO_CICHU);
        }
        else {
            przewagiCharakteru.add(Warunek.KONFRONTACJA_F2F);
        }
        if(zdolnyWalka){
            przewagiCharakteru.add(Warunek.ZDOLNY_DO_WALKI);
        }
        else {
            slabosciCharakteru.add(Warunek.NIEZDOLNY_WALKA);
        }
        if(zdolnyRyzyko){
            przewagiCharakteru.add(Warunek.ZDOLNY_DO_RYZYKA);
        }
        else {
            slabosciCharakteru.add(Warunek.NIEZDOLNY_RYZYKO);
        }
        if(stwarzaZagrozenie){
            przewagiCharakteru.add(Warunek.STWARZA_ZAGROZENIE);
        }
        else {
            slabosciCharakteru.add(Warunek.NIESTWARZA_ZAGROZENIA);
        }
        if(bezposredniosc){
            przewagiCharakteru.add(Warunek.BEZPOSREDNI);
            przewagiCharakteru.add(Warunek.SMIALY);
        }
        else {
            slabosciCharakteru.add(Warunek.WSTYD);
        }
        if(umieKlucic){
            przewagiCharakteru.add(Warunek.UMIE_KLUCIC);
        }
        else {
            slabosciCharakteru.add(Warunek.NIEUMIE_KLUCIC);
        }
        if(umieCisnac){
            przewagiCharakteru.add(Warunek.UMIE_CISNAC);
        }
        else {
            slabosciCharakteru.add(Warunek.NIEUMIE_CISNAC);
        }
        if(broniGlobalu){
            przewagiCharakteru.add(Warunek.BRONI_GLOBALU);
        }
        if(broniHierarchii){
            slabosciCharakteru.add(Warunek.BRONI_HIERARCHII);
        }
        if(wyklucza){
            slabosciCharakteru.add(Warunek.WYKLUCZA);
        }
        else {
            przewagiCharakteru.add(Warunek.UDZIELA_DOSTEPU);
        }
        if(ukrywaDobra){
            slabosciCharakteru.add(Warunek.UKRYWA_DOBRA);
        }
        else {
            przewagiCharakteru.add(Warunek.DZIELI_SIE_DOBRAMI);
        }
        if(skreslaNaZawsze){
            slabosciCharakteru.add(Warunek.SKRESLA_NA_ZAWSZE);
        }
        if(staleDokrecaSrube){
            slabosciCharakteru.add(Warunek.STALE_DOKRECA_SRUBE);
        }
        if(zdolnyDoOdpuszczenia){
            przewagiCharakteru.add(Warunek.ZDOLNY_DO_WYBACZENIA);
        }
        if(resetAble){
            slabosciCharakteru.add(Warunek.RESETABLE);
        }
        else {
            przewagiCharakteru.add(Warunek.STALE_POGLADY);
        }
        if(posluszny){
            slabosciCharakteru.add(Warunek.POSLUSZNY);
        }
        if(przekonywalny){
            slabosciCharakteru.add(Warunek.PRZEKONYWALNY);
        }
        if(niezaleznosc){
            przewagiCharakteru.add(Warunek.NIEZALEZNY);
        }
        else {
            slabosciCharakteru.add(Warunek.ZALEZNY);
        }
        if(glupi){
            slabosciCharakteru.add(Warunek.GLUPI);
        }
        if(traktowanieZGory){
            slabosciCharakteru.add(Warunek.TRAKTOWANIE_Z_GORY);
        }
        else {
            przewagiCharakteru.add(Warunek.OSTROZNIE_OCENIA);
        }
        if(ignorowanieInformacji){
            slabosciCharakteru.add(Warunek.IGNOROWANIE_INFORMACJI);
        }
        else {
            przewagiCharakteru.add(Warunek.ZWAZA_NA_KAZDA_INFORMACJE);
        }
        if(lukiOsobowosci){
            slabosciCharakteru.add(Warunek.LUKI_OSOBOWOSCI);
        }
        if(egoista){
            slabosciCharakteru.add(Warunek.EGOISTA);
        }

        if(zazdrosc){
            slabosciCharakteru.add(Warunek.ZAZDROSC);
        }
        else {
            przewagiCharakteru.add(Warunek.WSPIERA_W_OSIAGNIECIU_PRZEWAGI);
        }
        if(agresja){
            slabosciCharakteru.add(Warunek.AGRESJA_FIZYCZNA);
            slabosciCharakteru.add(Warunek.AGRESJA_PSYCHICZNA);
        }
        else {
            przewagiCharakteru.add(Warunek.CIERPLIWOSC);
        }
        if(klamstwo){
            slabosciCharakteru.add(Warunek.KLAMSTWO);
        }
        else {
            przewagiCharakteru.add(Warunek.PRAWDA);
        }
        if(niestabilnoscUmyslowa){
            slabosciCharakteru.add(Warunek.NIESTABILNOSC_UMYSLOWA);
        }
        if(brakOkresleniaSkali){
            slabosciCharakteru.add(Warunek.BRAK_OKRESLENIA_SKALI);
        }
        else {
            przewagiCharakteru.add(Warunek.DOBRA_SONDA);
        }
        if(brakCheci){
            slabosciCharakteru.add(Warunek.BRAK_CHECI_DZIALNIA);
        }
        else {
            przewagiCharakteru.add(Warunek.CHETNY_DZIALANIA);
        }
        if(hajsWDomu){
            slabosciCharakteru.add(Warunek.HAJS_W_DOMU);
            slabosciCharakteru.add(Warunek.BOGATY);
        }
        if(bogaty){
            slabosciCharakteru.add(Warunek.BOGATY);
        }
        if(biedny){
            przewagiCharakteru.add(Warunek.BIEDNY);
        }
        if(jedynak){
            slabosciCharakteru.add(Warunek.JEDYNAK);
        }
        else {
            przewagiCharakteru.add(Warunek.MA_RODZENSTWO);
        }
        if(systemowiec){
            slabosciCharakteru.add(Warunek.SYSTEMOWIEC);
        }
        else {
            przewagiCharakteru.add(Warunek.ANTY_SYSTEM);
        }
        if(studia){
            slabosciCharakteru.add(Warunek.STUDIA);
            slabosciCharakteru.add(Warunek.POSLUSZNY);
            slabosciCharakteru.add(Warunek.SYSTEMOWIEC);
            slabosciCharakteru.add(Warunek.BEZPIECZENSTWO);
            slabosciCharakteru.add(Warunek.WOLNOSC_LEKKOSC);
            slabosciCharakteru.add(Warunek.EUROPEJSKI);
            slabosciCharakteru.add(Warunek.WRAZLIWY);
            slabosciCharakteru.add(Warunek.NIEZDOLNY_RYZYKO);
        }
        else {
            przewagiCharakteru.add(Warunek.BRAK_STUDIOW);
        }
        if(bezpieczenstwo){
            slabosciCharakteru.add(Warunek.BEZPIECZENSTWO);
        }
        else {
            przewagiCharakteru.add(Warunek.NIEBEZPIECZENSTWO);
        }
        if(bagatelizujeZagrozenie){
            slabosciCharakteru.add(Warunek.BAGATELIZUJE_ZAGROZENIE);
        }
        else {
            przewagiCharakteru.add(Warunek.ZWAZA_NA_ZAGROZENIE);
        }
        if(nieznaCierpienia){
            slabosciCharakteru.add(Warunek.NIEZNA_CIERPIENIA);
        }
        else {
            przewagiCharakteru.add(Warunek.ZNA_CIERPIENIE);
        }
        if(zuchwaly){
            slabosciCharakteru.add(Warunek.ZUCHWALY);
        }
        else {
            przewagiCharakteru.add(Warunek.OSTROZNY);
        }
        if(sztuczny){
            slabosciCharakteru.add(Warunek.SZTUCZNY);
        }
        else {
            przewagiCharakteru.add(Warunek.PRAWDZIWY);
        }
        if(zycieZDniaNaDzien){
            slabosciCharakteru.add(Warunek.ZYJE_Z_DNIA_NA_DZIEN);
        }
        else {
            przewagiCharakteru.add(Warunek.ZYJE_DLUGOTERMINOWO);
        }
        if(wyjebane){
            slabosciCharakteru.add(Warunek.WYJEBANE);
        }
        else {
            przewagiCharakteru.add(Warunek.TRAKTUJE_POWAZNIE);
        }
        if(wrazliwy){
            slabosciCharakteru.add(Warunek.WRAZLIWY);
        }
        else {
            przewagiCharakteru.add(Warunek.TWARDY);
        }
        if(wolnoscLekkosc){
            slabosciCharakteru.add(Warunek.WOLNOSC_LEKKOSC);
        }
        if(europejski){
            slabosciCharakteru.add(Warunek.EUROPEJSKI);
        }
        else {
            przewagiCharakteru.add(Warunek.NARODOWY);
        }
        if(rasista){
            przewagiCharakteru.add(Warunek.RASISTA);
        }
        if(czas){
            przewagiCharakteru.add(Warunek.CZAS);
        }
        else {
            slabosciCharakteru.add(Warunek.BRAK_CZASU);
        }
        if(dostepnosc){
            przewagiCharakteru.add(Warunek.DOSTEPNY);
        }
        else {
            slabosciCharakteru.add(Warunek.NIEDOSTEPNY);
        }
        if(praca && pasja){
            slabosciCharakteru.add(Warunek.BRAK_CZASU);
            slabosciCharakteru.add(Warunek.NIEDOSTEPNY);
        }
        if(!(narkotyki || picie || palenie)){
            przewagiCharakteru.add(Warunek.TRZEZWOSC);
        }
        if(nalog){
            slabosciCharakteru.add(Warunek.NALOG);
        }
        if(narkotyki){
            slabosciCharakteru.add(Warunek.NARKOTYKI);
        }
        if(picie){
            slabosciCharakteru.add(Warunek.PICIE);
        }
        if(palenie){
            slabosciCharakteru.add(Warunek.PALENIE);
        }
        if(brzydki){
            slabosciCharakteru.add(Warunek.BRZYDKI);
        }
        if(ladny){
            przewagiCharakteru.add(Warunek.LADNY);
        }
        if(sexZ.size() > 2){
            szlauf = true;
            slabosciCharakteru.add(Warunek.WYJEZDZENIE);
            slabosciCharakteru.add(Warunek.SZLAUF);
        }
        if(sexZ.stream().anyMatch(TypSex.BRAK::equals)){
            przewagiCharakteru.add(Warunek.BRAK_SEXU);
            przewagiCharakteru.add(Warunek.DZIEWICA);
        }
        if(sexZ.stream().anyMatch(TypSex.Z_PARTNEREM::equals)){
            przewagiCharakteru.add(Warunek.SEX_Z_PARTNEREM);
        }
        if(sexZ.stream().anyMatch(TypSex.ZE_ZNAJOMYMI::equals)){
            slabosciCharakteru.add(Warunek.SEX_ZE_ZNAJOMIMI);
        }
        if(sexZ.stream().anyMatch(TypSex.Z_NIEZNAJOMYMI::equals)){
            slabosciCharakteru.add(Warunek.SEX_Z_NIEZNAJOMYMI);
        }
        if(sexZ.stream().anyMatch(TypSex.Z_ZAGRANICZNYMI::equals)){
            slabosciCharakteru.add(Warunek.SEX_Z_ZAGRANICZNYMI);
        }
        if(sexZ.stream().anyMatch(TypSex.MIEDZYRASOWY::equals)){
            slabosciCharakteru.add(Warunek.SEX_MIEDZY_RASOWY);
        }

        if(sexZ.stream().anyMatch(TypSex.Z_ZAGRANICZNYMI::equals) || sexZ.stream().anyMatch(TypSex.MIEDZYRASOWY::equals)){
            worekNaSpermeZagranicznych = true;
            slabosciCharakteru.add(Warunek.WOREK_NA_SPERME_ZAGRANICZNYCH);
        }
        if(mily){
            przewagiCharakteru.add(Warunek.MILY);
        }
        else {
            slabosciCharakteru.add(Warunek.NIEMILY);
        }
        if(otwartyNaZwiazek){
            przewagiCharakteru.add(Warunek.OTWARTY_NA_ZWIAZEK);
        }
        else {
            slabosciCharakteru.add(Warunek.ZAMKNIETY_NA_ZWIAZEK);
        }
        if(restrykcjaZnajomych){
            slabosciCharakteru.add(Warunek.RESTRYKCJA_ZNAJOMYCH);
        }
        else {
            przewagiCharakteru.add(Warunek.DOPUSZCZA_NIEZNAJOMYCH);
        }
        if(odwracaWzrok){
            slabosciCharakteru.add(Warunek.ODWRACA_WZROK);
            slabosciCharakteru.add(Warunek.NIE_PATRZY);
        }
        else {
            przewagiCharakteru.add(Warunek.PATRZY);
        }
        if(reagujeNaBodzce){
            przewagiCharakteru.add(Warunek.REAGUJE_NA_BODZCE);
            przewagiCharakteru.add(Warunek.USMIECHA_SIE);
            przewagiCharakteru.add(Warunek.SMIEJE_SIE);
        }
        else {
            slabosciCharakteru.add(Warunek.NIEREAGUJE_NA_BODZCE);
        }
        if(zajety){
            slabosciCharakteru.add(Warunek.ZAJETY);
        }
        else {
            przewagiCharakteru.add(Warunek.WOLNA);
        }
        if(przestrzegaPrawa){
            slabosciCharakteru.add(Warunek.PRZESTRZEGA_PRAWA);
        }
        if(wyrok){
            slabosciCharakteru.add(Warunek.WYROK);
        }
        else {
            przewagiCharakteru.add(Warunek.NIEKARALNOSC);
        }
        if(konfi){
            slabosciCharakteru.add(Warunek.KONFI);
            slabosciCharakteru.add(Warunek.PRZEJEBANE);
            slabosciCharakteru.add(Warunek.HANBA);
            slabosciCharakteru.add(Warunek.BRAK_THREAD_WHILE_LOOP_BLISKOSC_U);
            slabosciCharakteru.add(Warunek.BRAK_SRODOWISKA);
            slabosciCharakteru.add(Warunek.BRAK_SZANS_SRODOWISKO);
            slabosciCharakteru.add(Warunek.BRAK_DOSTEPU_DOBRE_JEDNOSTKI);
            slabosciCharakteru.add(Warunek.BRAK_DOSTEPU_DOBRE_JEDNOSTKI);
            slabosciCharakteru.add(Warunek.BRAK_DOSTEPU_BIEGACZE);
            slabosciCharakteru.add(Warunek.BRAK_MAGICZNYCH_ZAKLEC);
            slabosciCharakteru.add(Warunek.BRAK_OD_KOGO_JESTES);
        }
        if(standardZachowania){
            przewagiCharakteru.add(Warunek.MA_STANDARD_ZACHOWANIA);
        }
        if(TypPunktZerowy.BARDZO_WYSOKO.equals(punktZerowy) || TypPunktZerowy.WYSOKO.equals(punktZerowy)){
            slabosciCharakteru.add(Warunek.RESTRYKCJA_ZNAJOMYCH);
        }

        przewagi = przewagiCharakteru;
        slabosci = slabosciCharakteru;
    }
}
