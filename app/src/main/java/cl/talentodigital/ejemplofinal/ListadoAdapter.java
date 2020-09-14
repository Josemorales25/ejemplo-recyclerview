package cl.talentodigital.ejemplofinal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ListadoAdapter extends RecyclerView.Adapter<ListadoViewHolder> {


    private ArrayList <ListadoDeFrutasYVerduras> frutasYVerduras;

    public ListadoAdapter(ArrayList<ListadoDeFrutasYVerduras> frutasYVerduras) {
        this.frutasYVerduras = frutasYVerduras;
    }

    @NonNull
    @Override
    public ListadoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_listado_frutas_y_verduras, parent, false);
        return new ListadoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListadoViewHolder holder, int position) {
    holder.bind(frutasYVerduras.get(position));
    }

    @Override
    public int getItemCount() {
        return frutasYVerduras.size();
    }
}
