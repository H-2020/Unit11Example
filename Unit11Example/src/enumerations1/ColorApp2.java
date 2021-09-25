package enumerations1;

public class ColorApp2 {
    public static void main(String[] args) {

        Color color1=Color.RED;
        Color color3= Color.GREEN;
        printColor(color1);
        printColor(color3);
    }

    public  static void printColor(Color color){
        System.out.println(color.name());
        System.out.println(color.ordinal());
        System.out.println(color.getRgb());
        System.out.println(color);
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
