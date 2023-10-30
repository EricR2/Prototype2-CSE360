//import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Effortlog {

    public static void display(Stage primaryStage, boolean hasClearance) {
        String message = hasClearance ? "No more Reports..." : "User Data";
        Button user1 = new Button("Bob's Report");
        Button user2 = new Button("Martin's Report");
        Button user3 = new Button("Rob's Report");

        VBox data = new VBox(5);
        data.getChildren().addAll(user1, user2, user3);
        Label label = new Label(message);
        StackPane root = new StackPane();
        root.getChildren().addAll(label, data);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("User Data Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void noDisplay(Stage primaryStage, boolean hasClearance) {
        String message = hasClearance ? "User Data" : "You don't have the clearance";

        Label label = new Label(message);
        StackPane root = new StackPane();
        root.getChildren().add(label);

        Scene scene = new Scene(root, 300, 200);

        primaryStage.setTitle("User Data Display");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
