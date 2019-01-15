package ua.testov.test; 

public class Docs {
	private static int boxFromDocs;

	public Docs() {
		super();
	}

	public int getBoxFromDocs() {
		return boxFromDocs;
	}

	public synchronized void setBoxFromDocs(int boxFromShips) {
		int count = 0;
		for (int i = 0; i < boxFromShips; i++) {
			count = count + 1;
			sleepShip();
		}
		boxFromDocs = getBoxFromDocs() + count;
	}

	private void sleepShip() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
