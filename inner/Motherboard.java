public class Motherboard {
    private String model;

    private void printModel() {
        System.out.println("model=" + model);
    }

    public void initChipset() {
        Chipset chipset = new Chipset();
        chipset.changeOuterRealize();
        chipset.closedVar = 2;
    }

    class Chipset {
        private int closedVar;
        public void changeOuterRealize() {
            model = "B550 Extreme";
            printModel();
        }
    }

    public static void main(String[] args) {
        Motherboard mb = new Motherboard();
        mb.initChipset();
    }
}
