package HOTFIX;

/**
 * Created by Sevastian on 24.03.2017.
 */
public final class PureBook extends GeneralBook {

	public PureBook(GeneralBook book) {
		super(book.getTitle(), book.getYear(), book.getAuthor(), book.getNrpages(), book.getCost(), 10);
	}

	@Override
	public double getPrice() {
		return getCost();
	}

	@Override

	public void printInfo() {
		System.out.println("This is a pure book");
		System.out.println(getTitle() + "," + getNrpages() + " pages");
		System.out.println("Written by " + getAuthor() + " in " + getYear());
		System.out.println("Cost:" + this.getCost() + "\n");
	}


}
