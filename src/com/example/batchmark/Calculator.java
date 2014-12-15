package com.example.batchmark;

import javax.xml.transform.Result;

import android.view.View;

public class Calculator
{
	
	public static int[] cloneArray(int[] array)
	{
		int[] result=new int[array.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = array[i];
		} 
	return result;	
	}
	public static int[] bubbleSort(int[] array)
	{
		
		int n=array.length;
		int k;
		for(int m=n;m>=0;m--)
		{
			for(int i=0;i<n-1;i++)
			{
				k=i+1;
				if(array[i]>array[k])
				{
					swapNumbers(i,k,array);
				}
			}
	}
		return array;
	}
	public static void swapNumbers(int i,int j, int[] array)
	{
		int temp;
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
		
	}
	public static int[] selectionsort(int[] array)
	{
		for(int i=0;i<array.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[index])
				index=j;
				
				int smallnumbers=array[index];
				array[index]=array[i];
			}
		}
		return array;
	}
	public static int[] genarateSortedArray(int size)
	{
		
		int[] array=new int[size];
		for (int i  = 0; i < array.length; i++)
		 {
			array[i] = (int) (Math.random() * 1000);
		}
		return array;
		
	}
	public static int[] genarateRandomArray(int size)
	{
		
		int[] array=new int[size];
		for (int i  = 0; i < array.length; i++)
		 {
			array[i] = (int) (Math.random() * 1000);
		}
		return array;
		
	}
	public static int[] genarateReverseArray(int size)
	{
		int[] array=new int[size];
		for(int i=array.length-1;i>0;i--)
		{
			
			array[i]=i;
		}
		return array;
		
	}
}
