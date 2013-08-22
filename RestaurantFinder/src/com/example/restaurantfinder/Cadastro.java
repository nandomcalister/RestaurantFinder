package com.example.restaurantfinder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Cadastro extends Activity {
	public static int funcionou = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro, menu);
		return true;
	}
	
	public void voltar(View v){    	
    	Intent oI  = new Intent(Cadastro.this,  MainActivity.class );    	
    	startActivityForResult(oI,funcionou); 
    }
    

}
