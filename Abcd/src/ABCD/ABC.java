package ABCD;
import java.util.ArrayList;

public class ABC {

	public static void main(String[] args) {
		// Tworzenie LISTY NR1
		ArrayList<String> NR1 = new ArrayList<String>();
		// Dodanie zawartoœci
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
		// Wypisanie listy z powtórzeniami dla tabeli NR1
		System.out.println("=====================================================");
		System.out.println("Lista z powtórzeniami");
		System.out.println("=====================================================");

		for (int i = 0; i < NR1.size(); i++) {
			for (int j = 0; j < NR2.size(); j++) {
				if (NR2.get(j).equals(NR1.get(i))) {
					System.out.println(NR2.get(j));
				}
			}
		}
		// Pêtla listy z literami które sie nie powtarzaj¹ dla tab NR1
		System.out.println("=====================================================");
		System.out.println("Lista z literami które sie nie powtarzaj¹ dla tab 1");
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
		// Pêtla listy z literami które sie nie powtarzaj¹ dla tab NR2
		System.out.println("=====================================================");
		System.out.println("Lista z literami które sie nie powtarzaj¹ dla tab 2");
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
		// Pêtle z tabelami z zawartoœæi¹ z tabel 1 i 2
		System.out.println("=====================================================");
		System.out.println("Tabela z zawartoœæi¹ z tabel 1 i 2  ");
		System.out.println("=====================================================");

		// Wypisanie liter z wszystkich z tabeli 1 w kolejnoœci jak w tabeli 2
		ArrayList<String> NR3 = new ArrayList<String>();
		// Pêtla wypisuj¹ca wszystkie litery z tabeli RN1 liter które siê
		// powtarzaj¹
		for (int i = 0; i < NR2.size(); i++) {
			for (int j = 0; j < NR1.size(); j++) {
				if (NR1.get(j).equals(NR2.get(i))) {
					// System.out.println(NR1.get(j));
					// dodanie pobranych liter do nowej tabeli
					NR3.add(NR1.get(j));

				}

			}

		}
		// Wypisanie elementów które nie s¹ w tabeli NR1 a s¹ w tabeli NR2
		for (int i = 0; i < NR1.size(); i++) {
			// Wa¿ne ??? okreœla iloœæ negacji potrzebn¹ do spe³nienia warunku
			// wypisania nie powtarzaj¹cej siê liczby
			int b = 0;
			// Pêtla sprawdzaj¹ca czy dany znak jest taki sam
			for (int j = 0; j < NR3.size(); j++) {
				if (!(NR3.get(j).equals(NR1.get(i)))) {
					// Wa¿ne ??? dodaje negacje jak wyst¹pi
					b++;

				}
			}
			// Dodanie do tabeli NR3
			if (b == NR3.size()) {
				NR3.add(NR1.get(i));
			}

		}
		// Wypisanie zawartoœci nowej tabeli NR3
		for (String tab3 : NR3) {
			System.out.println(tab3);
		}
		System.out.println("=====================================================");
	}

}
