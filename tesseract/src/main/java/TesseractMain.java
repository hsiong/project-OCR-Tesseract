import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.junit.Test;

import java.io.File;

/**
 * 〈〉
 *
 * @author Hsiong
 * @version 1.0.0
 * @since 2023/4/24
 */
public class TesseractMain {

    String filePath = "/Users/vjf/Desktop/test/image6.png";
    String dataPath = "/Users/vjf/Desktop/train";

    @Test
    public void ocrTest() {
        Tesseract tesseract = new Tesseract();
        try {
            tesseract.setDatapath(dataPath);

            // the path of your tess data folder
            // inside the extracted file
            String text = tesseract.doOCR(new File(filePath));


            System.out.print(text);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void ocr2Test() {
        // create instance
        ITesseract instance = new Tesseract();

        // set discern language
        //        instance.setLanguage("chi_sim");
        
        // set data path
        instance.setDatapath(dataPath);

        // set engine mode
        instance.setOcrEngineMode(1);

        // 读取文件

        try {

            // path of your image file
            String result = instance.doOCR(new File(filePath));
            System.out.println(result);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    //    private void changeImg() {
    //        Mat imgGray = new Mat();
    //        Imgproc.cvtColor(img, imgGray, Imgproc.COLOR_BGR2GRAY);
    //        Imgcodecs.imwrite("preprocess/Gray.png", imgGray);
    //    }

}
