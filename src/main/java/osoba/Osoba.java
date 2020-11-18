package osoba;

import db.DB_Osoby;
import db.DB_Warunki;
import metoda.M;
import miejsce.Miejsce;
import typy_bazowe.*;
import warunek.W;
import z_inne.*;

import java.util.ArrayList;
import java.util.Arrays;
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
    List<W> priorytet;
    List<TypOsoby> typyOsoby;
    List<W> oceniaWg;

    TypIlosc iloscPrzewag;
    List<W> przewagi;
    List<W> slabosci;

    TypIlosc iloscPrzezyc;
    List<TypMiejsce> planszeOdwiedzone;

    TypIlosc iloscCierpienia;
    TypIlosc iloscBurzuazji;
    TypJakosc pamiec;

    TypPriorytetoweSrodowisko priorytetoweSrodowisko;
    List<W> gadanie;

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
    boolean zobowiazanie;
    boolean oczekiwanie;
    boolean wymaganie;
    boolean zdolnyDoUltimatum;
    boolean miejsceHierarchia;

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
    boolean agresjaCzynna;

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
    boolean odporny;
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
    boolean pycha;
    boolean wyzszoscNadInnymi;

    boolean chwiejnosc;
    boolean hajsWDomu;
    boolean bogaty;
    boolean jedynak;
    boolean systemowiec;
    boolean studia;

    boolean bezpieczenstwo;
    boolean bagatelizujeZagrozenie;
    boolean nieznaCierpienia;
    boolean zuchwaly;
    boolean zadufanyWSobie;
    boolean sztuczny;

    boolean dzieciak;
    boolean pierwszaTrudnoscPoddanie;

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
    boolean potencjalnyKonfi;

    DzienCodzienny dzienCodzienny;
    TypIlosc iloscZnajomych;
    TypIlosc iloscDobrziZnajomi;
    List<W> srodki;
    Majatek majatek;
    Miejsce miejsceZamieszkania;
    OsobyOrazWarunki wyjebaneNa;
    OsobyOrazWarunki dbaO;
    Oczekiwania oczekiwania;
    TypPunktZerowy punktZerowy;

    public void wpiszPrzewagiSlabosci(){
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

        if(DB_Warunki.WARTOSC_DOBRA.getWarunki().stream().anyMatch(priorytet::contains)){
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
            przewagiCharakteru.add(W.OCZEKIWANIA);
            przewagiCharakteru.add(W.WYMAGANIA);
            przewagiCharakteru.add(W.ULTIMATUM);
            przewagiCharakteru.add(W.MIEJSCE_HIERARCHIA);
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
        if(pycha) {
            slabosciCharakteru.add(W.PYSZNY);
        }
        if(wyzszoscNadInnymi) {
            slabosciCharakteru.add(W.WYZSZOSC_NAD_INNYMI);
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
        if(dzieciak){
            slabosciCharakteru.add(W.DZIECIAK);
        }
        if(pierwszaTrudnoscPoddanie){
            slabosciCharakteru.add(W.PIERWSZA_TRUDNOSC_PODDANIE);
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
        if(chetnyDoBojki){
            slabosciCharakteru.add(W.CHETNY_BOJKA);
        }
        if(agresjaCzynna){
            slabosciCharakteru.add(W.AGRESJA_CZYNNA);
        }
        if(odporny){
            przewagiCharakteru.add(W.ODPORNY);
        }
        if(spryt){
            przewagiCharakteru.add(W.SPRYT);
        }
        if(szybkosc){
            przewagiCharakteru.add(W.SZYBKOSC);
        }
        if(dopuszczaNieznajomych){
            przewagiCharakteru.add(W.DOPUSZCZA_NIEZNAJOMYCH);
        }
        if(zadufanyWSobie){
            slabosciCharakteru.add(W.ZADUFANY_W_SOBIE);
        }
        if(gadanie.stream().anyMatch(W.TWORZY_NADRZEDNY_FLOW::equals)){
            przewagiCharakteru.add(W.TWORZY_NADRZEDNY_FLOW);
        }
        if(gadanie.stream().anyMatch(W.TWORZY_ZRODELKO::equals)){
            przewagiCharakteru.add(W.TWORZY_ZRODELKO);
        }
        if(gadanie.stream().anyMatch(W.AKTYWNY_NA_ANGAZ::equals)){
            przewagiCharakteru.add(W.AKTYWNY_NA_ANGAZ);
        }
        typyOsoby.forEach(typ->{
            if(DB_Warunki.TYPY_LUDZI_DOBRE.getWarunki().stream().anyMatch(x->x.equals(typ))){
                przewagiCharakteru.add(W.valueOf(typ.name()));
            }
            if(DB_Warunki.TYPY_LUDZI_ZLE.getWarunki().stream().anyMatch(x->x.equals(typ))){
                slabosciCharakteru.add(W.valueOf(typ.name()));
            }
        });

        if(przewagiCharakteru.size() > 30){
            iloscPrzewag = TypIlosc.DUZA;
        }
        else if(przewagiCharakteru.size() > 15){
            iloscPrzewag = TypIlosc.SREDNIA;
        }
        else {
            iloscPrzewag = TypIlosc.MALA;
        }

        if(iloscPrzewag.equals(TypIlosc.DUZA) || iloscPrzewag.equals(TypIlosc.BARDZO_DUZA)){
            przewagiCharakteru.add(W.DUZO_PRZEWAG);
        }
        if(iloscPrzewag.equals(TypIlosc.BARDZO_MALA) || iloscPrzewag.equals(TypIlosc.MALA)){
            slabosciCharakteru.add(W.MALO_PRZEWAG);
        }

        przewagi = przewagiCharakteru;
        slabosci = slabosciCharakteru;
    }
    public String wywietlPrzewagiSlabosci() {
        return "Osoba{" +
                "PRZEWAGI:" + przewagi +
                ", SLABOSCI:" + slabosci +
                '}';
    }

    public static String porownajOsoby(Osoba a, Osoba b){
        StringBuilder sb = new StringBuilder();
        if(!a.rasa.equals(b.rasa)){
            sb.append("RASA: " + a.rasa + " |#| " + b.rasa);
        }
        if(!a.narodowosc.equals(b.narodowosc)){
            sb.append("NARODOWOSC: " + a.narodowosc + " |#| " + b.narodowosc);
        }
        if(!a.plec.equals(b.plec)){
            sb.append("PLEC: " + a.plec + " |#| " + b.plec);
        }
        if(!a.wychowanie.equals(b.wychowanie)){
            if(!a.wychowanie.dziecinstwo.equals(b.wychowanie.dziecinstwo)){
                sb.append("WYCHOWANIE.DZIECINSTWO: " + a.wychowanie.dziecinstwo + " |#| " + b.wychowanie.dziecinstwo);
            }
            if(!a.wychowanie.odwiedzoneMiejsca.equals(b.wychowanie.odwiedzoneMiejsca)){
                sb.append("WYCHOWANIE.ODWIEDZONE_MIEJSCA DIFF: " + a.wychowanie.odwiedzoneMiejsca.removeAll(b.wychowanie.odwiedzoneMiejsca));
                sb.append("WYCHOWANIE.ODWIEDZONE_MIEJSCA: " + a.wychowanie.odwiedzoneMiejsca + " |#| " + b.wychowanie.odwiedzoneMiejsca);
            }
            if(!a.wychowanie.patologiaWDomu == b.wychowanie.patologiaWDomu){
                sb.append("WYCHOWANIE.PATOLOGIA_W_DOMU: " + a.wychowanie.patologiaWDomu + " |#| " + b.wychowanie.patologiaWDomu);
            }
            if(!a.wychowanie.gorzejNizWszyscy == b.wychowanie.gorzejNizWszyscy){
                sb.append("WYCHOWANIE.GORZEJ_NIZ_WSZYSCY: " + a.wychowanie.gorzejNizWszyscy + " |#| " + b.wychowanie.gorzejNizWszyscy);
            }
            if(!a.wychowanie.zGoryPrzegrany == b.wychowanie.zGoryPrzegrany){
                sb.append("WYCHOWANIE.Z_GORY_PRZEGRANY: " + a.wychowanie.zGoryPrzegrany + " |#| " + b.wychowanie.zGoryPrzegrany);
            }
            if(!a.wychowanie.bylaNauka == b.wychowanie.bylaNauka){
                sb.append("WYCHOWANIE.BYLA_NAUKA: " + a.wychowanie.bylaNauka + " |#| " + b.wychowanie.bylaNauka);
            }
            if(!a.wychowanie.byliRodzice == b.wychowanie.byliRodzice){
                sb.append("WYCHOWANIE.BYLI_RODZICE: " + a.wychowanie.byliRodzice + " |#| " + b.wychowanie.byliRodzice);
            }
            if(!a.wychowanie.bylaWalka == b.wychowanie.bylaWalka){
                sb.append("WYCHOWANIE.BYLA_WALKA: " + a.wychowanie.bylaWalka + " |#| " + b.wychowanie.bylaWalka);
            }
            if(!a.wychowanie.byloCierpienie == b.wychowanie.byloCierpienie){
                sb.append("WYCHOWANIE.BYLO_CIERPIENIE: " + a.wychowanie.byloCierpienie + " |#| " + b.wychowanie.byloCierpienie);
            }
            if(!a.wychowanie.podkloszem == b.wychowanie.podkloszem){
                sb.append("WYCHOWANIE.PODKLOSZEM: " + a.wychowanie.podkloszem + " |#| " + b.wychowanie.podkloszem);
            }
            if(!a.wychowanie.czestoWychodzil == b.wychowanie.czestoWychodzil){
                sb.append("WYCHOWANIE.CZESTO_WYCHODZIL: " + a.wychowanie.czestoWychodzil + " |#| " + b.wychowanie.czestoWychodzil);
            }
            if(!a.wychowanie.dostepDoWieluPlansz == b.wychowanie.dostepDoWieluPlansz){
                sb.append("WYCHOWANIE.DOSTEP_DO_WIELU_PLANSZ: " + a.wychowanie.dostepDoWieluPlansz + " |#| " + b.wychowanie.dostepDoWieluPlansz);
            }
            if(!a.wychowanie.mowiPrawde == b.wychowanie.mowiPrawde){
                sb.append("WYCHOWANIE.MOWI_PRAWDE: " + a.wychowanie.mowiPrawde + " |#| " + b.wychowanie.mowiPrawde);
            }
            if(!a.wychowanie.mowiPrawde == b.wychowanie.slowaCzyny){
                sb.append("WYCHOWANIE.SLOWA_CZYNY: " + a.wychowanie.slowaCzyny + " |#| " + b.wychowanie.slowaCzyny);
            }
            if(!a.wychowanie.dobreSerce == b.wychowanie.dobreSerce){
                sb.append("WYCHOWANIE.DOBRE_SERCE: " + a.wychowanie.dobreSerce + " |#| " + b.wychowanie.dobreSerce);
            }
            if(!a.wychowanie.umiejetnosc == b.wychowanie.umiejetnosc){
                sb.append("WYCHOWANIE.UMIEJETNOSC: " + a.wychowanie.umiejetnosc + " |#| " + b.wychowanie.umiejetnosc);
            }
            if(!a.wychowanie.klapsy == b.wychowanie.klapsy){
                sb.append("WYCHOWANIE.KLAPSY: " + a.wychowanie.klapsy + " |#| " + b.wychowanie.klapsy);
            }
            if(!a.wychowanie.kary == b.wychowanie.kary){
                sb.append("WYCHOWANIE.KARY: " + a.wychowanie.kary + " |#| " + b.wychowanie.kary);
            }
            if(!a.wychowanie.dostawalPieniadze == b.wychowanie.dostawalPieniadze){
                sb.append("WYCHOWANIE.DOSTAWAL_PIENIADZE: " + a.wychowanie.dostawalPieniadze + " |#| " + b.wychowanie.dostawalPieniadze);
            }
            if(!a.wychowanie.narkotyki == b.wychowanie.narkotyki){
                sb.append("WYCHOWANIE.DOSTAWAL_PIENIADZE: " + a.wychowanie.narkotyki + " |#| " + b.wychowanie.narkotyki);
            }
        }
        if(!a.priorytet.equals(b.priorytet)){
            sb.append("PRIORYTET: "+ a.priorytet + " |#| " + b.priorytet);
        }
        if(!a.typyOsoby.equals(b.typyOsoby)){
            sb.append("TYPY_OSOBY DIFF: " + a.typyOsoby.removeAll(b.typyOsoby));
            sb.append("TYPY_OSOBY: " + a.typyOsoby + " |#| " + b.typyOsoby);
        }
        if(!a.oceniaWg.equals(b.oceniaWg)){
            sb.append("OCENIA_WG DIFF: " + a.oceniaWg.removeAll(b.oceniaWg));
            sb.append("OCENIA_WG: " + a.oceniaWg + " |#| " + b.oceniaWg);
        }
        if(!a.iloscPrzewag.equals(b.iloscPrzewag)){
            sb.append("ILOSC_PRZEWAG: "+ a.iloscPrzewag + " |#| " + b.iloscPrzewag);
        }
        if(!a.iloscPrzezyc.equals(b.iloscPrzezyc)){
            sb.append("ILOSC_PRZEZYC: "+ a.iloscPrzezyc + " |#| " + b.iloscPrzezyc);
        }
        if(!a.planszeOdwiedzone.equals(b.planszeOdwiedzone)){
            sb.append("PLANSZE_ODWIEDZONE DIFF: " + a.planszeOdwiedzone.removeAll(b.planszeOdwiedzone));
            sb.append("PLANSZE_ODWIEDZONE: " + a.planszeOdwiedzone + " |#| " + b.planszeOdwiedzone);
        }
        if(!a.iloscCierpienia.equals(b.iloscCierpienia)){
            sb.append("ILOSC_CIERPIENIA: "+ a.iloscCierpienia + " |#| " + b.iloscCierpienia);
        }
        if(!a.iloscBurzuazji.equals(b.iloscBurzuazji)){
            sb.append("ILOSC_BURZUAZJI: "+ a.iloscBurzuazji + " |#| " + b.iloscBurzuazji);
        }
        if(!a.pamiec.equals(b.pamiec)){
            sb.append("PAMIEC: "+ a.pamiec + " |#| " + b.pamiec);
        }
        if(!a.priorytetoweSrodowisko.equals(b.priorytetoweSrodowisko)){
            sb.append("PRIORYTETOWE_SRODOWISKO: "+ a.priorytetoweSrodowisko + " |#| " + b.priorytetoweSrodowisko);
        }
        if(!a.gadanie.equals(b.gadanie)){
            sb.append("GADANIE DIFF: " + a.gadanie.removeAll(b.gadanie));
            sb.append("GADANIE: " + a.gadanie + " |#| " + b.gadanie);
        }
        if(!a.arcyZlo == b.arcyZlo){
            sb.append("ARCY_ZLO: " + a.arcyZlo + " |#| " + b.arcyZlo);
        }
        if(!a.dlaDiabla == b.dlaDiabla){
            sb.append("DLA_DIABLA: " + a.dlaDiabla + " |#| " + b.dlaDiabla);
        }
        if(!a.zlo == b.zlo){
            sb.append("ZLO: " + a.zlo + " |#| " + b.zlo);
        }
        if(!a.reagujeNaZlo == b.reagujeNaZlo){
            sb.append("REAGUJE_NA_ZLO: " + a.reagujeNaZlo + " |#| " + b.reagujeNaZlo);
        }
        if(!a.dobro == b.dobro){
            sb.append("DOBRO: " + a.dobro + " |#| " + b.dobro);
        }
        if(!a.reagujeNaDobro == b.reagujeNaDobro){
            sb.append("REAGUJE_NA_DOBRO: " + a.reagujeNaDobro + " |#| " + b.reagujeNaDobro);
        }
        if(!a.wiocha == b.wiocha){
            sb.append("WIOCHA: " + a.wiocha + " |#| " + b.wiocha);
        }
        if(!a.miasto == b.miasto){
            sb.append("MIASTO: " + a.miasto + " |#| " + b.miasto);
        }
        if(!a.wysilekFizyczny == b.wysilekFizyczny){
            sb.append("WYSILEK_FIZYCZNY: " + a.wysilekFizyczny + " |#| " + b.wysilekFizyczny);
        }
        if(!a.wysilekUmyslowy == b.wysilekUmyslowy){
            sb.append("WYSILEK_UMYSLOWY: " + a.wysilekUmyslowy + " |#| " + b.wysilekUmyslowy);
        }
        if(!a.mocnyWzrok == b.mocnyWzrok){
            sb.append("MOCNY_WZROK: " + a.mocnyWzrok + " |#| " + b.mocnyWzrok);
        }
        if(!a.dobryGen == b.dobryGen){
            sb.append("DOBRY_GEN: " + a.dobryGen + " |#| " + b.dobryGen);
        }
        if(!a.swiadomosc == b.swiadomosc){
            sb.append("SWIADOMOSC: " + a.swiadomosc + " |#| " + b.swiadomosc);
        }
        if(!a.swiadomoscZagrozen == b.swiadomoscZagrozen){
            sb.append("SWIADOMOSC_ZAGROZEN: " + a.swiadomoscZagrozen + " |#| " + b.swiadomoscZagrozen);
        }
        if(!a.swiadomoscUlicy == b.swiadomoscUlicy){
            sb.append("SWIADOMOSC_ULICY: " + a.swiadomoscUlicy + " |#| " + b.swiadomoscUlicy);
        }
        if(!a.swiadomoscPrzewag == b.swiadomoscPrzewag){
            sb.append("SWIADOMOSC_PRZEWAG: " + a.swiadomoscPrzewag + " |#| " + b.swiadomoscPrzewag);
        }
        if(!a.swiadomoscRynkuPracy == b.swiadomoscRynkuPracy){
            sb.append("SWIADOMOSC_RYNKU_PRACY: " + a.swiadomoscRynkuPracy + " |#| " + b.swiadomoscRynkuPracy);
        }
        if(!a.swiadomoscPatologiiZwiazkow == b.swiadomoscPatologiiZwiazkow){
            sb.append("SWIADOMOSC_ZWIAZKOW: " + a.swiadomoscPatologiiZwiazkow + " |#| " + b.swiadomoscPatologiiZwiazkow);
        }
        if(!a.madrosc == b.madrosc){
            sb.append("MADROSC: " + a.madrosc + " |#| " + b.madrosc);
        }
        if(!a.wiedza == b.wiedza){
            sb.append("WIEDZA: " + a.wiedza + " |#| " + b.wiedza);
        }
        if(!a.sila == b.sila){
            sb.append("SILA: " + a.sila + " |#| " + b.sila);
        }
        if(!a.spryt == b.spryt){
            sb.append("SPRYT: " + a.spryt + " |#| " + b.spryt);
        }
        if(!a.szybkosc == b.szybkosc){
            sb.append("SZYBKOSC: " + a.szybkosc + " |#| " + b.szybkosc);
        }
        if(!a.cel == b.cel){
            sb.append("CEL: " + a.cel + " |#| " + b.cel);
        }
        if(!a.zobowiazanie == b.zobowiazanie){
            sb.append("ZOBOWIAZANIE: " + a.zobowiazanie + " |#| " + b.zobowiazanie);
        }
        if(!a.oczekiwanie == b.oczekiwanie){
            sb.append("OCZEKIWANIE: " + a.oczekiwanie + " |#| " + b.oczekiwanie);
        }
        if(!a.wymaganie == b.wymaganie){
            sb.append("WYMAGANIE: " + a.wymaganie + " |#| " + b.wymaganie);
        }
        if(!a.zdolnyDoUltimatum == b.zdolnyDoUltimatum){
            sb.append("ZDOLNY_DO_ULTIMATUM: " + a.zdolnyDoUltimatum + " |#| " + b.zdolnyDoUltimatum);
        }
        if(!a.miejsceHierarchia == b.miejsceHierarchia){
            sb.append("MIEJSCE_HIERARCHIA: " + a.miejsceHierarchia + " |#| " + b.miejsceHierarchia);
        }
        if(!a.zKims == b.zKims){
            sb.append("Z_KIMS: " + a.zKims + " |#| " + b.zKims);
        }
        if(!a.zWaznym == b.zWaznym){
            sb.append("Z_WAZNYM: " + a.zWaznym + " |#| " + b.zWaznym);
        }
        if(!a.czynny == b.czynny){
            sb.append("CZYNNY: " + a.czynny + " |#| " + b.czynny);
        }
        if(!a.bierny == b.bierny){
            sb.append("BIERNY: " + a.bierny + " |#| " + b.bierny);
        }
        if(!a.stwarzaPointCut == b.stwarzaPointCut){
            sb.append("STWARZA_POINTCUT: " + a.stwarzaPointCut + " |#| " + b.stwarzaPointCut);
        }
        if(!a.stwarzaPointCutWzokiem == b.stwarzaPointCutWzokiem){
            sb.append("STWARZA_POINTCUT_WZROKIEM: " + a.stwarzaPointCutWzokiem + " |#| " + b.stwarzaPointCutWzokiem);
        }
        if(!a.stwarzaPointCutMowa == b.stwarzaPointCutMowa){
            sb.append("STWARZA_POINTCUT_MOWA: " + a.stwarzaPointCutMowa + " |#| " + b.stwarzaPointCutMowa);
        }
        if(!a.stwarzaPointCutKontaktem == b.stwarzaPointCutKontaktem){
            sb.append("STWARZA_POINTCUT_KONTAKTEM: " + a.stwarzaPointCutKontaktem + " |#| " + b.stwarzaPointCutKontaktem);
        }
        if(!a.stwarzaPointCutRandka == b.stwarzaPointCutRandka){
            sb.append("STWARZA_POINTCUT_RANDKA: " + a.stwarzaPointCutRandka + " |#| " + b.stwarzaPointCutRandka);
        }
        if(!a.chceLepszegoZycia == b.chceLepszegoZycia){
            sb.append("CHCE_LEPSZEGO_ZYCIA: " + a.chceLepszegoZycia + " |#| " + b.chceLepszegoZycia);
        }
        if(!a.chceWygod == b.chceWygod){
            sb.append("CHCE_WYGOD: " + a.chceWygod + " |#| " + b.chceWygod);
        }
        if(!a.wkurwionyZyciem == b.wkurwionyZyciem){
            sb.append("WKURWIONY_ZYCIEM: " + a.wkurwionyZyciem + " |#| " + b.wkurwionyZyciem);
        }
        if(!a.nuda == b.nuda){
            sb.append("NUDA: " + a.nuda + " |#| " + b.nuda);
        }
        if(!a.kurestwo == b.kurestwo){
            sb.append("KURESTWO: " + a.kurestwo + " |#| " + b.kurestwo);
        }
        if(!a.tepiKurestwo == b.tepiKurestwo){
            sb.append("TEPI_KURESTWO: " + a.tepiKurestwo + " |#| " + b.tepiKurestwo);
        }
        if(!a.zasady == b.zasady){
            sb.append("ZASADY: " + a.zasady + " |#| " + b.zasady);
        }
        if(!a.kregoslupMoralny == b.kregoslupMoralny){
            sb.append("KREGOSLUP_MORALNY: " + a.kregoslupMoralny + " |#| " + b.kregoslupMoralny);
        }
        if(!a.sprzet == b.sprzet){
            sb.append("SPRZET: " + a.sprzet + " |#| " + b.sprzet);
        }
        if(!a.wiecznyImigrant == b.wiecznyImigrant){
            sb.append("WIECZNY_IMIGRANT: " + a.wiecznyImigrant + " |#| " + b.wiecznyImigrant);
        }
        if(!a.mocnaJednostka == b.mocnaJednostka){
            sb.append("MOCNA_JEDNOSTKA: " + a.mocnaJednostka + " |#| " + b.mocnaJednostka);
        }
        if(!a.osiedloweSrd == b.osiedloweSrd){
            sb.append("OSIEDLOWE_SRD: " + a.osiedloweSrd + " |#| " + b.osiedloweSrd);
        }
        if(!a.bliskosc == b.bliskosc){
            sb.append("BLISKOSC: " + a.bliskosc + " |#| " + b.bliskosc);
        }
        if(!a.dostepDobreJednostki == b.dostepDobreJednostki){
            sb.append("DOSTEP_DOBRE_JEDNOSTKI: " + a.dostepDobreJednostki + " |#| " + b.dostepDobreJednostki);
        }
        if(!a.dostepBiegacze == b.dostepBiegacze){
            sb.append("DOSTEP_BIEGACZE: " + a.dostepBiegacze + " |#| " + b.dostepBiegacze);
        }
        if(!a.magiczneZaklecia == b.magiczneZaklecia){
            sb.append("MAGICZNE_ZAKLECIA: " + a.magiczneZaklecia + " |#| " + b.magiczneZaklecia);
        }
        if(!a.odkogoJestes == b.odkogoJestes){
            sb.append("OD_KOGO_JESTES: " + a.odkogoJestes + " |#| " + b.odkogoJestes);
        }
        if(!a.poCichu == b.poCichu){
            sb.append("PO_CICHU: " + a.poCichu + " |#| " + b.poCichu);
        }
        if(!a.zdolnyWalka == b.zdolnyWalka){
            sb.append("ZDOLNY_WALKA: " + a.zdolnyWalka + " |#| " + b.zdolnyWalka);
        }
        if(!a.zdolnyRyzyko == b.zdolnyRyzyko){
            sb.append("ZDOLNY_RYZYKO: " + a.zdolnyRyzyko + " |#| " + b.zdolnyRyzyko);
        }
        if(!a.stwarzaZagrozenie == b.stwarzaZagrozenie){
            sb.append("STWARZA_ZAGROZENIE: " + a.stwarzaZagrozenie + " |#| " + b.stwarzaZagrozenie);
        }
        if(!a.bezposredniosc == b.bezposredniosc){
            sb.append("BEZPOSREDNIOSC: " + a.bezposredniosc + " |#| " + b.bezposredniosc);
        }
        if(!a.odwaga == b.odwaga){
            sb.append("ODWAGA: " + a.odwaga + " |#| " + b.odwaga);
        }
        if(!a.umieKlucic == b.umieKlucic){
            sb.append("UMIE_KLUCIC: " + a.umieKlucic + " |#| " + b.umieKlucic);
        }
        if(!a.umieCisnac == b.umieCisnac){
            sb.append("UMIE_CISNAC: " + a.umieCisnac + " |#| " + b.umieCisnac);
        }
        if(!a.chetnyDoBojki == b.chetnyDoBojki){
            sb.append("CHETNY_DO_BOJKI: " + a.chetnyDoBojki + " |#| " + b.chetnyDoBojki);
        }
        if(!a.agresjaCzynna == b.agresjaCzynna){
            sb.append("AGRESJA_CZYNNA: " + a.agresjaCzynna + " |#| " + b.agresjaCzynna);
        }
        if(!a.broniHierarchii == b.broniHierarchii){
            sb.append("BRONI_HIERARCHII: " + a.broniHierarchii + " |#| " + b.broniHierarchii);
        }
        if(!a.broniGlobalu == b.broniGlobalu){
            sb.append("BRONI_GLOBALU: " + a.broniGlobalu + " |#| " + b.broniGlobalu);
        }
        if(!a.wyklucza == b.wyklucza){
            sb.append("WYKLUCZA: " + a.wyklucza + " |#| " + b.wyklucza);
        }
        if(!a.ukrywaDobra == b.ukrywaDobra){
            sb.append("UKRYWA_DOBRA: " + a.ukrywaDobra + " |#| " + b.ukrywaDobra);
        }
        if(!a.skreslaNaZawsze == b.skreslaNaZawsze){
            sb.append("SKRESLA_NA_ZAWSZE: " + a.skreslaNaZawsze + " |#| " + b.skreslaNaZawsze);
        }
        if(!a.staleDokrecaSrube == b.staleDokrecaSrube){
            sb.append("STALE_DOKRECA_SRUBE: " + a.staleDokrecaSrube + " |#| " + b.staleDokrecaSrube);
        }
        if(!a.zdolnyDoOdpuszczenia == b.zdolnyDoOdpuszczenia){
            sb.append("ZDOLNY_DO_ODPUSZCZENIA: " + a.zdolnyDoOdpuszczenia + " |#| " + b.zdolnyDoOdpuszczenia);
        }
        if(!a.resetAble == b.resetAble){
            sb.append("RESET_ABLE: " + a.resetAble + " |#| " + b.resetAble);
        }
        if(!a.posluszny == b.posluszny){
            sb.append("POSLUSZNY: " + a.posluszny + " |#| " + b.posluszny);
        }
        if(!a.przekonywalny == b.przekonywalny){
            sb.append("PRZEKONYWALNY: " + a.przekonywalny + " |#| " + b.przekonywalny);
        }
        if(!a.odporny == b.odporny){
            sb.append("ODPORNY: " + a.odporny + " |#| " + b.odporny);
        }
        if(!a.niezaleznosc == b.niezaleznosc){
            sb.append("NIEZALEZNOSC: " + a.niezaleznosc + " |#| " + b.niezaleznosc);
        }
        if(!a.glupi == b.glupi){
            sb.append("GLUPI: " + a.glupi + " |#| " + b.glupi);
        }
        if(!a.traktowanieZGory == b.traktowanieZGory){
            sb.append("TRAKTOWANIE_Z_GORY: " + a.traktowanieZGory + " |#| " + b.traktowanieZGory);
        }
        if(!a.ignorowanieInformacji == b.ignorowanieInformacji){
            sb.append("IGNOROWANIE_INFORMACJI: " + a.ignorowanieInformacji + " |#| " + b.ignorowanieInformacji);
        }
        if(!a.lukiOsobowosci == b.lukiOsobowosci){
            sb.append("LUKI_OSOBOWOSCI: " + a.lukiOsobowosci + " |#| " + b.lukiOsobowosci);
        }
        if(!a.egoista == b.egoista){
            sb.append("EGOISTA: " + a.egoista + " |#| " + b.egoista);
        }
        if(!a.wstyd == b.wstyd){
            sb.append("WSTYD: " + a.wstyd + " |#| " + b.wstyd);
        }
        if(!a.zazdrosc == b.zazdrosc){
            sb.append("ZAZDROSC: " + a.zazdrosc + " |#| " + b.zazdrosc);
        }
        if(!a.agresja == b.agresja){
            sb.append("AGRESJA: " + a.agresja + " |#| " + b.agresja);
        }
        if(!a.klamstwo == b.klamstwo){
            sb.append("KLAMSTWO: " + a.klamstwo + " |#| " + b.klamstwo);
        }
        if(!a.niestabilnoscUmyslowa == b.niestabilnoscUmyslowa){
            sb.append("NIESTABILNOSC_UMYSLOWA: " + a.niestabilnoscUmyslowa + " |#| " + b.niestabilnoscUmyslowa);
        }
        if(!a.brakOkresleniaSkali == b.brakOkresleniaSkali){
            sb.append("BRAK_OKRESLENIA_SKALI: " + a.brakOkresleniaSkali + " |#| " + b.brakOkresleniaSkali);
        }
        if(!a.brakCheci == b.brakCheci){
            sb.append("BRAK_CHECI: " + a.brakCheci + " |#| " + b.brakCheci);
        }
        if(!a.hajsWDomu == b.hajsWDomu){
            sb.append("HAJS_W_DOMU: " + a.hajsWDomu + " |#| " + b.hajsWDomu);
        }
        if(!a.bogaty == b.bogaty){
            sb.append("BOGATY: " + a.bogaty + " |#| " + b.bogaty);
        }
        if(!a.jedynak == b.jedynak){
            sb.append("JEDYNAK: " + a.jedynak + " |#| " + b.jedynak);
        }
        if(!a.systemowiec == b.systemowiec){
            sb.append("SYSTEMOWIEC: " + a.systemowiec + " |#| " + b.systemowiec);
        }
        if(!a.studia == b.studia){
            sb.append("STUDIA: " + a.studia + " |#| " + b.studia);
        }
        if(!a.bezpieczenstwo == b.bezpieczenstwo){
            sb.append("BEZPIECZENSTWO: " + a.bezpieczenstwo + " |#| " + b.bezpieczenstwo);
        }
        if(!a.bagatelizujeZagrozenie == b.bagatelizujeZagrozenie){
            sb.append("BAGATELIZUJE_ZAGROZENIE: " + a.bagatelizujeZagrozenie + " |#| " + b.bagatelizujeZagrozenie);
        }
        if(!a.nieznaCierpienia == b.nieznaCierpienia){
            sb.append("NIEZNA_CIERPIENIA: " + a.nieznaCierpienia + " |#| " + b.nieznaCierpienia);
        }
        if(!a.zuchwaly == b.zuchwaly){
            sb.append("ZUCHWALY: " + a.zuchwaly + " |#| " + b.zuchwaly);
        }
        if(!a.zadufanyWSobie == b.zadufanyWSobie){
            sb.append("ZADUFANY_W_SOBIE: " + a.zadufanyWSobie + " |#| " + b.zadufanyWSobie);
        }
        if(!a.sztuczny == b.sztuczny){
            sb.append("SZTUCZNY: " + a.sztuczny + " |#| " + b.sztuczny);
        }
        if(!a.biedny == b.biedny){
            sb.append("BIEDNY: " + a.biedny + " |#| " + b.biedny);
        }
        if(!a.brakPerspektyw == b.brakPerspektyw){
            sb.append("BRAK_PERSPEKTYW: " + a.brakPerspektyw + " |#| " + b.brakPerspektyw);
        }
        if(!a.zycieZDniaNaDzien == b.zycieZDniaNaDzien){
            sb.append("ZYCIE_Z_DNIA_NA_DZIEN: " + a.zycieZDniaNaDzien + " |#| " + b.zycieZDniaNaDzien);
        }
        if(!a.wyjebane == b.wyjebane){
            sb.append("WYJEBANE: " + a.wyjebane + " |#| " + b.wyjebane);
        }
        if(!a.wrazliwy == b.wrazliwy){
            sb.append("WRAZLIWY: " + a.wrazliwy + " |#| " + b.wrazliwy);
        }
        if(!a.wolnoscLekkosc == b.wolnoscLekkosc){
            sb.append("WOLNOSC_LEKKOSC: " + a.wolnoscLekkosc + " |#| " + b.wolnoscLekkosc);
        }
        if(!a.europejski == b.europejski){
            sb.append("EURPOEJSKI: " + a.europejski + " |#| " + b.europejski);
        }
        if(!a.rasista == b.rasista){
            sb.append("RASISTA: " + a.rasista + " |#| " + b.rasista);
        }
        if(!a.czas == b.czas){
            sb.append("CZAS: " + a.czas + " |#| " + b.czas);
        }
        if(!a.brakCzasu == b.brakCzasu){
            sb.append("BRAK_CZASU: " + a.brakCzasu + " |#| " + b.brakCzasu);
        }
        if(!a.dostepnosc == b.dostepnosc){
            sb.append("DOSTEPNOSC: " + a.dostepnosc + " |#| " + b.dostepnosc);
        }
        if(!a.praca == b.praca){
            sb.append("PRACA: " + a.praca + " |#| " + b.praca);
        }
        if(!a.pasja == b.pasja){
            sb.append("PASJA: " + a.pasja + " |#| " + b.pasja);
        }
        if(!a.nalog == b.nalog){
            sb.append("NALOG: " + a.nalog + " |#| " + b.nalog);
        }
        if(!a.narkotyki == b.narkotyki){
            sb.append("NARKOTYKI: " + a.narkotyki + " |#| " + b.narkotyki);
        }
        if(!a.palenie == b.palenie){
            sb.append("PALENIE: " + a.palenie + " |#| " + b.palenie);
        }
        if(!a.picie == b.picie){
            sb.append("PICIE: " + a.picie + " |#| " + b.picie);
        }
        if(!a.trzezwosc == b.trzezwosc){
            sb.append("TRZEZWOSC: " + a.trzezwosc + " |#| " + b.trzezwosc);
        }
        if(!a.brzydki == b.brzydki){
            sb.append("BRZYDKI: " + a.brzydki + " |#| " + b.brzydki);
        }
        if(!a.ladny == b.ladny){
            sb.append("LADNY: " + a.ladny + " |#| " + b.ladny);
        }
        if(!a.sexZ.equals(b.sexZ)){
            sb.append("SEX_Z DIFF: " + a.sexZ.removeAll(b.sexZ));
            sb.append("SEX_Z: " + a.sexZ + " |#| " + b.sexZ);
        }
        if(!a.szlauf == b.szlauf){
            sb.append("SZLAUF: " + a.szlauf + " |#| " + b.szlauf);
        }
        if(!a.worekNaSpermeZagranicznych == b.worekNaSpermeZagranicznych){
            sb.append("WOREK_NA_SPERME_ZAGRANICZNYCH: " + a.worekNaSpermeZagranicznych + " |#| " + b.worekNaSpermeZagranicznych);
        }
        if(!a.wyjezdzenie.equals(b.wyjezdzenie)){
            sb.append("WYJEZDZENIE: " + a.wyjezdzenie + " |#| " + b.wyjezdzenie);
        }
        if(!a.dziewictwo == b.dziewictwo){
            sb.append("DZIEWICTWO: " + a.dziewictwo + " |#| " + b.dziewictwo);
        }
        if(!a.mily == b.mily){
            sb.append("MILY: " + a.mily + " |#| " + b.mily);
        }
        if(!a.otwartyNaZwiazek == b.otwartyNaZwiazek){
            sb.append("OTWARTY_NA_ZWIAZEK: " + a.otwartyNaZwiazek + " |#| " + b.otwartyNaZwiazek);
        }
        if(!a.restrykcjaZnajomych == b.restrykcjaZnajomych){
            sb.append("RESTRYKCJA_ZNAJOMYCH: " + a.restrykcjaZnajomych + " |#| " + b.restrykcjaZnajomych);
        }
        if(!a.dopuszczaNieznajomych == b.dopuszczaNieznajomych){
            sb.append("DOPUSZCZA_NIEZNAJOMYCH: " + a.dopuszczaNieznajomych + " |#| " + b.dopuszczaNieznajomych);
        }
        if(!a.usmiechaSie == b.usmiechaSie){
            sb.append("USMIECHA_SIE: " + a.usmiechaSie + " |#| " + b.usmiechaSie);
        }
        if(!a.odwracaWzrok == b.odwracaWzrok){
            sb.append("ODWRACA_WZROK: " + a.odwracaWzrok + " |#| " + b.odwracaWzrok);
        }
        if(!a.neutralWzrok == b.neutralWzrok){
            sb.append("NEUTRAL_WZROK: " + a.neutralWzrok + " |#| " + b.neutralWzrok);
        }
        if(!a.patrzy == b.patrzy){
            sb.append("PATRZY: " + a.patrzy + " |#| " + b.patrzy);
        }
        if(!a.reagujeNaBodzce == b.reagujeNaBodzce){
            sb.append("REAGUJE_NA_BODZCE: " + a.reagujeNaBodzce + " |#| " + b.reagujeNaBodzce);
        }
        if(!a.samotny == b.samotny){
            sb.append("SAMOTNY: " + a.samotny + " |#| " + b.samotny);
        }
        if(!a.zajety == b.zajety){
            sb.append("ZAJETY: " + a.zajety + " |#| " + b.zajety);
        }
        if(!a.iloscPartnerow.equals(b.iloscPartnerow)){
            sb.append("ILOSC_PARTNEROW: " + a.iloscPartnerow + " |#| " + b.iloscPartnerow);
        }
        if(!a.dzieci == b.dzieci){
            sb.append("DZIECI: " + a.dzieci + " |#| " + b.dzieci);
        }
        if(!a.iloscDzieci.equals(b.iloscDzieci)){
            sb.append("ILOSC_DZIECI: " + a.iloscDzieci + " |#| " + b.iloscDzieci);
        }
        if(!a.przestrzegaPrawa == b.przestrzegaPrawa){
            sb.append("PRZESTRZEGA_PRAWA: " + a.przestrzegaPrawa + " |#| " + b.przestrzegaPrawa);
        }
        if(!a.standardZachowania == b.standardZachowania){
            sb.append("STANDARD_ZACHOWANIA: " + a.standardZachowania + " |#| " + b.standardZachowania);
        }
        if(!a.wyrok == b.wyrok){
            sb.append("WYROK: " + a.wyrok + " |#| " + b.wyrok);
        }
        if(!a.konfi == b.konfi){
            sb.append("KONFI: " + a.konfi + " |#| " + b.konfi);
        }
        if(!a.punktZerowy.equals(b.punktZerowy)){
            sb.append("PUNKT_ZEROWY: " + a.punktZerowy + " |#| " + b.punktZerowy);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "kolorSkory=" + kolorSkory +
                ", rasa=" + rasa +
                ", narodowosc=" + narodowosc +
                ", plec=" + plec +
                ", wychowanie=" + wychowanie +
                ", priorytet=" + priorytet +
                ", typyOsoby=" + typyOsoby +
                ", oceniaWg=" + oceniaWg +
                ", iloscPrzewag=" + iloscPrzewag +
                ", przewagi=" + przewagi +
                ", slabosci=" + slabosci +
                ", iloscPrzezyc=" + iloscPrzezyc +
                ", planszeOdwiedzone=" + planszeOdwiedzone +
                ", iloscCierpienia=" + iloscCierpienia +
                ", iloscBurzuazji=" + iloscBurzuazji +
                ", pamiec=" + pamiec +
                ", priorytetoweSrodowisko=" + priorytetoweSrodowisko +
                ", gadanie=" + gadanie +
                ", arcyZlo=" + arcyZlo +
                ", dlaDiabla=" + dlaDiabla +
                ", zlo=" + zlo +
                ", reagujeNaZlo=" + reagujeNaZlo +
                ", dobro=" + dobro +
                ", reagujeNaDobro=" + reagujeNaDobro +
                ", wiocha=" + wiocha +
                ", miasto=" + miasto +
                ", wysilekFizyczny=" + wysilekFizyczny +
                ", wysilekUmyslowy=" + wysilekUmyslowy +
                ", mocnyWzrok=" + mocnyWzrok +
                ", dobryGen=" + dobryGen +
                ", swiadomosc=" + swiadomosc +
                ", swiadomoscZagrozen=" + swiadomoscZagrozen +
                ", swiadomoscUlicy=" + swiadomoscUlicy +
                ", swiadomoscPrzewag=" + swiadomoscPrzewag +
                ", swiadomoscRynkuPracy=" + swiadomoscRynkuPracy +
                ", swiadomoscPatologiiZwiazkow=" + swiadomoscPatologiiZwiazkow +
                ", madrosc=" + madrosc +
                ", wiedza=" + wiedza +
                ", sila=" + sila +
                ", spryt=" + spryt +
                ", szybkosc=" + szybkosc +
                ", cel=" + cel +
                ", zobowiazanie=" + zobowiazanie +
                ", oczekiwanie=" + oczekiwanie +
                ", wymaganie=" + wymaganie +
                ", zdolnyDoUltimatum=" + zdolnyDoUltimatum +
                ", miejsceHierarchia=" + miejsceHierarchia +
                ", zKims=" + zKims +
                ", zWaznym=" + zWaznym +
                ", czynny=" + czynny +
                ", bierny=" + bierny +
                ", stwarzaPointCut=" + stwarzaPointCut +
                ", stwarzaPointCutWzokiem=" + stwarzaPointCutWzokiem +
                ", stwarzaPointCutMowa=" + stwarzaPointCutMowa +
                ", stwarzaPointCutKontaktem=" + stwarzaPointCutKontaktem +
                ", stwarzaPointCutRandka=" + stwarzaPointCutRandka +
                ", chceLepszegoZycia=" + chceLepszegoZycia +
                ", chceWygod=" + chceWygod +
                ", wkurwionyZyciem=" + wkurwionyZyciem +
                ", nuda=" + nuda +
                ", kurestwo=" + kurestwo +
                ", tepiKurestwo=" + tepiKurestwo +
                ", brakZasad=" + brakZasad +
                ", zasady=" + zasady +
                ", kregoslupMoralny=" + kregoslupMoralny +
                ", sprzet=" + sprzet +
                ", wiecznyImigrant=" + wiecznyImigrant +
                ", mocnaJednostka=" + mocnaJednostka +
                ", osiedloweSrd=" + osiedloweSrd +
                ", bliskosc=" + bliskosc +
                ", dostepDobreJednostki=" + dostepDobreJednostki +
                ", dostepBiegacze=" + dostepBiegacze +
                ", magiczneZaklecia=" + magiczneZaklecia +
                ", odkogoJestes=" + odkogoJestes +
                ", poCichu=" + poCichu +
                ", zdolnyWalka=" + zdolnyWalka +
                ", zdolnyRyzyko=" + zdolnyRyzyko +
                ", stwarzaZagrozenie=" + stwarzaZagrozenie +
                ", bezposredniosc=" + bezposredniosc +
                ", odwaga=" + odwaga +
                ", umieKlucic=" + umieKlucic +
                ", umieCisnac=" + umieCisnac +
                ", chetnyDoBojki=" + chetnyDoBojki +
                ", agresjaCzynna=" + agresjaCzynna +
                ", broniHierarchii=" + broniHierarchii +
                ", broniGlobalu=" + broniGlobalu +
                ", wyklucza=" + wyklucza +
                ", ukrywaDobra=" + ukrywaDobra +
                ", skreslaNaZawsze=" + skreslaNaZawsze +
                ", staleDokrecaSrube=" + staleDokrecaSrube +
                ", zdolnyDoOdpuszczenia=" + zdolnyDoOdpuszczenia +
                ", resetAble=" + resetAble +
                ", posluszny=" + posluszny +
                ", przekonywalny=" + przekonywalny +
                ", odporny=" + odporny +
                ", niezaleznosc=" + niezaleznosc +
                ", glupi=" + glupi +
                ", traktowanieZGory=" + traktowanieZGory +
                ", ignorowanieInformacji=" + ignorowanieInformacji +
                ", lukiOsobowosci=" + lukiOsobowosci +
                ", egoista=" + egoista +
                ", wstyd=" + wstyd +
                ", zazdrosc=" + zazdrosc +
                ", agresja=" + agresja +
                ", klamstwo=" + klamstwo +
                ", niestabilnoscUmyslowa=" + niestabilnoscUmyslowa +
                ", brakOkresleniaSkali=" + brakOkresleniaSkali +
                ", brakCheci=" + brakCheci +
                ", hajsWDomu=" + hajsWDomu +
                ", bogaty=" + bogaty +
                ", jedynak=" + jedynak +
                ", systemowiec=" + systemowiec +
                ", studia=" + studia +
                ", bezpieczenstwo=" + bezpieczenstwo +
                ", bagatelizujeZagrozenie=" + bagatelizujeZagrozenie +
                ", nieznaCierpienia=" + nieznaCierpienia +
                ", zuchwaly=" + zuchwaly +
                ", zadufanyWSobie=" + zadufanyWSobie +
                ", sztuczny=" + sztuczny +
                ", biedny=" + biedny +
                ", brakPerspektyw=" + brakPerspektyw +
                ", zycieZDniaNaDzien=" + zycieZDniaNaDzien +
                ", wyjebane=" + wyjebane +
                ", wrazliwy=" + wrazliwy +
                ", wolnoscLekkosc=" + wolnoscLekkosc +
                ", europejski=" + europejski +
                ", rasista=" + rasista +
                ", czas=" + czas +
                ", brakCzasu=" + brakCzasu +
                ", dostepnosc=" + dostepnosc +
                ", praca=" + praca +
                ", pasja=" + pasja +
                ", nalog=" + nalog +
                ", narkotyki=" + narkotyki +
                ", palenie=" + palenie +
                ", picie=" + picie +
                ", trzezwosc=" + trzezwosc +
                ", brzydki=" + brzydki +
                ", ladny=" + ladny +
                ", sexZ=" + sexZ +
                ", szlauf=" + szlauf +
                ", worekNaSpermeZagranicznych=" + worekNaSpermeZagranicznych +
                ", wyjezdzenie=" + wyjezdzenie +
                ", dziewictwo=" + dziewictwo +
                ", mily=" + mily +
                ", otwartyNaZwiazek=" + otwartyNaZwiazek +
                ", restrykcjaZnajomych=" + restrykcjaZnajomych +
                ", dopuszczaNieznajomych=" + dopuszczaNieznajomych +
                ", usmiechaSie=" + usmiechaSie +
                ", smiejeSie=" + smiejeSie +
                ", odwracaWzrok=" + odwracaWzrok +
                ", neutralWzrok=" + neutralWzrok +
                ", patrzy=" + patrzy +
                ", reagujeNaBodzce=" + reagujeNaBodzce +
                ", samotny=" + samotny +
                ", zajety=" + zajety +
                ", iloscPartnerow=" + iloscPartnerow +
                ", dzieci=" + dzieci +
                ", iloscDzieci=" + iloscDzieci +
                ", przestrzegaPrawa=" + przestrzegaPrawa +
                ", standardZachowania=" + standardZachowania +
                ", wyrok=" + wyrok +
                ", przerwa=" + przerwa +
                ", konfi=" + konfi +
                ", potencjalnyKonfi=" + potencjalnyKonfi +
                ", dzienCodzienny=" + dzienCodzienny +
                ", iloscZnajomych=" + iloscZnajomych +
                ", iloscDobrziZnajomi=" + iloscDobrziZnajomi +
                ", srodki=" + srodki +
                ", majatek=" + majatek +
                ", miejsceZamieszkania=" + miejsceZamieszkania +
                ", wyjebaneNa=" + wyjebaneNa +
                ", dbaO=" + dbaO +
                ", oczekiwania=" + oczekiwania +
                ", punktZerowy=" + punktZerowy +
                '}';
    }

    public <T> List<T> of(T... elements){
        return Arrays.asList(elements);
    }
}
