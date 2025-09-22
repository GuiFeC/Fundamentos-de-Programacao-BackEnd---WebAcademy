import java.util.Date;

public class Atendimento {
    private Long id;
    private Date data;
    private Date hora;
    private double valor;
    private String status;
    private String observacao;
    
    private Paciente paciente;
    private Profissional profissional;
    private Convenio convenio;

    public Atendimento() {
    }

    public Atendimento(Long id, Date data, Date hora, double valor, String status, String observacao, Paciente paciente, Profissional profissional, Convenio convenio) {
        this.id = id;
        this.data = data;
        this.hora = hora;
        this.valor = valor;
        this.status = status;
        this.observacao = observacao;
        this.paciente = paciente;
        this.profissional = profissional;
        this.convenio = convenio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }
}