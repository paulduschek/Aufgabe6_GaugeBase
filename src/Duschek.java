import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.TickLabelOrientation;
import eu.hansolo.medusa.skins.BulletChartSkin;
import eu.hansolo.medusa.skins.ModernSkin;
import javafx.scene.paint.Color;


/**
 * @author Paul Duschek
 * @version 1.0, 5.11.2020
 */

public class Duschek extends GaugeBase {

    private int value;
    @Override
    public void redraw()
    {
        Gauge gauge = new Gauge();
        gauge.setSkin(new ModernSkin(gauge));
        gauge.setUnit("Km / h");
        gauge.setUnitColor(Color.BLUE);
        gauge.setDecimals(0);
        gauge.setValue(value);
        gauge.setAnimated(true);
        gauge.setValueColor(Color.BLUE);
        gauge.setTitleColor(Color.BLUE);
        gauge.setSubTitleColor(Color.BLUE);
        gauge.setBarColor(Color.rgb(0, 214, 215));
        gauge.setNeedleColor(Color.RED);
        gauge.setThresholdColor(Color.RED);
        gauge.setThreshold(85);
        gauge.setThresholdVisible(true);
        gauge.setTickLabelColor(Color.rgb(151, 151, 151));
        gauge.setTickMarkColor(Color.BLUE);
        gauge.setTickLabelOrientation(TickLabelOrientation.ORTHOGONAL);
        gauge.setSkin(new BulletChartSkin(gauge));
        this.getChildren().addAll( gauge);
    }
    @Override
    public void setValue(int v)
    {
        this.getChildren().clear();
        this.value = v;
        this.redraw();
    }
}


