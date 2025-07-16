class he{
    public void me(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("x ");
            }
            System.out.println();
        }

    }
}


class Simple {
    public static void main(String[] args) {
        int n = 5;
        he o = new he();
        o.me(n);
    }
}
