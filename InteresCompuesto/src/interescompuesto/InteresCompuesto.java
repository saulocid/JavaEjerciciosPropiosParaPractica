package interescompuesto;

public class InteresCompuesto {

    public static void main(String[] args) {

        double cen = 0.01;
        
        System.out.println("Si eliges $0.01 y duplicarlo al día siguiente durante 30 días ocurre lo siguiente:");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < 30; i++) {
            if (i == 0) {
                System.out.println("En el día " + (i + 1) + " tienes $" + cen);
            } else {
                cen *= 2;
                System.out.println("En el día " + (i + 1) + " tienes $" + cen);
            }
            System.out.println("-----------------------------------------");//
        }
    }

}
