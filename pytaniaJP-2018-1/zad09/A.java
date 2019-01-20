public class A{
	public static void main(){
		int i = 0, j = 0;
		et2 : while (i < 3)
		{
		  i++;
		et1:
		  do {
		    System.out.print(i + " " + j + ",");
		    if (i % 2 == 0)
		      continue et2;
		    else
		      break et1;
		    j++;
		  } while (j < 3);
		  j = 0;
		}
	}
}