package domain;
import java.util.List;
public class Turma {

    private Integer ano;
    private Integer semestre;
    private Integer diasSemana;
    private String horarios;
    private List<Avaliacao> avaliacoes;

    public void abrirTurma() {

    }

    public void alocarProfessor() {

    }

    public Turma(Integer ano, Integer semestre, Integer diasSemana, String horarios, List<Avaliacao> avaliacoes) {
        this.ano = ano;
        this.semestre = semestre;
        this.diasSemana = diasSemana;
        this.horarios = horarios;
        this.avaliacoes = avaliacoes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getSemestre() {
        return semestre;
    }

    public void setSemestre(Integer semestre) {
        this.semestre = semestre;
    }

    public Integer getDiasSemana() {
        return diasSemana;
    }

    public void setDiasSemana(Integer diasSemana) {
        this.diasSemana = diasSemana;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
    
}
