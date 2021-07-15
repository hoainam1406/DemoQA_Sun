package Pages;

import UI.Ui;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com/books")
public class SearchPage  extends PageObject {
    Ui ui;
    public String getSearch(){
        return  ui.search.getTextValue();
    }
    public String getISBN(){
        return  ui.ISBN.getTextValue();
    }

    public void Search(){
        ui.searchbtn.click();
    }
    public void Data(){
        ui.search.sendKeys("Git Pocket Guide");
    }
    public void Link(){
       ui.linkBook.click();
    }

}
