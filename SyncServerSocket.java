package td2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SyncServerSocket extends ServerSocket {
	
	public SyncServerSocket() throws IOException {
		super();
	}

	public SyncServerSocket(int a, int p) throws IOException {
		super(a,p);
	}
	
	public SyncServerSocket(int a) throws IOException {
		super(a);
	}
	
	public Socket accept() throws IOException {
		
		return new SyncSocket(super.accept());
	}
}
