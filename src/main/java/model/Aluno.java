package model;

public class Aluno {
    private String nome;
    private int matricula;
    private int plano;
    
    public Aluno () {
        this("", 0, 0);
    }
    
    public Aluno (String nome, int matricula, int plano) {
        this.nome = nome;
        this.matricula = matricula;
        this.plano = plano;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome (String nome) {
        this.nome = nome;
    }
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula (int matricula) {
        this.matricula = matricula;
    }
    
    public int getPlano() {
        return plano;
    }
    public void setPlano (int plano) {
        this.plano = plano;
    }
}
