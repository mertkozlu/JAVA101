public class ContinueBreak {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if (i == 5){
                System.out.println("i sayısı 5'tir.");
                break;
            }
            System.out.println(i);


        }
        System.out.println(".................");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("..");
                continue;
            }
            System.out.println(i);
        }




    }
}

