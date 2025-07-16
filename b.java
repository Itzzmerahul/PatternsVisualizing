

class x{
    public void n(int m){
        for (int i=1;i<m;i++){
            for (int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

public class b {
    public static void main(String[] args) {
        int m = 10;
        x d = new x();
        d.n(m);
    }
}
