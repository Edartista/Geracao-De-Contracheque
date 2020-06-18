package atividadeprática;
public class FuncionárioTemporário extends Funcionário{

    public FuncionárioTemporário(Integer código, Integer tipo, Double salárioBase, Integer tempo, Dependente dependentes) {
        super(código, tipo, salárioBase, tempo, dependentes);
    }
    
    @Override
    public double salário(){
        return (tempo * 15) + salárioBase + (númeroDependentesMenores * 50);
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Funcionário com código %d, temporário (2), ", código));
        sb.append(String.format("com salário-base de R$%.2f e ", salário()));
        sb.append(tempo + " meses de contratação.");
        return sb.toString();
        }
      
    
}
