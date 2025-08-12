package org.example.assignment01shapedrawer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

public class HelloController {
    @FXML
    private Button addCircleBtn;
    @FXML
    private Button addRectangleBtn;
    @FXML
    private Button clearShapeBtn;
    @FXML
    private Pane myDrawingPane;
    @FXML
    private ColorPicker myColorPicker;

    public void addCircle(ActionEvent e) {
        Circle myCircle = new Circle(50);
        double maxX = myDrawingPane.getWidth()-myCircle.getRadius();
        double minX = myCircle.getRadius();
        double maxY = myDrawingPane.getHeight()-myCircle.getRadius();
        double minY = myCircle.getRadius();
        double xAxis = minX + Math.random() * (maxX - minX);
        double yAxis = minY + Math.random() * (maxY - minY);
        myCircle.setCenterX(xAxis);
        myCircle.setCenterY(yAxis);
        myDrawingPane.getChildren().add(myCircle);
    }
    public void addRectangle(ActionEvent e) {
        Rectangle myRectangle  = new Rectangle(150,100);
        myRectangle.setX((myDrawingPane.getWidth()-myRectangle.getWidth())*Math.random());
        myRectangle.setY((myDrawingPane.getHeight()-myRectangle.getHeight())*Math.random());
        myRectangle.setFill(myColorPicker.getValue());
        myDrawingPane.getChildren().add(myRectangle);
    }
    public void clearShape(ActionEvent e) {
        myDrawingPane.getChildren().clear();
    }

}