package ua.testov.test;

import java.io.File;

public class Main {
	public static void main(String[] args) {
		Docs docOne = new Docs();
		Docs docTwo = new Docs();

		Ship shipOne = new Ship(10, docOne);
		Ship shipTwo = new Ship(10, docTwo);
		Ship[] ship = new Ship[] {shipOne, shipTwo };
		Thread[] arrThread = new Thread[2];
		for (int i = 0; i < arrThread.length; i++) {
			arrThread[i] = new Thread(ship[i]);
		}
		for (int i = 0; i < 2; i++) {
			arrThread[i].start();
		}
		for (int i = 0; i < arrThread.length; i++) {
			joinThread(arrThread[i]);
		}
		if (!arrThread[0].isAlive()) {
			Ship shipThree = new Ship(10, docOne);
			Thread threadThree = new Thread(shipThree);
			threadThree.start();
			joinThread(threadThree);
		} else {
			Ship shipThree = new Ship(10, docTwo);
			Thread threadThree = new Thread(shipThree);
			threadThree.start();
			joinThread(threadThree);
		}
		System.out.println(docOne.getBoxFromDocs());

	}

	public static void joinThread(Thread th) {
		try {
			th.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
