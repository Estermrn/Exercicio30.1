package Model;
public class Funcionario {
    
    private String nome;
    private String cargo;
    private int idade;
    private String genero;

    public Funcionario() {
    }

    public Funcionario(String nome, String cargo, int idade, String genero) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
