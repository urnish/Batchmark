package com.example.batchmark;

import java.security.PublicKey;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends Activity 
{
	public static int[] originalArray;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	public void SortIt(View view)
    {
		try {
			switch(view.getId())
			{
			case R.id.btnBubble:
				int[] arrayBubbleSort=Calculator.cloneArray(originalArray);
				long start=System.currentTimeMillis();
				Calculator.bubbleSort(originalArray);
				
				long end=System.currentTimeMillis();
				long totaltime=end-start;
				TextView tvBubble=(TextView) findViewById(R.id.tvBubble);
				tvBubble.setText(" "+totaltime);
				break;
			
			case R.id.btnSelection:
				int[] arraySelectionSort=Calculator.cloneArray(originalArray);
				long start1=System.currentTimeMillis();
				Calculator.selectionsort(originalArray);
				long end1=System.currentTimeMillis();
				long totaltime1=end1-start1;
				TextView tvSelection=(TextView) findViewById(R.id.tvSelection);
				tvSelection.setText(" " +totaltime1);
				break;
				
			case R.id.btnMerge:
				long start2=System.currentTimeMillis();
				Calculator.bubbleSort(originalArray);
				long end2=System.currentTimeMillis();
				long totaltime2=end2-start2;
				break;	
			}
		} catch (Exception e) {
			
		}
		
	}
	public void genarateArray(View view)
	{
		EditText etSize=(EditText) findViewById(R.id.etSize);
		TextView tvStatus=(TextView) findViewById(R.id.tvStatus);
		int arraySize=0;
		try
		{
			arraySize=Integer.parseInt(etSize.getText().toString());
			RadioGroup rgCase=(RadioGroup) findViewById(R.id.rgCase);
			switch(rgCase.getCheckedRadioButtonId())
			{
				case R.id.rbBest:
					originalArray=Calculator.genarateSortedArray(arraySize);
					tvStatus.setText("Array of Size"  +arraySize+   "For Best Case");
				break;
				
				case R.id.rbAverage:
					originalArray=Calculator.genarateRandomArray(arraySize);
					tvStatus.setText("Array of Size"   +arraySize+   "For Average Case");
				break;
				
				case R.id.rbWorst:
					originalArray=Calculator.genarateReverseArray(arraySize);
					tvStatus.setText("Array of Size"   +arraySize+   "For Worst Case");
				break;
			}
		}
		catch(Exception ex)
		{
			tvStatus.setText("Please Enter A Valid Number....");
			
		}
	}

	
}
