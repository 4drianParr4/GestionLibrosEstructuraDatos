public class LibrosObj {
    private String Isbn;
    private String Titulo;
    private String Autor;
    private String AnoPublic;

    
    public LibrosObj(String isbn, String titulo, String autor, String anoPublic) {
        Isbn = isbn;
        Titulo = titulo;
        Autor = autor;
        AnoPublic = anoPublic;
    }


    public String getIsbn() {
        return Isbn;
    }


    public void setIsbn(String isbn) {
        Isbn = isbn;
    }


    public String getTitulo() {
        return Titulo;
    }


    public void setTitulo(String titulo) {
        Titulo = titulo;
    }


    public String getAutor() {
        return Autor;
    }


    public void setAutor(String autor) {
        Autor = autor;
    }


    public String getAnoPublic() {
        return AnoPublic;
    }


    public void setAnoPublic(String anoPublic) {
        AnoPublic = anoPublic;
    }

    
}
