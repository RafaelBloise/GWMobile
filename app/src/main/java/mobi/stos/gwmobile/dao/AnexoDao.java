package mobi.stos.gwmobile.dao;

import android.content.Context;

import mobi.stos.gwmobile.bean.Anexo;
import mobi.stos.podataka_lib.repository.AbstractRepository;

public class AnexoDao extends AbstractRepository<Anexo> {
    public AnexoDao(Context context) {
        super(context, Anexo.class);
    }
}
