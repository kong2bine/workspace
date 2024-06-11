package class_basic;
//2024.6.11 1교시 끝자락~2교시
public class Book {
    String title;
    String writer;
    int price;

    public Book(){
        title = "";
        writer = "";
        price = 0;
    }

    //생성자 자동 생성 : 마우스 우측->generate->constructor
    public Book(String title, String writer, int price) {
        this.title = title;
        this.writer = writer;
        this.price = price;
    }
}