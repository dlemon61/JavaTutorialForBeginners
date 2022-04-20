import java.awt.*;
import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
      // $1,234,567
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);


    }
}
