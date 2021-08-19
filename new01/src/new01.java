import java.util.Random;

public class new01 {

    public static void main(String[] args){

        Random ran = new Random(241241351);
        // 创建对象并设定seed
        // 默认是当前时间戳

        int rint1 = ran.nextInt(5);
        System.out.println(rint1);
        //[0,5)

        int rint2 = ran.nextInt(5)+10;
        System.out.println(rint2);
        //[10,15)

        double rdou1 = ran.nextDouble();
        System.out.println(rdou1);
        //[0,1)

        double rdou2 = ran.nextDouble()*2+3;
        System.out.println(rdou2);
        //[3,5)

    }

}
