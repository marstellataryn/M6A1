import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StaffInformation extends Application {

  private TextField idField;
  private TextArea resultArea;

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Staff Information");

    // Create the input fields
    idField = new TextField();
    Button viewButton = new Button("View");
    Button insertButton = new Button("Insert");
    Button updateButton = new Button("Update");
    resultArea = new TextArea();

    // Event handlers
    viewButton.setOnAction(e -> viewRecord());
    insertButton.setOnAction(e -> insertRecord());
    updateButton.setOnAction(e -> updateRecord());

    VBox layout = new VBox(10);
    layout.setPadding(new Insets(10));
    layout.getChildren().addAll(new Label("Enter ID: "), idField, viewButton, insertButton, updateButton, resultArea);

    Scene scene = new Scene(layout, 300, 250);
    primaryStage.setScene(scene);
    primaryStage.show();
  }
  private void viewRecord() {
    // Implement logic to retrieve and display the record
    resultArea.setText("View Record: Record ID: " + idField.getText());
    
  }
  private void insertRecord() {
    resultArea.setText("Insert Record: Record ID: " + idField.getText());
  }

  private void connectToDatabase() {
    resultArea.setText("Connected to Database");
  }

  public StaffInformation() {
    connectToDatabase();
  }
}
  