package atividadeprática;
public abstract class Funcionário {

    protected Integer código;
    protected Integer tempo;
    protected Integer tipo;
    protected Double salárioBase;
    protected Dependente dependentes;
    protected Integer númeroDependentesMenores;

    public Funcionário(Integer código, Integer tipo, Double salárioBase, Integer tempo, Dependente dependentes) {
        this.código = código;
        this.tempo = tempo;
        this.tipo = tipo;
        this.salárioBase = salárioBase;   
        this.dependentes = dependentes;
    }

    public Double getSalárioBase() {
        return salárioBase;
    }

    public Integer getCódigo() {
        return código;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public Dependente getDependente() {
        return dependentes;
    }

    public void setDependente(Dependente dependente) {
        this.dependentes = dependente;
    }

    public Integer getNúmeroDependentesMenores() {
        return númeroDependentesMenores;
    }

    public void setNúmeroDependentesMenores(Integer númeroDependentesMenores) {
        this.númeroDependentesMenores = númeroDependentesMenores;
    }

    public int dependenteMenorConcursado(boolean validação){
        if (dependentes.dependenteMenorConcursado(dependentes.idade) == true){
            númeroDependentesMenores += 1;
        }
        return númeroDependentesMenores;
    }
    
    public int dependenteMenorTemporário(boolean validação){
        if (dependentes.dependenteMenorTemporário(dependentes.idade) == true){
            númeroDependentesMenores += 1;
        }
        return númeroDependentesMenores;
    }
    
    public double salário(){
        return 0;
    }
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }
}
