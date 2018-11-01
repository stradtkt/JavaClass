package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			CategoryAxis xAxis = new CategoryAxis();
			xAxis.setLabel("Fields");
			NumberAxis yAxis = new NumberAxis();
			yAxis.setLabel("Amount");
			BarChart bar = new BarChart(xAxis, yAxis);
			XYChart.Series data1 = new XYChart.Series();
			data1.setName("2015");
			data1.getData().add(new XYChart.Data("Users", 1051));
			data1.getData().add(new XYChart.Data("Messages", 2521));
			data1.getData().add(new XYChart.Data("Comments", 1555));
			bar.getData().add(data1);
			BorderPane root = new BorderPane(bar);
			Scene scene = new Scene(root,600,600);
			primaryStage.setTitle("User Dashboard Results");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}