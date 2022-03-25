import java.util.*;
import javax.swing.*;

class Result 
{
	int rno;
	int []mrk;
	Result ()
{
	rno = 0;
	mrk = null;
}

void setData(int n)
{
	rno = n;
	int nos= 0 , i=0;
	try
	{
		nos = Integer.parseInt(JOptionPane.showInputDialog(null,"Sub.count"));
	}
	catch(Exception e)
	{
	nos = 5;
	}
	mrk = new int [nos]; 
	while(i<nos)
{
	try
	{
	mrk[i] = Integer.parseInt(JOptionPane.showInputDialog(null , "Marks"+i));
	}
	catch (Exception e)
	{
	continue ;
	}
	i++;
}
}
int getNo()
{
	return rno;
}
int getNos()
{
	return mrk.length;
}
int getTotal()
{
	int tot = mrk[0] , i=1;
	while(i<mrk.length)
	tot += mrk[i++];
	return tot;
}

public String toString()
{
	String a = "Result \n Roll No. :"+rno+"\nMarks :\n"+Arrays.toString(mrk)+"\n Total :"+getTotal();
	return a;
}
void display ()
{
	JOptionPane.showMessageDialog(null,toString());
}
//public static void main (String []args)
//{
//Result r = new Result();
//r.setData(1032);
//r.display();
//}
//}

// Array of objects of type result 


public static void main (String []args)
{
	Result []p = new Result[5];
	int i =0 , no=0;
	while (i<5)
	{
		p[i] = new Result ();
		try
		{
		no = Integer.parseInt(JOptionPane.showInputDialog(null,"Roll No"));
		}
		
		catch (Exception e)
		{
		continue;
		}
		p[i].setData(no);
		i++;
} 

	 i =0;
	while(i<5)
	{
		p[i].display();
		i++;
	}
JOptionPane.showMessageDialog(null,Arrays.toString(p));
}
}

