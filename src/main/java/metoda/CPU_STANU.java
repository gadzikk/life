package metoda;

import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 02.01.20.
 */
public class CPU_STANU extends AbstractCPU {

    List<W> warunki = of(W.STERYD, W.ZIELSKO);

    List<W> essentials = of(W.MOCNY_WZROK, W.TLEN, W.JEDZENIE, W.PICIE, W.SEN);

    List<W> przyczynyUjebaniaStanu = of(W.MUZYKA, W.NARKOTYKI, W.CHOROBA, W.KONIK, W.CHEC_REGENERACJI, W.CHEC_ZBICIA_NIEPOKOJU);

    public void run(){
        M.thread_while_loop(W.COUNTIOUS);
        // TRACISZ STAN KILKA MIESIECY PRZERWY


    }

    public void aktywnosci(){
        // odpoczynek - doprowadzic sie musisz do stanu

        // 7dni bez ruchu

        // silka - cardio, malo snu dobre tetno

        // cw w domu - dlugi gorszy sen, mniej sily w ciagu dnia

        // bieganie - mniejsnu++, rzeskosc, mniej sily w ciagu dnia, stres++, myslenie--, regeneracja_serca++

        // boks - tetno++, samopoczucie++

        // noc na rynku - pobudzenie w trakcie dnia i wrazliwosc zmyslow, ulica++

        // rewir - aktywnoscOrganizmu++, checUlicy++. silaFizyczna++

        // caly dzien komputer - matrix w oczach, migotanie, malo staminy

        // sluchanie - pustkaWGlowie, wrazliwosc++, dziwneUczucie

        // braksnu - nieChceSieSpac++, nieWrazliwosc++, stanuPsychiczne++, popedSexualny++

        // mocnyWzrok x wysilekFiyzyczny x wysilekUmyslowy x nocki => stan mordercy niezlomny

    }

    public void zmeczenie(){

    }

    List<W> dobryStan = of(
            W.WIDZISZ_KONTEKST, W.WIDZISZ_POWIAZANIA, W.WIDZISZ_WYDARZENIA_PRZESZLOSC, W.SONDA, W.PRZEWIDYWANIE,
            W.SAMOPOCZUCIE_FAZA
    );

    List<W> ujebanyStan = of(
            W.WIDZISZ_KRAJOBRAZ,
            W.ZLE_SAMOPOCZUCIE,
            W.TRACISZ_WZROK, W.WZROK_NIEOSTRY, W.KREW_SIE_CHOWA, W.NADWRAZLIWY_SLUCH, W.BRAK_SCHIZMY,
            W.BRAK_MIESNIA_NA_CZOLE, W.ZLY_BLEDNIK, W.NIEDOSTRZEGANIE_PIEKNA, W.NIEDOSTRZEGASZ_REALNOSCI,
            W.BRAK_WYOBRAZENIA, W.BRAK_PAMIECI, W.BRAK_NASTAWIENIA, W.NIEZDOLNY_RYWALIZACJA,
            W.MIAZDZY_GARDLO, W.NIEZDOLNY_SKUPIENIE, W.SERCE_SLABE, W.NIEODPOCZYWASZ, W.BRAK_EMOCJI,
            W.BRAK_KOJARZENIA, W.ZA_USZAMI_ZLE, W.BRAK_MOTOREK, W.BEZBRONNY, W.NIEZDOLNOSC_DO_WYSILKU,
            W.CPU_NA_USZACH, W.BRAK_WNIOSKOW, W.NIC_SIE_NIECHCE, W.NIEPAMIETASZ_HISTORIA, W.NIEWIESZ_NIC,
            W.SPISZ, W.BRAK_ORIENTU24, W.MROWIENIE
    );
}
