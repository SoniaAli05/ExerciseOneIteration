package exerciseOneIter;

public class ExerciseOneIter {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println(conditionaltwo(0,2));
			System.out.println(conditionaltwo(2,2));
		}
	}
	
	public static int conditionaltwo(int c, int d){
			if(c!=0 && d!=0) {
			return(c+d);
			}
			
			if(c==0 && d!=0) {
			return(d);
				}
			else if(c!=0 && d==0) {
				return(c);
				}
			else {
				return(c+d);
			}
	}
}
