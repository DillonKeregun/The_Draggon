import java.util.Scanner;
import javax.swing.*;

public class ForrestNew {

    public static void main(String[] args) {
        String error = "Пожалуйста, введите одну из возможных фраз.";
        System.out.println("Вы-храбрый и отважный рыцарь. Вы прогуливаетесь по лесу. Из-за кустов начал" +
                " исходить дивный голос, который называл вас по имени.");
        System.out.println("Ваши действия:    a) ..Идти на звук..     b) ..Пройти мимо.. ");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        if (str1.equals("a")) {
            System.out.println("Идя на звук вы наткнулись на сверкающий из-за камней меч. Подойдя " +
                    "ближе вы увидели на земле натянутую нить.");
            System.out.println("Ваши действия:   a) ..Переступить через нить..    b) ..Идти напролом..");

            String strA2 = sc.nextLine();
            if (strA2.equals("a")) {
                System.out.println("Подумав что это ловушка вы переступили нить и наконец взяли" +
                        " манящий ваш меч в руки. Он идеально вам подходил. Вы вернулись на главную" +
                        " дорогу");
                System.out.println("Вы шагали до тех пор, пока не наткнулись на стаю гоблинов, " +
                        "грабящих девушку посреди дороги.");
                System.out.println("Ваши действия:  a) ..Помочь Назару..  b) ..Пройти мимо..");

                String strA3 = sc.nextLine();
                if (strA3.equals("a")) {
                    System.out.println("Как же вам повезло найти меч, ранее сверкаюший в камнях." +
                            " Вооружившись, вы ринули в бой с погаными гоблинами и спасли Назара");

                } else if (strA3.equals("b")) {
                    System.out.println("Эх, а ведь я называл вас рыцарем. Похоже я ошибся, но " +
                            "выбор ваш. Вы просто прошли мимо и вышли из леса");
                    System.out.println("Вы оказались посреди поля. Вокруг было ни души. Всё что находилось" +
                            " на этом поле- это старая мельница на самом краю.");
                    System.out.println("Ваш выбор:   а) ..Пойти к мельнице..    b)..Попытаться ёё обойти..");

                } else {
                    System.out.println(error);
                }
                String strA4 = sc.nextLine();
                if (strA4.equals("a")) {
                    System.out.println("Вы решили подойти ближе к мельнице. Вы увидели, что прямо у входа" +
                            " сидел и плакал пожилой мужчина.");
                    System.out.println("Ваши действия:   a)..Подойти и спросить что случилось..    b) ..Не" +
                            " тревожить его своим присутствием..");
                    String strA5 = sc.nextLine();
                    if (strA5.equals("a") && strA3.equals("b")) {
                        System.out.println("Мужчина с надеждой в глазах посмотрел на вас, будто надеясь" +
                                " увидеть на вашем месте");
                        System.out.println("кого-то другого. Он рассказал вам, что его сын Назар не вернулся" +
                                " домой вовремя, и он подозревает что на него напали гоблины.");
                        System.out.println("Ваши действия:   a) ..Сказать что вы видели как его грабят и не" +
                                " помогли ему..    b) ..Соврать что вы не выключили утюг и вам нужно");
                        System.out.println(" срочно бежать домой..");
                    } else if (strA4.equals("b") && str1.equals("b")) {
                        System.out.println("Вау, я так вижу вам нравится избегать сюжета игры, да? Но не тут то было," +
                                " вы вдруг упали в глубокую яму, ");
                        System.out.println("ибо были слишком самоуверенны и не смотрели под ноги (ХААААААА)");
                        System.out.println(" В этой яме не было ничего. Это просто яма... в которую вы упали..." +
                                " яма для паданья.");
                        System.out.println("Ваши действия:   a) ..Звать на помощь..   b) ..Дальше игнорировать мой сюжет" +
                                " и сидеть в яме..");
                    } else {
                        System.out.println(error);
                    }

                    String strB2 = sc.nextLine();
                    if (strB2.equals("a")) {
                        System.out.println("У вас нету оружия, но вы как никак рыцарь. Вы отвлекли на себя" +
                                " внимание гоблинов и дали Назару шанс сбежать. ");
                        System.out.println("Теперь вам" +
                                " нужно разобраться с гоблинами.");
                        System.out.println("Ваши действия:   a) ..Начать убегать..   b) ..Драться на кулаках..");
                        String strB3 = sc.nextLine();
                        if (strB3.equals("a")) {
                            System.out.println("Я ещё не видел что бы кто-то бегал на столько быстро" +
                                    ", но от гоблинов вы оторвались когда выбежали из леса");
                        } else if (strB3.equals("b")) {
                            System.out.println("Вам набили морду. Да, прямым текстом, никакого хэппи энда.");

                        } else {
                            System.out.println(error);
                        }

                    } else if (strB2.equals("b")) {
                        System.out.println("Я конечно понимаю что нарываться на драку без" +
                                " оружия это дурость, но блин, вы за всю игру ничего не сделал.");
                        System.out.println(" Эх, лады, кароч вы прошли мимо и выбрались из леса.");

                    } else {
                        System.out.println(error);
                    }
                } else if (strA2.equals("b")) {
                    System.out.println("Нить полетела через кусты. Вы услышали грохот и " +
                            "поняли, что нить, которую вы задели, была подсоеденена к камням над вашей" +
                            " головой,");
                    System.out.println(" но, к счастью, ловушка оказалась нерабочей и вы просто" +
                            " забрали манящий вас меч. Сегодня ваш счастливый день.");
                    System.out.println("Вы вернулись на главную дорогу.");
                    System.out.println("Вы шагали до тех пор, пока не наткнулись на стаю гоблинов, " +
                            "грабящих Назара посреди дороги.");
                    System.out.println("Ваши действия:    a) ..Помочь Назару..    b) ..Пройти мимо..");

                    String strAb3 = sc.nextLine();
                    if (strAb3.equals("a")) {
                        System.out.println("Как же вам повезло найти меч, ранее сверкаюший в камнях." +
                                " Вооружившись, вы ринули в бой с погаными гоблинами и спасли Назара");

                    } else if (strAb3.equals("b")) {
                        System.out.println("Эх, а ведь я называл вас рыцарем. Похоже я ошибся, но " +
                                "выбор ваш. Вы просто прошли мимо и вышли из леса");

                    } else {
                        System.out.println(error);
                    }
                }

            } else if (str1.equals("b")) {


                System.out.println("Вы смело продолжили шагать вперёд. Возможно некоторые тайны лучше " +
                        "не разгадывать.  ");
                System.out.println("Вы шагали до тех пор, пока не наткнулись на стаю гоблинов, грабящих " +
                        "Назара посреди дороги.");
                System.out.println("Ваши действия:     a) ..Помочь Назару..    b) ..Пройти мимо..   ");

            } else {
                System.out.println(error);
            }
            String strB2 = sc.nextLine();
            if (strB2.equals("a")) {
                System.out.println("У вас нету оружия, но вы как никак рыцарь. Вы отвлекли на себя" +
                        " внимание гоблинов и дали Назару шанс сбежать. ");
                System.out.println("Теперь вам" +
                        " нужно разобраться с гоблинами.");
                System.out.println("Ваши действия:   a) ..Начать убегать..   b) ..Драться на кулаках..");
                String strB3 = sc.nextLine();
                if (strB3.equals("a")) {
                    System.out.println("Я ещё не видел что бы кто-то бегал на столько быстро" +
                            ", но от гоблинов вы оторвались когда выбежали из леса");
                } else if (strB3.equals("b")) {
                    System.out.println("Вам набили морду. Да, прямым текстом, никакого хэппи энда.");

                } else {
                    System.out.println(error);
                }

            } else if (strB2.equals("b")) {
                System.out.println("Я конечно понимаю что нарываться на драку без" +
                        " оружия это дурость, но блин, вы за всю игру ничего не сделал.");
                System.out.println(" Эх, лады, кароч вы прошли мимо и выбрались из леса.");
                System.out.println("Вы оказались посреди поля. Вокруг было ни души. Всё что находилось" +
                        " на этом поле- это старая мельница на самом краю.");
                System.out.println("Ваш выбор:   а) ..Пойти к мельнице..    b)..Попытаться ёё обойти..");

            } else {
                System.out.println(error);
            }
            String strA4 = sc.nextLine();
            if (strA4.equals("a")) {
                System.out.println("Вы решили подойти ближе к мельнице. Вы увидели, что прямо у входа" +
                        " сидел и плакал пожилой мужчина.");
                System.out.println("Ваши действия:   a)..Подойти и спросить что случилось..    b) ..Не" +
                        " тревожить его своим присутствием..");
            } else if (strA4.equals("b") && str1.equals("b")) {
                System.out.println("Вау, я так вижу вам нравится избегать сюжетa игры, да? Но не тут то было," +
                        " вы вдруг упали в глубокую яму, ");
                System.out.println("ибо были слишком самоуверенны и не смотрели под ноги (ХААААААА)");
                System.out.println(" В этой яме не было ничего. Это просто яма... в которую вы упали..." +
                        " яма для паданья.");
                System.out.println("Ваши действия:   a) ..Звать на помощь..   b) ..Дальше игнорировать мой сюжет" +
                        " и сидеть в яме..");
            } else {
                System.out.println(error);
            }

        }

    }
}

//        if (str.equals("a")) {
//            System.out.println("Идя на звук вы наткнулись на сверкающий из-за камней меч. Подойдя " +
//                    "ближе вы увидели на земле натянутую нить.");
//            System.out.println("Ваши действия:   a) ..Переступить через нить..    b) ..Идти напролом..");
//
//            String stor = sc.nextLine();
//            if (stor.equals("a")) {
//                System.out.println("Подумав что это ловушка вы переступили нить и наконец взяли" +
//                        " манящий ваш меч в руки. Он идеально вам подходил. Вы вернулись на главную" +
//                        " дорогу");
//                System.out.println("Вы шагали до тех пор, пока не наткнулись на стаю гоблинов, " +
//                        "грабящих девушку посреди дороги.");
//                System.out.println("Ваши действия:   a) ..Помочь девушке..   b) ..Пройти мимо..");
//
//                String stri = sc.nextLine();
//                if (stri.equals("a") && str.equals("a")) {
//                    System.out.println("Как же вам повезло найти меч, ранее сверкаюший в камнях." +
//                            " Вооружившись, вы ринули в бой с погаными гоблинами и спасли девушку");
//
//                        if (stri.equals("b") && str.equals("a")) {
//                            System.out.println("Эх, а ведь я называл вас рыцарем. Похоже я ошибся, но " +
//                                    "выбор ваш. Вы просто прошли мимо и вышли из леса");
//
//
//                        }} else {
//                        System.out.println(error);
//                        {
//                    }
//                }else if (stor.equals("b")) {
//                    System.out.println("Нить полетела через кусты. Вы услышали грохот и " +
//                            "поняли, что нить, которую вы задели, была подсоеденена к камням над вашей" +
//                            " головой,");
//                    System.out.println(" но, к счастью, ловушка оказалась нерабочей и вы просто" +
//                            " забрали манящий вас меч. Сегодня ваш счастливый день.");
//                    System.out.println("Вы вернулись на главную дорогу.");
//                    System.out.println("Вы шагали до тех пор, пока не наткнулись на стаю гоблинов, " +
//                            "грабящих девушку посреди дороги.");
//                    System.out.println("Ваши действия:   a) ..Помочь девушке..   b) ..Пройти мимо..");
//                } else {
//                    System.out.println(error);
//                }
//            }
//        }
//    }
//
//} else if(str.equals("b"))
//
//        {
//        System.out.println("Вы смело продолжили шагать вперёд. Возможно некоторые тайны лучше "+
//        "не разгадывать.  ");
//        System.out.println("Вы шагали до тех пор, пока не наткнулись на стаю гоблинов, грабящих "+
//        "девушку посреди дороги.");
//        System.out.println("Ваши действия:     a) ..Помочь девушке..    b) ..Пройти мимо..   ");
//
//
//        }else
//
//        {
//        System.out.println(error);
//        }
//
//
////    }
////        if(str.equals("Идти на звук"))
////
////    {
////        System.out.println("Вы шагали до тех пор, пока не наткнулись на стаю гоблинов, грбящих" +
////                " девушку посреди дороги.");
////        System.out.println("Ваши действия:   ..Помочь девушке..  ..Идти дальше..");
////    } else
////
////    {
////        System.out.println(error);
////    }
////
////
////        if(stri.equals("a")&&str.equals("b"))
////
////    {
////        System.out.println("У вас нету оружия, но вы как никак рыцарь. Вы отвлекли на себя" +
////                " внимание гоблинов и дали девушке шанс сбежать. ");
////        System.out.println("Теперь вам" +
////                " нужно разобраться с гоблинами.");
////
////        System.out.println("Ваши действия:   a) ..Начать убегать..   b) ..Драться на кулаках..");
////
////        String srt = sc.nextLine();
////        if (srt.equals("a")) {
////            System.out.println("Я ещё не видел что бы кто-то бегал на столько быстро" +
////                    ", но от гоблинов вы оторвались когда выбежали из леса");
////        } else if (srt.equals("b")) {
////            System.out.println("Вам набили морду. Да, прямым текстом, никакого хэппи энда.");
////        } else {
////            System.out.println(error);
////        }
////
////    }
////
////} if(stri.equals("b")&&str.equals("b"))
////
////        {
////        System.out.println("Я конечно понимаю что нарываться на драку без"+
////        " оружия это дурость, но блин, вы за всю игру ничего не сделал.");
////        System.out.println(" Эх, лады, кароч вы прошли мимо и выбрались из леса.");
////        }else
////
////        {
////        System.out.println(error);
////        }
////        }
////        }
////
////        }
////
//
//        }}
