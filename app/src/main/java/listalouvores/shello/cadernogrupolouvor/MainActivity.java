package listalouvores.shello.cadernogrupolouvor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


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
            "11 - Restaura"



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

    }
}
