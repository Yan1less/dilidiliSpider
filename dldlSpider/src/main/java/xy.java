import org.junit.Test;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class xy {
    @Test
    public void xxxx(){
        String years="201902";
        Pattern compile = Pattern.compile("20\\d{4}");
        Matcher matcher = compile.matcher(years);
        String temp = years.substring(years.length()-2,years.length());
        if(temp.equals("01")||temp.equals("04")||temp.equals("07")||temp.equals("10"))
            System.out.println("yes");
        System.out.println(matcher.matches());
    }
}
