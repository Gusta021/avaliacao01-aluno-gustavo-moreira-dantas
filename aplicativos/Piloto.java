package aplicativos;

public class Piloto extends Pessoa{
    
    //atributos
    private String breve;
    private int matricula;
    private Aeronave Nave;

    //construtores
    public Piloto() {

    }
    public Piloto(String breve, int matricula) {
        this.breve = breve;
        this.matricula = matricula; 
    }
    
    //métodos
    public String getBreve() {
        return breve;
    }
    public void setBreve(String breve) {
        this.breve = breve;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
