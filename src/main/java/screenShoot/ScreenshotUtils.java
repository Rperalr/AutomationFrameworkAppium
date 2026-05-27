package screenShoot;

import io.appium.java_client.AppiumDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class ScreenshotUtils {

    public static String takeScreenshot(AppiumDriver driver, String screenshotName) {
        if (driver == null) {
            throw new IllegalArgumentException("El driver está null. No se puede tomar screenshot.");
        }

        try {
            String timestamp = LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss_SSS"));

            String safeName = screenshotName == null || screenshotName.trim().isEmpty()
                    ? "screenshot"
                    : screenshotName.replaceAll("[^a-zA-Z0-9._-]", "_");

            Path screenshotsDir = Paths.get(
                    System.getProperty("user.dir"),"evidences","screenshots"
            );

            Files.createDirectories(screenshotsDir);

            File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            Path destination = screenshotsDir.resolve(
                    safeName + "_" + timestamp + ".png"
            );

            Files.copy(
                    sourceFile.toPath(),
                    destination,
                    StandardCopyOption.REPLACE_EXISTING
            );

            return destination.toAbsolutePath().toString();

        } catch (IOException e) {
            throw new RuntimeException("No se pudo guardar el screenshot.", e);
        }
    }
}