package domain;

public class Fucionario {
    private String nome;
    private String email;
    private Fucionario gerente;
    
    public Fucionario(String nome, String email, Fucionario gerente) {
        this.nome = nome;
        this.email = email;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Fucionario getGerente() {
        return gerente;
    }

    public void setGerente(Fucionario gerente) {
        this.gerente = gerente;
    }
    
}
