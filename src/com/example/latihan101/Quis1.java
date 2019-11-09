package com.example.latihan101;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Quis1 extends Activity{
	
	EditText e1q1,e2q1,e3q1;
	Button b1;
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quis1);
		
		e1q1 = (EditText)findViewById(R.id.et1q1);
		e2q1 = (EditText)findViewById(R.id.et2q1);
		e3q1 = (EditText)findViewById(R.id.et3q1);
		b1 = (Button)findViewById(R.id.bq1);
		tv1 = (TextView)findViewById(R.id.tvq1);
		
		b1.setOnClickListener(new OnClickListener(){
		
		public void onClick(View arg0) {
			int a1 = Integer.parseInt(e1q1.getText().toString());
			int a2 = Integer.parseInt(e2q1.getText().toString());
			int a3 = Integer.parseInt(e3q1.getText().toString());
			if(a1<a2 && a1<a3 && a2<a3){
			tv1.setText("kolom 3 paling besar dan kolom 1 paling kecil");}
			else if(a1<a2 && a1<a3 && a2>a3){ 
			tv1.setText("kolom 2 paling besar dan kolom 1 paling kecil");}
			else if(a1>a2 && a1>a3 && a2>a3){
			tv1.setText("kolom 1 paling besar dan kolom 3 paling kecil");}
			else if(a2>a1 && a2<a3 && a3>a1){
			tv1.setText("Kolom 3 paling besar dan kolom 1 paling kecil");}
			else if(a2<a1 && a2<a3 && a3<a1){
			tv1.setText("kolom 1 paling besar dan kolom 2 paling kecil");}
			else if(a2<a1 && a2<a3 && a3>a1){
			tv1.setText("kolom 3 paling besar dan kolom 2 paling kecil");}
			else if(a1==a2 && a1>a3){
			tv1.setText("angka pada kolom 1 dan 2 sama dan kolom 3 paling besar");}
			else if(a1==a2 && a1<a3){
			tv1.setText("angka pada kolom 1 dan 2 sama dan lebih besar dari kolom 3");}
			else if(a1==a3 && a1>a2){
			tv1.setText("angka pada kolom 1 dan 3 sama dan kolom 2 paling besar");}
			else if(a1==a3 && a1<a2){
			tv1.setText("angka pada kolom 1 dan 3 sama dan lebih besar dari kolom 2 ");}
			else if(a2==a3 && a2<a1){
			tv1.setText("angka pada kolom 2 dan 3 sama dan kolom 1 paling besar");}
			else {
			tv1.setText("angka pada kolom 2 dan 3 sama dan lebih besar dari kolom 1");}
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
