package org.example;


    import java.io.IOException;
    import java.util.ArrayList;
    import java.util.List;

    public class DebugSample {
        public static void main(String[] args)throws IOException {
            List sampleNames = createNames();
            System.out.println("hello Git");
            printNames(sampleNames);
            addName(sampleNames, "Jane Doe");
            System.in.read();
            printNames(sampleNames);

        }

        private static List createNames() {
            ArrayList listNames = new ArrayList<String>();
            listNames.add("John Doe");
            listNames.add("Jane Doe");
            return listNames;
        }
        String sayYourName() {
            return getClass().getName();
        }
        int addTwoNumbers(int a, int b) {
            return a + b;
        }





        private static void printNames(List<String> names) {
            for (String name : names) {
                System.out.println(name);
            }
        }

        private static void addName(List<String> l, String name) {
            l.add(name);
        }

        private static void removeNames(List l, String name) {
            int position = l.indexOf(name);
            if (position == -1) {
// the name is not in the list
            } else {
                l.remove(position);
                printNames(l);
            }
        }


    }