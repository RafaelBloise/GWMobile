package mobi.stos.gwmobile.dao;

import android.content.Context;

import mobi.stos.gwmobile.bean.Documento;
import mobi.stos.podataka_lib.repository.AbstractRepository;

public class DocumentoDao extends AbstractRepository<Documento> {
    public DocumentoDao(Context context) {
        super(context, Documento.class);
    }
}
