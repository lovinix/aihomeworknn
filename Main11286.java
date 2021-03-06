import java.io.*;
import java.util.PriorityQueue;

public class Main11286
{
    static PriorityQueue<Integer> q;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        q = new PriorityQueue<>((o1,o2)->Math.abs(o1)-Math.abs(o2)==0?o1-o2:Math.abs(o1)-Math.abs(o2));
        int N = Integer.parseInt(br.readLine());
        while(N-->0)
        {
            int x = Integer.parseInt(br.readLine());
            if(x==0)
            {
                if(q.isEmpty()) bw.write("0\n");
                else bw.write(q.poll()+"\n");
            }
            else
            {
                q.offer(x);
            }
        }
        bw.close();
    }
}
