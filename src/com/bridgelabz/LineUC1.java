

package com.bridgelabz;

import java.util.*;

public class LineUC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner Sc = new Scanner(System.in);

	        // input co=ordinate of line 1 using Cartesian system,
	        System.out.println("Enter the value of X1 in line 1");
	        int x1 = Sc.nextInt();
	        System.out.println("Enter the value of Y1 in line 1");
	        int y1 = Sc.nextInt();
	        System.out.println("Enter the value of X2 in line 1");
	        int x2 = Sc.nextInt();
	        System.out.println("Enter the value of Y2 in line 1");
	        int y2 = Sc.nextInt();

	        double length1 = Math.sqrt((double)((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));
	        System.out.println("The line length 1 is :" + length1);
	        
		
	}

}
