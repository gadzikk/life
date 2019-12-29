package osoba;

import miejsce.Miejsce;
import typy_bazowe.TypPlaca;
import typy_bazowe.TypPraca;
import typy_bazowe.TypZadania;

/**
 * Created by gadzik on 19.12.19.
 */
public class Praca extends Zadanie {
    TypPraca typPracy;
    TypPlaca typPlaca;
    boolean elCzas;

    public Praca(TypZadania typZadania, TypPraca typPracy, TypPlaca typPlaca, boolean elCzas, Integer iloscDniTygodnia, Integer iloscGodzin, boolean cierpienie, boolean zmeczenie, Miejsce miejsce) {
        super(typZadania, iloscDniTygodnia, iloscGodzin, cierpienie, zmeczenie, miejsce);
        this.typPracy = typPracy;
        this.typPlaca = typPlaca;
        this.elCzas = elCzas;
    }




}
