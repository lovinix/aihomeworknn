import java.io.*;

public class Main2446
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<i;++j)
            {
                bw.write(" ");
            }
            for(int j=0;j<2*(n-i)-1;++j)
            {
                bw.write("*");
            }
            bw.write("\n");
        }
        for(int i=n-2;i>=0;--i)
        {
            for(int j=i;j>0;--j)
            {
                bw.write(" ");
            }
            for(int j=0;j<2*(n-i)-1;++j)
            {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.close();
    }

}
