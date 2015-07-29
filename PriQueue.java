import java.io.PrintStream;

public class PriQueue implements PriQueueInterface {

	private PList p;

	PriQueue() { this.p = null; }

	PriQueue(final PList l) { this.p = l; }

	public char next() throws Exception{

		if (this.p==null){throw new Exception("The stack is empty");}
		else{return p.tail;}

	}

	public void deleteItem(){p=p.head;}

	public void insertItem(int a, char c){

		if (p == null) {

			p = new PList(c,a,null); 

		} 

		else if (p.priority < a || (p.priority == a && p.tail > c)){  

			p = new PList(c,a,p);

		} 

		else {

			PList temp = p;
			while (temp.head != null) {

				if (temp.head.priority > a || (temp.head.priority == a && temp.head.tail < c)) {
					temp = temp.head;

				} 

				else {

					break;

				}

			}

			temp.head = new PList(c,a,temp.head);

		}

	}


	public boolean isEmpty(){return p == null;}

	public void show(PrintStream p) throws Exception{

		if(p==null){

			throw new Exception("The stack is empty");

		}

		PList current = this.p;
		while(current!=null){

			char currenta = current.tail;
			p.print(currenta);
			current = current.head;

		}

	}


	public String toString(){

		String x="";

		if(this.p==null){

			return x;

		}
		else{

			PList current = this.p;
			while(current!=null){

				char currenta = current.tail;
				x+=currenta;
				current = current.head;

			}

			return x;

		}

	}


	public static void main(String[] args) throws Exception{

		PList pl = null;
		PriQueue pq = new PriQueue(pl);
		PrintStream p = new PrintStream(System.out);
		pq.insertItem(1,'c');
		pq.insertItem(3,'a');
		pq.insertItem(2,'b');
		pq.insertItem(2,'a');
		System.out.println(pq.toString());
		pq.show(p);

	}

}


