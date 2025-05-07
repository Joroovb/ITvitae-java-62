public class Main {
    public static void main(String[] args) {
        int jaar = 2;
        int maand = 12;
        int week = 1;
        int dag = 1;
        int uur = 60;
        int minuten = 0;

        maand += jaar * 12;
        week += maand * 4;
        dag += week * 7;
        uur += dag * 24;
        minuten += uur * 60;

        System.out.println(uur * 60);

    }
}
