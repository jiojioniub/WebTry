package com.desktopWork;

import com.desktopWork.controller.MainCtrl;
import com.desktopWork.service.WordService;
import com.desktopWork.service.impl.WordServiceImpl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

public class App extends Application {
    @Autowired
    MainCtrl mainCtrl;
    WordService wordService;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {

//        Parent root = FXMLLoader.load(getClass().getResource("../../../resources/fxml/mainView.fxml"));
        Parent root = FXMLLoader.load(getClass().getResource("fxml/mainView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
//        无边界
        stage.initStyle(StageStyle.TRANSPARENT);
//        界面透明
        scene.setFill(Color.color(0,0,0,0));

        stage.setAlwaysOnTop(true);
        Rectangle2D primaryScreenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX(primaryScreenBounds.getWidth() - 270);
        stage.setY(20);
//        stage.setTitle("登录");
//        System.out.println(mainCtrl.getRandomWord());
//        wordService.selectWord();
        stage.show();

    }
}
