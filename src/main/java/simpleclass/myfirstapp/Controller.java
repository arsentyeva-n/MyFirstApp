/**
 * @author Arsentyeva N. V.
 */

package simpleclass.myfirstapp;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML; // определяет функционал для работы с FXML
// Визуальные компоненты
// Scene - это контейнер верхнего уровня для всех графических элементов
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;


// В файле fxml с помощью атрибута fx:controller в корневом узле устанавливается класс
// контроллера который должен использоваться, то есть в данном случае Controller
// xmlns="http://javafx.com/javafx/19" xmlns:fx="http://javafx.com/fxml/1" fx:controller="simpleclass.myfirstapp.Controller"
public class Controller {
    final String color_error = "#ffc3bf";
    TextDoc Obj_1 = new TextDoc();
     // Создание объекта
    // @FXML позволяет сопоставить переменные и методы в контроллере с сущностями в FXML
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane Controller;

    @FXML
    private TextField author;

    @FXML
    private Button createObject;

    @FXML
    private Button inputList;

    @FXML
    private TextField name;

    @FXML
    private TextField pages;

    @FXML
    private TextArea text_field;

    @FXML
    private TextField type;

    @FXML
    private Label status_name;


    @FXML
    private Label status_pages;

    @FXML
    private Label status_author;

    @FXML
    private Label status_type;

    @FXML
    void OnCreate(MouseEvent event) {
        try {
            // Окрас полей в белый цвет
            name.setStyle("-fx-control-inner-background: #ffffff");
            author.setStyle("-fx-control-inner-background: #ffffff");
            pages.setStyle("-fx-control-inner-background: #ffffff");
            type.setStyle("-fx-control-inner-background: #ffffff");

            // Задание полей при вводе пустого поля
            Obj_1.set_name(name.getText());
            Obj_1.set_author(author.getText());
            if (pages.getText().equals("")) throw new IllegalArgumentException("the pages is undefined");
            Obj_1.set_pages(Integer.parseInt(pages.getText()));
            Obj_1.set_type(type.getText());

            // Вывод значений класса на экран
            text_field.setText(Obj_1.displayInfo());
        } catch (IllegalArgumentException e) {
            // При схватывании исключения выводится сообщение этого исключения и поле окрасывается в красный цвет
            if (e.getMessage() == "the name is undefined") {
                status_name.setText(e.getMessage());
                name.setStyle("-fx-control-inner-background: " + color_error);
            }
            if (e.getMessage() == "the author is undefined") {
                status_author.setText(e.getMessage());
                author.setStyle("-fx-control-inner-background: " + color_error);
            }
            if (e.getMessage() == "pages <= 0") {
                status_pages.setText(e.getMessage());
                pages.setStyle("-fx-control-inner-background: " + color_error);
            }
            if (e.getMessage() == "the pages is undefined") {
                status_pages.setText(e.getMessage());
                pages.setStyle("-fx-control-inner-background: " + color_error);
            }
            if (e.getMessage() == "the type is undefined") {
                status_type.setText(e.getMessage());
                type.setStyle("-fx-control-inner-background: " + color_error);
            }
        }

    }

}
