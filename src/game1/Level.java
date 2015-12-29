package game1;

public class Level {
	private int strLength; // ������һ������ַ����ĳ���
	private int strTime; // ����������ַ����Ĵ���	
	private int timeLimit; // �����𴳹ص�ʱ������
	private int levelNo; // �����
	private int perScore;// ������ɹ�����һ���ַ��������ӵķ�ֵ
	/**
	 * 
	 * @param levelNo �����
	 * @param strLength ������һ������ַ����ĳ���
	 * @param strTime ����������ַ����Ĵ���	
	 * @param timeLimit �����𴳹ص�ʱ������
	 * @param perScore ������ɹ�����һ���ַ��������ӵķ�ֵ
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
