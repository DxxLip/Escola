package domain;
import java.util.List;
public class Aluno {

private String matricula;
private Curso curso;
private String situacao;
private List<Avaliacao> avaliacoes;

    public void matricularCurso() {

    }

    public void trancar() {

    }

    public Aluno(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }

    public Aluno(String matricula, Curso curso, String situacao) {
        this.matricula = matricula;
        this.curso = curso;
        this.situacao = situacao;
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
    
}
