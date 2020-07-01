package atividadeprática;
public abstract class Funcionário {

    protected Integer código;
    protected Integer tempo;
    protected Integer tipo;
    protected Double salárioBase;
    protected Integer[] idades;

    public Funcionário(Integer código, Integer tipo, Double salárioBase, Integer tempo, Integer[] idades) {
        this.código = código;
        this.tempo = tempo;
        this.tipo = tipo;
        this.salárioBase = salárioBase;   
        this.idades = idades;
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

    public abstract double salário();
    
    
    public String toString(){
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }
}
