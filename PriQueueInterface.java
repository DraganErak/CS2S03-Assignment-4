import java.io.PrintStream;

public interface PriQueueInterface {
	
	public char next() throws Exception;
	
	public void deleteItem();
	
	public void insertItem(int a, char c);
	
	public boolean isEmpty();
	
	public void show(PrintStream p) throws Exception;
	
}
