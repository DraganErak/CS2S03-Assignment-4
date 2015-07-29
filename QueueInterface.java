import java.io.PrintStream;

public interface QueueInterface {
	
	public char peek() throws Exception;
	
	public void dequeue();
	
	public void enqueue(char c);
	
	public boolean isEmpty();
	
	public void show(PrintStream p) throws Exception;
	
}
