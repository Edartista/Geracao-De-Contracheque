package atividadeprática;
public class Dependente {
    
    protected Integer idade;

    public Dependente(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }
    
    public boolean MenorConcursado(int idade){
        if (idade <= 21){
            return true;
        } else
            return false;
    }
    
    public boolean MenorTemporário(int idade){
        if (idade <= 18){
            return true;
        } else
            return false;
    }
    
}
