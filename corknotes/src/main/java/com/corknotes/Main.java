package com.corknotes;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.corknotes.view.MainWindow;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            } catch (Exception ignored) {
            }

            MainWindow window = new MainWindow();
            window.setVisible(true);
        });
    }
}