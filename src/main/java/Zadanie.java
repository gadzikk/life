/**
 * Created by gadzik on 19.12.19.
 */
public class Zadanie {
    TypZadania typZadania;
    Integer liczbaDniTygodnia;
    Integer liczbaGodzin;

    boolean cierpienie;
    boolean zmeczenie;
    Miejsce miejsce;

    public Zadanie(TypZadania typZadania, Integer liczbaDniTygodnia, Integer liczbaGodzin, Miejsce miejsce) {
        this.typZadania = typZadania;
        this.liczbaDniTygodnia = liczbaDniTygodnia;
        this.liczbaGodzin = liczbaGodzin;
        this.miejsce = miejsce;
    }

    public Zadanie(TypZadania typZadania, Integer liczbaDniTygodnia, Integer liczbaGodzin, boolean cierpienie, boolean zmeczenie, Miejsce miejsce) {
        this.typZadania = typZadania;
        this.liczbaDniTygodnia = liczbaDniTygodnia;
        this.liczbaGodzin = liczbaGodzin;
        this.cierpienie = cierpienie;
        this.zmeczenie = zmeczenie;
        this.miejsce = miejsce;
    }
}
