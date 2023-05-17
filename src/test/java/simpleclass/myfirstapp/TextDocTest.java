package simpleclass.myfirstapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;

// Проверка методов класса
class TextDocTest {

    /**
     * Метод set_name() проверяет, что установка имени документа проходит успешно (assertEquals()),
     * а также проверяет, что выбрасывается исключение IllegalArgumentException
     * при передаче пустой строки (assertThrows()). Другие сеттеры аналогично.
     */
    @Test
    void set_name() {
        TextDoc myTextDoc = new TextDoc();
        myTextDoc.set_name("Document1");
        assertEquals(myTextDoc.get_name(), "Document1");

        assertThrows(IllegalArgumentException.class, () -> {
            myTextDoc.set_name("");
        });
    }

    @Test
    void set_author() {
        TextDoc myTextDoc = new TextDoc();
        myTextDoc.set_author("Author1");
        assertEquals(myTextDoc.get_author(), "Author1");

        assertThrows(IllegalArgumentException.class, () -> {
            myTextDoc.set_author("");
        });
    }

    @Test
    void set_type() {
        TextDoc myTextDoc = new TextDoc();
        myTextDoc.set_type("Book");
        assertEquals(myTextDoc.get_type(), "Book");

        assertThrows(IllegalArgumentException.class, () -> {
            myTextDoc.set_type("");
        });
    }

    @Test
    void set_pages() {
        TextDoc myTextDoc = new TextDoc();
        myTextDoc.set_pages(50);
        assertEquals(myTextDoc.get_pages(), 50);

        assertThrows(IllegalArgumentException.class, () -> {
            myTextDoc.set_pages(0);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            myTextDoc.set_pages(-1);
        });
    }


    // Тесты работы геттеров и выводы на экран
    @Test
    void get_name() {
        TextDoc myTextDoc = new TextDoc();
        myTextDoc.set_name("Акт списания товара");
        assertEquals("Акт списания товара", myTextDoc.get_name());

        TextDoc myTextDoc2 = new TextDoc();
        myTextDoc2.set_name("Договор купли продажи");
        assertEquals("Договор купли продажи", myTextDoc2.get_name());
    }

    @Test
    void get_author() {
        TextDoc myTextDoc = new TextDoc();
        myTextDoc.set_author("Авторов А. А.");
        assertEquals("Авторов А. А.", myTextDoc.get_author());

        TextDoc myTextDoc2 = new TextDoc();
        myTextDoc2.set_author("Забелин А. А.");
        assertEquals("Забелин А. А.", myTextDoc2.get_author());
    }

    @Test
    void get_type() {
        TextDoc myTextDoc = new TextDoc();
        myTextDoc.set_type("Акт");
        assertEquals("Акт", myTextDoc.get_type());

        TextDoc myTextDoc2 = new TextDoc();
        myTextDoc2.set_type("Доверенность");
        assertEquals("Доверенность", myTextDoc2.get_type());
    }

    @Test
    void get_pages() {
        TextDoc myTextDoc = new TextDoc();
        myTextDoc.set_pages(100);
        assertEquals(100, myTextDoc.get_pages());

        TextDoc myTextDoc2 = new TextDoc();
        myTextDoc2.set_pages(1);
        assertEquals(1, myTextDoc2.get_pages());
    }


    @Test
    void displayInfo() {
        TextDoc test1 = new TextDoc("Доверенность на право получения электронной подписи организации в удостоверяющем центре",
                                "Попов А. А.", 2, "Доверенность" );
        String s1 = "Name: " + test1.get_name() + "\nAuthor: " + test1.get_author() +
                "\nType: " + test1.get_type() + "\nPages: " + Integer.toString(test1.get_pages());
        Assertions.assertEquals(s1, test1.toString());

        TextDoc test2 = new TextDoc("Abstract",
                "Иванов И. И.", 50, "Abstract" );
        String s2 = "Name: Abstract\nAuthor: Иванов И. И.\nType: Abstract\nPages: 50";
        Assertions.assertEquals(s2, test2.toString());

        TextDoc test3 = new TextDoc("zzz", "zzz", 1, "zzz" );
        String s3 = "Name: zzz\nAuthor: zzz\nType: zzz\nPages: 1";
        Assertions.assertEquals(s3, test3.toString());
    }
}