package HOTFIX;

import java.util.Random;

/**
 * Created by Sevastian on 23.03.2017.
 */
public abstract class GeneralBook {

	private String title;
	private int year;
	private String author;

	private int nrpages;
	private double cost;

	private int popularity;

	public GeneralBook() {
	}

	public GeneralBook(String title, int year, String author, int nrpages, double cost, int popularity) {
		this.title = title;
		this.year = year;
		this.author = author;
		this.nrpages = nrpages;
		this.cost = cost;
		this.popularity = popularity;
	}

	public abstract void printInfo();

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPopularity() {
		return popularity;
	}

	public void setPopularity(int popularity) {
		this.popularity = popularity;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

	public double getPrice() {
		double price = cost;

		if (popularity > 8) price += cost / 100 * 10;
		if (popularity > 9) price += (price / 100 * 10);
		if (popularity < 1) {
			Random r = new Random();
			if (r.nextBoolean()) price = 0;
			else price -= price / 2;
		}
		return price;
	}


	public int getNrpages() {
		return nrpages;
	}

	public void setNrpages(int nrpages) {
		this.nrpages = nrpages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
