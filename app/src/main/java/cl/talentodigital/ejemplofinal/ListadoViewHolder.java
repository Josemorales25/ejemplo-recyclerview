package cl.talentodigital.ejemplofinal;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ListadoViewHolder extends RecyclerView.ViewHolder{

    private TextView tvNombre;
    private TextView tvPrecio;

    public ListadoViewHolder(@NonNull View itemView) {
        super(itemView);
        tvNombre = itemView.findViewById(R.id.tvNombre);
        tvPrecio = itemView.findViewById(R.id.tvPrecio);
    }
    public void bind(ListadoDeFrutasYVerduras listadoDeFrutasYVerduras){
       tvNombre.setText(listadoDeFrutasYVerduras.getNombre());
        tvPrecio.setText("$"+listadoDeFrutasYVerduras.getPrecio());

    }
}
