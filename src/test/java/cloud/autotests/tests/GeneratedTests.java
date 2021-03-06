package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Тесты сайта Head Hunter")
    void generatedTest() {
        step("Открыть страницу https://spb.hh.ru/", () -> {
            step("// todo: just add selenium action");
        });

        step("Найти \"Сервисы для соискателей\" на странице", () -> {
            step("// todo: just add selenium action");
        });

        step("Открыть страницу https://hh.ru/", () -> {
            step("// todo: just add selenium action");
        });

        step("Нажать Россия", () -> {
            step("// todo: just add selenium action");
        });

        step("Выбрать Санкт-Петербург", () -> {
            step("// todo: just add selenium action");
        });

        step("Проверить наличие надписи Санкт-Петербург на странице", () -> {
            step("// todo: just add selenium action");
        });

        step("Открыть страницу https://hh.ru/", () -> {
            step("// todo: just add selenium action");
        });

        step("В строке поиска набрать Тестировщик", () -> {
            step("// todo: just add selenium action");
        });

        step("Убедиться, что вакансия \"Тестировщик\" есть в списке", () -> {
            step("// todo: just add selenium action");
        });

        step("Открыть страницу https://spb.hh.ru/", () -> {
            step("// todo: just add selenium action");
        });

        step("В строке поиска набрать Тестировщик", () -> {
            step("// todo: just add selenium action");
        });

        step("Убедиться, что вакансия \"Тестировщик\" в городе Санкт-Петербурге есть в списке", () -> {
            step("// todo: just add selenium action");
        });

        step("Открыть страницу https://spb.hh.ru/", () -> {
            step("// todo: just add selenium action");
        });

        step("Найти раздел \"Статьи\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Выбрать \"Что такое сильные стороны и как их определить?\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Убедиться, что произошел переход на выбранную страницу", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://spb.hh.ru/'", () ->
            open("https://spb.hh.ru/"));

        step("Page title should have text 'Работа в Санкт-Петербурге, поиск персонала и публикация вакансий - spb.hh.ru'", () -> {
            String expectedTitle = "Работа в Санкт-Петербурге, поиск персонала и публикация вакансий - spb.hh.ru";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://spb.hh.ru/'", () ->
            open("https://spb.hh.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}