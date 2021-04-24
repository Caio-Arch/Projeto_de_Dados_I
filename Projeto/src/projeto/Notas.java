
package projeto;

/**
 *
 * @author Caio
 */
public class Notas {
    private String aluno;
    private double valor;
    
    public Notas(){
        
    }
    
    public Notas(String aluno, double valor){
        this.aluno = aluno;
        this.valor = valor;
    }
    
    public String getAluno() {
        return aluno;
    }
    public double getValor(){
        return valor;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
