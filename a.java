

class v{
    public void n(int m){
        for (int i=1;i<m;i++){
            for (int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

public class a {
    public static void main(String[] args) {
        int m = 10;
        v d = new v();
        d.n(m);
    }
}
