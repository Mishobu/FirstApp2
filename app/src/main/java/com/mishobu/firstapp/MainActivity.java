package com.mishobu.firstapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText edtEdad,edtRespuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtEdad = (EditText) findViewById(R.id.edtEdad);
        edtRespuesta = (EditText) findViewById(R.id.edtRespuesta);
        String str = edtEdad.getText().toString();
        TextView txtMensaje = (TextView) findViewById(R.id.txtRespuesta);
        txtMensaje.setText(str);

        Button btnOk = new Button(this);
        btnOk.setText("Aceptar");
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtRespuesta.setText(edtEdad.getText().toString());
            }
        });
        LinearLayout ll = (LinearLayout) findViewById(R.id.linearlayout1);
        ll.addView(btnOk);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
