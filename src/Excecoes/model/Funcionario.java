package Excecoes.model;

public class Funcionario {
    private String nome;
    private static long id = 1111;
    private final String matricula;

    Funcionario(){
        this.matricula = String.valueOf(id);
        id++;
    }

    public static Funcionario from(String nome){
        Funcionario f = new Funcionario();
        f.setNome(nome);
        return f;
    }

    @Override
    public String toString() {
        return "Funcionario " + this.nome + ". Matricula: " + this.matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }
}
