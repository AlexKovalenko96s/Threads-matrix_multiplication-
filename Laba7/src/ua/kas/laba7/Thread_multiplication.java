package ua.kas.laba7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Thread_multiplication implements Runnable{

	String name;
	int[][] mA = new int[100][100];
	int[][] mB = new int[100][100];
	int[][] res = new int[100][100];
	String result;
	
	public  Thread_multiplication (String name, int[][] name1,int[][] name2, String result){
		this.name=name;
		this.mA=name1;
		this.mB=name2;
		this.result=result;	
	}
	
	@Override
	public void run() {
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
	}
}
