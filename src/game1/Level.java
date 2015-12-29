package game1;

public class Level {
	private int strLength; // 各级别一次输出字符串的长度
	private int strTime; // 各级别输出字符串的次数	
	private int timeLimit; // 各级别闯关的时间限制
	private int levelNo; // 级别豪
	private int perScore;// 各级别成功输入一次字符串后增加的分值
	/**
	 * 
	 * @param levelNo 级别豪
	 * @param strLength 各级别一次输出字符串的长度
	 * @param strTime 各级别输出字符串的次数	
	 * @param timeLimit 各级别闯关的时间限制
	 * @param perScore 各级别成功输入一次字符串后增加的分值
	 */
	public Level(int levelNo, int strLength, int strTime, int timeLimit,
			 int perScore) {
		//super();
		this.strLength = strLength;
		this.strTime = strTime;
		this.perScore = perScore;
		this.timeLimit = timeLimit;
		this.levelNo = levelNo;
	}

	public int getStrLength() {
		return strLength;
	}
	public int getStrTime() {
		return strTime;
	}
	public int getPerScore() {
		return perScore;
	}
	public int getTimeLimit() {
		return timeLimit;
	}
	public int getLevelNo() {
		return levelNo;
	}

	
}
