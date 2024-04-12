package step3;

public class RockScissorsPaper {
    public static void main(String[] args) {
        System.out.println("가위바위보 게임을 시작합니다!");
        GameLoop gameLoop = new GameLoop();
        while (gameLoop.run()) ;
        System.out.println("게임을 종료합니다.");
    }
}
