/**
 * @author Vincent Lee
 */

import java.util.ArrayList;

public class turing {
	public static void main(String[] args) {
		if (args.length != 1)
			System.out.println("usage: java turing input");
		else
			machine(args[0]);
	}
	
	public static void machine(String input) {
		boolean DEBUG = false;
		int counter = 2; //For testing
		
		//Using array list for expandability.
		ArrayList<String> tape = new ArrayList<String>();
		tape.add("q1"); //Add the first state in the machine.
				
		//populate array list with input
		for (int i = 0; i < input.length(); i++)
			tape.add(String.valueOf(input.charAt(i)));
		
		if (DEBUG) System.out.print("1. ");
		//Print out starting configuration
		for (int i = 0; i < tape.size(); i++)
			System.out.print(tape.get(i));
		System.out.println();
		
		//status = true = run
		//status = false = accept/reject
		boolean status = true;
		int state = 1;
		int head = 1;
		
		//Loop through until accept or reject state is found.
		while (status) {
			switch (state) {
				case 1:
					if (tape.get(head).equals("#") || tape.get(head).equals("x")) {
						String temp = tape.get(head);
						tape.set(head, "qreject");
						tape.set(head-1, temp);
						status = false;
					}
					else if (tape.get(head).equals("0")) {
						tape.set(head, "q2");
						tape.set(head-1, "#");
						state = 2;
						head++;
					}
					break;
				case 2:
					if (tape.get(head).equals("x")) {
						tape.set(head, "q2");
						tape.set(head-1, "x");
						head++;
					}
					else if (tape.get(head).equals("0")) {
						tape.set(head, "q3");
						tape.set(head-1, "x");
						state = 3;
						head++;
					}
					else if (tape.get(head).equals("#")) {
						tape.set(head, "qaccept");
						tape.set(head-1, "#");
						head++;
						status = false;
					}
					break;
				case 3:
					if (tape.get(head).equals("x")) {
						tape.set(head, "q3");
						tape.set(head-1, "x");
						head++;
					}
					else if (tape.get(head).equals("0")) {
						tape.set(head, "q4");
						tape.set(head-1, "0");
						state = 4;
						head++;
					}
					else if (tape.get(head).equals("#")) {
						tape.set(head-1, "x");
						tape.set(head-2, "q5");
						state = 5;
						head--;
					}
					break;
				case 4:
					if (tape.get(head).equals("x")) {
						tape.set(head, "q4");
						tape.set(head-1, "x");
						head++;
					}
					else if (tape.get(head).equals("#")) {
						tape.set(head, "qreject");
						tape.set(head-1, "#");
						status = false;
					}
					else if (tape.get(head).equals("0")) {
						tape.set(head, "q3");
						tape.set(head-1, "x");
						state = 3;
						head++;
					}
					break;
				case 5:
					if (tape.get(head).equals("0") || tape.get(head).equals("x")) {
						String temp = tape.get(head-2);
						tape.set(head-1, temp);
						tape.set(head-2, "q5");
						head--;
					}
					else if (tape.get(head).equals("#")) {
						tape.set(head, "q2");
						tape.set(head-1, "#");
						state = 2;
						head++;
					}
					break;
				default:
					break;
			}
			
			//Adds blanks if necessary to keep the tape alphabet.
			if (status) {
				if (head == tape.size())
					tape.add("#");
				if (head < 1) {
					tape.add(0, "#");
					head = 0;
				}
			}

			if (DEBUG) System.out.print(counter + ". ");
			//Print out the current configuration
			for (int i = 0; i < tape.size(); i++)
				System.out.print(tape.get(i));
			if (DEBUG) System.out.print(" position: " + head + " | tapeLength: " + tape.size());
			System.out.println();
			
			//Update how many configurations are present.
			counter++;
		}
	}
}
