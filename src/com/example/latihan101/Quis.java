package com.example.latihan101;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class Quis extends Activity {
	
	protected static final Uri Quis1 = null;
	Button bt1,bt2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quis);
		
		bt1=(Button)findViewById(R.id.btn1);
		bt2=(Button)findViewById(R.id.btn2);
		
		bt1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent intent = new Intent(Quis.this,Quis1.class);
			startActivity(intent);
			}
		});
		bt2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			Intent intent = new Intent(Quis.this,Quis2.class);
			startActivity(intent);
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
