package arrayer;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Arrinläsning {
public static void main(String[] args) {
	
	int i[]=new int[5];
	
	
	
	for(int j=0;j<5;j++) {
	
	//System.out.println(j);	 felsökning
		
	String inputText=JOptionPane.showInputDialog("ange ett tal");
	int inputTal=Integer.parseInt(inputText);
	i[j]=inputTal;
	
	}
	
	
	
	
	
	/*
	inputText=JOptionPane.showInputDialog("ange ett tal");
	inputTal=Integer.parseInt(inputText);
	i[1]=inputTal;
	
	inputText=JOptionPane.showInputDialog("ange ett tal");
	inputTal=Integer.parseInt(inputText);
	i[2]=inputTal;
	
	inputText=JOptionPane.showInputDialog("ange ett tal");
	inputTal=Integer.parseInt(inputText);
	i[3]=inputTal;
	
	inputText=JOptionPane.showInputDialog("ange ett tal");
	inputTal=Integer.parseInt(inputText);
	i[4]=inputTal;
	*/
	
	System.out.println(Arrays.toString(i));
	
	
}
}
