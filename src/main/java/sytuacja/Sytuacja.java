package sytuacja;

import warunek.W;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by gadzik on 26.12.19.
 */
public class Sytuacja {
    List<TypSytuacja> typySytuacji;
    List<W> warunki;
    LocalDateTime czas;
    W defaultCel;

    public Sytuacja() {
    }

    public Sytuacja(List<TypSytuacja> typySytuacji, List<W> warunki, LocalDateTime czas, W defaultCel) {
        this.typySytuacji = typySytuacji;
        this.warunki = warunki;
        this.czas = czas;
        this.defaultCel = defaultCel;
    }
}
