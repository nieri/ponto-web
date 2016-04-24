package br.com.munieri.ponto.web.model.telefone;

import br.com.munieri.ponto.web.model.pessoa.Pessoa;

import javax.persistence.*;

@Entity
@Table(name = "telefone")
public class Telefone {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id_telefone", unique = true, nullable = false, columnDefinition="integer")
    private long id;

    @Column(name = "tipo_telefone")
    @Enumerated(EnumType.STRING)
    private TipoTelefone tipoTelefone;

    @Column(name = "ddd_telefone")
    private int ddd;

    @Column(name = "numero_telefone")
    private int numero;

    @ManyToOne
    @JoinColumn(name="id_pessoa")
    private Pessoa pessoa;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
