public class Paciente {
    private int cpf;
    private String nome;

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

    public void cadastrarPaciente(int cpf, String nome){
        setCpf(cpf);
        setNome(nome);

    }
}
