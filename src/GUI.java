package src;

import javax.swing.*;
import java.awt.*;

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
    }


}
