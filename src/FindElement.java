import java.util.Scanner;

public class FindElement {
    public static int getLength(Scanner scanner){
        int size;
        do{
            System.out.println(" mời bạn nhập vào độ dài mảng: ");
            size = scanner.nextInt();
            if ( size < 1 ){
                System.out.println(" độ dài của mảng phải lớn hơn 0!");
            }
        }while ( size < 1);
        return size;
    }

    public static String [] getElement (int size,Scanner scanner ){
        String []arr = new String[size];
        for ( int i = 0; i < arr.length; i++ ){
            System.out.print("a["+ i+ "] =");
            arr[i] = scanner.nextLine();
        }return  arr;
    }


    public static void disPlay( String arr[]){
        for ( String i :arr ) {
            System.out.println(i);
        }
    }


    public static void findElement(String arr[], Scanner scanner){
        System.out.println(" nhập vào tên muốn tìm: ");
        String element = scanner.nextLine();
        boolean check1 = false;
        for ( int i = 0; i < arr.length; i++ ) {
            if ( arr[i].equals(element)){
                System.out.println(element+ "có vị trí trong mảng là : "+ i);
                check1= true;
                break;
            }
        }
        if (!check1){
            System.out.println(element+" không có trong mảng!");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = getLength(scanner);
        String[] arr = getElement(length,scanner);
        disPlay(arr);
        findElement(arr,scanner);

    }
}
