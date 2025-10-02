
public class Pessoa { //classe mãe 
    private String nome;
    private int idade;
    private String endereco;
    private String cpf;
    private String email;
    private String telefone;

    //construtor dos objetos
    public Pessoa(String nome, int idade, String endereco, String cpf, String email, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    //getters e setters 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //método
    public void mostrarDetalhes(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);
    }

}