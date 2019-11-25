import java.util.Scanner;
class displayBox{
    
    public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
displayer(scan.nextInt(), scan.nextInt());
    }
    public static void displayer(int w, int h) {
        for (int j = 0; j < h; j++) {
        for (int i = 0; i < w; i++) {
        System.out.print("$");
        }
        System.out.println("");
    }
}
}

