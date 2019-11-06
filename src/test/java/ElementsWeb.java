import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ElementsWeb {
    public static final String URL = "http://www.ozon.ru";
    public static SelenideElement Catalog = $(byText("Каталог"));
    public static SelenideElement Books = $(byText("Книги"));
    public static SelenideElement IT = $(byText("Компьютерные технологии"));
    public static SelenideElement BestSellers = $(byText("Бестселлеры"));
    public static SelenideElement Languages = $(byText("Языки программирования"));
    public static SelenideElement AddToCart = $(By.cssSelector("button.ui-m7.ui-n6.ui-n5.ui-n0.ui-i4.ui-j4.a3a6"));
    public static SelenideElement Cart = $(By.cssSelector("a[href='/cart']"));
    public static SelenideElement BeforeCart = $(By.cssSelector("div.top h1"));
    public static SelenideElement AfterCart = $(By.cssSelector("a.title span"));

    public static ElementsCollection RndBook() {

        return $$(By.cssSelector("div.ac8 >div"));
    }
}
