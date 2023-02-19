import java.util.Objects;

public class Book {
    private final Author authorName;
    private final String bookName;
    private int yearPublicationBook;

    public Book(Author authorName, String bookName, int yearPublicationBook) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.yearPublicationBook = yearPublicationBook;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authorName=" + authorName +
                ", bookName='" + bookName + '\'' +
                ", yearPublicationBook=" + yearPublicationBook +
                '}';
    }

    public int getYearPublicationBook() {
        return yearPublicationBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublicationBook == book.yearPublicationBook && Objects.equals(authorName, book.authorName) && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName, yearPublicationBook);
    }

    public void setYearPublicationBook(int yearPublicationBook) {
        this.yearPublicationBook=yearPublicationBook;
    }
    /*Создайте класс Book, который содержит в себе данные о названии, авторе и годе публикации книги. Типы полей должны быть String, Author (его мы создадим в п. 2) и int.
    Напишите конструкторы для обоих классов, заполняющие все поля.
    Создайте геттеры для всех полей автора и всех полей книги.
    Создайте сеттер для поля «Год публикации» у книги.
    В методе main создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор» (достаточно тоже двух) и инициализируйте их. Учтите, что авторы являются обязательными и книги не могут создаваться без авторов.
    Метод main не должен находиться в классах Book и Author.
    Создайте отдельный класс для запуска приложения и объявите метод main в нем.
    В том же методе main измените год публикации одной из книг с помощью сеттера.*/

}
