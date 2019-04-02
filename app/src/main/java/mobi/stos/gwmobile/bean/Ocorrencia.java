package mobi.stos.gwmobile.bean;

import java.io.Serializable;


import mobi.stos.podataka_lib.annotations.Column;
import mobi.stos.podataka_lib.annotations.Entity;
import mobi.stos.podataka_lib.annotations.PrimaryKey;

@Entity
public class Ocorrencia implements Serializable {

    @PrimaryKey(autoIncrement = false)
    private int id;

    @Column
    private String nome;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
