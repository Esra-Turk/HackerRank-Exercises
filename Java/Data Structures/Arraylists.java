import java.util.*;

public class Arraylists{
    public static void main(String[] args){
        int n,p;
        String numbers;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        for(int i=0; i<=n; i++){
            ArrayList<Integer> subList = new ArrayList<>();
            numbers = input.nextLine();

            if(numbers.equals("")){
                continue;
            }

            String[] arrOfStr = numbers.split(" ");

            for (String s : arrOfStr) {
                int num = Integer.parseInt(s);
                subList.add(num);
            }

            mainList.add(subList);

        }
         p = input.nextInt();

        for(int i=0; i<=p; i++){
            numbers = input.nextLine();

            if(numbers.equals("")) {
                continue;
            }
            
            String[] arrOfStr = numbers.split(" ");

            try {
                int x = Integer.parseInt(arrOfStr[0]);
                int y = Integer.parseInt(arrOfStr[1]);
                System.out.println(mainList.get(x-1).get(y));

            } catch(Exception e){
                System.out.println("ERROR!");
            }
        }
        input.close();
    }
}