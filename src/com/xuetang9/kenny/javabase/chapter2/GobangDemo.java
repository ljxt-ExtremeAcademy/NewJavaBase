package com.xuetang9.kenny.javabase.chapter2;
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
	public static void main(String[] args) {
		//1.���������ʾ���̵Ķ�ά����
		String[][] board = new String[19][19];
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
			}
		}
		
		board[3][9] = "��";
		board[3][10] = "��";
		
		//2.��ӡ��ά����
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}

	}

}
