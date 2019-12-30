package z_inne;

import warunek.Warunek;

import java.util.List;

/**
 * Created by gadzik on 30.12.19.
 */
public class Charakter {
    List<Warunek> przewagiCharakteru;
    List<Warunek> slabosciCharakteru;

    public List<Warunek> getPrzewagiCharakteru() {
        return przewagiCharakteru;
    }

    public void setPrzewagiCharakteru(List<Warunek> przewagiCharakteru) {
        this.przewagiCharakteru = przewagiCharakteru;
    }

    public List<Warunek> getSlabosciCharakteru() {
        return slabosciCharakteru;
    }

    public void setSlabosciCharakteru(List<Warunek> slabosciCharakteru) {
        this.slabosciCharakteru = slabosciCharakteru;
    }
}
