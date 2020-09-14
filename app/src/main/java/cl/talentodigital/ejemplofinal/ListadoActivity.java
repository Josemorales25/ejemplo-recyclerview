package cl.talentodigital.ejemplofinal;

import android.os.Bundle;
import android.os.RecoverySystem;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListadoActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private ListadoAdapter listadoAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        recyclerView = findViewById(R.id.rvlistadoVerduras);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        listadoAdapter = new ListadoAdapter(getFakeFrutasYVerduras());
        recyclerView.setAdapter(listadoAdapter);

    }

    private ArrayList<ListadoDeFrutasYVerduras> getFakeFrutasYVerduras() {
        ArrayList<ListadoDeFrutasYVerduras> frutasYVerdurasArrayList = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            frutasYVerdurasArrayList.add(getFakeFrutasYVerduras(i));
        }
        return frutasYVerdurasArrayList;

    }

    private ListadoDeFrutasYVerduras getFakeFrutasYVerduras(int i) {
        return new ListadoDeFrutasYVerduras("Nombre "+ i, 1+ i);
    }
}
