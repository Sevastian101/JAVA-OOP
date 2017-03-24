package Task1;

/**
 * Created by Sevastian on 23.03.2017.
 */
public class ScienceBook extends GeneralBook {

	private String category;

	public ScienceBook() {
	}

	public ScienceBook(String title, int year, String author, int nrpages, double cost, int popularity, String category) {
		super(title, year, author, nrpages, cost, popularity);
		this.category = category;
	}

	@Override
	public void printInfo() {
		System.out.println("\nScience book about " + getCategory());
		System.out.println(getTitle() + "," + getNrpages() + " pages");
		System.out.println("Written by " + getAuthor() + " in " + getYear());
		System.out.println("Cost:" + getPrice() + "\n");

	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
