package src;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Bar and Candlestick Graphs");

        CategoryAxis xAxisBar = new CategoryAxis();
        xAxisBar.setLabel("Month");

        NumberAxis yAxisBar = new NumberAxis();
        yAxisBar.setLabel("Value");

        BarChart<String, Number> barChart = new BarChart<>(xAxisBar, yAxisBar);
        barChart.setTitle("Bar Graph");

        XYChart.Series<String, Number> barData = new XYChart.Series<>();
        barData.getData().add(new XYChart.Data<>("Jan", 100));
        barData.getData().add(new XYChart.Data<>("Feb", 150));
        barData.getData().add(new XYChart.Data<>("Mar", 200));
        barData.getData().add(new XYChart.Data<>("Apr", 250));
        barChart.getData().add(barData);

        NumberAxis yAxisCandle = new NumberAxis();
        yAxisCandle.setLabel("Value");

        CategoryAxis xAxisCandle = new CategoryAxis();
        xAxisCandle.setLabel("Month");

        CandleStickChart<String, Number> candleStickChart = new CandleStickChart<>(xAxisCandle, yAxisCandle);
        candleStickChart.setTitle("Candlestick Graph");

        XYChart.Series<String, Number> candleData = new XYChart.Series<>();
        candleData.getData().add(new XYChart.Data<>("Jan", 90, 110, 80, 100));
        candleData.getData().add(new XYChart.Data<>("Feb", 140, 160, 130, 150));
        candleData.getData().add(new XYChart.Data<>("Mar", 190, 210, 180, 200));
        candleData.getData().add(new XYChart.Data<>("Apr", 240, 260, 230, 250));
        candleStickChart.getData().add(candleData);

        StackPane root = new StackPane();
        root.getChildren().addAll(barChart, candleStickChart);
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
