package unitTesting;

public class TestingTask {
	public static String result=null;
	public static void main(String[] args) {
		findTwoLargestNumbers(args);
	}

	public static void findTwoLargestNumbers(String[] args) {
		
		int ma1 = 1, ma2 = 0;
	
		if (args.length == 0) {                            /* 1 */
			System.out.println("No numbers");
		    result="No numbers";
		}
		else {
			ma1 = Integer.parseInt(args[0]);
			if (args.length == 1) {                        /* 2 */
				System.out.println("largest = " + ma1);
			
			    result=""+ma1;
			}
			else {
				int obs = Integer.parseInt(args[1]);
				//ma2=obs;
				if (obs > ma1)                               /* 3 */
				{
					ma2 = ma1;
					ma1 = obs;
				}
				else if(obs<ma1) {
					ma2=obs;
				}
				for (int i = 2; i < args.length; i++)          /* 4 */
				{
					obs = Integer.parseInt(args[i]);
					if (obs > ma1) /* 5 */
					{
						ma2 = ma1;
						ma1 = obs;
					} else if (obs > ma2) /* 6 */
						ma2 = obs;
				}
				System.out.println("The two largest are " + ma1 + " and " + ma2);
				 result=ma1+","+ma2;
			}
		
		}
	}
}
