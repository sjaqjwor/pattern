public class Main {

    public static void main(String arg[]){
            //전략 패턴
        //Character character = new Character();
        //character.setWeapon(new Knife());
        //character.attack();
        //character.setWeapon(new Gun());
        //character.attack();

        // 팩토리 메소드 패턴
        CheckM checkM = new CheckM();
        FactoryMethodP factoryMethodP = checkM;
        System.out.println(factoryMethodP.allCheck());

        FactoryMethodP factoryMethodP1 = new Checkm();
        System.out.println(factoryMethodP1.allCheck());
    }
}
