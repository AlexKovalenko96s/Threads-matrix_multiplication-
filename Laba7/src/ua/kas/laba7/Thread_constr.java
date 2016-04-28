package ua.kas.laba7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Thread_constr implements Runnable{

	int[][] mA = new int[100][100];
	int[][] mB = new int[100][100];
	int[][] res = new int[100][100];
	Random random = new Random();
	String name;
	String line = "";
	String file1;
	String file2;
	String result;
	
	public  Thread_constr (String name, String file1, String file2, String result){
		this.name=name;
		this.file1=file1;
		this.file2=file2;
		this.result=result;
		
	}
	
	@Override
	public void run() {
		
		//считывает матрицы с файлов
		
		try {
			Scanner sc1 = new Scanner(new File(file1));
			for (int i = 0; i < 100; i++){
					for (int j = 0; j < 100; j++){
						mA[i][j] = sc1.nextInt();
					}
				}
			sc1.close();
			System.out.println("read(first)'s ending");
			
			Scanner sc2 = new Scanner(new File(file2));
			for (int i = 0; i < 100; i++){
					for (int j = 0; j < 100; j++){
						mB[i][j] = sc2.nextInt();
					}
				}
			sc2.close();
			System.out.println("read(second)'s ending");
		} catch (IOException e1) {JOptionPane.showMessageDialog(null, "Files not found");}	
		
		//умножем матрицы
		
		int m = mA.length;    
		int n = mB[0].length; 
		int o = mB.length; 
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < o; k++) {
					res[i][j] += mA[i][k] * mB[k][j];
				}
			}
		}
		System.out.println("Thread "+name+" finish!");
		
		//создание и запись файла
		
		FileWriter fw;
		try {
			fw = new FileWriter(new File(result));
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					result = String.valueOf(res[i][j]) + "      ";
					fw.append(result);
				}
				fw.append("\n" );
			}
			fw.flush();
			fw.close();
		} catch (IOException e) {}	
		
		
		//выводим в консоль
		
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.format("%6d ", res[i][j]);
			}
			System.out.println();
		}
		
		
		
//		for(int i=0; i<100; i++){
//			for(int j=0; j<100; j++){
//				mA[i][j] = random.nextInt(100);
//				mB[i][j] = random.nextInt(100);
//			}
//		}
//		
//		int m = mA.length;    
//		int n = mB[0].length; 
//		int o = mB.length; 
//		
//		res = new int[m][n];
//	
//		for (int i = ot; i < doo; i++) {
//			for (int j = 0; j < n; j++) {
//				for (int k = 0; k < o; k++) {
//					res[i][j] += mA[i][k] * mB[k][j];
//				}
//			}
//		}
//		System.out.println("Thread "+name+" finish!");
	}
}
