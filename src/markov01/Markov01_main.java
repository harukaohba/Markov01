package markov01;

import java.util.Arrays;
import java.util.Scanner;

public class Markov01_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double p, size;
		int n, t;
		Scanner scan = new Scanner(System.in);
		System.out.print("複数実行ですか? y or n > ");
		String in = scan.next();
		
		switch(in) {
		case "n":
			//P(i,i+1) = p
			System.out.print("Input p > ");
			p = Double.parseDouble(scan.next());
			
			//n : Simulation Period
			System.out.print("Input n > ");
			n = Integer.parseInt(scan.next());
			
			//t : Repeat count
			System.out.print("Input t > ");
			t = Integer.parseInt(scan.next());
			
			Markov01_lib mlib = new Markov01_lib(p, n, t);
			System.out.println("再帰確率" + mlib.getSimulation());
			break;
			
			
		case "y":
			//step size
			System.out.print("Input step size > ");
			size = Double.parseDouble(scan.next());
			
			//n : Simulation Period
			System.out.print("Input n > ");
			n = Integer.parseInt(scan.next());
			
			//t : Repeat count
			System.out.print("Input t > ");
			t = Integer.parseInt(scan.next());
			
			double[] result = mlib_arrange(size,n,t);
			System.out.println("計算終了");
			Markov01_graph mgraph = new Markov01_graph(size,n,t,result);
			mgraph.setBounds(5,5,600,400);
			mgraph.setVisible(true);
			break;
			
			
		default:
			break;
		}

	}

	private static double[] mlib_arrange(double size, int n, int t) {
		// TODO Auto-generated method stub
		double[] result = new double[(int) (1/size) + 1];
		int size_count = 0;
		for(double i = 0; i <= 1.0; i += size) {
			Markov01_lib mlib = new Markov01_lib(i, n, t);
			mlib.getSimulation();
			result[size_count++] = mlib.getSimulation();	
			System.out.println(i + "cal end");
		}
		return result;
	}

}