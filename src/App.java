public class App {
    public static void main(String[] args) {
        Author steveMcConnell = new Author("Steve", "McConnell");
        Book codeComplete = new Book(steveMcConnell, "codeComplete", 1993);
        Book codeComplete2 = new Book(steveMcConnell, "codeComplete", 1993);
        System.out.println("codeComplete.bookName = " + codeComplete.getBookName());
        System.out.println("codeComplete.authorName = " + codeComplete.getAuthorName().getFirstNameAuthor() + codeComplete.getAuthorName().getSurnameAuthor());
        System.out.println("codeComplete.yearPublicationBook = " + codeComplete.getYearPublicationBook());
        codeComplete.setYearPublicationBook(2023);
        System.out.println("cleanCode.yearPublicationBook = " + codeComplete.getYearPublicationBook());
        Author robertMartin = new Author("Robert", "Martin");
        Book cleanCode = new Book(robertMartin, "cleanCode", 2008);
        System.out.println("cleanCode.bookName = " + cleanCode.getBookName());
        System.out.println("cleanCode.authorName = " + cleanCode.getAuthorName().getFirstNameAuthor() + cleanCode.getAuthorName().getSurnameAuthor());
        System.out.println("cleanCode.yearPublicationBook = " + cleanCode.getYearPublicationBook());
        System.out.println(cleanCode);
        System.out.println(cleanCode.equals(codeComplete));
        System.out.println(cleanCode.equals(cleanCode));
        System.out.println(codeComplete.equals(codeComplete2));

    }
}