import java.util.regex.Matcher;
import java.util.regex.Pattern;


class b{

        public static Boolean isvalidno(String str){


            Pattern p = Pattern.compile("0?[0-9]{10}");
           // Matcher m = p.matcher("8888765890");
            Matcher m = p.matcher(str);
            return (m.find());

        }




    public static void main(String[] args) {
        String str ="78902458907";
      if (isvalidno(str)){
          System.out.println("valid");

      }
      else {
          System.out.println("invalid");
      }


}}