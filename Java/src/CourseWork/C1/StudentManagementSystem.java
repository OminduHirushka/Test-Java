package CourseWork.C1;

import java.util.Scanner;

public class StudentManagementSystem {
    static int MAX_STUDENTS = 100;
    static String[] studentIds = new String[MAX_STUDENTS];
    static String[] studentNames = new String[MAX_STUDENTS];
    static int[] programmingMarks = new int[MAX_STUDENTS];
    static int[] databaseMarks = new int[MAX_STUDENTS];
    static int studentCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Main Menu:");
            System.out.println("1. Add New Student");
            System.out.println("2. Add New Student with Marks");
            System.out.println("3. Add Marks");
            System.out.println("4. Update Student Details");
            System.out.println("5. Update Marks");
            System.out.println("6. Delete Student");
            System.out.println("7. Print Student Details");
            System.out.println("8. Print Student Ranks");
            System.out.println("9. Best in Programming Fundamentals");
            System.out.println("10. Best in Database Management System");
            System.out.println("11. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewStudent(scanner);
                    break;
                case 2:
                    addNewStudentWithMarks(scanner);
                    break;
                case 3:
                    addMarks(scanner);
                    break;
                case 4:
                    updateStudentDetails(scanner);
                    break;
                case 5:
                    updateMarks(scanner);
                    break;
                case 6:
                    deleteStudent(scanner);
                    break;
                case 7:
                    printStudentDetails(scanner);
                    break;
                case 8:
                    printStudentRanks();
                    break;
                case 9:
                    bestInProgrammingFundamentals();
                    break;
                case 10:
                    bestInDatabaseManagementSystem();
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    static void addNewStudent(Scanner scanner) {
        while (true) {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);
            if (index != -1) {
                System.out.println("Student ID already exists. Try again.");
                addNewStudent(scanner);
                continue;
            }

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            studentIds[studentCount] = id;
            studentNames[studentCount] = name;
            studentCount++;
            System.out.println("New Student added successfully.");

            System.out.print("Do you want to add another Student? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("No")) {
                break;
            }
        }
    }

    static void addNewStudentWithMarks(Scanner scanner) {
        while (true) {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);
            if (index != -1) {
                System.out.println("Student ID already exists. Try again.");
                addNewStudent(scanner);
                continue;
            }

            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Programming Fundamentals Marks: ");
            int prMarks = scanner.nextInt();
            System.out.print("Enter Database Management Systems Marks: ");
            int dbMarks = scanner.nextInt();

            studentIds[studentCount] = id;
            studentNames[studentCount] = name;
            programmingMarks[studentCount] = prMarks;
            databaseMarks[studentCount] = dbMarks;
            studentCount++;
            System.out.println("New Student and Marks added successfully.");

            System.out.print("Do you want to add another Student with marks? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("No")) {
                break;
            }
        }
    }

    static void addMarks(Scanner scanner) {
        while (true) {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);
            if (index == -1) {
                System.out.println("Student ID not found. Try again.");
                addMarks(scanner);
                return;
            }

            if (programmingMarks[index] != 0 || databaseMarks[index] != 0) {
                System.out.println("Marks already assigned for this student.");
                return;
            }
            addMarks(scanner, id);

            System.out.print("Do you want to add marks for another Student? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("No")) {
                break;
            }
        }
    }

    static void addMarks(Scanner scanner, String id) {
        System.out.print("Enter Programming Fundamentals Marks: ");
        int prMarks = scanner.nextInt();

        System.out.print("Enter Database Management Systems Marks: ");
        int dbMarks = scanner.nextInt();

        int index = findStudentIndexById(id);
        if ((prMarks >= 0 && prMarks <= 100) && (dbMarks >= 0 && dbMarks <= 100)) {
            programmingMarks[index] = prMarks;
            databaseMarks[index] = dbMarks;
            System.out.println("Marks added successfully.");
        } else {
            System.out.println("Invalid input. Try marks within the range of 0-100.");
            addMarks(scanner, id);
        }
    }

    static void updateStudentDetails(Scanner scanner) {
        while (true) {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);
            if (index == -1) {
                System.out.println("Student ID not found. Try again.");
                updateStudentDetails(scanner);
                return;
            }

            System.out.println("Current Student Name: " + studentNames[index]);
            System.out.print("Enter New Student Name: ");
            String newName = scanner.nextLine();
            studentNames[index] = newName;
            System.out.println("Student details updated successfully.");

            System.out.print("Do you want to update another student's details? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("No")) {
                break;
            }
        }
    }

    static void updateMarks(Scanner scanner) {
        while (true) {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);
            if (index == -1) {
                System.out.println("Student ID not found. Try again.");
                updateMarks(scanner);
                return;
            }
            if (programmingMarks[index] == 0 && databaseMarks[index] == 0) {
                System.out.println("Marks not assigned yet for this student.");
                return;
            }

            System.out.println("Current Programming Fundamentals Marks: " + programmingMarks[index]);
            System.out.println("Current Database Management Systems Marks: " + databaseMarks[index]);

            System.out.print("Enter New Programming Fundamentals Marks: ");
            int pMarks = scanner.nextInt();
            System.out.print("Enter New Database Management Systems Marks: ");
            int dMarks = scanner.nextInt();

            if (validateMarks(pMarks) && validateMarks(dMarks)) {
                programmingMarks[index] = pMarks;
                databaseMarks[index] = dMarks;
                System.out.println("Marks updated successfully.");
            } else {
                System.out.println("Invalid marks. Try again.");
                updateMarks(scanner);
            }

            System.out.print("Do you want to update another student's marks? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("No")) {
                break;
            }
        }
    }

    static void deleteStudent(Scanner scanner) {
        while (true) {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);
            if (index == -1) {
                System.out.println("Student ID not found. Try again.");
                deleteStudent(scanner);
                return;
            }
            for (int i = index; i < studentCount - 1; i++) {
                studentIds[i] = studentIds[i + 1];
                studentNames[i] = studentNames[i + 1];
                programmingMarks[i] = programmingMarks[i + 1];
                databaseMarks[i] = databaseMarks[i + 1];
            }
            studentCount--;
            System.out.println("Student deleted successfully.");

            System.out.print("Do you want to delete another student's details? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("No")) {
                break;
            }
        }
    }

    static void printStudentDetails(Scanner scanner) {
        while (true) {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);
            if (index == -1) {
                System.out.println("Student ID not found. Try again.");
                printStudentDetails(scanner);
                return;
            }

            System.out.println("Student ID: " + studentIds[index]);
            System.out.println("Student Name: " + studentNames[index]);

            if (programmingMarks[index] == 0 && databaseMarks[index] == 0) {
                System.out.println("Marks not assigned yet.");
            } else {
                int totalMarks = programmingMarks[index] + databaseMarks[index];
                double avgMarks = totalMarks / 2.0;
                int rank = calculateRank(index);

                System.out.println("Programming Fundamentals Marks: " + programmingMarks[index]);
                System.out.println("Database Management Systems Marks: " + databaseMarks[index]);
                System.out.println("Total Marks: " + totalMarks);
                System.out.println("Average Marks: " + avgMarks);
                System.out.println("Rank: " + rank + getRankSuffix(rank));
            }

            System.out.print("Do you want to print another student's details? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("No")) {
                break;
            }
        }
    }

    static void printStudentRanks() {
        int[] ranks = calculateAllRanks();
        System.out.println("Student Ranks:");
        for (int i = 0; i < studentCount; i++) {
            if (programmingMarks[i] != 0 || databaseMarks[i] != 0) {
                int totalMarks = programmingMarks[i] + databaseMarks[i];
                double avgMarks = totalMarks / 2.0;
                System.out.println("Rank: " + ranks[i] + getRankSuffix(ranks[i]) +
                        ", ID: " + studentIds[i] +
                        ", Name: " + studentNames[i] +
                        ", Total Marks: " + totalMarks +
                        ", Average Marks: " + avgMarks);
            }
        }
    }

    static void bestInProgrammingFundamentals() {
        int bestIndex = -1;
        int highestMarks = -1;
        for (int i = 0; i < studentCount; i++) {
            if (programmingMarks[i] > highestMarks) {
                highestMarks = programmingMarks[i];
                bestIndex = i;
            }
        }
        if (bestIndex != -1) {
            System.out.println("Best in Programming Fundamentals:");
            System.out.println("ID: " + studentIds[bestIndex]);
            System.out.println("Name: " + studentNames[bestIndex]);
            System.out.println("Marks: " + programmingMarks[bestIndex]);
        } else {
            System.out.println("No student marks found for Programming Fundamentals.");
        }
    }

    static void bestInDatabaseManagementSystem() {
        int bestIndex = -1;
        int highestMarks = -1;
        for (int i = 0; i < studentCount; i++) {
            if (databaseMarks[i] > highestMarks) {
                highestMarks = databaseMarks[i];
                bestIndex = i;
            }
        }
        if (bestIndex != -1) {
            System.out.println("Best in Database Management System:");
            System.out.println("ID: " + studentIds[bestIndex]);
            System.out.println("Name: " + studentNames[bestIndex]);
            System.out.println("Marks: " + databaseMarks[bestIndex]);
        } else {
            System.out.println("No student marks found for Database Management System.");
        }
    }

    static int findStudentIndexById(String id) {
        for (int i = 0; i < studentCount; i++) {
            if (studentIds[i].equals(id)) {
                return i;
            }
        }
        return -1;
    }

    static int calculateRank(int index) {
        int[] totalMarks = new int[studentCount];
        for (int i = 0; i < studentCount; i++) {
            totalMarks[i] = programmingMarks[i] + databaseMarks[i];
        }
        int rank = 1;
        for (int i = 0; i < studentCount; i++) {
            if (totalMarks[i] > totalMarks[index]) {
                rank++;
            }
        }
        return rank;
    }

    static int[] calculateAllRanks() {
        int[] ranks = new int[studentCount];
        int[] totalMarks = new int[studentCount];
        for (int i = 0; i < studentCount; i++) {
            totalMarks[i] = programmingMarks[i] + databaseMarks[i];
        }
        for (int i = 0; i < studentCount; i++) {
            int rank = 1;
            for (int j = 0; j < studentCount; j++) {
                if (totalMarks[j] > totalMarks[i]) {
                    rank++;
                }
            }
            ranks[i] = rank;
        }
        return ranks;
    }

    static String getRankSuffix(int rank) {
        if (rank == 1) return " (First)";
        if (rank == 2) return " (Second)";
        if (rank == 3) return " (Third)";
        return " (Last)";
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
