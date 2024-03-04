package javaFx01;

import javax.crypto.SealedObject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TestClass extends Application{

	public void start(Stage arg0) throws Exception {
		FlowPane flowPane = new FlowPane();
		Label lb = new Label();
		lb.setFont(new Font(40));
		Button btn01 = new Button("버튼1");
		Button btn02 = new Button();
		Button btn03 = new Button();
		Button btn04 = new Button();
		Button btn05 = new Button();
		Button btn06 = new Button();
		Button btn07 = new Button();
		Button btn08 = new Button();
		Button btn09 = new Button();
		Button btn10 = new Button();
		btn02.setText("버튼2");
		btn03.setText("버튼3");
		btn04.setText("버튼4");
		btn05.setText("버튼5");
		btn06.setText("버튼6");
		btn07.setText("버튼7");
		btn08.setText("버튼8");
		btn09.setText("버튼9");
		btn10.setText("버튼10");
		
		flowPane.getChildren().add(lb);
		flowPane.getChildren().add(btn01);
		flowPane.getChildren().add(btn02);
		flowPane.getChildren().add(btn03);
		flowPane.getChildren().add(btn04);
		flowPane.getChildren().add(btn05);
		flowPane.getChildren().add(btn06);
		flowPane.getChildren().add(btn07);
		flowPane.getChildren().add(btn08);
		flowPane.getChildren().add(btn09);
		flowPane.getChildren().add(btn10);
		
		Scene sc = new Scene(flowPane);
		arg0.setScene(sc);
		arg0.setTitle("FlowPaneEx");
		arg0.show();
		
	}
public static void main(String[] args) {
	launch(args);
}
}
