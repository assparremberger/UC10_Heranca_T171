package heranca;

import javax.swing.JOptionPane;

public class PessoaFisica extends Pessoa{
    public String cpf;

    @Override
    public void cadastrar() {
       String texto = "Nome: " + this.nome +
                   "\nEndereço: " + this.endereco + 
                   "\nCPF: " + this.cpf;
        JOptionPane.showMessageDialog(null, texto);
        
    }
    
}
