package model;

public class Funcionario {
    private String cargo;
    private String turno;
    private int salario;
    
    public Funcionario () {
        this("", "", 0);
    }
    
    public Funcionario(String cargo, String turno, int salario) {
        this.cargo = cargo;
        this.turno = turno;
        this.salario = salario;              
    }
    
    public String getCargo() {
        return cargo;
    }
    public void setCargo (String cargo) {
        this.cargo = cargo;
    }
    
    public String getTurno() {
        return turno;
    }
    public void setTurno (String turno) {
        this.turno = turno;
    }
    
    public int getSalario() {
        return salario;
    }
    public void setSalario (int salario) {
        this.salario = salario;
    }
}
