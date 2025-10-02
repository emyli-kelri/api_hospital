public class Medico extends Pessoa{
    private String especialidade;
    private String CRM;

    // construtor da classe Medico
    public Medico(String nome, int idade, String endereco, String cpf, String email, String telefone, String especialidade, String CRM) {
        super(nome, idade, endereco, cpf, email, telefone); // Chama o construtor da classe Pessoa com os parâmetros corretos
        this.especialidade = especialidade;
        this.CRM = CRM;
    }
 
    //getters e setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String cRM) {
        CRM = cRM;
    }

    @Override //parâmetros ==
    public void mostrarDetalhes(){
        super.mostrarDetalhes(); //método da super classe 
        System.out.println("Especialidade: " + especialidade);
        System.out.println("CRM: " + CRM);
    }

    
}
