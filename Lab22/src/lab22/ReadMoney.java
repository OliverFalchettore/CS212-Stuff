package lab22;
import java.io.*;
import java.util.Date;

public class ReadMoney {

  public static void main(String argv[]) throws Exception {
    FileInputStream fis = new FileInputStream("money.out");
    ObjectInputStream ois = new ObjectInputStream(fis);
    Money money = (Money) ois.readObject();
    System.out.println(money);
    ois.close();
    fis.close();
  }
}