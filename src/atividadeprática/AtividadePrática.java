package atividadeprática;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtividadePrática {
    public static void main(String[] args) {
        
        List <Funcionário> listaFuncionários = new ArrayList<>();
     
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Quantos contracheques deseja gerar? ");
        int n = teclado.nextInt();
        
        for (int i=0; i<n; i++){
            System.out.print("Código do funcionário: ");
            int codigo = teclado.nextInt();
            System.out.println("Modalidade de contratação \n"
                    + "1 - Concursado.\n"
                    + "2 - Temporário.\n");
            int tipo = teclado.nextInt();
            System.out.print("Salário-base: R$");
            double salarioBase = teclado.nextDouble();
            System.out.print("Quanto tempo de contratação? ");
            int tempo = teclado.nextInt();
            
            if (tipo == 1){
                System.out.println("Quantos dependentes você possui?");
                int dependentes = teclado.nextInt();
                if (dependentes > 0){
                    
                    for (int d=0; d<dependentes; d++){
                       
                        System.out.print("Idade do dependente: ");
                        int idadeDependente = teclado.nextInt();
                        Dependente dependente = new Dependente (idadeDependente);
                        listaFuncionários.add(new FuncionárioConcursado(codigo, tipo, salarioBase, tempo, dependente)); 
                    }
                }
            } else if(tipo == 2){
                System.out.println("Quantos dependentes você possui?");
                int dependentes = teclado.nextInt();
                if (dependentes > 0){
                    System.out.print("Idade do dependente: ");
                    int idadeDependente = teclado.nextInt();
                listaFuncionários.add(new FuncionárioTemporário(codigo, tipo, salarioBase, tempo, new Dependente(idadeDependente)));
            }        
            }
        }
        
        System.out.println();
        System.out.println("CONCURSADOS: ");
        for (Funcionário c : listaFuncionários){ 
                System.out.println(c);
            
        }
    }
}

