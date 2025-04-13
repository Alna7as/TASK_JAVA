
package userinfo;
import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // استلام البيانات من المستخدم
        System.out.println("ادخل اسمك: ");
        String name = input.nextLine();

        System.out.println("ادخل عمرك: ");
        int age = input.nextInt();

        System.out.println("ادخل طولك (بـ سم): ");
        double height = input.nextDouble();

        System.out.println("ادخل وزنك (بـ كجم): ");
        double weight = input.nextDouble();

        // طباعة البيانات بشكل منسق
        System.out.println("\n--- بيانات المستخدم ---");
        System.out.println("الاسم  : " + name);
        System.out.println("العمر  : " + age + " سنة");
        System.out.println("الطول : " + height + " سم");
        System.out.println("الوزن : " + weight + " كجم");
    }
}

    
