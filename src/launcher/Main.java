import javax.swing.*;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;
import src.Controller.Controller;


public class Main {
    private static Controller controller;

    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("es-ES")); //alternativamente usar "-Duser.language=es -Duser.country=ES" como argumentos del programa

        controller = new Controller(BackEnd.getInstance());

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainWindow mainWindow = new MainWindow(controller);

                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                int width = (int) (screenSize.getWidth() * 0.9);
                int height = (int) (screenSize.getHeight() * 0.9);

                mainWindow.setSize(width, height);
                mainWindow.setLocationRelativeTo(null);
                mainWindow.setVisible(true);
            }
        });
    }
}
