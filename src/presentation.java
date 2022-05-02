import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.Scanner;

public class presentation {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String doaClassName=scanner.nextLine();
        Class<?> cDoa = Class.forName(doaClassName);
        Object dao= cDoa.getDeclaredConstructor().newInstance();
        String metierClasName=scanner.nextLine();
        Class<?> cMetier=Class.forName(metierClasName);
        IMetier metier =(IMetier) cMetier.getDeclaredConstructor().newInstance();
        Method m=cMetier.getMethod("setDao",IDao.class);
        m.invoke(metier,dao);
        System.out.println("res=>" + metier.calcul());
    }
}
