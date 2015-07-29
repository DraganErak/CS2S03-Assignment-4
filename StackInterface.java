import java.io.PrintStream;

public interface StackInterface {
	
	public char top() throws Exception;
	
	public void pop();
	
	public void push(char c);
	
	public boolean isEmpty();
	
	public void show(PrintStream p) throws Exception;
	
}
