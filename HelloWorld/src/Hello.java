public class Hello {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int mb = kiloBytes / 1024;
            int kb = kiloBytes % 1024;

            System.out.println(kiloBytes + " KB = " + mb + " MB and " + kb + " KB");
        }
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if ((hourOfDay < 8 || hourOfDay > 22) && barking) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeapYear(int year) {
        if ((year >= 1 && year <= 9999)) {
            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2050);
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
        System.out.println();
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
    }
}
