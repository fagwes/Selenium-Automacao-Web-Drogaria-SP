package metodos;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import executa.Executa;

public class Metodos extends Executa {

	public static void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public static void clicar(By elemento) {

		driver.findElement(elemento).click();

	}

	public static void evidencia(String evidenciar) throws IOException {

		TakesScreenshot scrshot = (TakesScreenshot) driver;
		File scrfile = scrshot.getScreenshotAs(OutputType.FILE);
		File destfile = new File("./evidencia" + evidenciar + ".png");
		FileUtils.copyFile(scrfile, destfile);

	}

	public static void submit(By elemento) {

		driver.findElement(elemento).submit();

	}

	public static void clicarlink(String link) {

		driver.get(link);

	}

}
