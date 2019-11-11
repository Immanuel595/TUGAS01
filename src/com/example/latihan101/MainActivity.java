package com.example.latihan101;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	ListView lvmenu;
	String[] menu = {"Profil","Quis","Exit"}; 
	ArrayAdapter<String> adapter;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        lvmenu = (ListView)findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, menu);
        lvmenu.setAdapter(adapter);
        lvmenu.setOnItemClickListener(listClick);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    private AdapterView.OnItemClickListener listClick = new AdapterView.OnItemClickListener(){
    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3){
    	if(arg2==0){
    		Intent intent = new Intent(MainActivity.this,Profil.class);
			startActivity(intent);
    	}else if(arg2==1){
    		Intent intent = new Intent(MainActivity.this,Quis.class);
			startActivity(intent);
    	}else{
    		finish();
    	}
    }
};
}