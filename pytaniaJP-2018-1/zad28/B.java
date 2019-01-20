import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class B {
	public static void main(String[] args) throws ... {
		Registry r = LocateRegistry.getRegistry(2000);
		((I)r.lookup("A")).m();
		
	}
}