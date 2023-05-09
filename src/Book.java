public class Book {

  private final String autor;
  private final String name;

  public Book(String autor, String name) {
    this.autor = autor;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getAutor() {
    return autor;
  }

}
