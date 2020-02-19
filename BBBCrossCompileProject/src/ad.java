    

    import java.util.*;
    import javax.realtime.*;
     
    public class ad{
     
        public static void main (String []arg){
            System.out.println("Hello I'm JARVIS! and you are?");
            Scanner in = new Scanner(System.in);
            String namer = in.nextLine();
            namer.trim();
            if (namer.length()>7){ System.out.println("Your name is kinda long isn't it!"); }
            System.out.println("and your last name is?");
            Scanner in2 = new Scanner(System.in);
            String namer2 = in2.nextLine();
            char name = 'b';
            if (namer2.equalsIgnoreCase("any sirname") || namer2.equalsIgnoreCase("any sirname") || namer2.equalsIgnoreCase("any sirname") ){
                name = 'a';
                System.out.println("Sucker..");
                System.out.println("HI");
                System.out.println("lol!! ITs FUNNY HOW DUM YOUR ARE ");
            }else if (namer2.equalsIgnoreCase("any sirname") || namer2.equalsIgnoreCase("any sirname") || namer2.equalsIgnoreCase("any sirname") || namer2.equalsIgnoreCase("any sirname")){
                name = 'b';
                System.out.println("GOOD MORNING.....");
                System.out.println("GREETINGS Sir ");
            }else {
                System.out.println("HEY ... ");
                System.out.println("GOOD MORNING DEAR GUEST ");
                System.out.println("IM JARVIS CREATED BY Luis in AICAS ");
                namer2.trim();
                System.out.println("are you a Man or a Woman?");
                Scanner in3 = new Scanner(System.in);
                String gender = in3.nextLine();
                char gen = 'f';
                if (gender.equalsIgnoreCase("boy") || gender.equalsIgnoreCase("man") || gender.equalsIgnoreCase("guy") || gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("male") ){
                    gen = 'm';
                    System.out.println("oooo...Macho Macho!, Look at you!");
                    System.out.println("JARVIS BLOWS YOU ");
                    System.out.println("lol!! I'm a BOT.... I guess you can tell.");
                }else if (gender.equalsIgnoreCase("girl") || gender.equalsIgnoreCase("woman") || gender.equalsIgnoreCase("lady") || gender.equalsIgnoreCase("f") || gender.equalsIgnoreCase("female") ){
                    gen = 'f';
                    System.out.println("OH YEAH!!! GIRL POWER!!!");
                }else {
                    System.out.println("Your answer is not quite clear...");
                    System.out.println("I'll decide what you are");
                    System.out.println("You are a Human ! ha ha ha ha!");
                }
            }
        }
    }