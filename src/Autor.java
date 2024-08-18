public class Autor {
    private int autorId;
    private String autorNome;
    private String autorNacionalidade;

    public Autor(int autorId, String autorNome, String autorNacionalidade) {
        this.autorId = autorId;
        this.autorNome = autorNome;
        this.autorNacionalidade = autorNacionalidade;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public String getAutorNome() {
        return autorNome;
    }

    public void setAutorNome(String autorNome) {
        this.autorNome = autorNome;
    }

    public String getAutorNacionalidade() {
        return autorNacionalidade;
    }

    public void setAutorNacionalidade(String autorNacionalidade) {
        this.autorNacionalidade = autorNacionalidade;
    }
}
