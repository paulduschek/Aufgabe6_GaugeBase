import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.skins.BatterySkin;
import javafx.scene.paint.Color;

/**
 * uebung 6
 * @author Brunmayr Sarah
 * @version 12.0.1, 22.10.2020
 */

public class Brunmayr extends GaugeBase {

    private int value;

    @Override
    public void redraw() {

        this.getChildren().clear();

        Gauge gauge = new Gauge();
        gauge.setSkin(new BatterySkin(gauge));
        gauge.setUnit("%");
        gauge.setDecimals(0);
        gauge.setValue(value);
        gauge.setAnimated(true);
        gauge.setValueColor(Color.BLACK);                      //Value Color
        gauge.setBarColor(Color.rgb(229, 204, 255));

        this.getChildren().addAll(gauge);

    }
    @Override
    public void setValue(int v)
    {
        this.value = v;
        this.redraw();
    }
}