package assignments.module4;

    final class FinalClass {
        void display() {
            System.out.println("This is a final class");
        }
    }

     class TestFinal {
        public static void main(String[] args) {
            FinalClass obj = new FinalClass();
            obj.display();
        }
    }

