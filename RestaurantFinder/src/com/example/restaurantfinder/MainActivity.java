package com.example.restaurantfinder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {
	public static int funcionou = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
        
    }
    
    public void onClick(View v) {
    	Intent oI  = new Intent(MainActivity.this,  Cadastro.class );
    	startActivity(oI);
    	
    }
    
    public void cadastrar(View v){    	
    	Intent oI  = new Intent(MainActivity.this,  Cadastro.class );    	
    	startActivityForResult(oI,funcionou);
    }
    
    
}
