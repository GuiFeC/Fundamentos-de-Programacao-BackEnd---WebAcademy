package diagrama_clases;

import java.util.Date;

    public class paciente {
        public class Paciente {
        private long id;
        private String nome;
        private String email;
        private String telefone;
        private Date dataNascimento;
        private String grupoSanguineo;
        private String sexo;
        private String cep;
        private String endereco;
        private String cidade;
        private String estado;

    public long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }
    public String getSexo() {
        return sexo;
    }
    public String getCep() {
        return cep;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
}
}
