import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


public class GaugeBase extends Group {

    private int width = 100;
    private int height = 100;
    private int value = 0;

    public GaugeBase()
    {
        //nothing to do here
    }

    public void redraw()
    {
        Rectangle border = new Rectangle();
        border.setX(0);
        border.setY(0);
        border.setWidth(width);
        border.setHeight(height);
        border.setArcWidth(20);
        border.setArcHeight(20);
        border.setStrokeWidth(10);
        border.setStroke(Color.RED);
        border.setFill(Color.GRAY);

        Text t = new Text();
        t.setText(String.valueOf(this.value));
        t.setFont(Font.font ("Verdana", 20));
        t.setFill(Color.BLACK);

        //measure the text
        double w = t.getLayoutBounds().getWidth();
        double h = t.getLayoutBounds().getHeight();

        //calculate center
        t.setX(this.width / 2.0 - w / 2.0);
        t.setY(this.height / 2 - h / 2.0);

        this.getChildren().addAll(border, t);
    }

    public void init(int width, int height)
    {
        this.width = width;
        this.height = height;
        this.redraw();
    }

    public void setValue(int v)
    {
        this.value = v;
        this.redraw();
    }
}
