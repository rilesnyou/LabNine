import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LabNineCollections {
	private static Scanner scnr;
	private static Map<String, Double> menu = new TreeMap<>();
	private static List<String> orderNames = new ArrayList<>();
	private static List<Double> orderPrices = new ArrayList<>();

	public static void main(String[] args) {
		scnr = new Scanner(System.in);
		boolean repeat = true;
		boolean piePeat = true;
		fillMenu();
		printMenu();
		average(orderPrices);
		total();
//		customerChoice();
//		pieNames();
//		piePrices();
		System.out.println("Welcome to the pie store! ");
		
		while (repeat && piePeat) {
				System.out.println("What kind of pie would you like to order? ");
				String itemName = scnr.nextLine();
				orderNames.add(itemName);
				Double itemPrice = menu.get(itemName);
				orderPrices.add(itemPrice);
//				piePeat = isPie(scnr, "Please enter a real pie.");
				System.out.println("Adding " + itemName + " pie to your cart for $" + itemPrice);
				repeat = getYesNo(scnr, "Would you like to add more pie? (Yes / No): ");

		 } 
			System.out.println("Okay then, your total is going to be $" + total());
			System.out.println("The average price for your pies are: " + average(orderPrices));
			System.out.print(String.format("%s", "Pies" + "\t" +  "Price"));
			System.out.print("\n");
			List<String> someName = orderNames;
			for (String names : someName) {
				System.out.print("\n");
				System.out.printf(String.format(names));
//				System.out.println("\n");
			}
			List<Double> somePrice = orderPrices;
			for (Double prices : somePrice) {
				System.out.printf(String.format("%.2f\n", prices));
			
			}
			scnr.close();
		 }
			 
	private static void fillMenu() {
		menu.put("apple", 1.50);
		menu.put("banana", 1.59);
		menu.put("peach", 1.64);
		menu.put("strawberry", 1.97);
		menu.put("cherry", 1.33);
		menu.put("boysenberry", 1.51);
		menu.put("pecan", 1.74);
		menu.put("pumpkin", 1.27);
		menu.put("blueberry", 1.77);
		menu.put("cream", 1.83);
	}
	

	private static void printMenu() {
		System.out.println("Pie type\tprice per slice");
        for (Map.Entry<String, Double> entry : menu.entrySet())  {
            System.out.println(entry.getKey() + "\t" + entry.getValue()); 
	}
	}
//	private static void customerChoice() {
//		String[] pies = pieNames();
////		String user = scnr.next();
//		for (int index = 0; index < pies.length; index++) {
//			System.out.println(pies[index]);
//		}
//		int len = pies.length;
//		for (int i = 0; i < len; i++) {
//			String pie = pies[i];
//			if(pie != null) {
//				System.out.println(pies[i]);
//			}
//		}
//		scnr.close();

//		}
	
	private static String[] pieNames() {
		List<String> orderNames = new ArrayList<>();
		orderNames.add("apple");
		orderNames.add("banana");
		orderNames.add("peach");
		orderNames.add("strawberry");
		orderNames.add("cherry");
		orderNames.add("boysenberry");
		orderNames.add("pecan");
		orderNames.add("pumpkin");
		orderNames.add("blueberry");
		orderNames.add("cream");

		return null;
	}
	
	public static boolean getYesNo(Scanner scnr, String prompt) {
		String input;
		boolean isValid;
		do {
			System.out.println(prompt);
			input = scnr.nextLine();
			isValid = "yes".equalsIgnoreCase(input) ||
					"no".equalsIgnoreCase(input) || "y".equalsIgnoreCase(input)
					|| "n".equalsIgnoreCase(input);
			if (!isValid) {
				
			}
		} while (!isValid);
		
		return input.toLowerCase().startsWith("y");
	}
	
	public static Double average(List<Double> marks) {

		Double sum = (double) 0;
		  if(!marks.isEmpty()) {
		    for (Double average : marks) {
		        sum += average;
		    }
		    return sum.doubleValue() / marks.size();

	}
		return sum;
	}
	
	public static Double total() {
		List<Double> m = orderPrices;
	    double sum = 0;
	    for(int i = 0; i < m.size(); i++)
	    {
	        sum += m.get(i);
	    }
	    return sum;
	}
	public static boolean isPie(Scanner scnr, String prompt) {
		String piePut;
		boolean realPie;
		do {
			System.out.println(prompt);
			piePut = scnr.nextLine();
			realPie = "apple".equalsIgnoreCase(piePut) || "banana".equalsIgnoreCase(piePut) || "peach".equalsIgnoreCase(piePut) ||
					"strawberry".equalsIgnoreCase(piePut) || "cherry".equalsIgnoreCase(piePut) || "boysenberry".equalsIgnoreCase(piePut) ||
					"pecan".equalsIgnoreCase(piePut) || "pumpkin".equalsIgnoreCase(piePut) || "blueberry".equalsIgnoreCase(piePut) ||
					"cream".equalsIgnoreCase(piePut);
			if (!realPie) {
				
			}
		} while (!realPie);
		return realPie;
	}
	}

		
