
class z{
    public void n(int m){
        for (int i=1;i<=m;i++){
            for (int j=0;j<m-i+1;j++){
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}

class ac {
    public void n(int m) {
        for (int i =1; i<m;i++) {
            for (int l = 0; l < m - i - 1; l++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("x");
            }
            for (int k = 0; k < m - i -1 ; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class aq{
    public void n(int m){
        for(int i =0;m-2*i>0;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<m-2*i;k++){
                System.out.print("x");
            }
            for(int l=0;l<i;l++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class an{
    public void n(int m){
        for (int i =0;i<m;i++){
            int star=1;
            if(i%2==0){
                star=0;
            }
            else star=1;
            for (int j=0;j<=i;j++){
                System.out.print(star);
                star=1-star;
            }
            System.out.println();
        }
    }
}

class ab{
    public void n(int m){
        for (int i=1;i<=m;i++){
            for (int j=1;j<m-i+1;j++){
                System.out.print(j );
            }
            System.out.println();
        }
    }
}

public class c {
    public static void main(String[] args) {
        int m = 9;
        an d = new an();
        d.n(m);

    }
}
