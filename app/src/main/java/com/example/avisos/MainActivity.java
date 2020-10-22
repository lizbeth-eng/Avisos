package com.example.avisos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

import com.application.avisos.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG ="Main Activity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log .i(TAG, "onCreate");

        Context context = getApplicationContext();
        CharSequence text ="hola";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP| Gravity.LEFT, 150,150);
        toast.show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log .i(TAG, "onStart");
        Context context = getApplicationContext();
        CharSequence text ="Bienvenido";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP| Gravity.LEFT, 150,150);
        toast.show();
        };

        @Override
        protected void onPause() {
            super.onPause();
            Log.i(TAG, "onPause");
            Context context = getApplicationContext();
            CharSequence text = "La aplicacion esta en pausa";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.setGravity(Gravity.TOP | Gravity.LEFT, 150, 150);
            toast.show();
        };
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStart");
        Context context = getApplicationContext();
        CharSequence text = "La aplicacion se encuentra pausada";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 150, 150);
        toast.show();
    };
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onStart");
        Context context = getApplicationContext();
        CharSequence text = "La aplicacion esta cerrada";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.TOP | Gravity.LEFT, 150, 150);
        toast.show();
    };

}