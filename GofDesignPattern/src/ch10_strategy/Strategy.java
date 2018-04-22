package ch10_strategy;

public interface Strategy {
	public abstract Hand nextHand();
	public abstract void study(boolean win);
}
