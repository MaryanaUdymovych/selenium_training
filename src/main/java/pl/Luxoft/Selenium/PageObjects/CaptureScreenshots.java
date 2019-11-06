package pl.Luxoft.Selenium.PageObjects;

public class CaptureScreenshots {
  /*  protected void captureElementScreenshot(WebElement webElement) throws IOException {

        File screenshot = ((TakesScreenshot)webDriver)

                .getScreenshotAs(OutputType.FILE);

        BufferedImage fullImg = ImageIO.read(screenshot);

        Point elementLocation = webElement.getLocation();

        int webElHeight = webElement.getSize().getHeight();

        int webElWidth = webElement.getSize().getWidth();

        BufferedImage elementScreenShotImage = fullImg.getSubimage(

                elementLocation.getX(), elementLocation.getY(),

                webElWidth, webElHeight

        );

        ImageIO.write(elementScreenShotImage, "png",screenshot);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");

        String time = LocalDateTime.now().format(dtf);

        File elementScreenshot = new File("target/we_screenshot"+

                time +".png");

        Files.copy(screenshot.toPath(), elementScreenshot.toPath());

    }
    */

}
