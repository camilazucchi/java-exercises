package Classes;

public class Pessoa {
    // a classe é composta por atributos e métodos!
    // atributos:
    private double peso;
    private double altura;

    public Pessoa(double peso, double altura) {
        /* this: acessar o atributo peso! */
        this.peso = peso;
        this.altura = altura;
    }

    // métodos:
    // ação: calcular o seu imc.
    public double calcularIMC() {
        double imc = peso / (altura * altura);
        return imc;
    }

    // métodos acessores:
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }
}