package exemplos;

public class Exemplo1 {
    
    public static void main(String[] args) {

        Pessoa p = new Pessoa("Pedro Augusto", 25, 'M', 1.78, 75.9);
        
        Pessoa p2 = new Pessoa("Lucio");
        
        p.setNome("Vinicius");
        
        System.out.println(p.getNome());
                
    }
    
}
