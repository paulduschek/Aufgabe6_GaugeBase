import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.skins.ModernSkin;
import eu.hansolo.medusa.skins.SimpleDigitalSkin;
import javafx.scene.paint.Color;

/**
 * @autor Kadletz Sophie
 * @version 5.11.2020
 */

public class Kadletz extends GaugeBase{
    private int value;

    @Override
    public void redraw() {
        getChildren().clear();
        Gauge gauge = new Gauge();
        gauge.setSkin(new ModernSkin(gauge));
        gauge.setDecimals(0);
        gauge.setValue(value);
        gauge.setAnimated(true);
        gauge.setValueColor(Color.CORNFLOWERBLUE);
        gauge.setBarColor(Color.rgb(250, 90, 250));
        gauge.setThresholdColor(Color.BLACK);
        gauge.setThreshold(95);
        gauge.setThresholdVisible(true);
        gauge.setSkin(new SimpleDigitalSkin(gauge));
        this.getChildren().addAll(gauge);
    }

    @Override
    public void setValue(int v) {
        this.value = v;
        this.redraw();
    }
}
