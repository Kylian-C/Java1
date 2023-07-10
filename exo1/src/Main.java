public class Main {
    public static void main(String[] args) {
        int carton = 34;
        int cap = 9 ;
        while (carton>0){
            if (carton>=cap){
                System.out.println("Il livre " + cap);
                carton = carton - cap;
            }
            else {
                System.out.println("Il livre " + carton);
                carton = carton - cap ;
            }
        }
    }
}