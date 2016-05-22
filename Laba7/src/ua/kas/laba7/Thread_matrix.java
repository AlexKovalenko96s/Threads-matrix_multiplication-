package ua.kas.laba7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Thread_matrix implements Runnable{

	String name;
	String file1;
	String file2;
	static int[][] mA = new int[100][100];
	static int[][] mB = new int[100][100];
	
	public  Thread_matrix (String file1, String file2){
		
		this.file1=file1;
		this.file2=file2;
//		this.mA=name1;
//		this.mB=name2;
	}

	@Override
	public void run() {
		try {
			Scanner sc1 = new Scanner(new File(file1));
			for (int i = 0; i < 100; i++){
					for (int j = 0; j < 100; j++){
						mA[i][j] = sc1.nextInt();
					}
				}
			sc1.close();
			
			Scanner sc2 = new Scanner(new File(file2));
			for (int i = 0; i < 100; i++){
					for (int j = 0; j < 100; j++){
						mB[i][j] = sc2.nextInt();
					}
				}
			sc2.close();
		} catch (IOException e1) {JOptionPane.showMessageDialog(null, "Files not found");}	
	}
}
