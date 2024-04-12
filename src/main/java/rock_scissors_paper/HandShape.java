package rock_scissors_paper;

public enum HandShape {
    ROCK,
    SCISSORS,
    PAPER;

    public boolean isRock() {
        return this == HandShape.ROCK;
    }

    public boolean isScissors() {
        return this == HandShape.SCISSORS;
    }

    public boolean isPaper() {
        return this == HandShape.PAPER;
    }

    public static HandShape toHandShape(int number) {
        return switch (number) {
            case 1 -> HandShape.SCISSORS;
            case 2 -> HandShape.ROCK;
            case 3 -> HandShape.PAPER;
            default -> throw new IllegalArgumentException("가위, 바위, 보 중에서 입력하세요.");
        };
    }

    public static HandShape toHandShape(String shape) {
        return switch (shape) {
            case "가위" -> HandShape.SCISSORS;
            case "바위" -> HandShape.ROCK;
            case "보" -> HandShape.PAPER;
            default -> throw new IllegalArgumentException("가위, 바위, 보 중에서 입력하세요.");
        };
    }

    public void match(HandShape other) {
        if (this == other) {
            System.out.println("비겼습니다.");
        }
        if (this.isScissors() && other.isPaper()) {
            System.out.println("컴퓨터가 이겼습니다.");
        }
        if (this.isScissors() && other.isRock()) {
            System.out.println("당신이 이겼습니다.");
        }
        if (this.isRock() && other.isPaper()) {
            System.out.println("당신이 이겼습니다.");
        }
        if (this.isRock() && other.isScissors()) {
            System.out.println("컴퓨터가 이겼습니다.");
        }
        if (this.isPaper() && other.isScissors()) {
            System.out.println("당신이 이겼습니다.");
        }
        if (this.isPaper() && other.isRock()) {
            System.out.println("컴퓨터가 이겼습니다.");
        }
    }
}
