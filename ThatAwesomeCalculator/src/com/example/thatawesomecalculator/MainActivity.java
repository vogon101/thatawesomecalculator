package com.example.thatawesomecalculator;

import com.colofabrix.mathparser.MathParser;
import com.colofabrix.mathparser.org.ConfigException;
import com.colofabrix.mathparser.org.ExpressionException;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private MathParser mp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 //Remove title bar
	    this.requestWindowFeature(Window.FEATURE_NO_TITLE);

		setContentView(R.layout.activity_main);
		try {
			this.mp = new MathParser();
		} catch (ConfigException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onEquClick (View v) {
		
		
		Button b = (Button) v;
		TextView tv = (TextView) this.findViewById(R.id.Ans);
		tv.setTextColor(Color.BLACK);
		EditText txt = (EditText) this.findViewById(R.id.input1);
		try {
			tv.setText(""+mp.ExecutePostfix(mp.ConvertToPostfix(txt.getText().toString())));
		} catch (ExpressionException e) {
			//tv.setTextColor(new ColorStateList(states, colors));;
			tv.setTextColor(Color.RED);
			tv.setText("ERROR - Invalid Expression");
		} catch (ConfigException e) {
			e.printStackTrace();
		} catch (Exception e ) {
			//tv.setTextColor(new ColorStateList(states, colors));;
			tv.setTextColor(Color.RED);
			tv.setText("ERROR - Invalid Expression - ALL");
		}
	
	}

}
