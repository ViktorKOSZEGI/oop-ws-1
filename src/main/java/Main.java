public class Main {
    public static void main(String[] args) {
        Range myRange1 = new Range(1, 10);
        Range myRange2 = new Range(11, 18);
        System.out.println("myRange1 = (" + myRange1.getStart() + " : " + myRange1.getEnd() + ")");
        System.out.println("rangeLength1 = " + myRange1.rangeLength());
        System.out.println("myRange2 = (" + myRange2.getStart() + " : " + myRange2.getEnd() + ")");
        System.out.println("rangeLength2 = " + myRange2.rangeLength());
        myRange1.setStart(11);
        myRange2.setStart(21);
        System.out.println("myRange1 = (" + myRange1.getStart() + " : " + myRange1.getEnd() + ")");
        System.out.println("rangeLength1 = " + myRange1.rangeLength());
        System.out.println("myRange2 = (" + myRange2.getStart() + " : " + myRange2.getEnd() + ")");
        System.out.println("rangeLength2 = " + myRange2.rangeLength());
        Range myRange3 = new Range(14);
        System.out.println("myRange3 = (" + myRange3.getStart() + " : " + myRange3.getEnd() + ")");
        System.out.println("rangeLength3 = " + myRange3.rangeLength());
    }
}
