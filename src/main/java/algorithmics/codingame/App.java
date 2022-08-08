package algorithmics.codingame;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class App {
	static String s;

	public static void main(String[] args) throws IOException {

		// WaterTankMonitor$
		// WaterTank tank = new WaterTank();
		// WaterTankMonitor monitor = new WaterTankMonitor(tank);
		// checkMonitor


		// scanChar
		/*
		String art = AsciiArt.printChar('B');
		System.out.println(art);
		char c = App.scanChar(art);
		System.out.println("corresponds to: " + c);*/



		// Print
		Reader exemple = new StringReader("Hello");
		new StramPrinter().Print(exemple);

		// execute..
		Service service = new Service() {
			public void execute() throws Exception {
				System.out.println("execute");
			}

			public void setConnection(Connection c) {
				System.out.println("setConnection");
			}
		};
		Connection connection = new Connection() {
			public void rollback() {
				System.out.println("rollback");
			}

			public void commit() {
				System.out.println("commit");
			}

			public void close() {
				System.out.println("close");
			}
		};
		new A().a(service, connection);



		// getAnimalName
		Dog sammy = new Dog("Sammy");
		Cat smokey = new Cat("Smokey");
		System.out.println(Application2.getAnimalName(sammy));
		System.out.println(Application2.getAnimalName(smokey));

		// to do video
		// 26:00
		// findNetworkEndpoint


		// stack
		// Stack stack = new Stack(100);

		//
		// A a = new A();
		// B b = new B();
		// System.out.println(a);
		// System.out.println(b);



		// getposition
		System.out.println(App.getPositionAt(3)); // -4
		System.out.println(App.getPositionAt(100000)); // -5
		System.out.println(App.getPositionAt(2147483647)); // 1


		// sum
		System.out.println(App.sum("99.35", "1.10"));


		//encode
		System.out.println("encode exercice : ");
		System.out.println(App.encode("aabaa"));
		System.out.println(App.encode("aabaaccccccaaaa"));
		System.out.println(App.encode("zzzzzzzzzzz"));

		//pi approx
		System.out.println("pi approx exercice : ");
		//double[][] rands= new double[][]

	}

	static double approx(double[][] pts){
		double x,y; // coordonnees du point tiré au hasard
		double in=0; // nombre de points tombés dans le cercle
		double sum=1;  // nombre total de points
		double pi; // approximation de pi
		while (true) {
			x=Math.random();
			y=Math.random();
			if (x*x+y*y <= 1) // le point est tombé dans le cercle
				in++;
			sum++;
			pi=4*(in/sum);
			return pi;
		}
	}

	public static String encode(String plainText){
		char currentChar = plainText.charAt(0);
		int j = 1;
		StringBuilder encodedString = new StringBuilder();
		for (int i = 1; i < plainText.length(); i++) {
			char nextChar = plainText.charAt(i);
			if (currentChar == nextChar) {
				j++;
			} else {
				encodedString.append(j).append(currentChar);
				currentChar = nextChar;
				j = 1;
			}
		}
		encodedString.append(j).append(currentChar);
		return encodedString.toString();
	}

/*
	static char scanChar(String s) {
		for(int i=65;i<91 ;i++){
			if(s.equals(AsciiArt.printChar((char)i))){
				return (char) i;
				}
			}
		return '?';
	}
	static char scanChar(String s) {
		// Iterate over each character from A to Z.
		for (char c = 'A'; c <= 'Z'; c++) {
			// Check to see if the character corresponds with the ASCII art.
			if (AsciiArt.printChar(c) == s) {
				// Return the character if it does.
				return c;
			}
		}
		return '?';
	}
*/



	public static boolean isTwin(String a, String b) {
		char[] achar = a.toLowerCase().toCharArray();
		char[] bchar = b.toLowerCase().toCharArray();
		Arrays.sort(achar);
		Arrays.sort(bchar);
		return Arrays.equals(achar,bchar);
	}

	static String sum(String... numbers) {
		BigDecimal total = new BigDecimal(0);
		for (String number : numbers) {
			total = total.add(new BigDecimal(number));
		}
		return String.valueOf(total);
	}


	public static int findSmallestInterval(int[] numbers) {
		// Write your code here
		// To debug: System.err.println("Debug messages...");
		Arrays.sort(numbers);
		return IntStream
				.range(0, numbers.length-1)
				.map(i -> numbers[i+1] - numbers[i])
				.min().getAsInt();
	}

	public static int getPositionAt(int n) {
		switch (n % 6) {
		case 0:
			return 0;
		case 1:
			return 1;
		case 2:
			return -1;
		case 3:
			return -4;
		case 4:
			return -5;
		case 5:
			return -3;
		}
		return 0;
	}



//	class A {
//		A() {
//		}
//	}
//
//	class B extends A{
//		B() {
//		}
//	}

	public class StackClass {
		// keep these two fields as they are
		private Object[] elements;
		private int size = 0;
		public StackClass(int initialCapacity) {
			elements = new Object[initialCapacity];
		}
		public void push(Object object) {
			ensureCapacity();
			elements[size++] = object;
		}
		public Object pop() {
			if (size == 0) {
				throw new EmptyStackException();
			}
			reduceCapacity();
			return elements[--size];
		}
		private void ensureCapacity() {
			if (elements.length == size) {
				Object[] old = elements;
				elements = new Object[2 * size + 1];
				System.arraycopy(old, 0, elements, 0, size);
			}
		}

		private void reduceCapacity() {
			if (elements.length > size * 2) {
				Object[] old = elements;
				elements = new Object[size];
				System.arraycopy(old, 0, elements, 0, size);
			}
		}
	}

	public class Node {
		Node left, right;
		int value;
		public Node() {
		}
		public Node(int value) {
			this.value = value;
		}
		public Node find(int v){
			Node current = this;
			while(null!=current){
				if(current.value == v){
					return  current;
				}
				current = v<current.value ? current.left:current.right;
			}
			return null;
		}



		/*public Node(Node left, Node right) {
			super();
			this.left = left;
			this.right = right;
		}

		// Solution 1
		public Node find(int v) {
			Node current = this;
			while (true) {
				if (current == null) {
					return null;
				}
				if (current.value == v) {
					return current;
				}
				if (current.value < v) {
					current = current.right;
				}
				if (current.value > v) {
					current = current.left;
				}
			}
		}
*/
		// Solution 3
		// public Node find(int v) {
		// Node current = this;
		// while (current != null) {
		// if (current.value == v) {
		// return current;
		// }
		// // This will drop out of the loop naturally if there's no appropriate
		// subnode
		// current = v < current.value ? current.left : current.right;
		// }
		// return null;
		// }

	}

}

abstract class Animal {
	String name;
	Animal(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
}
class Dog extends Animal {
	Dog(String name) {
		super(name);
		this.name = name;
	}
}
class Cat extends Animal {
	Cat(String name) {
		super(name);
		this.name = name;
	}
}
/** simplified version of App */
class Application2 {
	static String getAnimalName(Animal a) {
		return a.getName();
	}
}

/** First App version */
class Application {
	static String getAnimalName(Animal a) {
		String name = null;
		if (a instanceof Dog) {
			name = ((Dog) a).getName();
		} else if (a instanceof Cat) {
			name = ((Cat) a).getName();
		}
		return name;
	}
}


class UsersService { // HashMap
	ArrayList<Integer> ids = new ArrayList<Integer>();
	ArrayList<String> names = new ArrayList<String>();
	void add(int identifiant, String nom) {
		ids.add(identifiant);
		names.add(nom);
	}
	String findNameById(int id) {
		for (int i = ids.size() - 1; i >= 0; i--) {
			if (ids.get(i) == id) {
				return names.get(i);
			}
		}
		return null;
	}
}

class StramPrinter {
	void Print(Reader reader) throws IOException {
		int code = reader.read();
		while (code != -1) {
			System.out.println((char) code);
			code = reader.read();
		}
		reader.close();
	}
}

class A {
	void a(Service s, Connection c) {
		try {
			s.setConnection(c);
			s.execute();
			c.commit();
		} catch (Exception e) {
			c.rollback();
		} finally {
			c.close();
		}
	}
}
interface Service {
	void execute() throws Exception;
	void setConnection(Connection c);
}
interface Connection {
	void commit();
	void rollback();
	void close();
}




class Fruits {
	public static void main(String[] args) {
		Set<Citron> c1 = new TreeSet<Citron>();
		Set<Orange> o1 = new TreeSet<Orange>();
		mordre(c1);
		mordre(o1);
	}
	public static void mordre(Set<? super Orange> o1) {
	}
}

class Citron {
}

class Orange extends Citron {
}

class WaterTank {
	boolean empty;
	public boolean isEmpty() {
		return empty;
	}
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
}

class WaterTankMonitor {
	WaterTank tank;
	WaterTankMonitor(WaterTank tank) {
		this.tank = tank;
	}
	synchronized void empty() throws InterruptedException {
		while (tank.isEmpty()) {
			wait();
		}
		tank.setEmpty(true);
		notifyAll();
	}

	synchronized void fill() throws InterruptedException {
		while (!tank.isEmpty()) {
			wait();
		}
		tank.setEmpty(false);
		notifyAll();
	}
}

class Echo {
	public static void main(String[] args) {
		Arrays.stream(args).forEach(System.out::println);
	}
}

class Counter {
	private static int count = 0;
	public static synchronized int increment() { // add synchronized
		count = count + 1;
		return count;
	}
}

enum Color {
	Spade, Diamond, Club, Hearth
}

enum Value {
	Two, Three, Four, Five, Six, Seven, Eight, Nine, Ten, Jack, Queen, King, Ace
}

class GameException extends RuntimeException {
}

class Card {
	public final Color color;
	public final Value value;
	public Card(Color c, Value v) {
		this.color = c;
		this.value = v;
	}
}

class Deck {
	protected List<Card> cards;
	private void initDeck(int nb_cards) {
		int nb_card_distribute = 0;
		while (nb_card_distribute < nb_cards) {
			for (Color c : Color.values()) {
				if (nb_card_distribute >= nb_cards)
					break;
				for (Value v : Value.values()) {
					if (nb_card_distribute >= nb_cards)
						break;
					cards.add(new Card(c, v));
					nb_card_distribute++;
				}
			}
		}
	}

	public Deck(int nb_cards) {
		if (nb_cards % 4 != 0)
			throw new GameException();
		cards = new ArrayList<>(nb_cards);
		initDeck(nb_cards);
	}

	public int size() {
		return cards.size();
	}
	public Collection<Card> displayDeck() {
		return cards;
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
}

class RiggedDeck extends Deck {
	public RiggedDeck(int nb_cards) {
		super(nb_cards);
	}
	@Override
	public void shuffle() {
		Collections.shuffle(cards, new Random(0));
	}
}

class CardComparator implements Comparator<Card> {
	@Override
	public int compare(Card o1, Card o2) {
		int cmp = o1.color.compareTo(o2.color);
		if (cmp != 0) {
			return cmp;
		}
		return o1.value.compareTo(o2.value);
	}
}

class Player {
	private Collection<Card> hand;
	private String name;
	public Player(String name) {
		this.name = name;
		hand = new TreeSet<>(new CardComparator());
	}

	public Collection<Card> getHand() {
		return hand;
	}
	public void addCard(Card c) {
		if (hand.contains(c)) {
			throw new GameException();
		}
		hand.add(c);
	}
}

class Game {
	private int nb_player;
	private int nb_card;
	private Deck deck;
	private List<Player> players;
	public Game(int nb_player, int nb_card) {
		this.nb_player = nb_player;
		this.nb_card = nb_card;
		this.players = initPlayers(nb_player);
		this.deck = initDeck(nb_card);
	}
	public Game(int nb_player, Deck deck) {
		this.players = initPlayers(nb_player);
		this.deck = deck;
	}
	private Deck initDeck(int nb_card) {
		return new Deck(nb_card);
	}
	private List<Player> initPlayers(int nb_player) {
		players = new ArrayList<>(nb_player);
		for (int i = 0; i < nb_player; ++i) {
			players.add(new Player("Player " + i));
		}
		return players;
	}

	public Deck getDeck() {
		return deck;
	}
	List<Player> getPlayers() {
		return players;
	}
	public void startGame() {
		shuffleDeck();
		distributeDeck();
	}

	public void distributeDeck() {
		int cardsPerPlayer = deck.size() / players.size();
		Iterator<Card> iter = deck.displayDeck().iterator();
		while (iter.hasNext()) {
			Card card = iter.next();
			for (Player player : players) {
				if (player.getHand().size() < cardsPerPlayer) {
					try {
						player.addCard(card);
					} catch (GameException e) {
						// skip
					}
				}
			}
		}
	}
	public void shuffleDeck() {
		this.deck.shuffle();
	}
}

class SequenceItem {
	final int num;
	final int count;
	public SequenceItem(int num, int count) {
		this.num = num;
		this.count = count;
	}
}

class Solution {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		System.out.println(encodeChuckNorrisSequence(line));
	}
	public static String encodeChuckNorrisSequence(String text) {
		List<SequenceItem> items = new ArrayList<SequenceItem>();
		boolean first = true;
		int prevNum = 0;
		int count = 0;
		for (int c : text.toCharArray()) {
			c = (c << 1) & 0xff;
			for (int i = 0; i < 7; ++i) {
				if (first) {
					first = false;
					prevNum = c & 0x80;
					c = (c << 1) & 0xff;
					count = 1;
					continue;
				}
				int x = c & 0x80;
				c = (c << 1) & 0xff;
				if (x == prevNum) {
					++count;
				} else {
					items.add(new SequenceItem(prevNum, count));
					prevNum = x;
					count = 1;
				}
			}
		}
		StringBuilder builder = new StringBuilder();
		for (SequenceItem item : items) {
			if (item.num == 0) {
				builder.append("00 ");
			} else {
				builder.append("0 ");
			}
			for (int i = 0; i < item.count; ++i) {
				builder.append("0");
			}
			builder.append(" ");
		}
		if (prevNum == 0) {
			builder.append("00 ");
		} else {
			builder.append("0 ");
		}
		for (int i = 0; i < count; ++i) {
			builder.append("0");
		}
		return builder.toString();
	}

}

class HorseRacing {
	public int diffBetweenTwoClosest(int[] strengths) {
		TreeSet<Integer> sorted = new TreeSet<Integer>();
		for (int value : strengths) {
			sorted.add(value);
		}
		if (sorted.size() < 2) {
			return 0;
		}

		Iterator<Integer> iter = sorted.iterator();
		int first = iter.next();
		int prev = iter.next();
		int largestDiff = prev - first;
		while (iter.hasNext()) {
			int value = iter.next();
			int diff = value - prev;
			if (diff < largestDiff) {
				largestDiff = diff;
			}
			prev = value;
		}
		return largestDiff;
	}
}

class V {
	/**
  * Locates the universe-formula file.
  */
		 static String locateUniverseFormula() {
		 return getFile("/tmp/documents","universe-formula");
		 }
		 private static String getFile(String path, String name){
		 File fe = new File(path);
		 File[] files = fe.listFiles();
		 for(File f:files){
			 if(f.isFile()){
				 if(name.equals(f.getName())){
					 return f.getAbsolutePath();
					 }
				 }else if(f.isDirectory()){
				 return getFile(f.getAbsolutePath(), name);
				 }
			 }
		 return null;
		 }
 }

/*
function encode(str) {
	str = str.toLowerCase();
	let count = 1;
	let code = "";
	for(let i=0; i < str.length; i++){
		if(str[i]==str[i+1]){
			count++;
		} else {
			code += count + str[i];
			count = 1;
		}
	}
	return code;
}*/