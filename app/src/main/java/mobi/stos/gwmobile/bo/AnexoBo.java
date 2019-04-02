package mobi.stos.gwmobile.bo;

import android.content.Context;

import mobi.stos.gwmobile.bean.Anexo;
import mobi.stos.gwmobile.dao.AnexoDao;
import mobi.stos.podataka_lib.interfaces.IOperations;
import mobi.stos.podataka_lib.service.AbstractService;

public class AnexoBo extends AbstractService<Anexo> {

    private AnexoDao dao;

    public AnexoBo(Context context){
        super();
        this.dao= new AnexoDao(context);

    }

      @Override
    protected IOperations<Anexo> getDao() {
        return dao;
    }

}
