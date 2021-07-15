package Serenity;

import Pages.RadioPage;

public class RadioBtnSerenity {
    RadioPage radioPage;
    public void openHomePage() {
        radioPage.open();
    }
    public String getSelectedRadio(){
      return radioPage.getSelectedRadio();
    }
    public void SelectedYess(){
        radioPage.SelectedYes();
    }
}
