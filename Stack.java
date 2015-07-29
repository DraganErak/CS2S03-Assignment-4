import java.io.PrintStream;

class Stack implements StackInterface {

	private List c;

	Stack() { this.c = null; }

	Stack(final List l) { this.c = l; }

	public char top() throws Exception{ 

		if (this.c==null){throw new Exception("The stack is empty");}
		else{return c.hd;}

	}

	public void pop() { c = c.tl; }

	public void push(final char a) { c = new List(a, c); }

	public boolean isEmpty() { return c == null; }

	public void show(PrintStream p) throws Exception{

		if(c==null){

			throw new Exception("The stack is empty");

		}

		else{

			List current = this.c;
			while(current!=null){

				char currenta = current.hd;
				p.print(currenta);
				current = current.tl;

			}

		}

	}


	public String toString(){
		String x="";

		if(this.c==null){

			return x;

		}
		else{

			List current = this.c;
			while(current!=null){

				char currenta = current.hd;
				x+=currenta;
				current = current.tl;

			}

			return x;

		}

	}

	public static void main(String[] args) throws Exception{

		List c = null;
		Stack s = new Stack(c);
		PrintStream p = new PrintStream(System.out);
		s.push('c');
		s.push('b');
		s.push('a');
		System.out.println(s.toString());
		s.show(p);

	}

}

