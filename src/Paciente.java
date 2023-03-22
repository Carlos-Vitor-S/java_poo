public class Paciente {
    private int cpf;
    private String nome;
    private String dataNascimento;

    private  String dataCadastro;

    private String Endereço;

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

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String endereço) {
        Endereço = endereço;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void cadastrarPaciente(int cpf, String nome, String dataNascimento, String dataCadastro , String endereço){
        setCpf(cpf);
        setNome(nome);
        setDataNascimento(dataNascimento);
        setDataCadastro(dataCadastro);
        setEndereço(endereço);


    }



}
