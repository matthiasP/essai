package td2;

import java.io.*;
import java.net.Socket;
import java.util.Vector;

public class SyncSocket extends Socket {
	
	private Socket s;
	BufferedReader in;
	PrintWriter out;
	//String msg;
	
	public SyncSocket(Socket s) throws IOException {
		this.s = s;
		in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		out = new PrintWriter(s.getOutputStream());
	}
	
	public synchronized void Send (String mess) throws IOException {

		
	}

	// on attend un message de type in-op1 ou in-op2
	public synchronized String receive(Vector<String> mess) throws IOException {
		
		/* inutile
		while(mess.size() == 0){
			try {
				wait();
			} catch (InterruptedException e) {}
		} */
		
		String buffIn;
		
		do{
			// je lis la nouvelle valeur de in
			buffIn = in.readLine();
		} while(!mess.contains(buffIn));
		
		return buffIn;
		//return null;
	}
}
