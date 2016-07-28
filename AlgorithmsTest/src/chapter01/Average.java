package chapter01;

import edu.princeton.cs.algs4.StdIn;

public class Average {
	private Average(){}
	public static void main(String[] args) {
		int count=0;
		double sum=0.0;
		 while (!StdIn.isEmpty()) {
	            double value = StdIn.readDouble();
			sum+=value;
			count++;
		
		double  average=sum/count;
		System.out.println("Average is "+average);
	}

	}
}
