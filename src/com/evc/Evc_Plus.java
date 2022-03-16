package com.evc;

import java.util.Scanner;

public class Evc_Plus {
    public static void main(String[] args){
        Scanner Input = new Scanner(System.in);
        String Zipcode = "*770#";
        int Balance = 300;
        String Pin = "2233";
        System.out.println("EVC PLUS");
        String Empty = Input.next();



        if(Zipcode.equals(Empty) ){
            System.out.println("Fadln Gali Pinkaaga");
            String Code = Input.next();
            if(Pin.equals(Code)) {
                System.out.println("1.Itus Haraagaga.");
                System.out.println("2.Kaarka Ku Hadalka");
                System.out.println("3.Bixi biilka");
                System.out.println("4.Uwareeji Evc-Plus");
                System.out.println("5.Warbixin Kooban");
                System.out.println("6.Salaam Bank");
                System.out.println("7.Maareynta");
                System.out.println("8.Taaj");
                System.out.println("0.kabax");

                String One = Input.next();

                switch (One) {
                    case "1" -> System.out.println("Hraagagu Waa" + " " + Balance);
                    case "2" -> {
                        System.out.println("Kaark Ku hadalka");
                        System.out.println("  1.Kushubo Airtime");
                        System.out.println("  2.Ugushub airtime");
                        String one = Input.next();
                        if (one.equals("1")) {
                            System.out.println("Gali Lacagta ");
                            int Money = Input.nextInt();
                            if (Money < Balance) {
                                System.out.println("Mahubtaa Inaa $" + Money + "Ugu shubtid");
                                System.out.println("1.Haa");
                                System.out.println("2.Maya");
                                String Haa = Input.next();
                                if (Haa.equals("1")) {
                                    System.out.println("[EVC-PLUS] Waxaad Ku Shubatay" + " $" + Money);
                                    int sub = Balance - Money;
                                    System.out.println("Haraagagu Xisaabtadu Waa" + "$ " + sub);

                                }
                            }
                        } else {
                            System.out.println("Please Lacag Ku Shubo Lacagtan Kuguma Filna");
                        }
                    }
//


                    case "3" -> {
                        System.out.println("1.Post Paid");
                        System.out.println("2.Bixi Biilk");
                        String Check = Input.next();
                        if (Check.equals("1")) {
                            System.out.println("This Current not Working :(");

                        } else if (Check.equals("2")) {
                            System.out.println("This Current not Working :(");

                        } else {
                            System.out.println("Fadla Dooro Numberk Saxda Ah");

                        }
                    }
                    case "4" -> {
                        System.out.println("Uwareeji EVC-PLUS");
                        System.out.println("Fadlan gali Mobile-Ka");
                        int Mobile = Input.nextInt();
                        int num = 610000000;
                        int Num = 619999999;
                        if (Mobile > num && Mobile < Num) {
                            System.out.println("Fadlan Gali Lacagta");
                            int Lacag = Input.nextInt();
                            if (Lacag <= Balance) {
                                System.out.println("[EVC-PLUS");
                                System.out.println("Ma Hubtaa Inaad " + Lacag + " " + "Uwareejisid " + Mobile + "?");
                                System.out.println("1.Haa");
                                System.out.println("2.Maya");

                                String Haa = Input.next();
                                int decrase = Balance - Lacag;
                                if (Haa.equals("1")) {
                                    System.out.println("[EVC-PLUS]");
                                    System.out.println("Waxaad $" + Lacag + " Uwareejisay " + Mobile);
                                    System.out.println("Haraagagu waa " + decrase);
                                }
//                            else{
//
//                            }
                                else {
                                    System.out.println("Mahadsanid Macsalaama");
                                }
                            }


                        } else {
                            System.out.println("Numberkaan Wuu xadidan Yahay");
                        }
                    }
                    case "5" -> {
                        System.out.println("Warbixin Kooban");
                        System.out.println("                ");
                        System.out.println("1.Last action");
                        System.out.println("2.Wareejinti Udanbeysay");
                        System.out.println("3.Iibsashadii Udanbeysay");
                        System.out.println("4.Last 3 Actions");
                        System.out.println("5.Email Me My Activity");
                        String WarbixinKooban = Input.next();
                        if (WarbixinKooban.equals("1")) {
                            System.out.println("This Is Not Current Working");
                        } else if (WarbixinKooban.equals("2")) {
                            System.out.println("This Is Not Current Working");
                        } else if (WarbixinKooban.equals("3")) {
                            System.out.println("This Is Not Current Working");

                        } else if (WarbixinKooban.equals("4")) {
                            System.out.println("This Is Not Current Working");

                        } else if (WarbixinKooban.equals("5")) {
                            System.out.println("This Is Not Current Working");
                        } else {
                            System.out.println("Fadla Dooro Numberk Saxda Ah");
                        }
                    }
                    case "6" -> {
                        System.out.println("Salaam Bank");
                        System.out.println("1.Ka Wareeji Evc-Plus");
                        String SalaamBank = Input.next();
                        if (SalaamBank.equals("1")) {
                            System.out.println("Fadlan Dooro Xisaabtada Bankiga");
                            System.out.println("1.Salaam SOMALI-BANK");
                            System.out.println("2.Salaam Sch");
                            String Cheking = Input.next();
                            if (Cheking.equals("1")) {
                                System.out.println("Fadlan Gali Account-ga");
                                String accountiga = Input.next();
                                System.out.println("Gali Faafahin");
                                String Fafahin = Input.next();
                                System.out.println("Fadlan Gai lacagta");
                                int Lacag = Input.nextInt();

                                if (Lacag <= Balance) {
                                    System.out.println("[SALAAM BANK]");
                                    System.out.println("Mahubtaa Inaad $" + Lacag + " " + (accountiga));
                                    System.out.println(Fafahin);
                                    System.out.println("1.Haa");
                                    System.out.println("2.Maya");
                                    String input = Input.next();
                                    if (input.equals("1")) {
                                        System.out.println("[SALAAM BANK]");
                                        System.out.println("Waxaad  $" + Lacag + " Ku-dirtay" + "  Accountiga  " + accountiga);
                                        int Sub_Money = Balance - Lacag;
                                        System.out.println("Haragagu Waa $" + Sub_Money);

                                    }
                                }

                            }
                        }
                    }
                    case "7" -> {
                        System.out.println("Maareynata");
                        System.out.println("1.Badal lambarka Sirta ah");
                        System.out.println("2.Badal Luqada");
                        System.out.println("3.Wargelin Mobile Lumay");
                        String maareynta = Input.next();
                        if (maareynta.equals("1")) {
                            System.out.println("Fadlan Gali Pinkaaga Cusub");
                            String PinkagaCusub = Input.next();
                            System.out.println("Fadlan Ku celi Pin-ka Cusub");
                            String PinkaCusubKuCeli = Input.next();
                            System.out.println("Gali Numberkaga Sirta ");
                            String PinkagaHore = Input.next();
                            if (PinkagaCusub.equals(PinkaCusubKuCeli) && PinkagaHore.equals(Pin)) {
                                System.out.println("Waad Ku guuleysatay Inaad badasho Numberka Sirta ah");
                            } else {
                                System.out.println("INPUT MISMATCH");
                            }

                        } else if (maareynta.equals("2")) {
                            System.out.println("1.English");
                            System.out.println("2.Arabic");
                            String Luqad = Input.next();
                            if (Luqad.equals("1")) {
                                System.out.println("Waxad Ku Guuleysatay Inad Bdasho Luqada.");
                            } else if (Luqad.equals("2")) {
                                System.out.println("Waxad Ku Guuleysatay Inad Bdasho Luqada.");

                            } else {
                                System.out.println("Fadla Dooro Numberk Saxda Ah");
                            }
                        } else if (maareynta.equals("3")) {
                            System.out.println("Fadlan Gali Mobile-ka Lumay");
                            String MobileLumay = Input.next();
                            System.out.println("Fadlan Gali Number-kiisa Sirta ah");
                            String NumberSirta = Input.next();
                            System.out.println("Mahubtaa Inaad U diwaan Galiso Lumid Number-kaan " + MobileLumay);
                            System.out.println("1.Haa");
                            System.out.println("2.Maya");
                            String Choose = Input.next();
                            if (Choose.equals("1")) {
                                System.out.println("Waxaad Ku Guuleysatay Inaad U Diwaan Galiso Number-kaan");
                                System.out.println(MobileLumay + " Inuu Lumay.");
                            } else {
                                System.out.println("Mahadsanid Macsalamo");
                            }
                        }
                    }
                    case "8" -> {
                        System.out.println("TAAJ");
                        System.out.println("1.Dibada");
                        System.out.println("2.Ogow Khidmada");
                        System.out.println("3.Maclumadka xawaalada");
                        String Taaj = Input.next();
                        if (Taaj.equals("1")) {
                            System.out.println("Fadlan Gali Telefanka Qaataha");
                            int Telefan = Input.nextInt();
                            if (Telefan > 610000000 && Telefan < 619999999) {
                                System.out.println("Fadlan Gali Magca Qaataha");
                                String Magaca = Input.next();
                                System.out.println("Fadlan Gali Magaalada Qaataha");
                                String Magaalo = Input.next();
                                System.out.println("Fadlan Gali Lacagta");
                                int Lacag = Input.nextInt();
                                System.out.println("Fadlan gali maclumaad");
                                String Macluumad = Input.next();
                                System.out.println("Khidmada Ma Xisaabtada ayaa Laga Jarayaa");
                                System.out.println("1.Haa");
                                System.out.println("2.maya");
                                String Option = Input.next();


                                if (Option.equals("1")) {
                                    System.out.println("Ma Hubtaa Inaad $" + Lacag + " Udirtid  " + Magaca + " Telephanka " + Telefan + "?");
                                    System.out.println("1.Haa");
                                    System.out.println("2.maya");
                                    String Idea = Input.next();


                                    if (Idea.equals("1") && Lacag < Balance) {
                                        System.out.println("[TAAJ]");
                                        System.out.println("Waxaad $" + Lacag + " Udirtay " + Magaca + " Oo Wata " + Telefan);
                                        int Money = Balance - Lacag;

                                        System.out.println("Haraggu Waa $" + Money);


                                    } else {
                                        System.out.println("Lacagtada Kuguma Filna");
                                    }

                                }


                            }

                        } else if (Taaj.equals("2")) {
                            System.out.println("This Is Not Cuurrently Working");
                        } else if (Taaj.equals("3")) {
                            System.out.println("This Is Not Cuurrently Working");

                        }
                    }
                    case "0" -> System.out.println("macsalama");
                }






            }//Pinkaaga
            else{
                System.out.println("Numberka Sirta Ah Waa Khalad");
            }
            }//Zipcode kaaga


        }




    }



