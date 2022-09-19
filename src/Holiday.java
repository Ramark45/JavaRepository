public class Holiday {
    private String name;
    private int day;
    private String month;
    public Holiday(String n, int d, String m)
    {
        name = n;
        day = d;
        month = m;
    }

    public boolean inSameMonth(Holiday hol){

        if(hol.month.equals(this.month))
        {
            return  true;
        }
        else {
            return false;
        }
    }

    public static double avgDate(Holiday[] hol) {
        int sum = 0;
        for(int i = 0; i < hol.length; i++) {
            sum = sum + hol[i].day;
        }
        return ((double) sum)/hol.length;
    }


    public static void main(String[] args) {
        Holiday obj = new Holiday("Independence Day\n", 4, "July");
        Holiday obj1 = new Holiday("Independence Day\n", 28, "August");
        System.out.println(obj.inSameMonth(obj1));
        Holiday[] list = new Holiday[2];
        list[0] = obj;
        list[1] = obj1;
        System.out.println(avgDate(list));
    }

}
