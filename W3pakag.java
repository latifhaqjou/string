package w3pakage;

public class W3pakag {
    public static void main(String[] args) {
        String f="hellow world";
        System.out.println(f.toUpperCase());
        System.out.println(f.toLowerCase());
        System.out.println(f.indexOf("ld")+1);
        System.out.println("the lenght of f string is"+f.length());
        String name ="latif";
        String lastName="   haqjou";
        System.out.println(name.concat(lastName));
        System.out.println("I am the\r \nbest \"man\" but you\bu are \'not\' ");
        double res=4.6*783.2;
        System.out.println(res);
        double gr=Math.sqrt(16);
        double fr=Math.pow(2, 3);
        double dr=Math.random();
        int sr=(int)(Math.random()*101);
        
        System.out.println(gr);
        System.out.println(fr);
        System.out.println(dr);
        System.out.println(sr);

        int day=5;
        String res2;
        res2= (day>4)? "on timw" :"to late";
        System.out.println(res2);
        int fbi = (int) (Math.random()*11);
        System.out.println(fbi);
    }

}
