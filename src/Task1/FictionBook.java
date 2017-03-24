package Task1;

/**
 * Created by Sevastian on 23.03.2017.
 */
public class FictionBook extends GeneralBook {

	private int ageLimit;

	public FictionBook() {
	}

	public FictionBook(String title, int year, String author, int nrpages, double cost, int popularity, int ageLimit) {
		super(title, year, author, nrpages, cost, popularity);
		this.ageLimit = ageLimit;
	}

	@Override
	public void printInfo() {
		System.out.println("\nFiction book with age limit of  " + getAgeLimit() + "+ years old");
		System.out.println(getTitle() + "," + getNrpages() + " pages");
		System.out.println("Written by " + getAuthor() + " in " + getYear());
		System.out.println("Price:" + getPrice() + "\n");

	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
}
