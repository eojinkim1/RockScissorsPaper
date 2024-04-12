package step3;

import java.util.Random;
import java.util.Scanner;

public class GameLoop {
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);

    public boolean run() {
        while (true) {
            System.out.println("가위, 바위, 보 중에 하나를 선택하세요 :");

            HandShape2 computerHand = getComputerHand();
            HandShape2 userHand;

            try {
                userHand = getUserHand();
            } catch (IllegalArgumentException e) {
                continue;
            }

            System.out.println("컴퓨터 : " + computerHand);
            System.out.println("당신 : " + userHand);

            int judge = computerHand.judge(userHand);

            switch (judge) {
                case 0 -> System.out.println("비겼습니다.");
                case 1 -> System.out.println("당신이 이겼습니다.");
                case -1 -> System.out.println("컴퓨터가 이겼습니다.");
            }
            if (!GameRestart.askRestart()) {
                return false;
            }
        }
    }

    private static HandShape2 getComputerHand() {
        int inputShape = RANDOM.nextInt(3) + 1;
        return HandShape2.toHandShape(inputShape);
    }

    private static HandShape2 getUserHand() {
        String inputShape = SCANNER.next();
        return HandShape2.toHandShape(inputShape);
    }
}
