/**
* Objective: Create Calculator
* Created by: Jalen McCarthy
* Date Created: March 19, 2022
* Class: COSC 1174
* Version: JDK 16.0.2
*/

//import javafx
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

//extend to Application
public class CalculatorBuild extends Application {
	
	//Create Flow pane
	public void start(Stage primaryStage) {
		FlowPane pane = new FlowPane();
		pane.setHgap(2);
		
		//Create Number1, Number2, and Result text fields
		TextField tfNumber1 = new TextField();
		TextField tfNumber2 = new TextField();
		TextField tfResult = new TextField();
		
		//Set Column Count for each text field
		tfNumber1.setPrefColumnCount(3);
		tfNumber2.setPrefColumnCount(3);
		tfResult.setPrefColumnCount(3);
		
		//Get all text fields for pane
		pane.getChildren().addAll(new Label("Number 1: "), tfNumber1,
				new Label("Number 2: "), tfNumber2,
				new Label("Result: "), tfResult);
		
		//Create HBox to display four buttons
		HBox hBox = new HBox(5);
		Button btAdd = new Button("Add");
		Button btSubtract = new Button("Subtract");	
		Button btMultiply = new Button("Multiply");
		Button btDivide = new Button("Divide");

		//Align HBox 
		hBox.setAlignment(Pos.CENTER);
		hBox.getChildren().addAll(btAdd, btSubtract, btMultiply, btDivide);
		
		//Create Border Pane and center
		BorderPane borderPane = new BorderPane();
		borderPane.setCenter(pane);
		borderPane.setBottom(hBox);
		
		//Create Scene to display calculator
		Scene scene = new Scene(borderPane, 250, 150);
		primaryStage.setTitle("Simple Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();
		
		//Add button function
		btAdd.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText())+
					Double.parseDouble(tfNumber2.getText()) + " ");
		});
		//Subtract button function
		btSubtract.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText())-
					Double.parseDouble(tfNumber2.getText()) + " ");
		});
		//Multiply button function
		btMultiply.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) *
					Double.parseDouble(tfNumber2.getText()) + " ");
		});
		//Divide button function
		btDivide.setOnAction(e -> {
			tfResult.setText(Double.parseDouble(tfNumber1.getText()) /
					Double.parseDouble(tfNumber2.getText()) + " ");
		});
	}
	//Launch application
	public static void main(String[] args) {
		launch(args);
	}
}
