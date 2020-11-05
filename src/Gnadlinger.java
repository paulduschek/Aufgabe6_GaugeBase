import eu.hansolo.medusa.Gauge;
import eu.hansolo.medusa.TickLabelOrientation;
import eu.hansolo.medusa.skins.ModernSkin;
import javafx.scene.paint.Color;
public class Gnadlinger extends GaugeBase
{
    private int value;
    @Override
    public void redraw()
    {
        this.getChildren().clear();
        Gauge gauge = new Gauge();

        gauge.setSkin(new ModernSkin(gauge));
        gauge.setUnit("Km / h");
        gauge.setUnitColor(Color.GREENYELLOW);
        gauge.setDecimals(0);
        gauge.setValue(value); //deafult position of needle

        gauge.setValueColor(Color.WHITE);
        gauge.setTitleColor(Color.WHITE);
        gauge.setSubTitleColor(Color.WHITE);
        gauge.setBarColor(Color.rgb(0, 214, 215));
        gauge.setNeedleColor(Color.WHITE);
        gauge.setThresholdColor(Color.YELLOW);  //color will become red if it crosses value
        gauge.setThreshold(70);
        gauge.setThresholdVisible(true);
        gauge.setTickLabelColor(Color.rgb(151, 151, 151));
        gauge.setTickMarkColor(Color.WHITE);
        gauge.setTickLabelOrientation(TickLabelOrientation.ORTHOGONAL);

        this.getChildren().addAll(gauge);
    }
    @Override
    public void setValue(int v)
    {
        this.value = v;
        this.redraw();
    }
}