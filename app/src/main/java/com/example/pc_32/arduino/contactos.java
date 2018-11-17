package com.example.pc_32.arduino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class contactos extends AppCompatActivity {

    Button buttonregreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactos);


        buttonregreso = (Button)findViewById(R.id.buttonregreso);
        //Con boton
        buttonregreso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getBaseContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }
}
