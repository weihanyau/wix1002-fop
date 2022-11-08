package lab_1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private final String JAN = "January";
    private final String FEB = "February";
    private final String MAR = "March";
    private final String APR = "April";
    private final String MAY = "May";
    private final String JUN = "June";

    @Override
    public void start(Stage stage) throws IOException {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String, Number> bc = new BarChart<String, Number>(xAxis, yAxis);
        stage.setTitle("Bar Chart");
        bc.setTitle("Total Sales of Product A in Year 2016");
        xAxis.setLabel("Month");
        yAxis.setLabel("Amount");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2016");
        series1.getData().add(new XYChart.Data(JAN, 2500));
        series1.getData().add(new XYChart.Data(FEB, 1600));
        series1.getData().add(new XYChart.Data(MAR, 2000));
        series1.getData().add(new XYChart.Data(APR, 2700));
        series1.getData().add(new XYChart.Data(MAY, 3200));
        series1.getData().add(new XYChart.Data(JUN, 800));

        Scene scene = new Scene(bc, 800, 600);
        bc.getData().addAll(series1);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}
