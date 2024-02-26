package samplejavaprogram;

import java.util.Scanner;

public class SampleProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NumberOfWorkingDays =20;
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the role");
        String role=myobj.nextLine();
        System.out.println("Role is:" + role);



if(role.equals("manager")){
    System.out.println(NumberOfWorkingDays* 500);
} else if (role.equals("staff"))
{
    System.out.println(NumberOfWorkingDays* 350);
}
else if(role.equals("clerk"))
{
    System.out.println(NumberOfWorkingDays*200);
}
else {
    System.out.println("invalid role");
	}

}
}
