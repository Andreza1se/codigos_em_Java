public class Carro {
    private String marca = "Fiat", cor = "branco";
    private int placa = 00000, velocidade = 0, marcha = 0;

    public Carro(String marca, String cor, int placa, int velocidade, int marcha ){
        this.marca = marca;
        this.cor = cor;
        this.placa = placa;
        this.velocidade = velocidade;
        this.marcha = marcha;
    }

    void acelerarCarro(int acelera){
        velocidade = velocidade + acelera;
    }//acelera o carro

    void freiarCarro(int freia){
        velocidade = velocidade - freia;
    }//freia o carro

    void mudarMarcha(int passarMarcha){
        marcha = passarMarcha;
    }//passa a marcha do carro

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
}