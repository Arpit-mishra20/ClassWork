public class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14;
        int totalStudents = 3;
        
        int pensPerStudent = totalPens / totalStudents;
        int remainingPens = totalPens % totalStudents;
        
        System.out.printf("The Pen Per Student is %d and the remaining pen not distributed is %d%n", pensPerStudent, remainingPens);
    }
}
