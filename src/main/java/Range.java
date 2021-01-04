public class Range {
    private int start;
    private int end;

    public Range(int start, int end) {
        if (start > end) {
            this.start = end;
            this.end = start;
        } else {
            this.start = start;
            this.end = end;
        }
    }

    public Range(int range) {
        this.start = 0;
        this.end = range;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        if (start > end) {
            this.start = end;
            this.end = start;
        } else {
            this.start = start;
        }
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        if (end < start) {
            this.end = start;
            this.start = end;
        } else {
            this.end = end;
        }
    }

    public int rangeLength() {
        return end - start;
    }
}
