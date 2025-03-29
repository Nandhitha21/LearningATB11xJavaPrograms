package ex_16_Arrays;

public class Lab133_Arrays_Part2 {
    public static void main(String[] args) {
        String[] names = {"Pramod", "Naqndhitha","Raja"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);

        String[] name_atb11x = new String[3];
        name_atb11x[0]="Naveen";
        name_atb11x[1]="Praveen";
        name_atb11x[2]="AKal";

        System.out.println(name_atb11x[0]);
        System.out.println(name_atb11x[2]);

        boolean[] male_data = new boolean[3];
        male_data[0]=true;
        male_data[1]=false;
    }
}
