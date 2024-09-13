public class Professor extends Pessoa {

    private String titulacaoMaxima;

    public Professor(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }

    public void cadastrar(){
        
    }

    public String getTitulacaoMaxima() {
        return titulacaoMaxima;
    }

    public void setTitulacaoMaxima(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }
}
