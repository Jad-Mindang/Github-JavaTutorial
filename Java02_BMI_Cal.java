import java.util.Scanner;

public class Java02_BMI_Cal {
    public static void main(String[] args) {
        // 1. สร้าง Object Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("=== BMI Calculator ===");

        // 2. รับข้อความทั้งบรรทัด (nextLine)
        System.out.print("Please enter your full name: ");
        String name = sc.nextLine();

        // 3. รับเลขทศนิยม (nextDouble)
        System.out.print("Please enter your weight (kg): ");
        double weight = sc.nextDouble();

        System.out.print("Please enter your height (cm): ");
        double heightCm = sc.nextDouble();

        // 4. รับเลขจำนวนเต็ม (nextInt)
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();

        // --- ส่วนการคำนวณ ---
        double heightM = heightCm / 100; // แปลง ซม. เป็น เมตร
        double bmi = weight / (heightM * heightM);

        // --- ส่วนการแสดงผล ---
        System.out.println("\n--- RESULT ---");
        System.out.println("You: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.printf("Your BMI is  : %.2f\n", bmi); // %.2f คือแสดงทศนิยม 2 ตำแหน่ง
        System.out.println("-x-x---x-x--x-x-x-x-");
        // ปิด Scanner เมื่อใช้งานเสร็จ
        sc.close();                 // Hello test
    }
}
