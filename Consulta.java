
import java.time.LocalDate;

public class Consulta {
   private Medico medico; //associa as classes, referência ao obj Medico
   private Paciente paciente; //associa as classes, referência ao obj Paciente
   private LocalDate dataHora; 
   private String descricao;

   //construtor
   public Consulta(Medico medico, Paciente paciente, LocalDate dataHora, String descricao) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.descricao = descricao;
    }

    //getters. ñ usaremos setters p/ evitar alterações indesejadas
    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void exibirDetalhes(){
        System.out.println("Paciente: " + paciente.getNome() + " - " + "CPF: " + paciente.getCpf());
        System.out.println("Consulta marcadas para: " + dataHora);
        System.out.println("Médico: " + medico.getNome() + " - " + medico.getEspecialidade());
        System.out.println("Descrição: " + descricao);

    }  
}
