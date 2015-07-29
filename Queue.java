import java.io.PrintStream;

class Queue implements QueueInterface{

	private SnocList s;

	Queue() { this.s = null; }

	Queue(final SnocList l) { this.s = l; }

	public char peek() throws Exception{

		if (this.s==null){throw new Exception("The stack is empty");}
		else{return s.tll;}

	}

	public void dequeue() {s=s.hdd;}

	public void enqueue(char c) {s = new SnocList(c,s);}

	public boolean isEmpty() {return s == null;}

	public void show(PrintStream p) throws Exception{

		if(s==null){

			throw new Exception("The stack is empty");

		}

		else{

			SnocList current = this.s;
			while(current!=null){
				char currenta = current.tll;
				p.print(currenta);
				current = current.hdd;

			}

		}

	}


	public String toString(){

		String x="";

		if(this.s==null){

			return x;

		}

		else{

			SnocList current = this.s;
			while(current!=null){

				char currenta = current.tll;
				x+=currenta;
				current = current.hdd;
			}

			return x;

		}

	}


	public static void main(String[] args) throws Exception{

		SnocList s = null;
		Queue q = new Queue(s);
		PrintStream p = new PrintStream(System.out);
		q.enqueue('a');
		q.enqueue('b');
		q.enqueue('c');
		System.out.println(q.toString());
		q.show(p);

	}

}






