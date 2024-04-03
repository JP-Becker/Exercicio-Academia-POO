package principal;
import javax.swing.JOptionPane;
import model.Aluno;
import model.Funcionario;

public class AcademiaPrincipal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Funcionario func = new Funcionario();
        
//        aluno.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
//        aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Digite a matricula: ")));
//        aluno.setPlano(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do plano (1 a 5): ")));
//        
//        JOptionPane.showMessageDialog(null, "Nome: " + aluno.getNome() + "\nMatricula: " + aluno.getMatricula() + "\nPlano: " + aluno.getPlano());
        
        func.setCargo(JOptionPane.showInputDialog("Digite o cargo do funcionário: "));
        func.setTurno(JOptionPane.showInputDialog("Digite o turno que ele/ela trabalha: "));
        func.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Digite o salário: ")));
        
        JOptionPane.showMessageDialog(null, "Cargo: " + func.getCargo() + "\nTurno: " + func.getTurno() + "\nSalário: R$" + func.getSalario());
    }
}
