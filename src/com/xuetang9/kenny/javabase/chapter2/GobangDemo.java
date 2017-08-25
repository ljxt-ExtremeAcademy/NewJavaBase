package com.xuetang9.kenny.javabase.chapter2;

import javax.xml.stream.events.StartElement;

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
	//1.填充用来表示棋盘的二维数组
	static String[][] board = new String[19][19];
	
	public static void main(String[] args) {	
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
				if(i != 0 && i != board.length - 1 && j == 0){
					board[i][j] = "├";
				}else if(j != 0 & j != board[i].length - 1 && i == 0){
					board[i][j] = "┬";
				}else if(i != 0 && i != board.length - 1 && j == board[i].length - 1){
					board[i][j] = "┤";
				}else if(j != 0 & j != board[i].length - 1 && i == board.length - 1){
					board[i][j] = "┴";
				}
			}
		}
		
		board[9][9] = "●";
		board[10][10] = "●";
		board[11][11] = "●";
		board[12][12] = "●";
		board[13][13] = "●";
		board[0][9] = "○";
		
		//2.打印二维数组
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
		
		isWin("●", 11, 11);
	}
	/**
	 * 判断某个棋手是否赢得了比赛
	 * @param chess 棋子类型●或○
	 * @param row
	 * @param col
	 * @return
	 */
	public static boolean isWin(String chess, int row, int col){
		int count = 0;	//某色棋子的数量
		//横向
		for(int i = 0; i < board[col].length; i++){
			if(board[row][i].equals(chess)){
				count++;
			}else{
				count = 0;
			}
			if(count == 5) return true;
		}
		//纵向
		count = 0;
		for(int i = 0; i < board.length; i++){
			if(board[i][col].equals(chess)){
				count++;
			}else{
				count = 0;
			}
			if(count == 5) return true;
		}
		//左斜
		count = 0;
		int startRow = row;
		int startCol = col;
//		while(true){//找到当前棋子右上角对应的起始点坐标
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
		//左斜第二种思路，分别计算右上和左下的同色棋子总数
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
		//右斜思路，分别计算右下和左上的同色棋子总数
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
		
		System.out.println("右斜棋子总数：" + count);		
		return true;
	}
	
	

}
