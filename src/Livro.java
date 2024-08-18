public class Livro {
    private int idLivro;
    private String titulo;
    private int ano;
    private int autorId;

    public Livro(int idLivro, String titulo, int ano, int autorId) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.ano = ano;
        this.autorId = autorId;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public int getAutorId() {
        return autorId;
    }

    // Setters
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }
}
