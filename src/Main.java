public class Main {
//  Создайте класс Book (книга), в конструктор которого передавайте автора и название книги.
//  Переопределите сравнение книг: книги считаются одинаковыми, если совпадают и название, и автор.

  public static void main(String[] args) {
    Book warAndPeace = new Book("Лев Толстой", "Война и Мир");
    Book idiot = new Book("Фёдор Достоевский", "Идиот");
    Book newIdiot = new Book("Фёдор Достоевский", "Идиот");
    String firstEquals = String.format("%s-\"%s\" и %s-\"%s\"", warAndPeace.getAutor(),
        warAndPeace.getName(), idiot.getAutor(), idiot.getName());
    if (warAndPeace.equals(idiot)) {
      System.out.printf("Книги (" + firstEquals + ") одинаковые");
    } else {
      System.out.println("Книги (" + firstEquals + ") не одинаковые");
    }
    String secondEquals = String.format("%s-\"%s\" и %s-\"%s\"", newIdiot.getAutor(),
        newIdiot.getName(), idiot.getAutor(), idiot.getName());
    if (newIdiot.equals(idiot)) {
      System.out.printf("Книги (" + secondEquals + ") одинаковые");
    } else {
      System.out.println("Книги (" + secondEquals + ") не одинаковые");
    }
  }
}
