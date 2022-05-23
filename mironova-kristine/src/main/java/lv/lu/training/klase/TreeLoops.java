package lv.lu.training.klase;

public class TreeLoops {
    public static void main(String[] args) {
int skaitlis = 5;
for (int i = 0; i<skaitlis+1; i++) {
        System.out.println("#".repeat(i));

}

int i=1;
while (0>i){
    System.out.println("#".repeat(i+1));
    i++;
}
}

}
