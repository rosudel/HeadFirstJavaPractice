// page 251
// returning array
public class test {
    public static void main(String[] args)
    {
        returnArray obj = new returnArray();
        int[] ar = obj.fun();

        for(int i = 0; i < 3; i++)
            System.out.println(ar[i]);

    }
}
