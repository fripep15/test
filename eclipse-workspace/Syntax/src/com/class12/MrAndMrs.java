package com.class12;

public class MrAndMrs {

	public static void main(String[] args) {


		String[][] msrAdd =
		      {
		          {"Mr ", "Mrs ", "Ms ", "Miss "},
		          {"Smith", "Jordan", "Jackson", "Obama"}};
		    
		    for (int i = 0; i < 1; i++)
		    {
		      for (int j = 0; j < 4; j++)
		      {
		        if (j == 0)
		        {
		          System.out.print(msrAdd[i][j] + msrAdd[1][3] + ", ");
		        } else if (j == 1)
		        {
		          System.out.print(msrAdd[i][j] + msrAdd[1][0] + ", ");
		        } else if (j == 2)
		        {
		          System.out.print(msrAdd[i][j] + msrAdd[1][2] + ", ");
		        } else if (j == 3)
		        {
		          System.out.print(msrAdd[i][j] + msrAdd[1][1] + ", ");
		        }
		      }
		    }

	}

}
