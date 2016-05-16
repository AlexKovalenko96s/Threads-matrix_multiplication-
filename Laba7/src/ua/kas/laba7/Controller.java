package ua.kas.laba7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;

public class Controller {

	@FXML
	static
	TextArea ta;
	static String result;
	int think;
	@FXML CheckBox cb1;
	@FXML CheckBox cb2;
	@FXML CheckBox cb3;
	@FXML CheckBox cb4;
	@FXML CheckBox cb5;
	@FXML CheckBox cb6;
	@FXML CheckBox cb7;
	@FXML CheckBox cb8;
	@FXML CheckBox cb9;
	@FXML CheckBox cb10;
	@FXML CheckBox cb11;
	@FXML CheckBox cb12;
	@FXML CheckBox cb_join;
	static Thread t9;
	int[][] mA = new int[100][100];
	int[][] mB = new int[100][100];
	int[][] res = new int[100][100];
	
	public void start(ActionEvent e) throws InterruptedException, IOException {

		String time1 = find_time();
		time1 = time1.substring(9);
		int think1 = Integer.parseInt(time1);
		
		if(cb1.isSelected()){
			Thread t1 = new Thread(new Thread_constr("1","neChetnue1.1","neChetnue1.2", "Result1"));
			t1.start();
			if(cb_join.isSelected()){
				t1.join();
			}
		}
		
		if(cb2.isSelected()){
			Thread t2 = new Thread(new Thread_constr("2","Chetnue1","Chetnue2", "Result2"));
			t2.start();
			if(cb_join.isSelected()){
				t2.join();
			}
		}
		
		if(cb3.isSelected()){
			Thread t3 = new Thread(new Thread_constr("3","neChetnue3.1","neChetnue3.2", "Result3"));
			t3.start();
			if(cb_join.isSelected()){
				t3.join();
			}
		}
		
		if(cb4.isSelected()){
			Thread t4 = new Thread(new Thread_constr("4","Chetnue1","Chetnue2", "Result4"));
			t4.start();
			if(cb_join.isSelected()){
				t4.join();
			}
		}
		
		if(cb5.isSelected()){
			Thread t5 = new Thread(new Thread_constr("5","neChetnue5.1","neChetnue5.2", "Result5"));
			t5.start();
			if(cb_join.isSelected()){
				t5.join();
			}
		}
		
		if(cb6.isSelected()){
			Thread t6 = new Thread(new Thread_constr("6","Chetnue1","Chetnue2", "Result6"));
			t6.start();
			if(cb_join.isSelected()){
				t6.join();
			}
		}
		
		if(cb7.isSelected()){
			Thread t7 = new Thread(new Thread_constr("7","neChetnue7.1","neChetnue7.2", "Result7"));
			t7.start();
			if(cb_join.isSelected()){
				t7.join();
			}
		}
		
		if(cb8.isSelected()){
			Thread t8 = new Thread(new Thread_constr("8","Chetnue1","Chetnue2", "Result8"));
			t8.start();
			if(cb_join.isSelected()){
				t8.join();
			}
		}
		
		if(cb9.isSelected()){
			t9 = new Thread(new Thread_constr("9","neChetnue9.1","neChetnue9.2", "Result9"));
			t9.start();
			if(cb_join.isSelected()){
				t9.join();
			}
		}
		
		if(cb10.isSelected()){
			Thread t10 = new Thread(new Thread_constr("10","Chetnue1","Chetnue2", "Result10"));
			t10.start();
			if(cb_join.isSelected()){
				t10.join();
			}
		}
		
		if(cb11.isSelected()){
			Thread t11 = new Thread(new Thread_constr("11","neChetnue11.1","neChetnue11.2", "Result11"));
			t11.start();
			if(cb_join.isSelected()){
				t11.join();
			}
		}
		
		if(cb12.isSelected()){
			Thread t12 = new Thread(new Thread_constr("12","Chetnue1","Chetnue2", "Result12"));	
			t12.start();
			if(cb_join.isSelected()){
				t12.join();
			}
		}
		
		String time2 = find_time();
		time2 = time2.substring(9);
		int think2 = Integer.parseInt(time2);
		
		if(think1 > think2){
			int abs = Math.abs(think2 - think1);
			think = 999 - abs;
		}
		else{
			int abs = Math.abs(think2 - think1);
			 think = abs;
		}
		
		System.out.println(think + " milisec.");
		
		
//		//заполнение файла рандомными значения для матрицы
//		
//		int[][] mA = new int[100][100];
//		int[][] mB = new int[100][100];
//		Random random = new Random();
//		
//		File file = new File("neChetnue5.2");
//		file.createNewFile();
//		
//		for(int i=0; i<100; i++){
//			for(int j=0; j<100; j++){
//				mA[i][j] = random.nextInt(100);
//				mB[i][j] = random.nextInt(100);
//			}
//		}
//		
//		FileWriter fw = new FileWriter(file);
//		
//		for (int i = 0; i < mA.length; i++) {
//			for (int j = 0; j < mA[0].length; j++) {
//				result = String.valueOf(mA[i][j]) + "      ";
//				fw.append(result);
//			}
//			fw.append("\n" );
//		}
//		fw.flush();
//		fw.close();
		
	}
	
	public void start_oneThread(ActionEvent e){
		
		String time1 = find_time();
		time1 = time1.substring(9);
		String time1_1 = find_time();
		time1_1 = time1_1.substring(6,8);
		int think1 = Integer.parseInt(time1);
		int think1_1 = Integer.parseInt(time1_1);
		
		if(cb1.isSelected()){
			
			//считывает матрицы с файлов
			
			try {
				Scanner sc1 = new Scanner(new File("neChetnue1.1"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mA[i][j] = sc1.nextInt();
						}
					}
				sc1.close();
				
//				System.out.println("read(first)'s ending");
				
				Scanner sc2 = new Scanner(new File("neChetnue1.2"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mB[i][j] = sc2.nextInt();
						}
					}
				sc2.close();
				
//				System.out.println("read(second)'s ending");
				
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
			System.out.println("Thread "+"1"+" finish!");
			
			//создание и запись файла
			
			FileWriter fw;
			try {
				fw = new FileWriter(new File("Result1"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						result = String.valueOf(res[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException ex) {}	
		}
		
		if(cb2.isSelected()){
//считывает матрицы с файлов
			
			try {
				Scanner sc1 = new Scanner(new File("Chetnue1"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mA[i][j] = sc1.nextInt();
						}
					}
				sc1.close();
				
//				System.out.println("read(first)'s ending");
				
				Scanner sc2 = new Scanner(new File("Chetnue2"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mB[i][j] = sc2.nextInt();
						}
					}
				sc2.close();
				
//				System.out.println("read(second)'s ending");
				
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
			System.out.println("Thread "+"2"+" finish!");
			
			//создание и запись файла
			
			FileWriter fw;
			try {
				fw = new FileWriter(new File("Result2"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						result = String.valueOf(res[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException ex) {}	
		}
		
		if(cb3.isSelected()){
			
			//считывает матрицы с файлов
			
			try {
				Scanner sc1 = new Scanner(new File("neChetnue3.1"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mA[i][j] = sc1.nextInt();
						}
					}
				sc1.close();
				
//				System.out.println("read(first)'s ending");
				
				Scanner sc2 = new Scanner(new File("neChetnue3.2"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mB[i][j] = sc2.nextInt();
						}
					}
				sc2.close();
				
//				System.out.println("read(second)'s ending");
				
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
			System.out.println("Thread "+"3"+" finish!");
			
			//создание и запись файла
			
			FileWriter fw;
			try {
				fw = new FileWriter(new File("Result3"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						result = String.valueOf(res[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException ex) {}	
		}
		
		if(cb4.isSelected()){
//считывает матрицы с файлов
			
			try {
				Scanner sc1 = new Scanner(new File("Chetnue1"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mA[i][j] = sc1.nextInt();
						}
					}
				sc1.close();
				
//				System.out.println("read(first)'s ending");
				
				Scanner sc2 = new Scanner(new File("Chetnue2"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mB[i][j] = sc2.nextInt();
						}
					}
				sc2.close();
				
//				System.out.println("read(second)'s ending");
				
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
			System.out.println("Thread "+"4"+" finish!");
			
			//создание и запись файла
			
			FileWriter fw;
			try {
				fw = new FileWriter(new File("Result4"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						result = String.valueOf(res[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException ex) {}	
		}
		
		if(cb5.isSelected()){
//считывает матрицы с файлов
			
			try {
				Scanner sc1 = new Scanner(new File("neChetnue5.1"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mA[i][j] = sc1.nextInt();
						}
					}
				sc1.close();
				
//				System.out.println("read(first)'s ending");
				
				Scanner sc2 = new Scanner(new File("neChetnue5.2"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mB[i][j] = sc2.nextInt();
						}
					}
				sc2.close();
				
//				System.out.println("read(second)'s ending");
				
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
			System.out.println("Thread "+"5"+" finish!");
			
			//создание и запись файла
			
			FileWriter fw;
			try {
				fw = new FileWriter(new File("Result5"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						result = String.valueOf(res[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException ex) {}	
		}
		
		if(cb6.isSelected()){
//считывает матрицы с файлов
			
			try {
				Scanner sc1 = new Scanner(new File("Chetnue1"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mA[i][j] = sc1.nextInt();
						}
					}
				sc1.close();
				
//				System.out.println("read(first)'s ending");
				
				Scanner sc2 = new Scanner(new File("Chetnue2"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mB[i][j] = sc2.nextInt();
						}
					}
				sc2.close();
				
//				System.out.println("read(second)'s ending");
				
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
			System.out.println("Thread "+"6"+" finish!");
			
			//создание и запись файла
			
			FileWriter fw;
			try {
				fw = new FileWriter(new File("Result6"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						result = String.valueOf(res[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException ex) {}	
		}
		
		if(cb7.isSelected()){
//считывает матрицы с файлов
			
			try {
				Scanner sc1 = new Scanner(new File("neChetnue7.1"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mA[i][j] = sc1.nextInt();
						}
					}
				sc1.close();
				
//				System.out.println("read(first)'s ending");
				
				Scanner sc2 = new Scanner(new File("neChetnue7.2"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mB[i][j] = sc2.nextInt();
						}
					}
				sc2.close();
				
//				System.out.println("read(second)'s ending");
				
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
			System.out.println("Thread "+"7"+" finish!");
			
			//создание и запись файла
			
			FileWriter fw;
			try {
				fw = new FileWriter(new File("Result7"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						result = String.valueOf(res[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException ex) {}	
		}
		
		if(cb8.isSelected()){
//считывает матрицы с файлов
			
			try {
				Scanner sc1 = new Scanner(new File("Chetnue1"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mA[i][j] = sc1.nextInt();
						}
					}
				sc1.close();
				
//				System.out.println("read(first)'s ending");
				
				Scanner sc2 = new Scanner(new File("Chetnue2"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mB[i][j] = sc2.nextInt();
						}
					}
				sc2.close();
				
//				System.out.println("read(second)'s ending");
				
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
			System.out.println("Thread "+"8"+" finish!");
			
			//создание и запись файла
			
			FileWriter fw;
			try {
				fw = new FileWriter(new File("Result8"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						result = String.valueOf(res[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException ex) {}	
		}
		
		if(cb9.isSelected()){
//считывает матрицы с файлов
			
			try {
				Scanner sc1 = new Scanner(new File("neChetnue9.1"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mA[i][j] = sc1.nextInt();
						}
					}
				sc1.close();
				
//				System.out.println("read(first)'s ending");
				
				Scanner sc2 = new Scanner(new File("neChetnue9.2"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mB[i][j] = sc2.nextInt();
						}
					}
				sc2.close();
				
//				System.out.println("read(second)'s ending");
				
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
			System.out.println("Thread "+"9"+" finish!");
			
			//создание и запись файла
			
			FileWriter fw;
			try {
				fw = new FileWriter(new File("Result9"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						result = String.valueOf(res[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException ex) {}	
		}
		
		if(cb10.isSelected()){
//считывает матрицы с файлов
			
			try {
				Scanner sc1 = new Scanner(new File("Chetnue1"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mA[i][j] = sc1.nextInt();
						}
					}
				sc1.close();
				
//				System.out.println("read(first)'s ending");
				
				Scanner sc2 = new Scanner(new File("Chetnue2"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mB[i][j] = sc2.nextInt();
						}
					}
				sc2.close();
				
//				System.out.println("read(second)'s ending");
				
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
			System.out.println("Thread "+"10"+" finish!");
			
			//создание и запись файла
			
			FileWriter fw;
			try {
				fw = new FileWriter(new File("Result10"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						result = String.valueOf(res[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException ex) {}	
		}
		
		if(cb11.isSelected()){
//считывает матрицы с файлов
			
			try {
				Scanner sc1 = new Scanner(new File("neChetnue11.1"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mA[i][j] = sc1.nextInt();
						}
					}
				sc1.close();
				
//				System.out.println("read(first)'s ending");
				
				Scanner sc2 = new Scanner(new File("neChetnue11.2"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mB[i][j] = sc2.nextInt();
						}
					}
				sc2.close();
				
//				System.out.println("read(second)'s ending");
				
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
			System.out.println("Thread "+"11"+" finish!");
			
			//создание и запись файла
			
			FileWriter fw;
			try {
				fw = new FileWriter(new File("Result11"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						result = String.valueOf(res[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException ex) {}	
		}
		
		if(cb12.isSelected()){
//считывает матрицы с файлов
			
			try {
				Scanner sc1 = new Scanner(new File("Chetnue1"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mA[i][j] = sc1.nextInt();
						}
					}
				sc1.close();
				
//				System.out.println("read(first)'s ending");
				
				Scanner sc2 = new Scanner(new File("Chetnue2"));
				for (int i = 0; i < 100; i++){
						for (int j = 0; j < 100; j++){
							mB[i][j] = sc2.nextInt();
						}
					}
				sc2.close();
				
//				System.out.println("read(second)'s ending");
				
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
			System.out.println("Thread "+"12"+" finish!");
			
			//создание и запись файла
			
			FileWriter fw;
			try {
				fw = new FileWriter(new File("Result12"));
				for (int i = 0; i < res.length; i++) {
					for (int j = 0; j < res[0].length; j++) {
						result = String.valueOf(res[i][j]) + "      ";
						fw.append(result);
					}
					fw.append("\n" );
				}
				fw.flush();
				fw.close();
			} catch (IOException ex) {}	
		}
		
		String time2 = find_time();
		time2 = time2.substring(9);
		String time2_2 = find_time();
		time2_2 = time2_2.substring(6,8);
		int think2 = Integer.parseInt(time2);
		int think2_2 = Integer.parseInt(time2_2);
		
		if(think2_2 > think1_1){
			int abs2 = Math.abs(think2_2 - think1_1);
			
			if(think1 > think2){
				int abs = Math.abs(think2 - think1);
				think = 999 - abs;
			}
			else{
				int abs = Math.abs(think2 - think1);
				 think = abs;
			}
			
			System.out.println(abs2 +" sec. and "+ think +" milisec.");
		}
		
		if(think2_2 == think1_1){
			if(think1 > think2){
				int abs = Math.abs(think2 - think1);
				think = 999 - abs;
			}
			else{
				int abs = Math.abs(think2 - think1);
				 think = abs;
			}
			
			System.out.println(think +" milisec.");
		}
	}
	
	public static String find_time(){
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:SS");
		String t1 = sdf.format(cal.getTime());
		return t1;
	}
}
