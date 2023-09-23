package encapsulamento;

public class Carro {
    private String modelo;
    private String marca;
    private Double valor;
    private Integer ano;
    
    // Adicionar ou alterar a informação
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    // Retornar a informação
    public String getModelo() {
        return modelo;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getMarca() {
        return marca;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public Double getValor() {
        return valor;
    }
    
    public void setAno(Integer ano) {
        this.ano = ano;
    }
    
    public Integer getAno() {
        return ano;
    }
}
