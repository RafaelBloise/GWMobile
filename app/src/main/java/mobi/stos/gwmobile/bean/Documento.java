package mobi.stos.gwmobile.bean;

import java.io.Serializable;


import mobi.stos.gwmobile.enumm.TipoDocumento;
import mobi.stos.podataka_lib.annotations.Column;
import mobi.stos.podataka_lib.annotations.Entity;
import mobi.stos.podataka_lib.annotations.ForeignKey;
import mobi.stos.podataka_lib.annotations.PrimaryKey;

@Entity
public class Documento implements Serializable {

    @PrimaryKey(autoIncrement = false)
    private int id;

    @ForeignKey(nullable = false)
    private Ocorrencia ocorrencia;

    @Column
    private String observacao;

    @Column
    private TipoDocumento tipoDocumento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ocorrencia getOcorrencia() {
        return ocorrencia;
    }

    public void setOcorrencia(Ocorrencia ocorrencia) {
        this.ocorrencia = ocorrencia;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
