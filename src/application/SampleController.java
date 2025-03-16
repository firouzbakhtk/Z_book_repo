package application;

import java.time.LocalDateTime;

import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class SampleController {
	
	public Circle c1;
	public Circle c2;
	public double r;
	public Text text;
	
	public SampleController() {
		// TODO Auto-generated constructor stub
		super();
		this.r = 100;
	}	
	@FXML
	private void printLeft() {
		System.out.println("left");
		c2.setRadius(c2.getRadius() * .9);
	}
	@FXML
	private void printMiddle() {
		System.out.println("Middle");
		c2.setRadius(r);
	}
	@FXML
	private void printRight() {
		System.out.println("Right");
		c2.setRadius(c2.getRadius() * 1.1);
	}
	
	@FXML
	private void setTime() {
		LocalDateTime dt = LocalDateTime.now();
		text.setText(String.format("%d:%02d:%02d", dt.getHour(), dt.getMinute(), dt.getSecond()));
		
	}
	
//	dfgdg
	
}
