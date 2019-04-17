import java.net.MalformedURLException;
import java.nio.charset.MalformedInputException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
	public final static String HOST = "localhost" ;
	public static void main(String[] args) {
		try {
			String objectName = "rmi://" + HOST + "/hello";
			HelloInt hello = (HelloInt)Naming.lookup(objectName);
			System.out.println(hello.sayHello());
			double[] ar = {2, 5, 89, 1.3, 6.1};
			System.out.println(hello.average(ar));
		} catch (RemoteException e) {
			// TODO: handle exception
		}
		catch(MalformedURLException e) {
			
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
