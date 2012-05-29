package com.alberovalley.dosActividades;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Secundario extends Activity {

	LinearLayout lay;
	TextView mensaje;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secundario);
                
        lay = (LinearLayout)findViewById(R.id.fondo_secundario);
        mensaje = (TextView)findViewById(R.id.mensaje_color);
        
        int opcionColor = getIntent().getIntExtra(Constantes.OPCION_ELEGIDA, -1);
        switch(opcionColor){
        	case R.id.radio1 :
        		lay.setBackgroundColor(getResources().getColor(R.color.azul));        		 
        		Log.d("2act", "azul");
        		break;
        	case R.id.radio2:
        		lay.setBackgroundColor(getResources().getColor(R.color.rojo));
        		Log.d("2act", "rojo");
        		break;
        	case R.id.radio3:
        		lay.setBackgroundColor(getResources().getColor(R.color.verde));
        		Log.d("2act", "verde");
        		break;
        	default:
        		Toast t = new Toast(this);
        		t.setText(R.string.mensaje_error);
        		t.setDuration(Toast.LENGTH_LONG);
        		t.show();
        }
        
    }
	
}
