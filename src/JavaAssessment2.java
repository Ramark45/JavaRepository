class ZigZagPattern {
        public String zigzag (String str,int nRows){
            if (nRows == 1)
                return str;
            StringBuilder[] temp = new StringBuilder[nRows];
            for (int i=0; i<temp.length;i++)
                temp[i] = new StringBuilder();
            int idx = -1;
            int step = 1;
            for (int i=0;i<str.length();i++) {
                idx =idx+step;
                if (idx==nRows) {
                    idx=nRows-2;
                    step=-1;
                } else if (idx==-1) {
                    idx=1;
                    step=1;
                }
                temp[idx].append(str.charAt(i));

            }
            String result = "";
            for (int i=0;i<nRows;i++)
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
