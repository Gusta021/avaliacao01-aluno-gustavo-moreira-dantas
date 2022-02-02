package aplicativos;

public class Aeronave {

    //atributos
    private String modelo;
    private String categoria;
    private Piloto p1;

    //construtores
    public Aeronave() {

    }
    
    public Aeronave(String modelo, String categoria, Piloto p1) {
        this.modelo = modelo;
        this.categoria = categoria;
        this.p1 = p1;
    }

    //métodos
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
