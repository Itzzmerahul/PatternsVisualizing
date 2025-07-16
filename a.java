

class v{
    public void n(int m){
        for (int i=0;i<m;i++){
            for (int j=0;j<i;j++){
                System.out.print("x ");
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
