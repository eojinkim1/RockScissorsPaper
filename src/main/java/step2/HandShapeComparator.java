package step2;

import java.util.Comparator;

public class HandShapeComparator implements Comparator<HandShape> {
    @Override
    public int compare(HandShape shape1, HandShape shape2) {
        if (shape1 == shape2) {
            return 0;
        } else if (shape1.index() % 3 + 1 == shape2.index()) {
            return 1;
        } else {
            return -1;
        }
    }
}
