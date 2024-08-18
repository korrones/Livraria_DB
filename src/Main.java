import java.util.List;

public class Main {
    public static void main(String[] args) {
        CriaTabelas criaTabelas = new CriaTabelas();
        criaTabelas.criarTabelas();

        AutorDAO autorDAO = new AutorDAO();
        LivroDAO livroDAO = new LivroDAO();

        Autor autor = new Autor(0, "Guillermo del Toro", "Mexicano");
        autorDAO.inserirAutor(autor);

        Livro livro = new Livro(0, "O Labirinto do Fauno", 2019, 1);
        livroDAO.inserirLivro(livro);

        List<Autor> autores = autorDAO.listarAutores();
        for (Autor a : autores) {
            System.out.println("Autor: " + a.getAutorNome());
        }

        List<Livro> livros = livroDAO.listarLivrosPorAutor(1);
        for (Livro l : livros) {
            System.out.println("Livro: " + l.getTitulo());
        }
    }
}
