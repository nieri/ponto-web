package br.com.munieri.ponto.web.model.email;

import br.com.munieri.ponto.web.model.pessoa.Pessoa;

import javax.persistence.*;

@Entity
@Table(name = "email")
public class Email {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_email", unique = true, nullable = false, columnDefinition="integer")
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_email")
    private TipoEmail tipoEmail;

    @Column(name = "descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name="id_pessoa")
    private Pessoa pessoa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoEmail getTipoEmail() {
        return tipoEmail;
    }

    public void setTipoEmail(TipoEmail tipoEmail) {
        this.tipoEmail = tipoEmail;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
