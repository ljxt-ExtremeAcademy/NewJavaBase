package com.xuetang9.kenny.javabase.chapter2;

import javax.xml.stream.events.StartElement;

/**
 * ʹ�ÿ���̨��ӡΧ�������
 * @author �Ͼ�ѧ�á���ͷ
 * @version 1.0
 * @date 2017��7��13�� ����9:24:04
 * @copyright �Ͼ�ѧ��
 * @remarks TODO
 *
 */
public class GobangDemo {
	//1.���������ʾ���̵Ķ�ά����
	static String[][] board = new String[19][19];
	
	public static void main(String[] args) {	
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {		
				if(i == 0 && j == 0){//���̵����Ͻ�
					board[i][j] = "��";
				}else if(i == 0 && j == board[i].length - 1){
					board[i][j] = "��";
				}else if(i == board.length - 1 && j == 0){
					board[i][j] = "��";
				}else if(i == board.length - 1 && j == board[i].length - 1){
					board[i][j] = "��";
				}else if(i == 0 || i == board.length - 1){
					board[i][j] = "��";
				}else if(j == 0 || j == board[i].length - 1){
					board[i][j] = "��";
				}else{
					//��ӡ9������    3   9   15
					if((i - 3) % 6 == 0 && (j - 3) % 6 == 0){
						board[i][j] = "��";
					}else
						board[i][j] = "��";
				}
				if(i != 0 && i != board.length - 1 && j == 0){
					board[i][j] = "��";
				}else if(j != 0 & j != board[i].length - 1 && i == 0){
					board[i][j] = "��";
				}else if(i != 0 && i != board.length - 1 && j == board[i].length - 1){
					board[i][j] = "��";
				}else if(j != 0 & j != board[i].length - 1 && i == board.length - 1){
					board[i][j] = "��";
				}
			}
		}
		
		board[9][9] = "��";
		board[10][10] = "��";
		board[11][11] = "��";
		board[12][12] = "��";
		board[13][13] = "��";
		board[0][9] = "��";
		
		//2.��ӡ��ά����
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
		isWin("��", 11, 11);
	}
	/**
	 * �ж�ĳ�������Ƿ�Ӯ���˱���
	 * @param chess �������͡���
	 * @param row
	 * @param col
	 * @return
	 */
	public static boolean isWin(String chess, int row, int col){
		int count = 0;	//ĳɫ���ӵ�����
		//����
		for(int i = 0; i < board[col].length; i++){
			if(board[row][i].equals(chess)){
				count++;
			}else{
				count = 0;
			}
			if(count == 5) return true;
		}
		//����
		count = 0;
		for(int i = 0; i < board.length; i++){
			if(board[i][col].equals(chess)){
				count++;
			}else{
				count = 0;
			}
			if(count == 5) return true;
		}
		//��б
		count = 0;
		int startRow = row;
		int startCol = col;
//		while(true){//�ҵ���ǰ�������ϽǶ�Ӧ����ʼ������
//			startRow--;
//			startCol++;	
//			if(startRow < 0 || startCol > board[row].length - 1){
//				startRow++;
//				startCol--;
//				break;
//			}
//		}
//		System.out.println(startRow + "\t" + startCol);
//		while(startRow < board.length - 1 && startCol > 0){
//			if(board[startRow][startCol].equals(chess)){
//				count++;
//			}else{
//				count = 0;
//			}
//			if(count == 5) return true;
//			startRow++;
//			startCol--;
//		}
		//��б�ڶ���˼·���ֱ�������Ϻ����µ�ͬɫ��������
		while(startRow > -1 && startCol < board[col].length){
			if(board[startRow][startCol].equals(chess)){
				count++;
			}
			if(count == 5) return true;// true;
			startRow--;
			startCol++;
		}	
		startRow = row + 1;
		startCol = col - 1;
		while(startRow < board.length && startCol > -1){
			if(board[startRow][startCol].equals(chess)){
				count++;
			}
			if(count == 5) return true;// true;
			startRow++;
			startCol--;
		}
		//��б˼·���ֱ�������º����ϵ�ͬɫ��������
		startRow = row;
		startCol = col;
		count = 0;
		while(startRow > -1 && startCol > -1){
			if(board[startRow][startCol].equals(chess)){
				count++;
			}
			if(count == 5) return true;// true;
			startRow--;
			startCol--;
		}	
		startRow = row + 1;
		startCol = col + 1;
		while(startRow < board.length && startCol < board[row].length){
			if(board[startRow][startCol].equals(chess)){
				count++;
			}
			if(count == 5) return true;// true;
			startRow++;
			startCol++;
		}	
		
		System.out.println("��б����������" + count);		
		return true;
	}
	
	

}
