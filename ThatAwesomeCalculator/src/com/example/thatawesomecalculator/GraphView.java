package com.example.thatawesomecalculator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class GraphView extends View {
	Paint paint = new Paint();

    public GraphView(Context context) {
        super(context);
        //paint.setColor(Color.BLACK);
        //paint.setStrokeWidth(10);
    }

    @Override
    public void onDraw(Canvas canvas) {
		/*
    	for (int x = 0; x <1000; x++){
    		canvas.drawLine(x, x, x+20, x+20, paint);
    		for (int y = 0; y <1000; y++){
    			canvas.drawLine(x, y, x+20, y+20, paint);
    			canvas.drawLine(x+20, y, x, y+20, paint);
    			try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}
    	}
		*/
    }	
}
