package fifth;

import java.util.Scanner;

public class Tic_tac_toe_game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int Size=3;
		int[][] board=new int[Size][Size];
		boolean getResult=false;
		int num0fX=0;
		int num0fO=0;
		//读入矩阵；
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j]=in.nextInt();
			}
		}
		//检查行；
		for(int i=0;i<Size;i++)
		{
			num0fX=0;
			num0fO=0;
			for(int j=0;i<Size;j++)
			{
				if(board[i][j]==1) 
				{
					num0fX++;
				}
				else
				{
					num0fO++;
				}
			}			
			if(num0fX==Size || num0fO==Size)
			{
				getResult=true; 
				break;
			}
		}
        //检查列；
		if(!getResult)
		{
			for(int i=0;i<board.length;i++)
			{
				num0fX=0;
				num0fO=0;
				for(int j=0;j<board.length;j++)
				{
					if(board[j][i]==1)
					{
						num0fX++;
					}
					else
					{
						num0fO++;
					}
			     }
				if(num0fO==Size || num0fX==Size)
				{
					getResult=true; 
					break;
				}
			}
		}
		//检查对角线
		if(!getResult)
		{
			num0fX=0;
			num0fO=0;
			for(int i=0;i<board.length;i++)
			{
				if(board[i][i]==1)
				{
					num0fX++;
				}
				else
				{
					num0fO++;
				}
			}
			if(num0fX==Size || num0fO==Size)
			{
				getResult=true;
			}
		}
		//检查反对角线；
		if(!getResult)
		{
			num0fX=0;
			num0fO=0;
			for(int i=0;i<Size;i++)
			{
				if (board[i][Size-i-1]==1)
				{
					num0fX++;
				}
				else
				{
					num0fO++;
				}
			}
			if(num0fX==Size || num0fO==Size)
			{
				getResult=true;
			}
		}
		//判断
		if(getResult)
		{
			if(num0fX==Size)
			{
				System.out.println("X wins the game!");
			}
			else
			{
				System.out.println("O wins the game!");
			}
		}
	}

}
