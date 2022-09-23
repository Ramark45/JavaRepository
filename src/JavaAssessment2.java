class ZigZagPattern {
        public String zigzag (String str,int noOfRows){
            if (noOfRows == 1)
                return str;
            StringBuilder[] temp = new StringBuilder[noOfRows];
            for (int i=0; i<temp.length;i++)
                temp[i] = new StringBuilder();
            int idx = -1;
            int step = 1;
            for (int i=0;i<str.length();i++) {
                idx =idx+step;
                if (idx==noOfRows) {
                    idx=noOfRows-2;
                    step=-1;
                } else if (idx==-1) {
                    idx=1;
                    step=1;
                }
                temp[idx].append(str.charAt(i));

            }
            String result = "";
            for (int i=0;i<noOfRows;i++)
                result=result+temp[i].toString();
            return result;
        }
}
public class JavaAssessment2{
    public static void main(String[] args) {
        ZigZagPattern z = new ZigZagPattern();
        System.out.println();
        String output = z.zigzag("PAYPALISHIRING",3);
        System.out.println(output);
    }

}
