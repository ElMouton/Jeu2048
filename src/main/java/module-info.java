module jeu.jeu2048 {
    requires javafx.controls;
    requires javafx.fxml;


    opens jeu.jeu2048 to javafx.fxml;
    exports jeu.jeu2048;
}