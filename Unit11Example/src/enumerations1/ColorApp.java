package enumerations1;


import static enumerations1.Color.BLUE;

public class ColorApp {


    public static void main(String[] args) {

        Color color1=Color.RED;
        Color color2= Color.GREEN;

        printColor(color1);//RED 2 Red
        printColor(color2);//GREEN 3 Green

        Color color3=BLUE;


        System.out.println(color3);


        Color color=Color.valueOf("BLACK");
        System.out.println(color);//BLACK
        //Returns array of Color
        for(Color c:Color.values()){

            System.out.println(c);
        }
    }

    public  static void printColor(Color color){
        System.out.println(color.name());
        System.out.println(color.ordinal());
        String text=null;
        switch(color){
            case BLACK: text="Black"; break;
            case WHITE: text="White"; break;
            case RED: text="Red"; break;
            case GREEN: text="Green"; break;
            case BLUE: text="Blue"; break;
            case YELLOW: text="Yellow"; break;
        }
        System.out.println(text);

    }
}
