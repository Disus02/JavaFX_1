import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Program extends Application {
    int count = 0;
    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("MyWindow");
        primaryStage.setWidth(400);
        primaryStage.setHeight(300);
        Pane root= new Pane();
        Label label = new Label("Name");
        label.setLayoutX(0);
        label.setLayoutY(120);
        label.setFont(new Font(20));
        TextField textName= new TextField();
        textName.setFont(new Font(20));

        Button btr = new Button("Click me");
        btr.setLayoutX(0);
        btr.setLayoutY(160);
        btr.setPrefSize(70,20);
        btr.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                count++;
                    label.setText("Olya "+ count);
                    label.setFont(new Font(20));
            }
        });
        btr.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String str = textName.getText();
                if (str.isEmpty()){
                    str= "Name not found";
                }
                label.setText("Name: "+ str);

            }
        });
        Scene scene = new Scene(root);
        root.getChildren().add(textName);
        root.getChildren().add(label);
        root.getChildren().add(btr);
        primaryStage.setScene(scene);







        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);

    }
}
