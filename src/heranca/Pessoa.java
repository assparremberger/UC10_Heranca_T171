package heranca;

import javax.swing.JOptionPane;

public class Pessoa {
    public int codigo;
    public String nome;
    public String endereco;
    protected String telefone;
    private String foto;
    
    public void cadastrar(){
       
        String texto = "Nome: " + this.nome +
                "\nEndereço: " + this.endereco;
        JOptionPane.showMessageDialog(null, texto);
    }
}
