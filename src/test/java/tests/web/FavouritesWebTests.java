package tests.web;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import web.pages.ProductPage;
import common.TestData;

@DisplayName("UI тесты на избранное")
@Tag("WEB")
public class FavouritesWebTests extends TestBaseWeb {

    ProductPage productPage = new ProductPage();

    @Test
    @Owner("Дарья Петрова")
    @Feature("Реализация списка избранных товаров пользователя")
    @Story("UI: Добавление товара в список избранного")
    @DisplayName("Добавление продукта в Избранное")
    public void addProductToFavourites() {
        productPage
                .openPage(TestData.product)
                .addProductToFavourites()
                .checkAddedProductIsInFavourites(TestData.product);
    }

    @Test
    @Owner("Дарья Петрова")
    @Feature("Реализация списка избранных товаров пользователя")
    @Story("UI: Удаление товара из списка избранного")
    @DisplayName("Удаление продукта из Избранного")
    public void removeProductFromFavourites() {
        productPage
                .openPage(TestData.product)
                .addProductToFavourites()
                .removeProductFromFavourites(TestData.product)
                .checkFavouritesIsEmpty();
    }
}
