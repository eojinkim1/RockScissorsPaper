package step2;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {
    private static final Random RANDOM = new Random();
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("가위바위보 게임을 시작합니다!");
        while (true) {
            System.out.println("가위, 바위, 보 중 하나를 선택하세요 :");
            try {
                HandShape computerHand = getComputerHandShape();
                HandShape userHand = getUserHandShape();
                System.out.println("컴퓨터 : " + computerHand);
                System.out.println("당신 : " + userHand);
                int judge = computerHand.judge(userHand);
                if (judge == 0){
                    System.out.println("비겼습니다.");
                } else if (judge < 0) {
                    System.out.println("컴퓨터가 이겼습니다.");
                } else {
                    System.out.println("당신이 이겼습니다.");
                }
                System.out.println();
            } catch (IllegalArgumentException e) {
                continue;
            }

            System.out.println("다시 게임하시겠습니까? (Y / N) : ");
            while (true) {
                String result = SCANNER.next().toUpperCase();
                if (result.equals("Y")) {
                    System.out.println("새로운 게임을 시작합니다!");
                    break;
                } else if (result.equals("N")) {
                    System.out.println("게임을 종료합니다!");
                    return;
                } else {
                    System.out.println("잘못된 입력입니다.");
                    System.out.println("다시 게임하시겠습니까? (Y / N) : ");
                }
            }
        }
    }

    private static HandShape getComputerHandShape() {
        int computerShape = RANDOM.nextInt(3) + 1;
        return HandShape.toHandShape(computerShape);
    }

    private static HandShape getUserHandShape() {
        String userShape = SCANNER.next();
        return HandShape.toHandShape(userShape);
    }
}