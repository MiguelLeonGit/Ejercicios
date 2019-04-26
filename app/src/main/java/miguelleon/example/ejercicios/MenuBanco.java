package miguelleon.example.ejercicios;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MenuBanco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_banco);

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment fragment = fragmentManager.findFragmentById(R.id.linear_fragment);
        if(fragment==null){
            fragment = new FragmentActivity();
            fragmentManager.beginTransaction().add(R.id.linear_fragment, fragment).commit();
        }
    }
}
