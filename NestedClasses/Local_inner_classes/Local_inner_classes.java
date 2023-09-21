package NestedClasses.Local_inner_classes;

public class Local_inner_classes {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult();
    }

}

class Math{
    public void getResult(){
        class Divide{
            private int delimoe;
            private int delitel;

            public int getDelimoe() {
                return delimoe;
            }

            public void setDelimoe(int delimoe) {
                this.delimoe = delimoe;
            }

            public int getDelitel() {
                return delitel;
            }

            public void setDelitel(int delitel) {
                this.delitel = delitel;
            }

            public int getChastnoe(){
                return delimoe/delitel;
            }

            public int getOstatok(){
                return delimoe%delitel;
            }
        }

        Divide divide = new Divide();
        divide.setDelimoe(21);
        divide.setDelitel(4);
        System.out.println("Delimoe = " + divide.getDelimoe());
        System.out.println("Delitel = " + divide.getDelitel());
        System.out.println("Chastnoe = " + divide.getChastnoe());
        System.out.println("Ostatok = " + divide.getOstatok());

    }
}
