import java.util.ArrayList;
import java.io.PrintStream;

class ArrayListStack implements StackInterface {

	ArrayList<Character> c;

	ArrayListStack() { this.c = null; }

	ArrayListStack(final ArrayList<Character> l) { this.c = l; }

	public char top() throws Exception{

		if (this.c==null){throw new Exception();}
		else{return c.get(0);}

	}

	public void pop() {c.remove(0);}

	public void push(final char a) {c.add(0,a);}

	public boolean isEmpty() { return c == null; }

	public void show(PrintStream p) throws Exception{

		if(c==null){

			throw new Exception("The stack is empty");

		}

		else{

			ArrayList<Character> current = this.c;
			for (int i=0; i<current.size(); i++){
				p.print(current.get(i));

			}

		}

	}


	public String toString(){

		String x="";

		if(this.c==null){

			return x;

		}

		else{

			ArrayList<Character> current = this.c;
			for (int i=0; i<current.size(); i++){

				x+=current.get(i);

			}

			return x;

		}

	}


	public static void main(String[] args) throws Exception{

		ArrayList<Character> list = new ArrayList<Character>();
		ArrayListStack s = new ArrayListStack(list); 
		PrintStream p = new PrintStream(System.out);
		s.push('d');
		s.push('c');
		s.push('b');
		s.push('a');
		System.out.println(s.toString());
		s.show(p);

	}

}

