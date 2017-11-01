package exemplos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class Exemplo1 {
    
    public static void main(String[] args) {

        //ContaCorrente[] contas = new ContaCorrente[3];
        
        List<ContaCorrente> contas = new ArrayList<ContaCorrente>();
        
        ContaCorrente c1 = new ContaCorrente();
        c1.setTitular(new Pessoa("Lucio"));
        c1.setAgencia(123);
        c1.setConta(12345);
        c1.setSaldo(600);
        
        ContaCorrente c2 = new ContaCorrente();
        c2.setTitular(new Pessoa("Serafim"));
        c2.setAgencia(123);
        c2.setConta(45678);
        c2.setSaldo(900);

        ContaCorrente c3 = new ContaCorrente();
        c3.setTitular(new Pessoa("Sobrinho"));
        c3.setAgencia(456);
        c3.setConta(12345);
        c3.setSaldo(1000);

        ContaCorrente c4 = new ContaCorrente();
        c4.setTitular(new Pessoa("Serafim"));
        c4.setAgencia(123);
        c4.setConta(45678);
        c4.setSaldo(900);
        
        contas.add(c4);
        contas.add(c3);
        contas.add(c2);
        contas.add(c1);
                
        System.out.println(contas.get(2));
                
    }
    
}
