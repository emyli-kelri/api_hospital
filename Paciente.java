import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa{
    private String convenio;
    private List<String> historicoMedico; //armazena registros do histórico
    
    //construtor
    public Paciente(String nome, int idade, String endereco, String cpf, String email, String telefone, String convenio, String historicoMedico){
        super(nome, idade, endereco, cpf, email, telefone); // super classe
        this.convenio = convenio;
        this.historicoMedico =  new ArrayList<>(); // inicializa histórico médico em uma lista vazia 
    }

    //getter e setter
    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public List<String> getHistoricoMedico() {
        return historicoMedico;
    } //não criaremos um setter porq isso permitiria a substituição toda da lista original, como queremos todos os registros, essa ação poderia ser problemática

    public void adicionarHistorico(String registro) { //método p/ adicionar um registro ao histórico
        historicoMedico.add(registro);
    }

    @Override //mesmos parâmetros
    public void mostrarDetalhes() {
        super.mostrarDetalhes();
        System.out.println("Convênio: " + convenio);
        System.out.println("Histórico Médico: " + historicoMedico);
    }

}

    

   
    

