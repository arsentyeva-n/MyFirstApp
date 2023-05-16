/**
 * @author Arsentyeva N. V.
 */
package simpleclass.myfirstapp;
// Главный класс приложения JavaFX должен наследоваться от класса javafx.application.Application
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
// Scene - это контейнер верхнего уровня для всех графических элементов
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
//Stage представляет пользовательский интерфейс
import java.io.IOException;

public class Main extends Application {
    /** Создание главного окна приложения */

    /**
     * Родительский метод переопределён в наследнике.
     * Компилятор при наличии такой аннотации проверяет,
     * не нарушены ли правила переопределения
     */
    @Override
    public void start(Stage stage) throws IOException {
        // Создание корневого элемента сцены по его описанию из fxml файла
        // Stage -- JavaFX контейнер верхнего уровня, построен на основе javafx.stage.Window
        // Может содержать в себе несколько экземпляров Scene.
        // Scene -- контейнер для элементов UI, составляющих сцену.
        // Отдельные элементы сцены называют узлами (nodes). Кнопка, лейбл и т.п. -- узлы
        // Узлы могут содержать в себе другие узлы
        // +----- Stage -----+
        // |                 |
        // |  +-- Scene --+  |
        // |  | root node |  |
        // |  +-----------+  |
        // |                 |
        // +-----------------+
        //Для создания интерфейса применяется метод FXMLLoader.load().
        // Чтобы получить определение интерфейса из файла, используется метод getClass().getResource("название.fxml").
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main-view.fxml"));
        // создает Scene с корневым узлом root, с шириной width и высотой height
        Scene scene = new Scene((Parent)fxmlLoader.load(), 500.0, 380.0);
        stage.setTitle("Simple class"); // Заголовок
        stage.setScene(scene); //  устанавливает сцену (объект Scene) для объекта Stage
        stage.setResizable(false); // запретить изменение размера окна
        // подключение иконки окна
        Image applicationIcon = new Image(getClass().getResourceAsStream("/image/icon.png"));
        stage.getIcons().add(applicationIcon);
        stage.show(); // отображает окно
    }

    // Запуск главного цикла приложения
    // launch запускает методы init(), start() класса Application
    public static void main(String[] args) {
        launch();
    }
}