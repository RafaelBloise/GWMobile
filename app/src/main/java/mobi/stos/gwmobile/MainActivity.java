package mobi.stos.gwmobile;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import mobi.stos.gwmobile.bean.Ocorrencia;
import mobi.stos.gwmobile.bo.OcorrenciaBo;
import mobi.stos.httplib.HttpAsync;
import mobi.stos.httplib.enumm.Method;
import mobi.stos.httplib.inter.FutureCallback;

public class MainActivity extends AppCompatActivity {

    private FrameLayout fRepresentante, fFuncionario, fMotorista;
    private LinearLayout linearLayoutBotoes;
    private Button btnRep, btnMot, btnFunc, btnTrocAcesso, btnTrocAcesso2, btnTrocAcesso3, btnLoginFunc, btnLoginRepresentante, btnLoginMotorista;
    private ProgressDialog progressDialog;


    private void getOcorrencias() {
        try {

            HttpAsync http = new HttpAsync(new URL("https://stos.mobi/test/ocorrencia.json"));
            http.setDebug(true);
            http.get(new FutureCallback() {
                @Override
                public void onBeforeExecute() {
                    progressDialog = ProgressDialog.show(MainActivity.this, "", "Carregando...", true);
                }

                @Override
                public void onAfterExecute() {
                    if (progressDialog != null && progressDialog.isShowing()) {
                        progressDialog.dismiss();
                    }
                }

                @Override
                public void onSuccess(int responseCode, Object object) {
                    Log.v("LOG HTTP", "Deu bom! "+responseCode);
                    try{
                        if(responseCode == 200) {
                            JSONArray array = (JSONArray) object;
                            List<Ocorrencia> ocorrenciaList = new ArrayList<>();

                            for(int i=0; i<array.length(); i++){
                                JSONObject jsonObject = array.getJSONObject(i);

                                Ocorrencia ocorrencia = new Ocorrencia();
                                ocorrencia.setId(jsonObject.getInt("id"));
                                ocorrencia.setNome(jsonObject.getString("nome"));

                                ocorrenciaList.add(ocorrencia);

                            }

                            OcorrenciaBo ocorrenciaBo = new OcorrenciaBo(MainActivity.this);
                            ocorrenciaBo.clean();
                            ocorrenciaBo.insert(ocorrenciaList);

                            Intent intent = new Intent();
                            intent.setClass(MainActivity.this, HomeActivity.class);
                            startActivity(intent);

                        }
                    }catch(Exception e){
                        e.printStackTrace();
                    }

                }

                @Override
                public void onFailure(Exception exception) {

                }
            });
        } catch (Exception e) {
                e.printStackTrace();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRep = findViewById(R.id.btnRepresentante);
        btnFunc = findViewById(R.id.btnFuncionario);
        btnMot = findViewById(R.id.btnMotorista);
        btnTrocAcesso = findViewById(R.id.btnTrocarAcesso);
        btnTrocAcesso2 = findViewById(R.id.btnTrocarAcesso2);
        btnTrocAcesso3 = findViewById(R.id.btnTrocarAcesso3);
        fRepresentante = findViewById(R.id.frameLoginRepresentante);
        fFuncionario = findViewById(R.id.frameLayoutLoginFuncionario);
        fMotorista = findViewById(R.id.frameLayoutLoginMotorista);
        linearLayoutBotoes = findViewById(R.id.LinearLayoutBotoes);
        btnLoginMotorista = findViewById(R.id.btnLoginMotorista);
        btnLoginRepresentante = findViewById(R.id.btnLoginRepresentante);
        btnLoginFunc = findViewById(R.id.btnLoginFuncionario);


        btnLoginMotorista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getOcorrencias();

            }
        });

        btnLoginRepresentante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getOcorrencias();

            }
        });

        btnLoginFunc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getOcorrencias();

            }
        });

        btnRep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                fRepresentante.setVisibility(View.VISIBLE);
                linearLayoutBotoes.setVisibility(View.GONE);

            }
        });

        btnTrocAcesso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fRepresentante.setVisibility(View.GONE);
                linearLayoutBotoes.setVisibility(View.VISIBLE);

            }
        });

        btnFunc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fFuncionario.setVisibility(View.VISIBLE);
                linearLayoutBotoes.setVisibility(View.GONE);

            }
        });

        btnTrocAcesso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fFuncionario.setVisibility(View.GONE);
                linearLayoutBotoes.setVisibility(View.VISIBLE);

            }
        });

        btnMot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fMotorista.setVisibility(View.VISIBLE);
                linearLayoutBotoes.setVisibility(View.GONE);

            }
        });

        btnTrocAcesso3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fMotorista.setVisibility(View.GONE);
                linearLayoutBotoes.setVisibility(View.VISIBLE);

            }
        });

    }


}
