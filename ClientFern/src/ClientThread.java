


import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class ClientThread extends Thread{
	private NewJFrame frame;
        private Socket socket;
	private ObjectInputStream ois;
	
	public ClientThread(NewJFrame frame, Socket socket){
		this.frame=frame;
		this.socket=socket;
		setDaemon(true);
		start();
	}
	
	public void run(){
		try {
			ois=new ObjectInputStream(socket.getInputStream());
                        while(true){
                            ArrayList tmp=(ArrayList)ois.readObject();
                            
                            switch ((int)tmp.get(0)){
                                    case 1:frame.setLineUp((DefaultTableModel)tmp.get(1));break;
                                    case 2:frame.setErg((DefaultTableModel)tmp.get(1),(DefaultTableModel)tmp.get(2));System.out.println("bekommen");break;
                                }
			}
		}catch(EOFException ie){}
		 catch(IOException ie){ie.printStackTrace();} 
		catch (ClassNotFoundException e) {e.printStackTrace();}
		 finally{
			 
		 }
	}
}