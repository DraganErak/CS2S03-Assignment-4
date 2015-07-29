import static org.junit.Assert.*;
import java.io.PrintStream;
import java.util.ArrayList;
import org.junit.Test;

//Because I don't think the professor taught us how to test for exceptions, I found out how to do it on this website.
//http://stackoverflow.com/questions/10148101/junit-testing-assertequals-for-exception

public class a4test {

	@Test
	public void test() throws Exception {

		//Test for Stack(List)

		PrintStream p = new PrintStream(System.out);
		List c1 = null;
		Stack s1 = new Stack(c1);
		List c2 = null;
		Stack s2 = new Stack(c2);

		//Scenario 1 - Exception

		try{s1.top();}
		catch (Exception e) {

			assertEquals ("The stack is empty",e.getMessage());

		}

		//Scenario 2 - Exception

		try{s2.top();}
		catch (Exception e) {

			assertEquals ("The stack is empty",e.getMessage());

		}

		//Scenario 3 - Exception
		try{s1.show(p);}
		catch (Exception e) {

			assertEquals ("The stack is empty",e.getMessage());

		}


		//Scenario 4 - Push

		s1.push('z');//1
		s1.push('y');//2
		s1.push('x');//3
		s1.push('w');//4
		s1.push('v');//5
		s1.push('u');//6
		s1.push('t');//7
		s1.push('s');//8
		s1.push('r');//9
		s1.push('q');//10
		s1.push('p');//11
		s1.push('o');//12
		s1.push('n');//13
		s1.push('m');//14
		s1.push('l');//15
		s1.push('k');//16
		s1.push('j');//17
		s1.push('i');//18
		s1.push('h');//19
		s1.push('g');//20
		s1.push('f');//21
		s1.push('e');//22
		s1.push('d');//23
		s1.push('c');//24
		s1.push('b');//25
		s1.push('a');//26

		assertEquals("abcdefghijklmnopqrstuvwxyz", s1.toString());

		//Scenario 5 - Top

		assertEquals('a',s1.top());

		//Scenario 6 - Pop

		s1.pop();

		assertEquals("bcdefghijklmnopqrstuvwxyz", s1.toString());

		//Scenario 7 - Push

		s1.push('p');

		assertEquals("pbcdefghijklmnopqrstuvwxyz", s1.toString());

		//Scenario 8 - Top

		assertEquals('p',s1.top());

		//Scenario 9 - Pop

		s1.pop();

		assertEquals("bcdefghijklmnopqrstuvwxyz", s1.toString());

		//Scenario 10 - isEmpty

		assertEquals(false,s1.isEmpty());


		//---------------------------------------------------------------------------------------------------------------------------------


		//Test for Stack(ArrayList)

		ArrayList<Character> c3 = new ArrayList<Character>();
		ArrayListStack s3 = new ArrayListStack(c3); 
		ArrayList<Character> c4 = new ArrayList<Character>();
		ArrayListStack s4 = new ArrayListStack(c4); 

		//Scenario 1 - Exception

		try{s3.top();}
		catch (Exception e) {

			assertEquals ("Index: 0, Size: 0",e.getMessage());

		}

		//Scenario 2 - Exception

		try{s4.top();}
		catch (Exception e) {

			assertEquals ("Index: 0, Size: 0",e.getMessage());

		}

		//Scenario 3 - Exception

		try{s3.show(p);}
		catch (Exception e) {

			assertEquals ("Index: 0, Size: 0",e.getMessage());

		}

		//Scenario 4 - Push

		s3.push('z');//1
		s3.push('y');//2
		s3.push('x');//3
		s3.push('w');//4
		s3.push('v');//5
		s3.push('u');//6
		s3.push('t');//7
		s3.push('s');//8
		s3.push('r');//9
		s3.push('q');//10
		s3.push('p');//11
		s3.push('o');//12
		s3.push('n');//13
		s3.push('m');//14
		s3.push('l');//15
		s3.push('k');//16
		s3.push('j');//17
		s3.push('i');//18
		s3.push('h');//19
		s3.push('g');//20
		s3.push('f');//21
		s3.push('e');//22
		s3.push('d');//23
		s3.push('c');//24
		s3.push('b');//25
		s3.push('a');//26

		assertEquals("abcdefghijklmnopqrstuvwxyz", s3.toString());

		//Scenario 5 - Top

		assertEquals('a',s3.top());

		//Scenario 6 - Pop

		s3.pop();

		assertEquals("bcdefghijklmnopqrstuvwxyz", s3.toString());

		//Scenario 7 - Push

		s3.push('p');

		assertEquals("pbcdefghijklmnopqrstuvwxyz", s3.toString());

		//Scenario 8 - Top

		assertEquals('p',s3.top());

		//Scenario 9 - Pop

		s3.pop();

		assertEquals("bcdefghijklmnopqrstuvwxyz", s3.toString());

		//Scenario 10 - isEmpty

		assertEquals(false,s3.isEmpty());


		//--------------------------------------------------------------------------------------------------------------------------


		//Test for Queue

		SnocList sl1 = null;
		Queue q1 = new Queue(sl1);
		SnocList sl2 = null;
		Queue q2 = new Queue(sl2);

		//Scenario 1 - Exception

		try{q1.peek();}
		catch (Exception e) {

			assertEquals ("The stack is empty",e.getMessage());

		}

		//Scenario 2 - Exception

		try{q2.peek();}
		catch (Exception e) {

			assertEquals ("The stack is empty",e.getMessage());

		}

		//Scenario 3 - Exception

		try{q1.show(p);}
		catch (Exception e) {

			assertEquals ("The stack is empty",e.getMessage());

		}

		//Scenario 4 - enqueue

		q1.enqueue('z');//1
		q1.enqueue('y');//2
		q1.enqueue('x');//3
		q1.enqueue('w');//4
		q1.enqueue('v');//5
		q1.enqueue('u');//6
		q1.enqueue('t');//7
		q1.enqueue('s');//8
		q1.enqueue('r');//9
		q1.enqueue('q');//10
		q1.enqueue('p');//11
		q1.enqueue('o');//12
		q1.enqueue('n');//13
		q1.enqueue('m');//14
		q1.enqueue('l');//15
		q1.enqueue('k');//16
		q1.enqueue('j');//17
		q1.enqueue('i');//18
		q1.enqueue('h');//19
		q1.enqueue('g');//20
		q1.enqueue('f');//21
		q1.enqueue('e');//22
		q1.enqueue('d');//23
		q1.enqueue('c');//24
		q1.enqueue('b');//25
		q1.enqueue('a');//26

		assertEquals("abcdefghijklmnopqrstuvwxyz", q1.toString());

		//Scenario 5 - peek

		assertEquals('a',q1.peek());

		//Scenario 6 - dequeue

		q1.dequeue();

		assertEquals("bcdefghijklmnopqrstuvwxyz", q1.toString());

		//Scenario 7 - enqueue

		q1.enqueue('p');

		assertEquals("pbcdefghijklmnopqrstuvwxyz", q1.toString());

		//Scenario 8 - peek

		assertEquals('p',q1.peek());

		//Scenario 9 - dequeue
		q1.dequeue();

		assertEquals("bcdefghijklmnopqrstuvwxyz", q1.toString());

		//Scenario 10 - isEmpty

		assertEquals(false,q1.isEmpty());


		//--------------------------------------------------------------------------------------------------------------------------------


		//Test for PriQueue
		PList p1 = null;
		PriQueue pq1 = new PriQueue(p1);
		PList p2 = null;
		PriQueue pq2 = new PriQueue(p2);

		//Scenario 1 - Exception
		try{pq1.next();}
		catch (Exception e) {

			assertEquals ("The stack is empty",e.getMessage());}



		//Scenario 2 - Exception

		try{pq2.next();}
		catch (Exception e) {

			assertEquals ("The stack is empty",e.getMessage());

		}

		//Scenario 3 - Exception

		try{pq1.show(p);}
		catch (Exception e) {

			assertEquals ("The stack is empty",e.getMessage());

		}

		//Scenario 4 - insertItem

		pq1.insertItem(1,'z');
		pq1.insertItem(2,'y');
		pq1.insertItem(3,'x');
		pq1.insertItem(4,'w');
		pq1.insertItem(5,'v');
		pq1.insertItem(6,'u');
		pq1.insertItem(7,'t');
		pq1.insertItem(8,'s');
		pq1.insertItem(9,'r');
		pq1.insertItem(10,'q');
		pq1.insertItem(11,'p');
		pq1.insertItem(12,'o');
		pq1.insertItem(13,'n');
		pq1.insertItem(14,'m');
		pq1.insertItem(15,'l');
		pq1.insertItem(16,'k');
		pq1.insertItem(17,'j');
		pq1.insertItem(18,'i');
		pq1.insertItem(19,'h');
		pq1.insertItem(20,'g');
		pq1.insertItem(21,'f');
		pq1.insertItem(22,'e');
		pq1.insertItem(23,'d');
		pq1.insertItem(24,'c');
		pq1.insertItem(25,'b');
		pq1.insertItem(26,'a');

		assertEquals("abcdefghijklmnopqrstuvwxyz", pq1.toString());

		//Scenario 5 - peek

		assertEquals('a',pq1.next());

		//Scenario 6 - dequeue

		pq1.deleteItem();

		assertEquals("bcdefghijklmnopqrstuvwxyz", pq1.toString());

		//Scenario 7 - insertItem

		pq1.insertItem(0,'p');

		assertEquals("bcdefghijklmnopqrstuvwxyzp", pq1.toString());

		//Scenario 8 - peek

		assertEquals('b',pq1.next());

		//Scenario 9 - dequeue

		pq1.deleteItem();

		assertEquals("cdefghijklmnopqrstuvwxyzp", pq1.toString());

		//Scenario 10 - isEmpty

		assertEquals(false,pq1.isEmpty());

	}

}
