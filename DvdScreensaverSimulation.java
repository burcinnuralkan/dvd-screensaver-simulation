/*
 * Author: Burcinnur Alkan
 * Version: 2.0
 * Date: 2024-10-23
 */

 public class DvdScreensaverSimulation {

    public static void main(String[] args) throws InterruptedException {
        int width = 30;
        int height = 10;

        int x = 5;
        int y = 5;
        int dx = 1;
        int dy = 1;

        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if (i == y && j == x) {
                        System.out.print("DVD");
                        j += 2;
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            x += dx;
            y += dy;

            if (x <= 0 || x >= width - 3) dx = -dx;
            if (y <= 0 || y >= height - 1) dy = -dy;

            Thread.sleep(200);
        }
    }
}
