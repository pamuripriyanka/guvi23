/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class number
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num=124;
		if(num>0)
		{
			System.out.println(num+ "positive");
		}
			else if(num<0)
			{
				System.out.println(num+"negative");
			}
				else
				{
					System.out.println(num+" is either positive or negative");
				}
	}
}
