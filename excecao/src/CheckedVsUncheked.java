public class CheckedVsUncheked {

    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End :)");
    }

    // unchecked
    public static void geraErro1() {
        throw new RuntimeException("Ocorreu erro #01");
    }

    // checked
    public static void geraErro2() throws Exception {
        throw new Exception("Ocorreu erro #02");
    }
}
