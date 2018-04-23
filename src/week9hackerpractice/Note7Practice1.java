package week9hackerpractice;

public class Note7Practice1 {
	public static void main(String[] arg) {
		double[][] A1 = {{-2,1,0,0},{1,-2,1,0},{0,1,-2,1},{0,0,1,-2}};
		double[][] A2 = {{-2,1,0,0},{1,-2,1,0},{0,1,-2,1},{0,0,1,-1}};
		double[] b = {-1,0,0,0};
		Solver sol = new Solver();
		double[] s1 = sol.solution(A1, b);
		double[] s2 = sol.solution(A2, b);
		System.out.println("The solution of discretized Poisson equation is:");
		for(int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		System.out.println("When the boundary condition is Neumann, the solution is:");
		for(int i = 0; i < s2.length; i++) {
			System.out.println(s2[i]);
		}
	}
}
