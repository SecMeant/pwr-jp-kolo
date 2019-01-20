import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

interface I extends Remote
{
  void m() throws RemoteException;
}
public
class A
{
  static I i = () -> System.out.println("m()");
public
  static void main(String[] args) throws ...
  {
    Registry r = LocateRegistry.createRegistry(2000);
    r.rebind("A", UnicastRemoteObject.exportObject(i, 0));
  }
}