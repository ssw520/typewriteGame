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
				System.out.println("你输入的太慢了，已经超时");
				System.exit(1);
			} else {
				player.setCurSorce(player.getCurSorce()
						+ LevelParam.levels[player.getLevelNo() - 1]
								.getPerScore());
				player.setElapsedTime((int) ((currentTime - player
						.getStartTime()) / 1000));
				System.out.println("输入正确，你的级别：" + player.getLevelNo()
						+ "当前分数： " + player.getCurSorce() + "已用时间： "
						+ player.getElapsedTime());
			}
			if (player.getLevelNo() == 6) {
				int score = LevelParam.levels[player.getLevelNo() - 1]
						.getPerScore()
						* LevelParam.levels[player.getLevelNo() - 1]
								.getStrTime();
				if(score == player.getCurSorce()){
					System.out.println("你一闯关成功，成为绝顶高手");
					System.exit(0);
				}
			}
		} else {
			System.out.println("输入有误，退出！");
			System.exit(1);
		}
	}
}
