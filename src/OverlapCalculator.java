public class OverlapCalculator {
    private int bx1;
    private int by1;
    private int tx1;
    private int ty1;
    private int bx2;
    private int by2;
    private int tx2;
    private int ty2;

    public OverlapCalculator(int bx1, int by1, int tx1, int ty1, int bx2, int by2, int tx2, int ty2) {
        this.bx1 = bx1;
        this.by1 = by1;
        this.tx1 = tx1;
        this.ty1 = ty1;
        this.bx2 = bx2;
        this.by2 = by2;
        this.tx2 = tx2;
        this.ty2 = ty2;
    }

    public long calculateOverlap(){
        long result;
        if (checkIfNotOverlap()){
            result = 0;
        }
        else {
            result = calculateField();
        }
        return result;
    }

    private boolean checkIfNotOverlap(){
        boolean result = false;
        if (bx1 > tx2 || bx2 > tx1 || by1 > ty2 || by2 > ty1) {
            result = true;
        }
        return result;
    }

    private long calculateField(){
        long result;
        long width = Math.min(tx1, tx2) - Math.max(bx1, bx2);
        long height = Math.min(ty1, ty2) - Math.max(by1, by2);
        result = width * height;
        return result;
    }
}
