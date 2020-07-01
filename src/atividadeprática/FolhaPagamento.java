package atividadeprática;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        
        try{
        List <Funcionário> Colaboradores = new ArrayList<>();
     
        //Entrada inicial de dados:
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sistema de Pagamentos da Empresa Canguru Tech LTDA. "
                + "Para prosseguir, são necessárias algumas informações:");
        System.out.print("Quantos contracheques deseja gerar? ");
        int n = teclado.nextInt();
        
        //Coletando os dados dos colaboradores:
        
        for (int i=0; i<n; i++){
            System.out.println();
            System.out.printf("Dados do colaborador nº %d: \n", (i+1));
            System.out.print("Código do colaborador: ");
            int codigo = teclado.nextInt();
            System.out.print("Modalidade de contratação: \n"
                    + "1 para Concursado;\n"
                    + "2 para Temporário.\n");
            int tipo = teclado.nextInt();
            
            //Terminando o programa caso haja incoerência na entrada da modalidade::
            if (tipo < 1 || tipo > 2){
                System.out.println("Erro: modalidade não cadastrada.");
                System.exit(0);
            }
            
            System.out.print("Salário-base do colaborador: R$");
            double salarioBase = teclado.nextDouble();
            
            //Terminando o programa caso haja incoerência na entrada do salário-base:
            if(salarioBase <= 0){
                System.out.println("Erro: o valor do salário-base deve ser "
                        + "maior que R$00,00.");
                System.exit(0);
            }
            
            System.out.print("Tempo de atuação na empresa: ");
            int tempo = teclado.nextInt();
            
            //Terminando o programa caso haja incoerência na entrada do tempo.
            if(tempo <= 0){
                System.out.println("Erro: o tempo deve ser maior que zero(0).");
                System.exit(0);
            }
                        
            //Coletando dados dos dependentes de colaboradores concursados:
            if (tipo == 1){ 
                System.out.print("Número de dependentes que o colaborador possui "
                        + "[máx. 5]: ");
                int Ndependentes = teclado.nextInt();
                
                Integer[] vetDependentesC = new Integer[Ndependentes];
                
                //Coletando as idades dos dependentes e armazenando em um vetor:
                if (Ndependentes > 0 && Ndependentes < 6){
                    for (int dc = 0; dc < Ndependentes; dc ++){
                        System.out.printf("Idade do dependente %d: ", dc+1);
                        int idadeDependenteC = teclado.nextInt();
                        vetDependentesC[dc] = idadeDependenteC;
                    }
                }
                //Terminando o programa caso haja incoerência na entrada dos dependentes:
                else if (Ndependentes >= 5){
                    System.out.println("Erro: o limite máximo de dependentes é 5.");
                    System.exit(0);
                }
                //Instanciando o colaborador concursado na lista Colaboradores:
                Colaboradores.add(new FuncionárioConcursado(codigo, tipo, 
                        salarioBase, tempo, vetDependentesC)); 
            } 
            //Coletando dados dos dependentes de colaboradores temporários:
            else if(tipo == 2){
                System.out.print("Número de dependentes que o colaborador possui "
                        + "[máx. 5]: ");
                int Ndependentes = teclado.nextInt();
                
                Integer[] vetDependentesT = new Integer[Ndependentes];
                
                //Coletando as idades dos dependentes e armazenando em um vetor:
                if (Ndependentes > 0){
                    for (int dt = 0; dt < Ndependentes; dt ++){ 
                        System.out.print("Idade do dependente: ");
                        int idadeDependenteT = teclado.nextInt();
                        Dependente dependente = new Dependente (idadeDependenteT);
                        vetDependentesT[dt] = idadeDependenteT;
                    } 
                }
                //Terminando o programa caso haja incoerência na entrada dos dependentes:                
                else if (Ndependentes >= 5){
                    System.out.println("Erro: o limite máximo de dependentes é 5.");
                    break;
                }
                //Instanciando o colaborador temporário na lista Colaboradores:
                Colaboradores.add(new FuncionárioTemporário(codigo, tipo, 
                        salarioBase, tempo, vetDependentesT));
            }
        } //Término da coleta de dados dos funcionários.
        
        System.out.println();
        System.out.println("CONTRACHEQUES:\n");
        
        //Imprimindo o contracheque dos colaboradores de maneira unificada:
        for (Funcionário c : Colaboradores){ 
                System.out.println(c);   
        }    
    }//Término do bloco try.
        
        //Tratamento de Exceções
        catch (InputMismatchException e){
            System.out.println("ERRO: favor informar um valor numérico válido.");
        }
        catch (NegativeArraySizeException e){
            System.out.println("Erro: o número mínimo de dependentes deve ser 0.");        
        }
    }
}
