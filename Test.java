
            import java.util.*;
            import java.util.Scanner;
            
            public class Test {
                public static void main(String[] args) {
                    
                    ArrayList<Member> members = new ArrayList<>();
                    members.add(new PlatinumMember("P1901", "Peter Lai", 220, 12));
                    members.add(new SilverMember("S1625", "Jimmy Lim", 3000, 50));
                    members.add(new PlatinumMember("P1815", "Mary Kuok", 220, 12));
                    members.add(new SilverMember("S1318", "John Lau", 99, 250));
                    members.add(new SilverMember("S1709", "Jay Chow", 3000, 250));
            
                    Scanner scanner = new Scanner(System.in);
                    int option = 0;
            
                    
                    do {
                        System.out.println("\n----- UTAR Gym Centre Menu -----");
                        System.out.println("1. List");
                        System.out.println("2. Highest");
                        System.out.println("3. Lowest");
                        System.out.println("4. Average");
                        System.out.println("5. Search");
                        System.out.println("6. Exit");
                        System.out.println("\nPlease Enter your choice: ");
                        option = scanner.nextInt();
            
                        switch (option) {
                            case 1:
                              
                                System.out.println("\n----- Member List -----");
                                System.out.printf("%-15s %-15s %-15s %-15s\n","Type", "Member ID", "Name", "Fee per Visit");
                                for (Member member : members) {
                                    System.out.println(member);
                                }
                                break;

                            case 2:
                           
                                Member highest = members.get(0);
                                for (Member member : members) {
                                    if (member.feePerVisit() > highest.feePerVisit()) {
                                        highest = member;
                                    }
                                }
                                System.out.println("\n----- Member with Highest Fee per Visit -----");
                                System.out.println(highest);
                                break;

                            case 3:
                              
                                Member lowest = members.get(0);
                                for (Member member : members) {
                                    if (member.feePerVisit() < lowest.feePerVisit()) {
                                        lowest = member;
                                    }
                                }
                                System.out.println("\n----- Member with Lowest Fee per Visit -----");
                                System.out.println(lowest);
                                break;

                            case 4:
                              
                                double totalFeePerVisit = 0;
                                for (Member member : members) {
                                    totalFeePerVisit += member.feePerVisit();
                                }
                                double avgFeePerVisit = totalFeePerVisit / members.size();
                                System.out.printf("\n----- Average Fee per Visit to the gym: RM%.2f -----\n", avgFeePerVisit);
                                break;

                            case 5:
                              
                                System.out.print("\nPlease enter your Member ID: ");
                                String memberId = scanner.next();
                                for (Member member : members) {
                                    if (member.getMemberId().equals(memberId)) {
                                        System.out.println("\n----- Member Found -----");
                                        System.out.println("Name: " + member.getName());
                                        break;
                                    }
                                }
                                break;

                            case 6:
                             
                                System.out.println("\nThank you and have a nice day!");
                                break;
                            default:
                                System.out.println("\nInvalid input. Please key in again(only integer 1 to 6 is allow).");
                        }
                    } while (option != 6);
            
                    scanner.close();
                }
            }
            
          