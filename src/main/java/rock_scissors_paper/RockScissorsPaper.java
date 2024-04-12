package rock_scissors_paper;

/* 규칙
   사용자에게 가위, 바위, 보 중 하나를 선택하도록 요청합니다.
   사용자의 선택이 잘못된 경우 오류 메시지를 출력합니다.
   컴퓨터의 선택을 무작위로 생성합니다.
   사용자와 컴퓨터의 선택을 문자열로 변환합니다.
   게임의 승패를 판단하고 결과를 출력합니다.
   사용자에게 다시 게임을 시작할지 여부를 묻습니다.
        */

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        while (true) {
            System.out.println("가위, 바위, 보 중 하나를 선택하세요 : ");

            HandShape computerHand = getComputerHandShape();

            HandShape userHand;
            try {
                userHand = getUserHandShape();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("컴퓨터: " + computerHand);
            System.out.println("당신 : " + userHand);

            userHand.match(computerHand);

            System.out.println("다시 게임하시겠습니까? (y/n) : ");
            while (true) {
                String restart = scanner.next().toLowerCase();
                if (restart.equals("n")) {
                    System.out.println("게임을 종료합니다. 감사합니다!");
                    return;
                } else if (restart.equals("y")) {
                    System.out.println("게임을 다시 시작합니다!");
                    break;
                } else {
                    System.out.println("y or n 을 입력해주세요.");
                }
            }
        }
    }

    private static HandShape getUserHandShape() {
        String inputShape = scanner.next();
        return HandShape.toHandShape(inputShape);
    }

    private static HandShape getComputerHandShape() {
        int computerNumber;
        computerNumber = random.nextInt(3) + 1;
        return HandShape.toHandShape(computerNumber);
    }
}
