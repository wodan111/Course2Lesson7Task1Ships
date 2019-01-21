package ua.testov.test;

import java.util.concurrent.*;

public class Main {

	public static void main(String[] args) {

		ExecutorService exec = Executors.newFixedThreadPool(2);
		Ship[] ships = new Ship[3];
		Docs d = new Docs();

		try {
			for (int i = 0; i < ships.length; i++) {
				Ship ship = new Ship(10, d);
				Future<?> fut = exec.submit(ship);
				try {
					fut.get();
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		} finally {
			exec.shutdown();

			System.out.println(d.getBoxFromDocs());
		}
	}
}
