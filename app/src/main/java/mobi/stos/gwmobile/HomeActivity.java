package mobi.stos.gwmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

import mobi.stos.gwmobile.bean.Ocorrencia;
import mobi.stos.gwmobile.bo.OcorrenciaBo;

public class HomeActivity extends AppCompatActivity {

    private RadioGroup rdGroup;
    private RadioButton rdBtnToken, rdBtnNfe;
    private TextView txtViewNumero, txtViewOcorrencia, txtViewObs;
    private ImageView imgViewCamera, imgViewAnexo;
    private EditText edtTextObs;
    private Button btnSalvar;
    private ListView listOcorrencias;
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rdGroup = findViewById(R.id.radioGroup);
        rdBtnToken = findViewById(R.id.radioButton);
        rdBtnNfe = findViewById(R.id.radioButton2);
        txtViewNumero = findViewById(R.id.textView);
        txtViewOcorrencia = findViewById(R.id.textView2);
        txtViewObs = findViewById(R.id.textView3);
        imgViewCamera = findViewById(R.id.imageView);
        imgViewAnexo = findViewById(R.id.imageViewAnexo);
        edtTextObs = findViewById(R.id.editText);
        btnSalvar = findViewById(R.id.btnSalvarOcorrência);
        listOcorrencias = findViewById(R.id.listView);
        spinner=findViewById(R.id.spinner);


        OcorrenciaBo ocorrenciaBo = new OcorrenciaBo(this);
        List<Ocorrencia> ocorrencias = ocorrenciaBo.list();



        for(Ocorrencia ocr : ocorrencias){
            Log.v("LISTA OCORRENCIA", ocr.getId() +" - "+ ocr.getNome());
        }


        imgViewCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.v("imgV","image view camera");
            }
        });

        imgViewAnexo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v("imgV2","image view anexo");
            }
        });


    }
}
