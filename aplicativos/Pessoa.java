package aplicativos;

public class Pessoa{
    
    //atributos
    private String nome;
    private int cpf; 

    //construtorres 
    public Pessoa() {

    }
    
    public Pessoa(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
    //métodos get e set
    public String getNome() {
        return nome; 
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
