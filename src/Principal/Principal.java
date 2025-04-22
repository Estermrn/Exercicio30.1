package Principal;

import Model.Aluno;
import Model.Funcionario;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        //Aluno:
        JOptionPane.showMessageDialog(null, "Aluno");
        Aluno aluno1 = new Aluno("Ester", 1234, 20, 60, 1.63);

        JOptionPane.showMessageDialog(null, "Nome: " + aluno1.getNome());
        JOptionPane.showMessageDialog(null, "Id: " + aluno1.getId());
        JOptionPane.showMessageDialog(null, "Idade: " + aluno1.getIdade());
        JOptionPane.showMessageDialog(null, "Peso: " + aluno1.getPeso());
        JOptionPane.showMessageDialog(null, "Altura: " + aluno1.getAltura());

        //Funcionario:
        JOptionPane.showMessageDialog(null, "Funcionário");
        Funcionario funcionario1 = new Funcionario("Rodrigo", "Personal", 42, "Masculino");

        JOptionPane.showMessageDialog(null, "Nome do funcionário: " + funcionario1.getNome());
        JOptionPane.showMessageDialog(null, "Cargo: " + funcionario1.getCargo());
        JOptionPane.showMessageDialog(null, "Idade: " + funcionario1.getIdade());
        JOptionPane.showMessageDialog(null, "Gênero: " + funcionario1.getGenero());

    }
}
