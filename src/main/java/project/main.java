package project;

import project.Modelo.Conexion;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            System.out.println(main.class.getResource("SceneLogin.fxml"));
            FXMLLoader fxmlLoader = new FXMLLoader(main.class.getResource("SceneLogin.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            stage.setTitle("Login!");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error loading FXML: " + e.getMessage());
        }
    }

    public static void main(String[] args) {launch(args);}
}