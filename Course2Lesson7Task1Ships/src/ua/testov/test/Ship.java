package ua.testov.test;

public class Ship implements Runnable{
	private int boxFromShips;
	private Docs d;

	public Ship() {
		super();

	}

	public Ship(int boxFromShips, Docs d) {
		super();
		this.boxFromShips = boxFromShips;
		this.d = d;
	}

	public int getBoxFromShips() {
		return boxFromShips;
	}

	@Override
	public void run() {
		this.d.setBoxFromDocs(this.boxFromShips);
	}
}


//package ua.testov.test;
//
//import java.util.concurrent.Callable;
//
//public class Ship implements Callable<Integer>{
//	private int boxFromShips;
//	private Docs d;
//
//	public Ship() {
//		super();
//
//	}
//
//	public Ship(int boxFromShips, Docs d) {
//		super();
//		this.boxFromShips = boxFromShips;
//		this.d = d;
//	}
//
//	public int getBoxFromShips() {
//		return boxFromShips;
//	}
//
//	@Override
//	public Integer call() {
//	