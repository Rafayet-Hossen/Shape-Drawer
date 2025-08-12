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
        myCircle.setFill(myColorPicker.getValue());
        double maxWidth = myDrawingPane.getWidth()-myCircle.getRadius();
        double maxHeight = myDrawingPane.getHeight()-myCircle.getRadius();
        double xAxis = myCircle.getRadius() + Math.random() * maxWidth;
        double yAxis = myCircle.getRadius() + Math.random() * maxHeight;
        myCircle.setCenterX(xAxis);
        myCircle.setCenterY(yAxis);
        myDrawingPane.getChildren().add(myCircle);
    }
    public void addRectangle(ActionEvent e) {
        Rectangle rectangle  = new Rectangle(150,100);
        double maxWidth = myDrawingPane.getWidth()-rectangle.getWidth();
        double maxHeight = myDrawingPane.getHeight()-rectangle.getHeight();
        double xAxis = rectangle.getWidth() + Math.random() * maxWidth;
        double yAxis = rectangle.getHeight() + Math.random() * maxHeight;
        rectangle.setX(xAxis);
        rectangle.setY(yAxis);
        rectangle.setFill(myColorPicker.getValue());
        myDrawingPane.getChildren().add(rectangle);
    }
    public void clearShape(ActionEvent e) {
        myDrawingPane.getChildren().clear();
    }

}