/*  EXERCICIO - 02 --- AULA 04 -- HERANÇA
    Considere a criação de uma hierarquia de classes para representar diferentes tipos de veículos.
    A classe base é Veiculo, que possui atributos como marca, modelo e ano. Em seguida, crie duas
    classes derivadas: Carro e Moto. O Carro deve ter um atributo adicional para o número de portas,
    enquanto a Moto deve ter um atributo adicional para indicar se é elétrica ou não.
    Implemente métodos construtores, getters e setters para cada classe, além de um método toString().  */

public class Veiculo {
    // atributos
    private String marca, modelo;
    private int ano;
    // construtor
    public Veiculo (String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    // getters
    public String getMarca(){return this.marca;}
    public String getModelo(){return this.modelo;}
    public int getAno(){return this.ano;}
    // setters
    public void setMarca (String ma){this.marca = ma;}
    public void setModelo (String mo){this.modelo = mo;}
    public void setAno (int a){this.ano = a;}
}

//SUBCLASSE CARRO
class Carro extends Veiculo {
    // atributos
    private int portas;

    // construtor
    public Carro (String marca, String modelo, int ano, int portas){
        super (marca, modelo, ano);
        this.portas = portas;}

    // getters e setters
    public int getPortas (){return this.portas;}
    public void setPortas(int p){this.portas = p;}

    // toStirng
    public String toString(){
        return "\nCarro, da marca:" + getMarca() + "\nModelo: " + getModelo() +
                "\nAno: " + getAno() + "\nNúmero de Portas: " + getPortas();}
}

//SUBCLASSE MOTO
class Moto extends Veiculo{
    // atributo
    public boolean eletrica;

    // construtor
    public Moto (String marca, String modelo, int ano, boolean eletrica){
        super(marca, modelo, ano);
        this.eletrica = eletrica;
    }

    // getters e setters
    public boolean getEletrica(){return this.eletrica;}
    public void setEletrica(boolean e){this.eletrica = e;}

    // toString
    public String toString (){
        return "\nMoto, da marca: " + getMarca() + "\nModelo:" + getModelo() +
                "\nAno: " + getAno() + "\nElétrica: " + getEletrica();
    }
}
