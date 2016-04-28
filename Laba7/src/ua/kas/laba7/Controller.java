package ua.kas.laba7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.TextArea;

public class Controller {

	@FXML
	static
	TextArea ta;
	static String result;
	
	public void start(ActionEvent e) throws InterruptedException, IOException {

		Thread t1 = new Thread(new Thread_constr("1","Chetnue1","Chetnue2", "Result1"));
//		Thread t2 = new Thread(new Thread_constr(8,16,"2"));
//		Thread t3 = new Thread(new Thread_constr(16,24,"3"));
//		Thread t4 = new Thread(new Thread_constr(24,32,"4"));
//		Thread t5 = new Thread(new Thread_constr(32,40,"5"));
//		Thread t6 = new Thread(new Thread_constr(40,48,"6"));
//		Thread t7 = new Thread(new Thread_constr(48,56,"7"));
//		Thread t8 = new Thread(new Thread_constr(56,64,"8"));
//		Thread t9 = new Thread(new Thread_constr(64,72,"9"));
//		Thread t10 = new Thread(new Thread_constr(72,80,"10"));
//		Thread t11 = new Thread(new Thread_constr(80,88,"11"));
//		Thread t12 = new Thread(new Thread_constr(88,100,"12"));	
		
		t1.start();
//		t2.start();
//		t3.start();
//		t4.start();
//		t5.start();
//		t6.start();
//		t7.start();
//		t8.start();
//		t9.start();
//		t10.start();
//		t11.start();
//		t12.start();
		
		
//		int[][] mA = new int[100][100];
//		int[][] mB = new int[100][100];
//		Random random = new Random();
//		
//		File file = new File("Chetnue2");
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
}
