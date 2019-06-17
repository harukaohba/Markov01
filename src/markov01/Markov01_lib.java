package markov01;

import java.util.Random;

public class Markov01_lib {
	private double p; //右へ移動する確率
	private int n, t; //n:シミュレーション時間, t:繰り返し時間
	
	public Markov01_lib(double p, int n, int t) {
		this.p = p;
		this.n = n;
		this.t = t;
	}
	
	//Theoretical value
	public double getValue() {
		
		return 0;
	}
	
	//p = 1/2 => Reccurent, p =! 1/2 => Transient
	public double getSimulation() {
		double prob[] = new double[t];
		int position = 0; 
		double random_val = 0.0;
		Random rnd = new Random();	
		for(int i = 0; i < t; i++) {
			prob[i] = 0;
			for(int j = 0; j < n; j++) {
				random_val = rnd.nextFloat();	
				if(random_val < p) {
					//right
					position++;
				}else {
					//left
					position--;
				}
				if(position == 0) {
					//再帰
					prob[i] = 1;
					break;
				}
			}
		}
		
		//再帰確率計算
		double repro = 0;
		for(int i = 0; i < t; i++) {
			if(prob[i] == 1)repro++;
		}
		repro /= t;
		//System.out.println("再帰確率" + repro);
		
		return repro;
	}
	

}