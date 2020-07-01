package atividadeprática;
public class FuncionárioTemporário extends Funcionário{

    public FuncionárioTemporário(Integer código, Integer tipo, Double salárioBase, Integer tempo, Integer[] idades) {
        super(código, tipo, salárioBase, tempo, idades);
    }
    
    @Override
    public double salário(){
        double salario = (tempo * 15) + salárioBase;
        for (int i=0; i<idades.length; i++){
            if (idades[i] <18){
                salario += 50;
            }
        }
        return salario;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("ID: %d %n", código));
        sb.append(String.format("Ingressou na empresa há %d meses. %n", tempo));
        sb.append(String.format("Remuneração mensal: R$%.2f. %n", salário()));
        return sb.toString();
        }
      
    
}
