package cl.talentodigital.ejemplofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import cl.talentodigital.ejemplofinal.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.btnIrAListado.setOnClickListener((View v) -> goToIrAListado());
    }

    private void goToIrAListado() {
        Intent intent = new Intent(this, ListadoActivity.class);
        startActivity(intent);
    }

}