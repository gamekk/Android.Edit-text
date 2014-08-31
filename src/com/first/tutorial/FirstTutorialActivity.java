package com.first.tutorial;

import com.first.tutorial.R.id;

import android.support.v7.app.ActionBarActivity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class FirstTutorialActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_tutorial);
        
        Button bn = (Button) findViewById(R.id.btn);
        
        bn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				AlertDialog.Builder al = new AlertDialog.Builder(FirstTutorialActivity.this);
				al.setTitle("Input New Data");
				//
				final EditText et = new EditText(FirstTutorialActivity.this);
				al.setView(et);
				//
				al.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						TextView tv = (TextView) findViewById(R.id.text);
						tv.setText(et.getText().toString());
						Toast.makeText(getApplicationContext(), "Input new data = "+et.getText().toString(), Toast.LENGTH_LONG).show();
					}
				});
				al.create();
				al.show();
			
			}
		});
        
    }

}
