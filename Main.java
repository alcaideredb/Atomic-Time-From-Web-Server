import java.util.*;
import java.io.*;
import java.net.*;

public class Main {
	
	
	public static void main(String[] args) {
			final String ATOMIC_TIME_IP_ADDRESS = "129.6.15.30";
			final int ATOMIC_TIME_PORT = 13;
		
			try (Socket atomicTimeServerConnection = new Socket(ATOMIC_TIME_IP_ADDRESS, ATOMIC_TIME_PORT);
								   		BufferedReader in = new BufferedReader(new InputStreamReader(atomicTimeServerConnection.getInputStream())))  {

 										String line = null;
				while((line = in.readLine()) != null) {
					System.out.println(line);
				}
			} catch(IOException e) {
			e.printStackTrace();
		} 
			
	
	}
}