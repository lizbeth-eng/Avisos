package com.application.avisos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //agregar tag para invocar los estados de la app
    private static final String TAG = "Main Activity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //en el registro de ejecucion se mostrará la accion realizada
        Log.i(TAG, "onCreate");
 //       Toast.makeText(this, "La aplicación se ha creado", Toast.LENGTH_SHORT).show();
        Context context = getApplicationContext();
        CharSequence text = "La aplicacion se ha creado";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,150,150);
        toast.show();
    }

    //evento on start
    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG, "onStart");
        //Toast.makeText(this, "La aplicación se ha iniciado", Toast.LENGTH_LONG).show();
        Context context = getApplicationContext();
        CharSequence text = "La aplicacion se ha iniciado";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,150,150);
        toast.show();
    };

    //evento on resume
    @Override
    protected void onResume(){
        super.onResume();
        //agregar toast personalizado
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_personalizado_onresume,(ViewGroup)findViewById(R.id.toast_on_resume));
        TextView texto_Toast = (TextView) layout.findViewById(R.id.texto_Toast);
        texto_Toast.setText("La aplicacion se ha recuperado");

        Toast toast =new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();



    };

    //evento on pause
    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG, "onPause");
        //Toast.makeText(this, "La aplicación se ha pausado", Toast.LENGTH_SHORT).show();

        Context context = getApplicationContext();
        CharSequence text = "La aplicacion se ha pausado";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,150,150);
        toast.show();
    };

    //evento on stop
    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG, "onStop");
        //Toast.makeText(this, "La aplicación se ha detenido", Toast.LENGTH_SHORT).show();

        Context context = getApplicationContext();
        CharSequence text = "La aplicacion se ha detenido";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,150,150);
        toast.show();
    };

    //evento on Destroy
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG, "onDestroy");
        //Toast.makeText(this, "La aplicación se ha cerrado", Toast.LENGTH_SHORT).show();

        Context context = getApplicationContext();
        CharSequence text = "La aplicacion se ha cerrado";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP|Gravity.LEFT,150,150);
        toast.show();
    };


}