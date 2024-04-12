package step2;

public enum HandShape1 {
    가위,
    바위,
    보;

    private static final HandShapeComparator HAND_SHAPE_COMPARATOR = new HandShapeComparator();

    public static HandShape1 toHandShape(int computerShape) {
        return switch (computerShape) {
            case 1 -> 가위;
            case 2 -> 바위;
            case 3 -> 보;
            default -> throw new IllegalArgumentException();
        };
    }

    public static HandShape1 toHandShape(String userShape) {
        return switch (userShape) {
            case "가위" -> 가위;
            case "바위" -> 바위;
            case "보" -> 보;
            default -> throw new IllegalArgumentException("가위, 바위, 보 중에서 입력하세요.");
        };
    }

    public int index() {
        return this.ordinal() + 1;
    }
    public int judge(HandShape1 other){
        return HAND_SHAPE_COMPARATOR.compare(this, other);
    }
}