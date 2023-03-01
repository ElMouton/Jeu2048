package jeu;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import jeu.Vues.VueMenu;
import jeu.Vues.VuePlateau;
import jeu.Vues.VueStats;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Jeu jeu = new Jeu();
        jeu.print();

        BorderPane root = new BorderPane();

        root.setCenter(new VuePlateau(jeu));
        root.setBottom(new VueStats(jeu));
        root.setTop(new VueMenu(jeu));

        stage.setTitle("2048");
        stage.setScene(new Scene(root, 1000, 700));
        stage.show();
    }
}
