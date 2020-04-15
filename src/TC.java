import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TC {
    public static void main(String[] args){
        SimpleDateFormat dfndt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Scanner sc = new Scanner(System.in);
        String num = "";
        String now = "";
        String nowAfter = "";
        String lt = "";
        int ltInt = 0;

        while(true){
            System.out.println("当前平原：白天扣 1，黑夜扣 2：");
            num = sc.next();
            if(num.equals("1")){
                now = "白天";
                nowAfter = "黑夜";
                break;
            }else if(num.equals("2")){
                now = "黑夜";
                nowAfter = "白天";
                break;
            }else{
                System.out.println("嘀嘀波叽 嘀嘀波波耶");
                System.out.println("");
                continue;
            }
        }

        while(true){
            System.out.println("距离"+nowAfter+"还有几分钟：");
            lt = sc.next();

            for (int i = lt.length();--i>=0;){
                if (!Character.isDigit(lt.charAt(i))){
                    System.out.println("嘀嘀波叽 嘀嘀波波耶");
                    System.out.println("");
                    continue;
                }
            }
            ltInt = Integer.parseInt(lt);
            break;
        }

        if(now.equals("白天")){
            toNight(ltInt,dfndt);
        }else{
            toDay(ltInt,dfndt);
        }

    }

    private static void toDay(int ltInt,SimpleDateFormat dfndt){
        Date afterDate = null;
        String nowDatetimeString = "";
        String nowDatetimeString2 = "";
        Date nowDatetime = new Date();

        afterDate = new Date(nowDatetime.getTime() + ltInt *60*1000);
        nowDatetimeString = dfndt.format(afterDate);
        afterDate = new Date(nowDatetime.getTime() + (ltInt+100) *60*1000);
        nowDatetimeString2 = dfndt.format(afterDate);
        System.out.println();
        System.out.println("白天："+nowDatetimeString+" ~ "+nowDatetimeString2);
        nowDatetimeString = nowDatetimeString2;

        afterDate = new Date(afterDate.getTime() + 50 *60*1000);
        nowDatetimeString2 = dfndt.format(afterDate);
        System.out.println("黑夜："+nowDatetimeString+" ~ "+nowDatetimeString2);
        nowDatetimeString = nowDatetimeString2;

        for(int i=0;i<6;i++){
            afterDate = new Date(afterDate.getTime() + 100 *60*1000);
            nowDatetimeString2 = dfndt.format(afterDate);
            System.out.println();
            System.out.println("白天："+nowDatetimeString+" ~ "+nowDatetimeString2);
            nowDatetimeString = nowDatetimeString2;

            afterDate = new Date(afterDate.getTime() + 50 *60*1000);
            nowDatetimeString2 = dfndt.format(afterDate);
            System.out.println("黑夜："+nowDatetimeString+" ~ "+nowDatetimeString2);
            nowDatetimeString = nowDatetimeString2;
        }
    }

    private static void toNight(int ltInt,SimpleDateFormat dfndt){
        Date afterDate = null;
        String nowDatetimeString = "";
        String nowDatetimeString2 = "";
        Date nowDatetime = new Date();

        afterDate = new Date(nowDatetime.getTime() + ltInt *60*1000);
        nowDatetimeString = dfndt.format(afterDate);
        afterDate = new Date(nowDatetime.getTime() + (ltInt+50) *60*1000);
        nowDatetimeString2 = dfndt.format(afterDate);
        System.out.println();
        System.out.println("黑夜："+nowDatetimeString+" ~ "+nowDatetimeString2);
        nowDatetimeString = nowDatetimeString2;

        afterDate = new Date(afterDate.getTime() + 100 *60*1000);
        nowDatetimeString2 = dfndt.format(afterDate);
        System.out.println("白天："+nowDatetimeString+" ~ "+nowDatetimeString2);
        nowDatetimeString = nowDatetimeString2;

        for(int i=0;i<6;i++){
            afterDate = new Date(afterDate.getTime() + 50 *60*1000);
            nowDatetimeString2 = dfndt.format(afterDate);
            System.out.println();
            System.out.println("黑夜："+nowDatetimeString+" ~ "+nowDatetimeString2);
            nowDatetimeString = nowDatetimeString2;

            afterDate = new Date(afterDate.getTime() + 100 *60*1000);
            nowDatetimeString2 = dfndt.format(afterDate);
            System.out.println("白天："+nowDatetimeString+" ~ "+nowDatetimeString2);
            nowDatetimeString = nowDatetimeString2;
        }
    }
}
