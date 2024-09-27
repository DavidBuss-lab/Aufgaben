package w02;

import java.util.Scanner;

public class Türmestapeln {

    public static void Standardspielfeld(int[][] spielfeldvalue) {
        int valuespiel = 0;
        int valueplate1 = 1;
        int valueplate2 = 2;
        int valueplate3 = 3;
        int valueplate4 = 4;

        spielfeldvalue[0][0] = valueplate1;
        spielfeldvalue[1][0] = valueplate2;
        spielfeldvalue[2][0] = valueplate3;
        spielfeldvalue[3][0] = valueplate4;
        spielfeldvalue[0][1] = valuespiel;
        spielfeldvalue[1][1] = valuespiel;
        spielfeldvalue[2][1] = valuespiel;
        spielfeldvalue[3][1] = valuespiel;
        spielfeldvalue[0][2] = valuespiel;
        spielfeldvalue[1][2] = valuespiel;
        spielfeldvalue[2][2] = valuespiel;
        spielfeldvalue[3][2] = valuespiel;
    }

    public static void Spielfeldprinten(int[][] spielfeldvalue) {

        String plate1 = "        -||-         ";
        String plate2 = "      ---||---       ";
        String plate3 = "    -----||-----     ";
        String plate4 = "  -------||--------  ";
        String spiel = "         ||          ";

        for (int i = 0; i < spielfeldvalue.length; i++) {
            for (int j = 0; j < spielfeldvalue[i].length; j++) {
                if (spielfeldvalue[i][j] == 0) {
                    System.out.print(spiel);
                } else if (spielfeldvalue[i][j] == 1) {
                    System.out.print(plate1);
                } else if (spielfeldvalue[i][j] == 2) {
                    System.out.print(plate2);
                } else if (spielfeldvalue[i][j] == 3) {
                    System.out.print(plate3);
                } else if (spielfeldvalue[i][j] == 4) {
                    System.out.print(plate4);
                }
                if (j == 2) {
                    System.out.print("\n");
                }
            }
        }
    }

    public static void bewegungstapel1(int[][] spielfeldvalue, int verschiebung) {

        int n = 0;
        int k = 3;
        boolean bool = false;

        if (verschiebung == 1) {
            while (n <= 3 && !bool) {
                if (spielfeldvalue[n][0] == 0) {
                    n++;
                } else {
                    while (k >= 0 && !bool) {
                        if (spielfeldvalue[k][1] == 0) {
                            spielfeldvalue[k][1] = spielfeldvalue[n][0];
                            spielfeldvalue[n][0] = 0;
                            bool = true;
                        } else {
                            k--;
                        }
                    }
                }
            }
        } else if (verschiebung == 2) {
            while (n <= 3 && !bool) {
                if (spielfeldvalue[n][0] == 0) {
                    n++;
                } else {
                    while (k >= 0 && !bool) {
                        if (spielfeldvalue[k][2] == 0) {
                            spielfeldvalue[k][2] = spielfeldvalue[n][0];
                            spielfeldvalue[n][0] = 0;
                            bool = true;
                        } else {
                            k--;
                        }
                    }
                }
            }
        }
    }

    public static void bewegungstapel2(int[][] spielfeldvalue, int verschiebung) {

        int n = 0;
        int k = 3;
        boolean bool = false;

        if (verschiebung == -1) {
            while (n <= 3 && !bool) {
                if (spielfeldvalue[n][1] == 0) {
                    n++;
                } else {
                    while (k >= 0 && !bool) {
                        if (spielfeldvalue[k][0] == 0) {
                            spielfeldvalue[k][0] = spielfeldvalue[n][1];
                            spielfeldvalue[n][1] = 0;
                            bool = true;
                        } else {
                            k--;
                        }
                    }
                }
            }
        } else if (verschiebung == 1) {
            while (n <= 3 && !bool) {
                if (spielfeldvalue[n][1] == 0) {
                    n++;
                } else {
                    while (k >= 0 && !bool) {
                        if (spielfeldvalue[k][2] == 0) {
                            spielfeldvalue[k][2] = spielfeldvalue[n][1];
                            spielfeldvalue[n][1] = 0;
                            bool = true;
                        } else {
                            k--;
                        }
                    }
                }
            }
        }
    }

    public static void bewegungstapel3(int[][] spielfeldvalue, int verschiebung) {

        int n = 0;
        int k = 3;
        boolean bool = false;

        if (verschiebung == -1) {
            while (n <= 3 && !bool) {
                if (spielfeldvalue[n][2] == 0) {
                    n++;
                } else {
                    while (k >= 0 && !bool) {
                        if (spielfeldvalue[k][1] == 0) {
                            spielfeldvalue[k][1] = spielfeldvalue[n][2];
                            spielfeldvalue[n][2] = 0;
                            bool = true;
                        } else {
                            k--;
                        }
                    }
                }
            }
        } else if (verschiebung == -2) {
            while (n <= 3 && !bool) {
                if (spielfeldvalue[n][2] == 0) {
                    n++;
                } else {
                    while (k >= 0 && !bool) {
                        if (spielfeldvalue[k][0] == 0) {
                            spielfeldvalue[k][0] = spielfeldvalue[n][2];
                            spielfeldvalue[n][2] = 0;
                            bool = true;
                        } else {
                            k--;
                        }
                    }
                }
            }
        }
    }

    public static boolean Ueberpruefung(int[][] spielfeldvalue, int turmursprung, int turmziel, boolean ergebnisneu) {
        boolean bool = true;
        int n = 0;
        int k = 2;
        ergebnisneu = true;

        for (int i = 0; i < spielfeldvalue.length; i++) {
            if (spielfeldvalue[i][turmziel] != 0) {
                bool = false;
                break;
            }
        }

        while (n <= 3 && !bool) {
            if (spielfeldvalue[n][turmursprung] == 0) {
                n++;
            } else {
                while (k >= 0 && !bool) {
                    if (spielfeldvalue[k][turmziel] == 0) {
                        if (spielfeldvalue[n][turmursprung] > spielfeldvalue[k + 1][turmziel] && spielfeldvalue[k + 1][turmziel] != 0) {
                            ergebnisneu = false;
                            bool = true;
                        }

                    }
                    k--;
                    if (k < 0) {
                        bool = true;
                    }
                }
            }
        }
        return ergebnisneu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] spielfeldvalue = new int[4][3];
        boolean ziel = false;
        int zuegecounter = 0;

        Standardspielfeld(spielfeldvalue);

        Spielfeldprinten(spielfeldvalue);

        while (!ziel) {

            System.out.println("Wähle einen Turm aus, aus dem du bewegen möchtest");
            int turm = sc.nextInt();
            int verschiebung = 0;
            boolean ergebnis = false;
            boolean gueltigkeit = true;

            switch (turm) {
                case 1:
                    System.out.println("Wo möchtest du die Platte hinbewegen? (Gebe die Turmnummer ein)");
                    switch (sc.nextInt()) {
                        case 2:
                            ;
                            if (Ueberpruefung(spielfeldvalue, 0, 1, ergebnis)) {
                                verschiebung++;
                            } else {
                                gueltigkeit = false;
                            }
                            break;
                        case 3:
                            if (Ueberpruefung(spielfeldvalue, 0, 2, ergebnis)) {
                                verschiebung = verschiebung + 2;
                            } else {
                                gueltigkeit = false;
                            }
                            break;
                    }
                    bewegungstapel1(spielfeldvalue, verschiebung);
                    break;
                case 2:
                    System.out.println("Wo möchtest du die Platte hinbewegen? (Gebe die Turmnummer ein)");
                    switch (sc.nextInt()) {
                        case 1:
                            if (Ueberpruefung(spielfeldvalue, 1, 0, ergebnis)) {
                                verschiebung--;
                            } else {
                                gueltigkeit = false;
                            }
                            break;
                        case 3:
                            if (Ueberpruefung(spielfeldvalue, 1, 2, ergebnis)) {
                                verschiebung++;
                            } else {
                                gueltigkeit = false;
                            }
                            break;
                    }
                    bewegungstapel2(spielfeldvalue, verschiebung);
                    break;
                case 3:
                    System.out.println("Wo möchtest du die Platte hinbewegen? (Gebe die Turmnummer ein)");
                    switch (sc.nextInt()) {
                        case 2:
                            if (Ueberpruefung(spielfeldvalue, 2, 1, ergebnis)) {
                                verschiebung--;
                            } else {
                                gueltigkeit = false;
                            }
                            break;
                        case 1:
                            if (Ueberpruefung(spielfeldvalue, 2, 0, ergebnis)) {
                                verschiebung = verschiebung - 2;
                            } else {
                                gueltigkeit = false;
                            }
                            break;
                    }
                    bewegungstapel3(spielfeldvalue, verschiebung);
            }

            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            Spielfeldprinten(spielfeldvalue);
            System.out.println("\n\n");

            zuegecounter++;

            if (!gueltigkeit) {
                System.out.println("Das ist kein Gültiger Zug, versuche es erneut");
            }
            if (spielfeldvalue[0][2] == 1 &&
                    spielfeldvalue[1][2] == 2 &&
                    spielfeldvalue[2][2] == 3 &&
                    spielfeldvalue[3][2] == 4) {
                ziel = true;
                System.out.println("Herzlichen Glückwunsch, du hast es geschafft");
                System.out.println("Du hast " + zuegecounter + " Züge zum lösen gebraucht");
            }
        }
    }
}