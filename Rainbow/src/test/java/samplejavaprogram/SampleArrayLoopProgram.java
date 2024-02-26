package samplejavaprogram;

public class SampleArrayLoopProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] num= {11,45,56};
        String [] word ={"kiru", "hari", "kanil"};
        System.out.println(num[2]);
        System.out.println(word[2]);
        System.out.println(num.length);
        System.out.println(word.length);
        for(int i=0; i<num.length; i++)  //increment
        {
            System.out.println(num[i]);
        }
        for(int j=0; j< word.length;j++)
        {
            System.out.println(word[j]);
        }
        for(int i=num.length-1; i>=0;i--) //decrement so give condition as per that
        {
            System.out.println(num[i]);
        }
        for(int j=word.length-1; j>=0;j--)
        {
            System.out.println(word[j]);

	}

}
}
