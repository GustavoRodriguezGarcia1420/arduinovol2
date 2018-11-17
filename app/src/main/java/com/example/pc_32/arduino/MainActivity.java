package com.example.pc_32.arduino;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    Button buttoncambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttoncambio = (Button)findViewById(R.id.buttoncambio);
        //Con boton
        buttoncambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent (getBaseContext(), contactos.class);
                startActivity(i);
            }
        });
        //Sin boton we
        //Intent i = new Intent (getBaseContext(), contactos.class);
        //startActivity(i);

        File memoria,archivo;
        OutputStreamWriter escritor;

        memoria = Environment.getExternalStorageDirectory();
        archivo = new File (memoria.getAbsolutePath(),"Vetas.csv"); //el csv es casi excel XD
        //archivo = new File (memoria.getAbsolutePath(),"Vetas.html");
        try {
            escritor = new OutputStreamWriter(new FileOutputStream(archivo));

            escritor.write("Marca, Modelo, Precio" +
                    "\n Apple, IphoneX, 2000" +
                    "\n Sony, M2Aqua, 2500" +
                    "\n Motorola, Motorola E(4G),1500");
            escritor.close();

        } catch (Exception e) {
            //e.printStackTrace();
            Log.e("error",""+e.getMessage());
        }
    }
}
