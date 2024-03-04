package borderpane;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quiz extends Application {

	public void start(Stage arg0) throws Exception {
		GridPane gp = new GridPane();
		Button bt = new Button();
		Label lb = new Label("메뉴 홈 로그인");
		GridPane.setConstraints(lb,1,1);
		
		gp.getChildren().add(lb);
		gp.setStyle("-fx-background-color:pink;");
		
				
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
