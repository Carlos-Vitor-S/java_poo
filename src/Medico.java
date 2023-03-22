import java.util.ArrayList;
import java.util.Arrays;

public class Medico extends Main{

    private String nome;

    private int crm;
    private String dataNascimento;
    private String dataCadastro;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void cadastrarMedico(String nome, int crm, String dataNascimento, String dataCadastro){
        setNome(nome);
        setCrm(crm);
        setDataNascimento(dataNascimento);
        setDataCadastro(dataCadastro);

    }


}
