package com.desktopWork.controller;

import com.desktopWork.bean.Word;
import javafx.animation.AnimationTimer;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.util.Duration;

import java.text.SimpleDateFormat;
import java.util.*;

public class MainCtrl {
    @FXML
    public AnchorPane paneBackground;
    @FXML
    public Label labelData;
    @FXML
    public Label labelTime;
    @FXML
    public Label labelWord;
    @FXML
    public ListView labelList;
    @FXML
    public Button labelAdd;
    @FXML
    public TextField labelInput;
    @FXML
    public ColorPicker colorPicker;
    @FXML
    public ColorPicker fontColorPicker;
    @FXML
    public CheckBox checkBox;

    private Timeline timeline;
    private AnimationTimer timer;

    /**
     * 任务添加
      */
    public void addList(){
//        1.获取输入框内容
        String inputText = labelInput.getText();
        System.out.println("b"+inputText);
//        2.得到当前节点个数，创建一个新的子节点3.子节点里面创建label并将内容赋给label
        labelList.getItems().add(inputText);
        System.out.println("成功");
        labelInput.setText("");
    }

    /**
     * 删除点击事件
      */
    public void eventList(){
//        如果当前点击了删除按键，删除该点击事件
        if (checkBox.isSelected()){
            System.out.println("点击测试");
            //        获取当前点击的行数
            int selectedIndex = labelList.getSelectionModel().getSelectedIndex();
            //        打印
            System.out.println("成功。"+selectedIndex);
            labelList.getItems().remove(selectedIndex);
        }

//        items.remove(index);
    }

    /**
     * 获取当前时间并打印
     */
    public void getTime(){
        SimpleDateFormat ft = new SimpleDateFormat ("HH:mm:ss");
        timeline = new Timeline();
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        timeline.setDelay(Duration.millis(10000));
        timer = new AnimationTimer() {
            @Override
            public void handle(long l) {
                Date today = new Date();
                labelTime.setText(ft.format(today));
            }
        };
        timeline.play();
        timer.start();

    }

    /**
     * 获取当前日期
     */
    public void getData(){
//        自动更新日期
        Date today = new Date();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd E");
        System.out.println("当前时间为: " + ft.format(today));
        labelData.setText(ft.format(today));
//        打印日期

    }

    /**
     * 随机显示语句

    public int getRandomWord(){
        Random random = new Random();
        int nextInt = random.nextInt(60);
        return nextInt;
    }*/

    /**
     * 设置背景颜色
     */
    public void backgroundColor(){
        String colorStr = colorPicker.getValue().toString();
        System.out.println(colorStr);
        for(String s : colorStr.split("0x")){
            System.out.println(s);
            paneBackground.setStyle("-fx-background-color:#"+s);
//            paneBackground.setStyle(""+s);
        }
        System.out.println("1111");
    }

    /**
     * 设置字体颜色
     */
    public void fontColor(){
        Color fontColorStr = fontColorPicker.getValue();

        System.out.println(fontColorStr);
        labelData.setTextFill(fontColorStr);
        labelTime.setTextFill(fontColorStr);
//        labelWord.setTextFill(fontColorStr);
    }

}
