package atividadeprática;
public class FuncionárioConcursado extends Funcionário {

    public FuncionárioConcursado(Integer código, Integer tipo, Double salárioBase, Integer tempo, Integer[] idades) {
        super(código, tipo, salárioBase, tempo, idades);
    }
    
    @Override
    public double salário(){
        double salario = (tempo * 200) + salárioBase;
        for (int i=0; i<idades.length; i++){
            if (idades[i] <21){
                salario += 100;
            }
        }
        return salario;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("ID: %d %n", código));
        sb.append(String.format("Ingressou na empresa há %d anos.%n", tempo));
        sb.append(String.format("Remuneração mensal: R$%.2f. %n", salário()));
        return sb.toString();
        }
}