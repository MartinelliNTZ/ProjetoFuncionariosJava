/**
 * @author Matheus Martinelli
 * 07-12-2022
 */
public class Funcionario {
    private int id;
    private String nome;
    private float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, float salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
