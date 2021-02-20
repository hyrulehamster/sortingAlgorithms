public abstract class main {
    static int[] foo = new int[10];  //arr foo is declared

    //main
    public static void main(String [] args) {
        fillfoo();
        sortingAlgorithm.sort(foo);
    }

    //for testing
    public static void fillfoo(){
        for(int i=0; i<foo.length; i++){
            foo[i] = (int) (Math.random()*10); //foo gets filled with random numbers from 0-10
        }
    }
}
