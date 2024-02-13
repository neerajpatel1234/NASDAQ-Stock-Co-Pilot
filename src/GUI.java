package src;

import javax.swing.*;
import java.awt.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GUI {
    static JFrame mainFrame;
    static JPanel mainPanel;
    static JMenuBar menuBar;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            setupGUI();
            drawChart();
        });
    }

    private static void setupGUI() {
        mainFrame = new JFrame("GUI");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(500, 500);
        mainFrame.setLayout(new BorderLayout());
        mainFrame.setLocationRelativeTo(null);


        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainFrame.add(mainPanel, BorderLayout.CENTER);

        setupMenuBar();

        mainFrame.setVisible(true);
    }

    private static void setupMenuBar(){
        menuBar = new JMenuBar();
        mainFrame.setJMenuBar(menuBar);

        // ----- File Menu -----
        JMenu fileMenu = new JMenu("File");
        JMenuItem openFile = new JMenuItem("Open");
        openFile.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showOpenDialog(mainFrame);
            if (result == JFileChooser.APPROVE_OPTION) {
                System.out.println("File selected");
            }
        });
        JMenuItem saveFile = new JMenuItem("Save");
        saveFile.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            int result = fileChooser.showSaveDialog(mainFrame);
            if (result == JFileChooser.APPROVE_OPTION) {
                System.out.println("File saved");
            }
        });
        fileMenu.add(openFile);
        fileMenu.add(saveFile);
        menuBar.add(fileMenu);

        // ----- View Menu -----
        JMenu viewMenu = new JMenu("View");
        JMenuItem viewChart = new JMenuItem("Chart");
        viewChart.addActionListener(e -> drawChart());
        viewMenu.add(viewChart);
        menuBar.add(viewMenu);

        // ----- Help Menu -----
        JMenu helpMenu = new JMenu("Help");

        JMenuItem about = new JMenuItem("About");
        about.addActionListener(e -> JOptionPane.showMessageDialog(null, "This is a GUI", "About", JOptionPane.INFORMATION_MESSAGE));
        helpMenu.add(about);

        JMenuItem howToUse = new JMenuItem("How to use");
        howToUse.addActionListener(e -> JOptionPane.showMessageDialog(null, "Use it", "How to use", JOptionPane.INFORMATION_MESSAGE));
        helpMenu.add(howToUse);

        menuBar.add(helpMenu);

        // ----- Exit Menu -----
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(e -> {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                System.exit(0);
            }});
        menuBar.add(exit);

    }

    private static void drawChart() {
        Chart chart = new Chart();
        chart.setVisible(true);




        public class GraphApplication extends Application {

            @Override
            public void start(Stage primaryStage) {
                primaryStage.setTitle("Bar and Candlestick Graphs");

                CategoryAxis xAxis = new CategoryAxis();
                xAxis.setLabel("Month");

                NumberAxis yAxisBar = new NumberAxis();
                yAxisBar.setLabel("Value");

                BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxisBar);
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






    }


}
