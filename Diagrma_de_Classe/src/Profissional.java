public class Profissional {
    private Long id;
    private String nome;
    private String registroConselho;
    private String telefone;
    private String email;

    private Unidade unidade;
    private Especialidade especialidade;
    private Usuario usuario;

    public Profissional() {
    }

    public Profissional(Long id, String nome, String registroConselho, String telefone, String email, Unidade unidade, Especialidade especialidade, Usuario usuario) {
        this.id = id;
        this.nome = nome;
        this.registroConselho = registroConselho;
        this.telefone = telefone;
        this.email = email;
        this.unidade = unidade;
        this.especialidade = especialidade;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistroConselho() {
        return registroConselho;
    }

    public void setRegistroConselho(String registroConselho) {
        this.registroConselho = registroConselho;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Unidade getUnidade() {
        return unidade;
    }

    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }

    public Especialidade getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(Especialidade especialidade) {
        this.especialidade = especialidade;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}