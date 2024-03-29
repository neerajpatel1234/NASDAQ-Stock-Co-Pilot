package Referance_Code;//package com.soilprod.javafx.chart.candlestick;


/**
 * Created by gzemlyakov.
 * gzemlyakov@gmail.com
 */
public class zemlyakov_Sample {

    /*#
    private static double[][] data = new double[][]{
            {1,  25, 20, 32, 16, 20},
            {2,  26, 30, 33, 22, 25},
            {3,  30, 38, 40, 20, 32},
            {4,  24, 30, 34, 22, 30},
            {5,  26, 36, 40, 24, 32},
            {6,  28, 38, 45, 25, 34},
            {7,  36, 30, 44, 28, 39},
            {8,  30, 18, 36, 16, 31},
            {9,  40, 50, 52, 36, 41},
            {10, 30, 34, 38, 28, 36},
            {11, 24, 12, 30, 8,  32.4},
            {12, 28, 40, 46, 25, 31.6},
            {13, 28, 18, 36, 14, 32.6},
            {14, 38, 30, 40, 26, 30.6},
            {15, 28, 33, 40, 28, 30.6},
            {16, 25, 10, 32, 6,  30.1},
            {17, 26, 30, 42, 18, 27.3},
            {18, 20, 18, 30, 10, 21.9},
            {19, 20, 10, 30, 5,  21.9},
            {20, 26, 16, 32, 10, 17.9},
            {21, 38, 40, 44, 32, 18.9},
            {22, 26, 40, 41, 12, 18.9},
            {23, 30, 18, 34, 10, 18.9},
            {24, 12, 23, 26, 12, 18.2},
            {25, 30, 40, 45, 16, 18.9},
            {26, 25, 35, 38, 20, 21.4},
            {27, 24, 12, 30, 8,  19.6},
            {28, 23, 44, 46, 15, 22.2},
            {29, 28, 18, 30, 12, 23},
            {30, 28, 18, 30, 12, 23.2},
            {31, 28, 18, 30, 12, 22}
    };

    @Override
    public void start(Stage primaryStage) throws Exception {
        final NumberAxis xAxis = new NumberAxis(0,32,1);
        xAxis.setMinorTickCount(0);
        final NumberAxis yAxis = new NumberAxis();
        final CandleStickChart bc = new CandleStickChart(xAxis,yAxis);
        // setup chart
        bc.setTitle("Custom Candle Stick Chart");
        xAxis.setLabel("Day");
        yAxis.setLabel("Price");
        // add starting data
        XYChart.Series<Number,Number> series = new XYChart.Series<Number,Number>();
        for (int i=0; i< data.length; i++) {
            double[] day = data[i];
            series.getData().add(
                    new XYChart.Data<Number,Number>(day[0],day[1], new CandleStickChart.CandleStickExtraValues(day[2],day[3],day[4]))
            );
        }
        ObservableList<XYChart.Series<Number,Number>> chartData = bc.getData();
        if (chartData == null) {
            chartData = FXCollections.observableArrayList(series);
            bc.setData(chartData);
        } else {
            bc.getData().add(series);
        }

        StackPane root = new StackPane();
        root.getChildren().add(bc);

        Scene scene = new Scene(root, 800, 600);
//        scene.getStylesheets().add("/styles/CandleStickChartStyles.css");

        XYChart.Data<Number, Number> horizontalMarker = new XYChart.Data<>(0, 25);
        bc.addHorizontalValueMarker(horizontalMarker);


        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();

        series.getData().clear();
       for (int i=0; i< data.length; i++) {
            double[] day = data[i];
            series.getData().add(
                    new XYChart.Data<Number,Number>(day[0],day[1], new CandleStickChart.CandleStickExtraValues(day[2],day[3],day[4]))
            );
        }
    }

     */

 }
