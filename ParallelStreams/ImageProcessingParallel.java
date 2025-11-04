import java.util.*;
import java.util.concurrent.TimeUnit;


public class ImageProcessingParallel {
    public static void main(String[] args) {
        List<String> images=Arrays.asList("img1.jpg", "img2.jpg", "img3.jpg", "img4.jpg", "img5.jpg");
        images.parallelStream().forEach(img->{
            try{
                System.out.println("Processing " + img + " in "+Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            }catch(Exception e){}
        });


    }
}
