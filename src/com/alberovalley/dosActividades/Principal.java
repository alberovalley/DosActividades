package com.alberovalley.dosActividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Principal extends Activity implements OnClickListener {
    
	private RadioGroup rg;
	private Button boton;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        rg = (RadioGroup)findViewById(R.id.gruporb);
        
        boton = (Button) findViewById(R.id.boton);
        boton.setOnClickListener(this);
        
    }
	
	

	@Override
	protected void onResume() { 
		super.onResume();
		rg.clearCheck();// deja todos sin marcar
	}



	public void onClick(View v) {
		if (v.getId()==R.id.boton){
			int opcion = rg.getCheckedRadioButtonId();//el id de la opción marcada
			Log.d("2act", "opcion " + opcion);
			if(opcion > 0){
				Intent intent = new Intent(this, Secundario.class);
				intent.putExtra(Constantes.OPCION_ELEGIDA, opcion);//introduce un extra
				startActivity(intent); //inicia la actividad, enviando el extra
			}else{
				Toast t = new Toast(this);
        		t.setText(R.string.mensaje_error);
        		t.setDuration(Toast.LENGTH_LONG);
        		t.show();
			}
		}
		
	}
}