package atividadeprática;
public class FuncionárioConcursado extends Funcionário {

    public FuncionárioConcursado(Integer código, Integer tipo, Double salárioBase, Integer tempo, Dependente dependentes) {
        super(código, tipo, salárioBase, tempo, dependentes);
    }
    
    @Override
    public double salário(){
        
        return (tempo * 200) + salárioBase + (númeroDependentesMenores * 100);    
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Funcionário com código %d, concursado (1), ", código));
        sb.append(String.format("com salário-base de R$%.2f e ", salário()));
        sb.append(tempo + " anos de contratação.");
        return sb.toString();
        }
}