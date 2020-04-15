import java.util.ArrayList;
import java.util.Random;

public class InsertSort {
    public static void main(String[] args) {
        InsertSort is = new InsertSort();
        ArrayList al = is.getArray(10,100);
        System.out.println();System.out.println();
        is.sort(al);

    }

    public void sort(ArrayList al) {

        int maxSize = 1;
        for (int i=1; i<al.size(); i++) {

            if((int)(al.get(i))<(int)(al.get(i-1))){

                int tempInt = (int)al.get(i);
                int j = i-1;
                while(j>=0 && tempInt<(int)al.get(j)){
                    al.set(j+1,(int)al.get(j));
                    j--;
                }
                al.set(j+1,tempInt);
            } else {
                continue;
            }

            for (int k=0; k<al.size(); k++){
                System.out.print(al.get(k)+" ");
            }
            System.out.println();
        }

    }

    public ArrayList getArray(int num,int mod) {
        ArrayList al = new ArrayList();
        Random random = new Random();
        for(int i=0; i<num; i++){
            int tempInt = (int) (Math.random() * mod);
            al.add(tempInt);
            System.out.print(tempInt+" ");
        }
        return al;
    }
}


