package z_inne;

import warunek.W;

import java.util.List;

/**
 * Created by gadzik on 30.12.19.
 */
public class Charakter {
    List<W> przewagiCharakteru;
    List<W> slabosciCharakteru;

    public List<W> getPrzewagiCharakteru() {
        return przewagiCharakteru;
    }

    public void setPrzewagiCharakteru(List<W> przewagiCharakteru) {
        this.przewagiCharakteru = przewagiCharakteru;
    }

    public List<W> getSlabosciCharakteru() {
        return slabosciCharakteru;
    }

    public void setSlabosciCharakteru(List<W> slabosciCharakteru) {
        this.slabosciCharakteru = slabosciCharakteru;
    }
}
