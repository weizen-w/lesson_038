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

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Book book)) {
      return false;
    }
    return autor.equals(book.getAutor()) && name.equals(book.getName());
  }

  @Override
  public int hashCode() {
    return autor.hashCode() + name.hashCode();
  }
}
