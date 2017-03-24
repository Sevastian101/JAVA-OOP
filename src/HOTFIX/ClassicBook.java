package HOTFIX;

/**
 * Created by Sevastian on 23.03.2017.
 */
public class ClassicBook extends GeneralBook {

     private String historicPeriod;

     public ClassicBook() {
     }

     public ClassicBook(String title, int year, String author, int nrpages, double cost, int popularity, String historicPeriod) {
          super(title, year, author, nrpages, cost, popularity);
          this.historicPeriod = historicPeriod;
     }

     @Override
     public void printInfo() {
          System.out.println("\nClassic book from "+getHistoricPeriod());
          System.out.println(getTitle()+","+getNrpages()+" pages");
          System.out.println("Written by "+getAuthor()+" in "+getYear());
          System.out.println("Cost:"+getPrice()+"\n");

     }

     public String getHistoricPeriod() {
          return historicPeriod;
     }

     public void setHistoricPeriod(String historicPeriod) {
          this.historicPeriod = historicPeriod;
     }
}

