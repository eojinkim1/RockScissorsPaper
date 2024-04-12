package step3;

import java.util.Scanner;

public class GameRestart {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static boolean askRestart() {
        while (true) {
            System.out.println("다시 게임하시겠습니까? (Y / N) : ");
            String restart = SCANNER.next().toUpperCase();
            if (restart.equals("Y")) {
                return true;
            } else if (restart.equals("N")) {
                return false;
            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
