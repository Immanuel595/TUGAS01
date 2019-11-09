package com.example.latihan101;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class Quis2 extends Activity{
	
	EditText e1q2,e2q2,e3q2;
	Button b2;
	TextView tv2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quis2);
		
		e1q2 = (EditText)findViewById(R.id.et1q2);
		e2q2 = (EditText)findViewById(R.id.et2q2);
		e3q2 = (EditText)findViewById(R.id.et3q2);
		b2 = (Button)findViewById(R.id.bq2);
		tv2 = (TextView)findViewById(R.id.tvq2);
		
		b2.setOnClickListener(new OnClickListener(){
		
		public void onClick(View arg0) {
			int a1 = Integer.parseInt(e1q2.getText().toString());
			int a2 = Integer.parseInt(e2q2.getText().toString());
			int a3 = Integer.parseInt(e3q2.getText().toString());
			if(a1<a2 && a1<a3 && a2<a3){
				tv2.setText(String.valueOf(e1q2.getText())+" lebih kecil dari pada "+
				(e2q2.getText())+" dan lebih kecil dari pada "+(e3q2.getText()));}
				else if(a1<a2 && a1<a3 && a2>a3){ 
				tv2.setText(String.valueOf(e1q2.getText())+" lebih kecil dari pada "+
				(e3q2.getText())+" dan lebih kecil dari pada "+(e2q2.getText()));}
				else if(a1>a2 && a1>a3 && a2>a3){
				tv2.setText(String.valueOf(e3q2.getText())+" lebih kecil dari pada "+
				(e2q2.getText())+" dan lebih kecil dari pada "+(e1q2.getText()));}
				else if(a2>a1 && a2>a3 && a3<a1){
				tv2.setText(String.valueOf(e3q2.getText())+" lebih kecil dari pada "+
				(e1q2.getText())+" danlebih kecil dari pada "+(e2q2.getText()));}
				else if(a2<a1 && a2<a3 && a3<a1){
				tv2.setText(String.valueOf(e2q2.getText())+" lebih kecil dari pada "+
				(e3q2.getText())+" dan lebih kecil dari pada "+(e1q2.getText()));}
				else if(a2<a1 && a2<a3 && a3>a1){
				tv2.setText(String.valueOf(e2q2.getText())+" lebih kecil dari pada "+
				(e1q2.getText())+" dan lebih kecil dari pada "+(e3q2.getText()));}
				else if(a1==a2 && a1>a3){
				tv2.setText("angka pada kolom 1 dan 2 sama dan lebih besar dari "+
				(String.valueOf(e3q2.getText())));}
				else if(a1==a2 && a1<a3){
				tv2.setText("angka pada kolom 1 dan 2 sama dan lebih kecil dari "+
				(String.valueOf(e3q2.getText())));}
				else if(a1==a3 && a1>a2){
				tv2.setText("angka pada kolom 1 dan 3 sama dan lebih besar dari "+
				(String.valueOf(e2q2.getText())));}
				else if(a1==a3 && a1<a2){
				tv2.setText("angka pada kolom 1 dan 3 sama dan lebih kecil dari "+
				(String.valueOf(e2q2.getText())));}
				else if(a2==a3 && a2>a1){
				tv2.setText("angka pada kolom 2 dan 3 sama dan lebih besar dari "+
				(String.valueOf(e1q2.getText())));}
				else {
				tv2.setText("angka pada kolom 2 dan 3 sama dan lebih kecil dari "+
				(String.valueOf(e1q2.getText())));}
		
		};
		});
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;	
}
	
}
