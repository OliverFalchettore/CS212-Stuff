package lab22;
import java.io.*;
import java.util.Date;

public class SaveMoney {

  public static void main(String argv[]) throws Exception {
    FileOutputStream fos = new FileOutputStream("money.out");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    Money money = null;
    money = new Quarter();
    oos.writeObject(money);

    oos.flush();
    oos.close();
    fos.close();
  }
}