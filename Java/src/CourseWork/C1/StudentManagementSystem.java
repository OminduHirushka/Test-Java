package CourseWork.C1;

import java.util.Scanner;

public class StudentManagementSystem {
    static int MAX_STUDENTS = 100;
    static String[] stId = new String[MAX_STUDENTS];
    static String[] stName = new String[MAX_STUDENTS];
    static int[] programmingMarks = new int[MAX_STUDENTS];
    static int[] databaseMarks = new int[MAX_STUDENTS];
    static int studentCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            clearConsole();
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("|                  Welcome To GDSE Marks Management System                    |");
            System.out.println("-------------------------------------------------------------------------------");

            System.out.print("[1]  Add New Student                 \t\t\t");
            System.out.println("[2]  Add New Student with Marks");
            System.out.print("[3]  Add Marks                       \t\t\t");
            System.out.println("[4]  Update Student Details");
            System.out.print("[5]  Update Marks                    \t\t\t");
            System.out.println("[6]  Delete Student");
            System.out.print("[7]  Print Student Details           \t\t\t");
            System.out.println("[8]  Print Student Ranks");
            System.out.print("[9]  Best in Programming Fundamentals\t\t\t");
            System.out.println("[10] Best in Database Management System");
            System.out.println("[11] Exit\n");
            System.out.print("Enter an option to continue: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
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
                    printStudentRanks(scanner);
                    break;
                case 9:
                    bestInProgrammingFundamentals(scanner);
                    break;
                case 10:
                    bestInDatabaseManagementSystem(scanner);
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option. Please try again.");
            }
        }
    }

    static void addNewStudent(Scanner scanner) {
        while (true) {
            clearConsole();

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("|                              Add New Student                                |");
            System.out.println("-------------------------------------------------------------------------------");

            System.out.print("Enter Student ID   : ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);

            if (index != -1) {
                System.out.print("Student ID already exists. Do you want to try again? (yes/no): ");
                String option = scanner.nextLine();
                if (!option.equalsIgnoreCase(("yes"))) {
                    break;
                }

                addNewStudent(scanner);
                continue;
            }

            System.out.print("Enter Student Name : ");
            String name = scanner.nextLine();

            stId[studentCount] = id;
            stName[studentCount] = name;
            studentCount++;
            System.out.println("Student added successfully.");

            System.out.print("Do you want to add another Student? (yes/no): ");
            String option = scanner.nextLine();
            if (!option.equalsIgnoreCase(("yes"))) {
                break;
            }
        }
    }

    static void addNewStudentWithMarks(Scanner scanner) {
        while (true) {
            clearConsole();

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("|                         Add New Student With Marks                          |");
            System.out.println("-------------------------------------------------------------------------------");

            System.out.print("Enter Student ID   : ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);

            if (index != -1) {
                System.out.print("Student ID already exists. Do you want to try again? (yes/no): ");
                String option = scanner.nextLine();
                if (!option.equalsIgnoreCase(("yes"))) {
                    break;
                }
                continue;
            }

            System.out.print("Enter Student Name : ");
            String name = scanner.nextLine();
            System.out.print("Programming Fundamentals Marks    : ");
            int prMarks = scanner.nextInt();
            System.out.print("Database Management Systems Marks : ");
            int dbMarks = scanner.nextInt();
            scanner.nextLine();

            if ((prMarks >= 0 && prMarks <= 100) && (dbMarks >= 0 && dbMarks <= 100)) {
                stId[studentCount] = id;
                stName[studentCount] = name;
                programmingMarks[studentCount] = prMarks;
                databaseMarks[studentCount] = dbMarks;
                studentCount++;
                System.out.println("Student with marks added successfully.");
            } else {
                System.out.println("Invalid marks. Please enter marks within a valid range (0 – 100).");
            }

            System.out.print("Do you want to add another Student with marks? (yes/no): ");
            String option = scanner.nextLine();
            if (!option.equalsIgnoreCase(("yes"))) {
                break;
            }
        }
    }

    static void addMarks(Scanner scanner) {
        while (true) {
            clearConsole();

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("|                                 Add Marks                                   |");
            System.out.println("-------------------------------------------------------------------------------");

            System.out.print("Student ID   : ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);

            if (index == -1) {
                System.out.print("Student ID not found. Do you want to search again? (yes/no): ");
                String option = scanner.nextLine();
                if (!option.equalsIgnoreCase(("yes"))) {
                    break;
                }
                continue;
            }

            if (programmingMarks[index] != 0 || databaseMarks[index] != 0) {
                System.out.println("Marks already assigned for this Student.");
                System.out.println("If you want to update the marks, please use 'Update Marks' ([4]) option.");
                System.out.print("Do you want to add marks for existing Student? (yes/no): ");
                String option = scanner.nextLine();
                if (!option.equalsIgnoreCase("yes")) {
                    break;
                }
                continue;
            }

            System.out.print("Programming Fundamentals Marks    : ");
            int prMarks = scanner.nextInt();
            System.out.print("Database Management Systems Marks : ");
            int dbMarks = scanner.nextInt();
            scanner.nextLine();

            if ((prMarks >= 0 && prMarks <= 100) && (dbMarks >= 0 && dbMarks <= 100)) {
                programmingMarks[index] = prMarks;
                databaseMarks[index] = dbMarks;
                System.out.println("Marks added successfully.");
            } else {
                System.out.println("Invalid marks. Please enter marks within a valid range (0–100).");
            }

            System.out.print("Do you want to add marks for another Student? (yes/no): ");
            String option = scanner.nextLine();
            if (!option.equalsIgnoreCase(("yes"))) {
                break;
            }
        }
    }

    static void updateStudentDetails(Scanner scanner) {
        while (true) {
            clearConsole();

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("|                               Update Student                                |");
            System.out.println("-------------------------------------------------------------------------------");

            System.out.print("Student ID      : ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);

            if (index == -1) {
                System.out.print("Student ID not found. Do you want to search again? (yes/no): ");
                String option = scanner.nextLine();
                if (!option.equalsIgnoreCase(("yes"))) {
                    break;
                }

                updateStudentDetails(scanner);
                continue;
            }

            System.out.println("Student Name  : " + stName[index]);
            System.out.println();
            System.out.print("Update Student Name : ");
            String newName = scanner.nextLine();
            stName[index] = newName;
            System.out.println("Student details updated successfully.");

            System.out.print("Do you want to update another Student's details? (yes/no): ");
            String option = scanner.nextLine();
            if (!option.equalsIgnoreCase(("yes"))) {
                break;
            }
        }
    }

    static void updateMarks(Scanner scanner) {
        while (true) {
            clearConsole();

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("|                                Update Marks                                 |");
            System.out.println("-------------------------------------------------------------------------------");

            System.out.print("Student ID : ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);

            if (index == -1) {
                System.out.print("Student ID not found. Do you want to search again? (yes/no): ");
                String option = scanner.nextLine();
                if (!option.equalsIgnoreCase(("yes"))) {
                    break;
                }

                updateMarks(scanner);
                continue;
            }

            if (programmingMarks[index] == 0 && databaseMarks[index] == 0) {
                System.out.println("Marks not assigned yet");
                System.out.print("Do you want to search again? (yes/no): ");
                String option = scanner.nextLine();
                if (!option.equalsIgnoreCase(("yes"))) {
                    break;
                }
                continue;
            }

            System.out.println("Programming Fundamentals Marks         : " + programmingMarks[index]);
            System.out.println("Database Management Systems Marks      : " + databaseMarks[index]);

            System.out.println();
            System.out.print("Update Programming Fundamentals Marks    : ");
            int prMarks = scanner.nextInt();
            System.out.print("Update Database Management Systems Marks : ");
            int dbMarks = scanner.nextInt();

            if ((prMarks >= 0 && prMarks <= 100) && (dbMarks >= 0 && dbMarks <= 100)) {
                programmingMarks[index] = prMarks;
                databaseMarks[index] = dbMarks;
                System.out.println("Marks updated successfully.");
            } else {
                System.out.println("Invalid marks. Please enter marks within a valid range (0–100).");
                updateMarks(scanner);
            }

            System.out.print("Do you want to update another Student's marks? (yes/no): ");
            String option = scanner.nextLine();
            if (!option.equalsIgnoreCase(("yes"))) {
                break;
            }
        }
    }

    static void deleteStudent(Scanner scanner) {
        while (true) {
            clearConsole();

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("|                               Delete Student                                |");
            System.out.println("-------------------------------------------------------------------------------");

            System.out.print("Student ID : ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);

            if (index == -1) {
                System.out.print("Student ID not found. Do you want to search again? (yes/no): ");
                String option = scanner.nextLine();
                if (!option.equalsIgnoreCase(("yes"))) {
                    break;
                }

                deleteStudent(scanner);
                continue;
            }

            for (int i = index; i < studentCount - 1; i++) {
                stId[i] = stId[i + 1];
                stName[i] = stName[i + 1];
                programmingMarks[i] = programmingMarks[i + 1];
                databaseMarks[i] = databaseMarks[i + 1];
            }
            studentCount--;
            System.out.println("Student deleted successfully.");

            System.out.print("Do you want to delete another Student's details? (yes/no): ");
            String option = scanner.nextLine();
            if (!option.equalsIgnoreCase(("yes"))) {
                break;
            }
        }
    }

    static void printStudentDetails(Scanner scanner) {
        while (true) {
            clearConsole();

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("|                          Print Student Details                              |");
            System.out.println("-------------------------------------------------------------------------------");

            System.out.print("Student ID : ");
            String id = scanner.nextLine();

            int index = findStudentIndexById(id);

            if (index == -1) {
                System.out.print("Student ID not found.. Do you want to search again? (yes/no): ");
                String option = scanner.nextLine();
                if (!option.equalsIgnoreCase(("yes"))) {
                    break;
                }

                printStudentDetails(scanner);
                continue;
            }

            System.out.println("Student ID                             : " + stId[index]);
            System.out.println("Student Name                           : " + stName[index]);

            if (programmingMarks[index] == 0 && databaseMarks[index] == 0) {
                System.out.println("Marks not assigned yet");
            } else {
                int totalMarks = programmingMarks[index] + databaseMarks[index];
                double avgMarks = totalMarks / 2.0;
                int rank = calculateRank(index);

                System.out.println("Programming Fundamentals Marks     : " + programmingMarks[index]);
                System.out.println("Database Management Systems Marks  : " + databaseMarks[index]);
                System.out.println("Total Marks                        : " + totalMarks);
                System.out.println("Average Marks                      : " + avgMarks);
                System.out.println("Rank                               : " + rank + getRankSuffix(rank));
            }

            System.out.print("Do you want to print another Student's details? (yes/no): ");
            String option = scanner.nextLine();
            if (!option.equalsIgnoreCase(("yes"))) {
                break;
            }
        }
    }

    static void printStudentRanks(Scanner scanner) {
        while (true) {
            clearConsole();

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("|                           Print Student Ranks                               |");
            System.out.println("-------------------------------------------------------------------------------");

            int[] ranks = calculateAllRanks();

            System.out.println("Student Ranks:");
            System.out.println();
            System.out.println("===========================================================");

            for (int i = 0; i < studentCount; i++) {
                if (programmingMarks[i] != 0 || databaseMarks[i] != 0) {
                    int totalMarks = programmingMarks[i] + databaseMarks[i];
                    double avgMarks = totalMarks / 2.0;
                    System.out.println();
                    System.out.println("Rank          : " + ranks[i] + getRankSuffix(ranks[i]));
                    System.out.println("ID            : " + stId[i]);
                    System.out.println("Name          : " + stName[i]);
                    System.out.println("Total Marks   : " + totalMarks);
                    System.out.println("Average Marks : " + avgMarks);
                }
                System.out.println();
                System.out.println("===========================================================");
            }

            System.out.print("Do you want to exit? (yes/no): ");
            String option = scanner.nextLine();
            if (!option.equalsIgnoreCase(("no"))) {
                break;
            }
        }
    }

    static void bestInProgrammingFundamentals(Scanner scanner) {
        while (true) {
            clearConsole();

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("|                      Best in Programming Fundamentals                       |");
            System.out.println("-------------------------------------------------------------------------------");

            int bestIndex = -1;
            int highestMarks = -1;

            for (int i = 0; i < studentCount; i++) {
                if (programmingMarks[i] > highestMarks) {
                    highestMarks = programmingMarks[i];
                    bestIndex = i;
                }
            }

            if (bestIndex != -1) {
                System.out.println("ID    : " + stId[bestIndex]);
                System.out.println("Name  : " + stName[bestIndex]);
                System.out.println("Marks : " + programmingMarks[bestIndex]);
            } else {
                System.out.println("Empty list of marks for Programming Fundamentals.");
            }

            System.out.print("Do you want to exit? (yes/no): ");
            String option = scanner.nextLine();
            if (!option.equalsIgnoreCase(("no"))) {
                break;
            }
        }
    }

    static void bestInDatabaseManagementSystem(Scanner scanner) {
        while (true) {
            clearConsole();

            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("|                     Best in Database Management System                      |");
            System.out.println("-------------------------------------------------------------------------------");

            int bestIndex = -1;
            int highestMarks = -1;

            for (int i = 0; i < studentCount; i++) {
                if (databaseMarks[i] > highestMarks) {
                    highestMarks = databaseMarks[i];
                    bestIndex = i;
                }
            }

            if (bestIndex != -1) {
                System.out.println("ID    : " + stId[bestIndex]);
                System.out.println("Name  : " + stName[bestIndex]);
                System.out.println("Marks : " + databaseMarks[bestIndex]);
            } else {
                System.out.println("Empty list of marks for Database Management System.");
            }
            System.out.print("Do you want to print another exit? (yes/no): ");
            String option = scanner.nextLine();
            if (!option.equalsIgnoreCase(("no"))) {
                break;
            }
        }
    }

    static int findStudentIndexById(String id) {
        for (int i = 0; i < studentCount; i++) {
            if (stId[i].equals(id)) {
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
