import javax.swing.*;
import java.util.Scanner;

public class TheForest {
    public static void main(String[] args) {
        System.out.println("Вы-храбрый и отважный рыцарь. Вы прогуливаетесь по лесу. Из-за кустов начал" +
                " исходить дивный голос, который называл вас по имени.");
        System.out.println("Ваши действия:    ..Идти на звук..     ..Пройти мимо.. ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();{
            if (str.equals("Идти на звук")){
                System.out.println("Идя на звук вы наткнулись на сверкающий из-за камней меч. Подойдя " +
                        "ближе вы увидели на земле натянутую нить.");
                System.out.println("Ваши действия:   ..Переступить через нить..    ..Идти напролом..");
                Scanner scan = new Scanner(System.in);
                String stor = scan.nextLine();
                if (stor.equals("Переступить через нить")){
                    System.out.println("Подумав что это ловушка вы переступили нить и наконец взяли" +
                            " манящий ваш меч в руки. Он идеально вам подходил. Вы вернулись на главную" +
                            " дорогу");
                    System.out.println("Вы шагали до тех пор, пока не наткнулись на стаю гоблинов, " +
                            "грабящих девушку посреди дороги.");
                    System.out.println("Ваши действия:   ..Помочь девушке..   ..Пройти мимо..");
                }else if (stor.equals("Идти напролом")){
                    System.out.println("Нить полетела через кусты. Вы услышали грохот и " +
                            "поняли, что нить, которую вы задели, была подсоеденена к камням над вашей" +
                            " головой,");
                    System.out.println(" но, к счастью, ловушка оказалась нерабочей и вы просто" +
                            " забрали манящий вас меч. Сегодня ваш счастливый день.");
                    System.out.println("Вы вернулись на главную дорогу.");
                    System.out.println("Вы шагали до тех пор, пока не наткнулись на стаю гоблинов, " +
                            "грабящих девушку посреди дороги.");
                    System.out.println("Ваши действия:   ..Помочь девушке..   ..Пройти мимо..");}




            }else if (str.equals("Пройти мимо")){
                System.out.println("Вы смело продолжили шагать вперёд. Возможно некоторые тайны лучше " +
                "не разгадывать.  ");
                System.out.println("Вы шагали до тех пор, пока не наткнулись на стаю гоблинов, грабящих " +
                        "девушку посреди дороги.");
                System.out.println("Ваши действия:     ..Помочь девушке..    ..Пройти мимо..   ");
            } else if (str.equals("Идти на звук")) {
                    System.out.println("Вы шагали до тех пор, пока не наткнулись на стаю гоблинов, грбящих" +
                            " девушку посреди дороги.");
                    System.out.println("Ваши действия:   ..Помочь девушке..  ..Идти дальше..");
                }else{
                System.out.println("Пожалуйста, введите одну из возможных фраз.");
            } Scanner scc=new Scanner(System.in);
            String stri = scc.nextLine();
            if (stri.equals("Помочь девушке")&&str.equals("Пройти мимо")){
                System.out.println("У вас нету оружия, но вы как никак рыцарь. Вы отвлекли на себя" +
                        " внимание гоблинов и дали девушке шанс сбежать. ");
                System.out.println("Теперь вам" +
                        " нужно разобраться с гоблинами.");

                System.out.println("Ваши действия:   ..Начать убегать..   ..Драться на кулаках..");
                Scanner sk = new Scanner(System.in);
                String srt = sk.nextLine();
                if (srt.equals("Начать убегать")){
                    System.out.println("Я ещё не видел что бы кто-то бегал на столько быстро"+
                    ", но от гоблинов вы оторвались когда выбежали из леса");
                }else if (srt.equals("Драться на кулаках")){
                    System.out.println("Вам набили морду. Да, прямым текстом, никакого хэппи энда.");
                }

            }else if (stri.equals("Помочь девушке")&&str.equals("Идти на звук")){
                System.out.println("Как же вам повезло найти меч, ранее сверкаюший в камнях." +
                        " Вооружившись, вы ринули в бой с погаными гоблинами и спасли девушку");}
            else {
                System.out.println("Пожалуйста, введите одну из возможных фраз.");{
                    if (stri.equals("Пройти мимо")&&str.equals("Идти на звук")){
                        System.out.println("Эх, а ведь я называл вас рыцарем. Похоже я ошибся, но " +
                                "выбор ваш. Вы просто прошли мимо и вышли из леса");


                    }else if (stri.equals("Пройти мимо")&&str.equals("Пройти мимо")){
                        System.out.println("Я конечно понимаю что нарываться на драку без" +
                                " оружия это дурость, но блин, вы за всю игру ничего не сделал.");
                        System.out.println(" Эх, лады, кароч вы прошли мимо и выбрались из леса.");
                    }
                }
            }
}}
    }

