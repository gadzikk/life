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
    W defaultCel;
    LocalDateTime czasStart;
    LocalDateTime czasEnd;
}
