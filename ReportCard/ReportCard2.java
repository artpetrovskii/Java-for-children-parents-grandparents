public class ReportCard2 extends ReportCard{
public static void main(String[] args) {
ReportCard rc = new ReportCard();
char yourGrade = rc.convertGrades(88);
switch(yourGrade) {
case 'A':
	System.out.println("Excellent work!");
	break;
case 'B':
	System.out.println("Good work!");
	break;
case 'C':
	System.out.println("Retry yourself!");
	break;
case 'D':
	System.out.println("Be more serious!");
	break;
	}
   }
}
