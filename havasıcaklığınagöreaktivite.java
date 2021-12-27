import java.util.Scanner;

public class havasıcaklığınagöreaktivite {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int heat;

        System.out.print("Lütfen sıcaklığı giriniz : ");
        heat = inp.nextInt();

        if (heat < 5) {
            System.out.print("Kayak yapabilirsiniz");
        } else if (heat >= 5 && heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsin.");
            }
            if (heat >= 10) {
                System.out.print("Pikniğe gidebilirsiniz.");
            }
        } else {
            System.out.print("Yüzmeye gidebilirsin.");

        }
    }
}

