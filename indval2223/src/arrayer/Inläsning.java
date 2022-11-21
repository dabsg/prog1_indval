package arrayer;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Inläsning {
public static void main(String[] args) {
	
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("ange först en text där efter ett tal");
	String text = sc.nextLine();
	
	int tal = sc.nextInt();
	
	
	System.out.println(text+" "+tal);
	
	//-----------------------------------------------------
	
	
	String text2=JOptionPane.showInputDialog("ange ett heltal");
	
	int tal1=Integer.parseInt(text2);
	
	
}
}
