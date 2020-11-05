import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application
{
    Brunmayr b = new Brunmayr();
    Duschek d = new Duschek();
    Gnadlinger g = new Gnadlinger();
    Kadletz k = new Kadletz();
    TextField txtValue = new TextField();

    public static void main(String[] args) {
        // Launch the JavaFX application
        Application.launch(args);
    }

    @Override public void start(Stage stage) {

        EventHandler<MouseEvent> btn_handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {

                try {
                    int v = Integer.parseInt(txtValue.getText());
                    b.setValue(v);
                    d.setValue(v);
                    g.setValue(v);
                    k.setValue(v);
                    txtValue.clear();
                }
                catch(Exception ex) {
                    System.out.println("Input Exception!");
                }

            }
        };

        b.init(300, 300);
        d.init(300, 300);
        g.init(300, 300);
        k.init(300, 300);

        Button btnValue = new Button();
        btnValue.setText("New Value");
        btnValue.addEventHandler(MouseEvent.MOUSE_CLICKED, btn_handler);

        VBox vBox = new VBox();
        vBox.setPadding(new Insets(10, 50, 50, 50));
        vBox.setSpacing(1);
        vBox.getChildren().addAll(b, d, g, k, txtValue, btnValue);

        //Creating a Scene
        Scene scene = new Scene(vBox);

        //Setting title to the scene
        stage.setTitle("Gauge Collection");
        //Adding the scene to the stage
        stage.setScene(scene);

        //Displaying the contents of a scene
        stage.show();
    }

}