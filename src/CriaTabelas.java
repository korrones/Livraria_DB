import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaTabelas {
    private static final String URL = "jdbc:sqlite:livraria.db";

    public void criarTabelas() {
        try (Connection con = DriverManager.getConnection(URL)) {
            if (con != null) {
                Statement stmt = con.createStatement();
                String sqlAutor = """
                    CREATE TABLE IF NOT EXISTS autor (
                        id_autor INTEGER PRIMARY KEY AUTOINCREMENT,
                        nome TEXT NOT NULL,
                        nacionalidade TEXT
                    )
                    """;
                stmt.execute(sqlAutor);

                String sqlLivro = """
                    CREATE TABLE IF NOT EXISTS livro (
                        id_livro INTEGER PRIMARY KEY AUTOINCREMENT,
                        titulo TEXT NOT NULL,
                        ano INTEGER,
                        autor_id INTEGER,
                        FOREIGN KEY (autor_id) REFERENCES autor(id_autor)
                    )
                    """;
                stmt.execute(sqlLivro);

                System.out.println("Tabelas criadas com sucesso!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
