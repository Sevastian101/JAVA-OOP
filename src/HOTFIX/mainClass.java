package HOTFIX;

import Task1.ClassicBook;
import Task1.FictionBook;
import Task1.GeneralBook;
import Task1.PureBook;
import Task1.ScienceBook;

/**
 * Created by sodobescu on 3/24/2017.
 */
public class mainClass {


	public static void main(String args[]) {

		Task1.GeneralBook[] Book = new GeneralBook[3];
		Book[0] = new FictionBook("Game of Thrones", 2006, "Martin", 320, 100, 5, 18);
		Book[1] = new ScienceBook("Human race", 2005, "John N.", 680, 150, 10, "Biology");
		Book[2] = new ClassicBook("Apis", 1568, "Silever T.", 1200, 300, 2, "Medieval");

		for (int i = 0; i < Book.length; i++) {
			Book[i].printInfo();
		}
		PureBook[] PureBook = new PureBook[3];
		PureBook[0] = new PureBook(Book[0]);
		PureBook[1] = new PureBook(Book[1]);
		PureBook[2] = new PureBook(Book[2]);

		for (int i = 0; i < PureBook.length; i++) {
			PureBook[i].printInfo();
		}


	}
}
