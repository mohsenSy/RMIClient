import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloInt extends Remote {
	
	public String sayHello() throws RemoteException;
	public double average(double[] ar)throws RemoteException;

}
