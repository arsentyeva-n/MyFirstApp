package simpleclass.myfirstapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

// Проверка методов класса
class TextDocTest {

/*    @Test
    void set_name() {
        TextDoc g = new TextDoc();
        g.set_name(" ");
        Assertions.assertEquals(" ", g.get_name());

    }

    @Test
    void set_author() {
        TextDoc g = new TextDoc();
        g.set_author(" ");
        Assertions.assertEquals(" ", g.get_author());
    }

    @Test
    void set_type() {
        TextDoc g = new TextDoc();
        g.set_type(" ");
        Assertions.assertEquals(" ", g.get_type());
    }

    @Test
    void set_pages() {
        TextDoc g = new TextDoc();
        g.set_pages(100);
        Assertions.assertEquals(100, g.get_pages());
    }*/

    // Тесты работы геттеров и выводы на экран
    @Test
    void get_name() {
        TextDoc g = new TextDoc();
        g.set_name("Акт списания товара");
        Assertions.assertEquals("Акт списания товара", g.get_name());
    }

    @Test
    void get_author() {
        TextDoc g = new TextDoc();
        g.set_author("Авторов А. А.");
        Assertions.assertEquals("Авторов А. А.", g.get_author());
    }

    @Test
    void get_type() {
        TextDoc g = new TextDoc();
        g.set_type("Акт");
        Assertions.assertEquals("Акт", g.get_type());
    }

    @Test
    void get_pages() {
        TextDoc g = new TextDoc();
        g.set_pages(100);
        Assertions.assertEquals(100, g.get_pages());
    }

    @Test
    void displayInfo() {
        TextDoc g = new TextDoc();
        g.set_name("Доверенность на право получения электронной подписи организации в удостоверяющем центре");
        g.set_author("Попов А. А.");
        g.set_pages(2);
        g.set_type("Доверенность");
        String s = "Name: " + g.get_name() + "\nAuthor: " + g.get_author() + "\nType: " + g.get_type() + "\nPages: " + Integer.toString(g.get_pages());
        Assertions.assertEquals(s, g.toString());
    }
}