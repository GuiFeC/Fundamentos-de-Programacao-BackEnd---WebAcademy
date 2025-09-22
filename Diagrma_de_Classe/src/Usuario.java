public class Usuario {
    private Long id;
    private String nomeCompleto;
    private String nomeUsuario;
    private String senha;
    private Boolean ativo;
    private String papel;

    // Construtor
    public Usuario(Long id, String nomeCompleto, String nomeUsuario, String senha, Boolean ativo, String papel) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.ativo = ativo;
        this.papel = papel;
    }
}