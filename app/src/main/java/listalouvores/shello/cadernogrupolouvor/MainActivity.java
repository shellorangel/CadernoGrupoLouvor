package listalouvores.shello.cadernogrupolouvor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private ListView ListaLouvores;
    private String[] louvores={

            "01 - Quando chego em Tua casa",
            "02 - Meu Pai querido",
            "03 - Dobro os meus joelhos",
            "04 - Deixa que o Espirito Santo",
            "05 - Sente Deus está presente",
            "06 - A Tua graça me basta",
            "07 - Abriga-me",
            "08 - O dia da vitória",
            "09 - Vim para adorar-te",
            "10 - Quando entrei neste lugar",
            "11 - Deus El Shadai",
            "12 - Restaura"



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListaLouvores =(ListView) findViewById(R.id.listaIndice);

        ArrayAdapter<String> adaptdador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,louvores
        );

        ListaLouvores.setAdapter(adaptdador);
        ListaLouvores.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int indice=position;

                if (indice == 0)
                    startActivity(new Intent(MainActivity.this,QuandoChego.class));


                if (indice == 1)
                    startActivity(new Intent(MainActivity.this,MeuPaiQuerido.class));

                if (indice == 2)
                    startActivity(new Intent(MainActivity.this,dobroOsMeusJoelhos.class));

                if (indice ==3)
                    startActivity(new Intent(MainActivity.this,deixaQueOespiritoSanto.class));
                if (indice ==4)
                    startActivity(new Intent(MainActivity.this,SenteDeusEstaPresente.class));
                if (indice ==5)
                    startActivity(new Intent(MainActivity.this,aTuaGracaMeBasta.class));
                if (indice ==6)
                    Toast.makeText(getApplicationContext(),"Sem categoria",Toast.LENGTH_SHORT).show();
                if (indice ==7)
                    Toast.makeText(getApplicationContext(),"Sem categoria",Toast.LENGTH_SHORT).show();
                if (indice ==8)
                    Toast.makeText(getApplicationContext(),"Sem categoria",Toast.LENGTH_SHORT).show();
                if (indice ==9)
                    Toast.makeText(getApplicationContext(),"Sem categoria",Toast.LENGTH_SHORT).show();
                if (indice ==10)
                    Toast.makeText(getApplicationContext(),"Sem categoria",Toast.LENGTH_SHORT).show();
                else
                    //String valorClicado= louvores[indice].toString();

                    Toast.makeText(getApplicationContext(),"Sem categoria",Toast.LENGTH_SHORT).show();
            }
        });

    }

    }

