public abstract class FactoryMethodP {

    protected abstract boolean check();
    protected abstract boolean check2();

    public boolean allCheck(){
        boolean t=check();
        System.out.println(t);
        boolean t1=check2();
        System.out.println(t1);
        return t==t1;
    }
}
