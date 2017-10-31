package exemplos;

public class Pessoa {

    private String nome;
    private Integer idade;
    private Character sexo;
    private Double altura;
    private Double peso;
    
    public Pessoa() {}
    
    public Pessoa(String nome) {
        this.nome = nome;
    }
    
    public Pessoa(String nome, Integer idade, Character sexo, Double altura, Double peso) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Character getSexo() {
        return sexo;
    }

    public Double getAltura() {
        return altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString() {
        return "Pessoa{nome: " + nome + ", idade: " + idade + "}";
    }
    
}
