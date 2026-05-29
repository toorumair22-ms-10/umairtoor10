import java.util.Scanner;

class pacman {
    int x;
    int y;

    public pacman(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveup() {
        x = x - 1;
    }

    public void movedown() {
        x = x + 1;
    }

    public void moveleft() {
        y = y - 1;
    }

    public void moveright() {
        y = y + 1;
    }
}

class ghost {
    int x;
    int y;

    public ghost(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void chase(pacman p, gameboard gb) {
        int bestX = x;
        int bestY = y;

        double minDistance = Double.MAX_VALUE;


        if (x > 0) {
            double dist = Math.pow((x - 1 - p.x), 2) + Math.pow((y - p.y), 2);
            if (dist < minDistance) {
                minDistance = dist;
                bestX = x - 1;
                bestY = y;
            }
        }

        if (x < gb.rows - 1) {
            double dist = Math.pow((x + 1 - p.x), 2) + Math.pow((y - p.y), 2);
            if (dist < minDistance) {
                minDistance = dist;
                bestX = x + 1;
                bestY = y;
            }
        }

        if (y > 0) {
            double dist = Math.pow((x - p.x), 2) + Math.pow((y - 1 - p.y), 2);
            if (dist < minDistance) {
                minDistance = dist;
                bestX = x;
                bestY = y - 1;
            }
        }

        if (y < gb.col - 1) {
            double dist = Math.pow((x - p.x), 2) + Math.pow((y + 1 - p.y), 2);
            if (dist < minDistance) {
                minDistance = dist;
                bestX = x;
                bestY = y + 1;
            }
        }

        x = bestX;
        y = bestY;
    }
}

class food {
    int x;
    int y;

    public food(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class gameboard {
    int rows;
    int col;
    char[][] board;

    public gameboard(int rows, int col) {
        this.rows = rows;
        this.col = col;
        board = new char[rows][col];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void displaygameboard(pacman p, food f, ghost g) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (i == p.x && j == p.y) {
                    System.out.print("P ");
                } else if (i == g.x && j == g.y) {
                    System.out.print("G ");
                } else if (i == f.x && j == f.y) {
                    System.out.print("* ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

public class pacmangame {
    public static void main(String[] args) {
        int score = 0;

        food f = new food(0, 0);
        pacman p = new pacman(2, 2);
        gameboard gb = new gameboard(5, 5);
        ghost g = new ghost(0, 4);

        Scanner sc = new Scanner(System.in);

        while (true) {
            gb.displaygameboard(p, f, g);

            System.out.println("Enter move (w/s/a/d): ");
            char move = sc.next().charAt(0);

            if (move == 'w' && p.x > 0) {
                p.moveup();
            } else if (move == 's' && p.x < gb.rows - 1) {
                p.movedown();
            } else if (move == 'a' && p.y > 0) {
                p.moveleft();
            } else if (move == 'd' && p.y < gb.col - 1) {
                p.moveright();
            }

            g.chase(p, gb);

            if (p.x == f.x && p.y == f.y) {
                score++;
                System.out.println("Food eaten! Score = " + score);

                f = new food(
                        (int) (Math.random() * gb.rows),
                        (int) (Math.random() * gb.col)
                );
            }

            if (p.x == g.x && p.y == g.y) {
                System.out.println("Game Over!");
                break;
            }

            if (score == 5) {
                System.out.println("Congratulations! You won!");
                break;
            }

            System.out.println("Score = " + score);
            System.out.println();
        }

        sc.close();
    }
}