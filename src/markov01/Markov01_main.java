package markov01;

import java.util.Scanner;

public class Markov01_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//P(i,i+1) = p
		System.out.print("Input p > ");
		double p = Double.parseDouble(scan.next());
		
		//n : Simulation Period
		System.out.print("Input n > ");
		int n = Integer.parseInt(scan.next());
		
		//t : Repeat count
		System.out.print("Input t > ");
		int t = Integer.parseInt(scan.next());
		
		Markov01_lib mlib = new Markov01_lib(p, n, t);
		mlib.getSimulation();


	}

}