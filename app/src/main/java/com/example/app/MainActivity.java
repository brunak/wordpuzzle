package com.example.app;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    private EditText usuario;
    private EditText senha;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText)this.findViewById(R.id.usuario);
        senha = (EditText)this.findViewById(R.id.senha);

    }

    public void entrarOnClick(View v) {
        String usuarioInformado = usuario.getText().toString();
        String senhaInformada = senha.getText().toString();

        if ("admin".equals(usuarioInformado) && "123".equals(senhaInformada)) {
            //vai para outra activity
            startActivity(new Intent(this, DashboardActivity.class));
        } else {
            //mostra uma mensagem de erro
            String msgErro = getString(R.string.erro_autenticacao);
            Toast toast = Toast.makeText(this, msgErro, Toast.LENGTH_SHORT);
            toast.show();
        }

    }
}
