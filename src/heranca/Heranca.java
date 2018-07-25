
package heranca;

import javax.swing.JOptionPane;

public class Heranca {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.nome = JOptionPane.showInputDialog
              ("Digite o nome da pessoa:");
        
        p.endereco = JOptionPane.showInputDialog
              ("Digite o endereço da pessoa " + p.nome + ":");
        p.cadastrar();
        
        PessoaFisica pf = new PessoaFisica();
        pf.nome = "Pablo";
        pf.cpf = "000.111.222-33";
        pf.endereco = "Rua B, 150";
        pf.cadastrar();
        
        
    }
    
}
