package step3;

public enum HandShape2 {
    가위,
    바위,
    보;
    private static final HandShapeCompare HAND_SHAPE_COMPARE = new HandShapeCompare();

    public static HandShape2 toHandShape(int computerHand) {
        return switch (computerHand) {
            case 1 -> 가위;
            case 2 -> 바위;
            case 3 -> 보;
            default -> throw new IllegalArgumentException();
        };
    }

    public static HandShape2 toHandShape(String userHand) {
        return switch (userHand) {
            case "가위" -> 가위;
            case "바위" -> 바위;
            case "보" -> 보;
            default -> throw new IllegalArgumentException("가위, 바위, 보 중에 하나를 입력하세요 :");
        };
    }

    public int index() {
        return this.ordinal() + 1;
    }

    public int judge(HandShape2 other) {
        return HAND_SHAPE_COMPARE.ShapeCompare(this, other);
    }
}
