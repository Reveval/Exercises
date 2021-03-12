interface Contents {}
interface Bruh { int getI(); }

public class Parce {
    public Contents contents() {
        return new Contents() {
            private int i = 11;

            public int getI() {
                return i;
            }
        };
    }

    Bruh bruh = new Bruh() {
        private int i = 11;

        @Override
        public int getI() {
            return i;
        }
    };

    int method() {
        return bruh.getI();
    }

    public static void main(String[] args) {
        Parce p = new Parce();
        Contents c = p.contents();

        System.out.println(p.method());
    }
}
