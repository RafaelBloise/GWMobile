package mobi.stos.gwmobile.bo;

import android.content.Context;

import mobi.stos.gwmobile.bean.Ocorrencia;
import mobi.stos.gwmobile.dao.OcorrenciaDao;
import mobi.stos.podataka_lib.interfaces.IOperations;
import mobi.stos.podataka_lib.service.AbstractService;

public class OcorrenciaBo extends AbstractService<Ocorrencia> {


    private OcorrenciaDao dao;

    public OcorrenciaBo(Context context){
        super();
        this.dao= new OcorrenciaDao(context);

    }

      @Override
    protected IOperations<Ocorrencia> getDao() {
        return dao;
    }


}
