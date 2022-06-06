package pl.camp.it;

public class Main {
    public static void main(String[] args) {

        try {
            cos2();
        } catch (MojWyjatek w){
            
        }

        /*try {
            cos();
        } catch (MojWyjatek w) {
            System.out.println("polecial nowy wyjatek !!!");
            w.printStackTrace();
        }*/
        /*String input = "ysadgkfjhasd";

        try {
            int i = Integer.parseInt(input);
        } catch (NumberFormatException blont) {
            System.out.println("podałeś z dupy stringa !!!");
            blont.printStackTrace();
        }*/

        /*try {
            int[] tab = new int[5];

            System.out.println(tab[5]);

            Object object = cos();
            object.toString();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Zepsuło się !!!");
        } catch (Exception e) {
            System.out.println("Zepsuł nię null !!!");
        }


        System.out.println("Cos sie działo dalej !!!");*/
    }

    public static void cos2() throws MojWyjatek {
        cos();
    }

    public static Object cos() throws MojWyjatek {
        throw new MojWyjatek();
    }
}
