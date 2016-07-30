package ABCD;
import java.util.ArrayList;

public class ABC {

	public static void main(String[] args) {
		// Tworzenie LISTY NR1
		ArrayList<String> NR1 = new ArrayList<String>();
		// Dodanie zawarto�ci
		NR1.add("L");
		NR1.add("B");
		NR1.add("C");
		NR1.add("D");
		NR1.add("G");

		ArrayList<String> NR2 = new ArrayList<String>();

		NR2.add("A");
		NR2.add("E");
		NR2.add("C");
		NR2.add("B");
		NR2.add("f");
		// Wypisanie listy NR1
		System.out.println("=====================================================");
		System.out.println("Lista NR1");
		System.out.println("=====================================================");

		for (int i = 0; i < NR1.size(); i++) {
			System.out.println(NR1.get(i));
		}
		// Wypisanie listy NR2
		System.out.println("=====================================================");
		System.out.println("Lista NR2");
		System.out.println("=====================================================");

		for (int i = 0; i < NR2.size(); i++) {
			System.out.println(NR2.get(i));
		}
		// Wypisanie listy z powt�rzeniami dla tabeli NR1
		System.out.println("=====================================================");
		System.out.println("Lista z powt�rzeniami");
		System.out.println("=====================================================");

		for (int i = 0; i < NR1.size(); i++) {
			for (int j = 0; j < NR2.size(); j++) {
				if (NR2.get(j).equals(NR1.get(i))) {
					System.out.println(NR2.get(j));
				}
			}
		}
		// P�tla listy z literami kt�re sie nie powtarzaj� dla tab NR1
		System.out.println("=====================================================");
		System.out.println("Lista z literami kt�re sie nie powtarzaj� dla tab 1");
		System.out.println("=====================================================");

		for (int i = 0; i < NR1.size(); i++) {
			int b = 0;
			for (int j = 0; j < NR2.size(); j++) {
				if (!(NR2.get(j).equals(NR1.get(i)))) {
					b++;
				}
			}
			if (b == NR2.size()) {
				System.out.println(NR1.get(i));
			}

		}
		// P�tla listy z literami kt�re sie nie powtarzaj� dla tab NR2
		System.out.println("=====================================================");
		System.out.println("Lista z literami kt�re sie nie powtarzaj� dla tab 2");
		System.out.println("=====================================================");

		for (int i = 0; i < NR2.size(); i++) {
			int b = 0;
			for (int j = 0; j < NR1.size(); j++) {
				if (!(NR1.get(j).equals(NR2.get(i)))) {
					b++;
				}
			}
			if (b == NR1.size()) {
				System.out.println(NR2.get(i));

			}

		}
		// P�tle z tabelami z zawarto��i� z tabel 1 i 2
		System.out.println("=====================================================");
		System.out.println("Tabela z zawarto��i� z tabel 1 i 2  ");
		System.out.println("=====================================================");

		// Wypisanie liter z wszystkich z tabeli 1 w kolejno�ci jak w tabeli 2
		ArrayList<String> NR3 = new ArrayList<String>();
		// P�tla wypisuj�ca wszystkie litery z tabeli RN1 liter kt�re si�
		// powtarzaj�
		for (int i = 0; i < NR2.size(); i++) {
			for (int j = 0; j < NR1.size(); j++) {
				if (NR1.get(j).equals(NR2.get(i))) {
					// System.out.println(NR1.get(j));
					// dodanie pobranych liter do nowej tabeli
					NR3.add(NR1.get(j));

				}

			}

		}
		// Wypisanie element�w kt�re nie s� w tabeli NR1 a s� w tabeli NR2
		for (int i = 0; i < NR1.size(); i++) {
			// Wa�ne ??? okre�la ilo�� negacji potrzebn� do spe�nienia warunku
			// wypisania nie powtarzaj�cej si� liczby
			int b = 0;
			// P�tla sprawdzaj�ca czy dany znak jest taki sam
			for (int j = 0; j < NR3.size(); j++) {
				if (!(NR3.get(j).equals(NR1.get(i)))) {
					// Wa�ne ??? dodaje negacje jak wyst�pi
					b++;

				}
			}
			// Dodanie do tabeli NR3
			if (b == NR3.size()) {
				NR3.add(NR1.get(i));
			}

		}
		// Wypisanie zawarto�ci nowej tabeli NR3
		for (String tab3 : NR3) {
			System.out.println(tab3);
		}
		System.out.println("=====================================================");
	}

}
