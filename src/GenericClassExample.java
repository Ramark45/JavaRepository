public class GenericClassExample <generic>{
        generic g;
        public GenericClassExample(generic g){
            this.g=g;
        }
        public generic getG(){
            return g;
        }

        public static void main(String[] args) {
            GenericClassExample<String> gen1 = new GenericClassExample<String>("This is Generic method");
            GenericClassExample<Integer>gen2 = new GenericClassExample<Integer>(100);
            System.out.println(gen1.getG());
            System.out.println(gen2.getG());
        }
    }
