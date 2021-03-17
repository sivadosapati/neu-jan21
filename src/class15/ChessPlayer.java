package class15;

public class ChessPlayer extends Person {

	private boolean myTurn = true;
	private ChessPlayer opponent;
	
	public ChessPlayer(String name) {
		super(name);

		// TODO Auto-generated constructor stub
	}

	public void setOpponent(ChessPlayer opponent) {
		this.opponent = opponent;
	}

	public void think() {
		System.out.println(name + " is thinking");
	}

	public void placeAMove() {
		System.out.println(name + " is placing a move");
	}

	public void play() {

		while (true) {
			if (myTurn) {
				int x = getRandomNumber(5000);
				System.out.println(name + " is waiting for " + x + " ms before placing a move");
				pause(x);
				placeAMove();
				this.myTurn = false;
				opponent.myTurn = true;
				synchronized (opponent) {
					opponent.notify();
				}
			} else {
				try {
					synchronized (this) {
						wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public static void main(String args[]) {
		ChessPlayer cva = new ChessPlayer("Cva");
		ChessPlayer avni = new ChessPlayer("Avni");
		cva.setOpponent(avni);
		avni.setOpponent(cva);
		cva.myTurn = true;
		avni.myTurn = false;
		System.out.println("Start the Game");
		Thread a = new Thread(() -> cva.play());
		Thread b = new Thread(() -> avni.play());
		a.start();
		b.start();
		System.out.println("End the Game");

	}

}
