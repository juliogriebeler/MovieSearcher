/**
 * 
 */
package br.com.juliogriebeler.moviesearcher.batch.io;

import java.io.PipedInputStream;

/**
 * @author Julio
 *
 */
public class PipedInputThread implements Runnable {
	final static PipedInputStream pipedIn = new PipedInputStream();

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
