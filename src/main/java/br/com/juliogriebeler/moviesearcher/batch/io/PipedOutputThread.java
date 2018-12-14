/**
 * 
 */
package br.com.juliogriebeler.moviesearcher.batch.io;

import java.io.PipedOutputStream;

/**
 * @author Julio
 *
 */
public class PipedOutputThread implements Runnable {
	   
	final static PipedOutputStream pipedOut = new PipedOutputStream();

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
