import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        if (StringUtils.isBlank("NotBlank")) {
            System.out.println("Blank");
        } else {
            System.out.println("NotBlank");
        }
        System.out.println("Hello world!");
    }
}