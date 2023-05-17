/**
 * Simple class "Text Documents"
 *
 * @author Arsentyeva N. V.
 */

package simpleclass.myfirstapp;

class TextDoc {
    private String name;            // имя документа
    private String author;          // автор
    private String type;            // тип
    private int pages;              // страницы

    // Конструктор по умолчанию
    TextDoc() {
        name = "Name";
        author = "Author";
        type = "abstract";
        pages = 0;
    }

    // Конструктор с параметрами
    TextDoc(String name1, String author1,  int pages1, String type1) {
        set_name(name1);
        set_author(author1);
        set_pages(pages1);
        set_type(type1);
    }

    // Функция принимает имя
    void set_name(String name1){
        // Проверка, что строка не пустая
        if (name1.equals("")) { throw new IllegalArgumentException("the name is undefined");}
        else {name = name1;}
    }

    // Функция принимает автора
    void set_author(String author1){
        if (author1.equals("")) { throw new IllegalArgumentException("the author is undefined");}
        else { author = author1; }
    }

    // Функция принимает тип документа
    void set_type(String type1){
        if (type1.equals("")) { throw new IllegalArgumentException("the type is undefined");}
        else { type = type1; }
    }

    // Принимает кол-во страниц
    void set_pages(int pages1){
        if ( pages1 <= 0 ) { throw new IllegalArgumentException("pages <= 0");}
        else { pages = pages1; }
    }

    // Возращение полей
    String get_name(){ return name; }
    String get_author(){ return author; }
    String get_type(){ return type; }
    int get_pages(){ return pages; }

    // Метод вывода информации в консоли
    public String toString(){
        return "Name: " + name + "\nAuthor: " + author + "\nType: " + type + "\nPages: " + Integer.toString(pages); }
}
