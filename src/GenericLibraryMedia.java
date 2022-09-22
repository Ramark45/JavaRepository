import java.util.Scanner;

class Media {
    public String book;
    public String video;
    public String newsPaper;

    Media(String book,String video,String newsPaper){
        this.book=book;
        this.video=video;
        this.newsPaper=newsPaper;
    }

    public void print(){
        System.out.println("Book Name :"+book+"\nVideo Name :"+video+"\nNews Paper Name :"+newsPaper);

    }
}
class GenericLibrary<T>
{
    T book,video,newsPaper;
    public GenericLibrary(T book,T video,T newsPaper){
        this.book=book;
        this.video=video;
        this.newsPaper=newsPaper;
    }
    public void PrintLibrary(){
        System.out.println("Book Name :"+book+"\nVideo Name :"+video+"\nNews Paper Name :"+newsPaper+"\n");
    }

}
public class GenericLibraryMedia{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Book Name :");
        String book = input.nextLine();
        System.out.println("Enter Video Name :");
        String video = input.nextLine();
        System.out.println("Enter News Paper Name :");
        String newsPaper = input.nextLine();

        Media media1 = new Media(book,video,newsPaper);
        System.out.println("\nLibrary Media :");
        media1.print();
        GenericLibrary gen =new GenericLibrary(book,video,newsPaper);
        System.out.println("\nGeneric Library Media :");
        gen.PrintLibrary();

    }

}
