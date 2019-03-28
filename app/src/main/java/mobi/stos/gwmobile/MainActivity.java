package mobi.stos.gwmobile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

   public FrameLayout fRepresentante, fFuncionario, fMotorista;
   public LinearLayout linearLayoutBotoes;
   public Button btnRep, btnMot, btnFunc, btnTrocAcesso, btnTrocAcesso2, btnTrocAcesso3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRep= findViewById(R.id.btnRepresentante);
        btnFunc=findViewById(R.id.btnFuncionario);
        btnMot=findViewById(R.id.btnMotorista);
        btnTrocAcesso = findViewById(R.id.btnTrocarAcesso);
        btnTrocAcesso2 = findViewById(R.id.btnTrocarAcesso2);
        btnTrocAcesso3 = findViewById(R.id.btnTrocarAcesso3);
        fRepresentante=findViewById(R.id.frameLoginRepresentante);
        fFuncionario=findViewById(R.id.frameLayoutLoginFuncionario);
        fMotorista = findViewById(R.id.frameLayoutLoginMotorista);
        linearLayoutBotoes=findViewById(R.id.LinearLayoutBotoes);


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
