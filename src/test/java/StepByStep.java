import com.codeborne.selenide.Configuration;
import cucumber.api.java.ru.*;

import javax.lang.model.util.Elements;
import java.util.Random;

import static com.codeborne.selenide.Selenide.open;

public class StepByStep {
    String s1;
    String s2;
    Random rnd = new Random();

    @Дано("^открытый сайт озона$")
    public void site() {
        Configuration.startMaximized = true;
        Configuration.timeout = 7000;
        open(ElementsWeb.URL);
    }


    @Когда("^открываем каталог$")
    public void catalog() {
        //Configuration.startMaximized = true;
        ElementsWeb.Catalog.click();
    }

    @И("^наводим на раздел книг$")
    public void hoverBooks() {
        ElementsWeb.Books.hover();
    }

    @Также("^кликаем по компьютерным технологиям$")
    public void clickIT() {
        ElementsWeb.IT.click();
    }

    @Тогда("^ставим галочку на бестселлерах$")
    public void markBestSellers() {
        ElementsWeb.BestSellers.click();
    }

    @И("^ставим галочку на языках программирования$")
    public void markLanguages() {
        ElementsWeb.Languages.click();

    }

    @Тогда("^выбираем случайную книгу$")
    public void clickOnRandomBook() {
        int randomBook = rnd.nextInt(ElementsWeb.RndBook().size());
        ;
        ElementsWeb.RndBook().get(randomBook).click();
    }

    @И("^запоминаем название книги$")
    public void keepBooksName() throws InterruptedException {
        s1 = ElementsWeb.BeforeCart.text();
        Thread.sleep(10000);
    }

    @Также("^добавляем её в корзину$")
    public void add() throws InterruptedException {
        ElementsWeb.AddToCart.click();
        Thread.sleep(2000);
    }

    @И("^открываем свою корзину$")
    public void goToCart() {
        ElementsWeb.Cart.click();

    }

    @Тогда("^видим там выбранную книгу$")
    public void itsMyBook() {
        s2 = ElementsWeb.AfterCart.text();
    }

    @И("^выводим оповещение \"Всё в порядке\"$")
    public void itsAllGood() {
        if (s1.equals(s2))
            System.out.println("Всё в порядке!");
    }


}
