package application;

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;

public class SampleController2 implements Initializable {

	public Button b;
	public boolean b_stat = true;
	public int k = 0;
	public Circle c1;
	public Circle c2;
	public double r;
	public Text text;
	
	@FXML
	private void printText() {
		if (b_stat) {
			System.out.println("button pressed");			
			b.setText("test " + k);
			b_stat = false;
			k = k + 1;
		} else {
			System.out.println("button pressed again");
			b.setText("test " + k);
			b_stat = true;
			k = k + 1;
		}
		
	}
	
	@FXML
	private void setTime() {
		LocalDateTime dt = LocalDateTime.now();
		text.setText(String.format("%d:%02d:%02d", dt.getHour(), dt.getMinute(), dt.getSecond()));
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		TranslateTransition ts = new TranslateTransition();
		
		ts.setDuration(Duration.seconds(.5));
		ts.setNode(b);
		
		ts.setToX(-50);
		ts.setToY(-50);
		ts.setAutoReverse(true);
		ts.setCycleCount(10);
		ts.play();
		
		ts.setOnFinished(e -> {
			System.out.println("all done!");
		});
		
//		TranslateTransition ts2 = new TranslateTransition();
//		ts2.setDuration(Duration.seconds(5));
//		ts2.setToX(+50);
//		ts2.setToY(-50);		
//		ts2.play();
		
		
	}
	
}
