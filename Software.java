import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Software extends Application {
    private boolean hasClearance;

    @Override
    public void start(Stage primaryStage) {
        // Create buttons for Employee and Manager
        Button employeeButton = new Button("Employee");
        Button managerButton = new Button("Manager");

        // Set action handlers for the buttons
        employeeButton.setOnAction(e -> handleAccessSelection("Employee"));
        managerButton.setOnAction(e -> handleAccessSelection("Manager"));

        // Create a layout for the buttons
        VBox root = new VBox(10);
        root.getChildren().addAll(employeeButton, managerButton);

        // Create a scene
        Scene scene = new Scene(root, 300, 150);

        // Set the scene and show the stage
        primaryStage.setTitle("Access Selection");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void handleAccessSelection(String accessType) {
        System.out.println("Selected access type: " + accessType);
        if (accessType.equals("Employee")) {
            Employee employee = new Employee("name", 1, false);
            hasClearance = employee.clearance;
            launchDisplay();
        } else if (accessType.equals("Manager")) {
            Manager manager = new Manager("name", 1, true);
            hasClearance = manager.clearance;
            launchDisplay();
        }
    }

    private void launchDisplay() {
        Stage userDataStage = new Stage();
        if (hasClearance == true) {
            Effortlog.display(userDataStage, hasClearance);
        } else
            Effortlog.noDisplay(userDataStage, hasClearance);
    }
    

    public static void main(String[] args) {
        launch(args);
    }
}

