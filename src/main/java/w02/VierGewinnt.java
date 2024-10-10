package w02;

import java.util.Scanner;

public class VierGewinnt {

    public static void spielfeldprinten(int[][] wert, String name1, String name2, String farbes1, String farbes2) {

        String feldleer = "[ ]";
        String feldspieler1 = farbes1 + "[X]\u001b[0m";
        String feldspieler2 = farbes2 + "[O]\u001b[0m";

        System.out.println(farbes1 + name1 + "          " + farbes2 + name2 + "\u001b[0m");

        for (int i = 0; i < wert.length; i++) {
            for (int j = 0; j < wert[i].length; j++) {
                if (wert[i][j] == 0) {
                    System.out.print(feldleer);
                } else if (wert[i][j] == 1) {
                    System.out.print(farbes1 + feldspieler1);
                } else if (wert[i][j] == 2) {
                    System.out.print(farbes2 + feldspieler2);
                }
                if (j == 6) {
                    System.out.print("\n");
                }
            }
        }
        System.out.println(" 1  2  3  4  5  6  7 ");
    }

    public static int[] chipEinwerfen(int[][] wert, String name, int spieler, String farbe) {
        int reihe = 0;
        Scanner scanner = new Scanner(System.in);
        boolean checkreihevoll = true;
        int[] yx = new int[2];

        System.out.println("\n" + farbe + name + "\u001b[0m Wo möchtest du deinen Chip Platzieren? (1-7)");


        while (checkreihevoll) {
            reihe = scanner.nextInt();
            System.out.println("\n");
            reihe--;
            if (reihe <= 6 && reihe >= 0) {
                for (int i = 5; i >= 0; i--) {
                    if (wert[i][reihe] == 0) {
                        wert[i][reihe] = spieler;
                        checkreihevoll = false;
                        yx[0] = i;
                        yx[1] = reihe;
                        break;
                    }
                }
                if (checkreihevoll) {
                    System.out.println(name + " bitte wähle eine Reihe, die nicht voll ist");
                }
            } else {
                System.out.println(name + " wähle eine Reihe innerhalb des Spielfeldes");
            }
        }
        return yx;
    }

    public static boolean gewinnercheck(int[][] wert, int[] yx, int spieler, String name, String farbe) {
        int y = yx[0];
        int x = yx[1];
        int maxreihe = 0;

        for (int i = 0; i < 6; i++) {
            if (wert[i][x] == spieler) {
                maxreihe++;
            } else if (maxreihe < 4 && wert[i][x] != spieler) {
                maxreihe = 0;
            }
        }
        if (maxreihe >= 4) {
            System.out.println("\n" + farbe + name + "\u001b[0m hat das Spiel gewonnen");
            return true;
        }

        maxreihe = 0;

        for (int i = 0; i < 7; i++) {
            if (wert[y][i] == spieler) {
                maxreihe++;
            } else if (maxreihe < 4 && wert[y][i] != spieler) {
                maxreihe = 0;
            }
        }
        if (maxreihe >= 4) {
            System.out.println("\n" + farbe + name + "\u001b[0m hat das Spiel gewonnen");
            return true;
        }
        if (schraeggewinnenoben(wert, spieler, name, 0, 2, 0, 6, farbe)) {
            return true;
        } else if (schraeggewinnenoben(wert, spieler, name, 0, 1, 0, 6, farbe)) {
            return true;
        } else if (schraeggewinnenoben(wert, spieler, name, 0, 0, 0, 6, farbe)) {
            return true;
        } else if (schraeggewinnenoben(wert, spieler, name, 0, 0, 1, 6, farbe)) {
            return true;
        } else if (schraeggewinnenoben(wert, spieler, name, 0, 0, 2, 5, farbe)) {
            return true;
        } else if (schraeggewinnenoben(wert, spieler, name, 0, 0, 3, 4, farbe)) {
            return true;
        } else if (schraeggewinnenunten(wert, spieler, name, 0, 3, 0, farbe)) {
            return true;
        } else if (schraeggewinnenunten(wert, spieler, name, 0, 4, 0, farbe)) {
            return true;
        } else if (schraeggewinnenunten(wert, spieler, name, 0, 5, 0, farbe)) {
            return true;
        } else if (schraeggewinnenunten(wert, spieler, name, 0, 5, 1, farbe)) {
            return true;
        } else if (schraeggewinnenunten(wert, spieler, name, 0, 5, 2, farbe)) {
            return true;
        } else if (schraeggewinnenunten(wert, spieler, name, 0, 5, 3, farbe)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean schraeggewinnenoben(int[][] wert, int spieler, String name, int maxreihe, int i, int j, int max, String farbe) {

        for (i = i; i < max; i++) {
            if (wert[i][j] == spieler) {
                maxreihe++;
            } else if (maxreihe < 4 && wert[i][j] != spieler) {
                maxreihe = 0;
            }
            j++;
        }
        if (maxreihe >= 4) {
            System.out.println("\n" + farbe + name + "\u001b[0m hat das Spiel gewonnen");
            return true;
        } else {
            return false;
        }
    }

    public static boolean schraeggewinnenunten(int[][] wert, int spieler, String name, int maxreihe, int i, int j, String farbe) {

        for (i = i; i >= 0; i--) {
            if (j < 7) {
                if (wert[i][j] == spieler) {
                    maxreihe++;
                } else if (maxreihe < 4 && wert[i][j] != spieler) {
                    maxreihe = 0;
                }
                j++;
            }
        }
        if (maxreihe >= 4) {
            System.out.println("\n" + farbe + name + "\u001b[0m hat das Spiel gewonnen");
            return true;
        } else {
            return false;
        }
    }

    public static String farbauswahl(String name, String farbes1) {
        Scanner scanner = new Scanner(System.in);
        String farbe = "";
        boolean check = false;

        System.out.println("\n" + name + " welche Farbe sollen deine Chips haben?");
        System.out.println("\u001b[31;1m1. Rot");
        System.out.println("\u001b[32;1m2. Grün");
        System.out.println("\u001b[33;1m3. Gelb");
        System.out.println("\u001b[34;1m4. Blau");
        System.out.println("\u001b[35;1m5. Magenta\u001b[0m");

        while (!check) {
            int auswahl = scanner.nextInt();
            if (auswahl == 1) {
                farbe = "\u001b[31;1m";
                check = true;
            } else if (auswahl == 2) {
                farbe = "\u001b[32;1m";
                check = true;
            } else if (auswahl == 3) {
                farbe = "\u001b[33;1m";
                check = true;
            } else if (auswahl == 4) {
                farbe = "\u001b[34;1m";
                check = true;
            } else if (auswahl == 5) {
                farbe = "\u001b[35;1m";
                check = true;
            } else {
                System.out.println("Wähle eine Zahl zwischen 1 und 5");
            }
            if (farbe.equals(farbes1) && !farbes1.isEmpty()) {
                System.out.println("\nbitte wähle eine andere Farbe als dein Gegner");
                check = false;
            }
        }
        return farbe;
    }

    public static void main(String[] args) {
        int leer = 0;
        int spieler1 = 1;
        int spieler2 = 2;
        String names1 = "         ";
        String names2 = "         ";
        String farbes1 = "";
        String farbes2 = "";
        int spielzuege = 42;
        boolean checkwin = false;
        Scanner scan = new Scanner(System.in);
        int[][] spielfeld = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}};
        int[] yx = new int[2];

        System.out.println("Herzlich Willkommen bei 4 Gewinnt");
        System.out.println("Spieler1 wähle einen Namen (bitte maximal 8 Zeichen)");

        while (names1.length() >= 9) {
            names1 = scan.nextLine();
            if (names1.length() >= 9) {
                System.out.println("Bitte maximal 8 Zeichen");
            }
        }

        farbes1 = farbauswahl(names1, farbes2);

        System.out.println(names1 + " Du hast diesen Chip: " + farbes1 + "X\u001b[0m");
        System.out.println("Spieler2 wähle einen Namen");

        while (names2.length() >= 9) {
            names2 = scan.nextLine();
            if (names2.length() >= 9) {
                System.out.println("Bitte maximal 8 Zeichen");
            }
        }

        farbes2 = farbauswahl(names2, farbes1);

        System.out.println(names2 + " Du hast diesen Chip: " + farbes2 + "O\u001b[0m");

        spielfeldprinten(spielfeld, names1, names2, farbes1, farbes2);

        while (spielzuege != 0 && !checkwin) {

            if (spielzuege % 2 == 0) {
                yx = chipEinwerfen(spielfeld, names1, spieler1, farbes1);

                spielfeldprinten(spielfeld, names1, names2, farbes1, farbes2);

                checkwin = gewinnercheck(spielfeld, yx, spieler1, names1, farbes1);
            } else {
                yx = chipEinwerfen(spielfeld, names2, spieler2, farbes2);

                spielfeldprinten(spielfeld, names1, names2, farbes1, farbes2);

                checkwin = gewinnercheck(spielfeld, yx, spieler2, names2, farbes2);
            }

            spielzuege--;
        }
        if (spielzuege == 0) {
            System.out.println("das gibt ein Unentschieden");
        }


    }
}
