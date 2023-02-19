package jeu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import jeu.Vues.VuePlateau;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Jeu jeu = new Jeu();

        BorderPane root = new BorderPane();

        root.setCenter(new VuePlateau(jeu));

        stage.setScene(new Scene(root, 1000, 700));
        stage.show();
    }
}
