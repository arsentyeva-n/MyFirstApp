/**
 * @author Arsentyeva N. V.
 */

package simpleclass.myfirstapp;

import javafx.fxml.FXML; // определяет функционал для работы с FXML
// Визуальные компоненты
// Scene - это контейнер верхнего уровня для всех графических элементов
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


// В файле fxml с помощью атрибута fx:controller в корневом узле устанавливается класс
// контроллера который должен использоваться, то есть в данном случае MainView
// xmlns="http://javafx.com/javafx/19" xmlns:fx="http://javafx.com/fxml/1" fx:controller="simpleclass.myfirstapp.MainView
//  класс, предназначенный для непосредственной обработки запросов от клиента и возвращения результатов
public class MainView {
    
    //  final на полях, говорит о том, что данное поле, является окончательным, что его нельзя изменить
    final String color_error = "#ffc3bf";

    /**
     * переменная myTextDoc является ссылкой на созданный объект, а не самим объектом.
     * В Java все объекты создаются динамически,
     * а переменные могут содержать только ссылки на объекты, а не сами объекты.
     * myTextDoc является ссылкой на объект типа TextDoc
     * */
    TextDoc myTextDoc = new TextDoc();
    

    // @FXML позволяет сопоставить переменные и методы в контроллере с сущностями в FXML
    @FXML
    private TextField author;

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
            myTextDoc.set_name(name.getText());
            myTextDoc.set_author(author.getText());
            if (pages.getText().equals("")) throw new IllegalArgumentException("the pages is undefined");
            myTextDoc.set_pages(Integer.parseInt(pages.getText()));
            myTextDoc.set_type(type.getText());

            // Вывод значений класса на экран
            text_field.setText(myTextDoc.toString());
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
