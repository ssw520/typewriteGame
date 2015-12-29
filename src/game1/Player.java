package game1;

import java.util.Scanner;

public class Player {
	private int levelNo; //�����
	private int curSorce; //��ǰ����
	private long startTime = 0; //������ʼʱ��
	private int elapsedTime;  // ����������ʱ��
	public int getLevelNo() {
		return levelNo;
	}
	public void setLevelNo(int levelNo) {
		this.levelNo = levelNo;
	}
	public int getCurSorce() {
		return curSorce;
	}
	public void setCurSorce(int curSorce) {
		this.curSorce = curSorce;
	}
	public long getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	
	public void play(){
		Game game = new Game(this);
		Scanner input = new Scanner(System.in);
		for(int i =- 0; i < LevelParam.levels.length; i++){
			this.levelNo += 1;
			this.startTime = System.currentTimeMillis();
			this.curSorce = 0;
			for(int j = 0; j < LevelParam.levels[levelNo -1].getStrTime(); j++){
				String outString = game.printStr();
			//	String inString = input.next();
				String inString = outString;
				System.out.println(inString);
				
				 game.printResult(outString, inString);
			}
		}
	}
}
