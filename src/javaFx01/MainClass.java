package javaFx01;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass extends Application{// Fx를 사용할 때는 상속을 받아야 함

	@Override //MainClass 오버라이드
	public void start(Stage arg0) throws Exception {
		System.out.println("start 실행???");
		Label lb = new Label(); // configure로 Label 추가
		lb.setFont(new Font(30));// 글자 크기 설정
		lb.setText("안녕하세요");// 글자 입력
		
		Scene scane = new Scene(lb, 200, 300); // 200,300은 해당하는 scene에 대한 가로 세로 크기
		arg0.setScene(scane);
		
 		arg0.setTitle("제목을 설정합니다."); // 윈도우 창(stage) 제목 설정
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args); // application 호출하는 명령어 , start를 호출함.
	}
} 
