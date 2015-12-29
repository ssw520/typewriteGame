package game1;

import java.util.Random;

public class Game {
	private Player player;

	public Game(Player player) {
		this.player = player;
	}

	public String printStr() {
		int stringLenght = LevelParam.levels[player.getLevelNo() - 1]
				.getStrLength();
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();
		for (int i = 0; i < stringLenght; i++) {
			int rand = random.nextInt(95) + 33;
			buffer.append((char) rand);
		}
		System.out.println(buffer);
		return buffer.toString();
	}

	public void printResult(String out, String in) {
		boolean flag;
		if (out.equals(in)) {
			flag = true;
		} else {
			flag = false;
		}
		if (flag) {
			long currentTime = System.currentTimeMillis();
			if ((currentTime - player.getStartTime()) / 1000 > LevelParam.levels[player
					.getLevelNo() - 1].getTimeLimit()) {
				System.out.println("�������̫���ˣ��Ѿ���ʱ");
				System.exit(1);
			} else {
				player.setCurSorce(player.getCurSorce()
						+ LevelParam.levels[player.getLevelNo() - 1]
								.getPerScore());
				player.setElapsedTime((int) ((currentTime - player
						.getStartTime()) / 1000));
				System.out.println("������ȷ����ļ���" + player.getLevelNo()
						+ "��ǰ������ " + player.getCurSorce() + "����ʱ�䣺 "
						+ player.getElapsedTime());
			}
			if (player.getLevelNo() == 6) {
				int score = LevelParam.levels[player.getLevelNo() - 1]
						.getPerScore()
						* LevelParam.levels[player.getLevelNo() - 1]
								.getStrTime();
				if(score == player.getCurSorce()){
					System.out.println("��һ���سɹ�����Ϊ��������");
					System.exit(0);
				}
			}
		} else {
			System.out.println("���������˳���");
			System.exit(1);
		}
	}
}
