package trainingA;

import java.util.Scanner;

public class Tuesday 
{
	public static int screen[][] = {{2, 1, 1, 1, 1, 1, 1, 1},
						            {1, 1, 1, 1, 1, 1, 0, 0},
						            {1, 0, 0, 1, 1, 0, 1, 1},
						            {1, 2, 2, 2, 2, 0, 1, 0},
						            {1, 1, 1, 2, 2, 0, 1, 0},
						            {1, 1, 1, 2, 2, 2, 2, 0},
						            {1, 1, 1, 1, 1, 2, 1, 1},
						            {1, 1, 1, 1, 1, 2, 2, 1},
						            };
	public static void fill(int[][] image,int x,int y,int newColor,int prevColor)
	{
		if((x<0 || x>=image.length) || (y<0 || y>=image[0].length))
	        return;
	    
	    if(image[x][y] != prevColor || image[x][y] == newColor)
	        return;
	    
	
	    image[x][y] = newColor;
	    
	    fill(image,x-1,y,newColor,prevColor);
	    fill(image,x+1,y,newColor,prevColor);
	    fill(image,x,y-1,newColor,prevColor);
	    fill(image,x,y+1,newColor,prevColor);
	    fill(image,x+1,y+1,newColor,prevColor);
	    fill(image,x-1,y+1,newColor,prevColor);
	    fill(image,x+1,y-1,newColor,prevColor);
	    fill(image,x-1,y-1,newColor,prevColor);
	}
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int x, y,newC;
		String answer="yes";
		
		while(answer.equals("yes"))
		{
			System.out.println("Enter the point in which you want to start (x then y)");
			x = in.nextInt();
			y = in.nextInt();
			
			
			
			System.out.println("Enter the num of the new color that you want");
			newC = in.nextInt();
			
			fill(screen, x, y, newC,screen[x][y]);
			
					
			System.out.println("Updated screen after call to floodFill: ");
			for (int i = 0; i < screen.length; i++)
			{
			    for (int j = 0; j < screen[0].length; j++)
			    System.out.print(screen[i][j] + " ");
			    System.out.println();
			}
			System.out.println("Do you want to continue? yes/no");
			answer = in.next();
		

		}
		
		in.close();
	}

}


