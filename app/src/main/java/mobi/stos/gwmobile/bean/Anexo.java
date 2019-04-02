package mobi.stos.gwmobile.bean;

import java.io.Serializable;

import mobi.stos.gwmobile.enumm.Situacao;
import mobi.stos.podataka_lib.annotations.Column;
import mobi.stos.podataka_lib.annotations.Entity;
import mobi.stos.podataka_lib.annotations.ForeignKey;
import mobi.stos.podataka_lib.annotations.PrimaryKey;

@Entity
public class Anexo implements Serializable {

    @PrimaryKey(autoIncrement = false)
    private int id;

    @Column
    private Situacao situacaoEnum;

    @ForeignKey(nullable = false)
    private Documento documento;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Situacao getSituacaoEnum() {
        return situacaoEnum;
    }

    public void setSituacaoEnum(Situacao situacaoEnum) {
        this.situacaoEnum = situacaoEnum;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }
}
