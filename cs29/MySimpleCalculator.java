package eg.edu.alexu.csd.oop.calculator.cs29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;

import eg.edu.alexu.csd.oop.calculator.Calculator;
/**
 * @author saraheldafrawy.
 */
public class MySimpleCalculator implements Calculator {

  /** stores history. */
	private LinkedList<String> linkedList;
  /** stores current position. */
	private int currentIndex;
	/** magic number. */
	private final int magicNum5 = 5;
	/**  constructor. */
	public MySimpleCalculator() {
		linkedList = new LinkedList<>();
		currentIndex = 0;
	}
	/**
	 * stores the input formula.
	 */
	@Override
	public void input(final String s) {

		if (valid(s)) {
			if (linkedList.size() == magicNum5) {
				linkedList.removeFirst();
				linkedList.add(s);
			} else {
				linkedList.add(s);
				currentIndex = linkedList.size();
			}
		}
	}

	//not sure if I will need to implement it
	private boolean valid(final String s) {
		return true;
	}
  /** @return result of the current formula. */
	@Override
	public String getResult() {
		if (linkedList.isEmpty()) {
			throw new RuntimeException();
		}
		double result = calculate(linkedList.get(currentIndex - 1));

		String str = String.valueOf(result);
		return str;
	}
  /** calculate the formula. */
	private double calculate(final String s) {
		double results = 0;
		char operation = '!';
		//remove spaces and invalid characters
		StringBuilder str1 = new StringBuilder();
		StringBuilder str2 = new StringBuilder(s);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '-'
			    || s.charAt(i) == '+'
			    || s.charAt(i) == '/'
			    || s.charAt(i) == '*') {
				operation = str2.charAt(0);
				str2.deleteCharAt(0);
				break;
			}
			str1.append(str2.charAt(0));
			str2.deleteCharAt(0);
		}

		double firstInt = Double.parseDouble(str1.toString());
		double secondInt = Double.parseDouble(str2.toString());

		if (operation == '+') {
			results = firstInt + secondInt;
		} else if (operation == '-') {
			results = firstInt - secondInt;
		} else if (operation == '*') {
			results = firstInt * secondInt;
		} else if (operation == '/') {
			results = firstInt / secondInt;
		}

		return results;

	}
  /** @return current position. */
	@Override
	public String current() {
		if (linkedList.isEmpty() || currentIndex == 0) {
			return null;
		}
		return linkedList.get(currentIndex - 1);
	}
	/** @return next position. */
	@Override
	public String prev() {
		if (linkedList.isEmpty() || currentIndex == 1) {
			return null;
		}
		currentIndex--;
		return linkedList.get(currentIndex - 1);
	}
	/** @return next position. */
	@Override
	public String next() {
		if (linkedList.isEmpty() || currentIndex == linkedList.size()) {
			return null;
		}
		currentIndex++;
		return linkedList.get(currentIndex - 1);
	}
  /** save previous operations. */
	@Override
	public void save() {

		try {
			BufferedWriter writer = new BufferedWriter(
			    new FileWriter("gameSave.txt", false));
			if (currentIndex < linkedList.size() - magicNum5) {
				writer.write(Integer.toString(0));
			} else {
			writer.write(Integer.toString(currentIndex));
			}
			writer.newLine();
			int ik;
			if (linkedList.size() > magicNum5) {
			  ik = linkedList.size() - magicNum5;
			} else {
			  ik = 0;
			}
			for (int i = ik; i < linkedList.size(); i++) {
				writer.write(linkedList.get(i));
				if (linkedList.size() - 1 != i) {
				writer.newLine();
				}
			}
			writer.close();
		} catch (Exception e) { 
		  System.out.println("exception");
		}
	}
  /** load previous operation and delete the history. */
	@Override
	public void load() {
		linkedList = new LinkedList<>();

        try {
            BufferedReader in = new BufferedReader(
                new FileReader("gameSave.txt"));
            String formula;
            currentIndex = Integer.parseInt(in.readLine());
            while ((formula = in.readLine()) != null) {
                linkedList.add(formula);
            }
            in.close();

        } catch (Exception e) {
          System.out.println("exception");
        }
	}

}
