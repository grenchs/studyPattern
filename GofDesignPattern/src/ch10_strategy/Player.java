package ch10_strategy;

import javax.swing.WindowConstants;

public class Player {
	private String name;
	private Strategy strategy;
	private int wincount;
	private int losecount;
	private int gamecount;

	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}

	public Hand nextHand() {
		return strategy.nextHand();
	}

	public void win() {
		strategy.study(true);
		wincount++;
		gamecount++;
	}

	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}

	public void even() {
		gamecount++;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(name);
		sb.append(":");
		sb.append(gamecount);
		sb.append(" games, ");
		sb.append(wincount);
		sb.append(" win,");
		sb.append(losecount);
		sb.append(" lose]");
		return sb.toString();
	}
}
