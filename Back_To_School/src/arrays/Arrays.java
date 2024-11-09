package arrays;

public class Arrays {
    public static void main(String[] args) {
        // dataType[] variableName = new dataType[size];
        String[] studentName = new String[5];
        studentName[0] = "John";

        int studentAge[] = {20, 21, 23, 24, 25};

        System.out.println(studentName[0]);
        for(int age : studentAge) {
            System.out.println(age);
        }

        // update
        for (int i = 0; i < studentAge.length; i++) {
            // insert 22 after 21
            if (studentAge[i] == 21) {

            }
        }

    }
}
