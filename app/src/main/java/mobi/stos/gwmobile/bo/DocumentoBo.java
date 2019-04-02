package mobi.stos.gwmobile.bo;

import android.content.Context;

import mobi.stos.gwmobile.bean.Documento;
import mobi.stos.gwmobile.dao.DocumentoDao;
import mobi.stos.podataka_lib.interfaces.IOperations;
import mobi.stos.podataka_lib.service.AbstractService;

public class DocumentoBo extends AbstractService<Documento> {


      private DocumentoDao dao;

    public DocumentoBo(Context context){
        super();
        this.dao= new DocumentoDao(context);

    }

      @Override
    protected IOperations<Documento> getDao() {
        return dao;
    }


}
