public class SingleTonp {
    private static SingleTonp singleTonp;

    private SingleTonp(){

    }
    public static SingleTonp getSingleTonp() {
        if(singleTonp==null){
            singleTonp=new SingleTonp();
        }
        return singleTonp;
    }
}
