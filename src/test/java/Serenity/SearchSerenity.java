package Serenity;

import Pages.SearchPage;
public class SearchSerenity {
    SearchPage searchPage;
    public void openHomePage() {
        searchPage.open();
    }
    public String getSearch(){return searchPage.getSearch();}
    public String getISBN(){return searchPage.getISBN();}
    public void Search(){
        searchPage.Search();
    }
    public void Data(){
      searchPage.Data();
    }
    public void Link(){
       searchPage.Link();
    }
}
