package week9hackerpractice;

public class Note7Practice2 {
	public static void main(String[] arg) {
		double Nd = Math.pow(10, 15);
		double Na = Math.pow(10, 17);
		double phi0 = 1;
		double h = Math.pow(10, -3);
		double Ld = 2.4 * Math.pow(10, -3);
		double Vt = 0.026;
		h /= Ld;   // normalization
		double[][] A = {{-4,1,0,1,0,0,0,0,0}, {1,-4,1,0,1,0,0,0,0},{0,1,-4,0,0,1,0,0,0},{1,0,0,-4,1,0,1,0,0},{0,1,0,1,-4,1,0,1,0},{0,0,1,0,1,-4,0,0,1},{0,0,0,1,0,0,-4,1,0},{0,0,0,0,1,0,1,-4,1},{0,0,0,0,0,1,0,1,-4}};
		double[] b = new double[9];
		b[0] = -h * h * Nd - 2 * phi0;
		b[1] = -h * h * Nd;
		for(int i = 2; i < 9; i++) {
			b[i] = h * h * Na;
		}
		b[3] = -h * h * Nd;
		Solver sol = new Solver();
		double[] res = sol.solution(A, b);
		for(int i = 0; i < 9; i++) {
			res[i] *= Vt;
		}
		System.out.println("The solution is:");
		for(int i = 0; i < 9; i++) {
			System.out.println(res[i]);
		}
	}
}
