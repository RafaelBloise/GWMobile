package mobi.stos.gwmobile.dao;

import android.content.Context;

import mobi.stos.gwmobile.bean.Ocorrencia;
import mobi.stos.podataka_lib.repository.AbstractRepository;

public class OcorrenciaDao extends AbstractRepository<Ocorrencia> {

public OcorrenciaDao(Context context){
    super(context, Ocorrencia.class);
}

}
