package com.xuetang9.kenny.javabase.chapter2;
/**
 * 使用控制台打印围棋的棋盘
 * @author 老九学堂·窖头
 * @version 1.0
 * @date 2017年7月13日 下午9:24:04
 * @copyright 老九学堂
 * @remarks TODO
 *
 */
public class GobangDemo {
	public static void main(String[] args) {
		//1.填充用来表示棋盘的二维数组
		String[][] board = new String[19][19];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if(i == 0 && j == 0){//棋盘的左上角
					board[i][j] = "┌";
				}else if(i == 0 && j == board[i].length - 1){
					board[i][j] = "┐";
				}else if(i == board.length - 1 && j == 0){
					board[i][j] = "└";
				}else if(i == board.length - 1 && j == board[i].length - 1){
					board[i][j] = "┘";
				}else if(i == 0 || i == board.length - 1){
					board[i][j] = "─";
				}else if(j == 0 || j == board[i].length - 1){
					board[i][j] = "│";
				}else{
					//打印9个黑星    3   9   15
					if((i - 3) % 6 == 0 && (j - 3) % 6 == 0){
						board[i][j] = "☆";
					}else
						board[i][j] = "┼";
				}
			}
		}
		
		board[3][9] = "●";
		board[3][10] = "○";
		
		//2.打印二维数组
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}

	}

}
