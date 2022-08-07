package learnFromInterview;

public class FindPrimeNum {

	public static void main(String[] args) {
		 int num = 4;
		 boolean flag = false;
		 
		 for (int i = 2; i <=  num / 2; ++i) {
			 if (num % i == 0) {
				 		flag = true;
				 		break;
			}
		 }
			 if (!flag) {
				 	System.out.println(num + "is  prime");
			}else {
			 	System.out.println(num + "is  no prime");
		 
		}
		 
	}

}
