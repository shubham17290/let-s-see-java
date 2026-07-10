// Practice program: calculates a telephone bill using slab rates.
import java.util.*;

class bill {
    void billprint() {

        Scanner ob = new Scanner(System.in);
        Double rental_charge;
        System.out.println("input number of phone call:- ");
        int call = ob.nextInt();
        if (call < 0)
            rental_charge = 0.0;
        else if (call <= 100)
            rental_charge = 500.0;
        else if (call <= 200)
            rental_charge = (call - 100) * 1.10 + 500;
        else if (call <= 300)
            rental_charge = 500 + (100 * 1.10) + ((call - 200) * 1.25);
        else
            rental_charge = 500 + (100 * 1.10) + (100 * 1.25) + ((call - 300) * 1.35);

        System.out.println("no. of calls=" + call);
        System.out.println("total bill amount=" + rental_charge);

    }
}
