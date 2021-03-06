package miguelleon.example.ejercicios;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText editTextUsuario;
        final EditText editTextPass;
        Button buttonEntrar;

        editTextUsuario = findViewById(R.id.editTe_usuario);
        editTextPass = findViewById(R.id.editTe_pass);

        buttonEntrar = findViewById(R.id.btn_entrar);
        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(editTextUsuario.getText().toString().equals("miguel") & editTextPass.getText().toString().equals("123")) {
                    Intent intent = new Intent(MainActivity.this, MenuBanco.class);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "No tienes permisos para entrar", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
