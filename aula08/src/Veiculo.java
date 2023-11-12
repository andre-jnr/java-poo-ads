public class Veiculo {

  private String modelo;
  private String marca;
  private Integer ano;
  private Double valor;

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  // pegar ou buscar
  public String getModelo() {
    return modelo;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public Integer getAno() {
    return ano;
  }

  public void setAno(Integer ano) {
    this.ano = ano;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }
}
